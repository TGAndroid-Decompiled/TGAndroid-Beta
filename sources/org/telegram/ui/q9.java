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
    public final int f51381a = 0;
    public final Object f51382b;
    public final org.telegram.ui.ActionBar.g2 f51383c;

    public q9(t9 t9Var, Context context) {
        super(context);
        this.f51383c = t9Var;
        this.f51382b = new Path();
    }

    public static RectF a(int i7, int i10, int i11) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(i7 - i11, i10 - i11, i7 + i11, i10 + i11);
        return rectF;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f51381a) {
            case 0:
                Path path = (Path) this.f51382b;
                boolean drawChild = super.drawChild(canvas, view, j3);
                t9 t9Var = (t9) this.f51383c;
                Paint paint = t9Var.f52309r;
                Paint paint2 = t9Var.f52308n;
                if (t9Var.f0() && view == t9Var.d) {
                    float min = Math.min(1.0f, Math.max(0.0f, ((float) (SystemClock.elapsedRealtime() - t9Var.M)) / 75.0f));
                    if (min < 1.0f) {
                        t9Var.fragmentView.invalidate();
                    }
                    RectF rectF = t9Var.K;
                    RectF rectF2 = t9Var.L;
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    org.telegram.messenger.g0.Z1(rectF, rectF2, min, rectF3);
                    if (t9Var.f52301c0 < 1.0f) {
                        if (t9Var.f52302d0 == null) {
                            t9Var.m0();
                        }
                        org.telegram.messenger.g0.Z1(t9Var.f52302d0, rectF3, t9Var.f52301c0, rectF3);
                    }
                    int width = (int) (rectF3.width() * view.getWidth());
                    int height = (int) (rectF3.height() * view.getHeight());
                    int centerX = (int) (rectF3.centerX() * view.getWidth());
                    float centerY = rectF3.centerY();
                    float f10 = t9Var.F;
                    float f11 = (f10 * 0.5f) + 0.5f;
                    int i7 = (int) (width * f11);
                    int i10 = (int) (f11 * height);
                    int i11 = centerX - (i7 / 2);
                    int height2 = ((int) (centerY * view.getHeight())) - (i10 / 2);
                    paint2.setAlpha((int) ((1.0f - (Math.min(1.0f, f10) * (1.0f - t9Var.f52312x))) * 255.0f));
                    float f12 = height2;
                    canvas.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), f12, paint2);
                    int i12 = height2 + i10;
                    float f13 = i12;
                    canvas.drawRect(0.0f, f13, view.getMeasuredWidth(), view.getMeasuredHeight(), paint2);
                    float f14 = i11;
                    canvas.drawRect(0.0f, f12, f14, f13, paint2);
                    int i13 = i11 + i7;
                    float f15 = i13;
                    canvas.drawRect(f15, f12, view.getMeasuredWidth(), f13, paint2);
                    paint2.setAlpha((int) (Math.max(0.0f, 1.0f - t9Var.F) * 255.0f));
                    canvas.drawRect(f14, f12, f15, f13, paint2);
                    int W1 = org.telegram.messenger.g0.W1(Math.min(1.0f, t9Var.F * 20.0f), 0, org.telegram.messenger.g0.L(4.0f));
                    int i14 = W1 / 2;
                    int W12 = org.telegram.messenger.g0.W1(Math.min(1.2f, (float) Math.pow(t9Var.F, 1.7999999523162842d)), Math.min(i7, i10), org.telegram.messenger.g0.L(20.0f));
                    paint.setAlpha((int) (Math.min(1.0f, t9Var.F) * 255.0f));
                    path.reset();
                    int i15 = height2 + W12;
                    path.arcTo(a(i11, i15, i14), 0.0f, 180.0f);
                    float f16 = W1 * 1.5f;
                    int i16 = (int) (f14 + f16);
                    int i17 = (int) (f12 + f16);
                    int i18 = W1 * 2;
                    path.arcTo(a(i16, i17, i18), 180.0f, 90.0f);
                    int i19 = i11 + W12;
                    path.arcTo(a(i19, height2, i14), 270.0f, 180.0f);
                    path.lineTo(i11 + i14, height2 + i14);
                    path.arcTo(a(i16, i17, W1), 270.0f, -90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    path.arcTo(a(i13, i15, i14), 180.0f, -180.0f);
                    int i20 = (int) (f15 - f16);
                    path.arcTo(a(i20, i17, i18), 0.0f, -90.0f);
                    int i21 = i13 - W12;
                    path.arcTo(a(i21, height2, i14), 270.0f, -180.0f);
                    path.arcTo(a(i20, i17, W1), 270.0f, 90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    int i22 = i12 - W12;
                    path.arcTo(a(i11, i22, i14), 0.0f, -180.0f);
                    int i23 = (int) (f13 - f16);
                    path.arcTo(a(i16, i23, i18), 180.0f, -90.0f);
                    path.arcTo(a(i19, i12, i14), 90.0f, -180.0f);
                    path.arcTo(a(i16, i23, W1), 90.0f, 90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    path.arcTo(a(i13, i22, i14), 180.0f, 180.0f);
                    path.arcTo(a(i20, i23, i18), 0.0f, 90.0f);
                    path.arcTo(a(i21, i12, i14), 90.0f, 180.0f);
                    path.arcTo(a(i20, i23, W1), 90.0f, -90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    return drawChild;
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        int measuredHeight;
        int L;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        switch (this.f51381a) {
            case 0:
                int i13 = i11 - i7;
                int i14 = i12 - i10;
                t9 t9Var = (t9) this.f51383c;
                int i15 = t9Var.X;
                if (i15 != 0) {
                    kVar = ((org.telegram.ui.ActionBar.g2) t9Var).actionBar;
                    kVar2 = ((org.telegram.ui.ActionBar.g2) t9Var).actionBar;
                    int measuredWidth = kVar2.getMeasuredWidth();
                    kVar3 = ((org.telegram.ui.ActionBar.g2) t9Var).actionBar;
                    kVar.layout(0, 0, measuredWidth, kVar3.getMeasuredHeight());
                    CameraView cameraView = t9Var.d;
                    if (cameraView != null) {
                        cameraView.layout(0, 0, cameraView.getMeasuredWidth(), t9Var.d.getMeasuredHeight());
                    }
                    int min = (int) (Math.min(i13, i14) / 1.5f);
                    if (i15 == 1) {
                        measuredHeight = ((i14 - min) / 2) - t9Var.f52298b.getMeasuredHeight();
                        L = org.telegram.messenger.g0.L(30.0f);
                    } else {
                        measuredHeight = ((i14 - min) / 2) - t9Var.f52298b.getMeasuredHeight();
                        L = org.telegram.messenger.g0.L(64.0f);
                    }
                    int i16 = measuredHeight - L;
                    t9Var.f52298b.layout(org.telegram.messenger.g0.L(36.0f), i16, t9Var.f52298b.getMeasuredWidth() + org.telegram.messenger.g0.L(36.0f), t9Var.f52298b.getMeasuredHeight() + i16);
                    if (i15 == 3) {
                        int C = org.telegram.messenger.f3.C(8.0f, t9Var.f52298b.getMeasuredHeight(), i16);
                        t9Var.f52300c.layout(org.telegram.messenger.g0.L(36.0f), C, t9Var.f52300c.getMeasuredWidth() + org.telegram.messenger.g0.L(36.0f), t9Var.f52300c.getMeasuredHeight() + C);
                    }
                    t9Var.h.layout(0, getMeasuredHeight() - t9Var.h.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    int measuredWidth2 = (i13 / 2) - (t9Var.f52310s.getMeasuredWidth() / 2);
                    int L2 = org.telegram.messenger.g0.L(80.0f) + i5.c.e(i14, min, 2, min);
                    ImageView imageView = t9Var.f52310s;
                    imageView.layout(measuredWidth2, L2, imageView.getMeasuredWidth() + measuredWidth2, t9Var.f52310s.getMeasuredHeight() + L2);
                } else {
                    CameraView cameraView2 = t9Var.d;
                    if (cameraView2 != null) {
                        cameraView2.layout(0, 0, cameraView2.getMeasuredWidth(), t9Var.d.getMeasuredHeight());
                    }
                    t9Var.h.setTextSize(0, i14 / 22);
                    t9Var.h.setPadding(0, 0, 0, i14 / 15);
                    int i17 = (int) (i14 * 0.65f);
                    t9Var.f52298b.layout(org.telegram.messenger.g0.L(36.0f), i17, t9Var.f52298b.getMeasuredWidth() + org.telegram.messenger.g0.L(36.0f), t9Var.f52298b.getMeasuredHeight() + i17);
                }
                if (i15 != 3) {
                    int i18 = (int) (i14 * 0.74f);
                    int i19 = (int) (i13 * 0.05f);
                    TextView textView = t9Var.f52300c;
                    textView.layout(i19, i18, textView.getMeasuredWidth() + i19, t9Var.f52300c.getMeasuredHeight() + i18);
                }
                t9Var.m0();
                return;
            default:
                za1 za1Var = (za1) this.f51383c;
                kVar4 = ((org.telegram.ui.ActionBar.g2) za1Var).actionBar;
                kVar5 = ((org.telegram.ui.ActionBar.g2) za1Var).actionBar;
                int measuredWidth3 = kVar5.getMeasuredWidth();
                kVar6 = ((org.telegram.ui.ActionBar.g2) za1Var).actionBar;
                kVar4.layout(0, 0, measuredWidth3, kVar6.getMeasuredHeight());
                hi.w5 w5Var = za1Var.E;
                w5Var.layout(0, 0, w5Var.getMeasuredWidth(), za1Var.E.getMeasuredHeight());
                ji0 ji0Var = (ji0) this.f51382b;
                ji0Var.layout(0, 0, ji0Var.getMeasuredWidth(), ji0Var.getMeasuredHeight());
                return;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.f51381a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                t9 t9Var = (t9) this.f51383c;
                kVar = ((org.telegram.ui.ActionBar.g2) t9Var).actionBar;
                kVar.measure(i7, i10);
                int i11 = t9Var.X;
                if (i11 == 0) {
                    CameraView cameraView = t9Var.d;
                    if (cameraView != null) {
                        cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), 1073741824));
                    }
                } else {
                    CameraView cameraView2 = t9Var.d;
                    if (cameraView2 != null) {
                        cameraView2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    t9Var.h.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    t9Var.f52310s.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824));
                }
                t9Var.f52298b.measure(org.telegram.messenger.m10.c(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                if (i11 == 3) {
                    t9Var.f52300c.measure(org.telegram.messenger.m10.c(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    t9Var.f52300c.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i7);
                int size4 = View.MeasureSpec.getSize(i10);
                za1 za1Var = (za1) this.f51383c;
                kVar2 = ((org.telegram.ui.ActionBar.g2) za1Var).actionBar;
                kVar2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i10);
                hi.w5 w5Var = za1Var.E;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                kVar3 = ((org.telegram.ui.ActionBar.g2) za1Var).actionBar;
                w5Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(3.0f) + kVar3.getMeasuredHeight(), 1073741824));
                ((ji0) this.f51382b).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i10);
                setMeasuredDimension(size3, size4);
                return;
        }
    }

    public q9(za1 za1Var, Context context, ji0 ji0Var) {
        super(context);
        this.f51383c = za1Var;
        this.f51382b = ji0Var;
    }
}
