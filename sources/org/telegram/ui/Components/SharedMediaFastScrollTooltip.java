package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import com.google.android.gms.internal.mlkit_vision_label.zzcw;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;

public final class SharedMediaFastScrollTooltip extends FrameLayout {

    public final class TooltipDrawableView extends View {
        public final Paint fadePaint;
        public final Paint fadePaintBack;
        public float fromProgress;
        public final Paint paint;
        public final Paint paint2;
        public float progress;
        public final Random random;
        public float toProgress;

        public TooltipDrawableView(Context context) {
            super(context);
            this.random = new Random();
            Paint paint = new Paint(1);
            this.paint = paint;
            Paint paint2 = new Paint(1);
            this.paint2 = paint2;
            this.progress = 1.0f;
            this.fromProgress = 0.0f;
            int i = Theme.key_chat_gifSaveHintText;
            paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(null, i, false), 76));
            paint2.setColor(Theme.getColor(null, i, false));
            Paint paint3 = new Paint();
            this.fadePaint = paint3;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint3.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint3.setXfermode(new PorterDuffXfermode(mode));
            Paint paint4 = new Paint();
            this.fadePaintBack = paint4;
            paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
            paint4.setXfermode(new PorterDuffXfermode(mode));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.dp(3.0f);
            int iDp = AndroidUtilities.dp(1.0f) + ((AndroidUtilities.dp(1.0f) + measuredWidth) * 7);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
            float f = this.progress;
            float interpolation = cubicBezierInterpolator.getInterpolation(f > 0.4f ? (f - 0.4f) / 0.6f : 0.0f);
            float f2 = (this.toProgress * interpolation) + ((1.0f - interpolation) * this.fromProgress);
            canvas.save();
            canvas.translate(0.0f, (-RichMessageLayout$$ExternalSyntheticOutline1.m(getMeasuredHeight(), 4.0f, iDp)) * f2);
            int i = 0;
            for (int i2 = 7; i < i2; i2 = 7) {
                int iDp2 = ((AndroidUtilities.dp(1.0f) + measuredWidth) * i) + AndroidUtilities.dp(3.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f3 = iDp2;
                float f4 = iDp2 + measuredWidth;
                rectF.set(0.0f, f3, measuredWidth, f4);
                float fDp = AndroidUtilities.dp(2.0f);
                float fDp2 = AndroidUtilities.dp(2.0f);
                Paint paint = this.paint;
                canvas.drawRoundRect(rectF, fDp, fDp2, paint);
                rectF.set(AndroidUtilities.dp(1.0f) + measuredWidth, f3, RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(measuredWidth, 1.0f, measuredWidth), f4);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
                i++;
            }
            canvas.restore();
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.fadePaint);
            canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.dp(4.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(4.0f), this.fadePaintBack);
            canvas.restore();
            float measuredHeight = ((getMeasuredHeight() - AndroidUtilities.dp(21.0f)) * f2) + AndroidUtilities.dp(3.0f);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getMeasuredWidth() - AndroidUtilities.dp(3.0f), measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(15.0f) + measuredHeight);
            float fDp3 = AndroidUtilities.dp(1.5f);
            float fDp4 = AndroidUtilities.dp(1.5f);
            Paint paint2 = this.paint2;
            canvas.drawRoundRect(rectF2, fDp3, fDp4, paint2);
            float fCenterY = rectF2.centerY();
            float fDp5 = AndroidUtilities.dp(0.5f) + measuredWidth;
            rectF2.set(fDp5 - AndroidUtilities.dp(8.0f), fCenterY - AndroidUtilities.dp(3.0f), fDp5 + AndroidUtilities.dp(8.0f), fCenterY + AndroidUtilities.dp(3.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint2);
            float f5 = this.progress + 0.016f;
            this.progress = f5;
            if (f5 > 1.0f) {
                this.fromProgress = this.toProgress;
                float fM = zzcw.m(this.random, 1001) / 1000.0f;
                this.toProgress = fM;
                if (fM > this.fromProgress) {
                    this.toProgress = fM + 0.3f;
                } else {
                    this.toProgress = fM - 0.3f;
                }
                this.toProgress = Math.max(0.0f, Math.min(1.0f, this.toProgress));
                this.progress = 0.0f;
            }
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(300.0f), View.MeasureSpec.getSize(i) - AndroidUtilities.dp(32.0f)), Integer.MIN_VALUE), i2);
    }
}
