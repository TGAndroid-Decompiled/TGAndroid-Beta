package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.math.MathUtils;
import androidx.core.view.GestureDetectorCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.Swatch;

public class PaintWeightChooserView extends View {
    private AnimatedFloat animatedMax;
    private AnimatedFloat animatedMin;
    private AnimatedFloat animatedWeight;
    private Paint backgroundPaint;
    private Paint colorPaint;
    private Swatch colorSwatch;
    private boolean drawCenter;
    private GestureDetectorCompat gestureDetector;
    private float hideProgress;
    private boolean isPanTransitionInProgress;
    private boolean isTouchInProgress;
    private boolean isViewHidden;
    private long lastUpdate;
    private float max;
    private float min;
    private Runnable onUpdate;
    private Path path;
    private RenderView renderView;
    private boolean showPreview;
    private float showProgress;
    private RectF touchRect;
    private ValueOverride valueOverride;

    public interface ValueOverride {
        float get();

        void set(float f);
    }

    public PaintWeightChooserView(Context context) {
        super(context);
        this.backgroundPaint = new Paint(1);
        this.colorPaint = new Paint(1);
        this.path = new Path();
        this.touchRect = new RectF();
        this.showPreview = true;
        this.animatedWeight = new AnimatedFloat(this);
        this.animatedMin = new AnimatedFloat(this);
        this.animatedMax = new AnimatedFloat(this);
        this.colorSwatch = new Swatch(-1, 1.0f, 0.016773745f);
        this.drawCenter = true;
        this.gestureDetector = new GestureDetectorCompat(context, new GestureDetector.SimpleOnGestureListener() {
            float startDeltaY;
            float startWeight;
            boolean startedY;

            @Override
            public boolean onDown(MotionEvent motionEvent) {
                boolean zContains = PaintWeightChooserView.this.touchRect.contains(motionEvent.getX(), motionEvent.getY());
                if (PaintWeightChooserView.this.isTouchInProgress != zContains) {
                    PaintWeightChooserView.this.isTouchInProgress = zContains;
                    PaintWeightChooserView.this.invalidate();
                    if (zContains) {
                        this.startWeight = PaintWeightChooserView.this.valueOverride != null ? PaintWeightChooserView.this.valueOverride.get() : PaintWeightChooserView.this.colorSwatch.brushWeight;
                        this.startedY = false;
                    }
                }
                return PaintWeightChooserView.this.isTouchInProgress;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (PaintWeightChooserView.this.isTouchInProgress) {
                    if (!this.startedY) {
                        this.startDeltaY = motionEvent.getY() - motionEvent2.getY();
                        this.startedY = true;
                    }
                    float fClamp = MathUtils.clamp(this.startWeight + ((((motionEvent.getY() - motionEvent2.getY()) - this.startDeltaY) / PaintWeightChooserView.this.touchRect.height()) * (PaintWeightChooserView.this.max - PaintWeightChooserView.this.min)), PaintWeightChooserView.this.min, PaintWeightChooserView.this.max);
                    if (PaintWeightChooserView.this.valueOverride != null) {
                        PaintWeightChooserView.this.valueOverride.set(fClamp);
                    } else {
                        PaintWeightChooserView.this.colorSwatch.brushWeight = fClamp;
                    }
                    PaintWeightChooserView.this.animatedWeight.set(fClamp, true);
                    if (PaintWeightChooserView.this.onUpdate != null) {
                        PaintWeightChooserView.this.onUpdate.run();
                    }
                    PaintWeightChooserView.this.invalidate();
                }
                return PaintWeightChooserView.this.isTouchInProgress;
            }
        });
        this.colorPaint.setColor(-1);
        this.colorPaint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(2.0f), 1342177280);
        this.backgroundPaint.setColor(1090519039);
        this.backgroundPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 637534208);
    }

    public void setShowPreview(boolean z) {
        this.showPreview = z;
        invalidate();
    }

    public void setValueOverride(ValueOverride valueOverride) {
        this.valueOverride = valueOverride;
        invalidate();
    }

    public void stopPanTransition() {
        this.isPanTransitionInProgress = false;
        invalidate();
    }

    public void setRenderView(RenderView renderView) {
        this.renderView = renderView;
    }

    public void setColorSwatch(Swatch swatch) {
        this.colorSwatch = swatch;
        invalidate();
    }

    public void setBrushWeight(float f) {
        this.colorSwatch.brushWeight = f;
        invalidate();
    }

    public void setDrawCenter(boolean z) {
        this.drawCenter = z;
        invalidate();
    }

    public void setMinMax(float f, float f2) {
        this.min = f;
        this.max = f2;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.onUpdate = runnable;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = this.gestureDetector.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.isTouchInProgress = false;
            invalidate();
        }
        return zOnTouchEvent;
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.isPanTransitionInProgress) {
            return;
        }
        int height = (int) (getHeight() * 0.3f);
        this.touchRect.set(0.0f, (getHeight() - height) / 2.0f, AndroidUtilities.dp(32.0f), (getHeight() + height) / 2.0f);
    }

    public void setViewHidden(boolean z) {
        this.isViewHidden = z;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        long jMin = Math.min(16L, System.currentTimeMillis() - this.lastUpdate);
        this.lastUpdate = System.currentTimeMillis();
        AnimatedFloat animatedFloat = this.animatedWeight;
        ValueOverride valueOverride = this.valueOverride;
        float f3 = animatedFloat.set(valueOverride != null ? valueOverride.get() : this.colorSwatch.brushWeight);
        float f4 = this.animatedMin.set(this.min);
        float f5 = this.animatedMax.set(this.max);
        boolean z = this.isViewHidden;
        if (z) {
            float f6 = this.hideProgress;
            if (f6 != 1.0f) {
                this.hideProgress = Math.min(1.0f, f6 + (jMin / 200.0f));
                invalidate();
            } else if (!z) {
                f = this.hideProgress;
                if (f != 0.0f) {
                    this.hideProgress = Math.max(0.0f, f - (jMin / 200.0f));
                    invalidate();
                }
            }
        } else if (!z) {
            f = this.hideProgress;
            if (f != 0.0f) {
                this.hideProgress = Math.max(0.0f, f - (jMin / 200.0f));
                invalidate();
            }
        }
        boolean z2 = this.isTouchInProgress;
        if (z2) {
            float f7 = this.showProgress;
            if (f7 != 1.0f) {
                this.showProgress = Math.min(1.0f, f7 + (jMin / 200.0f));
                invalidate();
            } else if (!z2) {
                f2 = this.showProgress;
                if (f2 != 0.0f) {
                    this.showProgress = Math.max(0.0f, f2 - (jMin / 200.0f));
                    invalidate();
                }
            }
        } else if (!z2) {
            f2 = this.showProgress;
            if (f2 != 0.0f) {
                this.showProgress = Math.max(0.0f, f2 - (jMin / 200.0f));
                invalidate();
            }
        }
        float fHeight = this.touchRect.height();
        int iDp = AndroidUtilities.dp(16.0f);
        int iDp2 = AndroidUtilities.dp(3.0f);
        int iDp3 = AndroidUtilities.dp(3.0f);
        this.path.rewind();
        this.path.moveTo(0.0f, 0.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        int i = -iDp3;
        int i2 = -iDp;
        rectF.set(AndroidUtilities.lerp(i, i2, this.showProgress), 0.0f, AndroidUtilities.lerp(iDp3, iDp, this.showProgress), AndroidUtilities.lerp(iDp3, iDp, this.showProgress) * 2);
        this.path.arcTo(rectF, -90.0f, 90.0f);
        this.path.lineTo(AndroidUtilities.lerp(iDp3, iDp2, this.showProgress), fHeight);
        rectF.set(AndroidUtilities.lerp(i, -iDp2, this.showProgress), fHeight - (iDp2 * 2), AndroidUtilities.lerp(iDp3, iDp2, this.showProgress), fHeight);
        this.path.arcTo(rectF, 0.0f, 180.0f);
        float f8 = iDp;
        this.path.lineTo(AndroidUtilities.lerp(i, i2, this.showProgress), f8);
        rectF.set(AndroidUtilities.lerp(i, i2, this.showProgress), 0.0f, AndroidUtilities.lerp(iDp3, iDp, this.showProgress), iDp * 2);
        this.path.arcTo(rectF, -180.0f, 90.0f);
        this.path.close();
        if (this.hideProgress != 0.0f) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, (int) ((1.0f - this.hideProgress) * 255.0f), 31);
        }
        canvas.save();
        float fDp = AndroidUtilities.dp(32.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        canvas.translate(fDp * cubicBezierInterpolator.getInterpolation(this.showProgress), this.touchRect.top);
        canvas.drawPath(this.path, this.backgroundPaint);
        canvas.restore();
        float fDp2 = AndroidUtilities.dp(32.0f) * cubicBezierInterpolator.getInterpolation(this.showProgress);
        RectF rectF2 = this.touchRect;
        float f9 = (f3 - f4) / (f5 - f4);
        float fHeight2 = rectF2.top + (rectF2.height() * (1.0f - f9));
        RectF rectF3 = this.touchRect;
        float f10 = iDp2 * 1.5f;
        drawCircleWithShadow(canvas, fDp2, MathUtils.clamp(fHeight2, rectF3.top + f8, rectF3.bottom - Math.min(f10, f8)), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.lerp(Math.min(f10, f8), f8, f9), this.showProgress), false);
        if (this.drawCenter && this.showProgress != 0.0f && this.showPreview && this.renderView != null) {
            drawCircleWithShadow(canvas, getWidth() / 2.0f, getHeight() / 2.0f, this.renderView.brushWeightForSize(f3) * this.renderView.getCurrentBrush().getScale() * this.renderView.getCurrentBrush().getPreviewScale(), true);
        }
        if (this.hideProgress != 0.0f) {
            canvas.restore();
        }
    }

    private void drawCircleWithShadow(Canvas canvas, float f, float f2, float f3, boolean z) {
        if (z) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f - f3) - AndroidUtilities.dp(6.0f), (f2 - f3) - AndroidUtilities.dp(6.0f), f + f3 + AndroidUtilities.dp(6.0f), f2 + f3 + AndroidUtilities.dp(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.showProgress * 255.0f), 31);
        }
        canvas.drawCircle(f, f2, f3, this.colorPaint);
        if (z) {
            canvas.restore();
        }
    }
}
