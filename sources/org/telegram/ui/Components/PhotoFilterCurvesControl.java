package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;

public final class PhotoFilterCurvesControl extends View {
    public int activeSegment;
    public final RectOld actualArea;
    public boolean checkForMoving;
    public final PhotoFilterView.CurvesToolValue curveValue;
    public PhotoFilterCurvesControlDelegate delegate;
    public boolean isMoving;
    public float lastY;
    public final Paint paint;
    public final Paint paintCurve;
    public final Paint paintDash;
    public final Path path;
    public final TextPaint textPaint;

    public interface PhotoFilterCurvesControlDelegate {
    }

    public PhotoFilterCurvesControl(Context context, PhotoFilterView.CurvesToolValue curvesToolValue) {
        super(context);
        this.activeSegment = 0;
        this.checkForMoving = true;
        this.actualArea = new RectOld();
        Paint paint = new Paint(1);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        this.paintDash = paint2;
        Paint paint3 = new Paint(1);
        this.paintCurve = paint3;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.path = new Path();
        setWillNotDraw(false);
        this.curveValue = curvesToolValue;
        paint.setColor(-1711276033);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setColor(-1711276033);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint3.setStyle(style);
        textPaint.setColor(-4210753);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void handlePan(int i, MotionEvent motionEvent) {
        PhotoFilterView.CurvesValue curvesValue;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (i == 1) {
            if (this.activeSegment != 0) {
                return;
            }
            RectOld rectOld = this.actualArea;
            this.activeSegment = (int) Math.floor(ImageReceiver$$ExternalSyntheticOutline0.m(x, rectOld.x, rectOld.width / 5.0f, 1.0f));
            return;
        }
        if (i != 2) {
            if ((i == 3 || i == 4 || i == 5) && this.activeSegment != 0) {
                this.activeSegment = 0;
                return;
            }
            return;
        }
        float fMin = Math.min(2.0f, (this.lastY - y) / 8.0f);
        PhotoFilterView.CurvesToolValue curvesToolValue = this.curveValue;
        int i2 = curvesToolValue.activeType;
        if (i2 == 0) {
            curvesValue = curvesToolValue.luminanceCurve;
        } else if (i2 == 1) {
            curvesValue = curvesToolValue.redCurve;
        } else if (i2 != 2) {
            curvesValue = i2 != 3 ? null : curvesToolValue.blueCurve;
        } else {
            curvesValue = curvesToolValue.greenCurve;
        }
        int i3 = this.activeSegment;
        if (i3 == 1) {
            curvesValue.blacksLevel = Math.max(0.0f, Math.min(100.0f, curvesValue.blacksLevel + fMin));
        } else if (i3 == 2) {
            curvesValue.shadowsLevel = Math.max(0.0f, Math.min(100.0f, curvesValue.shadowsLevel + fMin));
        } else if (i3 == 3) {
            curvesValue.midtonesLevel = Math.max(0.0f, Math.min(100.0f, curvesValue.midtonesLevel + fMin));
        } else if (i3 == 4) {
            curvesValue.highlightsLevel = Math.max(0.0f, Math.min(100.0f, curvesValue.highlightsLevel + fMin));
        } else if (i3 == 5) {
            curvesValue.whitesLevel = Math.max(0.0f, Math.min(100.0f, curvesValue.whitesLevel + fMin));
        }
        invalidate();
        PhotoFilterCurvesControlDelegate photoFilterCurvesControlDelegate = this.delegate;
        if (photoFilterCurvesControlDelegate != null) {
            PhotoFilterView photoFilterView = ((PhotoFilterView$$ExternalSyntheticLambda0) photoFilterCurvesControlDelegate).f$0;
            photoFilterView.updateFiltersEmpty();
            FilterGLThread filterGLThread = photoFilterView.eglThread;
            if (filterGLThread != null) {
                filterGLThread.requestRender(false, false, false);
            }
        }
        this.lastY = y;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        PhotoFilterView.CurvesValue curvesValue;
        String str;
        RectOld rectOld = this.actualArea;
        float f = rectOld.width / 5.0f;
        for (int i = 0; i < 4; i++) {
            float f2 = (i * f) + rectOld.x + f;
            float f3 = rectOld.y;
            canvas.drawLine(f2, f3, f2, f3 + rectOld.height, this.paint);
        }
        float f4 = rectOld.x;
        float f5 = rectOld.y;
        canvas.drawLine(f4, f5 + rectOld.height, f4 + rectOld.width, f5, this.paintDash);
        PhotoFilterView.CurvesToolValue curvesToolValue = this.curveValue;
        int i2 = curvesToolValue.activeType;
        int i3 = 3;
        Paint paint = this.paintCurve;
        if (i2 == 0) {
            paint.setColor(-1);
            curvesValue = curvesToolValue.luminanceCurve;
        } else if (i2 == 1) {
            paint.setColor(-1229492);
            curvesValue = curvesToolValue.redCurve;
        } else if (i2 == 2) {
            paint.setColor(-15667555);
            curvesValue = curvesToolValue.greenCurve;
        } else if (i2 != 3) {
            curvesValue = null;
        } else {
            paint.setColor(-13404165);
            curvesValue = curvesToolValue.blueCurve;
        }
        int i4 = 0;
        while (i4 < 5) {
            if (i4 == 0) {
                str = String.format(Locale.US, "%.2f", Float.valueOf(curvesValue.blacksLevel / 100.0f));
            } else if (i4 == 1) {
                str = String.format(Locale.US, "%.2f", Float.valueOf(curvesValue.shadowsLevel / 100.0f));
            } else if (i4 == 2) {
                str = String.format(Locale.US, "%.2f", Float.valueOf(curvesValue.midtonesLevel / 100.0f));
            } else if (i4 != i3) {
                str = i4 != 4 ? "" : String.format(Locale.US, "%.2f", Float.valueOf(curvesValue.whitesLevel / 100.0f));
            } else {
                str = String.format(Locale.US, "%.2f", Float.valueOf(curvesValue.highlightsLevel / 100.0f));
            }
            TextPaint textPaint = this.textPaint;
            canvas.drawText(str, (i4 * f) + ImageReceiver$$ExternalSyntheticOutline0.m(f, textPaint.measureText(str), 2.0f, rectOld.x), (rectOld.y + rectOld.height) - AndroidUtilities.dp(4.0f), textPaint);
            i4++;
            i3 = 3;
        }
        float[] fArrInterpolateCurve = curvesValue.interpolateCurve();
        invalidate();
        Path path = this.path;
        path.reset();
        for (int i5 = 0; i5 < fArrInterpolateCurve.length / 2; i5++) {
            if (i5 == 0) {
                int i6 = i5 * 2;
                path.moveTo((fArrInterpolateCurve[i6] * rectOld.width) + rectOld.x, ((1.0f - fArrInterpolateCurve[i6 + 1]) * rectOld.height) + rectOld.y);
            } else {
                int i7 = i5 * 2;
                path.lineTo((fArrInterpolateCurve[i7] * rectOld.width) + rectOld.x, ((1.0f - fArrInterpolateCurve[i7 + 1]) * rectOld.height) + rectOld.y);
            }
        }
        canvas.drawPath(path, paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.PhotoFilterCurvesControl.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(PhotoFilterCurvesControlDelegate photoFilterCurvesControlDelegate) {
        this.delegate = photoFilterCurvesControlDelegate;
    }
}
