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
public final class im extends ViewGroup {
    public long D;
    public hm E;
    public gm F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final mg.c2 M;
    public final fm N;
    public int O;
    public final jm P;
    public final org.telegram.ui.Cells.s0 f27116a;
    public final ArrayList f27117b;
    public final HashMap f27118c;
    public HashMap d;
    public ArrayList e;
    public HashMap f27119f;
    public ArrayList h;
    public final int f27120n;
    public final int f27121r;
    public int f27122s;
    public float f27123w;
    public float f27124x;
    public boolean[] f27125y;

    public im(jm jmVar, Context context) {
        super(context);
        this.P = jmVar;
        this.f27117b = new ArrayList();
        this.f27118c = new HashMap();
        this.f27120n = org.telegram.messenger.i0.L(16.0f);
        this.f27121r = org.telegram.messenger.i0.L(64.0f);
        this.f27122s = 0;
        this.f27125y = null;
        this.D = 0L;
        this.E = null;
        this.F = null;
        this.G = 0.0f;
        this.K = new PointF();
        this.L = false;
        this.M = new mg.c2(this, 26);
        this.N = new fm(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.s0 s0Var = new org.telegram.ui.Cells.s0(context, jmVar.f27454n, true);
        this.f27116a = s0Var;
        s0Var.setCustomText(org.telegram.messenger.dd.L0(2131753960, null));
        addView(s0Var);
    }

    public final void a() {
        String str;
        this.d = this.P.P.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f27119f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f27117b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) ((hm) arrayList.get(i10)).f26843k.f25515f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) arrayList2.get(i11);
                    HashMap hashMap = this.f27118c;
                    if (hashMap.containsKey(ffVar)) {
                        Object obj = hashMap.get(ffVar);
                        this.f27119f.put(obj, ffVar);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i12);
                                Object value = entry.getValue();
                                if (value == ffVar) {
                                    Object key = entry.getKey();
                                    this.f27119f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i12++;
                            } else {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < this.e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.e.get(i13);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof org.telegram.messenger.ff) && (str = ((org.telegram.messenger.ff) value2).I) != null && ffVar != null && str.equals(ffVar.I)) {
                                            Object key2 = entry2.getKey();
                                            this.f27119f.put(key2, value2);
                                            this.h.add(key2);
                                            break;
                                        }
                                        i13++;
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
        jm jmVar = this.P;
        gm gmVar = jmVar.J;
        PointF pointF = this.K;
        if (gmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!jmVar.K) {
            RectF f7 = gmVar.f(gmVar.e());
            RectF f10 = jmVar.J.f(1.0f);
            pointF.x = org.telegram.messenger.i0.T1((f7.width() / 2.0f) + f10.left, jmVar.D - ((jmVar.G - 0.5f) * jmVar.H), this.G);
            pointF.y = org.telegram.messenger.i0.T1((f7.height() / 2.0f) + jmVar.J.f26476a.f26836a + f10.top, (jmVar.E - ((jmVar.F - 0.5f) * jmVar.I)) + jmVar.M, this.G);
            return pointF;
        } else {
            RectF f11 = gmVar.f(gmVar.e());
            RectF f12 = jmVar.J.f(1.0f);
            pointF.x = org.telegram.messenger.i0.T1((f11.width() / 2.0f) + f12.left, this.H, this.G / this.J);
            pointF.y = org.telegram.messenger.i0.T1((f11.height() / 2.0f) + jmVar.J.f26476a.f26836a + f12.top, this.I, this.G / this.J);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f27117b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((hm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                gm gmVar = (gm) arrayList2.get(i11);
                nh.h hVar = gmVar.f26491s;
                if (hVar != null) {
                    hVar.b(gmVar.O.f26857z);
                    gmVar.f26491s = null;
                }
            }
            i10++;
        }
        arrayList.clear();
        ArrayList arrayList3 = new ArrayList();
        int size = this.h.size();
        int i12 = size - 1;
        for (int i13 = 0; i13 < size; i13++) {
            Integer num = (Integer) this.h.get(i13);
            num.getClass();
            arrayList3.add((org.telegram.messenger.ff) this.d.get(num));
            if (i13 % 10 == 9 || i13 == i12) {
                hm hmVar = new hm(this);
                hm.a(hmVar, new dm(this.P, arrayList3), false);
                arrayList.add(hmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        jm jmVar;
        ag.b1 b1Var;
        boolean z10;
        ArrayList arrayList = this.f27117b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f7 = this.f27120n;
        int computeVerticalScrollOffset = this.P.f27455r.computeVerticalScrollOffset();
        this.f27123w = Math.max(0, computeVerticalScrollOffset - jmVar.getListTopPadding());
        this.f27124x = (b1Var.getMeasuredHeight() - jmVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((hm) arrayList.get(i10)).b() + f7;
            float f10 = this.f27123w;
            if ((f7 >= f10 && f7 <= this.f27124x) || ((b10 >= f10 && b10 <= this.f27124x) || (f7 <= f10 && b10 >= this.f27124x))) {
                z10 = true;
            } else {
                z10 = false;
            }
            zArr[i10] = z10;
            i10++;
            f7 = b10;
        }
        return zArr;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final int e() {
        int i10 = this.f27120n + this.f27121r;
        ArrayList arrayList = this.f27117b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((hm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.s0 s0Var = this.f27116a;
        if (s0Var.getMeasuredHeight() <= 0) {
            s0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.f16172q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return s0Var.getMeasuredHeight() + i10;
    }

    public final void f(hm hmVar, org.telegram.messenger.ff ffVar, int i10) {
        hm hmVar2;
        ArrayList arrayList = (ArrayList) hmVar.f26843k.f25515f;
        arrayList.add(Math.min(arrayList.size(), i10), ffVar);
        if (((ArrayList) hmVar.f26843k.f25515f).size() == 11) {
            org.telegram.messenger.ff ffVar2 = (org.telegram.messenger.ff) ((ArrayList) hmVar.f26843k.f25515f).get(10);
            ((ArrayList) hmVar.f26843k.f25515f).remove(10);
            ArrayList arrayList2 = this.f27117b;
            int indexOf = arrayList2.indexOf(hmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                if (i11 == arrayList2.size()) {
                    hmVar2 = null;
                } else {
                    hmVar2 = (hm) arrayList2.get(i11);
                }
                if (hmVar2 == null) {
                    hm hmVar3 = new hm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(ffVar2);
                    hm.a(hmVar3, new dm(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(hmVar2, ffVar2, 0);
                }
            }
        }
        hm.a(hmVar, hmVar.f26843k, true);
    }

    public final void g() {
        float f7 = this.f27120n;
        ArrayList arrayList = this.f27117b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            hm hmVar = (hm) arrayList.get(i11);
            float b10 = hmVar.b();
            hmVar.f26836a = f7;
            hmVar.f26837b = i10;
            f7 += b10;
            i10 += ((ArrayList) hmVar.f26843k.f25515f).size();
        }
    }

    public final void h() {
        jm jmVar = this.P;
        ValueAnimator valueAnimator = jmVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        jmVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        jmVar.L = ofFloat;
        ofFloat.addUpdateListener(new em(this, 1));
        jmVar.L.addListener(new w5(this, 14));
        jmVar.L.setDuration(200L);
        jmVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f27119f;
        ArrayList arrayList = this.h;
        bm bmVar = chatAttachAlertPhotoLayout.G;
        bi biVar = chatAttachAlertPhotoLayout.f30964b;
        pl plVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f23848s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f23849t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            boolean z15 = false;
            chatAttachAlertPhotoLayout.z0(false);
            chatAttachAlertPhotoLayout.x0();
            int childCount = plVar.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = plVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.v5) {
                    int R = RecyclerView.R(childAt);
                    boolean z16 = bmVar.f24888f;
                    boolean z17 = bmVar.d;
                    if (z16 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z17 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                    if (biVar.K2 != 0 || biVar.f24835y1) {
                        v5Var.getCheckBox().setVisibility(8);
                    }
                    org.telegram.messenger.ff c02 = chatAttachAlertPhotoLayout.c0(R);
                    if (c02 != null) {
                        int i11 = c02.C;
                        if (hashMap2.size() > 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z17 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (R == bmVar.b() - 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        v5Var.d(c02, z12, z13, z14, biVar.Z1);
                        if ((biVar.W1 instanceof org.telegram.ui.un) && biVar.N3) {
                            z11 = false;
                            v5Var.b(arrayList2.indexOf(Integer.valueOf(i11)), hashMap2.containsKey(Integer.valueOf(i11)), false);
                        } else {
                            z11 = false;
                            v5Var.b(-1, hashMap2.containsKey(Integer.valueOf(i11)), false);
                        }
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = z15;
                }
                i10++;
                z15 = z11;
            }
        }
        if (size != this.h.size()) {
            this.P.f30964b.J1(1);
        }
    }

    @Override
    public final void invalidate() {
        int d = i0.a.d(45.0f, org.telegram.messenger.i0.f16172q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), e());
        if (this.f27122s != d) {
            this.f27122s = d;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f27117b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            hm hmVar = (hm) arrayList.get(i10);
            if (((ArrayList) hmVar.f26843k.f25515f).size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) hmVar.f26843k.f25515f).size();
                hm hmVar2 = (hm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) hmVar2.f26843k.f25515f).size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((org.telegram.messenger.ff) ((ArrayList) hmVar2.f26843k.f25515f).remove(0));
                }
                ((ArrayList) hmVar.f26843k.f25515f).addAll(arrayList2);
                hm.a(hmVar, hmVar.f26843k, true);
                hm.a(hmVar2, hmVar2.f26843k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ag.b1 b1Var;
        float f7;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        boolean z10;
        float f10;
        gm gmVar;
        float f11;
        float f12 = this.f27120n;
        jm jmVar = this.P;
        int computeVerticalScrollOffset = jmVar.f27455r.computeVerticalScrollOffset();
        this.f27123w = Math.max(0, computeVerticalScrollOffset - jmVar.getListTopPadding());
        this.f27124x = (b1Var.getMeasuredHeight() - jmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f12);
        ArrayList arrayList2 = this.f27117b;
        int size = arrayList2.size();
        float f13 = f12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            hm hmVar = (hm) arrayList2.get(i13);
            float b10 = hmVar.b();
            hmVar.f26836a = f13;
            hmVar.f26837b = i14;
            float f14 = this.f27123w;
            if (f13 < f14 || f13 > this.f27124x) {
                float f15 = f13 + b10;
                if ((f15 < f14 || f15 > this.f27124x) && (f13 > f14 || f15 < this.f27124x)) {
                    f7 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f7);
                    f13 += f7;
                    i14 = ((ArrayList) hmVar.f26843k.f25515f).size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = hmVar.h;
            int i15 = hmVar.f26844l;
            org.telegram.ui.ActionBar.c5 c5Var = hmVar.f26855x;
            im imVar = hmVar.f26857z;
            arrayList = arrayList2;
            float interpolation = hmVar.f26842j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - hmVar.f26838c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = org.telegram.messenger.i0.f16172q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float T1 = org.telegram.messenger.i0.T1(hmVar.f26839f, hmVar.d, interpolation);
            int width = imVar.getWidth();
            jm jmVar2 = imVar.P;
            float previewScale = width * T1 * jmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = jmVar2.getPreviewScale() * org.telegram.messenger.i0.T1(hmVar.f26840g, hmVar.e, interpolation) * max;
            if (c5Var != null) {
                f10 = 2.0f;
                hmVar.f26848p = 0.0f;
                float width2 = imVar.getWidth();
                float f16 = i15;
                hmVar.f26846n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                hmVar.f26847o = (Math.max(f16, previewScale) + imVar.getWidth()) / 2.0f;
                hmVar.f26849q = Math.max(i15 * 2, previewScale2);
                hmVar.f26855x.q(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                c5Var.setBounds((int) hmVar.f26846n, (int) hmVar.f26848p, (int) hmVar.f26847o, (int) hmVar.f26849q);
                if (hmVar.d <= 0.0f) {
                    f11 = 1.0f - interpolation;
                } else if (hmVar.f26839f <= 0.0f) {
                    f11 = interpolation;
                } else {
                    f11 = 1.0f;
                }
                c5Var.setAlpha((int) (f11 * 255.0f));
                c5Var.e(canvas, hmVar.f26856y, null);
                hmVar.f26848p += f16;
                hmVar.f26846n += f16;
                hmVar.f26849q -= f16;
                hmVar.f26847o -= f16;
            } else {
                f10 = 2.0f;
            }
            hmVar.f26850r = hmVar.f26847o - hmVar.f26846n;
            hmVar.f26851s = hmVar.f26849q - hmVar.f26848p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                gm gmVar2 = (gm) arrayList3.get(i16);
                if (gmVar2 != null && (((gmVar = jmVar2.J) == null || gmVar.f26477b != gmVar2.f26477b) && gmVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = hmVar.f26854w;
            RectF rectF = hmVar.f26852t;
            long j10 = hmVar.f26841i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (hmVar.f26853u == null || hmVar.v != j10) {
                    hmVar.v = j10;
                    hmVar.f26853u = new rz0(rh.h8.a1(false, org.telegram.messenger.dd.H(',', "UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, org.telegram.messenger.i0.o());
                }
                float L = org.telegram.messenger.i0.L(28.0f) + hmVar.f26853u.f30126c;
                float L2 = org.telegram.messenger.i0.L(32.0f);
                float f17 = hmVar.f26846n;
                float f18 = hmVar.f26850r;
                float f19 = f10;
                float B = c3.i0.B(f18, L, f19, f17);
                i10 = size;
                float f20 = hmVar.f26848p;
                i11 = i13;
                float f21 = hmVar.f26851s;
                i12 = i14;
                rectF.set(B, c3.i0.B(f21, L2, f19, f20), org.telegram.messenger.m5.a(f18, L, f19, f17), org.telegram.messenger.m5.a(f21, L2, f19, f20));
                paint.setColor(1610612736);
                float f22 = L2 / f19;
                canvas.drawRoundRect(rectF, f22, f22, paint);
                f7 = b10;
                hmVar.f26853u.c(org.telegram.messenger.i0.L(14.0f) + (((hmVar.f26850r / f19) + hmVar.f26846n) - (L / f19)), hmVar.f26848p + (hmVar.f26851s / f19), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f13 += f7;
            i14 = ((ArrayList) hmVar.f26843k.f25515f).size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.s0 s0Var = this.f27116a;
        s0Var.h0(f13, s0Var.getMeasuredHeight());
        if (s0Var.R()) {
            s0Var.H(canvas, true);
            s0Var.J(canvas, true);
        }
        s0Var.draw(canvas);
        canvas.restore();
        if (jmVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (jmVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.s0 s0Var = this.f27116a;
        s0Var.layout(0, 0, s0Var.getMeasuredWidth(), s0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f27116a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f27122s <= 0) {
            this.f27122s = i0.a.d(45.0f, org.telegram.messenger.i0.f16172q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f27122s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.im.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
