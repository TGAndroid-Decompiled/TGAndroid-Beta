package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;

@Deprecated
public class HintView extends FrameLayout {
    public static final int TYPE_COMMON = 4;
    public static final int TYPE_DEFAULT = 6;
    public static final int TYPE_NOSOUND = 0;
    public static final int TYPE_POLL_VOTE = 5;
    public static final int TYPE_SEARCH_AS_LIST = 3;
    private AnimatorSet animatorSet;
    public ImageView arrowImageView;
    private int backgroundColor;
    Paint backgroundPaint;
    private int bottomOffset;
    private int currentType;
    private View currentView;
    private boolean drawPath;
    private float extraTranslationY;
    private boolean hasCloseButton;
    private Runnable hideRunnable;
    private ImageView imageView;
    private boolean isTopArrow;
    private ChatMessageCell messageCell;
    private String overrideText;
    Path path;
    private final Theme.ResourcesProvider resourcesProvider;
    private long showingDuration;
    private int shownY;
    public TextView textView;
    private float translationY;
    private boolean useScale;
    VisibilityListener visibleListener;

    public class AnonymousClass1 extends AnimatorListenerAdapter {
        public AnonymousClass1() {
        }

        public void lambda$onAnimationEnd$0() {
            HintView.this.hide();
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            HintView.this.animatorSet = null;
            if (HintView.this.hasCloseButton) {
                return;
            }
            AndroidUtilities.runOnUIThread(HintView.this.hideRunnable = new Bulletin$2$$ExternalSyntheticLambda1(this, 19), HintView.this.currentType == 0 ? 10000L : 2000L);
        }
    }

    public class AnonymousClass2 extends AnimatorListenerAdapter {
        public AnonymousClass2() {
        }

        public void lambda$onAnimationEnd$0() {
            HintView.this.hide();
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            HintView.this.animatorSet = null;
            if (HintView.this.hasCloseButton) {
                return;
            }
            AndroidUtilities.runOnUIThread(HintView.this.hideRunnable = new Bulletin$2$$ExternalSyntheticLambda1(this, 20), HintView.this.showingDuration);
        }
    }

    public static class Builder {
        private int backgroundColor;
        boolean closeButton;
        Context context;
        private boolean drawPath = true;
        HintView hintView;
        private boolean isTopArrow;
        Theme.ResourcesProvider resourcesProvider;

        public Builder(Context context, Theme.ResourcesProvider resourcesProvider) {
            this.context = context;
            this.resourcesProvider = resourcesProvider;
            this.backgroundColor = Theme.getColor(Theme.key_chat_gifSaveHintBackground, resourcesProvider);
        }

        public HintView build() {
            HintView hintView = new HintView(this.context, 6, this.isTopArrow, this.resourcesProvider);
            this.hintView = hintView;
            hintView.setUseScale(true);
            if (this.drawPath) {
                this.hintView.textView.setBackground(null);
                this.hintView.arrowImageView.setImageDrawable(null);
                this.hintView.drawPath = true;
                this.hintView.backgroundColor = this.backgroundColor;
            }
            if (this.closeButton) {
                this.hintView.createCloseButton();
            }
            return this.hintView;
        }

        public Builder setBackgroundColor(int i) {
            this.backgroundColor = i;
            return this;
        }

        public Builder setDrawPath(boolean z) {
            this.drawPath = z;
            return this;
        }

        public Builder setTopArrow(boolean z) {
            this.isTopArrow = z;
            return this;
        }

        public Builder withCloseButton() {
            this.closeButton = true;
            return this;
        }
    }

    public interface VisibilityListener {
        void onVisible(boolean z);
    }

    public HintView(Context context, int i) {
        this(context, i, false, null);
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void lambda$createCloseButton$0(View view) {
        hide(true);
    }

    public void createCloseButton() {
        this.textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        this.hasCloseButton = true;
        ImageView imageView = new ImageView(getContext());
        this.imageView = imageView;
        imageView.setImageResource(R.drawable.msg_mini_close_tooltip);
        this.imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.imageView.setColorFilter(new PorterDuffColorFilter(ColorUtils.setAlphaComponent(getThemedColor(Theme.key_chat_gifSaveHintText), 125), PorterDuff.Mode.MULTIPLY));
        ImageView imageView2 = this.imageView;
        boolean z = this.isTopArrow;
        addView(imageView2, LayoutHelper.createFrame(34, 34.0f, 21, 0.0f, z ? 3.0f : 0.0f, 0.0f, z ? 0.0f : 3.0f));
        setOnClickListener(new HintView$$ExternalSyntheticLambda0(this, 0));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.drawPath && this.path != null) {
            if (this.backgroundPaint == null) {
                Paint paint = new Paint(1);
                this.backgroundPaint = paint;
                paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(6.0f)));
                this.backgroundPaint.setColor(this.backgroundColor);
            }
            canvas.drawPath(this.path, this.backgroundPaint);
        }
        super.dispatchDraw(canvas);
    }

    public float getBaseTranslationY() {
        return this.translationY;
    }

    public ChatMessageCell getMessageCell() {
        return this.messageCell;
    }

    public void hide() {
        hide(true);
    }

    public boolean isShowing() {
        return getTag() != null;
    }

    public int offsetCx() {
        return 0;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.drawPath) {
            int measuredHeight = getMeasuredHeight();
            int measuredWidth = getMeasuredWidth();
            float measuredWidth2 = (this.arrowImageView.getMeasuredWidth() / 2.0f) + this.arrowImageView.getX();
            Path path = this.path;
            if (path == null) {
                this.path = new Path();
            } else {
                path.rewind();
            }
            if (!this.isTopArrow) {
                this.path.moveTo(0.0f, measuredHeight - AndroidUtilities.dp(6.0f));
                this.path.lineTo(0.0f, 0.0f);
                float f = measuredWidth;
                this.path.lineTo(f, 0.0f);
                this.path.lineTo(f, measuredHeight - AndroidUtilities.dp(6.0f));
                this.path.lineTo(AndroidUtilities.dp(7.0f) + measuredWidth2, measuredHeight - AndroidUtilities.dp(6.0f));
                this.path.lineTo(measuredWidth2, AndroidUtilities.dp(2.0f) + measuredHeight);
                this.path.lineTo(measuredWidth2 - AndroidUtilities.dp(7.0f), measuredHeight - AndroidUtilities.dp(6.0f));
                this.path.close();
                return;
            }
            this.path.moveTo(0.0f, AndroidUtilities.dp(6.0f));
            float f2 = measuredHeight;
            this.path.lineTo(0.0f, f2);
            float f3 = measuredWidth;
            this.path.lineTo(f3, f2);
            this.path.lineTo(f3, AndroidUtilities.dp(6.0f));
            this.path.lineTo(AndroidUtilities.dp(7.0f) + measuredWidth2, AndroidUtilities.dp(6.0f));
            this.path.lineTo(measuredWidth2, -AndroidUtilities.dp(2.0f));
            this.path.lineTo(measuredWidth2 - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(6.0f));
            this.path.close();
        }
    }

    public void setBackgroundColor(int i, int i2) {
        this.textView.setTextColor(i2);
        this.arrowImageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        TextView textView = this.textView;
        int i3 = this.currentType;
        textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp((i3 == 7 || i3 == 8) ? 6.0f : 3.0f), i));
    }

    public void setBottomOffset(int i) {
        this.bottomOffset = i;
    }

    public void setExtraTranslationY(float f) {
        this.extraTranslationY = f;
        setTranslationY(f + this.translationY);
    }

    public void setOverrideText(String str) {
        this.overrideText = str;
        this.textView.setText(str);
        ChatMessageCell chatMessageCell = this.messageCell;
        if (chatMessageCell != null) {
            this.messageCell = null;
            showForMessageCell(chatMessageCell, false);
        }
    }

    public void setShowingDuration(long j) {
        this.showingDuration = j;
    }

    public void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public void setUseScale(boolean z) {
        this.useScale = z;
    }

    public void setVisibleListener(VisibilityListener visibilityListener) {
        this.visibleListener = visibilityListener;
    }

    public boolean showForMessageCell(ChatMessageCell chatMessageCell, boolean z) {
        return showForMessageCell(chatMessageCell, null, 0, 0, z);
    }

    public boolean showForView(View view, boolean z) {
        if (this.currentView == view || getTag() != null) {
            if (getTag() != null) {
                updatePosition(view);
            }
            return false;
        }
        Runnable runnable = this.hideRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.hideRunnable = null;
        }
        updatePosition(view);
        this.currentView = view;
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.animatorSet = null;
        }
        setTag(1);
        setVisibility(0);
        VisibilityListener visibilityListener = this.visibleListener;
        if (visibilityListener != null) {
            visibilityListener.onVisible(true);
        }
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            boolean z2 = this.useScale;
            Property property = View.ALPHA;
            if (z2) {
                setPivotX((this.arrowImageView.getMeasuredWidth() / 2.0f) + this.arrowImageView.getX());
                setPivotY((this.arrowImageView.getMeasuredHeight() / 2.0f) + this.arrowImageView.getY());
                this.animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<HintView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, (Property<HintView, Float>) View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, (Property<HintView, Float>) View.SCALE_X, 0.5f, 1.0f));
                this.animatorSet.setDuration(350L);
                this.animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<HintView, Float>) property, 0.0f, 1.0f));
                this.animatorSet.setDuration(300L);
            }
            this.animatorSet.addListener(new AnonymousClass2());
            this.animatorSet.start();
        } else {
            setAlpha(1.0f);
        }
        return true;
    }

    public void updatePosition() {
        View view = this.currentView;
        if (view == null) {
            return;
        }
        updatePosition(view);
    }

    public HintView(Context context, int i, boolean z) {
        this(context, i, z, null);
    }

    public void hide(boolean z) {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.hideRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.hideRunnable = null;
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.animatorSet = null;
        }
        if (!z) {
            setVisibility(4);
            VisibilityListener visibilityListener = this.visibleListener;
            if (visibilityListener != null) {
                visibilityListener.onVisible(false);
            }
            this.currentView = null;
            this.messageCell = null;
            this.animatorSet = null;
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.animatorSet = animatorSet2;
        boolean z2 = this.useScale;
        Property property = View.ALPHA;
        if (z2) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<HintView, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, (Property<HintView, Float>) View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, (Property<HintView, Float>) View.SCALE_X, 1.0f, 0.5f));
            this.animatorSet.setDuration(150L);
            this.animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<HintView, Float>) property, 0.0f));
            this.animatorSet.setDuration(300L);
        }
        this.animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                HintView.this.setVisibility(4);
                VisibilityListener visibilityListener2 = HintView.this.visibleListener;
                if (visibilityListener2 != null) {
                    visibilityListener2.onVisible(false);
                }
                HintView.this.currentView = null;
                HintView.this.messageCell = null;
                HintView.this.animatorSet = null;
            }
        });
        this.animatorSet.start();
    }

    public boolean showForMessageCell(ChatMessageCell chatMessageCell, Object obj, int i, int i2, boolean z) {
        int imageY;
        int iDp;
        int forwardNameCenterX;
        int i3 = this.currentType;
        if ((i3 == 5 && i2 == this.shownY && this.messageCell == chatMessageCell) || (i3 != 5 && ((i3 == 0 && getTag() != null) || this.messageCell == chatMessageCell))) {
            return false;
        }
        Runnable runnable = this.hideRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.hideRunnable = null;
        }
        int[] iArr = new int[2];
        chatMessageCell.getLocationInWindow(iArr);
        int i4 = iArr[1];
        ((View) getParent()).getLocationInWindow(iArr);
        int i5 = i4 - iArr[1];
        View view = (View) chatMessageCell.getParent();
        int i6 = this.currentType;
        if (i6 == 0) {
            ImageReceiver photoImage = chatMessageCell.getPhotoImage();
            imageY = (int) (photoImage.getImageY() + i5);
            int imageHeight = (int) photoImage.getImageHeight();
            int i7 = imageY + imageHeight;
            int measuredHeight = view.getMeasuredHeight();
            if (imageY <= AndroidUtilities.dp(10.0f) + getMeasuredHeight() || i7 > (imageHeight / 4) + measuredHeight) {
                return false;
            }
            forwardNameCenterX = chatMessageCell.getNoSoundIconCenterX();
            measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
        } else if (i6 == 5) {
            Integer num = (Integer) obj;
            imageY = i5 + i2;
            this.shownY = i2;
            MessageObject messageObject = chatMessageCell.getMessageObject();
            if (messageObject != null && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) MessageObject.getMedia(messageObject);
                if (MessageObject.isVoted(tL_messageMediaPoll) && !MessageObject.isVoteResultsIsNotEmpty(tL_messageMediaPoll)) {
                    TLRPC.Poll poll = tL_messageMediaPoll.poll;
                    if (!poll.closed && poll.hide_results_until_close) {
                        this.textView.setText(LocaleController.getString(R.string.PollResultsWillLater));
                    } else {
                        if (num.intValue() != -1) {
                            return false;
                        }
                        this.textView.setText(LocaleController.getString(R.string.PollSelectOption));
                    }
                } else {
                    if (num.intValue() != -1) {
                        return false;
                    }
                    this.textView.setText(LocaleController.getString(R.string.PollSelectOption));
                }
            } else {
                if (num.intValue() != -1) {
                    return false;
                }
                this.textView.setText(LocaleController.getString(R.string.PollSelectOption));
            }
            measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
            forwardNameCenterX = i;
        } else {
            MessageObject messageObject2 = chatMessageCell.getMessageObject();
            String str = this.overrideText;
            if (str == null) {
                this.textView.setText(LocaleController.getString(R.string.HidAccount));
            } else {
                this.textView.setText(str);
            }
            measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
            TLRPC.User currentUser = chatMessageCell.getCurrentUser();
            if (currentUser == null || currentUser.id != 0) {
                int iDp2 = AndroidUtilities.dp(22.0f) + i5;
                if (messageObject2.isOutOwner() || !chatMessageCell.isDrawNameLayout()) {
                    imageY = iDp2;
                } else {
                    iDp = AndroidUtilities.dp(20.0f) + iDp2;
                }
                if (this.isTopArrow && imageY <= AndroidUtilities.dp(10.0f) + getMeasuredHeight()) {
                    return false;
                }
                forwardNameCenterX = chatMessageCell.getForwardNameCenterX();
            } else {
                iDp = zzkl.m(50.0f, chatMessageCell.getMeasuredHeight() - Math.max(0, chatMessageCell.getBottom() - view.getMeasuredHeight()), i5);
            }
            imageY = iDp;
            if (this.isTopArrow) {
            }
            forwardNameCenterX = chatMessageCell.getForwardNameCenterX();
        }
        int measuredWidth = view.getMeasuredWidth();
        if (this.isTopArrow) {
            float f = this.extraTranslationY;
            float fDp = AndroidUtilities.dp(44.0f);
            this.translationY = fDp;
            setTranslationY(f + fDp);
        } else {
            float f2 = this.extraTranslationY;
            float measuredHeight2 = imageY - getMeasuredHeight();
            this.translationY = measuredHeight2;
            setTranslationY(f2 + measuredHeight2);
        }
        int left = chatMessageCell.getLeft() + forwardNameCenterX;
        int iDp3 = AndroidUtilities.dp(19.0f);
        if (this.currentType == 5) {
            int iM = BotFullscreenButtons$$ExternalSyntheticOutline1.m(19.1f, forwardNameCenterX - (getMeasuredWidth() / 2), 0);
            setTranslationX(iM);
            iDp3 += iM;
        } else if (left > view.getMeasuredWidth() / 2) {
            int measuredWidth2 = (measuredWidth - getMeasuredWidth()) - AndroidUtilities.dp(38.0f);
            setTranslationX(measuredWidth2);
            iDp3 += measuredWidth2;
        } else {
            setTranslationX(0.0f);
        }
        float left2 = ((chatMessageCell.getLeft() + forwardNameCenterX) - iDp3) - (this.arrowImageView.getMeasuredWidth() / 2);
        this.arrowImageView.setTranslationX(left2);
        if (left > view.getMeasuredWidth() / 2) {
            if (left2 < AndroidUtilities.dp(10.0f)) {
                float fDp2 = left2 - AndroidUtilities.dp(10.0f);
                setTranslationX(getTranslationX() + fDp2);
                this.arrowImageView.setTranslationX(left2 - fDp2);
            }
        } else if (left2 > getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
            float measuredWidth3 = (left2 - getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
            setTranslationX(measuredWidth3);
            this.arrowImageView.setTranslationX(left2 - measuredWidth3);
        } else if (left2 < AndroidUtilities.dp(10.0f)) {
            float fDp3 = left2 - AndroidUtilities.dp(10.0f);
            setTranslationX(getTranslationX() + fDp3);
            this.arrowImageView.setTranslationX(left2 - fDp3);
        }
        this.messageCell = chatMessageCell;
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.animatorSet = null;
        }
        setTag(1);
        setVisibility(0);
        VisibilityListener visibilityListener = this.visibleListener;
        if (visibilityListener != null) {
            visibilityListener.onVisible(true);
        }
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<HintView, Float>) View.ALPHA, 0.0f, 1.0f));
            this.animatorSet.addListener(new AnonymousClass1());
            this.animatorSet.setDuration(300L);
            this.animatorSet.start();
        } else {
            setAlpha(1.0f);
        }
        return true;
    }

    public HintView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        this(context, i, false, resourcesProvider);
    }

    private void updatePosition(View view) {
        int measuredWidth;
        int i;
        int i2;
        int measuredWidth2;
        int i3;
        measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int iDp = iArr[1] - AndroidUtilities.dp(4.0f);
        int i4 = this.currentType;
        if (i4 == 4) {
            iDp += AndroidUtilities.dp(4.0f);
        } else if (i4 == 6 && this.isTopArrow) {
            iDp = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(10.0f, getMeasuredHeight() + view.getMeasuredHeight(), iDp);
        } else if (i4 == 7 || (i4 == 8 && this.isTopArrow)) {
            iDp = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(8.0f, getMeasuredHeight() + view.getMeasuredHeight(), iDp);
        } else if (i4 == 8) {
            iDp -= AndroidUtilities.dp(10.0f);
        }
        int i5 = this.currentType;
        int measuredWidth3 = 0;
        if (i5 == 8 && this.isTopArrow) {
            if (view instanceof SimpleTextView) {
                SimpleTextView simpleTextView = (SimpleTextView) view;
                Drawable rightDrawable = simpleTextView.getRightDrawable();
                measuredWidth = (iArr[0] + (rightDrawable != null ? rightDrawable.getBounds().centerX() : simpleTextView.getTextWidth() / 2)) - AndroidUtilities.dp(8.0f);
            } else if (view instanceof TextView) {
                measuredWidth = (((TextView) view).getMeasuredWidth() + iArr[0]) - AndroidUtilities.dp(16.5f);
            } else {
                measuredWidth = iArr[0];
            }
        } else if (i5 == 3) {
            measuredWidth = iArr[0];
        } else {
            measuredWidth = (view.getMeasuredWidth() / 2) + iArr[0];
        }
        View view2 = (View) getParent();
        view2.getLocationInWindow(iArr);
        int i6 = measuredWidth - iArr[0];
        int i7 = (iDp - iArr[1]) - this.bottomOffset;
        int iOffsetCx = offsetCx() + i6;
        int measuredWidth4 = view2.getMeasuredWidth();
        if (this.isTopArrow && (i3 = this.currentType) != 6 && i3 != 7 && i3 != 8) {
            float f = this.extraTranslationY;
            float fDp = AndroidUtilities.dp(44.0f);
            this.translationY = fDp;
            setTranslationY(f + fDp);
        } else {
            float f2 = this.extraTranslationY;
            float measuredHeight = i7 - getMeasuredHeight();
            this.translationY = measuredHeight;
            setTranslationY(f2 + measuredHeight);
        }
        if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            i = ((ViewGroup.MarginLayoutParams) getLayoutParams()).leftMargin;
            i2 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).rightMargin;
        } else {
            i = 0;
            i2 = 0;
        }
        if (this.currentType == 8 && !this.isTopArrow) {
            measuredWidth3 = (((measuredWidth4 - i) - i2) - getMeasuredWidth()) / 2;
        } else if (iOffsetCx > view2.getMeasuredWidth() / 2) {
            if (this.currentType == 3) {
                measuredWidth2 = (int) (measuredWidth4 - (getMeasuredWidth() * 1.5f));
                if (measuredWidth2 >= 0) {
                    measuredWidth3 = measuredWidth2;
                }
            } else {
                measuredWidth3 = (measuredWidth4 - getMeasuredWidth()) - (i2 + i);
            }
        } else if (this.currentType == 3 && (measuredWidth2 = (iOffsetCx - (getMeasuredWidth() / 2)) - this.arrowImageView.getMeasuredWidth()) >= 0) {
            measuredWidth3 = measuredWidth2;
        }
        setTranslationX(measuredWidth3);
        float measuredWidth5 = (iOffsetCx - (i + measuredWidth3)) - (this.arrowImageView.getMeasuredWidth() / 2.0f);
        if (this.currentType == 7) {
            measuredWidth5 += AndroidUtilities.dp(2.0f);
        }
        this.arrowImageView.setTranslationX(measuredWidth5);
        if (iOffsetCx > view2.getMeasuredWidth() / 2) {
            if (measuredWidth5 < AndroidUtilities.dp(10.0f)) {
                float fDp2 = measuredWidth5 - AndroidUtilities.dp(10.0f);
                setTranslationX(getTranslationX() + fDp2);
                this.arrowImageView.setTranslationX(measuredWidth5 - fDp2);
                return;
            }
            return;
        }
        if (measuredWidth5 > getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
            float measuredWidth6 = (measuredWidth5 - getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
            setTranslationX(measuredWidth6);
            this.arrowImageView.setTranslationX(measuredWidth5 - measuredWidth6);
        } else if (measuredWidth5 < AndroidUtilities.dp(10.0f)) {
            float fDp3 = measuredWidth5 - AndroidUtilities.dp(10.0f);
            setTranslationX(getTranslationX() + fDp3);
            this.arrowImageView.setTranslationX(measuredWidth5 - fDp3);
        }
    }

    public HintView(Context context, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.showingDuration = 2000L;
        this.resourcesProvider = resourcesProvider;
        this.currentType = i;
        this.isTopArrow = z;
        CorrectlyMeasuringTextView correctlyMeasuringTextView = new CorrectlyMeasuringTextView(context);
        this.textView = correctlyMeasuringTextView;
        int i2 = Theme.key_chat_gifSaveHintText;
        correctlyMeasuringTextView.setTextColor(getThemedColor(i2));
        this.textView.setTextSize(1, 14.0f);
        this.textView.setMaxLines(2);
        if (i == 7 || i == 8 || i == 9) {
            this.textView.setMaxWidth(AndroidUtilities.dp(310.0f));
        } else if (i == 4) {
            this.textView.setMaxWidth(AndroidUtilities.dp(280.0f));
        } else {
            this.textView.setMaxWidth(AndroidUtilities.dp(250.0f));
        }
        if (this.currentType == 3) {
            this.textView.setGravity(19);
            this.textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(5.0f), getThemedColor(Theme.key_chat_gifSaveHintBackground)));
            this.textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            addView(this.textView, LayoutHelper.createFrame(-2, 30.0f, 51, 0.0f, z ? 6.0f : 0.0f, 0.0f, z ? 0.0f : 6.0f));
        } else {
            this.textView.setGravity(51);
            this.textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), getThemedColor(Theme.key_chat_gifSaveHintBackground)));
            this.textView.setPadding(AndroidUtilities.dp(this.currentType == 0 ? 54.0f : 12.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f));
            addView(this.textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, z ? 6.0f : 0.0f, 0.0f, z ? 0.0f : 6.0f));
        }
        if (i == 0) {
            this.textView.setText(LocaleController.getString(R.string.AutoplayVideoInfo));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setImageResource(R.drawable.tooltip_sound);
            this.imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i2), PorterDuff.Mode.MULTIPLY));
            addView(this.imageView, LayoutHelper.createFrame(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.arrowImageView = imageView2;
        imageView2.setImageResource(z ? R.drawable.tooltip_arrow_up : R.drawable.tooltip_arrow);
        this.arrowImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_gifSaveHintBackground), PorterDuff.Mode.MULTIPLY));
        addView(this.arrowImageView, LayoutHelper.createFrame(14, 6.0f, (z ? 48 : 80) | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }
}
