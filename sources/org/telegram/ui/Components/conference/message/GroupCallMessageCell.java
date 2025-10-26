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
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.android.util.ClickHelper;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Components.voip.CellFlickerDrawable;

public class GroupCallMessageCell extends ViewGroup implements ClickHelper.Delegate, NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    private static final Rect tmpRect = new Rect();
    private AnimatedEmojiDrawable animatedReactionDrawable;
    private final ImageReceiver animatedReactionReceiver;
    private final ImageReceiver avatarReceiver;
    private final Paint bgPaint;
    private View blurRoot;
    private final ClickHelper clickHelper;
    private Delegate delegate;
    private final Paint errPaint;
    private final CellFlickerDrawable flickerDrawable;
    private GroupCallMessage groupCallMessage;
    private final BoolAnimator isSendDelayedAnimator;
    private final BoolAnimator isSendErrorAnimator;
    private Layout layout;
    private boolean layoutInvalidated;
    private ReactionsLayoutInBubble.VisibleReaction messageReaction;
    private final SpoilersTextView messageTextView;
    private final Runnable onMessageStateUpdateListener;
    private RenderNode renderNode;
    private float renderNodeScale;
    private final ClickableSpan senderNameSpan;
    private final RectF tmpRectF;

    public interface Delegate {
        void didClickAvatar(GroupCallMessageCell groupCallMessageCell, GroupCallMessage groupCallMessage, float f, float f2);

        void didClickSenderName(GroupCallMessageCell groupCallMessageCell, GroupCallMessage groupCallMessage);
    }

    @Override
    public boolean forceEnableVibration() {
        return ClickHelper.Delegate.CC.$default$forceEnableVibration(this);
    }

    @Override
    public long getLongPressDuration() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.conference.message.GroupCallMessageCell.getLongPressDuration():long");
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f, float f2) {
        return ClickHelper.Delegate.CC.$default$ignoreHapticFeedbackSettings(this, f, f2);
    }

    @Override
    public boolean needLongPress(float f, float f2) {
        return ClickHelper.Delegate.CC.$default$needLongPress(this, f, f2);
    }

    @Override
    public void onClickTouchDown(View view, float f, float f2) {
        ClickHelper.Delegate.CC.$default$onClickTouchDown(this, view, f, f2);
    }

    @Override
    public void onClickTouchMove(View view, float f, float f2) {
        ClickHelper.Delegate.CC.$default$onClickTouchMove(this, view, f, f2);
    }

    @Override
    public void onClickTouchUp(View view, float f, float f2) {
        ClickHelper.Delegate.CC.$default$onClickTouchUp(this, view, f, f2);
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    @Override
    public void onLongPressCancelled(View view, float f, float f2) {
        ClickHelper.Delegate.CC.$default$onLongPressCancelled(this, view, f, f2);
    }

    @Override
    public void onLongPressFinish(View view, float f, float f2) {
        ClickHelper.Delegate.CC.$default$onLongPressFinish(this, view, f, f2);
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        ClickHelper.Delegate.CC.$default$onLongPressMove(this, view, motionEvent, f, f2, f3, f4);
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f, float f2) {
        return ClickHelper.Delegate.CC.$default$onLongPressRequestedAt(this, view, f, f2);
    }

    public GroupCallMessageCell(Context context) {
        super(context);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.isSendDelayedAnimator = new BoolAnimator(0, this, cubicBezierInterpolator, 320L);
        this.isSendErrorAnimator = new BoolAnimator(1, this, cubicBezierInterpolator, 320L);
        this.clickHelper = new ClickHelper(this);
        Paint paint = new Paint(1);
        this.bgPaint = paint;
        Paint paint2 = new Paint(1);
        this.errPaint = paint2;
        CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable();
        this.flickerDrawable = cellFlickerDrawable;
        this.onMessageStateUpdateListener = new Runnable() {
            @Override
            public final void run() {
                GroupCallMessageCell.this.lambda$new$0();
            }
        };
        this.senderNameSpan = new ClickableSpan() {
            @Override
            public void updateDrawState(TextPaint textPaint) {
            }

            @Override
            public void onClick(View view) {
                if (GroupCallMessageCell.this.delegate == null || GroupCallMessageCell.this.groupCallMessage == null) {
                    return;
                }
                Delegate delegate = GroupCallMessageCell.this.delegate;
                GroupCallMessageCell groupCallMessageCell = GroupCallMessageCell.this;
                delegate.didClickSenderName(groupCallMessageCell, groupCallMessageCell.groupCallMessage);
            }
        };
        this.tmpRectF = new RectF();
        SpoilersTextView spoilersTextView = new SpoilersTextView(context);
        this.messageTextView = spoilersTextView;
        spoilersTextView.setDisablePaddingsOffset(true);
        spoilersTextView.setTextSize(14.0f);
        spoilersTextView.setTextColor(-1);
        spoilersTextView.setLinkTextColor(-11683585);
        spoilersTextView.setHintTextColor(-1);
        addView(spoilersTextView);
        paint.setColor(-13946053);
        paint2.setColor(-65536);
        paint2.setAlpha(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.avatarReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(11.0f));
        cellFlickerDrawable.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.animatedReactionReceiver = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public void lambda$new$0() {
        onMessageStateUpdate(true);
    }

    private void onMessageStateUpdate(boolean z) {
        GroupCallMessage groupCallMessage = this.groupCallMessage;
        if (groupCallMessage != null) {
            this.isSendDelayedAnimator.setValue(groupCallMessage.isSendDelayed(), z);
            this.isSendErrorAnimator.setValue(this.groupCallMessage.isSendError(), z);
        }
    }

    public void setSingleLine() {
        this.messageTextView.setMaxLines(1);
        this.messageTextView.setSingleLine(true);
        this.messageTextView.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override
    public void setBackgroundColor(int i) {
        this.bgPaint.setColor(i);
    }

    public void setRenderNode(View view, RenderNode renderNode, float f) {
        this.blurRoot = view;
        this.renderNode = renderNode;
        this.renderNodeScale = f;
    }

    public void set(GroupCallMessage groupCallMessage) {
        SpannableStringBuilder spannableStringBuilder;
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        if (isAttachedToWindow() && (groupCallMessage3 = this.groupCallMessage) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(this.onMessageStateUpdateListener);
        }
        this.groupCallMessage = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.groupCallMessage) != null) {
            groupCallMessage2.subscribeToStateUpdates(this.onMessageStateUpdateListener);
        }
        onMessageStateUpdate(false);
        TLObject userOrChat = MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(groupCallMessage.fromId);
        String name = DialogObject.getName(userOrChat);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(groupCallMessage.currentAccount, userOrChat);
        this.avatarReceiver.setForUserOrChat(userOrChat, avatarDrawable);
        this.animatedReactionReceiver.setImage(null, null, null, null, null, 0);
        if (this.animatedReactionDrawable != null && isAttachedToWindow()) {
            this.animatedReactionDrawable.removeView(this);
        }
        this.animatedReactionDrawable = null;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(name);
        spannableStringBuilder2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder2.setSpan(this.senderNameSpan, 0, spannableStringBuilder2.length(), 33);
        ReactionsLayoutInBubble.VisibleReaction visibleReaction = groupCallMessage.visibleReaction;
        if (visibleReaction == null) {
            spannableStringBuilder = concat(spannableStringBuilder2, MessageObject.formatTextWithEntities(groupCallMessage.message, false, true, this.messageTextView.getPaint()));
        } else if (visibleReaction.emojicon != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(groupCallMessage.currentAccount).getReactionsMap().get(groupCallMessage.visibleReaction.emojicon);
            spannableStringBuilder = spannableStringBuilder2;
            if (tL_availableReaction != null) {
                this.animatedReactionReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
                spannableStringBuilder = spannableStringBuilder2;
            }
        } else {
            spannableStringBuilder = spannableStringBuilder2;
            if (visibleReaction.documentId != 0) {
                AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.documentId);
                this.animatedReactionDrawable = animatedEmojiDrawable;
                animatedEmojiDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                spannableStringBuilder = spannableStringBuilder2;
                if (isAttachedToWindow()) {
                    this.animatedReactionDrawable.addView(this);
                    spannableStringBuilder = spannableStringBuilder2;
                }
            }
        }
        this.messageReaction = groupCallMessage.visibleReaction;
        this.layoutInvalidated = true;
        this.messageTextView.setText(spannableStringBuilder);
        requestLayout();
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public GroupCallMessage getMessage() {
        return this.groupCallMessage;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        Layout layout = this.layout;
        if (layout == null || this.layoutInvalidated || layout.viewWidth != size) {
            Layout build = Layout.build(size, getPaddingLeft(), getPaddingRight(), this.messageTextView, this.messageReaction);
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
        this.flickerDrawable.setParentWidth(Math.round(this.layout.bubble.width() + AndroidUtilities.dp(48.0f)));
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
        GroupCallMessage groupCallMessage = this.groupCallMessage;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.onMessageStateUpdateListener);
        }
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
        GroupCallMessage groupCallMessage = this.groupCallMessage;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.onMessageStateUpdateListener);
        }
    }

    public boolean isInsideBubble(float f, float f2) {
        Layout layout = this.layout;
        if (layout == null) {
            return false;
        }
        return layout.bubble.contains(f, f2);
    }

    @Override
    public boolean needClickAt(View view, float f, float f2) {
        return getClickTarget(f, f2) == 1;
    }

    @Override
    public void onClickAt(View view, float f, float f2) {
        Delegate delegate;
        GroupCallMessage groupCallMessage;
        if (getClickTarget(f, f2) != 1 || (delegate = this.delegate) == null || (groupCallMessage = this.groupCallMessage) == null) {
            return;
        }
        delegate.didClickAvatar(this, groupCallMessage, f, f2);
    }

    private int getClickTarget(float f, float f2) {
        Layout layout = this.layout;
        if (layout == null) {
            return -1;
        }
        this.tmpRectF.set(layout.avatar);
        this.tmpRectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
        if (this.tmpRectF.contains(f, f2)) {
            return 1;
        }
        return this.layout.bubble.contains(f, f2) ? 0 : -1;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.clickHelper.onTouchEvent(this, motionEvent);
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
        if (this.errPaint.getAlpha() > 0) {
            canvas.drawPath(this.layout.bubblePath, this.errPaint);
        }
        if (this.isSendDelayedAnimator.getFloatValue() > 0.0f) {
            this.tmpRectF.set(this.layout.bubble);
            this.tmpRectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            this.flickerDrawable.draw(canvas, this.tmpRectF, AndroidUtilities.dp(14.0f), null);
            invalidate();
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

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        this.errPaint.setAlpha(Math.round(this.isSendErrorAnimator.getFloatValue() * 100.0f));
        this.flickerDrawable.setAlpha(Math.round(this.isSendDelayedAnimator.getFloatValue() * 220.0f));
        invalidate();
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

        public static Layout build(int i, int i2, int i3, SpoilersTextView spoilersTextView, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            int dp;
            spoilersTextView.measure(View.MeasureSpec.makeMeasureSpec(((i - i2) - i3) - AndroidUtilities.dp(44.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            float measuredWidth = spoilersTextView.getMeasuredWidth();
            if (visibleReaction == null) {
                dp = ((int) Math.ceil(measuredWidth)) + AndroidUtilities.dp(44.0f);
            } else {
                dp = AndroidUtilities.dp(70.0f) + ((int) Math.ceil(measuredWidth));
            }
            int max = Math.max(AndroidUtilities.dp(28.0f), spoilersTextView.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
            Layout layout = new Layout();
            layout.viewWidth = i;
            layout.viewHeight = max;
            layout.bubble.set(0.0f, 0.0f, dp, max);
            layout.bubble.offset((i - dp) / 2.0f, 0.0f);
            layout.bubblePath.addRoundRect(layout.bubble, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
            boolean z = spoilersTextView.getLayout().getParagraphDirection(0) == -1;
            layout.avatar.set(0.0f, 0.0f, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            if (z) {
                RectF rectF = layout.avatar;
                RectF rectF2 = layout.bubble;
                rectF.offset(rectF2.right, rectF2.top);
                layout.avatar.offset((-AndroidUtilities.dp(4.0f)) - layout.avatar.width(), AndroidUtilities.dp(3.0f));
            } else {
                RectF rectF3 = layout.avatar;
                RectF rectF4 = layout.bubble;
                rectF3.offset(rectF4.left, rectF4.top);
                layout.avatar.offset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
            }
            layout.reaction.set(0.0f, 0.0f, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f));
            if (z) {
                layout.reaction.offset(layout.bubble.left + AndroidUtilities.dp(5.0f), 0.0f);
            } else {
                layout.reaction.offset(layout.bubble.right - AndroidUtilities.dp(33.0f), 0.0f);
            }
            layout.reaction.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            layout.text.set(0.0f, (layout.bubble.top + AndroidUtilities.dp(19.0f)) - spoilersTextView.getLayout().getLineBaseline(0));
            if (z) {
                layout.text.offset((layout.bubble.right - AndroidUtilities.dp(32.0f)) - measuredWidth, 0.0f);
            } else {
                layout.text.offset(layout.bubble.left + AndroidUtilities.dp(32.0f), 0.0f);
            }
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

    public static CharSequence concat(CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean isRtlByFirstStrong = isRtlByFirstStrong(charSequence);
        boolean isRtlByFirstStrong2 = isRtlByFirstStrong(charSequence2);
        if (isRtlByFirstStrong != isRtlByFirstStrong2) {
            spannableStringBuilder.append(isRtlByFirstStrong2 ? (char) 8295 : (char) 8294);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8297);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append(charSequence2);
        return spannableStringBuilder;
    }

    private static boolean isRtlByFirstStrong(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(charSequence, i);
            i += Character.charCount(codePointAt);
            byte directionality = Character.getDirectionality(codePointAt);
            if (directionality == 0) {
                break;
            }
            if (directionality == 1 || directionality == 2) {
                return true;
            }
        }
        return false;
    }
}
