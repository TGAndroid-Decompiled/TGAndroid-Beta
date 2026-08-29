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
public final class o9 extends ViewGroup {
    public final int f41008a = 1;
    public final Object f41009b;
    public final org.telegram.ui.ActionBar.o2 f41010c;

    public o9(r9 r9Var, Context context) {
        super(context);
        this.f41010c = r9Var;
        this.f41009b = new Path();
    }

    public static RectF a(int i10, int i11, int i12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        return rectF;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f41008a) {
            case 0:
                Path path = (Path) this.f41009b;
                boolean drawChild = super.drawChild(canvas, view, j10);
                r9 r9Var = (r9) this.f41010c;
                Paint paint = r9Var.f42006n;
                Paint paint2 = r9Var.h;
                if (r9Var.a0() && view == r9Var.f42003c) {
                    float min = Math.min(1.0f, Math.max(0.0f, ((float) (SystemClock.elapsedRealtime() - r9Var.G)) / 75.0f));
                    if (min < 1.0f) {
                        r9Var.fragmentView.invalidate();
                    }
                    RectF rectF = r9Var.E;
                    RectF rectF2 = r9Var.F;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    AndroidUtilities.lerp(rectF, rectF2, min, rectF3);
                    if (r9Var.W < 1.0f) {
                        if (r9Var.X == null) {
                            r9Var.h0();
                        }
                        AndroidUtilities.lerp(r9Var.X, rectF3, r9Var.W, rectF3);
                    }
                    int width = (int) (rectF3.width() * view.getWidth());
                    int height = (int) (rectF3.height() * view.getHeight());
                    int centerX = (int) (rectF3.centerX() * view.getWidth());
                    float centerY = rectF3.centerY();
                    float f9 = r9Var.f42011y;
                    float f10 = (f9 * 0.5f) + 0.5f;
                    int i10 = (int) (width * f10);
                    int i11 = (int) (f10 * height);
                    int i12 = centerX - (i10 / 2);
                    int height2 = ((int) (centerY * view.getHeight())) - (i11 / 2);
                    paint2.setAlpha((int) ((1.0f - (Math.min(1.0f, f9) * (1.0f - r9Var.v))) * 255.0f));
                    float f11 = height2;
                    canvas.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), f11, paint2);
                    int i13 = height2 + i11;
                    float f12 = i13;
                    canvas.drawRect(0.0f, f12, view.getMeasuredWidth(), view.getMeasuredHeight(), paint2);
                    float f13 = i12;
                    canvas.drawRect(0.0f, f11, f13, f12, paint2);
                    int i14 = i12 + i10;
                    float f14 = i14;
                    canvas.drawRect(f14, f11, view.getMeasuredWidth(), f12, paint2);
                    paint2.setAlpha((int) (Math.max(0.0f, 1.0f - r9Var.f42011y) * 255.0f));
                    canvas.drawRect(f13, f11, f14, f12, paint2);
                    int lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), Math.min(1.0f, r9Var.f42011y * 20.0f));
                    int i15 = lerp / 2;
                    int lerp2 = AndroidUtilities.lerp(Math.min(i10, i11), AndroidUtilities.dp(20.0f), Math.min(1.2f, (float) Math.pow(r9Var.f42011y, 1.7999999523162842d)));
                    paint.setAlpha((int) (Math.min(1.0f, r9Var.f42011y) * 255.0f));
                    path.reset();
                    int i16 = height2 + lerp2;
                    path.arcTo(a(i12, i16, i15), 0.0f, 180.0f);
                    float f15 = lerp * 1.5f;
                    int i17 = (int) (f13 + f15);
                    int i18 = (int) (f11 + f15);
                    int i19 = lerp * 2;
                    path.arcTo(a(i17, i18, i19), 180.0f, 90.0f);
                    int i20 = i12 + lerp2;
                    path.arcTo(a(i20, height2, i15), 270.0f, 180.0f);
                    path.lineTo(i12 + i15, height2 + i15);
                    path.arcTo(a(i17, i18, lerp), 270.0f, -90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    path.arcTo(a(i14, i16, i15), 180.0f, -180.0f);
                    int i21 = (int) (f14 - f15);
                    path.arcTo(a(i21, i18, i19), 0.0f, -90.0f);
                    int i22 = i14 - lerp2;
                    path.arcTo(a(i22, height2, i15), 270.0f, -180.0f);
                    path.arcTo(a(i21, i18, lerp), 270.0f, 90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    int i23 = i13 - lerp2;
                    path.arcTo(a(i12, i23, i15), 0.0f, -180.0f);
                    int i24 = (int) (f12 - f15);
                    path.arcTo(a(i17, i24, i19), 180.0f, -90.0f);
                    path.arcTo(a(i20, i13, i15), 90.0f, -180.0f);
                    path.arcTo(a(i17, i24, lerp), 90.0f, 90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    path.arcTo(a(i14, i23, i15), 180.0f, 180.0f);
                    path.arcTo(a(i21, i24, i19), 0.0f, 90.0f);
                    path.arcTo(a(i22, i13, i15), 90.0f, 180.0f);
                    path.arcTo(a(i21, i24, lerp), 90.0f, -90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    return drawChild;
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        int measuredHeight;
        int dp;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        switch (this.f41008a) {
            case 0:
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                r9 r9Var = (r9) this.f41010c;
                int i16 = r9Var.R;
                if (i16 != 0) {
                    lVar = ((org.telegram.ui.ActionBar.o2) r9Var).actionBar;
                    lVar2 = ((org.telegram.ui.ActionBar.o2) r9Var).actionBar;
                    int measuredWidth = lVar2.getMeasuredWidth();
                    lVar3 = ((org.telegram.ui.ActionBar.o2) r9Var).actionBar;
                    lVar.layout(0, 0, measuredWidth, lVar3.getMeasuredHeight());
                    CameraView cameraView = r9Var.f42003c;
                    if (cameraView != null) {
                        cameraView.layout(0, 0, cameraView.getMeasuredWidth(), r9Var.f42003c.getMeasuredHeight());
                    }
                    int min = (int) (Math.min(i14, i15) / 1.5f);
                    if (i16 == 1) {
                        measuredHeight = ((i15 - min) / 2) - r9Var.f42000a.getMeasuredHeight();
                        dp = AndroidUtilities.dp(30.0f);
                    } else {
                        measuredHeight = ((i15 - min) / 2) - r9Var.f42000a.getMeasuredHeight();
                        dp = AndroidUtilities.dp(64.0f);
                    }
                    int i17 = measuredHeight - dp;
                    r9Var.f42000a.layout(AndroidUtilities.dp(36.0f), i17, r9Var.f42000a.getMeasuredWidth() + AndroidUtilities.dp(36.0f), r9Var.f42000a.getMeasuredHeight() + i17);
                    if (i16 == 3) {
                        int C = org.telegram.messenger.x3.C(8.0f, r9Var.f42000a.getMeasuredHeight(), i17);
                        r9Var.f42002b.layout(AndroidUtilities.dp(36.0f), C, r9Var.f42002b.getMeasuredWidth() + AndroidUtilities.dp(36.0f), r9Var.f42002b.getMeasuredHeight() + C);
                    }
                    r9Var.f42005f.layout(0, getMeasuredHeight() - r9Var.f42005f.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    int measuredWidth2 = (i14 / 2) - (r9Var.f42007r.getMeasuredWidth() / 2);
                    int dp2 = AndroidUtilities.dp(80.0f) + j7.l1.e(i15, min, 2, min);
                    ImageView imageView = r9Var.f42007r;
                    imageView.layout(measuredWidth2, dp2, imageView.getMeasuredWidth() + measuredWidth2, r9Var.f42007r.getMeasuredHeight() + dp2);
                } else {
                    CameraView cameraView2 = r9Var.f42003c;
                    if (cameraView2 != null) {
                        cameraView2.layout(0, 0, cameraView2.getMeasuredWidth(), r9Var.f42003c.getMeasuredHeight());
                    }
                    r9Var.f42005f.setTextSize(0, i15 / 22);
                    r9Var.f42005f.setPadding(0, 0, 0, i15 / 15);
                    int i18 = (int) (i15 * 0.65f);
                    r9Var.f42000a.layout(AndroidUtilities.dp(36.0f), i18, r9Var.f42000a.getMeasuredWidth() + AndroidUtilities.dp(36.0f), r9Var.f42000a.getMeasuredHeight() + i18);
                }
                if (i16 != 3) {
                    int i19 = (int) (i15 * 0.74f);
                    int i20 = (int) (i14 * 0.05f);
                    TextView textView = r9Var.f42002b;
                    textView.layout(i20, i19, textView.getMeasuredWidth() + i20, r9Var.f42002b.getMeasuredHeight() + i19);
                }
                r9Var.h0();
                return;
            default:
                cg1 cg1Var = (cg1) this.f41010c;
                lVar4 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
                lVar5 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
                int measuredWidth3 = lVar5.getMeasuredWidth();
                lVar6 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
                lVar4.layout(0, 0, measuredWidth3, lVar6.getMeasuredHeight());
                cg.i0 i0Var = cg1Var.f37120y;
                i0Var.layout(0, 0, i0Var.getMeasuredWidth(), cg1Var.f37120y.getMeasuredHeight());
                org.telegram.ui.Components.s90 s90Var = (org.telegram.ui.Components.s90) this.f41009b;
                s90Var.layout(0, 0, s90Var.getMeasuredWidth(), s90Var.getMeasuredHeight());
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        switch (this.f41008a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                r9 r9Var = (r9) this.f41010c;
                lVar = ((org.telegram.ui.ActionBar.o2) r9Var).actionBar;
                lVar.measure(i10, i11);
                int i12 = r9Var.R;
                if (i12 == 0) {
                    CameraView cameraView = r9Var.f42003c;
                    if (cameraView != null) {
                        cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), 1073741824));
                    }
                } else {
                    CameraView cameraView2 = r9Var.f42003c;
                    if (cameraView2 != null) {
                        cameraView2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    r9Var.f42005f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    r9Var.f42007r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                }
                r9Var.f42000a.measure(b.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                if (i12 == 3) {
                    r9Var.f42002b.measure(b.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    r9Var.f42002b.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                cg1 cg1Var = (cg1) this.f41010c;
                lVar2 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
                lVar2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                cg.i0 i0Var = cg1Var.f37120y;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                lVar3 = ((org.telegram.ui.ActionBar.o2) cg1Var).actionBar;
                i0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(3.0f) + lVar3.getMeasuredHeight(), 1073741824));
                ((org.telegram.ui.Components.s90) this.f41009b).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                setMeasuredDimension(size3, size4);
                return;
        }
    }

    public o9(cg1 cg1Var, Context context, org.telegram.ui.Components.s90 s90Var) {
        super(context);
        this.f41010c = cg1Var;
        this.f41009b = s90Var;
    }
}
