package org.telegram.ui.Components.conference.message;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.spoilers.SpoilersTextView;

public class GroupCallMessageCell extends ViewGroup implements NotificationCenter.NotificationCenterDelegate {
    private static final Rect tmpRect = new Rect();
    private AnimatedEmojiDrawable animatedReactionDrawable;
    private final ImageReceiver animatedReactionReceiver;
    private final ImageReceiver avatarReceiver;
    private final Paint bgPaint;
    private View blurRoot;
    private Layout layout;
    private boolean layoutInvalidated;
    private ReactionsLayoutInBubble.VisibleReaction messageReaction;
    private final SpoilersTextView messageTextView;
    private RenderNode renderNode;
    private float renderNodeScale;

    public GroupCallMessageCell(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.bgPaint = paint;
        SpoilersTextView spoilersTextView = new SpoilersTextView(context);
        this.messageTextView = spoilersTextView;
        spoilersTextView.setDisablePaddingsOffset(true);
        spoilersTextView.setTextSize(14.0f);
        spoilersTextView.setTextColor(-1);
        spoilersTextView.setLinkTextColor(-11683585);
        spoilersTextView.setHintTextColor(-1);
        addView(spoilersTextView);
        paint.setColor(-13946053);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.avatarReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(11.0f));
        this.animatedReactionReceiver = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public void setRenderNode(View view, RenderNode renderNode, float f) {
        this.blurRoot = view;
        this.renderNode = renderNode;
        this.renderNodeScale = f;
    }

    public void set(GroupCallMessage groupCallMessage) {
        TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(groupCallMessage.fromId));
        String firstName = UserObject.getFirstName(user);
        this.avatarReceiver.setForUserOrChat(user, new AvatarDrawable(user));
        this.animatedReactionReceiver.setImage(null, null, null, null, null, 0);
        if (this.animatedReactionDrawable != null && isAttachedToWindow()) {
            this.animatedReactionDrawable.removeView(this);
        }
        this.animatedReactionDrawable = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(firstName);
        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        ReactionsLayoutInBubble.VisibleReaction visibleReaction = groupCallMessage.visibleReaction;
        if (visibleReaction == null) {
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.append(MessageObject.formatTextWithEntities(groupCallMessage.message, false, this.messageTextView.getPaint()));
        } else if (visibleReaction.emojicon != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(groupCallMessage.currentAccount).getReactionsMap().get(groupCallMessage.visibleReaction.emojicon);
            if (tL_availableReaction != null) {
                this.animatedReactionReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (visibleReaction.documentId != 0) {
            AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.documentId);
            this.animatedReactionDrawable = animatedEmojiDrawable;
            animatedEmojiDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.animatedReactionDrawable.addView(this);
            }
        }
        this.messageReaction = groupCallMessage.visibleReaction;
        this.layoutInvalidated = true;
        this.messageTextView.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        Layout layout = this.layout;
        if (layout == null || this.layoutInvalidated || layout.viewWidth != size) {
            Layout build = Layout.build(size, this.messageTextView, this.messageReaction);
            this.layout = build;
            this.avatarReceiver.setImageCoords(build.avatar);
            this.animatedReactionReceiver.setImageCoords(this.layout.reaction);
            if (this.animatedReactionDrawable != null) {
                RectF rectF = this.layout.reaction;
                Rect rect = tmpRect;
                rectF.round(rect);
                this.animatedReactionDrawable.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.layout.viewHeight);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Layout layout = this.layout;
        if (layout == null) {
            return;
        }
        int round = Math.round(layout.text.x);
        int round2 = Math.round(this.layout.text.y);
        SpoilersTextView spoilersTextView = this.messageTextView;
        spoilersTextView.layout(round, round2, spoilersTextView.getMeasuredWidth() + round, this.messageTextView.getMeasuredHeight() + round2);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.avatarReceiver.onAttachedToWindow();
        this.animatedReactionReceiver.onAttachedToWindow();
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedReactionDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.addView(this);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.avatarReceiver.onDetachedFromWindow();
        this.animatedReactionReceiver.onDetachedFromWindow();
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedReactionDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.removeView(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public boolean isInsideBubble(float f, float f2) {
        Layout layout = this.layout;
        if (layout == null) {
            return false;
        }
        return layout.bubble.contains(f, f2);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        Layout layout = this.layout;
        if (layout == null) {
            return;
        }
        canvas.drawPath(layout.bubblePath, this.bgPaint);
        if (Build.VERSION.SDK_INT >= 29 && this.renderNode != null && canvas.isHardwareAccelerated()) {
            float f = 0.0f;
            View view = this;
            while (view != this.blurRoot) {
                f += view.getY();
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return;
                } else {
                    view = (View) parent;
                }
            }
            canvas.save();
            canvas.clipPath(this.layout.bubblePath);
            canvas.translate(0.0f, -f);
            float f2 = this.renderNodeScale;
            canvas.scale(f2, f2);
            canvas.drawRenderNode(this.renderNode);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        this.avatarReceiver.draw(canvas);
        this.animatedReactionReceiver.draw(canvas);
        AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedReactionDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.draw(canvas);
        }
    }

    public float getReactionCenterX() {
        Layout layout = this.layout;
        if (layout != null) {
            return layout.reaction.centerX();
        }
        return 0.0f;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    public static class Layout {
        public int viewHeight;
        public int viewWidth;
        public final RectF bubble = new RectF();
        public final Path bubblePath = new Path();
        public final RectF avatar = new RectF();
        public final RectF reaction = new RectF();
        public final PointF text = new PointF();

        private Layout() {
        }

        public static Layout build(int i, SpoilersTextView spoilersTextView, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            int ceil;
            int dp;
            spoilersTextView.measure(View.MeasureSpec.makeMeasureSpec((i - AndroidUtilities.dp(44.0f)) - AndroidUtilities.dp(44.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            float measuredWidth = spoilersTextView.getMeasuredWidth();
            if (visibleReaction == null) {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(44.0f);
            } else {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(70.0f);
            }
            int i2 = ceil + dp;
            int max = Math.max(AndroidUtilities.dp(28.0f), spoilersTextView.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
            Layout layout = new Layout();
            layout.viewWidth = i;
            layout.viewHeight = max;
            layout.bubble.set(0.0f, 0.0f, i2, max);
            layout.bubble.offset((i - i2) / 2.0f, 0.0f);
            layout.bubblePath.addRoundRect(layout.bubble, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
            layout.avatar.set(0.0f, 0.0f, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            RectF rectF = layout.avatar;
            RectF rectF2 = layout.bubble;
            rectF.offset(rectF2.left, rectF2.top);
            layout.avatar.offset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
            layout.reaction.set(0.0f, 0.0f, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f));
            layout.reaction.offset(layout.bubble.right - AndroidUtilities.dp(33.0f), 0.0f);
            layout.reaction.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            layout.text.set(0.0f, 0.0f);
            PointF pointF = layout.text;
            RectF rectF3 = layout.bubble;
            pointF.offset(rectF3.left, rectF3.top);
            layout.text.offset(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(19.0f) - spoilersTextView.getLayout().getLineBaseline(0));
            return layout;
        }
    }

    public static class VH extends RecyclerView.ViewHolder {
        public final GroupCallMessageCell cell;

        public VH(GroupCallMessageCell groupCallMessageCell) {
            super(groupCallMessageCell);
            this.cell = groupCallMessageCell;
        }
    }
}
