package org.telegram.p009ui.Components;

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
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0890R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;

public class SharedMediaFastScrollTooltip extends FrameLayout {
    public SharedMediaFastScrollTooltip(Context context) {
        super(context);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("SharedMediaFastScrollHint", C0890R.string.SharedMediaFastScrollHint));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTextColor(Theme.getColor("chat_gifSaveHintText"));
        setBackground(Theme.createRoundRectDrawable(AndroidUtilities.m34dp(6.0f), Theme.getColor("chat_gifSaveHintBackground")));
        addView(textView, LayoutHelper.createFrame(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        addView(new TooltipDrawableView(this, context), LayoutHelper.createFrame(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.m34dp(300.0f), View.MeasureSpec.getSize(i) - AndroidUtilities.m34dp(32.0f)), Integer.MIN_VALUE), i2);
    }

    private class TooltipDrawableView extends View {
        float toProgress;
        Random random = new Random();
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        float progress = 1.0f;
        float fromProgress = 0.0f;
        Paint fadePaint = new Paint();
        Paint fadePaintBack = new Paint();

        public TooltipDrawableView(SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip, Context context) {
            super(context);
            this.paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor("chat_gifSaveHintText"), 76));
            this.paint2.setColor(Theme.getColor("chat_gifSaveHintText"));
            this.fadePaint.setShader(new LinearGradient(0.0f, AndroidUtilities.m34dp(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.fadePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            this.fadePaintBack.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.m34dp(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            this.fadePaintBack.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            int measuredWidth = (getMeasuredWidth() / 2) - AndroidUtilities.m34dp(3.0f);
            int dp = ((AndroidUtilities.m34dp(1.0f) + measuredWidth) * 7) + AndroidUtilities.m34dp(1.0f);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
            float f = this.progress;
            float interpolation = cubicBezierInterpolator.getInterpolation(f > 0.4f ? (f - 0.4f) / 0.6f : 0.0f);
            float f2 = (this.fromProgress * (1.0f - interpolation)) + (this.toProgress * interpolation);
            canvas.save();
            canvas.translate(0.0f, (-(dp - (getMeasuredHeight() - AndroidUtilities.m34dp(4.0f)))) * f2);
            int i = 0;
            for (int i2 = 7; i < i2; i2 = 7) {
                int dp2 = AndroidUtilities.m34dp(3.0f) + ((AndroidUtilities.m34dp(1.0f) + measuredWidth) * i);
                RectF rectF = AndroidUtilities.rectTmp;
                float f3 = dp2;
                float f4 = dp2 + measuredWidth;
                rectF.set(0.0f, f3, measuredWidth, f4);
                canvas.drawRoundRect(rectF, AndroidUtilities.m34dp(2.0f), AndroidUtilities.m34dp(2.0f), this.paint);
                rectF.set(AndroidUtilities.m34dp(1.0f) + measuredWidth, f3, AndroidUtilities.m34dp(1.0f) + measuredWidth + measuredWidth, f4);
                canvas.drawRoundRect(rectF, AndroidUtilities.m34dp(2.0f), AndroidUtilities.m34dp(2.0f), this.paint);
                i++;
            }
            canvas.restore();
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.m34dp(4.0f), this.fadePaint);
            canvas.translate(0.0f, getMeasuredHeight() - AndroidUtilities.m34dp(4.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.m34dp(4.0f), this.fadePaintBack);
            canvas.restore();
            float dp3 = AndroidUtilities.m34dp(3.0f) + ((getMeasuredHeight() - AndroidUtilities.m34dp(21.0f)) * f2);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getMeasuredWidth() - AndroidUtilities.m34dp(3.0f), dp3, getMeasuredWidth(), AndroidUtilities.m34dp(15.0f) + dp3);
            canvas.drawRoundRect(rectF2, AndroidUtilities.m34dp(1.5f), AndroidUtilities.m34dp(1.5f), this.paint2);
            float centerY = rectF2.centerY();
            float dp4 = measuredWidth + AndroidUtilities.m34dp(0.5f);
            rectF2.set(dp4 - AndroidUtilities.m34dp(8.0f), centerY - AndroidUtilities.m34dp(3.0f), dp4 + AndroidUtilities.m34dp(8.0f), centerY + AndroidUtilities.m34dp(3.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.m34dp(3.0f), AndroidUtilities.m34dp(3.0f), this.paint2);
            float f5 = this.progress + 0.016f;
            this.progress = f5;
            if (f5 > 1.0f) {
                this.fromProgress = this.toProgress;
                float abs = Math.abs(this.random.nextInt() % 1001) / 1000.0f;
                this.toProgress = abs;
                if (abs > this.fromProgress) {
                    this.toProgress = abs + 0.3f;
                } else {
                    this.toProgress = abs - 0.3f;
                }
                this.toProgress = Math.max(0.0f, Math.min(1.0f, this.toProgress));
                this.progress = 0.0f;
            }
            invalidate();
        }
    }
}
