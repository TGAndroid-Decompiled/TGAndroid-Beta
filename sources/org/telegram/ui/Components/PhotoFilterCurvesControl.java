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

public class PhotoFilterCurvesControl extends View {
    private static final int CurvesSegmentBlacks = 1;
    private static final int CurvesSegmentHighlights = 4;
    private static final int CurvesSegmentMidtones = 3;
    private static final int CurvesSegmentNone = 0;
    private static final int CurvesSegmentShadows = 2;
    private static final int CurvesSegmentWhites = 5;
    private static final int GestureStateBegan = 1;
    private static final int GestureStateCancelled = 4;
    private static final int GestureStateChanged = 2;
    private static final int GestureStateEnded = 3;
    private static final int GestureStateFailed = 5;
    private int activeSegment;
    private RectOld actualArea;
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
        this.actualArea = new RectOld();
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
            photoFilterCurvesControlDelegate.valueChanged();
        }
        this.lastX = x;
        this.lastY = y;
    }

    private void selectSegmentWithPoint(float f) {
        if (this.activeSegment != 0) {
            return;
        }
        RectOld rectOld = this.actualArea;
        this.activeSegment = (int) Math.floor(ImageReceiver$$ExternalSyntheticOutline0.m(f, rectOld.x, rectOld.width / 5.0f, 1.0f));
    }

    private void unselectSegments() {
        if (this.activeSegment == 0) {
            return;
        }
        this.activeSegment = 0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        PhotoFilterView.CurvesValue curvesValue;
        String str;
        float f = this.actualArea.width / 5.0f;
        for (int i = 0; i < 4; i++) {
            RectOld rectOld = this.actualArea;
            float f2 = rectOld.x + f + (i * f);
            float f3 = rectOld.y;
            canvas.drawLine(f2, f3, f2, f3 + rectOld.height, this.paint);
        }
        RectOld rectOld2 = this.actualArea;
        float f4 = rectOld2.x;
        float f5 = rectOld2.y;
        canvas.drawLine(f4, rectOld2.height + f5, f4 + rectOld2.width, f5, this.paintDash);
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
        int i3 = 0;
        while (i3 < 5) {
            if (i3 == 0) {
                str = String.format(Locale.US, "%.2f", Float.valueOf(curvesValue.blacksLevel / 100.0f));
            } else if (i3 == 1) {
                str = String.format(Locale.US, "%.2f", Float.valueOf(curvesValue.shadowsLevel / 100.0f));
            } else if (i3 == 2) {
                str = String.format(Locale.US, "%.2f", Float.valueOf(curvesValue.midtonesLevel / 100.0f));
            } else if (i3 != 3) {
                str = i3 != 4 ? "" : String.format(Locale.US, "%.2f", Float.valueOf(curvesValue.whitesLevel / 100.0f));
            } else {
                str = String.format(Locale.US, "%.2f", Float.valueOf(curvesValue.highlightsLevel / 100.0f));
            }
            float fMeasureText = this.textPaint.measureText(str);
            RectOld rectOld3 = this.actualArea;
            canvas.drawText(str, (i3 * f) + ImageReceiver$$ExternalSyntheticOutline0.m(f, fMeasureText, 2.0f, rectOld3.x), (rectOld3.y + rectOld3.height) - AndroidUtilities.dp(4.0f), this.textPaint);
            i3++;
        }
        float[] fArrInterpolateCurve = curvesValue.interpolateCurve();
        invalidate();
        this.path.reset();
        for (int i4 = 0; i4 < fArrInterpolateCurve.length / 2; i4++) {
            if (i4 == 0) {
                Path path = this.path;
                RectOld rectOld4 = this.actualArea;
                int i5 = i4 * 2;
                path.moveTo((fArrInterpolateCurve[i5] * rectOld4.width) + rectOld4.x, ((1.0f - fArrInterpolateCurve[i5 + 1]) * rectOld4.height) + rectOld4.y);
            } else {
                Path path2 = this.path;
                RectOld rectOld5 = this.actualArea;
                int i6 = i4 * 2;
                path2.lineTo((fArrInterpolateCurve[i6] * rectOld5.width) + rectOld5.x, ((1.0f - fArrInterpolateCurve[i6 + 1]) * rectOld5.height) + rectOld5.y);
            }
        }
        canvas.drawPath(this.path, this.paintCurve);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x;
        float y;
        RectOld rectOld;
        float f;
        float f2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (motionEvent.getPointerCount() == 1) {
                if (this.checkForMoving && !this.isMoving) {
                    x = motionEvent.getX();
                    y = motionEvent.getY();
                    this.lastX = x;
                    this.lastY = y;
                    rectOld = this.actualArea;
                    f = rectOld.x;
                    if (x >= f && x <= f + rectOld.width) {
                        f2 = rectOld.y;
                        if (y >= f2 && y <= f2 + rectOld.height) {
                            this.isMoving = true;
                        }
                    }
                    this.checkForMoving = false;
                    if (this.isMoving) {
                        handlePan(1, motionEvent);
                    }
                }
            } else if (this.isMoving) {
                handlePan(3, motionEvent);
                this.checkForMoving = true;
                this.isMoving = false;
            }
        } else if (actionMasked == 1) {
            if (this.isMoving) {
                handlePan(3, motionEvent);
                this.isMoving = false;
            }
            this.checkForMoving = true;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.isMoving) {
                    handlePan(3, motionEvent);
                    this.isMoving = false;
                }
                this.checkForMoving = true;
            } else if (actionMasked != 5) {
                if (actionMasked == 6) {
                    if (this.isMoving) {
                        handlePan(3, motionEvent);
                        this.isMoving = false;
                    }
                    this.checkForMoving = true;
                }
            } else if (motionEvent.getPointerCount() == 1) {
                if (this.checkForMoving) {
                    x = motionEvent.getX();
                    y = motionEvent.getY();
                    this.lastX = x;
                    this.lastY = y;
                    rectOld = this.actualArea;
                    f = rectOld.x;
                    if (x >= f) {
                        f2 = rectOld.y;
                        if (y >= f2) {
                            this.isMoving = true;
                        }
                    }
                    this.checkForMoving = false;
                    if (this.isMoving) {
                        handlePan(1, motionEvent);
                    }
                }
            } else if (this.isMoving) {
                handlePan(3, motionEvent);
                this.checkForMoving = true;
                this.isMoving = false;
            }
        } else if (this.isMoving) {
            handlePan(2, motionEvent);
        }
        return true;
    }

    public void setActualArea(float f, float f2, float f3, float f4) {
        RectOld rectOld = this.actualArea;
        rectOld.x = f;
        rectOld.y = f2;
        rectOld.width = f3;
        rectOld.height = f4;
    }

    public void setDelegate(PhotoFilterCurvesControlDelegate photoFilterCurvesControlDelegate) {
        this.delegate = photoFilterCurvesControlDelegate;
    }
}
