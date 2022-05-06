package org.telegram.ui.Components.Premium;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;

public class PremiumButtonView extends FrameLayout {
    public TextView buttonTextView;
    private boolean inc;
    private int lastW;
    ValueAnimator overlayAnimator;
    private float overlayProgress;
    public TextView overlayTextView;
    private float progress;
    private Shader shader;
    private boolean showOverlay;
    private Paint paint = new Paint(1);
    private Paint paintOverlayPaint = new Paint(1);
    private Matrix matrix = new Matrix();
    Path path = new Path();

    public PremiumButtonView(Context context, boolean z) {
        super(context);
        TextView textView = new TextView(context);
        this.buttonTextView = textView;
        textView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.buttonTextView.setGravity(17);
        this.buttonTextView.setTextColor(-1);
        this.buttonTextView.setTextSize(1, 14.0f);
        this.buttonTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.buttonTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), 0, ColorUtils.setAlphaComponent(-1, 120)));
        addView(this.buttonTextView);
        if (z) {
            TextView textView2 = new TextView(context);
            this.overlayTextView = textView2;
            textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            this.overlayTextView.setGravity(17);
            this.overlayTextView.setTextColor(-1);
            this.overlayTextView.setTextSize(1, 14.0f);
            this.overlayTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.overlayTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), 0, ColorUtils.setAlphaComponent(-1, 120)));
            addView(this.overlayTextView);
            this.paintOverlayPaint.setColor(Theme.getColor("featuredStickers_addButton"));
            updateOverlayProgress();
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.lastW != getMeasuredWidth()) {
            this.lastW = getMeasuredWidth();
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9015575, -1026983, -1792170}, (float[]) null, Shader.TileMode.CLAMP);
            this.shader = linearGradient;
            this.paint.setShader(linearGradient);
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (this.shader != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            if (this.overlayProgress != 1.0f) {
                this.shader.setLocalMatrix(this.matrix);
                Matrix matrix = this.matrix;
                double measuredWidth = getMeasuredWidth();
                Double.isNaN(measuredWidth);
                double d = this.progress;
                Double.isNaN(d);
                matrix.setTranslate((float) (measuredWidth * 0.1d * d), 0.0f);
                if (this.inc) {
                    float f = this.progress + 0.016f;
                    this.progress = f;
                    if (f > 3.0f) {
                        this.inc = false;
                    }
                } else {
                    float f2 = this.progress - 0.016f;
                    this.progress = f2;
                    if (f2 < 1.0f) {
                        this.inc = true;
                    }
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.paint);
                invalidate();
            }
            float f3 = this.overlayProgress;
            if (f3 != 0.0f) {
                this.paintOverlayPaint.setAlpha((int) (f3 * 255.0f));
                if (this.overlayProgress != 1.0f) {
                    this.path.rewind();
                    this.path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.max(getMeasuredWidth(), getMeasuredHeight()) * 1.4f * this.overlayProgress, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(this.path);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.paintOverlayPaint);
                    canvas.restore();
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.paintOverlayPaint);
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public void setOverlayText(String str) {
        this.showOverlay = true;
        this.overlayTextView.setText(str);
        updateOverlay();
    }

    private void updateOverlay() {
        ValueAnimator valueAnimator = this.overlayAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.overlayAnimator.cancel();
        }
        float[] fArr = new float[2];
        fArr[0] = this.overlayProgress;
        fArr[1] = this.showOverlay ? 1.0f : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.overlayAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                PremiumButtonView.this.overlayProgress = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                PremiumButtonView.this.updateOverlayProgress();
            }
        });
        this.overlayAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PremiumButtonView premiumButtonView = PremiumButtonView.this;
                premiumButtonView.overlayProgress = premiumButtonView.showOverlay ? 1.0f : 0.0f;
                PremiumButtonView.this.updateOverlayProgress();
            }
        });
        this.overlayAnimator.setDuration(250L);
        this.overlayAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.overlayAnimator.start();
    }

    public void updateOverlayProgress() {
        this.overlayTextView.setAlpha(this.overlayProgress);
        this.overlayTextView.setTranslationY(AndroidUtilities.dp(12.0f) * (1.0f - this.overlayProgress));
        this.buttonTextView.setAlpha(1.0f - this.overlayProgress);
        this.buttonTextView.setTranslationY((-AndroidUtilities.dp(12.0f)) * this.overlayProgress);
        int i = 8;
        this.buttonTextView.setVisibility(this.overlayProgress == 1.0f ? 8 : 0);
        TextView textView = this.overlayTextView;
        if (this.overlayProgress != 0.0f) {
            i = 0;
        }
        textView.setVisibility(i);
        invalidate();
    }

    public void clearOverlayText() {
        this.showOverlay = false;
        updateOverlay();
    }
}
