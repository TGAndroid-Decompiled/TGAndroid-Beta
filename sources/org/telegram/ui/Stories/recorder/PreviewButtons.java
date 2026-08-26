package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda29;

public final class PreviewButtons extends FrameLayout {
    public ValueAnimator appearAnimator;
    public float appearT;
    public boolean appearing;
    public final ArrayList buttons;
    public boolean isShareEnabled;
    public Utilities.Callback onClickListener;
    public final View shadowView;
    public boolean shareArrow;
    public ShareButtonView shareButton;
    public String shareText;

    public final class ButtonView extends ImageView {
        public final int id;

        public ButtonView(Context context, int i, int i2) {
            super(context);
            this.id = i;
            setBackground(Theme.createSelectorDrawable(1090519039, 1, -1));
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(i2);
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            setOnClickListener(new RichEditor$$ExternalSyntheticLambda29(this, i, 9));
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
        }

        @Override
        public final void onMeasure(int i, int i2) {
            setMeasuredDimension(AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        }
    }

    public final class ShareButtonView extends View {
        public final boolean arrow;
        public ValueAnimator backAnimator;
        public final Paint buttonPaint;
        public final Paint darkenPaint;
        public boolean enabled;
        public final AnimatedFloat enabledT;
        public final int h;
        public final float left;
        public float pressedProgress;
        public final StaticLayout staticLayout;
        public final int w;
        public final float width;

        public ShareButtonView(Context context, String str, boolean z) {
            CharSequence upperCase;
            super(context);
            TextPaint textPaint = new TextPaint(1);
            Paint paint = new Paint(1);
            this.buttonPaint = paint;
            Paint paint2 = new Paint(1);
            this.darkenPaint = paint2;
            this.enabledT = new AnimatedFloat(this, 0L, 220L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.enabled = true;
            this.arrow = z;
            paint.setColor(-15098625);
            paint2.setColor(1610612736);
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setColor(-1);
            textPaint.setTypeface(AndroidUtilities.bold());
            if (z) {
                SpannableString spannableString = new SpannableString(">");
                Drawable drawableMutate = getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                drawableMutate.setBounds(0, 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                spannableString.setSpan(new ImageSpan(drawableMutate, 2), 0, spannableString.length(), 33);
                upperCase = LocaleController.isRTL ? new SpannableStringBuilder(spannableString).append((CharSequence) "\u2009").append((CharSequence) str.toUpperCase()) : new SpannableStringBuilder(str.toUpperCase()).append((CharSequence) "\u2009").append((CharSequence) spannableString);
            } else {
                upperCase = str.toUpperCase();
            }
            StaticLayout staticLayout = new StaticLayout(upperCase, textPaint, AndroidUtilities.dp(180.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.staticLayout = staticLayout;
            this.left = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
            float lineWidth = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
            this.width = lineWidth;
            int iDp = AndroidUtilities.dp(48.0f) + ((int) lineWidth);
            this.w = iDp;
            if (!z) {
                this.w = Math.max(AndroidUtilities.dp(80.0f), iDp);
            }
            this.h = AndroidUtilities.dp(40.0f);
            setOnClickListener(new PaintView$$ExternalSyntheticLambda63(this, 5));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            if (isPressed()) {
                float f = this.pressedProgress;
                if (f != 1.0f) {
                    float fMin = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 80.0f) + f;
                    this.pressedProgress = fMin;
                    this.pressedProgress = Utilities.clamp(fMin, 1.0f, 0.0f);
                    invalidate();
                }
            }
            float f2 = this.enabledT.set(this.enabled ? 1.0f : 0.5f);
            int saveCount = canvas.getSaveCount();
            if (f2 < 1.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f2 * 255.0f), 31);
            }
            float f3 = ((1.0f - this.pressedProgress) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(f3, f3, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.drawRect(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(4.0f), getWidth() - AndroidUtilities.dp(25.0f), getHeight() - AndroidUtilities.dp(4.0f), this.darkenPaint);
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), getWidth() - AndroidUtilities.dp(10.0f), getHeight() - AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), this.buttonPaint);
            canvas.save();
            float fDp = (((this.w - this.width) / 2.0f) + AndroidUtilities.dp(this.arrow ? 3.0f : 0.0f)) - this.left;
            int height = getHeight();
            StaticLayout staticLayout = this.staticLayout;
            canvas.translate(fDp, (height - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(canvas);
            canvas.restore();
            canvas.restoreToCount(saveCount);
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.w, 1073741824), View.MeasureSpec.makeMeasureSpec(this.h, 1073741824));
        }

        @Override
        public final void setPressed(boolean z) {
            ValueAnimator valueAnimator;
            int i = 7;
            if (isPressed() != z) {
                super.setPressed(z);
                invalidate();
                if (z && (valueAnimator = this.backAnimator) != null) {
                    valueAnimator.removeAllListeners();
                    this.backAnimator.cancel();
                }
                if (z) {
                    return;
                }
                float f = this.pressedProgress;
                if (f != 0.0f) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.backAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new HintView2$$ExternalSyntheticLambda1(this, i));
                    this.backAnimator.addListener(new HintView2.AnonymousClass2(this, i));
                    zzkk.m(1.5f, this.backAnimator);
                    this.backAnimator.setDuration(350L);
                    this.backAnimator.start();
                }
            }
        }
    }

    public PreviewButtons(Activity activity) {
        super(activity);
        ArrayList arrayList = new ArrayList();
        this.buttons = arrayList;
        this.shareArrow = true;
        this.isShareEnabled = true;
        View view = new View(activity);
        this.shadowView = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        addView(view, LayoutHelper.createFrame(-1, -1, 119));
        int i = R.drawable.media_draw;
        String string = LocaleController.getString(R.string.AccDescrPaint);
        ButtonView buttonView = new ButtonView(getContext(), 0, i);
        buttonView.setContentDescription(string);
        arrayList.add(buttonView);
        addView(buttonView);
        int i2 = R.drawable.msg_photo_sticker;
        String string2 = LocaleController.getString(R.string.AccDescrStickers);
        ButtonView buttonView2 = new ButtonView(getContext(), 2, i2);
        buttonView2.setContentDescription(string2);
        arrayList.add(buttonView2);
        addView(buttonView2);
        int i3 = R.drawable.msg_photo_text2;
        String string3 = LocaleController.getString(R.string.AccDescrPlaceText);
        ButtonView buttonView3 = new ButtonView(getContext(), 1, i3);
        buttonView3.setContentDescription(string3);
        arrayList.add(buttonView3);
        addView(buttonView3);
        int i4 = R.drawable.media_crop;
        String string4 = LocaleController.getString(R.string.Crop);
        ButtonView buttonView4 = new ButtonView(getContext(), 3, i4);
        buttonView4.setContentDescription(string4);
        arrayList.add(buttonView4);
        addView(buttonView4);
        int i5 = R.drawable.msg_photo_settings;
        String string5 = LocaleController.getString(R.string.AccDescrPhotoAdjust);
        ButtonView buttonView5 = new ButtonView(getContext(), 4, i5);
        buttonView5.setContentDescription(string5);
        arrayList.add(buttonView5);
        addView(buttonView5);
        int i6 = R.string.Send;
        String string6 = LocaleController.getString(i6);
        this.shareText = string6;
        this.shareArrow = true;
        ShareButtonView shareButtonView = new ShareButtonView(activity, string6, true);
        this.shareButton = shareButtonView;
        shareButtonView.setContentDescription(LocaleController.getString(i6));
        addView(this.shareButton, LayoutHelper.createFrame(-2, -2.0f));
        updateAppearT();
    }

    public final void appear(boolean z, boolean z2) {
        if (this.appearing == z) {
            return;
        }
        ValueAnimator valueAnimator = this.appearAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.appearing = z;
        if (!z2) {
            this.appearT = z ? 1.0f : 0.0f;
            updateAppearT();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.appearT, z ? 1.0f : 0.0f);
        this.appearAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new HintView2$$ExternalSyntheticLambda1(this, 6));
        if (this.appearing) {
            this.appearAnimator.setDuration(450L);
            this.appearAnimator.setInterpolator(new LinearInterpolator());
        } else {
            this.appearAnimator.setDuration(350L);
            this.appearAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        }
        this.appearAnimator.start();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ArrayList arrayList;
        float f;
        int iM$3;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.shadowView.layout(0, 0, i5, i6);
        ShareButtonView shareButtonView = this.shareButton;
        shareButtonView.layout(i5 - shareButtonView.getMeasuredWidth(), (i6 - this.shareButton.getMeasuredHeight()) / 2, i5, (this.shareButton.getMeasuredHeight() + i6) / 2);
        int iDp = (i5 - AndroidUtilities.dp(32.33f)) - this.shareButton.getMeasuredWidth();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            arrayList = this.buttons;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (((ButtonView) arrayList.get(i7)).getVisibility() == 0) {
                i8++;
            }
            i7++;
        }
        int iM$4 = i8 < 2 ? 0 : OKLCH.m$3(40.0f, i8, iDp) / (i8 - 1);
        int i9 = 0;
        while (true) {
            if (i9 < arrayList.size()) {
                ButtonView buttonView = (ButtonView) arrayList.get(i9);
                if (buttonView.id == 4) {
                    if (buttonView.getVisibility() == 0) {
                        f = 20.0f;
                        break;
                    }
                } else {
                    i9++;
                }
            }
            f = 30.0f;
            break;
        }
        int iMin = Math.min(AndroidUtilities.dp(f), iM$4);
        int iM$2 = OKLCH.m$2(40.0f, i6, 2);
        int iDp2 = (AndroidUtilities.dp(40.0f) + i6) / 2;
        int iDp3 = AndroidUtilities.dp(12.33f);
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                ButtonView buttonView2 = (ButtonView) arrayList.get(i10);
                if (buttonView2.id == 4) {
                    if (buttonView2.getVisibility() == 0) {
                        iM$3 = 0;
                        break;
                    }
                } else {
                    i10++;
                }
            }
            iM$3 = (OKLCH.m$3(40.0f, i8, iDp) - ((i8 - 1) * iMin)) / 2;
            break;
        }
        int iM = iDp3 + iM$3;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((ButtonView) arrayList.get(i11)).getVisibility() == 0) {
                ((ButtonView) arrayList.get(i11)).layout(iM, iM$2, AndroidUtilities.dp(40.0f) + iM, iDp2);
                iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(40.0f, iMin, iM);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }

    public void setOnClickListener(Utilities.Callback<Integer> callback) {
        this.onClickListener = callback;
    }

    public void setShareEnabled(boolean z) {
        if (this.isShareEnabled != z) {
            this.isShareEnabled = z;
            ShareButtonView shareButtonView = this.shareButton;
            shareButtonView.enabled = z;
            shareButtonView.invalidate();
        }
    }

    public final void updateAppearT() {
        float f = this.appearT;
        View view = this.shadowView;
        view.setAlpha(f);
        view.setTranslationY((1.0f - this.appearT) * AndroidUtilities.dp(16.0f));
        for (int i = 1; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            float interpolation = this.appearT;
            if (this.appearing) {
                interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(AndroidUtilities.cascade(interpolation, i - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(interpolation);
            childAt.setTranslationY((1.0f - interpolation) * AndroidUtilities.dp(24.0f));
        }
    }
}
