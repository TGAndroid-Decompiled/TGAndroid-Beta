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
public final class zl extends ViewGroup {
    public long D;
    public yl E;
    public xl F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final m.f3 M;
    public final wl N;
    public int O;
    public final am P;
    public final org.telegram.ui.Cells.t0 f41053a;
    public final ArrayList f41054b;
    public final HashMap f41055c;
    public HashMap d;
    public ArrayList f41056e;
    public HashMap f41057f;
    public ArrayList h;
    public final int f41058n;
    public final int f41059r;
    public int f41060s;
    public float f41061w;
    public float f41062x;
    public boolean[] f41063y;

    public zl(am amVar, Context context) {
        super(context);
        this.P = amVar;
        this.f41054b = new ArrayList();
        this.f41055c = new HashMap();
        this.f41058n = org.telegram.messenger.g0.L(16.0f);
        this.f41059r = org.telegram.messenger.g0.L(64.0f);
        this.f41060s = 0;
        this.f41063y = null;
        this.D = 0L;
        this.E = null;
        this.F = null;
        this.G = 0.0f;
        this.K = new PointF();
        this.L = false;
        this.M = new m.f3(this, 28);
        this.N = new wl(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context, amVar.f31879n, true);
        this.f41053a = t0Var;
        t0Var.setCustomText(org.telegram.messenger.id.M0(2131753960, null));
        addView(t0Var);
    }

    public final void a() {
        String str;
        this.d = this.P.P.getSelectedPhotos();
        this.f41056e = new ArrayList(this.d.entrySet());
        this.f41057f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f41054b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList2 = (ArrayList) ((yl) arrayList.get(i7)).f40603k.f38708f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) arrayList2.get(i10);
                    HashMap hashMap = this.f41055c;
                    if (hashMap.containsKey(gfVar)) {
                        Object obj = hashMap.get(gfVar);
                        this.f41057f.put(obj, gfVar);
                        this.h.add(obj);
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 < this.f41056e.size()) {
                                Map.Entry entry = (Map.Entry) this.f41056e.get(i11);
                                Object value = entry.getValue();
                                if (value == gfVar) {
                                    Object key = entry.getKey();
                                    this.f41057f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i11++;
                            } else {
                                int i12 = 0;
                                while (true) {
                                    if (i12 < this.f41056e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.f41056e.get(i12);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof org.telegram.messenger.gf) && (str = ((org.telegram.messenger.gf) value2).I) != null && gfVar != null && str.equals(gfVar.I)) {
                                            Object key2 = entry2.getKey();
                                            this.f41057f.put(key2, value2);
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
        am amVar = this.P;
        xl xlVar = amVar.J;
        PointF pointF = this.K;
        if (xlVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!amVar.K) {
            RectF f10 = xlVar.f(xlVar.e());
            RectF f11 = amVar.J.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f10.width() / 2.0f) + f11.left, amVar.D - ((amVar.G - 0.5f) * amVar.H), this.G);
            pointF.y = org.telegram.messenger.g0.T1((f10.height() / 2.0f) + amVar.J.f40327a.f40595a + f11.top, (amVar.E - ((amVar.F - 0.5f) * amVar.I)) + amVar.M, this.G);
            return pointF;
        } else {
            RectF f12 = xlVar.f(xlVar.e());
            RectF f13 = amVar.J.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f12.width() / 2.0f) + f13.left, this.H, this.G / this.J);
            pointF.y = org.telegram.messenger.g0.T1((f12.height() / 2.0f) + amVar.J.f40327a.f40595a + f13.top, this.I, this.G / this.J);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.f41054b;
            if (i7 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((yl) arrayList.get(i7)).h;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                xl xlVar = (xl) arrayList2.get(i10);
                xh.e eVar = xlVar.f40343s;
                if (eVar != null) {
                    eVar.b(xlVar.O.f40617z);
                    xlVar.f40343s = null;
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
            arrayList3.add((org.telegram.messenger.gf) this.d.get(num));
            if (i12 % 10 == 9 || i12 == i11) {
                yl ylVar = new yl(this);
                yl.a(ylVar, new ul(this.P, arrayList3), false);
                arrayList.add(ylVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        am amVar;
        bi.q1 q1Var;
        boolean z9;
        ArrayList arrayList = this.f41054b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f10 = this.f41058n;
        int computeVerticalScrollOffset = this.P.f31880r.computeVerticalScrollOffset();
        this.f41061w = Math.max(0, computeVerticalScrollOffset - amVar.getListTopPadding());
        this.f41062x = (q1Var.getMeasuredHeight() - amVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            float b10 = ((yl) arrayList.get(i7)).b() + f10;
            float f11 = this.f41061w;
            if ((f10 >= f11 && f10 <= this.f41062x) || ((b10 >= f11 && b10 <= this.f41062x) || (f10 <= f11 && b10 >= this.f41062x))) {
                z9 = true;
            } else {
                z9 = false;
            }
            zArr[i7] = z9;
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
        int i7 = this.f41058n + this.f41059r;
        ArrayList arrayList = this.f41054b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i7 = (int) (((yl) arrayList.get(i10)).b() + i7);
        }
        org.telegram.ui.Cells.t0 t0Var = this.f41053a;
        if (t0Var.getMeasuredHeight() <= 0) {
            t0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22567q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return t0Var.getMeasuredHeight() + i7;
    }

    public final void f(yl ylVar, org.telegram.messenger.gf gfVar, int i7) {
        yl ylVar2;
        ArrayList arrayList = (ArrayList) ylVar.f40603k.f38708f;
        arrayList.add(Math.min(arrayList.size(), i7), gfVar);
        if (((ArrayList) ylVar.f40603k.f38708f).size() == 11) {
            org.telegram.messenger.gf gfVar2 = (org.telegram.messenger.gf) ((ArrayList) ylVar.f40603k.f38708f).get(10);
            ((ArrayList) ylVar.f40603k.f38708f).remove(10);
            ArrayList arrayList2 = this.f41054b;
            int indexOf = arrayList2.indexOf(ylVar);
            if (indexOf >= 0) {
                int i10 = indexOf + 1;
                if (i10 == arrayList2.size()) {
                    ylVar2 = null;
                } else {
                    ylVar2 = (yl) arrayList2.get(i10);
                }
                if (ylVar2 == null) {
                    yl ylVar3 = new yl(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(gfVar2);
                    yl.a(ylVar3, new ul(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(ylVar2, gfVar2, 0);
                }
            }
        }
        yl.a(ylVar, ylVar.f40603k, true);
    }

    public final void g() {
        float f10 = this.f41058n;
        ArrayList arrayList = this.f41054b;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            yl ylVar = (yl) arrayList.get(i10);
            float b10 = ylVar.b();
            ylVar.f40595a = f10;
            ylVar.f40596b = i7;
            f10 += b10;
            i7 += ((ArrayList) ylVar.f40603k.f38708f).size();
        }
    }

    public final void h() {
        am amVar = this.P;
        ValueAnimator valueAnimator = amVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.G;
        this.J = f10;
        this.H = b10.x;
        this.I = b10.y;
        amVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        amVar.L = ofFloat;
        ofFloat.addUpdateListener(new vl(this, 1));
        amVar.L.addListener(new y5(this, 14));
        amVar.L.setDuration(200L);
        amVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f41057f;
        ArrayList arrayList = this.h;
        sl slVar = chatAttachAlertPhotoLayout.G;
        ci ciVar = chatAttachAlertPhotoLayout.f38656b;
        il ilVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f31206s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f31207t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z9) {
            boolean z14 = false;
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.z0();
            int childCount = ilVar.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = ilVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    int R = RecyclerView.R(childAt);
                    boolean z15 = slVar.f38020f;
                    boolean z16 = slVar.d;
                    if (z15 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z16 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    if (ciVar.N2 != 0 || ciVar.B1) {
                        q5Var.getCheckBox().setVisibility(8);
                    }
                    org.telegram.messenger.gf e02 = chatAttachAlertPhotoLayout.e0(R);
                    if (e02 != null) {
                        int i10 = e02.C;
                        if (hashMap2.size() > 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z16 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (R == slVar.b() - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        q5Var.d(e02, z11, z12, z13, ciVar.f32597c2);
                        if ((ciVar.Z1 instanceof org.telegram.ui.cn) && ciVar.Q3) {
                            z10 = false;
                            q5Var.b(arrayList2.indexOf(Integer.valueOf(i10)), hashMap2.containsKey(Integer.valueOf(i10)), false);
                        } else {
                            z10 = false;
                            q5Var.b(-1, hashMap2.containsKey(Integer.valueOf(i10)), false);
                        }
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = z14;
                }
                i7++;
                z14 = z10;
            }
        }
        if (size != this.h.size()) {
            this.P.f38656b.K1(1);
        }
    }

    @Override
    public final void invalidate() {
        int e10 = jg.g.e(45.0f, org.telegram.messenger.g0.f22567q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), e());
        if (this.f41060s != e10) {
            this.f41060s = e10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f41054b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            yl ylVar = (yl) arrayList.get(i7);
            if (((ArrayList) ylVar.f40603k.f38708f).size() < 10 && i7 < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) ylVar.f40603k.f38708f).size();
                yl ylVar2 = (yl) arrayList.get(i7 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) ylVar2.f40603k.f38708f).size());
                for (int i10 = 0; i10 < min; i10++) {
                    arrayList2.add((org.telegram.messenger.gf) ((ArrayList) ylVar2.f40603k.f38708f).remove(0));
                }
                ((ArrayList) ylVar.f40603k.f38708f).addAll(arrayList2);
                yl.a(ylVar, ylVar.f40603k, true);
                yl.a(ylVar2, ylVar2.f40603k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bi.q1 q1Var;
        float f10;
        ArrayList arrayList;
        int i7;
        int i10;
        int i11;
        boolean z9;
        float f11;
        xl xlVar;
        float f12;
        float f13 = this.f41058n;
        am amVar = this.P;
        int computeVerticalScrollOffset = amVar.f31880r.computeVerticalScrollOffset();
        this.f41061w = Math.max(0, computeVerticalScrollOffset - amVar.getListTopPadding());
        this.f41062x = (q1Var.getMeasuredHeight() - amVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f13);
        ArrayList arrayList2 = this.f41054b;
        int size = arrayList2.size();
        float f14 = f13;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            yl ylVar = (yl) arrayList2.get(i12);
            float b10 = ylVar.b();
            ylVar.f40595a = f14;
            ylVar.f40596b = i13;
            float f15 = this.f41061w;
            if (f14 < f15 || f14 > this.f41062x) {
                float f16 = f14 + b10;
                if ((f16 < f15 || f16 > this.f41062x) && (f14 > f15 || f16 < this.f41062x)) {
                    f10 = b10;
                    arrayList = arrayList2;
                    i7 = size;
                    i10 = i12;
                    i11 = i13;
                    canvas.translate(0.0f, f10);
                    f14 += f10;
                    i13 = ((ArrayList) ylVar.f40603k.f38708f).size() + i11;
                    i12 = i10 + 1;
                    size = i7;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = ylVar.h;
            int i14 = ylVar.f40604l;
            org.telegram.ui.ActionBar.u4 u4Var = ylVar.f40615x;
            zl zlVar = ylVar.f40617z;
            arrayList = arrayList2;
            float interpolation = ylVar.f40602j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - ylVar.f40597c)) / 200.0f));
            if (interpolation < 1.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            Point point = org.telegram.messenger.g0.f22567q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float T1 = org.telegram.messenger.g0.T1(ylVar.f40599f, ylVar.d, interpolation);
            int width = zlVar.getWidth();
            am amVar2 = zlVar.P;
            float previewScale = width * T1 * amVar2.getPreviewScale();
            boolean z10 = z9;
            float previewScale2 = amVar2.getPreviewScale() * org.telegram.messenger.g0.T1(ylVar.f40600g, ylVar.f40598e, interpolation) * max;
            if (u4Var != null) {
                f11 = 2.0f;
                ylVar.f40608p = 0.0f;
                float width2 = zlVar.getWidth();
                float f17 = i14;
                ylVar.f40606n = (width2 - Math.max(f17, previewScale)) / 2.0f;
                ylVar.f40607o = (Math.max(f17, previewScale) + zlVar.getWidth()) / 2.0f;
                ylVar.f40609q = Math.max(i14 * 2, previewScale2);
                ylVar.f40615x.p(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                u4Var.setBounds((int) ylVar.f40606n, (int) ylVar.f40608p, (int) ylVar.f40607o, (int) ylVar.f40609q);
                if (ylVar.d <= 0.0f) {
                    f12 = 1.0f - interpolation;
                } else if (ylVar.f40599f <= 0.0f) {
                    f12 = interpolation;
                } else {
                    f12 = 1.0f;
                }
                u4Var.setAlpha((int) (f12 * 255.0f));
                u4Var.d(canvas, ylVar.f40616y, null);
                ylVar.f40608p += f17;
                ylVar.f40606n += f17;
                ylVar.f40609q -= f17;
                ylVar.f40607o -= f17;
            } else {
                f11 = 2.0f;
            }
            ylVar.f40610r = ylVar.f40607o - ylVar.f40606n;
            ylVar.f40611s = ylVar.f40609q - ylVar.f40608p;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                xl xlVar2 = (xl) arrayList3.get(i15);
                if (xlVar2 != null && (((xlVar = amVar2.J) == null || xlVar.f40328b != xlVar2.f40328b) && xlVar2.c(canvas, false))) {
                    z10 = true;
                }
            }
            Paint paint = ylVar.f40614w;
            RectF rectF = ylVar.f40612t;
            long j3 = ylVar.f40601i;
            if (j3 <= 0) {
                i7 = size;
                i10 = i12;
                i11 = i13;
                f10 = b10;
            } else {
                if (ylVar.f40613u == null || ylVar.v != j3) {
                    ylVar.v = j3;
                    ylVar.f40613u = new my0(bi.dd.a1(false, org.telegram.messenger.id.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
                float L = org.telegram.messenger.g0.L(28.0f) + ylVar.f40613u.f36133c;
                float L2 = org.telegram.messenger.g0.L(32.0f);
                float f18 = ylVar.f40606n;
                float f19 = ylVar.f40610r;
                float f20 = f11;
                float A = com.google.android.recaptcha.internal.a.A(f19, L, f20, f18);
                i7 = size;
                float f21 = ylVar.f40608p;
                i10 = i12;
                float f22 = ylVar.f40611s;
                i11 = i13;
                rectF.set(A, com.google.android.recaptcha.internal.a.A(f22, L2, f20, f21), org.telegram.messenger.k5.a(f19, L, f20, f18), org.telegram.messenger.k5.a(f22, L2, f20, f21));
                paint.setColor(1610612736);
                float f23 = L2 / f20;
                canvas.drawRoundRect(rectF, f23, f23, paint);
                f10 = b10;
                ylVar.f40613u.c(org.telegram.messenger.g0.L(14.0f) + (((ylVar.f40610r / f20) + ylVar.f40606n) - (L / f20)), ylVar.f40608p + (ylVar.f40611s / f20), 1.0f, -1, canvas);
            }
            if (z10) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f14 += f10;
            i13 = ((ArrayList) ylVar.f40603k.f38708f).size() + i11;
            i12 = i10 + 1;
            size = i7;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.t0 t0Var = this.f41053a;
        t0Var.i0(f14, t0Var.getMeasuredHeight());
        if (t0Var.Q()) {
            t0Var.E(canvas, true);
            t0Var.H(canvas, true);
        }
        t0Var.draw(canvas);
        canvas.restore();
        if (amVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (amVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Cells.t0 t0Var = this.f41053a;
        t0Var.layout(0, 0, t0Var.getMeasuredWidth(), t0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f41053a.measure(i7, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f41060s <= 0) {
            this.f41060s = jg.g.e(45.0f, org.telegram.messenger.g0.f22567q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), this.f41060s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zl.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
