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
    public long E;
    public yl F;
    public xl G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final PointF L;
    public boolean M;
    public final mi.b0 N;
    public final wl O;
    public int P;
    public final am Q;
    public final org.telegram.ui.Cells.t0 f41062a;
    public final ArrayList f41063b;
    public final HashMap f41064c;
    public HashMap d;
    public ArrayList f41065e;
    public HashMap f41066f;
    public ArrayList h;
    public final int f41067n;
    public final int f41068r;
    public int f41069s;
    public float f41070w;
    public float f41071x;
    public boolean[] f41072y;

    public zl(am amVar, Context context) {
        super(context);
        this.Q = amVar;
        this.f41063b = new ArrayList();
        this.f41064c = new HashMap();
        this.f41067n = org.telegram.messenger.g0.L(16.0f);
        this.f41068r = org.telegram.messenger.g0.L(64.0f);
        this.f41069s = 0;
        this.f41072y = null;
        this.E = 0L;
        this.F = null;
        this.G = null;
        this.H = 0.0f;
        this.L = new PointF();
        this.M = false;
        this.N = new mi.b0(this, 27);
        this.O = new wl(this);
        this.P = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context, amVar.f31895n, true);
        this.f41062a = t0Var;
        t0Var.setCustomText(org.telegram.messenger.bd.M0(2131753960, null));
        addView(t0Var);
    }

    public final void a() {
        String str;
        this.d = this.Q.Q.getSelectedPhotos();
        this.f41065e = new ArrayList(this.d.entrySet());
        this.f41066f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f41063b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ArrayList arrayList2 = (ArrayList) ((yl) arrayList.get(i3)).f40769k.f38818f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) arrayList2.get(i10);
                    HashMap hashMap = this.f41064c;
                    if (hashMap.containsKey(yeVar)) {
                        Object obj = hashMap.get(yeVar);
                        this.f41066f.put(obj, yeVar);
                        this.h.add(obj);
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 < this.f41065e.size()) {
                                Map.Entry entry = (Map.Entry) this.f41065e.get(i11);
                                Object value = entry.getValue();
                                if (value == yeVar) {
                                    Object key = entry.getKey();
                                    this.f41066f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i11++;
                            } else {
                                int i12 = 0;
                                while (true) {
                                    if (i12 < this.f41065e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.f41065e.get(i12);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof org.telegram.messenger.ye) && (str = ((org.telegram.messenger.ye) value2).I) != null && yeVar != null && str.equals(yeVar.I)) {
                                            Object key2 = entry2.getKey();
                                            this.f41066f.put(key2, value2);
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
        am amVar = this.Q;
        xl xlVar = amVar.K;
        PointF pointF = this.L;
        if (xlVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!amVar.L) {
            RectF f10 = xlVar.f(xlVar.e());
            RectF f11 = amVar.K.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f10.width() / 2.0f) + f11.left, amVar.E - ((amVar.H - 0.5f) * amVar.I), this.H);
            pointF.y = org.telegram.messenger.g0.T1((f10.height() / 2.0f) + amVar.K.f40389a.f40761a + f11.top, (amVar.F - ((amVar.G - 0.5f) * amVar.J)) + amVar.N, this.H);
            return pointF;
        } else {
            RectF f12 = xlVar.f(xlVar.e());
            RectF f13 = amVar.K.f(1.0f);
            pointF.x = org.telegram.messenger.g0.T1((f12.width() / 2.0f) + f13.left, this.I, this.H / this.K);
            pointF.y = org.telegram.messenger.g0.T1((f12.height() / 2.0f) + amVar.K.f40389a.f40761a + f13.top, this.J, this.H / this.K);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i3 = 0;
        while (true) {
            arrayList = this.f41063b;
            if (i3 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((yl) arrayList.get(i3)).h;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                xl xlVar = (xl) arrayList2.get(i10);
                yh.e eVar = xlVar.f40405s;
                if (eVar != null) {
                    eVar.b(xlVar.O.f40783z);
                    xlVar.f40405s = null;
                }
            }
            i3++;
        }
        arrayList.clear();
        ArrayList arrayList3 = new ArrayList();
        int size = this.h.size();
        int i11 = size - 1;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) this.h.get(i12);
            num.getClass();
            arrayList3.add((org.telegram.messenger.ye) this.d.get(num));
            if (i12 % 10 == 9 || i12 == i11) {
                yl ylVar = new yl(this);
                yl.a(ylVar, new ul(this.Q, arrayList3), false);
                arrayList.add(ylVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        am amVar;
        ci.j1 j1Var;
        boolean z10;
        ArrayList arrayList = this.f41063b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f10 = this.f41067n;
        int computeVerticalScrollOffset = this.Q.f31896r.computeVerticalScrollOffset();
        this.f41070w = Math.max(0, computeVerticalScrollOffset - amVar.getListTopPadding());
        this.f41071x = (j1Var.getMeasuredHeight() - amVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            float b10 = ((yl) arrayList.get(i3)).b() + f10;
            float f11 = this.f41070w;
            if ((f10 >= f11 && f10 <= this.f41071x) || ((b10 >= f11 && b10 <= this.f41071x) || (f10 <= f11 && b10 >= this.f41071x))) {
                z10 = true;
            } else {
                z10 = false;
            }
            zArr[i3] = z10;
            i3++;
            f10 = b10;
        }
        return zArr;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final int e() {
        int i3 = this.f41067n + this.f41068r;
        ArrayList arrayList = this.f41063b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i3 = (int) (((yl) arrayList.get(i10)).b() + i3);
        }
        org.telegram.ui.Cells.t0 t0Var = this.f41062a;
        if (t0Var.getMeasuredHeight() <= 0) {
            t0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22608q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return t0Var.getMeasuredHeight() + i3;
    }

    public final void f(yl ylVar, org.telegram.messenger.ye yeVar, int i3) {
        yl ylVar2;
        ArrayList arrayList = (ArrayList) ylVar.f40769k.f38818f;
        arrayList.add(Math.min(arrayList.size(), i3), yeVar);
        if (((ArrayList) ylVar.f40769k.f38818f).size() == 11) {
            org.telegram.messenger.ye yeVar2 = (org.telegram.messenger.ye) ((ArrayList) ylVar.f40769k.f38818f).get(10);
            ((ArrayList) ylVar.f40769k.f38818f).remove(10);
            ArrayList arrayList2 = this.f41063b;
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
                    arrayList3.add(yeVar2);
                    yl.a(ylVar3, new ul(this.Q, arrayList3), true);
                    invalidate();
                } else {
                    f(ylVar2, yeVar2, 0);
                }
            }
        }
        yl.a(ylVar, ylVar.f40769k, true);
    }

    public final void g() {
        float f10 = this.f41067n;
        ArrayList arrayList = this.f41063b;
        int size = arrayList.size();
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            yl ylVar = (yl) arrayList.get(i10);
            float b10 = ylVar.b();
            ylVar.f40761a = f10;
            ylVar.f40762b = i3;
            f10 += b10;
            i3 += ((ArrayList) ylVar.f40769k.f38818f).size();
        }
    }

    public final void h() {
        am amVar = this.Q;
        ValueAnimator valueAnimator = amVar.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.H;
        this.K = f10;
        this.I = b10.x;
        this.J = b10.y;
        amVar.L = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        amVar.M = ofFloat;
        ofFloat.addUpdateListener(new vl(this, 1));
        amVar.M.addListener(new x5(this, 14));
        amVar.M.setDuration(200L);
        amVar.M.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f41066f;
        ArrayList arrayList = this.h;
        sl slVar = chatAttachAlertPhotoLayout.H;
        bi biVar = chatAttachAlertPhotoLayout.f38416b;
        il ilVar = chatAttachAlertPhotoLayout.F;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f31260t1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f31261u1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            boolean z15 = false;
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.z0();
            int childCount = ilVar.getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = ilVar.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    int R = RecyclerView.R(childAt);
                    boolean z16 = slVar.f38051f;
                    boolean z17 = slVar.d;
                    if (z16 && R > chatAttachAlertPhotoLayout.N0) {
                        R--;
                    }
                    if (z17 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                        R--;
                    }
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    if (biVar.L2 != 0 || biVar.f32298z1) {
                        q5Var.getCheckBox().setVisibility(8);
                    }
                    org.telegram.messenger.ye e02 = chatAttachAlertPhotoLayout.e0(R);
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
                        if (R == slVar.b() - 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        q5Var.d(e02, z12, z13, z14, biVar.f32212a2);
                        if ((biVar.X1 instanceof org.telegram.ui.wm) && biVar.O3) {
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
                i3++;
                z15 = z11;
            }
        }
        if (size != this.h.size()) {
            this.Q.f38416b.K1(1);
        }
    }

    @Override
    public final void invalidate() {
        int d = k2.p1.d(45.0f, org.telegram.messenger.g0.f22608q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f41069s != d) {
            this.f41069s = d;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f41063b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            yl ylVar = (yl) arrayList.get(i3);
            if (((ArrayList) ylVar.f40769k.f38818f).size() < 10 && i3 < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) ylVar.f40769k.f38818f).size();
                yl ylVar2 = (yl) arrayList.get(i3 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) ylVar2.f40769k.f38818f).size());
                for (int i10 = 0; i10 < min; i10++) {
                    arrayList2.add((org.telegram.messenger.ye) ((ArrayList) ylVar2.f40769k.f38818f).remove(0));
                }
                ((ArrayList) ylVar.f40769k.f38818f).addAll(arrayList2);
                yl.a(ylVar, ylVar.f40769k, true);
                yl.a(ylVar2, ylVar2.f40769k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ci.j1 j1Var;
        float f10;
        ArrayList arrayList;
        int i3;
        int i10;
        int i11;
        boolean z10;
        float f11;
        xl xlVar;
        float f12;
        float f13 = this.f41067n;
        am amVar = this.Q;
        int computeVerticalScrollOffset = amVar.f31896r.computeVerticalScrollOffset();
        this.f41070w = Math.max(0, computeVerticalScrollOffset - amVar.getListTopPadding());
        this.f41071x = (j1Var.getMeasuredHeight() - amVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f13);
        ArrayList arrayList2 = this.f41063b;
        int size = arrayList2.size();
        float f14 = f13;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            yl ylVar = (yl) arrayList2.get(i12);
            float b10 = ylVar.b();
            ylVar.f40761a = f14;
            ylVar.f40762b = i13;
            float f15 = this.f41070w;
            if (f14 < f15 || f14 > this.f41071x) {
                float f16 = f14 + b10;
                if ((f16 < f15 || f16 > this.f41071x) && (f14 > f15 || f16 < this.f41071x)) {
                    f10 = b10;
                    arrayList = arrayList2;
                    i3 = size;
                    i10 = i12;
                    i11 = i13;
                    canvas.translate(0.0f, f10);
                    f14 += f10;
                    i13 = ((ArrayList) ylVar.f40769k.f38818f).size() + i11;
                    i12 = i10 + 1;
                    size = i3;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = ylVar.h;
            int i14 = ylVar.f40770l;
            org.telegram.ui.ActionBar.t4 t4Var = ylVar.f40781x;
            zl zlVar = ylVar.f40783z;
            arrayList = arrayList2;
            float interpolation = ylVar.f40768j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - ylVar.f40763c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = org.telegram.messenger.g0.f22608q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float T1 = org.telegram.messenger.g0.T1(ylVar.f40765f, ylVar.d, interpolation);
            int width = zlVar.getWidth();
            am amVar2 = zlVar.Q;
            float previewScale = width * T1 * amVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = amVar2.getPreviewScale() * org.telegram.messenger.g0.T1(ylVar.f40766g, ylVar.f40764e, interpolation) * max;
            if (t4Var != null) {
                f11 = 2.0f;
                ylVar.f40774p = 0.0f;
                float width2 = zlVar.getWidth();
                float f17 = i14;
                ylVar.f40772n = (width2 - Math.max(f17, previewScale)) / 2.0f;
                ylVar.f40773o = (Math.max(f17, previewScale) + zlVar.getWidth()) / 2.0f;
                ylVar.f40775q = Math.max(i14 * 2, previewScale2);
                ylVar.f40781x.q(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                t4Var.setBounds((int) ylVar.f40772n, (int) ylVar.f40774p, (int) ylVar.f40773o, (int) ylVar.f40775q);
                if (ylVar.d <= 0.0f) {
                    f12 = 1.0f - interpolation;
                } else if (ylVar.f40765f <= 0.0f) {
                    f12 = interpolation;
                } else {
                    f12 = 1.0f;
                }
                t4Var.setAlpha((int) (f12 * 255.0f));
                t4Var.e(canvas, ylVar.f40782y, null);
                ylVar.f40774p += f17;
                ylVar.f40772n += f17;
                ylVar.f40775q -= f17;
                ylVar.f40773o -= f17;
            } else {
                f11 = 2.0f;
            }
            ylVar.f40776r = ylVar.f40773o - ylVar.f40772n;
            ylVar.f40777s = ylVar.f40775q - ylVar.f40774p;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                xl xlVar2 = (xl) arrayList3.get(i15);
                if (xlVar2 != null && (((xlVar = amVar2.K) == null || xlVar.f40390b != xlVar2.f40390b) && xlVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = ylVar.f40780w;
            RectF rectF = ylVar.f40778t;
            long j10 = ylVar.f40767i;
            if (j10 <= 0) {
                i3 = size;
                i10 = i12;
                i11 = i13;
                f10 = b10;
            } else {
                if (ylVar.f40779u == null || ylVar.v != j10) {
                    ylVar.v = j10;
                    ylVar.f40779u = new ly0(ci.wb.a1(false, org.telegram.messenger.bd.H(',', "UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, org.telegram.messenger.g0.o());
                }
                float L = org.telegram.messenger.g0.L(28.0f) + ylVar.f40779u.f35918c;
                float L2 = org.telegram.messenger.g0.L(32.0f);
                float f18 = ylVar.f40772n;
                float f19 = ylVar.f40776r;
                float f20 = f11;
                float z12 = com.google.android.recaptcha.internal.a.z(f19, L, f20, f18);
                i3 = size;
                float f21 = ylVar.f40774p;
                i10 = i12;
                float f22 = ylVar.f40777s;
                i11 = i13;
                rectF.set(z12, com.google.android.recaptcha.internal.a.z(f22, L2, f20, f21), org.telegram.messenger.k5.a(f19, L, f20, f18), org.telegram.messenger.k5.a(f22, L2, f20, f21));
                paint.setColor(1610612736);
                float f23 = L2 / f20;
                canvas.drawRoundRect(rectF, f23, f23, paint);
                f10 = b10;
                ylVar.f40779u.c(org.telegram.messenger.g0.L(14.0f) + (((ylVar.f40776r / f20) + ylVar.f40772n) - (L / f20)), ylVar.f40774p + (ylVar.f40777s / f20), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f14 += f10;
            i13 = ((ArrayList) ylVar.f40769k.f38818f).size() + i11;
            i12 = i10 + 1;
            size = i3;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.t0 t0Var = this.f41062a;
        t0Var.h0(f14, t0Var.getMeasuredHeight());
        if (t0Var.Q()) {
            t0Var.G(canvas, true);
            t0Var.I(canvas, true);
        }
        t0Var.draw(canvas);
        canvas.restore();
        if (amVar.K != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (amVar.K.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        org.telegram.ui.Cells.t0 t0Var = this.f41062a;
        t0Var.layout(0, 0, t0Var.getMeasuredWidth(), t0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        this.f41062a.measure(i3, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f41069s <= 0) {
            this.f41069s = k2.p1.d(45.0f, org.telegram.messenger.g0.f22608q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), this.f41069s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zl.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
