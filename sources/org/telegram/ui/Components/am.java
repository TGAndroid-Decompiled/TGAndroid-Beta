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
public final class am extends ViewGroup {
    public long D;
    public zl E;
    public yl F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final m.f3 M;
    public final xl N;
    public int O;
    public final bm P;
    public final org.telegram.ui.Cells.t0 f31843a;
    public final ArrayList f31844b;
    public final HashMap f31845c;
    public HashMap d;
    public ArrayList f31846e;
    public HashMap f31847f;
    public ArrayList h;
    public final int f31848n;
    public final int f31849r;
    public int f31850s;
    public float f31851w;
    public float f31852x;
    public boolean[] f31853y;

    public am(bm bmVar, Context context) {
        super(context);
        this.P = bmVar;
        this.f31844b = new ArrayList();
        this.f31845c = new HashMap();
        this.f31848n = org.telegram.messenger.g0.L(16.0f);
        this.f31849r = org.telegram.messenger.g0.L(64.0f);
        this.f31850s = 0;
        this.f31853y = null;
        this.D = 0L;
        this.E = null;
        this.F = null;
        this.G = 0.0f;
        this.K = new PointF();
        this.L = false;
        this.M = new m.f3(this, 28);
        this.N = new xl(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context, bmVar.f32198n, true);
        this.f31843a = t0Var;
        t0Var.setCustomText(org.telegram.messenger.hd.M0(2131753960, null));
        addView(t0Var);
    }

    public final void a() {
        String str;
        this.d = this.P.P.getSelectedPhotos();
        this.f31846e = new ArrayList(this.d.entrySet());
        this.f31847f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f31844b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList2 = (ArrayList) ((zl) arrayList.get(i7)).f41058k.f39000f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) arrayList2.get(i10);
                    HashMap hashMap = this.f31845c;
                    if (hashMap.containsKey(gfVar)) {
                        Object obj = hashMap.get(gfVar);
                        this.f31847f.put(obj, gfVar);
                        this.h.add(obj);
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 < this.f31846e.size()) {
                                Map.Entry entry = (Map.Entry) this.f31846e.get(i11);
                                Object value = entry.getValue();
                                if (value == gfVar) {
                                    Object key = entry.getKey();
                                    this.f31847f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i11++;
                            } else {
                                int i12 = 0;
                                while (true) {
                                    if (i12 < this.f31846e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.f31846e.get(i12);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof org.telegram.messenger.gf) && (str = ((org.telegram.messenger.gf) value2).I) != null && gfVar != null && str.equals(gfVar.I)) {
                                            Object key2 = entry2.getKey();
                                            this.f31847f.put(key2, value2);
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
        bm bmVar = this.P;
        yl ylVar = bmVar.J;
        PointF pointF = this.K;
        if (ylVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!bmVar.K) {
            RectF f10 = ylVar.f(ylVar.e());
            RectF f11 = bmVar.J.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f10.width() / 2.0f) + f11.left, bmVar.D - ((bmVar.G - 0.5f) * bmVar.H), this.G);
            pointF.y = org.telegram.messenger.g0.T1((f10.height() / 2.0f) + bmVar.J.f40661a.f41050a + f11.top, (bmVar.E - ((bmVar.F - 0.5f) * bmVar.I)) + bmVar.M, this.G);
            return pointF;
        } else {
            RectF f12 = ylVar.f(ylVar.e());
            RectF f13 = bmVar.J.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f12.width() / 2.0f) + f13.left, this.H, this.G / this.J);
            pointF.y = org.telegram.messenger.g0.T1((f12.height() / 2.0f) + bmVar.J.f40661a.f41050a + f13.top, this.I, this.G / this.J);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.f31844b;
            if (i7 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((zl) arrayList.get(i7)).h;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                yl ylVar = (yl) arrayList2.get(i10);
                xh.e eVar = ylVar.f40677s;
                if (eVar != null) {
                    eVar.b(ylVar.O.f41072z);
                    ylVar.f40677s = null;
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
                zl zlVar = new zl(this);
                zl.a(zlVar, new vl(this.P, arrayList3), false);
                arrayList.add(zlVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        bm bmVar;
        bi.q1 q1Var;
        boolean z9;
        ArrayList arrayList = this.f31844b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f10 = this.f31848n;
        int computeVerticalScrollOffset = this.P.f32199r.computeVerticalScrollOffset();
        this.f31851w = Math.max(0, computeVerticalScrollOffset - bmVar.getListTopPadding());
        this.f31852x = (q1Var.getMeasuredHeight() - bmVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            float b10 = ((zl) arrayList.get(i7)).b() + f10;
            float f11 = this.f31851w;
            if ((f10 >= f11 && f10 <= this.f31852x) || ((b10 >= f11 && b10 <= this.f31852x) || (f10 <= f11 && b10 >= this.f31852x))) {
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
        int i7 = this.f31848n + this.f31849r;
        ArrayList arrayList = this.f31844b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i7 = (int) (((zl) arrayList.get(i10)).b() + i7);
        }
        org.telegram.ui.Cells.t0 t0Var = this.f31843a;
        if (t0Var.getMeasuredHeight() <= 0) {
            t0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22544q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return t0Var.getMeasuredHeight() + i7;
    }

    public final void f(zl zlVar, org.telegram.messenger.gf gfVar, int i7) {
        zl zlVar2;
        ArrayList arrayList = (ArrayList) zlVar.f41058k.f39000f;
        arrayList.add(Math.min(arrayList.size(), i7), gfVar);
        if (((ArrayList) zlVar.f41058k.f39000f).size() == 11) {
            org.telegram.messenger.gf gfVar2 = (org.telegram.messenger.gf) ((ArrayList) zlVar.f41058k.f39000f).get(10);
            ((ArrayList) zlVar.f41058k.f39000f).remove(10);
            ArrayList arrayList2 = this.f31844b;
            int indexOf = arrayList2.indexOf(zlVar);
            if (indexOf >= 0) {
                int i10 = indexOf + 1;
                if (i10 == arrayList2.size()) {
                    zlVar2 = null;
                } else {
                    zlVar2 = (zl) arrayList2.get(i10);
                }
                if (zlVar2 == null) {
                    zl zlVar3 = new zl(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(gfVar2);
                    zl.a(zlVar3, new vl(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(zlVar2, gfVar2, 0);
                }
            }
        }
        zl.a(zlVar, zlVar.f41058k, true);
    }

    public final void g() {
        float f10 = this.f31848n;
        ArrayList arrayList = this.f31844b;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            zl zlVar = (zl) arrayList.get(i10);
            float b10 = zlVar.b();
            zlVar.f41050a = f10;
            zlVar.f41051b = i7;
            f10 += b10;
            i7 += ((ArrayList) zlVar.f41058k.f39000f).size();
        }
    }

    public final void h() {
        bm bmVar = this.P;
        ValueAnimator valueAnimator = bmVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.G;
        this.J = f10;
        this.H = b10.x;
        this.I = b10.y;
        bmVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        bmVar.L = ofFloat;
        ofFloat.addUpdateListener(new wl(this, 1));
        bmVar.L.addListener(new z5(this, 14));
        bmVar.L.setDuration(200L);
        bmVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f31847f;
        ArrayList arrayList = this.h;
        tl tlVar = chatAttachAlertPhotoLayout.G;
        di diVar = chatAttachAlertPhotoLayout.f38969b;
        jl jlVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f31186s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f31187t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z9) {
            boolean z14 = false;
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.z0();
            int childCount = jlVar.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = jlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    int R = RecyclerView.R(childAt);
                    boolean z15 = tlVar.f38354f;
                    boolean z16 = tlVar.d;
                    if (z15 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z16 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    if (diVar.K2 != 0 || diVar.f33007y1) {
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
                        if (R == tlVar.b() - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        q5Var.d(e02, z11, z12, z13, diVar.Z1);
                        if ((diVar.W1 instanceof org.telegram.ui.an) && diVar.N3) {
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
            this.P.f38969b.K1(1);
        }
    }

    @Override
    public final void invalidate() {
        int e10 = jg.g.e(45.0f, org.telegram.messenger.g0.f22544q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f31850s != e10) {
            this.f31850s = e10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f31844b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            zl zlVar = (zl) arrayList.get(i7);
            if (((ArrayList) zlVar.f41058k.f39000f).size() < 10 && i7 < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) zlVar.f41058k.f39000f).size();
                zl zlVar2 = (zl) arrayList.get(i7 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) zlVar2.f41058k.f39000f).size());
                for (int i10 = 0; i10 < min; i10++) {
                    arrayList2.add((org.telegram.messenger.gf) ((ArrayList) zlVar2.f41058k.f39000f).remove(0));
                }
                ((ArrayList) zlVar.f41058k.f39000f).addAll(arrayList2);
                zl.a(zlVar, zlVar.f41058k, true);
                zl.a(zlVar2, zlVar2.f41058k, true);
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
        yl ylVar;
        float f12;
        float f13 = this.f31848n;
        bm bmVar = this.P;
        int computeVerticalScrollOffset = bmVar.f32199r.computeVerticalScrollOffset();
        this.f31851w = Math.max(0, computeVerticalScrollOffset - bmVar.getListTopPadding());
        this.f31852x = (q1Var.getMeasuredHeight() - bmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f13);
        ArrayList arrayList2 = this.f31844b;
        int size = arrayList2.size();
        float f14 = f13;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            zl zlVar = (zl) arrayList2.get(i12);
            float b10 = zlVar.b();
            zlVar.f41050a = f14;
            zlVar.f41051b = i13;
            float f15 = this.f31851w;
            if (f14 < f15 || f14 > this.f31852x) {
                float f16 = f14 + b10;
                if ((f16 < f15 || f16 > this.f31852x) && (f14 > f15 || f16 < this.f31852x)) {
                    f10 = b10;
                    arrayList = arrayList2;
                    i7 = size;
                    i10 = i12;
                    i11 = i13;
                    canvas.translate(0.0f, f10);
                    f14 += f10;
                    i13 = ((ArrayList) zlVar.f41058k.f39000f).size() + i11;
                    i12 = i10 + 1;
                    size = i7;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = zlVar.h;
            int i14 = zlVar.f41059l;
            org.telegram.ui.ActionBar.t4 t4Var = zlVar.f41070x;
            am amVar = zlVar.f41072z;
            arrayList = arrayList2;
            float interpolation = zlVar.f41057j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - zlVar.f41052c)) / 200.0f));
            if (interpolation < 1.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            Point point = org.telegram.messenger.g0.f22544q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float T1 = org.telegram.messenger.g0.T1(zlVar.f41054f, zlVar.d, interpolation);
            int width = amVar.getWidth();
            bm bmVar2 = amVar.P;
            float previewScale = width * T1 * bmVar2.getPreviewScale();
            boolean z10 = z9;
            float previewScale2 = bmVar2.getPreviewScale() * org.telegram.messenger.g0.T1(zlVar.f41055g, zlVar.f41053e, interpolation) * max;
            if (t4Var != null) {
                f11 = 2.0f;
                zlVar.f41063p = 0.0f;
                float width2 = amVar.getWidth();
                float f17 = i14;
                zlVar.f41061n = (width2 - Math.max(f17, previewScale)) / 2.0f;
                zlVar.f41062o = (Math.max(f17, previewScale) + amVar.getWidth()) / 2.0f;
                zlVar.f41064q = Math.max(i14 * 2, previewScale2);
                zlVar.f41070x.q(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                t4Var.setBounds((int) zlVar.f41061n, (int) zlVar.f41063p, (int) zlVar.f41062o, (int) zlVar.f41064q);
                if (zlVar.d <= 0.0f) {
                    f12 = 1.0f - interpolation;
                } else if (zlVar.f41054f <= 0.0f) {
                    f12 = interpolation;
                } else {
                    f12 = 1.0f;
                }
                t4Var.setAlpha((int) (f12 * 255.0f));
                t4Var.e(canvas, zlVar.f41071y, null);
                zlVar.f41063p += f17;
                zlVar.f41061n += f17;
                zlVar.f41064q -= f17;
                zlVar.f41062o -= f17;
            } else {
                f11 = 2.0f;
            }
            zlVar.f41065r = zlVar.f41062o - zlVar.f41061n;
            zlVar.f41066s = zlVar.f41064q - zlVar.f41063p;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                yl ylVar2 = (yl) arrayList3.get(i15);
                if (ylVar2 != null && (((ylVar = bmVar2.J) == null || ylVar.f40662b != ylVar2.f40662b) && ylVar2.c(canvas, false))) {
                    z10 = true;
                }
            }
            Paint paint = zlVar.f41069w;
            RectF rectF = zlVar.f41067t;
            long j3 = zlVar.f41056i;
            if (j3 <= 0) {
                i7 = size;
                i10 = i12;
                i11 = i13;
                f10 = b10;
            } else {
                if (zlVar.f41068u == null || zlVar.v != j3) {
                    zlVar.v = j3;
                    zlVar.f41068u = new my0(bi.dd.a1(false, org.telegram.messenger.hd.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
                float L = org.telegram.messenger.g0.L(28.0f) + zlVar.f41068u.f36125c;
                float L2 = org.telegram.messenger.g0.L(32.0f);
                float f18 = zlVar.f41061n;
                float f19 = zlVar.f41065r;
                float f20 = f11;
                float A = com.google.android.recaptcha.internal.a.A(f19, L, f20, f18);
                i7 = size;
                float f21 = zlVar.f41063p;
                i10 = i12;
                float f22 = zlVar.f41066s;
                i11 = i13;
                rectF.set(A, com.google.android.recaptcha.internal.a.A(f22, L2, f20, f21), org.telegram.messenger.k5.a(f19, L, f20, f18), org.telegram.messenger.k5.a(f22, L2, f20, f21));
                paint.setColor(1610612736);
                float f23 = L2 / f20;
                canvas.drawRoundRect(rectF, f23, f23, paint);
                f10 = b10;
                zlVar.f41068u.c(org.telegram.messenger.g0.L(14.0f) + (((zlVar.f41065r / f20) + zlVar.f41061n) - (L / f20)), zlVar.f41063p + (zlVar.f41066s / f20), 1.0f, -1, canvas);
            }
            if (z10) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f14 += f10;
            i13 = ((ArrayList) zlVar.f41058k.f39000f).size() + i11;
            i12 = i10 + 1;
            size = i7;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.t0 t0Var = this.f31843a;
        t0Var.i0(f14, t0Var.getMeasuredHeight());
        if (t0Var.Q()) {
            t0Var.E(canvas, true);
            t0Var.H(canvas, true);
        }
        t0Var.draw(canvas);
        canvas.restore();
        if (bmVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (bmVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Cells.t0 t0Var = this.f31843a;
        t0Var.layout(0, 0, t0Var.getMeasuredWidth(), t0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f31843a.measure(i7, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f31850s <= 0) {
            this.f31850s = jg.g.e(45.0f, org.telegram.messenger.g0.f22544q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), this.f31850s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.am.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
