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
    public static final SimpleFloatPropertyCompat ERROR_PROGRESS_PROPERTY;
    public static final SimpleFloatPropertyCompat SELECTION_PROGRESS_PROPERTY;
    public static final SimpleFloatPropertyCompat TITLE_PROGRESS_PROPERTY;
    public EditTextBoldCursor attachedEditText;
    public float errorProgress;
    public final SpringAnimation errorSpring;
    public boolean forceForceUseCenter;
    public boolean forceUseCenter;
    public boolean forceUseCenter2;
    public float leftPadding;
    public String mText;
    public final Paint outlinePaint;
    public final RectF rect;
    public final Theme.ResourcesProvider resourcesProvider;
    public float selectionProgress;
    public final SpringAnimation selectionSpring;
    public final float strokeWidthRegular;
    public final float strokeWidthSelected;
    public final TextPaint textPaint;
    public float titleProgress;
    public final SpringAnimation titleSpring;

    static {
        SimpleFloatPropertyCompat simpleFloatPropertyCompat = new SimpleFloatPropertyCompat(new EmojiView$$ExternalSyntheticLambda21(29), new ShareAlert$$ExternalSyntheticLambda15(1));
        simpleFloatPropertyCompat.multiplier = 100.0f;
        SELECTION_PROGRESS_PROPERTY = simpleFloatPropertyCompat;
        SimpleFloatPropertyCompat simpleFloatPropertyCompat2 = new SimpleFloatPropertyCompat(new ShareAlert$$ExternalSyntheticLambda15(2), new ShareAlert$$ExternalSyntheticLambda15(3));
        simpleFloatPropertyCompat2.multiplier = 100.0f;
        TITLE_PROGRESS_PROPERTY = simpleFloatPropertyCompat2;
        SimpleFloatPropertyCompat simpleFloatPropertyCompat3 = new SimpleFloatPropertyCompat(new ShareAlert$$ExternalSyntheticLambda15(4), new ShareAlert$$ExternalSyntheticLambda15(5));
        simpleFloatPropertyCompat3.multiplier = 100.0f;
        ERROR_PROGRESS_PROPERTY = simpleFloatPropertyCompat3;
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
        float fMax = Math.max(2, AndroidUtilities.dp(0.5f));
        this.strokeWidthRegular = fMax;
        this.strokeWidthSelected = AndroidUtilities.dp(1.6667f);
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(fMax);
        updateColor();
        setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
    }

    public static void animateSpring(SpringAnimation springAnimation, float f) {
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

    private void setColor(int i) {
        this.outlinePaint.setColor(i);
        invalidate();
    }

    public final void animateSelection(boolean z, boolean z2) {
        animateSelection(z ? 1.0f : 0.0f, z2 ? 1.0f : 0.0f, true);
    }

    public EditText getAttachedEditText() {
        return this.attachedEditText;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        TextPaint textPaint = this.textPaint;
        float paddingTop = getPaddingTop() + ((textPaint.getTextSize() / 2.0f) - AndroidUtilities.dp(1.75f));
        float textSize = (textPaint.getTextSize() / 2.0f) + (getHeight() / 2.0f);
        EditTextBoldCursor editTextBoldCursor = this.attachedEditText;
        boolean z = (editTextBoldCursor != null && editTextBoldCursor.length() == 0 && TextUtils.isEmpty(this.attachedEditText.getHint())) || this.forceUseCenter || this.forceUseCenter2;
        if (z) {
            paddingTop = DiffUtil.m(1.0f, this.titleProgress, textSize - paddingTop, paddingTop);
        }
        float f2 = paddingTop;
        if (z) {
            f = (1.0f - this.titleProgress) * this.leftPadding;
        } else {
            f = 0.0f;
        }
        Paint paint = this.outlinePaint;
        float strokeWidth = paint.getStrokeWidth();
        float fM = z ? DiffUtil.m(1.0f, this.titleProgress, 0.25f, 0.75f) : 0.75f;
        float fMeasureText = textPaint.measureText(this.mText) * fM;
        canvas.save();
        RectF rectF = this.rect;
        rectF.set(AndroidUtilities.dp(10.0f) + getPaddingLeft(), getPaddingTop(), (getWidth() - AndroidUtilities.dp(18.0f)) - getPaddingRight(), (strokeWidth * 2.0f) + getPaddingTop());
        canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        rectF.set(getPaddingLeft() + strokeWidth, getPaddingTop() + strokeWidth, (getWidth() - strokeWidth) - getPaddingRight(), (getHeight() - strokeWidth) - getPaddingBottom());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        canvas.restore();
        float fDp = AndroidUtilities.dp(10.0f) + getPaddingLeft();
        float paddingTop2 = getPaddingTop() + strokeWidth;
        float f3 = (fMeasureText / 2.0f) + fDp;
        canvas.drawLine(((((fDp + fMeasureText) + AndroidUtilities.dp(10.0f)) - f3) * (z ? this.titleProgress : 1.0f)) + f3, paddingTop2, ((getWidth() - strokeWidth) - getPaddingRight()) - AndroidUtilities.dp(6.0f), paddingTop2, paint);
        float fDp2 = f3 + AndroidUtilities.dp(4.0f);
        canvas.drawLine(fDp, paddingTop2, ((fDp - fDp2) * (z ? this.titleProgress : 1.0f)) + fDp2, paddingTop2, paint);
        canvas.save();
        canvas.scale(fM, fM, AndroidUtilities.dp(18.0f) + getPaddingLeft(), f2);
        canvas.drawText(this.mText, AndroidUtilities.dp(14.0f) + getPaddingLeft() + f, f2, textPaint);
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

    public final void updateColor() {
        int i = Theme.key_windowBackgroundWhiteHintText;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int iBlendARGB = ColorUtils.blendARGB((!this.forceUseCenter || this.forceForceUseCenter) ? this.titleProgress : 0.0f, Theme.getColor(i, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteValueText, resourcesProvider));
        int i2 = Theme.key_text_RedBold;
        this.textPaint.setColor(ColorUtils.blendARGB(this.errorProgress, iBlendARGB, Theme.getColor(i2, resourcesProvider)));
        setColor(ColorUtils.blendARGB(this.errorProgress, ColorUtils.blendARGB((!this.forceUseCenter || this.forceForceUseCenter) ? this.selectionProgress : 0.0f, Theme.getColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider)), Theme.getColor(i2, resourcesProvider)));
    }

    public final void animateSelection(float f, float f2, boolean z) {
        if (z) {
            animateSpring(this.selectionSpring, f);
            animateSpring(this.titleSpring, f2);
            return;
        }
        this.selectionProgress = f;
        this.titleProgress = f2;
        if (!this.forceUseCenter) {
            Paint paint = this.outlinePaint;
            float f3 = this.strokeWidthSelected;
            float f4 = this.strokeWidthRegular;
            paint.setStrokeWidth(((f3 - f4) * f) + f4);
        }
        updateColor();
    }
}
