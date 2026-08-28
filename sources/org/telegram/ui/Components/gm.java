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
public final class gm extends ViewGroup {
    public fm A;
    public em B;
    public float C;
    public float D;
    public float E;
    public float F;
    public final PointF G;
    public boolean H;
    public final m.i3 I;
    public final cm J;
    public int K;
    public final hm L;
    public final org.telegram.ui.Cells.w0 f28797a;
    public final ArrayList f28798b;
    public final HashMap f28799c;
    public HashMap d;
    public ArrayList f28800e;
    public HashMap f28801f;
    public ArrayList h;
    public final int f28802n;
    public final int f28803r;
    public int f28804s;
    public float v;
    public float f28805w;
    public boolean[] f28806x;
    public long f28807y;

    public gm(hm hmVar, Context context) {
        super(context);
        this.L = hmVar;
        this.f28798b = new ArrayList();
        this.f28799c = new HashMap();
        this.f28802n = AndroidUtilities.dp(16.0f);
        this.f28803r = AndroidUtilities.dp(64.0f);
        this.f28804s = 0;
        this.f28806x = null;
        this.f28807y = 0L;
        this.A = null;
        this.B = null;
        this.C = 0.0f;
        this.G = new PointF();
        this.H = false;
        this.I = new m.i3(this, 14);
        this.J = new cm(this);
        this.K = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, hmVar.f29123n, true);
        this.f28797a = w0Var;
        w0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(w0Var);
    }

    public final void a() {
        String str;
        this.d = this.L.L.getSelectedPhotos();
        this.f28800e = new ArrayList(this.d.entrySet());
        this.f28801f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f28798b;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ArrayList arrayList2 = ((fm) arrayList.get(i9)).f28498k.f26867g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i10);
                    HashMap hashMap = this.f28799c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f28801f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i11 = 0;
                        while (true) {
                            if (i11 < this.f28800e.size()) {
                                Map.Entry entry = (Map.Entry) this.f28800e.get(i11);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f28801f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i11++;
                            } else {
                                int i12 = 0;
                                while (true) {
                                    if (i12 < this.f28800e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.f28800e.get(i12);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof MediaController.PhotoEntry) && (str = ((MediaController.PhotoEntry) value2).path) != null && photoEntry != null && str.equals(photoEntry.path)) {
                                            Object key2 = entry2.getKey();
                                            this.f28801f.put(key2, value2);
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
        hm hmVar = this.L;
        em emVar = hmVar.F;
        PointF pointF = this.G;
        if (emVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!hmVar.G) {
            RectF f10 = emVar.f(emVar.e());
            RectF f11 = hmVar.F.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f10.width() / 2.0f) + f11.left, hmVar.f29128y - ((hmVar.C - 0.5f) * hmVar.D), this.C);
            pointF.y = AndroidUtilities.lerp((f10.height() / 2.0f) + hmVar.F.f28062a.f28490a + f11.top, (hmVar.A - ((hmVar.B - 0.5f) * hmVar.E)) + hmVar.I, this.C);
            return pointF;
        } else {
            RectF f12 = emVar.f(emVar.e());
            RectF f13 = hmVar.F.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f12.width() / 2.0f) + f13.left, this.D, this.C / this.F);
            pointF.y = AndroidUtilities.lerp((f12.height() / 2.0f) + hmVar.F.f28062a.f28490a + f13.top, this.E, this.C / this.F);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i9 = 0;
        while (true) {
            arrayList = this.f28798b;
            if (i9 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((fm) arrayList.get(i9)).h;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                em emVar = (em) arrayList2.get(i10);
                dh.k kVar = emVar.f28078s;
                if (kVar != null) {
                    kVar.b(emVar.O.f28512z);
                    emVar.f28078s = null;
                }
            }
            i9++;
        }
        arrayList.clear();
        ArrayList arrayList3 = new ArrayList();
        int size = this.h.size();
        int i11 = size - 1;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) this.h.get(i12);
            num.getClass();
            arrayList3.add((MediaController.PhotoEntry) this.d.get(num));
            if (i12 % 10 == 9 || i12 == i11) {
                fm fmVar = new fm(this);
                fm.a(fmVar, new am(this.L, arrayList3), false);
                arrayList.add(fmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        hm hmVar;
        gh.f1 f1Var;
        boolean z10;
        ArrayList arrayList = this.f28798b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f10 = this.f28802n;
        int computeVerticalScrollOffset = this.L.f29124r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - hmVar.getListTopPadding());
        this.f28805w = (f1Var.getMeasuredHeight() - hmVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            float b10 = ((fm) arrayList.get(i9)).b() + f10;
            float f11 = this.v;
            if ((f10 >= f11 && f10 <= this.f28805w) || ((b10 >= f11 && b10 <= this.f28805w) || (f10 <= f11 && b10 >= this.f28805w))) {
                z10 = true;
            } else {
                z10 = false;
            }
            zArr[i9] = z10;
            i9++;
            f10 = b10;
        }
        return zArr;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final int e() {
        int i9 = this.f28802n + this.f28803r;
        ArrayList arrayList = this.f28798b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i9 = (int) (((fm) arrayList.get(i10)).b() + i9);
        }
        org.telegram.ui.Cells.w0 w0Var = this.f28797a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return w0Var.getMeasuredHeight() + i9;
    }

    public final void f(fm fmVar, MediaController.PhotoEntry photoEntry, int i9) {
        fm fmVar2;
        ArrayList arrayList = fmVar.f28498k.f26867g;
        arrayList.add(Math.min(arrayList.size(), i9), photoEntry);
        if (fmVar.f28498k.f26867g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) fmVar.f28498k.f26867g.get(10);
            fmVar.f28498k.f26867g.remove(10);
            ArrayList arrayList2 = this.f28798b;
            int indexOf = arrayList2.indexOf(fmVar);
            if (indexOf >= 0) {
                int i10 = indexOf + 1;
                if (i10 == arrayList2.size()) {
                    fmVar2 = null;
                } else {
                    fmVar2 = (fm) arrayList2.get(i10);
                }
                if (fmVar2 == null) {
                    fm fmVar3 = new fm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    fm.a(fmVar3, new am(this.L, arrayList3), true);
                    invalidate();
                } else {
                    f(fmVar2, photoEntry2, 0);
                }
            }
        }
        fm.a(fmVar, fmVar.f28498k, true);
    }

    public final void g() {
        float f10 = this.f28802n;
        ArrayList arrayList = this.f28798b;
        int size = arrayList.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            fm fmVar = (fm) arrayList.get(i10);
            float b10 = fmVar.b();
            fmVar.f28490a = f10;
            fmVar.f28491b = i9;
            f10 += b10;
            i9 += fmVar.f28498k.f26867g.size();
        }
    }

    public final void h() {
        hm hmVar = this.L;
        ValueAnimator valueAnimator = hmVar.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.C;
        this.F = f10;
        this.D = b10.x;
        this.E = b10.y;
        hmVar.G = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        hmVar.H = ofFloat;
        ofFloat.addUpdateListener(new bm(this, 1));
        hmVar.H.addListener(new org.telegram.ui.xp(this, 16));
        hmVar.H.setDuration(200L);
        hmVar.H.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f28801f;
        ArrayList arrayList = this.h;
        yl ylVar = chatAttachAlertPhotoLayout.C;
        ki kiVar = chatAttachAlertPhotoLayout.f27493b;
        kl klVar = chatAttachAlertPhotoLayout.A;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f26243o1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f26244p1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            chatAttachAlertPhotoLayout.x0(false);
            chatAttachAlertPhotoLayout.v0();
            int childCount = klVar.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = klVar.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z14 = ylVar.f35000f;
                    boolean z15 = ylVar.d;
                    if (z14 && R > chatAttachAlertPhotoLayout.I0) {
                        R--;
                    }
                    if (z15 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                        R--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (kiVar.M0 != 0 || kiVar.D) {
                        t5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry a02 = chatAttachAlertPhotoLayout.a0(R);
                    if (a02 != null) {
                        if (hashMap2.size() > 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z15 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (R == ylVar.h() - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        t5Var.d(a02, z11, z12, z13, kiVar.f30110e0);
                        if ((kiVar.f30099b0 instanceof org.telegram.ui.qn) && kiVar.P1) {
                            t5Var.b(arrayList2.indexOf(Integer.valueOf(a02.imageId)), hashMap2.containsKey(Integer.valueOf(a02.imageId)), false);
                        } else {
                            t5Var.b(-1, hashMap2.containsKey(Integer.valueOf(a02.imageId)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.L.f27493b.V1(1);
        }
    }

    @Override
    public final void invalidate() {
        int b10 = org.telegram.messenger.l0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f28804s != b10) {
            this.f28804s = b10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f28798b;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            fm fmVar = (fm) arrayList.get(i9);
            if (fmVar.f28498k.f26867g.size() < 10 && i9 < arrayList.size() - 1) {
                int size2 = 10 - fmVar.f28498k.f26867g.size();
                fm fmVar2 = (fm) arrayList.get(i9 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, fmVar2.f28498k.f26867g.size());
                for (int i10 = 0; i10 < min; i10++) {
                    arrayList2.add((MediaController.PhotoEntry) fmVar2.f28498k.f26867g.remove(0));
                }
                fmVar.f28498k.f26867g.addAll(arrayList2);
                fm.a(fmVar, fmVar.f28498k, true);
                fm.a(fmVar2, fmVar2.f28498k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        gh.f1 f1Var;
        float f10;
        ArrayList arrayList;
        int i9;
        int i10;
        int i11;
        boolean z10;
        em emVar;
        float f11;
        float f12 = this.f28802n;
        hm hmVar = this.L;
        int computeVerticalScrollOffset = hmVar.f29124r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - hmVar.getListTopPadding());
        this.f28805w = (f1Var.getMeasuredHeight() - hmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f12);
        ArrayList arrayList2 = this.f28798b;
        int size = arrayList2.size();
        float f13 = f12;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            fm fmVar = (fm) arrayList2.get(i12);
            float b10 = fmVar.b();
            fmVar.f28490a = f13;
            fmVar.f28491b = i13;
            float f14 = this.v;
            if (f13 < f14 || f13 > this.f28805w) {
                float f15 = f13 + b10;
                if ((f15 < f14 || f15 > this.f28805w) && (f13 > f14 || f15 < this.f28805w)) {
                    f10 = b10;
                    arrayList = arrayList2;
                    i9 = size;
                    i10 = i12;
                    i11 = i13;
                    canvas.translate(0.0f, f10);
                    f13 += f10;
                    i13 = fmVar.f28498k.f26867g.size() + i11;
                    i12 = i10 + 1;
                    size = i9;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = fmVar.h;
            int i14 = fmVar.f28499l;
            org.telegram.ui.ActionBar.d5 d5Var = fmVar.f28510x;
            gm gmVar = fmVar.f28512z;
            arrayList = arrayList2;
            float interpolation = fmVar.f28497j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - fmVar.f28492c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(fmVar.f28494f, fmVar.d, interpolation);
            int width = gmVar.getWidth();
            hm hmVar2 = gmVar.L;
            float previewScale = width * lerp * hmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = hmVar2.getPreviewScale() * AndroidUtilities.lerp(fmVar.f28495g, fmVar.f28493e, interpolation) * max;
            if (d5Var != null) {
                fmVar.f28503p = 0.0f;
                float width2 = gmVar.getWidth();
                float f16 = i14;
                fmVar.f28501n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                fmVar.f28502o = (Math.max(f16, previewScale) + gmVar.getWidth()) / 2.0f;
                fmVar.f28504q = Math.max(i14 * 2, previewScale2);
                fmVar.f28510x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                d5Var.setBounds((int) fmVar.f28501n, (int) fmVar.f28503p, (int) fmVar.f28502o, (int) fmVar.f28504q);
                if (fmVar.d <= 0.0f) {
                    f11 = 1.0f - interpolation;
                } else if (fmVar.f28494f <= 0.0f) {
                    f11 = interpolation;
                } else {
                    f11 = 1.0f;
                }
                d5Var.setAlpha((int) (f11 * 255.0f));
                d5Var.d(canvas, fmVar.f28511y, null);
                fmVar.f28503p += f16;
                fmVar.f28501n += f16;
                fmVar.f28504q -= f16;
                fmVar.f28502o -= f16;
            }
            fmVar.f28505r = fmVar.f28502o - fmVar.f28501n;
            fmVar.f28506s = fmVar.f28504q - fmVar.f28503p;
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                em emVar2 = (em) arrayList3.get(i15);
                if (emVar2 != null && (((emVar = hmVar2.F) == null || emVar.f28063b != emVar2.f28063b) && emVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = fmVar.f28509w;
            RectF rectF = fmVar.f28507t;
            long j10 = fmVar.f28496i;
            if (j10 <= 0) {
                i9 = size;
                i10 = i12;
                i11 = i13;
                f10 = b10;
            } else {
                if (fmVar.f28508u == null || fmVar.v != j10) {
                    fmVar.v = j10;
                    fmVar.f28508u = new nz0(gh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + fmVar.f28508u.f31223c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f17 = fmVar.f28501n;
                float f18 = fmVar.f28505r;
                float A = e2.c.A(f18, dp, 2.0f, f17);
                i9 = size;
                float f19 = fmVar.f28503p;
                i10 = i12;
                float f20 = fmVar.f28506s;
                i11 = i13;
                rectF.set(A, e2.c.A(f20, dp2, 2.0f, f19), j3.r0.c(f18, dp, 2.0f, f17), j3.r0.c(f20, dp2, 2.0f, f19));
                paint.setColor(1610612736);
                float f21 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f21, f21, paint);
                f10 = b10;
                fmVar.f28508u.c(AndroidUtilities.dp(14.0f) + (((fmVar.f28505r / 2.0f) + fmVar.f28501n) - (dp / 2.0f)), fmVar.f28503p + (fmVar.f28506s / 2.0f), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f13 += f10;
            i13 = fmVar.f28498k.f26867g.size() + i11;
            i12 = i10 + 1;
            size = i9;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.w0 w0Var = this.f28797a;
        w0Var.V(f13, w0Var.getMeasuredHeight());
        if (w0Var.I()) {
            w0Var.y(canvas, true);
            w0Var.A(canvas, true);
        }
        w0Var.draw(canvas);
        canvas.restore();
        if (hmVar.F != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (hmVar.F.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        org.telegram.ui.Cells.w0 w0Var = this.f28797a;
        w0Var.layout(0, 0, w0Var.getMeasuredWidth(), w0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        this.f28797a.measure(i9, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f28804s <= 0) {
            this.f28804s = org.telegram.messenger.l0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), this.f28804s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gm.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
