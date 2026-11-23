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
public final class om extends ViewGroup {
    public long E;
    public nm F;
    public mm G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final PointF L;
    public boolean M;
    public final rc N;
    public final lm O;
    public int P;
    public final pm Q;
    public final org.telegram.ui.Cells.v0 f38207a;
    public final ArrayList f38208b;
    public final HashMap f38209c;
    public HashMap d;
    public ArrayList f38210e;
    public HashMap f38211f;
    public ArrayList h;
    public final int f38212n;
    public final int f38213r;
    public int f38214s;
    public float f38215w;
    public float f38216x;
    public boolean[] f38217y;

    public om(pm pmVar, Context context) {
        super(context);
        this.Q = pmVar;
        this.f38208b = new ArrayList();
        this.f38209c = new HashMap();
        this.f38212n = org.telegram.messenger.g0.L(16.0f);
        this.f38213r = org.telegram.messenger.g0.L(64.0f);
        this.f38214s = 0;
        this.f38217y = null;
        this.E = 0L;
        this.F = null;
        this.G = null;
        this.H = 0.0f;
        this.L = new PointF();
        this.M = false;
        this.N = new rc(this, 2);
        this.O = new lm(this);
        this.P = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, pmVar.f38509n, true);
        this.f38207a = v0Var;
        v0Var.setCustomText(org.telegram.messenger.gd.N0(2131753957, null));
        addView(v0Var);
    }

    public final void a() {
        String str;
        this.d = this.Q.Q.getSelectedPhotos();
        this.f38210e = new ArrayList(this.d.entrySet());
        this.f38211f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f38208b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList2 = (ArrayList) ((nm) arrayList.get(i7)).f37858k.f36460f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList2.get(i10);
                    HashMap hashMap = this.f38209c;
                    if (hashMap.containsKey(efVar)) {
                        Object obj = hashMap.get(efVar);
                        this.f38211f.put(obj, efVar);
                        this.h.add(obj);
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 < this.f38210e.size()) {
                                Map.Entry entry = (Map.Entry) this.f38210e.get(i11);
                                Object value = entry.getValue();
                                if (value == efVar) {
                                    Object key = entry.getKey();
                                    this.f38211f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i11++;
                            } else {
                                int i12 = 0;
                                while (true) {
                                    if (i12 < this.f38210e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.f38210e.get(i12);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof org.telegram.messenger.ef) && (str = ((org.telegram.messenger.ef) value2).I) != null && efVar != null && str.equals(efVar.I)) {
                                            Object key2 = entry2.getKey();
                                            this.f38211f.put(key2, value2);
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
        pm pmVar = this.Q;
        mm mmVar = pmVar.K;
        PointF pointF = this.L;
        if (mmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!pmVar.L) {
            RectF f10 = mmVar.f(mmVar.e());
            RectF f11 = pmVar.K.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f10.width() / 2.0f) + f11.left, pmVar.E - ((pmVar.H - 0.5f) * pmVar.I), this.H);
            pointF.y = org.telegram.messenger.g0.T1((f10.height() / 2.0f) + pmVar.K.f37479a.f37850a + f11.top, (pmVar.F - ((pmVar.G - 0.5f) * pmVar.J)) + pmVar.N, this.H);
            return pointF;
        } else {
            RectF f12 = mmVar.f(mmVar.e());
            RectF f13 = pmVar.K.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f12.width() / 2.0f) + f13.left, this.I, this.H / this.K);
            pointF.y = org.telegram.messenger.g0.T1((f12.height() / 2.0f) + pmVar.K.f37479a.f37850a + f13.top, this.J, this.H / this.K);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.f38208b;
            if (i7 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((nm) arrayList.get(i7)).h;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                mm mmVar = (mm) arrayList2.get(i10);
                xh.e eVar = mmVar.f37495s;
                if (eVar != null) {
                    eVar.b(mmVar.O.f37872z);
                    mmVar.f37495s = null;
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
            arrayList3.add((org.telegram.messenger.ef) this.d.get(num));
            if (i12 % 10 == 9 || i12 == i11) {
                nm nmVar = new nm(this);
                nm.a(nmVar, new jm(this.Q, arrayList3), false);
                arrayList.add(nmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        pm pmVar;
        di.b1 b1Var;
        boolean z10;
        ArrayList arrayList = this.f38208b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f10 = this.f38212n;
        int computeVerticalScrollOffset = this.Q.f38510r.computeVerticalScrollOffset();
        this.f38215w = Math.max(0, computeVerticalScrollOffset - pmVar.getListTopPadding());
        this.f38216x = (b1Var.getMeasuredHeight() - pmVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            float b10 = ((nm) arrayList.get(i7)).b() + f10;
            float f11 = this.f38215w;
            if ((f10 >= f11 && f10 <= this.f38216x) || ((b10 >= f11 && b10 <= this.f38216x) || (f10 <= f11 && b10 >= this.f38216x))) {
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
        int i7 = this.f38212n + this.f38213r;
        ArrayList arrayList = this.f38208b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i7 = (int) (((nm) arrayList.get(i10)).b() + i7);
        }
        org.telegram.ui.Cells.v0 v0Var = this.f38207a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f24226q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return v0Var.getMeasuredHeight() + i7;
    }

    public final void f(nm nmVar, org.telegram.messenger.ef efVar, int i7) {
        nm nmVar2;
        ArrayList arrayList = (ArrayList) nmVar.f37858k.f36460f;
        arrayList.add(Math.min(arrayList.size(), i7), efVar);
        if (((ArrayList) nmVar.f37858k.f36460f).size() == 11) {
            org.telegram.messenger.ef efVar2 = (org.telegram.messenger.ef) ((ArrayList) nmVar.f37858k.f36460f).get(10);
            ((ArrayList) nmVar.f37858k.f36460f).remove(10);
            ArrayList arrayList2 = this.f38208b;
            int indexOf = arrayList2.indexOf(nmVar);
            if (indexOf >= 0) {
                int i10 = indexOf + 1;
                if (i10 == arrayList2.size()) {
                    nmVar2 = null;
                } else {
                    nmVar2 = (nm) arrayList2.get(i10);
                }
                if (nmVar2 == null) {
                    nm nmVar3 = new nm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(efVar2);
                    nm.a(nmVar3, new jm(this.Q, arrayList3), true);
                    invalidate();
                } else {
                    f(nmVar2, efVar2, 0);
                }
            }
        }
        nm.a(nmVar, nmVar.f37858k, true);
    }

    public final void g() {
        float f10 = this.f38212n;
        ArrayList arrayList = this.f38208b;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            nm nmVar = (nm) arrayList.get(i10);
            float b10 = nmVar.b();
            nmVar.f37850a = f10;
            nmVar.f37851b = i7;
            f10 += b10;
            i7 += ((ArrayList) nmVar.f37858k.f36460f).size();
        }
    }

    public final void h() {
        pm pmVar = this.Q;
        ValueAnimator valueAnimator = pmVar.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.H;
        this.K = f10;
        this.I = b10.x;
        this.J = b10.y;
        pmVar.L = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        pmVar.M = ofFloat;
        ofFloat.addUpdateListener(new km(this, 1));
        pmVar.M.addListener(new x(this, 15));
        pmVar.M.setDuration(200L);
        pmVar.M.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f38211f;
        ArrayList arrayList = this.h;
        hm hmVar = chatAttachAlertPhotoLayout.H;
        ti tiVar = chatAttachAlertPhotoLayout.f37135b;
        xl xlVar = chatAttachAlertPhotoLayout.F;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f32864t1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f32865u1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            boolean z15 = false;
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.z0();
            int childCount = xlVar.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = xlVar.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.r5) {
                    int R = RecyclerView.R(childAt);
                    boolean z16 = hmVar.f35767f;
                    boolean z17 = hmVar.d;
                    if (z16 && R > chatAttachAlertPhotoLayout.N0) {
                        R--;
                    }
                    if (z17 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                        R--;
                    }
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                    if (tiVar.O2 != 0 || tiVar.C1) {
                        r5Var.getCheckBox().setVisibility(8);
                    }
                    org.telegram.messenger.ef e02 = chatAttachAlertPhotoLayout.e0(R);
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
                        if (R == hmVar.b() - 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        r5Var.d(e02, z12, z13, z14, tiVar.d2);
                        if ((tiVar.f39956a2 instanceof org.telegram.ui.bn) && tiVar.R3) {
                            z11 = false;
                            r5Var.b(arrayList2.indexOf(Integer.valueOf(i10)), hashMap2.containsKey(Integer.valueOf(i10)), false);
                        } else {
                            z11 = false;
                            r5Var.b(-1, hashMap2.containsKey(Integer.valueOf(i10)), false);
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
            this.Q.f37135b.L1(1);
        }
    }

    @Override
    public final void invalidate() {
        int d = i5.c.d(45.0f, org.telegram.messenger.g0.f24226q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f38214s != d) {
            this.f38214s = d;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f38208b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            nm nmVar = (nm) arrayList.get(i7);
            if (((ArrayList) nmVar.f37858k.f36460f).size() < 10 && i7 < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) nmVar.f37858k.f36460f).size();
                nm nmVar2 = (nm) arrayList.get(i7 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) nmVar2.f37858k.f36460f).size());
                for (int i10 = 0; i10 < min; i10++) {
                    arrayList2.add((org.telegram.messenger.ef) ((ArrayList) nmVar2.f37858k.f36460f).remove(0));
                }
                ((ArrayList) nmVar.f37858k.f36460f).addAll(arrayList2);
                nm.a(nmVar, nmVar.f37858k, true);
                nm.a(nmVar2, nmVar2.f37858k, true);
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
        mm mmVar;
        float f12;
        float f13 = this.f38212n;
        pm pmVar = this.Q;
        int computeVerticalScrollOffset = pmVar.f38510r.computeVerticalScrollOffset();
        this.f38215w = Math.max(0, computeVerticalScrollOffset - pmVar.getListTopPadding());
        this.f38216x = (b1Var.getMeasuredHeight() - pmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f13);
        ArrayList arrayList2 = this.f38208b;
        int size = arrayList2.size();
        float f14 = f13;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            nm nmVar = (nm) arrayList2.get(i12);
            float b10 = nmVar.b();
            nmVar.f37850a = f14;
            nmVar.f37851b = i13;
            float f15 = this.f38215w;
            if (f14 < f15 || f14 > this.f38216x) {
                float f16 = f14 + b10;
                if ((f16 < f15 || f16 > this.f38216x) && (f14 > f15 || f16 < this.f38216x)) {
                    f10 = b10;
                    arrayList = arrayList2;
                    i7 = size;
                    i10 = i12;
                    i11 = i13;
                    canvas.translate(0.0f, f10);
                    f14 += f10;
                    i13 = ((ArrayList) nmVar.f37858k.f36460f).size() + i11;
                    i12 = i10 + 1;
                    size = i7;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = nmVar.h;
            int i14 = nmVar.f37859l;
            org.telegram.ui.ActionBar.u4 u4Var = nmVar.f37870x;
            om omVar = nmVar.f37872z;
            arrayList = arrayList2;
            float interpolation = nmVar.f37857j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - nmVar.f37852c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = org.telegram.messenger.g0.f24226q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float T1 = org.telegram.messenger.g0.T1(nmVar.f37854f, nmVar.d, interpolation);
            int width = omVar.getWidth();
            pm pmVar2 = omVar.Q;
            float previewScale = width * T1 * pmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = pmVar2.getPreviewScale() * org.telegram.messenger.g0.T1(nmVar.f37855g, nmVar.f37853e, interpolation) * max;
            if (u4Var != null) {
                f11 = 2.0f;
                nmVar.f37863p = 0.0f;
                float width2 = omVar.getWidth();
                float f17 = i14;
                nmVar.f37861n = (width2 - Math.max(f17, previewScale)) / 2.0f;
                nmVar.f37862o = (Math.max(f17, previewScale) + omVar.getWidth()) / 2.0f;
                nmVar.f37864q = Math.max(i14 * 2, previewScale2);
                nmVar.f37870x.p(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                u4Var.setBounds((int) nmVar.f37861n, (int) nmVar.f37863p, (int) nmVar.f37862o, (int) nmVar.f37864q);
                if (nmVar.d <= 0.0f) {
                    f12 = 1.0f - interpolation;
                } else if (nmVar.f37854f <= 0.0f) {
                    f12 = interpolation;
                } else {
                    f12 = 1.0f;
                }
                u4Var.setAlpha((int) (f12 * 255.0f));
                u4Var.d(canvas, nmVar.f37871y, null);
                nmVar.f37863p += f17;
                nmVar.f37861n += f17;
                nmVar.f37864q -= f17;
                nmVar.f37862o -= f17;
            } else {
                f11 = 2.0f;
            }
            nmVar.f37865r = nmVar.f37862o - nmVar.f37861n;
            nmVar.f37866s = nmVar.f37864q - nmVar.f37863p;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                mm mmVar2 = (mm) arrayList3.get(i15);
                if (mmVar2 != null && (((mmVar = pmVar2.K) == null || mmVar.f37480b != mmVar2.f37480b) && mmVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = nmVar.f37869w;
            RectF rectF = nmVar.f37867t;
            long j3 = nmVar.f37856i;
            if (j3 <= 0) {
                i7 = size;
                i10 = i12;
                i11 = i13;
                f10 = b10;
            } else {
                if (nmVar.f37868u == null || nmVar.v != j3) {
                    nmVar.v = j3;
                    nmVar.f37868u = new wy0(di.pb.b1(false, org.telegram.messenger.gd.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
                float L = org.telegram.messenger.g0.L(28.0f) + nmVar.f37868u.f41763c;
                float L2 = org.telegram.messenger.g0.L(32.0f);
                float f18 = nmVar.f37861n;
                float f19 = nmVar.f37865r;
                float f20 = f11;
                float A = com.google.android.gms.internal.vision.e2.A(f19, L, f20, f18);
                i7 = size;
                float f21 = nmVar.f37863p;
                i10 = i12;
                float f22 = nmVar.f37866s;
                i11 = i13;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f22, L2, f20, f21), org.telegram.messenger.f3.a(f19, L, f20, f18), org.telegram.messenger.f3.a(f22, L2, f20, f21));
                paint.setColor(1610612736);
                float f23 = L2 / f20;
                canvas.drawRoundRect(rectF, f23, f23, paint);
                f10 = b10;
                nmVar.f37868u.c(org.telegram.messenger.g0.L(14.0f) + (((nmVar.f37865r / f20) + nmVar.f37861n) - (L / f20)), nmVar.f37863p + (nmVar.f37866s / f20), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f14 += f10;
            i13 = ((ArrayList) nmVar.f37858k.f36460f).size() + i11;
            i12 = i10 + 1;
            size = i7;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.v0 v0Var = this.f38207a;
        v0Var.m0(f14, v0Var.getMeasuredHeight());
        if (v0Var.U()) {
            v0Var.H(canvas, true);
            v0Var.M(canvas, true);
        }
        v0Var.draw(canvas);
        canvas.restore();
        if (pmVar.K != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (pmVar.K.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Cells.v0 v0Var = this.f38207a;
        v0Var.layout(0, 0, v0Var.getMeasuredWidth(), v0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f38207a.measure(i7, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f38214s <= 0) {
            this.f38214s = i5.c.d(45.0f, org.telegram.messenger.g0.f24226q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), this.f38214s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.om.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
