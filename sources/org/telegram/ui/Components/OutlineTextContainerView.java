package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class OutlineTextContainerView extends FrameLayout {
    private static final int PADDING_LEFT = 14;
    private static final int PADDING_TEXT = 4;
    private static final float SPRING_MULTIPLIER = 100.0f;
    private EditText attachedEditText;
    private float errorProgress;
    private final SpringAnimation errorSpring;
    private boolean forceForceUseCenter;
    private boolean forceUseCenter;
    private boolean forceUseCenter2;
    private float leftPadding;
    private String mText;
    private final Paint outlinePaint;
    private final RectF rect;
    private final Theme.ResourcesProvider resourcesProvider;
    private float selectionProgress;
    private final SpringAnimation selectionSpring;
    private float strokeWidthRegular;
    private float strokeWidthSelected;
    private final TextPaint textPaint;
    private float titleProgress;
    private final SpringAnimation titleSpring;
    private static final SimpleFloatPropertyCompat<OutlineTextContainerView> SELECTION_PROGRESS_PROPERTY = new SimpleFloatPropertyCompat("selectionProgress", new EmojiView$$ExternalSyntheticLambda30(16), new EmojiView$$ExternalSyntheticLambda30(17)).setMultiplier(100.0f);
    private static final SimpleFloatPropertyCompat<OutlineTextContainerView> TITLE_PROGRESS_PROPERTY = new SimpleFloatPropertyCompat("titleProgress", new EmojiView$$ExternalSyntheticLambda30(18), new EmojiView$$ExternalSyntheticLambda30(19)).setMultiplier(100.0f);
    private static final SimpleFloatPropertyCompat<OutlineTextContainerView> ERROR_PROGRESS_PROPERTY = new SimpleFloatPropertyCompat("errorProgress", new EmojiView$$ExternalSyntheticLambda30(20), new EmojiView$$ExternalSyntheticLambda30(21)).setMultiplier(100.0f);

    public OutlineTextContainerView(Context context) {
        this(context, null);
    }

    private void animateSpring(SpringAnimation springAnimation, float f) {
        float f2 = f * 100.0f;
        SpringForce springForce = springAnimation.mSpring;
        if (springForce == null || f2 != ((float) springForce.mFinalPosition)) {
            springAnimation.cancel();
            SpringForce springForce2 = new SpringForce(f2);
            springForce2.setStiffness(500.0f);
            springForce2.setDampingRatio(1.0f);
            springForce2.mFinalPosition = f2;
            springAnimation.mSpring = springForce2;
            springAnimation.start();
        }
    }

    public static void lambda$static$1(OutlineTextContainerView outlineTextContainerView, float f) {
        outlineTextContainerView.selectionProgress = f;
        if (!outlineTextContainerView.forceUseCenter || outlineTextContainerView.forceForceUseCenter) {
            outlineTextContainerView.outlinePaint.setStrokeWidth(AndroidUtilities.lerp(outlineTextContainerView.strokeWidthRegular, outlineTextContainerView.strokeWidthSelected, f));
            outlineTextContainerView.updateColor();
        }
        outlineTextContainerView.invalidate();
    }

    public static void lambda$static$3(OutlineTextContainerView outlineTextContainerView, float f) {
        outlineTextContainerView.titleProgress = f;
        if (!outlineTextContainerView.forceUseCenter || outlineTextContainerView.forceForceUseCenter) {
            outlineTextContainerView.updateColor();
        }
        outlineTextContainerView.invalidate();
    }

    public static void lambda$static$5(OutlineTextContainerView outlineTextContainerView, float f) {
        outlineTextContainerView.errorProgress = f;
        outlineTextContainerView.updateColor();
    }

    private void setColor(int i) {
        this.outlinePaint.setColor(i);
        invalidate();
    }

    public void animateError(float f) {
        animateSpring(this.errorSpring, f);
    }

    public void animateSelection(boolean z) {
        animateSelection(z ? 1.0f : 0.0f, z ? 1.0f : 0.0f, true);
    }

    public void attachEditText(EditText editText) {
        this.attachedEditText = editText;
        invalidate();
    }

    public EditText getAttachedEditText() {
        return this.attachedEditText;
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        float paddingTop = getPaddingTop() + ((this.textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float textSize = (this.textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditText editText = this.attachedEditText;
        boolean z = (editText != null && editText.length() == 0 && TextUtils.isEmpty(this.attachedEditText.getHint())) || this.forceUseCenter || this.forceUseCenter2;
        if (z) {
            paddingTop = DiffUtil.m(1.0f, this.titleProgress, textSize - paddingTop, paddingTop);
        }
        float f2 = paddingTop;
        if (z) {
            f = (1.0f - this.titleProgress) * this.leftPadding;
        } else {
            f = 0.0f;
        }
        float strokeWidth = this.outlinePaint.getStrokeWidth();
        float fM = z ? DiffUtil.m(1.0f, this.titleProgress, 0.25f, 0.75f) : 0.75f;
        float fMeasureText = this.textPaint.measureText(this.mText) * fM;
        canvas.save();
        this.rect.set(AndroidUtilities.dp(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - AndroidUtilities.dp(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(this.rect, Region.Op.DIFFERENCE);
        this.rect.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.outlinePaint);
        canvas.restore();
        float fDp = AndroidUtilities.dp(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float f3 = (fMeasureText / 2.0f) + fDp;
        canvas.drawLine(((((fDp + fMeasureText) + AndroidUtilities.dp(10.0f)) - f3) * (z ? this.titleProgress : 1.0f)) + f3, paddingTop2, ((getWidth() - strokeWidth) - getPaddingRight()) - AndroidUtilities.dp(6.0f), paddingTop2, this.outlinePaint);
        float fDp2 = f3 + AndroidUtilities.dp(4.0f);
        canvas.drawLine(fDp, paddingTop2, ((fDp - fDp2) * (z ? this.titleProgress : 1.0f)) + fDp2, paddingTop2, this.outlinePaint);
        canvas.save();
        canvas.scale(fM, fM, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f2);
        canvas.drawText(this.mText, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f, f2, this.textPaint);
        canvas.restore();
    }

    public void setForceForceUseCenter(boolean z) {
        this.forceUseCenter = z;
        this.forceForceUseCenter = z;
        invalidate();
    }

    public void setForceUseCenter(boolean z) {
        this.forceUseCenter = z;
        invalidate();
    }

    public void setForceUseCenter2(boolean z) {
        this.forceUseCenter2 = z;
    }

    public void setLeftPadding(float f) {
        this.leftPadding = f;
        invalidate();
    }

    public void setText(String str) {
        this.mText = str;
        invalidate();
    }

    public void updateColor() {
        int iBlendARGB = ColorUtils.blendARGB((!this.forceUseCenter || this.forceForceUseCenter) ? this.titleProgress : 0.0f, Theme.getColor(Theme.key_windowBackgroundWhiteHintText, this.resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteValueText, this.resourcesProvider));
        TextPaint textPaint = this.textPaint;
        int i = Theme.key_text_RedBold;
        textPaint.setColor(ColorUtils.blendARGB(this.errorProgress, iBlendARGB, Theme.getColor(i, this.resourcesProvider)));
        setColor(ColorUtils.blendARGB(this.errorProgress, ColorUtils.blendARGB((!this.forceUseCenter || this.forceForceUseCenter) ? this.selectionProgress : 0.0f, Theme.getColor(Theme.key_windowBackgroundWhiteInputField, this.resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, this.resourcesProvider)), Theme.getColor(i, this.resourcesProvider)));
    }

    public OutlineTextContainerView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.rect = new RectF();
        this.mText = "";
        Paint paint = new Paint(1);
        this.outlinePaint = paint;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.selectionSpring = new SpringAnimation(this, SELECTION_PROGRESS_PROPERTY);
        this.titleSpring = new SpringAnimation(this, TITLE_PROGRESS_PROPERTY);
        this.errorSpring = new SpringAnimation(this, ERROR_PROGRESS_PROPERTY);
        this.strokeWidthRegular = Math.max(2, AndroidUtilities.dp(0.5f));
        this.strokeWidthSelected = AndroidUtilities.dp(1.6667f);
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.strokeWidthRegular);
        updateColor();
        setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
    }

    public void animateSelection(float f) {
        animateSelection(f, f, true);
    }

    public void animateSelection(float f, float f2) {
        animateSelection(f, f2, true);
    }

    public void animateSelection(boolean z, boolean z2) {
        animateSelection(z ? 1.0f : 0.0f, z2 ? 1.0f : 0.0f, true);
    }

    public void animateSelection(float f, boolean z) {
        animateSelection(f, f, z);
    }

    public void animateSelection(boolean z, boolean z2, boolean z3) {
        animateSelection(z ? 1.0f : 0.0f, z2 ? 1.0f : 0.0f, z3);
    }

    public void animateSelection(float f, float f2, boolean z) {
        if (!z) {
            this.selectionProgress = f;
            this.titleProgress = f2;
            if (!this.forceUseCenter) {
                Paint paint = this.outlinePaint;
                float f3 = this.strokeWidthRegular;
                paint.setStrokeWidth(((this.strokeWidthSelected - f3) * f) + f3);
            }
            updateColor();
            return;
        }
        animateSpring(this.selectionSpring, f);
        animateSpring(this.titleSpring, f2);
    }
}
