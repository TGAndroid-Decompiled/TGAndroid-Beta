package org.telegram.p009ui.Components.Paint.Views;

import android.annotation.SuppressLint;
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
import org.telegram.p009ui.Components.AnimatedFloat;
import org.telegram.p009ui.Components.Paint.RenderView;
import org.telegram.p009ui.Components.Paint.Swatch;

public class PaintWeightChooserView extends View {
    private AnimatedFloat animatedMax;
    private AnimatedFloat animatedMin;
    private AnimatedFloat animatedWeight;
    private Paint backgroundPaint;
    private Paint colorPaint;
    private Swatch colorSwatch;
    private boolean drawCenter;
    private int fromContentHeight;
    private GestureDetectorCompat gestureDetector;
    private float hideProgress;
    private boolean isPanTransitionInProgress;
    private boolean isTouchInProgress;
    private boolean isViewHidden;
    private long lastUpdate;
    private float max;
    private float min;
    private boolean minMaxSet;
    private int newContentHeight;
    private Runnable onUpdate;
    private float panProgress;
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
                boolean contains = PaintWeightChooserView.this.touchRect.contains(motionEvent.getX(), motionEvent.getY());
                if (PaintWeightChooserView.this.isTouchInProgress != contains) {
                    PaintWeightChooserView.this.isTouchInProgress = contains;
                    PaintWeightChooserView.this.invalidate();
                    if (contains) {
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
                    float clamp = MathUtils.clamp(this.startWeight + ((((motionEvent.getY() - motionEvent2.getY()) - this.startDeltaY) / PaintWeightChooserView.this.touchRect.height()) * (PaintWeightChooserView.this.max - PaintWeightChooserView.this.min)), PaintWeightChooserView.this.min, PaintWeightChooserView.this.max);
                    if (PaintWeightChooserView.this.valueOverride != null) {
                        PaintWeightChooserView.this.valueOverride.set(clamp);
                    } else {
                        PaintWeightChooserView.this.colorSwatch.brushWeight = clamp;
                    }
                    PaintWeightChooserView.this.animatedWeight.set(clamp, true);
                    PaintWeightChooserView.this.onUpdate.run();
                    PaintWeightChooserView.this.invalidate();
                }
                return PaintWeightChooserView.this.isTouchInProgress;
            }
        });
        this.colorPaint.setColor(-1);
        this.colorPaint.setShadowLayer(AndroidUtilities.m35dp(4.0f), 0.0f, AndroidUtilities.m35dp(2.0f), 1342177280);
        this.backgroundPaint.setColor(1090519039);
        this.backgroundPaint.setShadowLayer(AndroidUtilities.m35dp(3.0f), 0.0f, AndroidUtilities.m35dp(1.0f), 637534208);
    }

    public void setShowPreview(boolean z) {
        this.showPreview = z;
        invalidate();
    }

    public void setValueOverride(ValueOverride valueOverride) {
        this.valueOverride = valueOverride;
        invalidate();
    }

    public void startPanTransition(int i, int i2) {
        this.isPanTransitionInProgress = true;
        this.fromContentHeight = i;
        this.newContentHeight = i2;
        invalidate();
    }

    public void stopPanTransition() {
        this.isPanTransitionInProgress = false;
        invalidate();
    }

    public void updatePanTransition(float f, float f2) {
        if (this.isPanTransitionInProgress) {
            if (this.fromContentHeight < this.newContentHeight) {
                f2 = 1.0f - f2;
            }
            this.panProgress = f2;
            setTranslationY(f);
            int lerp = AndroidUtilities.lerp(this.fromContentHeight, this.newContentHeight, this.panProgress);
            int i = (int) (lerp * 0.3f);
            this.touchRect.set(0.0f, (lerp - i) / 2.0f, AndroidUtilities.m35dp(32.0f), (lerp + i) / 2.0f);
            invalidate();
        }
    }

    public void setRenderView(RenderView renderView) {
        this.renderView = renderView;
    }

    public void setColorSwatch(Swatch swatch) {
        this.colorSwatch = swatch;
        invalidate();
    }

    public void setDrawCenter(boolean z) {
        this.drawCenter = z;
        invalidate();
    }

    public void setMinMax(float f, float f2) {
        setMinMax(f, f2, true);
    }

    public void setMinMax(float f, float f2, boolean z) {
        Swatch swatch = this.colorSwatch;
        if (swatch != null && this.minMaxSet && z) {
            ValueOverride valueOverride = this.valueOverride;
            float f3 = valueOverride != null ? valueOverride.get() : swatch.brushWeight;
            float f4 = this.min;
            float clamp = MathUtils.clamp((((f3 - f4) / (this.max - f4)) * (f2 - f)) + f, f, f2);
            ValueOverride valueOverride2 = this.valueOverride;
            if (valueOverride2 != null) {
                valueOverride2.set(clamp);
            } else {
                this.colorSwatch.brushWeight = clamp;
            }
            Runnable runnable = this.onUpdate;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.min = f;
        this.max = f2;
        this.minMaxSet = true;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.onUpdate = runnable;
    }

    @Override
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.gestureDetector.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            this.isTouchInProgress = false;
            invalidate();
        }
        return onTouchEvent;
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.isPanTransitionInProgress) {
            return;
        }
        int height = (int) (getHeight() * 0.3f);
        this.touchRect.set(0.0f, (getHeight() - height) / 2.0f, AndroidUtilities.m35dp(32.0f), (getHeight() + height) / 2.0f);
    }

    public void setViewHidden(boolean z) {
        this.isViewHidden = z;
        invalidate();
    }

    @Override
    protected void onDraw(android.graphics.Canvas r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.Paint.Views.PaintWeightChooserView.onDraw(android.graphics.Canvas):void");
    }

    private void drawCircleWithShadow(Canvas canvas, float f, float f2, float f3, boolean z) {
        if (z) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((f - f3) - AndroidUtilities.m35dp(6.0f), (f2 - f3) - AndroidUtilities.m35dp(6.0f), f + f3 + AndroidUtilities.m35dp(6.0f), f2 + f3 + AndroidUtilities.m35dp(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.showProgress * 255.0f), 31);
        }
        canvas.drawCircle(f, f2, f3, this.colorPaint);
        if (z) {
            canvas.restore();
        }
    }
}
