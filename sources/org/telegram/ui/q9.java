package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraView;

public final class q9 extends ViewGroup {

    public final int f41544a = 0;

    public final Object f41545b;

    public final org.telegram.ui.ActionBar.n2 f41546c;

    public q9(t9 t9Var, Context context) {
        super(context);
        this.f41546c = t9Var;
        this.f41545b = new Path();
    }

    public static RectF a(int i10, int i11, int i12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        return rectF;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f41544a) {
            case 0:
                Path path = (Path) this.f41545b;
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                t9 t9Var = (t9) this.f41546c;
                Paint paint = t9Var.f42824n;
                Paint paint2 = t9Var.h;
                if (!t9Var.a0() || view != t9Var.f42821c) {
                    return zDrawChild;
                }
                float fMin = Math.min(1.0f, Math.max(0.0f, (SystemClock.elapsedRealtime() - t9Var.G) / 75.0f));
                if (fMin < 1.0f) {
                    t9Var.fragmentView.invalidate();
                }
                RectF rectF = t9Var.E;
                RectF rectF2 = t9Var.F;
                RectF rectF3 = AndroidUtilities.rectTmp;
                AndroidUtilities.lerp(rectF, rectF2, fMin, rectF3);
                if (t9Var.W < 1.0f) {
                    if (t9Var.X == null) {
                        t9Var.h0();
                    }
                    AndroidUtilities.lerp(t9Var.X, rectF3, t9Var.W, rectF3);
                }
                int iWidth = (int) (rectF3.width() * view.getWidth());
                int iHeight = (int) (rectF3.height() * view.getHeight());
                int iCenterX = (int) (rectF3.centerX() * view.getWidth());
                int iCenterY = (int) (rectF3.centerY() * view.getHeight());
                float f10 = t9Var.f42829y;
                float f11 = (f10 * 0.5f) + 0.5f;
                int i10 = (int) (iWidth * f11);
                int i11 = (int) (f11 * iHeight);
                int i12 = iCenterX - (i10 / 2);
                int i13 = iCenterY - (i11 / 2);
                paint2.setAlpha((int) ((1.0f - (Math.min(1.0f, f10) * (1.0f - t9Var.v))) * 255.0f));
                float f12 = i13;
                canvas.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), f12, paint2);
                int i14 = i13 + i11;
                float f13 = i14;
                canvas.drawRect(0.0f, f13, view.getMeasuredWidth(), view.getMeasuredHeight(), paint2);
                float f14 = i12;
                canvas.drawRect(0.0f, f12, f14, f13, paint2);
                int i15 = i12 + i10;
                float f15 = i15;
                canvas.drawRect(f15, f12, view.getMeasuredWidth(), f13, paint2);
                paint2.setAlpha((int) (Math.max(0.0f, 1.0f - t9Var.f42829y) * 255.0f));
                canvas.drawRect(f14, f12, f15, f13, paint2);
                int iLerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), Math.min(1.0f, t9Var.f42829y * 20.0f));
                int i16 = iLerp / 2;
                int iLerp2 = AndroidUtilities.lerp(Math.min(i10, i11), AndroidUtilities.dp(20.0f), Math.min(1.2f, (float) Math.pow(t9Var.f42829y, 1.7999999523162842d)));
                paint.setAlpha((int) (Math.min(1.0f, t9Var.f42829y) * 255.0f));
                path.reset();
                int i17 = i13 + iLerp2;
                path.arcTo(a(i12, i17, i16), 0.0f, 180.0f);
                float f16 = iLerp * 1.5f;
                int i18 = (int) (f14 + f16);
                int i19 = (int) (f12 + f16);
                int i20 = iLerp * 2;
                path.arcTo(a(i18, i19, i20), 180.0f, 90.0f);
                int i21 = i12 + iLerp2;
                path.arcTo(a(i21, i13, i16), 270.0f, 180.0f);
                path.lineTo(i12 + i16, i13 + i16);
                path.arcTo(a(i18, i19, iLerp), 270.0f, -90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                path.arcTo(a(i15, i17, i16), 180.0f, -180.0f);
                int i22 = (int) (f15 - f16);
                path.arcTo(a(i22, i19, i20), 0.0f, -90.0f);
                int i23 = i15 - iLerp2;
                path.arcTo(a(i23, i13, i16), 270.0f, -180.0f);
                path.arcTo(a(i22, i19, iLerp), 270.0f, 90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                int i24 = i14 - iLerp2;
                path.arcTo(a(i12, i24, i16), 0.0f, -180.0f);
                int i25 = (int) (f13 - f16);
                path.arcTo(a(i18, i25, i20), 180.0f, -90.0f);
                path.arcTo(a(i21, i14, i16), 90.0f, -180.0f);
                path.arcTo(a(i18, i25, iLerp), 90.0f, 90.0f);
                path.close();
                canvas.drawPath(path, paint);
                path.reset();
                path.arcTo(a(i15, i24, i16), 180.0f, 180.0f);
                path.arcTo(a(i22, i25, i20), 0.0f, 90.0f);
                path.arcTo(a(i23, i14, i16), 90.0f, 180.0f);
                path.arcTo(a(i22, i25, iLerp), 90.0f, -90.0f);
                path.close();
                canvas.drawPath(path, paint);
                return zDrawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        int iDp;
        switch (this.f41544a) {
            case 0:
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                t9 t9Var = (t9) this.f41546c;
                int i16 = t9Var.R;
                if (i16 == 0) {
                    CameraView cameraView = t9Var.f42821c;
                    if (cameraView != null) {
                        cameraView.layout(0, 0, cameraView.getMeasuredWidth(), t9Var.f42821c.getMeasuredHeight());
                    }
                    t9Var.f42823f.setTextSize(0, i15 / 22);
                    t9Var.f42823f.setPadding(0, 0, 0, i15 / 15);
                    int i17 = (int) (i15 * 0.65f);
                    t9Var.f42818a.layout(AndroidUtilities.dp(36.0f), i17, t9Var.f42818a.getMeasuredWidth() + AndroidUtilities.dp(36.0f), t9Var.f42818a.getMeasuredHeight() + i17);
                } else {
                    ((org.telegram.ui.ActionBar.n2) t9Var).actionBar.layout(0, 0, ((org.telegram.ui.ActionBar.n2) t9Var).actionBar.getMeasuredWidth(), ((org.telegram.ui.ActionBar.n2) t9Var).actionBar.getMeasuredHeight());
                    CameraView cameraView2 = t9Var.f42821c;
                    if (cameraView2 != null) {
                        cameraView2.layout(0, 0, cameraView2.getMeasuredWidth(), t9Var.f42821c.getMeasuredHeight());
                    }
                    int iMin = (int) (Math.min(i14, i15) / 1.5f);
                    if (i16 == 1) {
                        measuredHeight = ((i15 - iMin) / 2) - t9Var.f42818a.getMeasuredHeight();
                        iDp = AndroidUtilities.dp(30.0f);
                    } else {
                        measuredHeight = ((i15 - iMin) / 2) - t9Var.f42818a.getMeasuredHeight();
                        iDp = AndroidUtilities.dp(64.0f);
                    }
                    int i18 = measuredHeight - iDp;
                    t9Var.f42818a.layout(AndroidUtilities.dp(36.0f), i18, t9Var.f42818a.getMeasuredWidth() + AndroidUtilities.dp(36.0f), t9Var.f42818a.getMeasuredHeight() + i18);
                    if (i16 == 3) {
                        int iC = org.telegram.messenger.y1.C(8.0f, t9Var.f42818a.getMeasuredHeight(), i18);
                        t9Var.f42820b.layout(AndroidUtilities.dp(36.0f), iC, t9Var.f42820b.getMeasuredWidth() + AndroidUtilities.dp(36.0f), t9Var.f42820b.getMeasuredHeight() + iC);
                    }
                    t9Var.f42823f.layout(0, getMeasuredHeight() - t9Var.f42823f.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    int measuredWidth = (i14 / 2) - (t9Var.f42825r.getMeasuredWidth() / 2);
                    int iDp2 = AndroidUtilities.dp(80.0f) + i0.a.B(i15, iMin, 2, iMin);
                    ImageView imageView = t9Var.f42825r;
                    imageView.layout(measuredWidth, iDp2, imageView.getMeasuredWidth() + measuredWidth, t9Var.f42825r.getMeasuredHeight() + iDp2);
                }
                if (i16 != 3) {
                    int i19 = (int) (i15 * 0.74f);
                    int i20 = (int) (i14 * 0.05f);
                    TextView textView = t9Var.f42820b;
                    textView.layout(i20, i19, textView.getMeasuredWidth() + i20, t9Var.f42820b.getMeasuredHeight() + i19);
                }
                t9Var.h0();
                break;
            default:
                zf1 zf1Var = (zf1) this.f41546c;
                ((org.telegram.ui.ActionBar.n2) zf1Var).actionBar.layout(0, 0, ((org.telegram.ui.ActionBar.n2) zf1Var).actionBar.getMeasuredWidth(), ((org.telegram.ui.ActionBar.n2) zf1Var).actionBar.getMeasuredHeight());
                ag.t0 t0Var = zf1Var.f45177y;
                t0Var.layout(0, 0, t0Var.getMeasuredWidth(), zf1Var.f45177y.getMeasuredHeight());
                org.telegram.ui.Components.i90 i90Var = (org.telegram.ui.Components.i90) this.f41545b;
                i90Var.layout(0, 0, i90Var.getMeasuredWidth(), i90Var.getMeasuredHeight());
                break;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f41544a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                t9 t9Var = (t9) this.f41546c;
                ((org.telegram.ui.ActionBar.n2) t9Var).actionBar.measure(i10, i11);
                int i12 = t9Var.R;
                if (i12 == 0) {
                    CameraView cameraView = t9Var.f42821c;
                    if (cameraView != null) {
                        cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), 1073741824));
                    }
                } else {
                    CameraView cameraView2 = t9Var.f42821c;
                    if (cameraView2 != null) {
                        cameraView2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    t9Var.f42823f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    t9Var.f42825r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                }
                t9Var.f42818a.measure(org.telegram.messenger.rl.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                if (i12 == 3) {
                    t9Var.f42820b.measure(org.telegram.messenger.rl.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    t9Var.f42820b.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                zf1 zf1Var = (zf1) this.f41546c;
                ((org.telegram.ui.ActionBar.n2) zf1Var).actionBar.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                zf1Var.f45177y.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(3.0f) + ((org.telegram.ui.ActionBar.n2) zf1Var).actionBar.getMeasuredHeight(), 1073741824));
                ((org.telegram.ui.Components.i90) this.f41545b).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                setMeasuredDimension(size3, size4);
                break;
        }
    }

    public q9(zf1 zf1Var, Context context, org.telegram.ui.Components.i90 i90Var) {
        super(context);
        this.f41546c = zf1Var;
        this.f41545b = i90Var;
    }
}
