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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public final class gn extends ViewGroup {
    public fn E;
    public en F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.t6 M;
    public final cn N;
    public int O;
    public final hn P;
    public final org.telegram.ui.Cells.w0 f26823a;
    public final ArrayList f26824b;
    public final HashMap f26825c;
    public HashMap d;
    public ArrayList f26826e;
    public HashMap f26827f;
    public ArrayList h;
    public final int f26828n;
    public final int f26829r;
    public int f26830s;
    public float v;
    public float f26831w;
    public boolean[] f26832x;
    public long f26833y;

    public gn(hn hnVar, Context context) {
        super(context);
        this.P = hnVar;
        this.f26824b = new ArrayList();
        this.f26825c = new HashMap();
        this.f26828n = AndroidUtilities.dp(16.0f);
        this.f26829r = AndroidUtilities.dp(64.0f);
        this.f26830s = 0;
        this.f26832x = null;
        this.f26833y = 0L;
        this.E = null;
        this.F = null;
        this.G = 0.0f;
        this.K = new PointF();
        this.L = false;
        this.M = new org.telegram.ui.Cells.t6(this, 7);
        this.N = new cn(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, hnVar.f27169n, true);
        this.f26823a = w0Var;
        w0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(w0Var);
    }

    public final void a() {
        String str;
        this.d = this.P.P.getSelectedPhotos();
        this.f26826e = new ArrayList(this.d.entrySet());
        this.f26827f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f26824b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((fn) arrayList.get(i10)).f26498k.f24633g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.f26825c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f26827f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.f26826e.size()) {
                                Map.Entry entry = (Map.Entry) this.f26826e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f26827f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i12++;
                            } else {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < this.f26826e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.f26826e.get(i13);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof MediaController.PhotoEntry) && (str = ((MediaController.PhotoEntry) value2).path) != null && photoEntry != null && str.equals(photoEntry.path)) {
                                            Object key2 = entry2.getKey();
                                            this.f26827f.put(key2, value2);
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
        hn hnVar = this.P;
        en enVar = hnVar.J;
        PointF pointF = this.K;
        if (enVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!hnVar.K) {
            RectF f7 = enVar.f(enVar.e());
            RectF f10 = hnVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, hnVar.f27174y - ((hnVar.G - 0.5f) * hnVar.H), this.G);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + hnVar.J.f26119a.f26490a + f10.top, (hnVar.E - ((hnVar.F - 0.5f) * hnVar.I)) + hnVar.M, this.G);
            return pointF;
        } else {
            RectF f11 = enVar.f(enVar.e());
            RectF f12 = hnVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + hnVar.J.f26119a.f26490a + f12.top, this.I, this.G / this.J);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f26824b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((fn) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                en enVar = (en) arrayList2.get(i11);
                vh.f fVar = enVar.f26135s;
                if (fVar != null) {
                    fVar.b(enVar.O.f26512z);
                    enVar.f26135s = null;
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
            arrayList3.add((MediaController.PhotoEntry) this.d.get(num));
            if (i13 % 10 == 9 || i13 == i12) {
                fn fnVar = new fn(this);
                fn.a(fnVar, new an(this.P, arrayList3), false);
                arrayList.add(fnVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        hn hnVar;
        ai.w0 w0Var;
        boolean z10;
        ArrayList arrayList = this.f26824b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f7 = this.f26828n;
        int computeVerticalScrollOffset = this.P.f27170r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - hnVar.getListTopPadding());
        this.f26831w = (w0Var.getMeasuredHeight() - hnVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((fn) arrayList.get(i10)).b() + f7;
            float f10 = this.v;
            if ((f7 >= f10 && f7 <= this.f26831w) || ((b10 >= f10 && b10 <= this.f26831w) || (f7 <= f10 && b10 >= this.f26831w))) {
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    public final int e() {
        int i10 = this.f26828n + this.f26829r;
        ArrayList arrayList = this.f26824b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((fn) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.w0 w0Var = this.f26823a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return w0Var.getMeasuredHeight() + i10;
    }

    public final void f(fn fnVar, MediaController.PhotoEntry photoEntry, int i10) {
        fn fnVar2;
        ArrayList arrayList = fnVar.f26498k.f24633g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (fnVar.f26498k.f24633g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) fnVar.f26498k.f24633g.get(10);
            fnVar.f26498k.f24633g.remove(10);
            ArrayList arrayList2 = this.f26824b;
            int indexOf = arrayList2.indexOf(fnVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                if (i11 == arrayList2.size()) {
                    fnVar2 = null;
                } else {
                    fnVar2 = (fn) arrayList2.get(i11);
                }
                if (fnVar2 == null) {
                    fn fnVar3 = new fn(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    fn.a(fnVar3, new an(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(fnVar2, photoEntry2, 0);
                }
            }
        }
        fn.a(fnVar, fnVar.f26498k, true);
    }

    public final void g() {
        float f7 = this.f26828n;
        ArrayList arrayList = this.f26824b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            fn fnVar = (fn) arrayList.get(i11);
            float b10 = fnVar.b();
            fnVar.f26490a = f7;
            fnVar.f26491b = i10;
            f7 += b10;
            i10 += fnVar.f26498k.f24633g.size();
        }
    }

    public final void h() {
        hn hnVar = this.P;
        ValueAnimator valueAnimator = hnVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        hnVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        hnVar.L = ofFloat;
        ofFloat.addUpdateListener(new bn(this, 1));
        hnVar.L.addListener(new t8(this, 10));
        hnVar.L.setDuration(200L);
        hnVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f26827f;
        ArrayList arrayList = this.h;
        ym ymVar = chatAttachAlertPhotoLayout.G;
        yi yiVar = chatAttachAlertPhotoLayout.f30245b;
        km kmVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f24051s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f24052t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            boolean z15 = false;
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = kmVar.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = kmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z16 = ymVar.f33410f;
                    boolean z17 = ymVar.d;
                    if (z16 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z17 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (yiVar.T0 != 0 || yiVar.H) {
                        t5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(R);
                    if (b02 != null) {
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
                        if (R == ymVar.h() - 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        t5Var.d(b02, z12, z13, z14, yiVar.f33298i0);
                        if ((yiVar.f33289f0 instanceof org.telegram.ui.zn) && yiVar.W1) {
                            z11 = false;
                            t5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            z11 = false;
                            t5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
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
            this.P.f30245b.Z1(1);
        }
    }

    @Override
    public final void invalidate() {
        int b10 = org.telegram.messenger.q.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f26830s != b10) {
            this.f26830s = b10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f26824b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            fn fnVar = (fn) arrayList.get(i10);
            if (fnVar.f26498k.f24633g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - fnVar.f26498k.f24633g.size();
                fn fnVar2 = (fn) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, fnVar2.f26498k.f24633g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) fnVar2.f26498k.f24633g.remove(0));
                }
                fnVar.f26498k.f24633g.addAll(arrayList2);
                fn.a(fnVar, fnVar.f26498k, true);
                fn.a(fnVar2, fnVar2.f26498k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ai.w0 w0Var;
        float f7;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        boolean z10;
        float f10;
        en enVar;
        float f11;
        float f12 = this.f26828n;
        hn hnVar = this.P;
        int computeVerticalScrollOffset = hnVar.f27170r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - hnVar.getListTopPadding());
        this.f26831w = (w0Var.getMeasuredHeight() - hnVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f12);
        ArrayList arrayList2 = this.f26824b;
        int size = arrayList2.size();
        float f13 = f12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            fn fnVar = (fn) arrayList2.get(i13);
            float b10 = fnVar.b();
            fnVar.f26490a = f13;
            fnVar.f26491b = i14;
            float f14 = this.v;
            if (f13 < f14 || f13 > this.f26831w) {
                float f15 = f13 + b10;
                if ((f15 < f14 || f15 > this.f26831w) && (f13 > f14 || f15 < this.f26831w)) {
                    f7 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f7);
                    f13 += f7;
                    i14 = fnVar.f26498k.f24633g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = fnVar.h;
            int i15 = fnVar.f26499l;
            org.telegram.ui.ActionBar.d5 d5Var = fnVar.f26510x;
            gn gnVar = fnVar.f26512z;
            arrayList = arrayList2;
            float interpolation = fnVar.f26497j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - fnVar.f26492c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(fnVar.f26494f, fnVar.d, interpolation);
            int width = gnVar.getWidth();
            hn hnVar2 = gnVar.P;
            float previewScale = width * lerp * hnVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = hnVar2.getPreviewScale() * AndroidUtilities.lerp(fnVar.f26495g, fnVar.f26493e, interpolation) * max;
            if (d5Var != null) {
                f10 = 2.0f;
                fnVar.f26503p = 0.0f;
                float width2 = gnVar.getWidth();
                float f16 = i15;
                fnVar.f26501n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                fnVar.f26502o = (Math.max(f16, previewScale) + gnVar.getWidth()) / 2.0f;
                fnVar.f26504q = Math.max(i15 * 2, previewScale2);
                fnVar.f26510x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                d5Var.setBounds((int) fnVar.f26501n, (int) fnVar.f26503p, (int) fnVar.f26502o, (int) fnVar.f26504q);
                if (fnVar.d <= 0.0f) {
                    f11 = 1.0f - interpolation;
                } else if (fnVar.f26494f <= 0.0f) {
                    f11 = interpolation;
                } else {
                    f11 = 1.0f;
                }
                d5Var.setAlpha((int) (f11 * 255.0f));
                d5Var.d(canvas, fnVar.f26511y, null);
                fnVar.f26503p += f16;
                fnVar.f26501n += f16;
                fnVar.f26504q -= f16;
                fnVar.f26502o -= f16;
            } else {
                f10 = 2.0f;
            }
            fnVar.f26505r = fnVar.f26502o - fnVar.f26501n;
            fnVar.f26506s = fnVar.f26504q - fnVar.f26503p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                en enVar2 = (en) arrayList3.get(i16);
                if (enVar2 != null && (((enVar = hnVar2.J) == null || enVar.f26120b != enVar2.f26120b) && enVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = fnVar.f26509w;
            RectF rectF = fnVar.f26507t;
            long j3 = fnVar.f26496i;
            if (j3 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (fnVar.f26508u == null || fnVar.v != j3) {
                    fnVar.v = j3;
                    fnVar.f26508u = new m11(yh.p7.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + fnVar.f26508u.f28678c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f17 = fnVar.f26501n;
                float f18 = fnVar.f26505r;
                float f19 = f10;
                float z12 = com.google.android.gms.internal.vision.e2.z(f18, dp, f19, f17);
                i10 = size;
                float f20 = fnVar.f26503p;
                i11 = i13;
                float f21 = fnVar.f26506s;
                i12 = i14;
                rectF.set(z12, com.google.android.gms.internal.vision.e2.z(f21, dp2, f19, f20), org.telegram.messenger.q.a(f18, dp, f19, f17), org.telegram.messenger.q.a(f21, dp2, f19, f20));
                paint.setColor(1610612736);
                float f22 = dp2 / f19;
                canvas.drawRoundRect(rectF, f22, f22, paint);
                f7 = b10;
                fnVar.f26508u.c(AndroidUtilities.dp(14.0f) + (((fnVar.f26505r / f19) + fnVar.f26501n) - (dp / f19)), fnVar.f26503p + (fnVar.f26506s / f19), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f13 += f7;
            i14 = fnVar.f26498k.f24633g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.w0 w0Var2 = this.f26823a;
        w0Var2.a0(f13, w0Var2.getMeasuredHeight());
        if (w0Var2.K()) {
            w0Var2.B(canvas, true);
            w0Var2.D(canvas, true);
        }
        w0Var2.draw(canvas);
        canvas.restore();
        if (hnVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (hnVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.w0 w0Var = this.f26823a;
        w0Var.layout(0, 0, w0Var.getMeasuredWidth(), w0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f26823a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f26830s <= 0) {
            this.f26830s = org.telegram.messenger.q.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f26830s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gn.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
