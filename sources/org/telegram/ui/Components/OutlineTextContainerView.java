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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
public class OutlineTextContainerView extends FrameLayout {
    private EditText attachedEditText;
    private float errorProgress;
    private SpringAnimation errorSpring;
    private boolean forceUseCenter;
    private String mText;
    private Paint outlinePaint;
    private RectF rect;
    private float selectionProgress;
    private SpringAnimation selectionSpring;
    private float strokeWidthRegular;
    private float strokeWidthSelected;
    private TextPaint textPaint;
    private static final SimpleFloatPropertyCompat<OutlineTextContainerView> SELECTION_PROGRESS_PROPERTY = new SimpleFloatPropertyCompat("selectionProgress", OutlineTextContainerView$$ExternalSyntheticLambda0.INSTANCE, OutlineTextContainerView$$ExternalSyntheticLambda2.INSTANCE).setMultiplier(100.0f);
    private static final SimpleFloatPropertyCompat<OutlineTextContainerView> ERROR_PROGRESS_PROPERTY = new SimpleFloatPropertyCompat("errorProgress", OutlineTextContainerView$$ExternalSyntheticLambda1.INSTANCE, OutlineTextContainerView$$ExternalSyntheticLambda3.INSTANCE).setMultiplier(100.0f);

    public static void lambda$static$1(OutlineTextContainerView outlineTextContainerView, float f) {
        outlineTextContainerView.selectionProgress = f;
        if (!outlineTextContainerView.forceUseCenter) {
            Paint paint = outlineTextContainerView.outlinePaint;
            float f2 = outlineTextContainerView.strokeWidthRegular;
            paint.setStrokeWidth(f2 + ((outlineTextContainerView.strokeWidthSelected - f2) * f));
            outlineTextContainerView.updateColor();
        }
        outlineTextContainerView.invalidate();
    }

    public static void lambda$static$3(OutlineTextContainerView outlineTextContainerView, float f) {
        outlineTextContainerView.errorProgress = f;
        outlineTextContainerView.updateColor();
    }

    public OutlineTextContainerView(Context context) {
        super(context);
        this.rect = new RectF();
        this.mText = "";
        this.outlinePaint = new Paint(1);
        this.textPaint = new TextPaint(1);
        this.selectionSpring = new SpringAnimation(this, SELECTION_PROGRESS_PROPERTY);
        this.errorSpring = new SpringAnimation(this, ERROR_PROGRESS_PROPERTY);
        this.strokeWidthRegular = Math.max(2, AndroidUtilities.dp(0.5f));
        this.strokeWidthSelected = AndroidUtilities.dp(1.5f);
        setWillNotDraw(false);
        this.textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.outlinePaint.setStyle(Paint.Style.STROKE);
        this.outlinePaint.setStrokeCap(Paint.Cap.ROUND);
        this.outlinePaint.setStrokeWidth(this.strokeWidthRegular);
        updateColor();
        setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
    }

    public void setForceUseCenter(boolean z) {
        this.forceUseCenter = z;
        invalidate();
    }

    public EditText getAttachedEditText() {
        return this.attachedEditText;
    }

    public void attachEditText(EditText editText) {
        this.attachedEditText = editText;
        invalidate();
    }

    public void setText(String str) {
        this.mText = str;
        invalidate();
    }

    private void setColor(int i) {
        this.outlinePaint.setColor(i);
        invalidate();
    }

    public void updateColor() {
        this.textPaint.setColor(ColorUtils.blendARGB(ColorUtils.blendARGB(Theme.getColor("windowBackgroundWhiteHintText"), Theme.getColor("windowBackgroundWhiteValueText"), this.forceUseCenter ? 0.0f : this.selectionProgress), Theme.getColor("text_RedBold"), this.errorProgress));
        setColor(ColorUtils.blendARGB(ColorUtils.blendARGB(Theme.getColor("windowBackgroundWhiteInputField"), Theme.getColor("windowBackgroundWhiteInputFieldActivated"), this.forceUseCenter ? 0.0f : this.selectionProgress), Theme.getColor("text_RedBold"), this.errorProgress));
    }

    public void animateSelection(float f) {
        animateSelection(f, true);
    }

    public void animateSelection(float f, boolean z) {
        if (!z) {
            this.selectionProgress = f;
            if (!this.forceUseCenter) {
                Paint paint = this.outlinePaint;
                float f2 = this.strokeWidthRegular;
                paint.setStrokeWidth(f2 + ((this.strokeWidthSelected - f2) * f));
            }
            updateColor();
            return;
        }
        animateSpring(this.selectionSpring, f);
    }

    public void animateError(float f) {
        animateSpring(this.errorSpring, f);
    }

    private void animateSpring(SpringAnimation springAnimation, float f) {
        float f2 = f * 100.0f;
        if (springAnimation.getSpring() == null || f2 != springAnimation.getSpring().getFinalPosition()) {
            springAnimation.cancel();
            springAnimation.setSpring(new SpringForce(f2).setStiffness(500.0f).setDampingRatio(1.0f).setFinalPosition(f2)).start();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingTop = getPaddingTop() + ((this.textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float height = (getHeight() / 2.0f) + (this.textPaint.getTextSize() / 2.0f);
        EditText editText = this.attachedEditText;
        boolean z = (editText != null && editText.length() == 0 && TextUtils.isEmpty(this.attachedEditText.getHint())) || this.forceUseCenter;
        if (z) {
            paddingTop += (height - paddingTop) * (1.0f - this.selectionProgress);
        }
        float f = paddingTop;
        float strokeWidth = this.outlinePaint.getStrokeWidth();
        float f2 = z ? 0.75f + ((1.0f - this.selectionProgress) * 0.25f) : 0.75f;
        float measureText = this.textPaint.measureText(this.mText) * f2;
        canvas.save();
        this.rect.set(getPaddingLeft() + AndroidUtilities.dp(10.0f), getPaddingTop(), (getWidth() - AndroidUtilities.dp(18.0f)) - getPaddingRight(), getPaddingTop() + (strokeWidth * 2.0f));
        canvas.clipRect(this.rect, Region.Op.DIFFERENCE);
        this.rect.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.outlinePaint);
        canvas.restore();
        float paddingLeft = getPaddingLeft() + AndroidUtilities.dp(10.0f);
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float f3 = paddingLeft + (measureText / 2.0f);
        canvas.drawLine(f3 + ((((paddingLeft + measureText) + AndroidUtilities.dp(10.0f)) - f3) * (z ? this.selectionProgress : 1.0f)), paddingTop2, ((getWidth() - strokeWidth) - getPaddingRight()) - AndroidUtilities.dp(6.0f), paddingTop2, this.outlinePaint);
        float dp = f3 + AndroidUtilities.dp(4.0f);
        canvas.drawLine(paddingLeft, paddingTop2, dp + ((paddingLeft - dp) * (z ? this.selectionProgress : 1.0f)), paddingTop2, this.outlinePaint);
        canvas.save();
        canvas.scale(f2, f2, getPaddingLeft() + AndroidUtilities.dp(18.0f), f);
        canvas.drawText(this.mText, getPaddingLeft() + AndroidUtilities.dp(14.0f), f, this.textPaint);
        canvas.restore();
    }
}
