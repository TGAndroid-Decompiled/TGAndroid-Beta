package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import c8.jc;
import fi.v3;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.a8;
import org.telegram.messenger.s3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.xq;
import org.telegram.ui.va;
public final class a0 extends ViewGroup {
    public final z D;
    public float E;
    public long F;
    public long G;
    public int[] H;
    public final et I;
    public final e0 J;
    public final ArrayList f39076a;
    public final ArrayList f39077b;
    public final ArrayList f39078c;
    public final TextView d;
    public final ImageView f39079e;
    public final k f39080f;
    public final int h;
    public float f39081n;
    public float f39082r;
    public ValueAnimator f39083s;
    public boolean f39084w;
    public long f39085x;
    public boolean f39086y;

    public a0(e0 e0Var, Context context) {
        super(context);
        this.J = e0Var;
        this.f39076a = new ArrayList();
        this.f39077b = new ArrayList();
        this.f39078c = new ArrayList();
        this.h = org.telegram.messenger.g0.L(2.0f);
        this.f39082r = 1.0f;
        this.D = new z(this, 1);
        this.I = new et(this, 18);
        setBackgroundColor(-16777216);
        setChildrenDrawingOrderEnabled(true);
        this.f39081n = e0Var.f39168c;
        ImageView imageView = new ImageView(context);
        this.f39079e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(-1);
        imageView.setBackground(k6.L(org.telegram.messenger.g0.L(28.0f), 1711276032));
        addView(imageView);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1275068417);
        textView.setTextSize(1, 11.0f);
        textView.setSingleLine();
        textView.setGravity(1);
        textView.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        textView.setVisibility(8);
        addView(textView);
        k kVar = new k(context);
        this.f39080f = kVar;
        addView(kVar);
    }

    public static void a(a0 a0Var) {
        int width = a0Var.getWidth();
        int height = a0Var.getHeight();
        if (a0Var.f39084w && !a0Var.f39086y && width > 0 && height > 0 && !a0Var.f39076a.isEmpty() && a0Var.E > 0.0f && a0Var.c() && Math.abs(Math.log((width / height) / a0Var.E)) > 0.06d) {
            a0Var.g(true);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f39077b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            d0 d0Var = (d0) obj;
            d0Var.b();
            removeView(d0Var);
        }
        arrayList.clear();
        this.H = null;
    }

    public final boolean c() {
        Activity W = org.telegram.messenger.g0.W(getContext());
        if (W != null && org.telegram.messenger.g0.H1(W) && SystemClock.elapsedRealtime() - this.f39085x > 1000) {
            return true;
        }
        return false;
    }

    public final void d(d0 d0Var, int i7, int i10) {
        float f10;
        float f11;
        float f12;
        float[] fArr = d0Var.O;
        float f13 = this.f39082r;
        for (int i11 = 0; i11 < 4; i11++) {
            float f14 = d0Var.M[i11];
            fArr[i11] = com.google.android.recaptcha.internal.a.z(d0Var.N[i11], f14, f13, f14);
        }
        float f15 = this.h / 2.0f;
        float f16 = fArr[0];
        float f17 = i7;
        float f18 = f16 * f17;
        if (f16 > 0.001f) {
            f10 = f15;
        } else {
            f10 = 0.0f;
        }
        int round = Math.round(f18 + f10);
        float f19 = fArr[1];
        float f20 = i10;
        float f21 = f19 * f20;
        if (f19 > 0.001f) {
            f11 = f15;
        } else {
            f11 = 0.0f;
        }
        int round2 = Math.round(f21 + f11);
        float f22 = fArr[2];
        float f23 = f17 * f22;
        if (f22 < 0.999f) {
            f12 = f15;
        } else {
            f12 = 0.0f;
        }
        int round3 = Math.round(f23 - f12);
        float f24 = fArr[3];
        float f25 = f20 * f24;
        if (f24 >= 0.999f) {
            f15 = 0.0f;
        }
        int round4 = Math.round(f25 - f15);
        int max = Math.max(1, round3 - round);
        int max2 = Math.max(1, round4 - round2);
        if (d0Var.getMeasuredWidth() != max || d0Var.getMeasuredHeight() != max2 || d0Var.isLayoutRequested()) {
            d0Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(max2, 1073741824));
        }
        d0Var.layout(round, round2, max + round, max2 + round2);
        float f26 = this.f39082r;
        float f27 = d0Var.P;
        float f28 = ((d0Var.Q - f27) * f26) + f27;
        d0Var.setAlpha(f28);
        float f29 = (f28 * 0.2f) + 0.8f;
        d0Var.setScaleX(f29);
        d0Var.setScaleY(f29);
    }

    public final void e() {
        int width = getWidth();
        int height = getHeight();
        if (width != 0 && height != 0) {
            ArrayList arrayList = this.f39077b;
            int size = arrayList.size();
            int i7 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d((d0) obj, width, height);
            }
            ArrayList arrayList2 = this.f39076a;
            int size2 = arrayList2.size();
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
                d((d0) obj2, width, height);
            }
            invalidate();
        }
    }

    public final boolean f(int i7, int i10) {
        if (Math.abs(Math.log((i7 / i10) / this.f39081n)) < 0.06d) {
            return true;
        }
        return false;
    }

    public final void g(boolean z9) {
        float f10;
        boolean z10;
        int i7;
        boolean z11;
        float f11;
        String str;
        float f12;
        int i10;
        boolean z12;
        ArrayList arrayList = this.f39076a;
        int size = arrayList.size();
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int[] iArr = new int[size];
        boolean z13 = false;
        for (int i11 = 0; i11 < size; i11++) {
            d0 d0Var = (d0) arrayList.get(i11);
            float f13 = d0Var.J;
            fArr[i11] = f13;
            s3 s3Var = d0Var.f39130b;
            if (s3Var != null && s3Var.f25410b) {
                f12 = 2.0f;
            } else {
                f12 = 1.0f;
            }
            fArr2[i11] = f12;
            boolean z14 = d0Var.L;
            if (z14) {
                i10 = i11;
            } else {
                i10 = -1;
            }
            iArr[i11] = i10;
            if (z14 && d0Var.K <= 0.0f && f13 > 0.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 |= z12;
        }
        if (z13) {
            f10 = 0.0f;
        } else {
            f10 = this.f39081n;
        }
        ti.k a10 = jc.a(fArr, fArr2, 0.45f, 2.35f, iArr, f10);
        int width = getWidth();
        int height = getHeight();
        float f14 = 0.001f;
        if (Math.abs(a10.f56112a - this.f39081n) <= 0.001f && width > 0 && height > 0 && !f(width, height) && c()) {
            float f15 = width / height;
            a10 = jc.a(fArr, fArr2, f15, f15, iArr, 0.0f);
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = a10.f56112a;
        if (org.telegram.messenger.r2.f25212a) {
            StringBuilder sb2 = new StringBuilder("group call pip: mosaic ");
            sb2.append(Arrays.toString(fArr));
            if (z10) {
                str = " in the window";
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append(" -> ");
            sb2.append(a10);
            a8.b(sb2.toString());
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (true) {
            i7 = 4;
            if (i12 >= size2) {
                break;
            }
            Object obj = arrayList.get(i12);
            i12++;
            d0 d0Var2 = (d0) obj;
            float f16 = this.f39082r;
            float f17 = f14;
            float[] fArr3 = d0Var2.M;
            for (int i13 = 0; i13 < 4; i13++) {
                float f18 = fArr3[i13];
                fArr3[i13] = com.google.android.recaptcha.internal.a.z(d0Var2.N[i13], f18, f16, f18);
            }
            float f19 = d0Var2.P;
            d0Var2.P = com.google.android.recaptcha.internal.a.z(d0Var2.Q, f19, f16, f19);
            f14 = f17;
        }
        float f20 = f14;
        ArrayList arrayList2 = this.f39077b;
        int size3 = arrayList2.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj2 = arrayList2.get(i14);
            i14++;
            d0 d0Var3 = (d0) obj2;
            float f21 = this.f39082r;
            float[] fArr4 = d0Var3.M;
            float[] fArr5 = d0Var3.N;
            int i15 = 0;
            while (i15 < i7) {
                float f22 = fArr4[i15];
                fArr4[i15] = com.google.android.recaptcha.internal.a.z(fArr5[i15], f22, f21, f22);
                i15++;
                i7 = 4;
            }
            float f23 = d0Var3.P;
            d0Var3.P = com.google.android.recaptcha.internal.a.z(d0Var3.Q, f23, f21, f23);
            System.arraycopy(d0Var3.M, 0, fArr5, 0, 4);
            d0Var3.Q = 0.0f;
            i7 = 4;
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i16 = 0; i16 < size; i16++) {
            d0 d0Var4 = (d0) arrayList.get(i16);
            System.arraycopy(a10.f56113b, i16 * 4, d0Var4.N, 0, 4);
            d0Var4.Q = 1.0f;
            d0Var4.K = fArr[i16];
            if (!d0Var4.L || !z9) {
                System.arraycopy(d0Var4.N, 0, d0Var4.M, 0, 4);
                if (z9) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                d0Var4.P = f11;
                d0Var4.L = true;
            }
        }
        for (int i17 : a10.f56114c) {
            arrayList3.add((d0) arrayList.get(i17));
        }
        arrayList.clear();
        arrayList.addAll(arrayList3);
        this.H = null;
        if (!z10 && Math.abs(a10.f56112a - this.f39081n) > f20) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f39081n = a10.f56112a;
            ti.o oVar = this.J.f39166a;
            if (oVar != null) {
                oVar.c();
            }
        }
        k();
        ValueAnimator valueAnimator = this.f39083s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f39083s.cancel();
            this.f39083s = null;
        }
        this.f39086y = false;
        z zVar = this.D;
        org.telegram.messenger.g0.r(zVar);
        if (z9) {
            this.f39082r = 0.0f;
            if (z11 && getWidth() > 0 && getHeight() > 0 && !f(getWidth(), getHeight())) {
                this.f39086y = true;
                org.telegram.messenger.g0.i3(zVar, 500L);
            } else {
                h();
            }
        } else {
            this.f39082r = 1.0f;
            b();
        }
        e();
    }

    @Override
    public final int getChildDrawingOrder(int i7, int i10) {
        int[] iArr = this.H;
        if (iArr == null || iArr.length != i7) {
            int[] iArr2 = new int[i7];
            ArrayList arrayList = this.f39078c;
            int size = arrayList.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                int indexOfChild = indexOfChild((d0) obj);
                if (indexOfChild >= 0 && i11 < i7) {
                    iArr2[i11] = indexOfChild;
                    i11++;
                }
            }
            ArrayList arrayList2 = this.f39077b;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                int indexOfChild2 = indexOfChild((d0) obj2);
                if (indexOfChild2 >= 0 && i11 < i7) {
                    iArr2[i11] = indexOfChild2;
                    i11++;
                }
            }
            ArrayList arrayList3 = this.f39076a;
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList3.get(i14);
                i14++;
                int indexOfChild3 = indexOfChild((d0) obj3);
                if (indexOfChild3 >= 0 && i11 < i7) {
                    iArr2[i11] = indexOfChild3;
                    i11++;
                }
            }
            for (int i15 = 0; i15 < i7 && i11 < i7; i15++) {
                if (!(getChildAt(i15) instanceof d0)) {
                    iArr2[i11] = i15;
                    i11++;
                }
            }
            if (i11 != i7) {
                for (int i16 = 0; i16 < i7; i16++) {
                    iArr2[i16] = i16;
                }
            }
            this.H = iArr2;
        }
        return this.H[i10];
    }

    public final void h() {
        this.f39086y = false;
        org.telegram.messenger.g0.r(this.D);
        ValueAnimator valueAnimator = this.f39083s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f39083s.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f39083s = ofFloat;
        ofFloat.setDuration(420L);
        this.f39083s.setInterpolator(xq.h);
        this.f39083s.addUpdateListener(new v3(this, 16));
        this.f39083s.addListener(new va(this, 11));
        this.f39083s.start();
    }

    public final void i() {
        if (!this.f39084w) {
            return;
        }
        int i7 = 0;
        this.f39084w = false;
        org.telegram.messenger.g0.r(this.I);
        this.f39080f.b();
        this.f39086y = false;
        org.telegram.messenger.g0.r(this.D);
        ValueAnimator valueAnimator = this.f39083s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f39083s.cancel();
            this.f39083s = null;
        }
        ArrayList arrayList = this.f39076a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d0 d0Var = (d0) obj;
            d0Var.b();
            removeView(d0Var);
        }
        ArrayList arrayList2 = this.f39077b;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            d0 d0Var2 = (d0) obj2;
            d0Var2.b();
            removeView(d0Var2);
        }
        ArrayList arrayList3 = this.f39078c;
        int size3 = arrayList3.size();
        while (i7 < size3) {
            Object obj3 = arrayList3.get(i7);
            i7++;
            d0 d0Var3 = (d0) obj3;
            d0Var3.b();
            removeView(d0Var3);
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
        this.f39082r = 1.0f;
    }

    public final void j(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.a0.j(boolean):void");
    }

    public final void k() {
        int width = getWidth();
        int height = getHeight();
        if (width != 0 && height != 0) {
            ArrayList arrayList = this.f39076a;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                d0 d0Var = (d0) obj;
                float[] fArr = d0Var.N;
                int round = Math.round((fArr[2] - fArr[0]) * width);
                float[] fArr2 = d0Var.N;
                int round2 = Math.round((fArr2[3] - fArr2[1]) * height);
                int max = Math.max(1, round);
                int max2 = Math.max(1, round2);
                float f10 = d0Var.J;
                if (f10 > 0.0f) {
                    float f11 = max;
                    float f12 = max2;
                    if (f11 / f12 > f10) {
                        max2 = Math.round(f11 / f10);
                    } else {
                        max = Math.round(f12 * f10);
                    }
                }
                if (max != d0Var.R || max2 != d0Var.S) {
                    d0Var.R = max;
                    d0Var.S = max2;
                    d0Var.requestLayout();
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int L3 = org.telegram.messenger.g0.L(6.0f);
        ImageView imageView = this.f39079e;
        imageView.layout(L, L2, imageView.getMeasuredWidth() + L3, imageView.getMeasuredHeight() + org.telegram.messenger.g0.L(6.0f));
        int i13 = i11 - i7;
        TextView textView = this.d;
        int measuredWidth = (i13 - textView.getMeasuredWidth()) / 2;
        textView.layout(measuredWidth, org.telegram.messenger.g0.L(8.0f), textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f));
        this.f39080f.layout(0, 0, i13, i12 - i10);
        e();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        this.f39079e.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), 1073741824));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(64.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f39080f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        k();
        if (this.f39086y && i7 > 0 && i10 > 0 && f(i7, i10)) {
            post(this.D);
        } else if (!this.f39086y) {
            post(new z(this, 0));
        }
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.H = null;
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.H = null;
    }
}
