package org.telegram.ui.Components;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.PhotoFilterView;

public class PhotoFilterCurvesControl extends View {
    private int activeSegment;
    private Rect actualArea;
    private boolean checkForMoving;
    private PhotoFilterView.CurvesToolValue curveValue;
    private PhotoFilterCurvesControlDelegate delegate;
    private boolean isMoving;
    private float lastX;
    private float lastY;
    private Paint paint;
    private Paint paintCurve;
    private Paint paintDash;
    private Path path;
    private TextPaint textPaint;

    public interface PhotoFilterCurvesControlDelegate {
        void valueChanged();
    }

    public PhotoFilterCurvesControl(Context context, PhotoFilterView.CurvesToolValue curvesToolValue) {
        super(context);
        this.activeSegment = 0;
        this.checkForMoving = true;
        this.actualArea = new Rect();
        this.paint = new Paint(1);
        this.paintDash = new Paint(1);
        this.paintCurve = new Paint(1);
        this.textPaint = new TextPaint(1);
        this.path = new Path();
        setWillNotDraw(false);
        this.curveValue = curvesToolValue;
        this.paint.setColor(-1711276033);
        this.paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        Paint paint = this.paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.paintDash.setColor(-1711276033);
        this.paintDash.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.paintDash.setStyle(style);
        this.paintCurve.setColor(-1);
        this.paintCurve.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.paintCurve.setStyle(style);
        this.textPaint.setColor(-4210753);
        this.textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public void setDelegate(PhotoFilterCurvesControlDelegate photoFilterCurvesControlDelegate) {
        this.delegate = photoFilterCurvesControlDelegate;
    }

    public void setActualArea(float f, float f2, float f3, float f4) {
        Rect rect = this.actualArea;
        rect.x = f;
        rect.y = f2;
        rect.width = f3;
        rect.height = f4;
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.PhotoFilterCurvesControl.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void handlePan(int i, MotionEvent motionEvent) {
        PhotoFilterView.CurvesValue curvesValue;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (i == 1) {
            selectSegmentWithPoint(x);
            return;
        }
        if (i != 2) {
            if (i == 3 || i == 4 || i == 5) {
                unselectSegments();
                return;
            }
            return;
        }
        float min = Math.min(2.0f, (this.lastY - y) / 8.0f);
        PhotoFilterView.CurvesToolValue curvesToolValue = this.curveValue;
        int i2 = curvesToolValue.activeType;
        if (i2 == 0) {
            curvesValue = curvesToolValue.luminanceCurve;
        } else if (i2 == 1) {
            curvesValue = curvesToolValue.redCurve;
        } else if (i2 == 2) {
            curvesValue = curvesToolValue.greenCurve;
        } else {
            curvesValue = i2 != 3 ? null : curvesToolValue.blueCurve;
        }
        int i3 = this.activeSegment;
        if (i3 == 1) {
            curvesValue.blacksLevel = Math.max(0.0f, Math.min(100.0f, curvesValue.blacksLevel + min));
        } else if (i3 == 2) {
            curvesValue.shadowsLevel = Math.max(0.0f, Math.min(100.0f, curvesValue.shadowsLevel + min));
        } else if (i3 == 3) {
            curvesValue.midtonesLevel = Math.max(0.0f, Math.min(100.0f, curvesValue.midtonesLevel + min));
        } else if (i3 == 4) {
            curvesValue.highlightsLevel = Math.max(0.0f, Math.min(100.0f, curvesValue.highlightsLevel + min));
        } else if (i3 == 5) {
            curvesValue.whitesLevel = Math.max(0.0f, Math.min(100.0f, curvesValue.whitesLevel + min));
        }
        invalidate();
        PhotoFilterCurvesControlDelegate photoFilterCurvesControlDelegate = this.delegate;
        if (photoFilterCurvesControlDelegate != null) {
            photoFilterCurvesControlDelegate.valueChanged();
        }
        this.lastX = x;
        this.lastY = y;
    }

    private void selectSegmentWithPoint(float f) {
        if (this.activeSegment != 0) {
            return;
        }
        Rect rect = this.actualArea;
        this.activeSegment = (int) Math.floor(((f - rect.x) / (rect.width / 5.0f)) + 1.0f);
    }

    private void unselectSegments() {
        if (this.activeSegment == 0) {
            return;
        }
        this.activeSegment = 0;
    }

    @Override
    @SuppressLint({"DrawAllocation"})
    protected void onDraw(Canvas canvas) {
        PhotoFilterView.CurvesValue curvesValue;
        String format;
        float f = this.actualArea.width / 5.0f;
        for (int i = 0; i < 4; i++) {
            Rect rect = this.actualArea;
            float f2 = rect.x + f + (i * f);
            float f3 = rect.y;
            canvas.drawLine(f2, f3, f2, f3 + rect.height, this.paint);
        }
        Rect rect2 = this.actualArea;
        float f4 = rect2.x;
        float f5 = rect2.y;
        canvas.drawLine(f4, f5 + rect2.height, f4 + rect2.width, f5, this.paintDash);
        int i2 = this.curveValue.activeType;
        if (i2 == 0) {
            this.paintCurve.setColor(-1);
            curvesValue = this.curveValue.luminanceCurve;
        } else if (i2 == 1) {
            this.paintCurve.setColor(-1229492);
            curvesValue = this.curveValue.redCurve;
        } else if (i2 == 2) {
            this.paintCurve.setColor(-15667555);
            curvesValue = this.curveValue.greenCurve;
        } else if (i2 != 3) {
            curvesValue = null;
        } else {
            this.paintCurve.setColor(-13404165);
            curvesValue = this.curveValue.blueCurve;
        }
        for (int i3 = 0; i3 < 5; i3++) {
            if (i3 == 0) {
                format = String.format(Locale.US, "%.2f", Float.valueOf(curvesValue.blacksLevel / 100.0f));
            } else if (i3 == 1) {
                format = String.format(Locale.US, "%.2f", Float.valueOf(curvesValue.shadowsLevel / 100.0f));
            } else if (i3 == 2) {
                format = String.format(Locale.US, "%.2f", Float.valueOf(curvesValue.midtonesLevel / 100.0f));
            } else if (i3 == 3) {
                format = String.format(Locale.US, "%.2f", Float.valueOf(curvesValue.highlightsLevel / 100.0f));
            } else if (i3 == 4) {
                format = String.format(Locale.US, "%.2f", Float.valueOf(curvesValue.whitesLevel / 100.0f));
            } else {
                format = "";
            }
            float measureText = this.textPaint.measureText(format);
            Rect rect3 = this.actualArea;
            canvas.drawText(format, rect3.x + ((f - measureText) / 2.0f) + (i3 * f), (rect3.y + rect3.height) - AndroidUtilities.dp(4.0f), this.textPaint);
        }
        float[] interpolateCurve = curvesValue.interpolateCurve();
        invalidate();
        this.path.reset();
        for (int i4 = 0; i4 < interpolateCurve.length / 2; i4++) {
            if (i4 == 0) {
                Path path = this.path;
                Rect rect4 = this.actualArea;
                int i5 = i4 * 2;
                path.moveTo(rect4.x + (interpolateCurve[i5] * rect4.width), rect4.y + ((1.0f - interpolateCurve[i5 + 1]) * rect4.height));
            } else {
                Path path2 = this.path;
                Rect rect5 = this.actualArea;
                int i6 = i4 * 2;
                path2.lineTo(rect5.x + (interpolateCurve[i6] * rect5.width), rect5.y + ((1.0f - interpolateCurve[i6 + 1]) * rect5.height));
            }
        }
        canvas.drawPath(this.path, this.paintCurve);
    }
}
