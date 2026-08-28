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
public final class p9 extends ViewGroup {
    public final int f41371a = 1;
    public final Object f41372b;
    public final org.telegram.ui.ActionBar.o2 f41373c;

    public p9(s9 s9Var, Context context) {
        super(context);
        this.f41373c = s9Var;
        this.f41372b = new Path();
    }

    public static RectF a(int i9, int i10, int i11) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(i9 - i11, i10 - i11, i9 + i11, i10 + i11);
        return rectF;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f41371a) {
            case 0:
                Path path = (Path) this.f41372b;
                boolean drawChild = super.drawChild(canvas, view, j10);
                s9 s9Var = (s9) this.f41373c;
                Paint paint = s9Var.f42599n;
                Paint paint2 = s9Var.h;
                if (s9Var.Z() && view == s9Var.f42596c) {
                    float min = Math.min(1.0f, Math.max(0.0f, ((float) (SystemClock.elapsedRealtime() - s9Var.G)) / 75.0f));
                    if (min < 1.0f) {
                        s9Var.fragmentView.invalidate();
                    }
                    RectF rectF = s9Var.E;
                    RectF rectF2 = s9Var.F;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    AndroidUtilities.lerp(rectF, rectF2, min, rectF3);
                    if (s9Var.W < 1.0f) {
                        if (s9Var.X == null) {
                            s9Var.g0();
                        }
                        AndroidUtilities.lerp(s9Var.X, rectF3, s9Var.W, rectF3);
                    }
                    int width = (int) (rectF3.width() * view.getWidth());
                    int height = (int) (rectF3.height() * view.getHeight());
                    int centerX = (int) (rectF3.centerX() * view.getWidth());
                    float centerY = rectF3.centerY();
                    float f10 = s9Var.f42604y;
                    float f11 = (f10 * 0.5f) + 0.5f;
                    int i9 = (int) (width * f11);
                    int i10 = (int) (f11 * height);
                    int i11 = centerX - (i9 / 2);
                    int height2 = ((int) (centerY * view.getHeight())) - (i10 / 2);
                    paint2.setAlpha((int) ((1.0f - (Math.min(1.0f, f10) * (1.0f - s9Var.v))) * 255.0f));
                    float f12 = height2;
                    canvas.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), f12, paint2);
                    int i12 = height2 + i10;
                    float f13 = i12;
                    canvas.drawRect(0.0f, f13, view.getMeasuredWidth(), view.getMeasuredHeight(), paint2);
                    float f14 = i11;
                    canvas.drawRect(0.0f, f12, f14, f13, paint2);
                    int i13 = i11 + i9;
                    float f15 = i13;
                    canvas.drawRect(f15, f12, view.getMeasuredWidth(), f13, paint2);
                    paint2.setAlpha((int) (Math.max(0.0f, 1.0f - s9Var.f42604y) * 255.0f));
                    canvas.drawRect(f14, f12, f15, f13, paint2);
                    int lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), Math.min(1.0f, s9Var.f42604y * 20.0f));
                    int i14 = lerp / 2;
                    int lerp2 = AndroidUtilities.lerp(Math.min(i9, i10), AndroidUtilities.dp(20.0f), Math.min(1.2f, (float) Math.pow(s9Var.f42604y, 1.7999999523162842d)));
                    paint.setAlpha((int) (Math.min(1.0f, s9Var.f42604y) * 255.0f));
                    path.reset();
                    int i15 = height2 + lerp2;
                    path.arcTo(a(i11, i15, i14), 0.0f, 180.0f);
                    float f16 = lerp * 1.5f;
                    int i16 = (int) (f14 + f16);
                    int i17 = (int) (f12 + f16);
                    int i18 = lerp * 2;
                    path.arcTo(a(i16, i17, i18), 180.0f, 90.0f);
                    int i19 = i11 + lerp2;
                    path.arcTo(a(i19, height2, i14), 270.0f, 180.0f);
                    path.lineTo(i11 + i14, height2 + i14);
                    path.arcTo(a(i16, i17, lerp), 270.0f, -90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    path.arcTo(a(i13, i15, i14), 180.0f, -180.0f);
                    int i20 = (int) (f15 - f16);
                    path.arcTo(a(i20, i17, i18), 0.0f, -90.0f);
                    int i21 = i13 - lerp2;
                    path.arcTo(a(i21, height2, i14), 270.0f, -180.0f);
                    path.arcTo(a(i20, i17, lerp), 270.0f, 90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    int i22 = i12 - lerp2;
                    path.arcTo(a(i11, i22, i14), 0.0f, -180.0f);
                    int i23 = (int) (f13 - f16);
                    path.arcTo(a(i16, i23, i18), 180.0f, -90.0f);
                    path.arcTo(a(i19, i12, i14), 90.0f, -180.0f);
                    path.arcTo(a(i16, i23, lerp), 90.0f, 90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    path.arcTo(a(i13, i22, i14), 180.0f, 180.0f);
                    path.arcTo(a(i20, i23, i18), 0.0f, 90.0f);
                    path.arcTo(a(i21, i12, i14), 90.0f, 180.0f);
                    path.arcTo(a(i20, i23, lerp), 90.0f, -90.0f);
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        int measuredHeight;
        int dp;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        switch (this.f41371a) {
            case 0:
                int i13 = i11 - i9;
                int i14 = i12 - i10;
                s9 s9Var = (s9) this.f41373c;
                int i15 = s9Var.R;
                if (i15 != 0) {
                    kVar = ((org.telegram.ui.ActionBar.o2) s9Var).actionBar;
                    kVar2 = ((org.telegram.ui.ActionBar.o2) s9Var).actionBar;
                    int measuredWidth = kVar2.getMeasuredWidth();
                    kVar3 = ((org.telegram.ui.ActionBar.o2) s9Var).actionBar;
                    kVar.layout(0, 0, measuredWidth, kVar3.getMeasuredHeight());
                    CameraView cameraView = s9Var.f42596c;
                    if (cameraView != null) {
                        cameraView.layout(0, 0, cameraView.getMeasuredWidth(), s9Var.f42596c.getMeasuredHeight());
                    }
                    int min = (int) (Math.min(i13, i14) / 1.5f);
                    if (i15 == 1) {
                        measuredHeight = ((i14 - min) / 2) - s9Var.f42593a.getMeasuredHeight();
                        dp = AndroidUtilities.dp(30.0f);
                    } else {
                        measuredHeight = ((i14 - min) / 2) - s9Var.f42593a.getMeasuredHeight();
                        dp = AndroidUtilities.dp(64.0f);
                    }
                    int i16 = measuredHeight - dp;
                    s9Var.f42593a.layout(AndroidUtilities.dp(36.0f), i16, s9Var.f42593a.getMeasuredWidth() + AndroidUtilities.dp(36.0f), s9Var.f42593a.getMeasuredHeight() + i16);
                    if (i15 == 3) {
                        int C = org.telegram.messenger.l0.C(8.0f, s9Var.f42593a.getMeasuredHeight(), i16);
                        s9Var.f42595b.layout(AndroidUtilities.dp(36.0f), C, s9Var.f42595b.getMeasuredWidth() + AndroidUtilities.dp(36.0f), s9Var.f42595b.getMeasuredHeight() + C);
                    }
                    s9Var.f42598f.layout(0, getMeasuredHeight() - s9Var.f42598f.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    int measuredWidth2 = (i13 / 2) - (s9Var.f42600r.getMeasuredWidth() / 2);
                    int dp2 = AndroidUtilities.dp(80.0f) + j3.r0.d(i14, min, 2, min);
                    ImageView imageView = s9Var.f42600r;
                    imageView.layout(measuredWidth2, dp2, imageView.getMeasuredWidth() + measuredWidth2, s9Var.f42600r.getMeasuredHeight() + dp2);
                } else {
                    CameraView cameraView2 = s9Var.f42596c;
                    if (cameraView2 != null) {
                        cameraView2.layout(0, 0, cameraView2.getMeasuredWidth(), s9Var.f42596c.getMeasuredHeight());
                    }
                    s9Var.f42598f.setTextSize(0, i14 / 22);
                    s9Var.f42598f.setPadding(0, 0, 0, i14 / 15);
                    int i17 = (int) (i14 * 0.65f);
                    s9Var.f42593a.layout(AndroidUtilities.dp(36.0f), i17, s9Var.f42593a.getMeasuredWidth() + AndroidUtilities.dp(36.0f), s9Var.f42593a.getMeasuredHeight() + i17);
                }
                if (i15 != 3) {
                    int i18 = (int) (i14 * 0.74f);
                    int i19 = (int) (i13 * 0.05f);
                    TextView textView = s9Var.f42595b;
                    textView.layout(i19, i18, textView.getMeasuredWidth() + i19, s9Var.f42595b.getMeasuredHeight() + i18);
                }
                s9Var.g0();
                return;
            default:
                ag1 ag1Var = (ag1) this.f41373c;
                kVar4 = ((org.telegram.ui.ActionBar.o2) ag1Var).actionBar;
                kVar5 = ((org.telegram.ui.ActionBar.o2) ag1Var).actionBar;
                int measuredWidth3 = kVar5.getMeasuredWidth();
                kVar6 = ((org.telegram.ui.ActionBar.o2) ag1Var).actionBar;
                kVar4.layout(0, 0, measuredWidth3, kVar6.getMeasuredHeight());
                kh.h6 h6Var = ag1Var.f36497y;
                h6Var.layout(0, 0, h6Var.getMeasuredWidth(), ag1Var.f36497y.getMeasuredHeight());
                org.telegram.ui.Components.e90 e90Var = (org.telegram.ui.Components.e90) this.f41372b;
                e90Var.layout(0, 0, e90Var.getMeasuredWidth(), e90Var.getMeasuredHeight());
                return;
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.f41371a) {
            case 0:
                int size = View.MeasureSpec.getSize(i9);
                int size2 = View.MeasureSpec.getSize(i10);
                s9 s9Var = (s9) this.f41373c;
                kVar = ((org.telegram.ui.ActionBar.o2) s9Var).actionBar;
                kVar.measure(i9, i10);
                int i11 = s9Var.R;
                if (i11 == 0) {
                    CameraView cameraView = s9Var.f42596c;
                    if (cameraView != null) {
                        cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), 1073741824));
                    }
                } else {
                    CameraView cameraView2 = s9Var.f42596c;
                    if (cameraView2 != null) {
                        cameraView2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    s9Var.f42598f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    s9Var.f42600r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                }
                s9Var.f42593a.measure(org.telegram.messenger.ll.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                if (i11 == 3) {
                    s9Var.f42595b.measure(org.telegram.messenger.ll.d(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    s9Var.f42595b.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i9);
                int size4 = View.MeasureSpec.getSize(i10);
                ag1 ag1Var = (ag1) this.f41373c;
                kVar2 = ((org.telegram.ui.ActionBar.o2) ag1Var).actionBar;
                kVar2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i10);
                kh.h6 h6Var = ag1Var.f36497y;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                kVar3 = ((org.telegram.ui.ActionBar.o2) ag1Var).actionBar;
                h6Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(3.0f) + kVar3.getMeasuredHeight(), 1073741824));
                ((org.telegram.ui.Components.e90) this.f41372b).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i10);
                setMeasuredDimension(size3, size4);
                return;
        }
    }

    public p9(ag1 ag1Var, Context context, org.telegram.ui.Components.e90 e90Var) {
        super(context);
        this.f41373c = ag1Var;
        this.f41372b = e90Var;
    }
}
