package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.ui.ActionBar.BottomSheetTabDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.PaddedListAdapter;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.StrokeDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.chat.ChatInputViewsContainer;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.iv.RichDetailsCell;

public final class MuteButton extends FrameLayout {
    public ValueAnimator animator;
    public boolean connected;
    public final View filledBackgroundView;
    public final ImageView image;
    public final FrameLayout layout;
    public final AnonymousClass1 loadingView;
    public ValueAnimator loadingViewAnimator;
    public boolean muted;
    public float mutedT;

    public final class AnonymousClass1 extends View {
        public final int $r8$classId;
        public final Object progressDrawable;

        public AnonymousClass1(Object obj, Context context, int i) {
            super(context);
            this.$r8$classId = i;
            this.progressDrawable = obj;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 1:
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ((BottomSheetTabDialog) this.progressDrawable).navigationBarPaint);
                    break;
                case 2:
                case 4:
                default:
                    super.dispatchDraw(canvas);
                    break;
                case 3:
                    BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable = ((ChatInputViewsContainer) this.progressDrawable).backgroundWithFadeDrawable;
                    if (blurredBackgroundWithFadeDrawable != null) {
                        blurredBackgroundWithFadeDrawable.draw(canvas);
                    }
                    super.dispatchDraw(canvas);
                    break;
                case 5:
                    canvas.save();
                    StoryRecorder storyRecorder = (StoryRecorder) this.progressDrawable;
                    canvas.translate(storyRecorder.captionEdit.getX() + storyRecorder.captionContainer.getX(), storyRecorder.captionEdit.getY() + storyRecorder.captionContainer.getY());
                    StoryRecorder.AnonymousClass8 anonymousClass8 = storyRecorder.captionEdit;
                    anonymousClass8.drawOver2(canvas, anonymousClass8.getBounds(), storyRecorder.captionEdit.getOver2Alpha());
                    canvas.restore();
                    break;
            }
        }

        @Override
        public void onAttachedToWindow() {
            switch (this.$r8$classId) {
                case 2:
                    super.onAttachedToWindow();
                    ((PaddedListAdapter) this.progressDrawable).paddingViewAttached = true;
                    break;
                case 8:
                    super.onAttachedToWindow();
                    ((CheckBoxBase) this.progressDrawable).onAttachedToWindow();
                    break;
                default:
                    super.onAttachedToWindow();
                    break;
            }
        }

        @Override
        public void onDetachedFromWindow() {
            switch (this.$r8$classId) {
                case 2:
                    super.onDetachedFromWindow();
                    ((PaddedListAdapter) this.progressDrawable).paddingViewAttached = false;
                    break;
                case 8:
                    super.onDetachedFromWindow();
                    ((CheckBoxBase) this.progressDrawable).onDetachedFromWindow();
                    break;
                default:
                    super.onDetachedFromWindow();
                    break;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    int iDp = AndroidUtilities.dp(1.0f);
                    CircularProgressDrawable circularProgressDrawable = (CircularProgressDrawable) this.progressDrawable;
                    circularProgressDrawable.setBounds(iDp, iDp, (getWidth() - iDp) - iDp, (getHeight() - iDp) - iDp);
                    circularProgressDrawable.draw(canvas);
                    invalidate();
                    break;
                case 1:
                case 2:
                case 3:
                case 5:
                default:
                    super.onDraw(canvas);
                    break;
                case 4:
                    if (getAlpha() != 0.0f) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        ((RTMPStreamPipOverlay) this.progressDrawable).cellFlickerDrawable.draw(null, canvas, rectF, AndroidUtilities.dp(10.0f));
                        invalidate();
                        break;
                    }
                    break;
                case 6:
                    super.onDraw(canvas);
                    CommunitySheet communitySheet = (CommunitySheet) this.progressDrawable;
                    float fMax = Math.max(communitySheet.animatorSearchMessagesVisible.floatValue, communitySheet.animatorSearchChatsVisible.floatValue);
                    communitySheet.gradientProtectionDrawableTop.setInsets(AndroidUtilities.dp(42.0f) + communitySheet.systemInsets.top, 0);
                    communitySheet.gradientProtectionDrawableTop.setBounds(0, 0, getWidth(), AndroidUtilities.dp(56.0f) + communitySheet.systemInsets.top);
                    GradientProtectionDrawable gradientProtectionDrawable = communitySheet.gradientProtectionDrawableTop;
                    int i = Theme.key_windowBackgroundGray;
                    gradientProtectionDrawable.setColor(Theme.multAlpha(AndroidUtilities.lerp(1.0f, 0.8f, fMax), communitySheet.getThemedColor(i)));
                    communitySheet.gradientProtectionDrawableTop.draw(canvas);
                    if (communitySheet.onlyChatsMode) {
                        fMax = 1.0f;
                    }
                    int iLerp = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f) + communitySheet.systemInsets.bottom, 0, fMax);
                    int iLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, fMax) + communitySheet.systemInsets.bottom;
                    float fLerp = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(communitySheet.systemInsets.bottom), fMax);
                    communitySheet.gradientProtectionDrawableBottom.setInsets(0, iLerp);
                    communitySheet.gradientProtectionDrawableBottom.setBounds(0, getHeight() - iLerp2, getWidth(), getHeight());
                    communitySheet.gradientProtectionDrawableBottom.setColor(Theme.multAlpha(fLerp, communitySheet.getThemedColor(i)));
                    communitySheet.gradientProtectionDrawableBottom.draw(canvas);
                    break;
                case 7:
                    canvas.save();
                    canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                    ((RichDetailsCell) this.progressDrawable).arrow.draw(canvas);
                    canvas.restore();
                    break;
                case 8:
                    int iDp2 = AndroidUtilities.dp(20.0f);
                    int width = (getWidth() - iDp2) / 2;
                    int height = (getHeight() - iDp2) / 2;
                    CheckBoxBase checkBoxBase = (CheckBoxBase) this.progressDrawable;
                    checkBoxBase.setBounds(width, height, iDp2, iDp2);
                    checkBoxBase.draw(canvas);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            int iIntValue;
            switch (this.$r8$classId) {
                case 1:
                    setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.navigationBarHeight);
                    setTranslationY(AndroidUtilities.navigationBarHeight);
                    break;
                case 2:
                    ((View) getParent()).getMeasuredHeight();
                    PaddedListAdapter paddedListAdapter = (PaddedListAdapter) this.progressDrawable;
                    Integer num = paddedListAdapter.padding;
                    if (num != null) {
                        iIntValue = num.intValue();
                        paddedListAdapter.lastPadding = iIntValue;
                    } else {
                        iIntValue = 0;
                        paddedListAdapter.lastPadding = 0;
                    }
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824));
                    break;
                case 8:
                    setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(24.0f));
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 4:
                    super.onSizeChanged(i, i2, i3, i4);
                    ((RTMPStreamPipOverlay) this.progressDrawable).cellFlickerDrawable.parentWidth = i;
                    break;
                default:
                    super.onSizeChanged(i, i2, i3, i4);
                    break;
            }
        }

        public AnonymousClass1(Context context) {
            super(context);
            this.$r8$classId = 0;
            this.progressDrawable = new CircularProgressDrawable(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
        }

        public AnonymousClass1(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.$r8$classId = 8;
            CheckBoxBase checkBoxBase = new CheckBoxBase(this, 20, resourcesProvider);
            this.progressDrawable = checkBoxBase;
            checkBoxBase.setColor(Theme.key_telegram_color, Theme.key_dialogCheckboxSquareDisabled, Theme.key_checkboxCheck);
            checkBoxBase.setBackgroundType(10);
            checkBoxBase.setDrawUnchecked(true);
            checkBoxBase.setCustomRadius(AndroidUtilities.dp(5.0f));
        }
    }

    public MuteButton(Context context, BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed) {
        super(context);
        ScaleStateListAnimator.apply(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.layout = frameLayout;
        StrokeDrawable strokeDrawable = new StrokeDrawable();
        strokeDrawable.colorProvider = blurredBackgroundColorProviderThemed;
        Paint paint = strokeDrawable.paintStrokeTop;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = strokeDrawable.paintStrokeBottom;
        paint2.setStyle(style);
        BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed2 = strokeDrawable.colorProvider;
        if (blurredBackgroundColorProviderThemed2 != null) {
            strokeDrawable.strokeColorTop = Theme.multAlpha(strokeDrawable.alpha, blurredBackgroundColorProviderThemed2.getStrokeColorTop());
            strokeDrawable.strokeColorBottom = Theme.multAlpha(strokeDrawable.alpha, strokeDrawable.colorProvider.getStrokeColorBottom());
            paint.setColor(strokeDrawable.strokeColorTop);
            paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
            paint2.setColor(strokeDrawable.strokeColorBottom);
            paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
        }
        strokeDrawable.paintFill.setColor(-14670806);
        strokeDrawable.invalidateSelf();
        strokeDrawable.padding = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(strokeDrawable);
        addView(frameLayout, LayoutHelper.createFrame(40, 40, 17));
        View view = new View(context);
        this.filledBackgroundView = view;
        view.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, LayoutHelper.createFrame(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
        this.loadingView = anonymousClass1;
        addView(anonymousClass1, LayoutHelper.createFrame(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.image = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, LayoutHelper.createFrame(40, 40, 17));
        setMuted(false, false);
    }

    public final void setConnected(boolean z, boolean z2) {
        boolean z3 = true;
        if (this.connected == z && z2) {
            return;
        }
        this.connected = z;
        ValueAnimator valueAnimator = this.loadingViewAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.loadingViewAnimator = null;
        }
        AnonymousClass1 anonymousClass1 = this.loadingView;
        if (z2) {
            anonymousClass1.setVisibility(0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(anonymousClass1.getAlpha(), z ? 0.0f : 1.0f);
            this.loadingViewAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new MuteButton$$ExternalSyntheticLambda0(this, 0));
            this.loadingViewAnimator.setDuration(320L);
            this.loadingViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.loadingViewAnimator.start();
        } else {
            anonymousClass1.setAlpha(z ? 0.0f : 1.0f);
            anonymousClass1.setVisibility(z ? 8 : 0);
        }
        if (!this.muted && z) {
            z3 = false;
        }
        updateFill(z3, z2);
    }

    public final void setMuted(boolean z, boolean z2) {
        this.muted = z;
        ImageView imageView = this.image;
        if (z2) {
            imageView.setImageResource(z ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
        } else {
            AndroidUtilities.updateImageViewImageAnimated(imageView, z ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
        }
        updateFill(z || !this.connected, z2);
    }

    public final void updateFill(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.animator = null;
        }
        if (z2) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mutedT, z ? 1.0f : 0.0f);
            this.animator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new MuteButton$$ExternalSyntheticLambda0(this, 1));
            this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.animator.setDuration(420L);
            this.animator.start();
            return;
        }
        float f = z ? 1.0f : 0.0f;
        this.mutedT = f;
        View view = this.filledBackgroundView;
        view.setAlpha(1.0f - f);
        view.setScaleX(1.0f - this.mutedT);
        view.setScaleY(1.0f - this.mutedT);
        this.image.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(this.mutedT, -1, -2960428), PorterDuff.Mode.SRC_IN));
        this.layout.invalidate();
    }
}
