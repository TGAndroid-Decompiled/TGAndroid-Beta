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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.components.Component;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.android.util.ClickHelper;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.Tooltip$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.GroupCallActivity;

public final class GroupCallMessageCell extends ViewGroup implements ClickHelper.Delegate, NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    public static final Rect tmpRect = new Rect();
    public AnimatedEmojiDrawable animatedReactionDrawable;
    public final ImageReceiver animatedReactionReceiver;
    public final ImageReceiver avatarReceiver;
    public final Paint bgPaint;
    public View blurRoot;
    public final ClickHelper clickHelper;
    public Delegate delegate;
    public final Paint errPaint;
    public final CellFlickerDrawable flickerDrawable;
    public GroupCallMessage groupCallMessage;
    public final BoolAnimator isSendDelayedAnimator;
    public final BoolAnimator isSendErrorAnimator;
    public Component.Builder layout;
    public boolean layoutInvalidated;
    public ReactionsLayoutInBubble.VisibleReaction messageReaction;
    public final SpoilersTextView messageTextView;
    public final Tooltip$$ExternalSyntheticLambda0 onMessageStateUpdateListener;
    public RenderNode renderNode;
    public float renderNodeScale;
    public final ChatActivity.AnonymousClass102 senderNameSpan;
    public final RectF tmpRectF;

    public interface Delegate {
    }

    public final class VH extends RecyclerView.ViewHolder {
        public final GroupCallMessageCell cell;

        public VH(GroupCallMessageCell groupCallMessageCell) {
            super(groupCallMessageCell);
            this.cell = groupCallMessageCell;
        }
    }

    public GroupCallMessageCell(Context context) {
        super(context);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.isSendDelayedAnimator = new BoolAnimator(0, this, cubicBezierInterpolator, 320L, false);
        this.isSendErrorAnimator = new BoolAnimator(1, this, cubicBezierInterpolator, 320L, false);
        this.clickHelper = new ClickHelper(this);
        Paint paint = new Paint(1);
        this.bgPaint = paint;
        Paint paint2 = new Paint(1);
        this.errPaint = paint2;
        CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable(64, 204, 160);
        this.flickerDrawable = cellFlickerDrawable;
        this.onMessageStateUpdateListener = new Tooltip$$ExternalSyntheticLambda0(this, 18);
        this.senderNameSpan = new ChatActivity.AnonymousClass102(this, 6);
        this.tmpRectF = new RectF();
        SpoilersTextView spoilersTextView = new SpoilersTextView(context, null, true);
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
        cellFlickerDrawable.paintOutline.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.animatedReactionReceiver = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Component.Builder builder = this.layout;
        if (builder == null) {
            return;
        }
        canvas.drawPath((Path) builder.providedInterfaces, this.bgPaint);
        if (Build.VERSION.SDK_INT >= 29 && this.renderNode != null && canvas.isHardwareAccelerated()) {
            float y = 0.0f;
            View view = this;
            while (view != this.blurRoot) {
                y += view.getY();
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return;
                } else {
                    view = (View) parent;
                }
            }
            canvas.save();
            canvas.clipPath((Path) this.layout.providedInterfaces);
            canvas.translate(0.0f, -y);
            float f = this.renderNodeScale;
            canvas.scale(f, f);
            canvas.drawRenderNode(this.renderNode);
            canvas.restore();
        }
        Paint paint = this.errPaint;
        if (paint.getAlpha() > 0) {
            canvas.drawPath((Path) this.layout.providedInterfaces, paint);
        }
        if (this.isSendDelayedAnimator.floatValue > 0.0f) {
            RectF rectF = this.tmpRectF;
            rectF.set((RectF) this.layout.name);
            rectF.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            this.flickerDrawable.draw(AndroidUtilities.dp(14.0f), canvas, rectF, null);
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

    @Override
    public final boolean forceEnableVibration() {
        return false;
    }

    public final int getClickTarget(float f, float f2) {
        Component.Builder builder = this.layout;
        if (builder == null) {
            return -1;
        }
        RectF rectF = this.tmpRectF;
        rectF.set((RectF) builder.dependencies);
        rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
        if (rectF.contains(f, f2)) {
            return 1;
        }
        return ((RectF) this.layout.name).contains(f, f2) ? 0 : -1;
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public GroupCallMessage getMessage() {
        return this.groupCallMessage;
    }

    public float getReactionCenterX() {
        Component.Builder builder = this.layout;
        if (builder != null) {
            return ((RectF) builder.publishedEvents).centerX();
        }
        return 0.0f;
    }

    @Override
    public final boolean ignoreHapticFeedbackSettings(float f, float f2) {
        return false;
    }

    @Override
    public final boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public final boolean needClickAt(View view, float f, float f2) {
        return getClickTarget(f, f2) == 1;
    }

    @Override
    public final boolean needLongPress(float f, float f2) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
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
    public final void onClickAt(View view, float f, float f2) {
        Delegate delegate;
        GroupCallMessage groupCallMessage;
        if (getClickTarget(f, f2) != 1 || (delegate = this.delegate) == null || (groupCallMessage = this.groupCallMessage) == null) {
            return;
        }
        ((GroupCallActivity.AnonymousClass35) delegate).openSenderProfile(groupCallMessage);
    }

    @Override
    public final void onClickTouchDown(View view, float f, float f2) {
    }

    @Override
    public final void onClickTouchMove(View view, float f, float f2) {
    }

    @Override
    public final void onClickTouchUp(View view, float f, float f2) {
    }

    @Override
    public final void onDetachedFromWindow() {
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

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        this.errPaint.setAlpha(Math.round(this.isSendErrorAnimator.floatValue * 100.0f));
        int iRound = Math.round(this.isSendDelayedAnimator.floatValue * 220.0f);
        CellFlickerDrawable cellFlickerDrawable = this.flickerDrawable;
        cellFlickerDrawable.paint.setAlpha(iRound);
        cellFlickerDrawable.paintOutline.setAlpha(iRound);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Component.Builder builder = this.layout;
        if (builder == null) {
            return;
        }
        int iRound = Math.round(((PointF) builder.factory).x);
        int iRound2 = Math.round(((PointF) this.layout.factory).y);
        SpoilersTextView spoilersTextView = this.messageTextView;
        spoilersTextView.layout(iRound, iRound2, spoilersTextView.getMeasuredWidth() + iRound, spoilersTextView.getMeasuredHeight() + iRound2);
    }

    @Override
    public final void onLongPressCancelled(View view, float f, float f2) {
    }

    @Override
    public final void onLongPressFinish(View view, float f, float f2) {
    }

    @Override
    public final void onLongPressMove(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
    }

    @Override
    public final boolean onLongPressRequestedAt(View view, float f, float f2) {
        return false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int iCeil;
        int size = View.MeasureSpec.getSize(i);
        Component.Builder builder = this.layout;
        if (builder == null || this.layoutInvalidated || builder.instantiation != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            SpoilersTextView spoilersTextView = this.messageTextView;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.messageReaction;
            spoilersTextView.measure(OKLCH.m((size - paddingLeft) - paddingRight, 44.0f, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            float measuredWidth = spoilersTextView.getMeasuredWidth();
            if (visibleReaction == null) {
                iCeil = AndroidUtilities.dp(44.0f) + ((int) Math.ceil(measuredWidth));
            } else {
                iCeil = ((int) Math.ceil(measuredWidth)) + AndroidUtilities.dp(70.0f);
            }
            int iM = MessageObject$$ExternalSyntheticOutline0.m(spoilersTextView.getMeasuredHeight(), 8.0f, AndroidUtilities.dp(28.0f));
            Component.Builder builder2 = new Component.Builder();
            builder2.instantiation = size;
            builder2.type = iM;
            RectF rectF = (RectF) builder2.name;
            rectF.set(0.0f, 0.0f, iCeil, iM);
            rectF.offset((size - iCeil) / 2.0f, 0.0f);
            ((Path) builder2.providedInterfaces).addRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
            boolean z = spoilersTextView.getLayout().getParagraphDirection(0) == -1;
            RectF rectF2 = (RectF) builder2.dependencies;
            rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            if (z) {
                rectF2.offset(rectF.right, rectF.top);
                rectF2.offset((-AndroidUtilities.dp(4.0f)) - rectF2.width(), AndroidUtilities.dp(3.0f));
            } else {
                rectF2.offset(rectF.left, rectF.top);
                rectF2.offset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
            }
            RectF rectF3 = (RectF) builder2.publishedEvents;
            rectF3.set(0.0f, 0.0f, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f));
            if (z) {
                rectF3.offset(rectF.left + AndroidUtilities.dp(5.0f), 0.0f);
            } else {
                rectF3.offset(rectF.right - AndroidUtilities.dp(33.0f), 0.0f);
            }
            rectF3.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            PointF pointF = (PointF) builder2.factory;
            pointF.set(0.0f, (rectF.top + AndroidUtilities.dp(19.0f)) - spoilersTextView.getLayout().getLineBaseline(0));
            if (z) {
                pointF.offset((rectF.right - AndroidUtilities.dp(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF.left + AndroidUtilities.dp(32.0f), 0.0f);
            }
            this.layout = builder2;
            this.avatarReceiver.setImageCoords(rectF2);
            this.animatedReactionReceiver.setImageCoords((RectF) this.layout.publishedEvents);
            if (this.animatedReactionDrawable != null) {
                RectF rectF4 = (RectF) this.layout.publishedEvents;
                Rect rect = tmpRect;
                rectF4.round(rect);
                this.animatedReactionDrawable.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.layout.type);
        this.flickerDrawable.parentWidth = Math.round(((RectF) this.layout.name).width() + AndroidUtilities.dp(48.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.clickHelper.onTouchEvent(motionEvent, this);
    }

    public void set(GroupCallMessage groupCallMessage) {
        boolean z;
        int length;
        int iCharCount;
        char c;
        byte directionality;
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean zIsAttachedToWindow = isAttachedToWindow();
        Tooltip$$ExternalSyntheticLambda0 tooltip$$ExternalSyntheticLambda0 = this.onMessageStateUpdateListener;
        if (zIsAttachedToWindow && (groupCallMessage3 = this.groupCallMessage) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(tooltip$$ExternalSyntheticLambda0);
        }
        this.groupCallMessage = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.groupCallMessage) != null) {
            groupCallMessage2.subscribeToStateUpdates(tooltip$$ExternalSyntheticLambda0);
        }
        GroupCallMessage groupCallMessage4 = this.groupCallMessage;
        boolean z2 = false;
        if (groupCallMessage4 != null) {
            this.isSendDelayedAnimator.setValue(groupCallMessage4.isSendDelayed(), false);
            this.isSendErrorAnimator.setValue(this.groupCallMessage.isSendError(), false);
        }
        TLObject userOrChat = MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(groupCallMessage.fromId);
        String name = DialogObject.getName(userOrChat);
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable.setInfo(groupCallMessage.currentAccount, userOrChat);
        this.avatarReceiver.setForUserOrChat(userOrChat, avatarDrawable);
        ImageReceiver imageReceiver = this.animatedReactionReceiver;
        imageReceiver.setImage(null, null, null, null, null, 0);
        if (this.animatedReactionDrawable != null && isAttachedToWindow()) {
            this.animatedReactionDrawable.removeView(this);
        }
        this.animatedReactionDrawable = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(name);
        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.senderNameSpan, 0, spannableStringBuilder.length(), 33);
        ReactionsLayoutInBubble.VisibleReaction visibleReaction = groupCallMessage.visibleReaction;
        SpoilersTextView spoilersTextView = this.messageTextView;
        if (visibleReaction == null) {
            CharSequence textWithEntities = MessageObject.formatTextWithEntities(groupCallMessage.message, false, true, spoilersTextView.getPaint());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            int length2 = spannableStringBuilder.length();
            int iCharCount2 = 0;
            while (true) {
                if (iCharCount2 < length2) {
                    int iCodePointAt = Character.codePointAt(spannableStringBuilder, iCharCount2);
                    iCharCount2 += Character.charCount(iCodePointAt);
                    byte directionality2 = Character.getDirectionality(iCodePointAt);
                    if (directionality2 != 0) {
                        if (directionality2 == 1 || directionality2 == 2) {
                            z = true;
                        }
                    }
                    length = textWithEntities.length();
                    iCharCount = 0;
                    while (iCharCount < length) {
                        int iCodePointAt2 = Character.codePointAt(textWithEntities, iCharCount);
                        iCharCount += Character.charCount(iCodePointAt2);
                        directionality = Character.getDirectionality(iCodePointAt2);
                        if (directionality != 0) {
                            break;
                        }
                        if (directionality != 1 || directionality == 2) {
                            z2 = true;
                            break;
                        }
                    }
                    if (z != z2) {
                        if (z2) {
                            c = 8295;
                        } else {
                            c = 8294;
                        }
                        spannableStringBuilder2.append(c);
                        spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
                        spannableStringBuilder2.append((char) 8297);
                    } else {
                        spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
                    }
                    spannableStringBuilder2.append((CharSequence) "  ");
                    spannableStringBuilder2.append(textWithEntities);
                    spannableStringBuilder = spannableStringBuilder2;
                }
                z = false;
                length = textWithEntities.length();
                iCharCount = 0;
                while (iCharCount < length) {
                    int iCodePointAt3 = Character.codePointAt(textWithEntities, iCharCount);
                    iCharCount += Character.charCount(iCodePointAt3);
                    directionality = Character.getDirectionality(iCodePointAt3);
                    if (directionality != 0) {
                        if (directionality != 1) {
                        }
                        z2 = true;
                        break;
                    } else {
                        break;
                        break;
                    }
                }
                if (z != z2) {
                    if (z2) {
                        c = 8295;
                    } else {
                        c = 8294;
                    }
                    spannableStringBuilder2.append(c);
                    spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
                    spannableStringBuilder2.append((char) 8297);
                } else {
                    spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
                }
                spannableStringBuilder2.append((CharSequence) "  ");
                spannableStringBuilder2.append(textWithEntities);
                spannableStringBuilder = spannableStringBuilder2;
            }
        } else if (visibleReaction.emojicon != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(groupCallMessage.currentAccount).getReactionsMap().get(groupCallMessage.visibleReaction.emojicon);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
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
        spoilersTextView.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override
    public void setBackgroundColor(int i) {
        this.bgPaint.setColor(i);
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }
}
