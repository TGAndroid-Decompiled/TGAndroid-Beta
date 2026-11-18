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
    public final gk N;
    public final lm O;
    public int P;
    public final pm Q;
    public final org.telegram.ui.Cells.v0 f38124a;
    public final ArrayList f38125b;
    public final HashMap f38126c;
    public HashMap d;
    public ArrayList f38127e;
    public HashMap f38128f;
    public ArrayList h;
    public final int f38129n;
    public final int f38130r;
    public int f38131s;
    public float f38132w;
    public float f38133x;
    public boolean[] f38134y;

    public om(pm pmVar, Context context) {
        super(context);
        this.Q = pmVar;
        this.f38125b = new ArrayList();
        this.f38126c = new HashMap();
        this.f38129n = org.telegram.messenger.g0.L(16.0f);
        this.f38130r = org.telegram.messenger.g0.L(64.0f);
        this.f38131s = 0;
        this.f38134y = null;
        this.E = 0L;
        this.F = null;
        this.G = null;
        this.H = 0.0f;
        this.L = new PointF();
        this.M = false;
        this.N = new gk(this, 1);
        this.O = new lm(this);
        this.P = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, pmVar.f38486n, true);
        this.f38124a = v0Var;
        v0Var.setCustomText(org.telegram.messenger.gd.M0(2131753958, null));
        addView(v0Var);
    }

    public final void a() {
        String str;
        this.d = this.Q.Q.getSelectedPhotos();
        this.f38127e = new ArrayList(this.d.entrySet());
        this.f38128f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f38125b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList2 = (ArrayList) ((nm) arrayList.get(i7)).f37814k.f36490f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) arrayList2.get(i10);
                    HashMap hashMap = this.f38126c;
                    if (hashMap.containsKey(efVar)) {
                        Object obj = hashMap.get(efVar);
                        this.f38128f.put(obj, efVar);
                        this.h.add(obj);
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 < this.f38127e.size()) {
                                Map.Entry entry = (Map.Entry) this.f38127e.get(i11);
                                Object value = entry.getValue();
                                if (value == efVar) {
                                    Object key = entry.getKey();
                                    this.f38128f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i11++;
                            } else {
                                int i12 = 0;
                                while (true) {
                                    if (i12 < this.f38127e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.f38127e.get(i12);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof org.telegram.messenger.ef) && (str = ((org.telegram.messenger.ef) value2).I) != null && efVar != null && str.equals(efVar.I)) {
                                            Object key2 = entry2.getKey();
                                            this.f38128f.put(key2, value2);
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
            pointF.y = org.telegram.messenger.g0.T1((f10.height() / 2.0f) + pmVar.K.f37561a.f37806a + f11.top, (pmVar.F - ((pmVar.G - 0.5f) * pmVar.J)) + pmVar.N, this.H);
            return pointF;
        } else {
            RectF f12 = mmVar.f(mmVar.e());
            RectF f13 = pmVar.K.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f12.width() / 2.0f) + f13.left, this.I, this.H / this.K);
            pointF.y = org.telegram.messenger.g0.T1((f12.height() / 2.0f) + pmVar.K.f37561a.f37806a + f13.top, this.J, this.H / this.K);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.f38125b;
            if (i7 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((nm) arrayList.get(i7)).h;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                mm mmVar = (mm) arrayList2.get(i10);
                xh.e eVar = mmVar.f37577s;
                if (eVar != null) {
                    eVar.b(mmVar.O.f37828z);
                    mmVar.f37577s = null;
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
        ArrayList arrayList = this.f38125b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f10 = this.f38129n;
        int computeVerticalScrollOffset = this.Q.f38487r.computeVerticalScrollOffset();
        this.f38132w = Math.max(0, computeVerticalScrollOffset - pmVar.getListTopPadding());
        this.f38133x = (b1Var.getMeasuredHeight() - pmVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            float b10 = ((nm) arrayList.get(i7)).b() + f10;
            float f11 = this.f38132w;
            if ((f10 >= f11 && f10 <= this.f38133x) || ((b10 >= f11 && b10 <= this.f38133x) || (f10 <= f11 && b10 >= this.f38133x))) {
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
        int i7 = this.f38129n + this.f38130r;
        ArrayList arrayList = this.f38125b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i7 = (int) (((nm) arrayList.get(i10)).b() + i7);
        }
        org.telegram.ui.Cells.v0 v0Var = this.f38124a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f24118q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return v0Var.getMeasuredHeight() + i7;
    }

    public final void f(nm nmVar, org.telegram.messenger.ef efVar, int i7) {
        nm nmVar2;
        ArrayList arrayList = (ArrayList) nmVar.f37814k.f36490f;
        arrayList.add(Math.min(arrayList.size(), i7), efVar);
        if (((ArrayList) nmVar.f37814k.f36490f).size() == 11) {
            org.telegram.messenger.ef efVar2 = (org.telegram.messenger.ef) ((ArrayList) nmVar.f37814k.f36490f).get(10);
            ((ArrayList) nmVar.f37814k.f36490f).remove(10);
            ArrayList arrayList2 = this.f38125b;
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
        nm.a(nmVar, nmVar.f37814k, true);
    }

    public final void g() {
        float f10 = this.f38129n;
        ArrayList arrayList = this.f38125b;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            nm nmVar = (nm) arrayList.get(i10);
            float b10 = nmVar.b();
            nmVar.f37806a = f10;
            nmVar.f37807b = i7;
            f10 += b10;
            i7 += ((ArrayList) nmVar.f37814k.f36490f).size();
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
        HashMap hashMap = this.f38128f;
        ArrayList arrayList = this.h;
        hm hmVar = chatAttachAlertPhotoLayout.H;
        si siVar = chatAttachAlertPhotoLayout.f36766b;
        xl xlVar = chatAttachAlertPhotoLayout.F;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f32764t1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f32765u1;
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
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    int R = RecyclerView.R(childAt);
                    boolean z16 = hmVar.f35926f;
                    boolean z17 = hmVar.d;
                    if (z16 && R > chatAttachAlertPhotoLayout.N0) {
                        R--;
                    }
                    if (z17 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                        R--;
                    }
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    if (siVar.O2 != 0 || siVar.C1) {
                        s5Var.getCheckBox().setVisibility(8);
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
                        s5Var.d(e02, z12, z13, z14, siVar.d2);
                        if ((siVar.f39659a2 instanceof org.telegram.ui.bn) && siVar.R3) {
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
            this.Q.f36766b.L1(1);
        }
    }

    @Override
    public final void invalidate() {
        int d = i5.c.d(45.0f, org.telegram.messenger.g0.f24118q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f38131s != d) {
            this.f38131s = d;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f38125b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            nm nmVar = (nm) arrayList.get(i7);
            if (((ArrayList) nmVar.f37814k.f36490f).size() < 10 && i7 < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) nmVar.f37814k.f36490f).size();
                nm nmVar2 = (nm) arrayList.get(i7 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) nmVar2.f37814k.f36490f).size());
                for (int i10 = 0; i10 < min; i10++) {
                    arrayList2.add((org.telegram.messenger.ef) ((ArrayList) nmVar2.f37814k.f36490f).remove(0));
                }
                ((ArrayList) nmVar.f37814k.f36490f).addAll(arrayList2);
                nm.a(nmVar, nmVar.f37814k, true);
                nm.a(nmVar2, nmVar2.f37814k, true);
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
        float f13 = this.f38129n;
        pm pmVar = this.Q;
        int computeVerticalScrollOffset = pmVar.f38487r.computeVerticalScrollOffset();
        this.f38132w = Math.max(0, computeVerticalScrollOffset - pmVar.getListTopPadding());
        this.f38133x = (b1Var.getMeasuredHeight() - pmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f13);
        ArrayList arrayList2 = this.f38125b;
        int size = arrayList2.size();
        float f14 = f13;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            nm nmVar = (nm) arrayList2.get(i12);
            float b10 = nmVar.b();
            nmVar.f37806a = f14;
            nmVar.f37807b = i13;
            float f15 = this.f38132w;
            if (f14 < f15 || f14 > this.f38133x) {
                float f16 = f14 + b10;
                if ((f16 < f15 || f16 > this.f38133x) && (f14 > f15 || f16 < this.f38133x)) {
                    f10 = b10;
                    arrayList = arrayList2;
                    i7 = size;
                    i10 = i12;
                    i11 = i13;
                    canvas.translate(0.0f, f10);
                    f14 += f10;
                    i13 = ((ArrayList) nmVar.f37814k.f36490f).size() + i11;
                    i12 = i10 + 1;
                    size = i7;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = nmVar.h;
            int i14 = nmVar.f37815l;
            org.telegram.ui.ActionBar.v4 v4Var = nmVar.f37826x;
            om omVar = nmVar.f37828z;
            arrayList = arrayList2;
            float interpolation = nmVar.f37813j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - nmVar.f37808c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = org.telegram.messenger.g0.f24118q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float T1 = org.telegram.messenger.g0.T1(nmVar.f37810f, nmVar.d, interpolation);
            int width = omVar.getWidth();
            pm pmVar2 = omVar.Q;
            float previewScale = width * T1 * pmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = pmVar2.getPreviewScale() * org.telegram.messenger.g0.T1(nmVar.f37811g, nmVar.f37809e, interpolation) * max;
            if (v4Var != null) {
                f11 = 2.0f;
                nmVar.f37819p = 0.0f;
                float width2 = omVar.getWidth();
                float f17 = i14;
                nmVar.f37817n = (width2 - Math.max(f17, previewScale)) / 2.0f;
                nmVar.f37818o = (Math.max(f17, previewScale) + omVar.getWidth()) / 2.0f;
                nmVar.f37820q = Math.max(i14 * 2, previewScale2);
                nmVar.f37826x.p(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                v4Var.setBounds((int) nmVar.f37817n, (int) nmVar.f37819p, (int) nmVar.f37818o, (int) nmVar.f37820q);
                if (nmVar.d <= 0.0f) {
                    f12 = 1.0f - interpolation;
                } else if (nmVar.f37810f <= 0.0f) {
                    f12 = interpolation;
                } else {
                    f12 = 1.0f;
                }
                v4Var.setAlpha((int) (f12 * 255.0f));
                v4Var.d(canvas, nmVar.f37827y, null);
                nmVar.f37819p += f17;
                nmVar.f37817n += f17;
                nmVar.f37820q -= f17;
                nmVar.f37818o -= f17;
            } else {
                f11 = 2.0f;
            }
            nmVar.f37821r = nmVar.f37818o - nmVar.f37817n;
            nmVar.f37822s = nmVar.f37820q - nmVar.f37819p;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                mm mmVar2 = (mm) arrayList3.get(i15);
                if (mmVar2 != null && (((mmVar = pmVar2.K) == null || mmVar.f37562b != mmVar2.f37562b) && mmVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = nmVar.f37825w;
            RectF rectF = nmVar.f37823t;
            long j3 = nmVar.f37812i;
            if (j3 <= 0) {
                i7 = size;
                i10 = i12;
                i11 = i13;
                f10 = b10;
            } else {
                if (nmVar.f37824u == null || nmVar.v != j3) {
                    nmVar.v = j3;
                    nmVar.f37824u = new vy0(di.pb.b1(false, org.telegram.messenger.gd.H(',', "UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
                float L = org.telegram.messenger.g0.L(28.0f) + nmVar.f37824u.f41482c;
                float L2 = org.telegram.messenger.g0.L(32.0f);
                float f18 = nmVar.f37817n;
                float f19 = nmVar.f37821r;
                float f20 = f11;
                float A = com.google.android.gms.internal.vision.e2.A(f19, L, f20, f18);
                i7 = size;
                float f21 = nmVar.f37819p;
                i10 = i12;
                float f22 = nmVar.f37822s;
                i11 = i13;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f22, L2, f20, f21), org.telegram.messenger.f3.a(f19, L, f20, f18), org.telegram.messenger.f3.a(f22, L2, f20, f21));
                paint.setColor(1610612736);
                float f23 = L2 / f20;
                canvas.drawRoundRect(rectF, f23, f23, paint);
                f10 = b10;
                nmVar.f37824u.c(org.telegram.messenger.g0.L(14.0f) + (((nmVar.f37821r / f20) + nmVar.f37817n) - (L / f20)), nmVar.f37819p + (nmVar.f37822s / f20), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f14 += f10;
            i13 = ((ArrayList) nmVar.f37814k.f36490f).size() + i11;
            i12 = i10 + 1;
            size = i7;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.v0 v0Var = this.f38124a;
        v0Var.k0(f14, v0Var.getMeasuredHeight());
        if (v0Var.R()) {
            v0Var.F(canvas, true);
            v0Var.J(canvas, true);
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
        org.telegram.ui.Cells.v0 v0Var = this.f38124a;
        v0Var.layout(0, 0, v0Var.getMeasuredWidth(), v0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f38124a.measure(i7, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f38131s <= 0) {
            this.f38131s = i5.c.d(45.0f, org.telegram.messenger.g0.f24118q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), this.f38131s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.om.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
