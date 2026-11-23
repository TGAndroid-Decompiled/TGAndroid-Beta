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
public final class qm extends ViewGroup {
    public long E;
    public pm F;
    public om G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final PointF L;
    public boolean M;
    public final ik N;
    public final nm O;
    public int P;
    public final rm Q;
    public final org.telegram.ui.Cells.v0 f38943a;
    public final ArrayList f38944b;
    public final HashMap f38945c;
    public HashMap d;
    public ArrayList f38946e;
    public HashMap f38947f;
    public ArrayList h;
    public final int f38948n;
    public final int f38949r;
    public int f38950s;
    public float f38951w;
    public float f38952x;
    public boolean[] f38953y;

    public qm(rm rmVar, Context context) {
        super(context);
        this.Q = rmVar;
        this.f38944b = new ArrayList();
        this.f38945c = new HashMap();
        this.f38948n = org.telegram.messenger.g0.L(16.0f);
        this.f38949r = org.telegram.messenger.g0.L(64.0f);
        this.f38950s = 0;
        this.f38953y = null;
        this.E = 0L;
        this.F = null;
        this.G = null;
        this.H = 0.0f;
        this.L = new PointF();
        this.M = false;
        this.N = new ik(this, 1);
        this.O = new nm(this);
        this.P = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, rmVar.f39279n, true);
        this.f38943a = v0Var;
        v0Var.setCustomText(org.telegram.messenger.hd.N0(2131753957, null));
        addView(v0Var);
    }

    public final void a() {
        String str;
        this.d = this.Q.Q.getSelectedPhotos();
        this.f38946e = new ArrayList(this.d.entrySet());
        this.f38947f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f38944b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList2 = (ArrayList) ((pm) arrayList.get(i7)).f38622k.f37241f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList2.get(i10);
                    HashMap hashMap = this.f38945c;
                    if (hashMap.containsKey(ffVar)) {
                        Object obj = hashMap.get(ffVar);
                        this.f38947f.put(obj, ffVar);
                        this.h.add(obj);
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 < this.f38946e.size()) {
                                Map.Entry entry = (Map.Entry) this.f38946e.get(i11);
                                Object value = entry.getValue();
                                if (value == ffVar) {
                                    Object key = entry.getKey();
                                    this.f38947f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i11++;
                            } else {
                                int i12 = 0;
                                while (true) {
                                    if (i12 < this.f38946e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.f38946e.get(i12);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof org.telegram.messenger.ff) && (str = ((org.telegram.messenger.ff) value2).I) != null && ffVar != null && str.equals(ffVar.I)) {
                                            Object key2 = entry2.getKey();
                                            this.f38947f.put(key2, value2);
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
        rm rmVar = this.Q;
        om omVar = rmVar.K;
        PointF pointF = this.L;
        if (omVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!rmVar.L) {
            RectF f10 = omVar.f(omVar.e());
            RectF f11 = rmVar.K.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f10.width() / 2.0f) + f11.left, rmVar.E - ((rmVar.H - 0.5f) * rmVar.I), this.H);
            pointF.y = org.telegram.messenger.g0.T1((f10.height() / 2.0f) + rmVar.K.f38285a.f38614a + f11.top, (rmVar.F - ((rmVar.G - 0.5f) * rmVar.J)) + rmVar.N, this.H);
            return pointF;
        } else {
            RectF f12 = omVar.f(omVar.e());
            RectF f13 = rmVar.K.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f12.width() / 2.0f) + f13.left, this.I, this.H / this.K);
            pointF.y = org.telegram.messenger.g0.T1((f12.height() / 2.0f) + rmVar.K.f38285a.f38614a + f13.top, this.J, this.H / this.K);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.f38944b;
            if (i7 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((pm) arrayList.get(i7)).h;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                om omVar = (om) arrayList2.get(i10);
                xh.e eVar = omVar.f38301s;
                if (eVar != null) {
                    eVar.b(omVar.O.f38636z);
                    omVar.f38301s = null;
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
                pm pmVar = new pm(this);
                pm.a(pmVar, new lm(this.Q, arrayList3), false);
                arrayList.add(pmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        rm rmVar;
        di.b1 b1Var;
        boolean z10;
        ArrayList arrayList = this.f38944b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f10 = this.f38948n;
        int computeVerticalScrollOffset = this.Q.f39280r.computeVerticalScrollOffset();
        this.f38951w = Math.max(0, computeVerticalScrollOffset - rmVar.getListTopPadding());
        this.f38952x = (b1Var.getMeasuredHeight() - rmVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            float b10 = ((pm) arrayList.get(i7)).b() + f10;
            float f11 = this.f38951w;
            if ((f10 >= f11 && f10 <= this.f38952x) || ((b10 >= f11 && b10 <= this.f38952x) || (f10 <= f11 && b10 >= this.f38952x))) {
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
        int i7 = this.f38948n + this.f38949r;
        ArrayList arrayList = this.f38944b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i7 = (int) (((pm) arrayList.get(i10)).b() + i7);
        }
        org.telegram.ui.Cells.v0 v0Var = this.f38943a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f24046q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return v0Var.getMeasuredHeight() + i7;
    }

    public final void f(pm pmVar, org.telegram.messenger.ff ffVar, int i7) {
        pm pmVar2;
        ArrayList arrayList = (ArrayList) pmVar.f38622k.f37241f;
        arrayList.add(Math.min(arrayList.size(), i7), ffVar);
        if (((ArrayList) pmVar.f38622k.f37241f).size() == 11) {
            org.telegram.messenger.ff ffVar2 = (org.telegram.messenger.ff) ((ArrayList) pmVar.f38622k.f37241f).get(10);
            ((ArrayList) pmVar.f38622k.f37241f).remove(10);
            ArrayList arrayList2 = this.f38944b;
            int indexOf = arrayList2.indexOf(pmVar);
            if (indexOf >= 0) {
                int i10 = indexOf + 1;
                if (i10 == arrayList2.size()) {
                    pmVar2 = null;
                } else {
                    pmVar2 = (pm) arrayList2.get(i10);
                }
                if (pmVar2 == null) {
                    pm pmVar3 = new pm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(ffVar2);
                    pm.a(pmVar3, new lm(this.Q, arrayList3), true);
                    invalidate();
                } else {
                    f(pmVar2, ffVar2, 0);
                }
            }
        }
        pm.a(pmVar, pmVar.f38622k, true);
    }

    public final void g() {
        float f10 = this.f38948n;
        ArrayList arrayList = this.f38944b;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            pm pmVar = (pm) arrayList.get(i10);
            float b10 = pmVar.b();
            pmVar.f38614a = f10;
            pmVar.f38615b = i7;
            f10 += b10;
            i7 += ((ArrayList) pmVar.f38622k.f37241f).size();
        }
    }

    public final void h() {
        rm rmVar = this.Q;
        ValueAnimator valueAnimator = rmVar.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.H;
        this.K = f10;
        this.I = b10.x;
        this.J = b10.y;
        rmVar.L = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        rmVar.M = ofFloat;
        ofFloat.addUpdateListener(new mm(this, 1));
        rmVar.M.addListener(new y(this, 15));
        rmVar.M.setDuration(200L);
        rmVar.M.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f38947f;
        ArrayList arrayList = this.h;
        jm jmVar = chatAttachAlertPhotoLayout.H;
        ui uiVar = chatAttachAlertPhotoLayout.f37519b;
        zl zlVar = chatAttachAlertPhotoLayout.F;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f32800t1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f32801u1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            boolean z15 = false;
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.z0();
            int childCount = zlVar.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = zlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    int R = RecyclerView.R(childAt);
                    boolean z16 = jmVar.f36556f;
                    boolean z17 = jmVar.d;
                    if (z16 && R > chatAttachAlertPhotoLayout.N0) {
                        R--;
                    }
                    if (z17 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                        R--;
                    }
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    if (uiVar.O2 != 0 || uiVar.C1) {
                        s5Var.getCheckBox().setVisibility(8);
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
                        if (R == jmVar.b() - 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        s5Var.d(e02, z12, z13, z14, uiVar.d2);
                        if ((uiVar.f40367a2 instanceof org.telegram.ui.bn) && uiVar.R3) {
                            z11 = false;
                            s5Var.b(arrayList2.indexOf(Integer.valueOf(i10)), hashMap2.containsKey(Integer.valueOf(i10)), false);
                        } else {
                            z11 = false;
                            s5Var.b(-1, hashMap2.containsKey(Integer.valueOf(i10)), false);
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
            this.Q.f37519b.L1(1);
        }
    }

    @Override
    public final void invalidate() {
        int d = i5.c.d(45.0f, org.telegram.messenger.g0.f24046q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f38950s != d) {
            this.f38950s = d;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f38944b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            pm pmVar = (pm) arrayList.get(i7);
            if (((ArrayList) pmVar.f38622k.f37241f).size() < 10 && i7 < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) pmVar.f38622k.f37241f).size();
                pm pmVar2 = (pm) arrayList.get(i7 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) pmVar2.f38622k.f37241f).size());
                for (int i10 = 0; i10 < min; i10++) {
                    arrayList2.add((org.telegram.messenger.ff) ((ArrayList) pmVar2.f38622k.f37241f).remove(0));
                }
                ((ArrayList) pmVar.f38622k.f37241f).addAll(arrayList2);
                pm.a(pmVar, pmVar.f38622k, true);
                pm.a(pmVar2, pmVar2.f38622k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        di.b1 b1Var;
        float f10;
        ArrayList arrayList;
        int i7;
        int i10;
        int i11;
        boolean z10;
        float f11;
        om omVar;
        float f12;
        float f13 = this.f38948n;
        rm rmVar = this.Q;
        int computeVerticalScrollOffset = rmVar.f39280r.computeVerticalScrollOffset();
        this.f38951w = Math.max(0, computeVerticalScrollOffset - rmVar.getListTopPadding());
        this.f38952x = (b1Var.getMeasuredHeight() - rmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f13);
        ArrayList arrayList2 = this.f38944b;
        int size = arrayList2.size();
        float f14 = f13;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            pm pmVar = (pm) arrayList2.get(i12);
            float b10 = pmVar.b();
            pmVar.f38614a = f14;
            pmVar.f38615b = i13;
            float f15 = this.f38951w;
            if (f14 < f15 || f14 > this.f38952x) {
                float f16 = f14 + b10;
                if ((f16 < f15 || f16 > this.f38952x) && (f14 > f15 || f16 < this.f38952x)) {
                    f10 = b10;
                    arrayList = arrayList2;
                    i7 = size;
                    i10 = i12;
                    i11 = i13;
                    canvas.translate(0.0f, f10);
                    f14 += f10;
                    i13 = ((ArrayList) pmVar.f38622k.f37241f).size() + i11;
                    i12 = i10 + 1;
                    size = i7;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = pmVar.h;
            int i14 = pmVar.f38623l;
            org.telegram.ui.ActionBar.u4 u4Var = pmVar.f38634x;
            qm qmVar = pmVar.f38636z;
            arrayList = arrayList2;
            float interpolation = pmVar.f38621j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - pmVar.f38616c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = org.telegram.messenger.g0.f24046q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float T1 = org.telegram.messenger.g0.T1(pmVar.f38618f, pmVar.d, interpolation);
            int width = qmVar.getWidth();
            rm rmVar2 = qmVar.Q;
            float previewScale = width * T1 * rmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = rmVar2.getPreviewScale() * org.telegram.messenger.g0.T1(pmVar.f38619g, pmVar.f38617e, interpolation) * max;
            if (u4Var != null) {
                f11 = 2.0f;
                pmVar.f38627p = 0.0f;
                float width2 = qmVar.getWidth();
                float f17 = i14;
                pmVar.f38625n = (width2 - Math.max(f17, previewScale)) / 2.0f;
                pmVar.f38626o = (Math.max(f17, previewScale) + qmVar.getWidth()) / 2.0f;
                pmVar.f38628q = Math.max(i14 * 2, previewScale2);
                pmVar.f38634x.p(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                u4Var.setBounds((int) pmVar.f38625n, (int) pmVar.f38627p, (int) pmVar.f38626o, (int) pmVar.f38628q);
                if (pmVar.d <= 0.0f) {
                    f12 = 1.0f - interpolation;
                } else if (pmVar.f38618f <= 0.0f) {
                    f12 = interpolation;
                } else {
                    f12 = 1.0f;
                }
                u4Var.setAlpha((int) (f12 * 255.0f));
                u4Var.d(canvas, pmVar.f38635y, null);
                pmVar.f38627p += f17;
                pmVar.f38625n += f17;
                pmVar.f38628q -= f17;
                pmVar.f38626o -= f17;
            } else {
                f11 = 2.0f;
            }
            pmVar.f38629r = pmVar.f38626o - pmVar.f38625n;
            pmVar.f38630s = pmVar.f38628q - pmVar.f38627p;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                om omVar2 = (om) arrayList3.get(i15);
                if (omVar2 != null && (((omVar = rmVar2.K) == null || omVar.f38286b != omVar2.f38286b) && omVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = pmVar.f38633w;
            RectF rectF = pmVar.f38631t;
            long j3 = pmVar.f38620i;
            if (j3 <= 0) {
                i7 = size;
                i10 = i12;
                i11 = i13;
                f10 = b10;
            } else {
                if (pmVar.f38632u == null || pmVar.v != j3) {
                    pmVar.v = j3;
                    pmVar.f38632u = new xy0(di.pb.b1(false, org.telegram.messenger.hd.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
                float L = org.telegram.messenger.g0.L(28.0f) + pmVar.f38632u.f42246c;
                float L2 = org.telegram.messenger.g0.L(32.0f);
                float f18 = pmVar.f38625n;
                float f19 = pmVar.f38629r;
                float f20 = f11;
                float A = com.google.android.gms.internal.vision.e2.A(f19, L, f20, f18);
                i7 = size;
                float f21 = pmVar.f38627p;
                i10 = i12;
                float f22 = pmVar.f38630s;
                i11 = i13;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f22, L2, f20, f21), org.telegram.messenger.f3.a(f19, L, f20, f18), org.telegram.messenger.f3.a(f22, L2, f20, f21));
                paint.setColor(1610612736);
                float f23 = L2 / f20;
                canvas.drawRoundRect(rectF, f23, f23, paint);
                f10 = b10;
                pmVar.f38632u.c(org.telegram.messenger.g0.L(14.0f) + (((pmVar.f38629r / f20) + pmVar.f38625n) - (L / f20)), pmVar.f38627p + (pmVar.f38630s / f20), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f14 += f10;
            i13 = ((ArrayList) pmVar.f38622k.f37241f).size() + i11;
            i12 = i10 + 1;
            size = i7;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.v0 v0Var = this.f38943a;
        v0Var.k0(f14, v0Var.getMeasuredHeight());
        if (v0Var.R()) {
            v0Var.F(canvas, true);
            v0Var.J(canvas, true);
        }
        v0Var.draw(canvas);
        canvas.restore();
        if (rmVar.K != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (rmVar.K.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Cells.v0 v0Var = this.f38943a;
        v0Var.layout(0, 0, v0Var.getMeasuredWidth(), v0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f38943a.measure(i7, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f38950s <= 0) {
            this.f38950s = i5.c.d(45.0f, org.telegram.messenger.g0.f24046q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), this.f38950s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qm.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
