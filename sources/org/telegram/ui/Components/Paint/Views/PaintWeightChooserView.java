package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.android.billingclient.api.zzcv;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.Swatch;

public final class PaintWeightChooserView extends View {
    public final AnimatedFloat animatedMax;
    public final AnimatedFloat animatedMin;
    public final AnimatedFloat animatedWeight;
    public final Paint backgroundPaint;
    public final Paint colorPaint;
    public Swatch colorSwatch;
    public boolean drawCenter;
    public final zzcv gestureDetector;
    public float hideProgress;
    public boolean isTouchInProgress;
    public boolean isViewHidden;
    public long lastUpdate;
    public float max;
    public float min;
    public Runnable onUpdate;
    public final Path path;
    public RenderView renderView;
    public boolean showPreview;
    public float showProgress;
    public final RectF touchRect;
    public ValueOverride valueOverride;

    public interface ValueOverride {
        float get();

        void set(float f);
    }

    public PaintWeightChooserView(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        this.colorPaint = paint2;
        this.path = new Path();
        this.touchRect = new RectF();
        this.showPreview = true;
        this.animatedWeight = new AnimatedFloat(this);
        this.animatedMin = new AnimatedFloat(this);
        this.animatedMax = new AnimatedFloat(this);
        this.colorSwatch = new Swatch(0.016773745f, -1);
        this.drawCenter = true;
        this.gestureDetector = new zzcv(context, new GestureDetector.SimpleOnGestureListener() {
            public float startDeltaY;
            public float startWeight;
            public boolean startedY;

            @Override
            public final boolean onDown(MotionEvent motionEvent) {
                PaintWeightChooserView paintWeightChooserView = PaintWeightChooserView.this;
                boolean zContains = paintWeightChooserView.touchRect.contains(motionEvent.getX(), motionEvent.getY());
                if (paintWeightChooserView.isTouchInProgress != zContains) {
                    paintWeightChooserView.isTouchInProgress = zContains;
                    paintWeightChooserView.invalidate();
                    if (zContains) {
                        ValueOverride valueOverride = paintWeightChooserView.valueOverride;
                        this.startWeight = valueOverride != null ? valueOverride.get() : paintWeightChooserView.colorSwatch.brushWeight;
                        this.startedY = false;
                    }
                }
                return paintWeightChooserView.isTouchInProgress;
            }

            @Override
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                PaintWeightChooserView paintWeightChooserView = PaintWeightChooserView.this;
                if (paintWeightChooserView.isTouchInProgress) {
                    if (!this.startedY) {
                        this.startDeltaY = motionEvent.getY() - motionEvent2.getY();
                        this.startedY = true;
                    }
                    float f3 = this.startWeight;
                    float y = ((motionEvent.getY() - motionEvent2.getY()) - this.startDeltaY) / paintWeightChooserView.touchRect.height();
                    float f4 = paintWeightChooserView.max;
                    float f5 = paintWeightChooserView.min;
                    float fClamp = MathUtils.clamp(DiffUtil.m(f4, f5, y, f3), f5, f4);
                    ValueOverride valueOverride = paintWeightChooserView.valueOverride;
                    if (valueOverride != null) {
                        valueOverride.set(fClamp);
                    } else {
                        paintWeightChooserView.colorSwatch.brushWeight = fClamp;
                    }
                    paintWeightChooserView.animatedWeight.set(fClamp, true);
                    Runnable runnable = paintWeightChooserView.onUpdate;
                    if (runnable != null) {
                        runnable.run();
                    }
                    paintWeightChooserView.invalidate();
                }
                return paintWeightChooserView.isTouchInProgress;
            }
        });
        paint2.setColor(-1);
        paint2.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, AndroidUtilities.dp(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 637534208);
    }

    public final void drawCircleWithShadow(float f, float f2, float f3, Canvas canvas, boolean z) {
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

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        long jMin = Math.min(16L, System.currentTimeMillis() - this.lastUpdate);
        this.lastUpdate = System.currentTimeMillis();
        ValueOverride valueOverride = this.valueOverride;
        float f3 = this.animatedWeight.set(valueOverride != null ? valueOverride.get() : this.colorSwatch.brushWeight, false);
        float f4 = this.animatedMin.set(this.min, false);
        float f5 = this.animatedMax.set(this.max, false);
        boolean z = this.isViewHidden;
        if (z) {
            float f6 = this.hideProgress;
            if (f6 != 1.0f) {
                this.hideProgress = Math.min(1.0f, (jMin / 200.0f) + f6);
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
                this.showProgress = Math.min(1.0f, (jMin / 200.0f) + f7);
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
        RectF rectF = this.touchRect;
        float fHeight = rectF.height();
        int iDp = AndroidUtilities.dp(16.0f);
        int iDp2 = AndroidUtilities.dp(3.0f);
        int iDp3 = AndroidUtilities.dp(3.0f);
        Path path = this.path;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        RectF rectF2 = AndroidUtilities.rectTmp;
        int i = -iDp3;
        int i2 = -iDp;
        rectF2.set(AndroidUtilities.lerp(i, i2, this.showProgress), 0.0f, AndroidUtilities.lerp(iDp3, iDp, this.showProgress), AndroidUtilities.lerp(iDp3, iDp, this.showProgress) * 2);
        path.arcTo(rectF2, -90.0f, 90.0f);
        path.lineTo(AndroidUtilities.lerp(iDp3, iDp2, this.showProgress), fHeight);
        rectF2.set(AndroidUtilities.lerp(i, -iDp2, this.showProgress), fHeight - (iDp2 * 2), AndroidUtilities.lerp(iDp3, iDp2, this.showProgress), fHeight);
        path.arcTo(rectF2, 0.0f, 180.0f);
        float f8 = iDp;
        path.lineTo(AndroidUtilities.lerp(i, i2, this.showProgress), f8);
        rectF2.set(AndroidUtilities.lerp(i, i2, this.showProgress), 0.0f, AndroidUtilities.lerp(iDp3, iDp, this.showProgress), iDp * 2);
        path.arcTo(rectF2, -180.0f, 90.0f);
        path.close();
        if (this.hideProgress != 0.0f) {
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF2, (int) ((1.0f - this.hideProgress) * 255.0f), 31);
        }
        canvas.save();
        float fDp = AndroidUtilities.dp(32.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        canvas.translate(cubicBezierInterpolator.getInterpolation(this.showProgress) * fDp, rectF.top);
        canvas.drawPath(path, this.backgroundPaint);
        canvas.restore();
        float f9 = (f3 - f4) / (f5 - f4);
        float f10 = iDp2 * 1.5f;
        drawCircleWithShadow(cubicBezierInterpolator.getInterpolation(this.showProgress) * AndroidUtilities.dp(32.0f), MathUtils.clamp(DiffUtil.m(1.0f, f9, rectF.height(), rectF.top), rectF.top + f8, rectF.bottom - Math.min(f10, f8)), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.lerp(Math.min(f10, f8), f8, f9), this.showProgress), canvas, false);
        if (this.drawCenter && this.showProgress != 0.0f && this.showPreview && this.renderView != null) {
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            RenderView renderView = this.renderView;
            float f11 = renderView.painting.size.width;
            drawCircleWithShadow(width, height, renderView.getCurrentBrush().getScale() * SurfaceContainer$$ExternalSyntheticOutline0.m(f11, 0.043945312f, f3, 0.00390625f * f11) * this.renderView.getCurrentBrush().getPreviewScale(), canvas, true);
        }
        if (this.hideProgress != 0.0f) {
            canvas.restore();
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int height = (int) (getHeight() * 0.3f);
        this.touchRect.set(0.0f, (getHeight() - height) / 2.0f, AndroidUtilities.dp(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = ((GestureDetector) this.gestureDetector.zza).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return zOnTouchEvent;
        }
        this.isTouchInProgress = false;
        invalidate();
        return zOnTouchEvent;
    }

    public void setBrushWeight(float f) {
        this.colorSwatch.brushWeight = f;
        invalidate();
    }

    public void setColorSwatch(Swatch swatch) {
        this.colorSwatch = swatch;
        invalidate();
    }

    public void setDrawCenter(boolean z) {
        this.drawCenter = z;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.onUpdate = runnable;
    }

    public void setRenderView(RenderView renderView) {
        this.renderView = renderView;
    }

    public void setShowPreview(boolean z) {
        this.showPreview = z;
        invalidate();
    }

    public void setValueOverride(ValueOverride valueOverride) {
        this.valueOverride = valueOverride;
        invalidate();
    }

    public void setViewHidden(boolean z) {
        this.isViewHidden = z;
        invalidate();
    }
}
