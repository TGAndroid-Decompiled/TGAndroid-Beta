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
import org.telegram.messenger.camera.CameraView;
public final class q9 extends ViewGroup {
    public final int f40727a = 1;
    public final Object f40728b;
    public final org.telegram.ui.ActionBar.k2 f40729c;

    public q9(u9 u9Var, Context context) {
        super(context);
        this.f40729c = u9Var;
        this.f40728b = new Path();
    }

    public static RectF a(int i10, int i11, int i12) {
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        return rectF;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f40727a) {
            case 0:
                Path path = (Path) this.f40728b;
                boolean drawChild = super.drawChild(canvas, view, j10);
                u9 u9Var = (u9) this.f40729c;
                Paint paint = u9Var.f41890r;
                Paint paint2 = u9Var.f41889n;
                if (u9Var.f0() && view == u9Var.d) {
                    float min = Math.min(1.0f, Math.max(0.0f, ((float) (SystemClock.elapsedRealtime() - u9Var.L)) / 75.0f));
                    if (min < 1.0f) {
                        u9Var.fragmentView.invalidate();
                    }
                    RectF rectF = u9Var.J;
                    RectF rectF2 = u9Var.K;
                    RectF rectF3 = org.telegram.messenger.i0.P;
                    org.telegram.messenger.i0.Z1(rectF, rectF2, min, rectF3);
                    if (u9Var.f41882b0 < 1.0f) {
                        if (u9Var.f41884c0 == null) {
                            u9Var.m0();
                        }
                        org.telegram.messenger.i0.Z1(u9Var.f41884c0, rectF3, u9Var.f41882b0, rectF3);
                    }
                    int width = (int) (rectF3.width() * view.getWidth());
                    int height = (int) (rectF3.height() * view.getHeight());
                    int centerX = (int) (rectF3.centerX() * view.getWidth());
                    float centerY = rectF3.centerY();
                    float f7 = u9Var.E;
                    float f10 = (f7 * 0.5f) + 0.5f;
                    int i10 = (int) (width * f10);
                    int i11 = (int) (f10 * height);
                    int i12 = centerX - (i10 / 2);
                    int height2 = ((int) (centerY * view.getHeight())) - (i11 / 2);
                    paint2.setAlpha((int) ((1.0f - (Math.min(1.0f, f7) * (1.0f - u9Var.f41893x))) * 255.0f));
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
                    paint2.setAlpha((int) (Math.max(0.0f, 1.0f - u9Var.E) * 255.0f));
                    canvas.drawRect(f13, f11, f14, f12, paint2);
                    int W1 = org.telegram.messenger.i0.W1(Math.min(1.0f, u9Var.E * 20.0f), 0, org.telegram.messenger.i0.L(4.0f));
                    int i15 = W1 / 2;
                    int W12 = org.telegram.messenger.i0.W1(Math.min(1.2f, (float) Math.pow(u9Var.E, 1.7999999523162842d)), Math.min(i10, i11), org.telegram.messenger.i0.L(20.0f));
                    paint.setAlpha((int) (Math.min(1.0f, u9Var.E) * 255.0f));
                    path.reset();
                    int i16 = height2 + W12;
                    path.arcTo(a(i12, i16, i15), 0.0f, 180.0f);
                    float f15 = W1 * 1.5f;
                    int i17 = (int) (f13 + f15);
                    int i18 = (int) (f11 + f15);
                    int i19 = W1 * 2;
                    path.arcTo(a(i17, i18, i19), 180.0f, 90.0f);
                    int i20 = i12 + W12;
                    path.arcTo(a(i20, height2, i15), 270.0f, 180.0f);
                    path.lineTo(i12 + i15, height2 + i15);
                    path.arcTo(a(i17, i18, W1), 270.0f, -90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    path.arcTo(a(i14, i16, i15), 180.0f, -180.0f);
                    int i21 = (int) (f14 - f15);
                    path.arcTo(a(i21, i18, i19), 0.0f, -90.0f);
                    int i22 = i14 - W12;
                    path.arcTo(a(i22, height2, i15), 270.0f, -180.0f);
                    path.arcTo(a(i21, i18, W1), 270.0f, 90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    int i23 = i13 - W12;
                    path.arcTo(a(i12, i23, i15), 0.0f, -180.0f);
                    int i24 = (int) (f12 - f15);
                    path.arcTo(a(i17, i24, i19), 180.0f, -90.0f);
                    path.arcTo(a(i20, i13, i15), 90.0f, -180.0f);
                    path.arcTo(a(i17, i24, W1), 90.0f, 90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    path.arcTo(a(i14, i23, i15), 180.0f, 180.0f);
                    path.arcTo(a(i21, i24, i19), 0.0f, 90.0f);
                    path.arcTo(a(i22, i13, i15), 90.0f, 180.0f);
                    path.arcTo(a(i21, i24, W1), 90.0f, -90.0f);
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
        int L;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        switch (this.f40727a) {
            case 0:
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                u9 u9Var = (u9) this.f40729c;
                int i16 = u9Var.W;
                if (i16 != 0) {
                    lVar = ((org.telegram.ui.ActionBar.k2) u9Var).actionBar;
                    lVar2 = ((org.telegram.ui.ActionBar.k2) u9Var).actionBar;
                    int measuredWidth = lVar2.getMeasuredWidth();
                    lVar3 = ((org.telegram.ui.ActionBar.k2) u9Var).actionBar;
                    lVar.layout(0, 0, measuredWidth, lVar3.getMeasuredHeight());
                    CameraView cameraView = u9Var.d;
                    if (cameraView != null) {
                        cameraView.layout(0, 0, cameraView.getMeasuredWidth(), u9Var.d.getMeasuredHeight());
                    }
                    int min = (int) (Math.min(i14, i15) / 1.5f);
                    if (i16 == 1) {
                        measuredHeight = ((i15 - min) / 2) - u9Var.f41881b.getMeasuredHeight();
                        L = org.telegram.messenger.i0.L(30.0f);
                    } else {
                        measuredHeight = ((i15 - min) / 2) - u9Var.f41881b.getMeasuredHeight();
                        L = org.telegram.messenger.i0.L(64.0f);
                    }
                    int i17 = measuredHeight - L;
                    u9Var.f41881b.layout(org.telegram.messenger.i0.L(36.0f), i17, u9Var.f41881b.getMeasuredWidth() + org.telegram.messenger.i0.L(36.0f), u9Var.f41881b.getMeasuredHeight() + i17);
                    if (i16 == 3) {
                        int C = org.telegram.messenger.m5.C(8.0f, u9Var.f41881b.getMeasuredHeight(), i17);
                        u9Var.f41883c.layout(org.telegram.messenger.i0.L(36.0f), C, u9Var.f41883c.getMeasuredWidth() + org.telegram.messenger.i0.L(36.0f), u9Var.f41883c.getMeasuredHeight() + C);
                    }
                    u9Var.h.layout(0, getMeasuredHeight() - u9Var.h.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    int measuredWidth2 = (i14 / 2) - (u9Var.f41891s.getMeasuredWidth() / 2);
                    int L2 = org.telegram.messenger.i0.L(80.0f) + i0.a.u(i15, min, 2, min);
                    ImageView imageView = u9Var.f41891s;
                    imageView.layout(measuredWidth2, L2, imageView.getMeasuredWidth() + measuredWidth2, u9Var.f41891s.getMeasuredHeight() + L2);
                } else {
                    CameraView cameraView2 = u9Var.d;
                    if (cameraView2 != null) {
                        cameraView2.layout(0, 0, cameraView2.getMeasuredWidth(), u9Var.d.getMeasuredHeight());
                    }
                    u9Var.h.setTextSize(0, i15 / 22);
                    u9Var.h.setPadding(0, 0, 0, i15 / 15);
                    int i18 = (int) (i15 * 0.65f);
                    u9Var.f41881b.layout(org.telegram.messenger.i0.L(36.0f), i18, u9Var.f41881b.getMeasuredWidth() + org.telegram.messenger.i0.L(36.0f), u9Var.f41881b.getMeasuredHeight() + i18);
                }
                if (i16 != 3) {
                    int i19 = (int) (i15 * 0.74f);
                    int i20 = (int) (i14 * 0.05f);
                    TextView textView = u9Var.f41883c;
                    textView.layout(i20, i19, textView.getMeasuredWidth() + i20, u9Var.f41883c.getMeasuredHeight() + i19);
                }
                u9Var.m0();
                return;
            default:
                rc1 rc1Var = (rc1) this.f40729c;
                lVar4 = ((org.telegram.ui.ActionBar.k2) rc1Var).actionBar;
                lVar5 = ((org.telegram.ui.ActionBar.k2) rc1Var).actionBar;
                int measuredWidth3 = lVar5.getMeasuredWidth();
                lVar6 = ((org.telegram.ui.ActionBar.k2) rc1Var).actionBar;
                lVar4.layout(0, 0, measuredWidth3, lVar6.getMeasuredHeight());
                kg.f0 f0Var = rc1Var.D;
                f0Var.layout(0, 0, f0Var.getMeasuredWidth(), rc1Var.D.getMeasuredHeight());
                mj0 mj0Var = (mj0) this.f40728b;
                mj0Var.layout(0, 0, mj0Var.getMeasuredWidth(), mj0Var.getMeasuredHeight());
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        switch (this.f40727a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                u9 u9Var = (u9) this.f40729c;
                lVar = ((org.telegram.ui.ActionBar.k2) u9Var).actionBar;
                lVar.measure(i10, i11);
                int i12 = u9Var.W;
                if (i12 == 0) {
                    CameraView cameraView = u9Var.d;
                    if (cameraView != null) {
                        cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), 1073741824));
                    }
                } else {
                    CameraView cameraView2 = u9Var.d;
                    if (cameraView2 != null) {
                        cameraView2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    u9Var.h.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    u9Var.f41891s.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), 1073741824));
                }
                u9Var.f41881b.measure(org.telegram.messenger.a30.c(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                if (i12 == 3) {
                    u9Var.f41883c.measure(org.telegram.messenger.a30.c(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    u9Var.f41883c.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                rc1 rc1Var = (rc1) this.f40729c;
                lVar2 = ((org.telegram.ui.ActionBar.k2) rc1Var).actionBar;
                lVar2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                kg.f0 f0Var = rc1Var.D;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                lVar3 = ((org.telegram.ui.ActionBar.k2) rc1Var).actionBar;
                f0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(3.0f) + lVar3.getMeasuredHeight(), 1073741824));
                ((mj0) this.f40728b).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i11);
                setMeasuredDimension(size3, size4);
                return;
        }
    }

    public q9(rc1 rc1Var, Context context, mj0 mj0Var) {
        super(context);
        this.f40729c = rc1Var;
        this.f40728b = mj0Var;
    }
}
