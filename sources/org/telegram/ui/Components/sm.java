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
public final class sm extends ViewGroup {
    public rm E;
    public qm F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.t6 M;
    public final om N;
    public int O;
    public final tm P;
    public final org.telegram.ui.Cells.w0 f30806a;
    public final ArrayList f30807b;
    public final HashMap f30808c;
    public HashMap d;
    public ArrayList f30809e;
    public HashMap f30810f;
    public ArrayList h;
    public final int f30811n;
    public final int f30812r;
    public int f30813s;
    public float v;
    public float f30814w;
    public boolean[] f30815x;
    public long f30816y;

    public sm(tm tmVar, Context context) {
        super(context);
        this.P = tmVar;
        this.f30807b = new ArrayList();
        this.f30808c = new HashMap();
        this.f30811n = AndroidUtilities.dp(16.0f);
        this.f30812r = AndroidUtilities.dp(64.0f);
        this.f30813s = 0;
        this.f30815x = null;
        this.f30816y = 0L;
        this.E = null;
        this.F = null;
        this.G = 0.0f;
        this.K = new PointF();
        this.L = false;
        this.M = new org.telegram.ui.Cells.t6(this, 8);
        this.N = new om(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, tmVar.f31091n, true);
        this.f30806a = w0Var;
        w0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(w0Var);
    }

    public final void a() {
        String str;
        this.d = this.P.P.getSelectedPhotos();
        this.f30809e = new ArrayList(this.d.entrySet());
        this.f30810f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f30807b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((rm) arrayList.get(i10)).f30452k.f28655g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.f30808c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f30810f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.f30809e.size()) {
                                Map.Entry entry = (Map.Entry) this.f30809e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f30810f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i12++;
                            } else {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < this.f30809e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.f30809e.get(i13);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof MediaController.PhotoEntry) && (str = ((MediaController.PhotoEntry) value2).path) != null && photoEntry != null && str.equals(photoEntry.path)) {
                                            Object key2 = entry2.getKey();
                                            this.f30810f.put(key2, value2);
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
        tm tmVar = this.P;
        qm qmVar = tmVar.J;
        PointF pointF = this.K;
        if (qmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!tmVar.K) {
            RectF f7 = qmVar.f(qmVar.e());
            RectF f10 = tmVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, tmVar.f31096y - ((tmVar.G - 0.5f) * tmVar.H), this.G);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + tmVar.J.f30075a.f30444a + f10.top, (tmVar.E - ((tmVar.F - 0.5f) * tmVar.I)) + tmVar.M, this.G);
            return pointF;
        } else {
            RectF f11 = qmVar.f(qmVar.e());
            RectF f12 = tmVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + tmVar.J.f30075a.f30444a + f12.top, this.I, this.G / this.J);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f30807b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((rm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                qm qmVar = (qm) arrayList2.get(i11);
                vh.f fVar = qmVar.f30091s;
                if (fVar != null) {
                    fVar.b(qmVar.O.f30466z);
                    qmVar.f30091s = null;
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
                rm rmVar = new rm(this);
                rm.a(rmVar, new mm(this.P, arrayList3), false);
                arrayList.add(rmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        tm tmVar;
        ai.w0 w0Var;
        boolean z10;
        ArrayList arrayList = this.f30807b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f7 = this.f30811n;
        int computeVerticalScrollOffset = this.P.f31092r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - tmVar.getListTopPadding());
        this.f30814w = (w0Var.getMeasuredHeight() - tmVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((rm) arrayList.get(i10)).b() + f7;
            float f10 = this.v;
            if ((f7 >= f10 && f7 <= this.f30814w) || ((b10 >= f10 && b10 <= this.f30814w) || (f7 <= f10 && b10 >= this.f30814w))) {
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
        int i10 = this.f30811n + this.f30812r;
        ArrayList arrayList = this.f30807b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((rm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.w0 w0Var = this.f30806a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return w0Var.getMeasuredHeight() + i10;
    }

    public final void f(rm rmVar, MediaController.PhotoEntry photoEntry, int i10) {
        rm rmVar2;
        ArrayList arrayList = rmVar.f30452k.f28655g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (rmVar.f30452k.f28655g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) rmVar.f30452k.f28655g.get(10);
            rmVar.f30452k.f28655g.remove(10);
            ArrayList arrayList2 = this.f30807b;
            int indexOf = arrayList2.indexOf(rmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                if (i11 == arrayList2.size()) {
                    rmVar2 = null;
                } else {
                    rmVar2 = (rm) arrayList2.get(i11);
                }
                if (rmVar2 == null) {
                    rm rmVar3 = new rm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    rm.a(rmVar3, new mm(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(rmVar2, photoEntry2, 0);
                }
            }
        }
        rm.a(rmVar, rmVar.f30452k, true);
    }

    public final void g() {
        float f7 = this.f30811n;
        ArrayList arrayList = this.f30807b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            rm rmVar = (rm) arrayList.get(i11);
            float b10 = rmVar.b();
            rmVar.f30444a = f7;
            rmVar.f30445b = i10;
            f7 += b10;
            i10 += rmVar.f30452k.f28655g.size();
        }
    }

    public final void h() {
        tm tmVar = this.P;
        ValueAnimator valueAnimator = tmVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        tmVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        tmVar.L = ofFloat;
        ofFloat.addUpdateListener(new nm(this, 1));
        tmVar.L.addListener(new r8(this, 10));
        tmVar.L.setDuration(200L);
        tmVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f30810f;
        ArrayList arrayList = this.h;
        km kmVar = chatAttachAlertPhotoLayout.G;
        xi xiVar = chatAttachAlertPhotoLayout.f29643b;
        wl wlVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f24020s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f24021t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = wlVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = wlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z14 = kmVar.f28166f;
                    boolean z15 = kmVar.d;
                    if (z14 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (xiVar.Q0 != 0 || xiVar.H) {
                        t5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(R);
                    if (b02 != null) {
                        if (hashMap2.size() > 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (R == kmVar.h() - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        t5Var.d(b02, z11, z12, z13, xiVar.f32822i0);
                        if ((xiVar.f32813f0 instanceof org.telegram.ui.yn) && xiVar.T1) {
                            t5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            t5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.P.f29643b.S1(1);
        }
    }

    @Override
    public final void invalidate() {
        int b10 = org.telegram.messenger.f0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f30813s != b10) {
            this.f30813s = b10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f30807b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            rm rmVar = (rm) arrayList.get(i10);
            if (rmVar.f30452k.f28655g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - rmVar.f30452k.f28655g.size();
                rm rmVar2 = (rm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, rmVar2.f30452k.f28655g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) rmVar2.f30452k.f28655g.remove(0));
                }
                rmVar.f30452k.f28655g.addAll(arrayList2);
                rm.a(rmVar, rmVar.f30452k, true);
                rm.a(rmVar2, rmVar2.f30452k, true);
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
        qm qmVar;
        float f10;
        float f11 = this.f30811n;
        tm tmVar = this.P;
        int computeVerticalScrollOffset = tmVar.f31092r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - tmVar.getListTopPadding());
        this.f30814w = (w0Var.getMeasuredHeight() - tmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList2 = this.f30807b;
        int size = arrayList2.size();
        float f12 = f11;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            rm rmVar = (rm) arrayList2.get(i13);
            float b10 = rmVar.b();
            rmVar.f30444a = f12;
            rmVar.f30445b = i14;
            float f13 = this.v;
            if (f12 < f13 || f12 > this.f30814w) {
                float f14 = f12 + b10;
                if ((f14 < f13 || f14 > this.f30814w) && (f12 > f13 || f14 < this.f30814w)) {
                    f7 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f7);
                    f12 += f7;
                    i14 = rmVar.f30452k.f28655g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = rmVar.h;
            int i15 = rmVar.f30453l;
            org.telegram.ui.ActionBar.e5 e5Var = rmVar.f30464x;
            sm smVar = rmVar.f30466z;
            arrayList = arrayList2;
            float interpolation = rmVar.f30451j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - rmVar.f30446c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(rmVar.f30448f, rmVar.d, interpolation);
            int width = smVar.getWidth();
            tm tmVar2 = smVar.P;
            float previewScale = width * lerp * tmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = tmVar2.getPreviewScale() * AndroidUtilities.lerp(rmVar.f30449g, rmVar.f30447e, interpolation) * max;
            if (e5Var != null) {
                rmVar.f30457p = 0.0f;
                float width2 = smVar.getWidth();
                float f15 = i15;
                rmVar.f30455n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                rmVar.f30456o = (Math.max(f15, previewScale) + smVar.getWidth()) / 2.0f;
                rmVar.f30458q = Math.max(i15 * 2, previewScale2);
                rmVar.f30464x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                e5Var.setBounds((int) rmVar.f30455n, (int) rmVar.f30457p, (int) rmVar.f30456o, (int) rmVar.f30458q);
                if (rmVar.d <= 0.0f) {
                    f10 = 1.0f - interpolation;
                } else if (rmVar.f30448f <= 0.0f) {
                    f10 = interpolation;
                } else {
                    f10 = 1.0f;
                }
                e5Var.setAlpha((int) (f10 * 255.0f));
                e5Var.d(canvas, rmVar.f30465y, null);
                rmVar.f30457p += f15;
                rmVar.f30455n += f15;
                rmVar.f30458q -= f15;
                rmVar.f30456o -= f15;
            }
            rmVar.f30459r = rmVar.f30456o - rmVar.f30455n;
            rmVar.f30460s = rmVar.f30458q - rmVar.f30457p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                qm qmVar2 = (qm) arrayList3.get(i16);
                if (qmVar2 != null && (((qmVar = tmVar2.J) == null || qmVar.f30076b != qmVar2.f30076b) && qmVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = rmVar.f30463w;
            RectF rectF = rmVar.f30461t;
            long j3 = rmVar.f30450i;
            if (j3 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (rmVar.f30462u == null || rmVar.v != j3) {
                    rmVar.v = j3;
                    rmVar.f30462u = new e11(yh.x7.d1(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + rmVar.f30462u.f25879c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f16 = rmVar.f30455n;
                float f17 = rmVar.f30459r;
                float A = com.google.android.gms.internal.vision.e2.A(f17, dp, 2.0f, f16);
                i10 = size;
                float f18 = rmVar.f30457p;
                i11 = i13;
                float f19 = rmVar.f30460s;
                i12 = i14;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f19, dp2, 2.0f, f18), org.telegram.messenger.f0.a(f17, dp, 2.0f, f16), org.telegram.messenger.f0.a(f19, dp2, 2.0f, f18));
                paint.setColor(1610612736);
                float f20 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f20, f20, paint);
                f7 = b10;
                rmVar.f30462u.c(AndroidUtilities.dp(14.0f) + (((rmVar.f30459r / 2.0f) + rmVar.f30455n) - (dp / 2.0f)), rmVar.f30457p + (rmVar.f30460s / 2.0f), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f12 += f7;
            i14 = rmVar.f30452k.f28655g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.w0 w0Var2 = this.f30806a;
        w0Var2.U(f12, w0Var2.getMeasuredHeight());
        if (w0Var2.H()) {
            w0Var2.y(canvas, true);
            w0Var2.A(canvas, true);
        }
        w0Var2.draw(canvas);
        canvas.restore();
        if (tmVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (tmVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.w0 w0Var = this.f30806a;
        w0Var.layout(0, 0, w0Var.getMeasuredWidth(), w0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f30806a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f30813s <= 0) {
            this.f30813s = org.telegram.messenger.f0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f30813s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sm.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
