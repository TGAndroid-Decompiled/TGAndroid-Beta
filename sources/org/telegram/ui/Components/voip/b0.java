package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import c8.nd;
import hi.s3;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.a8;
import org.telegram.messenger.u3;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.rc;
public final class b0 extends ViewGroup {
    public final a0 E;
    public float F;
    public long G;
    public long H;
    public int[] I;
    public final rc J;
    public final f0 K;
    public final ArrayList f40781a;
    public final ArrayList f40782b;
    public final ArrayList f40783c;
    public final TextView d;
    public final ImageView f40784e;
    public final k f40785f;
    public final int h;
    public float f40786n;
    public float f40787r;
    public ValueAnimator f40788s;
    public boolean f40789w;
    public long f40790x;
    public boolean f40791y;

    public b0(f0 f0Var, Context context) {
        super(context);
        this.K = f0Var;
        this.f40781a = new ArrayList();
        this.f40782b = new ArrayList();
        this.f40783c = new ArrayList();
        this.h = org.telegram.messenger.g0.L(2.0f);
        this.f40787r = 1.0f;
        this.E = new a0(this, 1);
        this.J = new rc(this, 24);
        setBackgroundColor(-16777216);
        setChildrenDrawingOrderEnabled(true);
        this.f40786n = f0Var.f40885c;
        ImageView imageView = new ImageView(context);
        this.f40784e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(-1);
        imageView.setBackground(n6.L(org.telegram.messenger.g0.L(28.0f), 1711276032));
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
        this.f40785f = kVar;
        addView(kVar);
    }

    public static void a(b0 b0Var) {
        int width = b0Var.getWidth();
        int height = b0Var.getHeight();
        if (b0Var.f40789w && !b0Var.f40791y && width > 0 && height > 0 && !b0Var.f40781a.isEmpty() && b0Var.F > 0.0f && b0Var.c() && Math.abs(Math.log((width / height) / b0Var.F)) > 0.06d) {
            b0Var.g(true);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f40782b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            e0 e0Var = (e0) obj;
            e0Var.b();
            removeView(e0Var);
        }
        arrayList.clear();
        this.I = null;
    }

    public final boolean c() {
        Activity W = org.telegram.messenger.g0.W(getContext());
        if (W != null && org.telegram.messenger.g0.H1(W) && SystemClock.elapsedRealtime() - this.f40790x > 1000) {
            return true;
        }
        return false;
    }

    public final void d(e0 e0Var, int i7, int i10) {
        float f10;
        float f11;
        float f12;
        float[] fArr = e0Var.P;
        float f13 = this.f40787r;
        for (int i11 = 0; i11 < 4; i11++) {
            float f14 = e0Var.N[i11];
            fArr[i11] = com.google.android.gms.internal.vision.e2.z(e0Var.O[i11], f14, f13, f14);
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
        if (e0Var.getMeasuredWidth() != max || e0Var.getMeasuredHeight() != max2 || e0Var.isLayoutRequested()) {
            e0Var.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(max2, 1073741824));
        }
        e0Var.layout(round, round2, max + round, max2 + round2);
        float f26 = this.f40787r;
        float f27 = e0Var.Q;
        float f28 = ((e0Var.R - f27) * f26) + f27;
        e0Var.setAlpha(f28);
        float f29 = (f28 * 0.2f) + 0.8f;
        e0Var.setScaleX(f29);
        e0Var.setScaleY(f29);
    }

    public final void e() {
        int width = getWidth();
        int height = getHeight();
        if (width != 0 && height != 0) {
            ArrayList arrayList = this.f40782b;
            int size = arrayList.size();
            int i7 = 0;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d((e0) obj, width, height);
            }
            ArrayList arrayList2 = this.f40781a;
            int size2 = arrayList2.size();
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
                d((e0) obj2, width, height);
            }
            invalidate();
        }
    }

    public final boolean f(int i7, int i10) {
        if (Math.abs(Math.log((i7 / i10) / this.f40786n)) < 0.06d) {
            return true;
        }
        return false;
    }

    public final void g(boolean z10) {
        float f10;
        boolean z11;
        int i7;
        boolean z12;
        float f11;
        String str;
        float f12;
        int i10;
        boolean z13;
        ArrayList arrayList = this.f40781a;
        int size = arrayList.size();
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int[] iArr = new int[size];
        boolean z14 = false;
        for (int i11 = 0; i11 < size; i11++) {
            e0 e0Var = (e0) arrayList.get(i11);
            float f13 = e0Var.K;
            fArr[i11] = f13;
            u3 u3Var = e0Var.f40848b;
            if (u3Var != null && u3Var.f27216b) {
                f12 = 2.0f;
            } else {
                f12 = 1.0f;
            }
            fArr2[i11] = f12;
            boolean z15 = e0Var.M;
            if (z15) {
                i10 = i11;
            } else {
                i10 = -1;
            }
            iArr[i11] = i10;
            if (z15 && e0Var.L <= 0.0f && f13 > 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 |= z13;
        }
        if (z14) {
            f10 = 0.0f;
        } else {
            f10 = this.f40786n;
        }
        wi.j a10 = nd.a(fArr, fArr2, 0.45f, 2.35f, iArr, f10);
        int width = getWidth();
        int height = getHeight();
        float f14 = 0.001f;
        if (Math.abs(a10.f60105a - this.f40786n) <= 0.001f && width > 0 && height > 0 && !f(width, height) && c()) {
            float f15 = width / height;
            a10 = nd.a(fArr, fArr2, f15, f15, iArr, 0.0f);
            z11 = true;
        } else {
            z11 = false;
        }
        this.F = a10.f60105a;
        if (org.telegram.messenger.s2.f26829a) {
            StringBuilder sb2 = new StringBuilder("group call pip: mosaic ");
            sb2.append(Arrays.toString(fArr));
            if (z11) {
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
            e0 e0Var2 = (e0) obj;
            float f16 = this.f40787r;
            float f17 = f14;
            float[] fArr3 = e0Var2.N;
            for (int i13 = 0; i13 < 4; i13++) {
                float f18 = fArr3[i13];
                fArr3[i13] = com.google.android.gms.internal.vision.e2.z(e0Var2.O[i13], f18, f16, f18);
            }
            float f19 = e0Var2.Q;
            e0Var2.Q = com.google.android.gms.internal.vision.e2.z(e0Var2.R, f19, f16, f19);
            f14 = f17;
        }
        float f20 = f14;
        ArrayList arrayList2 = this.f40782b;
        int size3 = arrayList2.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj2 = arrayList2.get(i14);
            i14++;
            e0 e0Var3 = (e0) obj2;
            float f21 = this.f40787r;
            float[] fArr4 = e0Var3.N;
            float[] fArr5 = e0Var3.O;
            int i15 = 0;
            while (i15 < i7) {
                float f22 = fArr4[i15];
                fArr4[i15] = com.google.android.gms.internal.vision.e2.z(fArr5[i15], f22, f21, f22);
                i15++;
                i7 = 4;
            }
            float f23 = e0Var3.Q;
            e0Var3.Q = com.google.android.gms.internal.vision.e2.z(e0Var3.R, f23, f21, f23);
            System.arraycopy(e0Var3.N, 0, fArr5, 0, 4);
            e0Var3.R = 0.0f;
            i7 = 4;
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i16 = 0; i16 < size; i16++) {
            e0 e0Var4 = (e0) arrayList.get(i16);
            System.arraycopy(a10.f60106b, i16 * 4, e0Var4.O, 0, 4);
            e0Var4.R = 1.0f;
            e0Var4.L = fArr[i16];
            if (!e0Var4.M || !z10) {
                System.arraycopy(e0Var4.O, 0, e0Var4.N, 0, 4);
                if (z10) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                e0Var4.Q = f11;
                e0Var4.M = true;
            }
        }
        for (int i17 : a10.f60107c) {
            arrayList3.add((e0) arrayList.get(i17));
        }
        arrayList.clear();
        arrayList.addAll(arrayList3);
        this.I = null;
        if (!z11 && Math.abs(a10.f60105a - this.f40786n) > f20) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            this.f40786n = a10.f60105a;
            wi.n nVar = this.K.f40883a;
            if (nVar != null) {
                nVar.c();
            }
        }
        k();
        ValueAnimator valueAnimator = this.f40788s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f40788s.cancel();
            this.f40788s = null;
        }
        this.f40791y = false;
        a0 a0Var = this.E;
        org.telegram.messenger.g0.r(a0Var);
        if (z10) {
            this.f40787r = 0.0f;
            if (z12 && getWidth() > 0 && getHeight() > 0 && !f(getWidth(), getHeight())) {
                this.f40791y = true;
                org.telegram.messenger.g0.h3(a0Var, 500L);
            } else {
                h();
            }
        } else {
            this.f40787r = 1.0f;
            b();
        }
        e();
    }

    @Override
    public final int getChildDrawingOrder(int i7, int i10) {
        int[] iArr = this.I;
        if (iArr == null || iArr.length != i7) {
            int[] iArr2 = new int[i7];
            ArrayList arrayList = this.f40783c;
            int size = arrayList.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                int indexOfChild = indexOfChild((e0) obj);
                if (indexOfChild >= 0 && i11 < i7) {
                    iArr2[i11] = indexOfChild;
                    i11++;
                }
            }
            ArrayList arrayList2 = this.f40782b;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                int indexOfChild2 = indexOfChild((e0) obj2);
                if (indexOfChild2 >= 0 && i11 < i7) {
                    iArr2[i11] = indexOfChild2;
                    i11++;
                }
            }
            ArrayList arrayList3 = this.f40781a;
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList3.get(i14);
                i14++;
                int indexOfChild3 = indexOfChild((e0) obj3);
                if (indexOfChild3 >= 0 && i11 < i7) {
                    iArr2[i11] = indexOfChild3;
                    i11++;
                }
            }
            for (int i15 = 0; i15 < i7 && i11 < i7; i15++) {
                if (!(getChildAt(i15) instanceof e0)) {
                    iArr2[i11] = i15;
                    i11++;
                }
            }
            if (i11 != i7) {
                for (int i16 = 0; i16 < i7; i16++) {
                    iArr2[i16] = i16;
                }
            }
            this.I = iArr2;
        }
        return this.I[i10];
    }

    public final void h() {
        this.f40791y = false;
        org.telegram.messenger.g0.r(this.E);
        ValueAnimator valueAnimator = this.f40788s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f40788s.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f40788s = ofFloat;
        ofFloat.setDuration(420L);
        this.f40788s.setInterpolator(kr.h);
        this.f40788s.addUpdateListener(new s3(this, 16));
        this.f40788s.addListener(new x9(this, 12));
        this.f40788s.start();
    }

    public final void i() {
        if (!this.f40789w) {
            return;
        }
        int i7 = 0;
        this.f40789w = false;
        org.telegram.messenger.g0.r(this.J);
        this.f40785f.b();
        this.f40791y = false;
        org.telegram.messenger.g0.r(this.E);
        ValueAnimator valueAnimator = this.f40788s;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f40788s.cancel();
            this.f40788s = null;
        }
        ArrayList arrayList = this.f40781a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e0 e0Var = (e0) obj;
            e0Var.b();
            removeView(e0Var);
        }
        ArrayList arrayList2 = this.f40782b;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            e0 e0Var2 = (e0) obj2;
            e0Var2.b();
            removeView(e0Var2);
        }
        ArrayList arrayList3 = this.f40783c;
        int size3 = arrayList3.size();
        while (i7 < size3) {
            Object obj3 = arrayList3.get(i7);
            i7++;
            e0 e0Var3 = (e0) obj3;
            e0Var3.b();
            removeView(e0Var3);
        }
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
        this.f40787r = 1.0f;
    }

    public final void j(boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.b0.j(boolean):void");
    }

    public final void k() {
        int width = getWidth();
        int height = getHeight();
        if (width != 0 && height != 0) {
            ArrayList arrayList = this.f40781a;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                e0 e0Var = (e0) obj;
                float[] fArr = e0Var.O;
                int round = Math.round((fArr[2] - fArr[0]) * width);
                float[] fArr2 = e0Var.O;
                int round2 = Math.round((fArr2[3] - fArr2[1]) * height);
                int max = Math.max(1, round);
                int max2 = Math.max(1, round2);
                float f10 = e0Var.K;
                if (f10 > 0.0f) {
                    float f11 = max;
                    float f12 = max2;
                    if (f11 / f12 > f10) {
                        max2 = Math.round(f11 / f10);
                    } else {
                        max = Math.round(f12 * f10);
                    }
                }
                if (max != e0Var.S || max2 != e0Var.T) {
                    e0Var.S = max;
                    e0Var.T = max2;
                    e0Var.requestLayout();
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int L3 = org.telegram.messenger.g0.L(6.0f);
        ImageView imageView = this.f40784e;
        imageView.layout(L, L2, imageView.getMeasuredWidth() + L3, imageView.getMeasuredHeight() + org.telegram.messenger.g0.L(6.0f));
        int i13 = i11 - i7;
        TextView textView = this.d;
        int measuredWidth = (i13 - textView.getMeasuredWidth()) / 2;
        textView.layout(measuredWidth, org.telegram.messenger.g0.L(8.0f), textView.getMeasuredWidth() + measuredWidth, textView.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f));
        this.f40785f.layout(0, 0, i13, i12 - i10);
        e();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        this.f40784e.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), 1073741824));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - org.telegram.messenger.g0.L(64.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f40785f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        k();
        if (this.f40791y && i7 > 0 && i10 > 0 && f(i7, i10)) {
            post(this.E);
        } else if (!this.f40791y) {
            post(new a0(this, 0));
        }
    }

    @Override
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.I = null;
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.I = null;
    }
}
