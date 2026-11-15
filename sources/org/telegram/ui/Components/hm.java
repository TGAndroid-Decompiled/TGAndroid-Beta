package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public final class hm extends ViewGroup {
    public long E;
    public gm F;
    public fm G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final PointF L;
    public boolean M;
    public final zj N;
    public final em O;
    public int P;
    public final im Q;
    public final org.telegram.ui.Cells.t0 f35288a;
    public final ArrayList f35289b;
    public final HashMap f35290c;
    public HashMap d;
    public ArrayList f35291e;
    public HashMap f35292f;
    public ArrayList h;
    public final int f35293n;
    public final int f35294r;
    public int f35295s;
    public float f35296w;
    public float f35297x;
    public boolean[] f35298y;

    public hm(im imVar, Context context) {
        super(context);
        this.Q = imVar;
        this.f35289b = new ArrayList();
        this.f35290c = new HashMap();
        this.f35293n = org.telegram.messenger.g0.L(16.0f);
        this.f35294r = org.telegram.messenger.g0.L(64.0f);
        this.f35295s = 0;
        this.f35298y = null;
        this.E = 0L;
        this.F = null;
        this.G = null;
        this.H = 0.0f;
        this.L = new PointF();
        this.M = false;
        this.N = new zj(this, 1);
        this.O = new em(this);
        this.P = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context, imVar.f35649n, true);
        this.f35288a = t0Var;
        t0Var.setCustomText(org.telegram.messenger.hd.M0(2131753960, null));
        addView(t0Var);
    }

    public final void a() {
        String str;
        this.d = this.Q.Q.getSelectedPhotos();
        this.f35291e = new ArrayList(this.d.entrySet());
        this.f35292f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f35289b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList2 = (ArrayList) ((gm) arrayList.get(i7)).f35011k.f33636f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList2.get(i10);
                    HashMap hashMap = this.f35290c;
                    if (hashMap.containsKey(ffVar)) {
                        Object obj = hashMap.get(ffVar);
                        this.f35292f.put(obj, ffVar);
                        this.h.add(obj);
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 < this.f35291e.size()) {
                                Map.Entry entry = (Map.Entry) this.f35291e.get(i11);
                                Object value = entry.getValue();
                                if (value == ffVar) {
                                    Object key = entry.getKey();
                                    this.f35292f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i11++;
                            } else {
                                int i12 = 0;
                                while (true) {
                                    if (i12 < this.f35291e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.f35291e.get(i12);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof org.telegram.messenger.ff) && (str = ((org.telegram.messenger.ff) value2).I) != null && ffVar != null && str.equals(ffVar.I)) {
                                            Object key2 = entry2.getKey();
                                            this.f35292f.put(key2, value2);
                                            this.h.add(key2);
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final PointF b() {
        im imVar = this.Q;
        fm fmVar = imVar.K;
        PointF pointF = this.L;
        if (fmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!imVar.L) {
            RectF f10 = fmVar.f(fmVar.e());
            RectF f11 = imVar.K.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f10.width() / 2.0f) + f11.left, imVar.E - ((imVar.H - 0.5f) * imVar.I), this.H);
            pointF.y = org.telegram.messenger.g0.T1((f10.height() / 2.0f) + imVar.K.f34628a.f35003a + f11.top, (imVar.F - ((imVar.G - 0.5f) * imVar.J)) + imVar.N, this.H);
            return pointF;
        } else {
            RectF f12 = fmVar.f(fmVar.e());
            RectF f13 = imVar.K.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f12.width() / 2.0f) + f13.left, this.I, this.H / this.K);
            pointF.y = org.telegram.messenger.g0.T1((f12.height() / 2.0f) + imVar.K.f34628a.f35003a + f13.top, this.J, this.H / this.K);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.f35289b;
            if (i7 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((gm) arrayList.get(i7)).h;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                fm fmVar = (fm) arrayList2.get(i10);
                xh.e eVar = fmVar.f34644s;
                if (eVar != null) {
                    eVar.b(fmVar.O.f35025z);
                    fmVar.f34644s = null;
                }
            }
            i7++;
        }
        arrayList.clear();
        ArrayList arrayList3 = new ArrayList();
        int size = this.h.size();
        int i11 = size - 1;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) this.h.get(i12);
            num.getClass();
            arrayList3.add((org.telegram.messenger.ff) this.d.get(num));
            if (i12 % 10 == 9 || i12 == i11) {
                gm gmVar = new gm(this);
                gm.a(gmVar, new cm(this.Q, arrayList3), false);
                arrayList.add(gmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        im imVar;
        di.c1 c1Var;
        boolean z10;
        ArrayList arrayList = this.f35289b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f10 = this.f35293n;
        int computeVerticalScrollOffset = this.Q.f35650r.computeVerticalScrollOffset();
        this.f35296w = Math.max(0, computeVerticalScrollOffset - imVar.getListTopPadding());
        this.f35297x = (c1Var.getMeasuredHeight() - imVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            float b10 = ((gm) arrayList.get(i7)).b() + f10;
            float f11 = this.f35296w;
            if ((f10 >= f11 && f10 <= this.f35297x) || ((b10 >= f11 && b10 <= this.f35297x) || (f10 <= f11 && b10 >= this.f35297x))) {
                z10 = true;
            } else {
                z10 = false;
            }
            zArr[i7] = z10;
            i7++;
            f10 = b10;
        }
        return zArr;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    public final int e() {
        int i7 = this.f35293n + this.f35294r;
        ArrayList arrayList = this.f35289b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i7 = (int) (((gm) arrayList.get(i10)).b() + i7);
        }
        org.telegram.ui.Cells.t0 t0Var = this.f35288a;
        if (t0Var.getMeasuredHeight() <= 0) {
            t0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f23611q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return t0Var.getMeasuredHeight() + i7;
    }

    public final void f(gm gmVar, org.telegram.messenger.ff ffVar, int i7) {
        gm gmVar2;
        ArrayList arrayList = (ArrayList) gmVar.f35011k.f33636f;
        arrayList.add(Math.min(arrayList.size(), i7), ffVar);
        if (((ArrayList) gmVar.f35011k.f33636f).size() == 11) {
            org.telegram.messenger.ff ffVar2 = (org.telegram.messenger.ff) ((ArrayList) gmVar.f35011k.f33636f).get(10);
            ((ArrayList) gmVar.f35011k.f33636f).remove(10);
            ArrayList arrayList2 = this.f35289b;
            int indexOf = arrayList2.indexOf(gmVar);
            if (indexOf >= 0) {
                int i10 = indexOf + 1;
                if (i10 == arrayList2.size()) {
                    gmVar2 = null;
                } else {
                    gmVar2 = (gm) arrayList2.get(i10);
                }
                if (gmVar2 == null) {
                    gm gmVar3 = new gm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(ffVar2);
                    gm.a(gmVar3, new cm(this.Q, arrayList3), true);
                    invalidate();
                } else {
                    f(gmVar2, ffVar2, 0);
                }
            }
        }
        gm.a(gmVar, gmVar.f35011k, true);
    }

    public final void g() {
        float f10 = this.f35293n;
        ArrayList arrayList = this.f35289b;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            gm gmVar = (gm) arrayList.get(i10);
            float b10 = gmVar.b();
            gmVar.f35003a = f10;
            gmVar.f35004b = i7;
            f10 += b10;
            i7 += ((ArrayList) gmVar.f35011k.f33636f).size();
        }
    }

    public final void h() {
        im imVar = this.Q;
        ValueAnimator valueAnimator = imVar.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.H;
        this.K = f10;
        this.I = b10.x;
        this.J = b10.y;
        imVar.L = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        imVar.M = ofFloat;
        ofFloat.addUpdateListener(new dm(this, 1));
        imVar.M.addListener(new x5(this, 14));
        imVar.M.setDuration(200L);
        imVar.M.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f35292f;
        ArrayList arrayList = this.h;
        am amVar = chatAttachAlertPhotoLayout.H;
        ki kiVar = chatAttachAlertPhotoLayout.f33609b;
        ql qlVar = chatAttachAlertPhotoLayout.F;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f32367t1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f32368u1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            boolean z15 = false;
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.z0();
            int childCount = qlVar.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = qlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    int R = RecyclerView.R(childAt);
                    boolean z16 = amVar.f33019f;
                    boolean z17 = amVar.d;
                    if (z16 && R > chatAttachAlertPhotoLayout.N0) {
                        R--;
                    }
                    if (z17 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                        R--;
                    }
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    if (kiVar.O2 != 0 || kiVar.C1) {
                        q5Var.getCheckBox().setVisibility(8);
                    }
                    org.telegram.messenger.ff e02 = chatAttachAlertPhotoLayout.e0(R);
                    if (e02 != null) {
                        int i10 = e02.C;
                        if (hashMap2.size() > 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z17 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (R == amVar.b() - 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        q5Var.d(e02, z12, z13, z14, kiVar.d2);
                        if ((kiVar.f36424a2 instanceof org.telegram.ui.an) && kiVar.R3) {
                            z11 = false;
                            q5Var.b(arrayList2.indexOf(Integer.valueOf(i10)), hashMap2.containsKey(Integer.valueOf(i10)), false);
                        } else {
                            z11 = false;
                            q5Var.b(-1, hashMap2.containsKey(Integer.valueOf(i10)), false);
                        }
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = z15;
                }
                i7++;
                z15 = z11;
            }
        }
        if (size != this.h.size()) {
            this.Q.f33609b.K1(1);
        }
    }

    @Override
    public final void invalidate() {
        int d = i5.c.d(45.0f, org.telegram.messenger.g0.f23611q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f35295s != d) {
            this.f35295s = d;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f35289b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            gm gmVar = (gm) arrayList.get(i7);
            if (((ArrayList) gmVar.f35011k.f33636f).size() < 10 && i7 < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) gmVar.f35011k.f33636f).size();
                gm gmVar2 = (gm) arrayList.get(i7 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) gmVar2.f35011k.f33636f).size());
                for (int i10 = 0; i10 < min; i10++) {
                    arrayList2.add((org.telegram.messenger.ff) ((ArrayList) gmVar2.f35011k.f33636f).remove(0));
                }
                ((ArrayList) gmVar.f35011k.f33636f).addAll(arrayList2);
                gm.a(gmVar, gmVar.f35011k, true);
                gm.a(gmVar2, gmVar2.f35011k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        di.c1 c1Var;
        float f10;
        ArrayList arrayList;
        int i7;
        int i10;
        int i11;
        boolean z10;
        float f11;
        fm fmVar;
        float f12;
        float f13 = this.f35293n;
        im imVar = this.Q;
        int computeVerticalScrollOffset = imVar.f35650r.computeVerticalScrollOffset();
        this.f35296w = Math.max(0, computeVerticalScrollOffset - imVar.getListTopPadding());
        this.f35297x = (c1Var.getMeasuredHeight() - imVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f13);
        ArrayList arrayList2 = this.f35289b;
        int size = arrayList2.size();
        float f14 = f13;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            gm gmVar = (gm) arrayList2.get(i12);
            float b10 = gmVar.b();
            gmVar.f35003a = f14;
            gmVar.f35004b = i13;
            float f15 = this.f35296w;
            if (f14 < f15 || f14 > this.f35297x) {
                float f16 = f14 + b10;
                if ((f16 < f15 || f16 > this.f35297x) && (f14 > f15 || f16 < this.f35297x)) {
                    f10 = b10;
                    arrayList = arrayList2;
                    i7 = size;
                    i10 = i12;
                    i11 = i13;
                    canvas.translate(0.0f, f10);
                    f14 += f10;
                    i13 = ((ArrayList) gmVar.f35011k.f33636f).size() + i11;
                    i12 = i10 + 1;
                    size = i7;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = gmVar.h;
            int i14 = gmVar.f35012l;
            org.telegram.ui.ActionBar.r4 r4Var = gmVar.f35023x;
            hm hmVar = gmVar.f35025z;
            arrayList = arrayList2;
            float interpolation = gmVar.f35010j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - gmVar.f35005c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = org.telegram.messenger.g0.f23611q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float T1 = org.telegram.messenger.g0.T1(gmVar.f35007f, gmVar.d, interpolation);
            int width = hmVar.getWidth();
            im imVar2 = hmVar.Q;
            float previewScale = width * T1 * imVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = imVar2.getPreviewScale() * org.telegram.messenger.g0.T1(gmVar.f35008g, gmVar.f35006e, interpolation) * max;
            if (r4Var != null) {
                f11 = 2.0f;
                gmVar.f35016p = 0.0f;
                float width2 = hmVar.getWidth();
                float f17 = i14;
                gmVar.f35014n = (width2 - Math.max(f17, previewScale)) / 2.0f;
                gmVar.f35015o = (Math.max(f17, previewScale) + hmVar.getWidth()) / 2.0f;
                gmVar.f35017q = Math.max(i14 * 2, previewScale2);
                gmVar.f35023x.p(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                r4Var.setBounds((int) gmVar.f35014n, (int) gmVar.f35016p, (int) gmVar.f35015o, (int) gmVar.f35017q);
                if (gmVar.d <= 0.0f) {
                    f12 = 1.0f - interpolation;
                } else if (gmVar.f35007f <= 0.0f) {
                    f12 = interpolation;
                } else {
                    f12 = 1.0f;
                }
                r4Var.setAlpha((int) (f12 * 255.0f));
                r4Var.d(canvas, gmVar.f35024y, null);
                gmVar.f35016p += f17;
                gmVar.f35014n += f17;
                gmVar.f35017q -= f17;
                gmVar.f35015o -= f17;
            } else {
                f11 = 2.0f;
            }
            gmVar.f35018r = gmVar.f35015o - gmVar.f35014n;
            gmVar.f35019s = gmVar.f35017q - gmVar.f35016p;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                fm fmVar2 = (fm) arrayList3.get(i15);
                if (fmVar2 != null && (((fmVar = imVar2.K) == null || fmVar.f34629b != fmVar2.f34629b) && fmVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = gmVar.f35022w;
            RectF rectF = gmVar.f35020t;
            long j3 = gmVar.f35009i;
            if (j3 <= 0) {
                i7 = size;
                i10 = i12;
                i11 = i13;
                f10 = b10;
            } else {
                if (gmVar.f35021u == null || gmVar.v != j3) {
                    gmVar.v = j3;
                    gmVar.f35021u = new oy0(di.lb.a1(false, org.telegram.messenger.hd.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
                float L = org.telegram.messenger.g0.L(28.0f) + gmVar.f35021u.f38103c;
                float L2 = org.telegram.messenger.g0.L(32.0f);
                float f18 = gmVar.f35014n;
                float f19 = gmVar.f35018r;
                float f20 = f11;
                float A = com.google.android.gms.internal.vision.e2.A(f19, L, f20, f18);
                i7 = size;
                float f21 = gmVar.f35016p;
                i10 = i12;
                float f22 = gmVar.f35019s;
                i11 = i13;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f22, L2, f20, f21), org.telegram.messenger.k5.a(f19, L, f20, f18), org.telegram.messenger.k5.a(f22, L2, f20, f21));
                paint.setColor(1610612736);
                float f23 = L2 / f20;
                canvas.drawRoundRect(rectF, f23, f23, paint);
                f10 = b10;
                gmVar.f35021u.c(org.telegram.messenger.g0.L(14.0f) + (((gmVar.f35018r / f20) + gmVar.f35014n) - (L / f20)), gmVar.f35016p + (gmVar.f35019s / f20), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f14 += f10;
            i13 = ((ArrayList) gmVar.f35011k.f33636f).size() + i11;
            i12 = i10 + 1;
            size = i7;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.t0 t0Var = this.f35288a;
        t0Var.j0(f14, t0Var.getMeasuredHeight());
        if (t0Var.T()) {
            t0Var.H(canvas, true);
            t0Var.K(canvas, true);
        }
        t0Var.draw(canvas);
        canvas.restore();
        if (imVar.K != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (imVar.K.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Cells.t0 t0Var = this.f35288a;
        t0Var.layout(0, 0, t0Var.getMeasuredWidth(), t0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f35288a.measure(i7, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f35295s <= 0) {
            this.f35295s = i5.c.d(45.0f, org.telegram.messenger.g0.f23611q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), this.f35295s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hm.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
