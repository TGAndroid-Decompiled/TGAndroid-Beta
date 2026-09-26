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
public final class qm extends ViewGroup {
    public pm E;
    public om F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.t6 M;
    public final mm N;
    public int O;
    public final rm P;
    public final org.telegram.ui.Cells.w0 f27702a;
    public final ArrayList f27703b;
    public final HashMap f27704c;
    public HashMap d;
    public ArrayList e;
    public HashMap f27705f;
    public ArrayList h;
    public final int f27706n;
    public final int f27707r;
    public int f27708s;
    public float v;
    public float f27709w;
    public boolean[] f27710x;
    public long f27711y;

    public qm(rm rmVar, Context context) {
        super(context);
        this.P = rmVar;
        this.f27703b = new ArrayList();
        this.f27704c = new HashMap();
        this.f27706n = AndroidUtilities.dp(16.0f);
        this.f27707r = AndroidUtilities.dp(64.0f);
        this.f27708s = 0;
        this.f27710x = null;
        this.f27711y = 0L;
        this.E = null;
        this.F = null;
        this.G = 0.0f;
        this.K = new PointF();
        this.L = false;
        this.M = new org.telegram.ui.Cells.t6(this, 8);
        this.N = new mm(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, rmVar.f27999n, true);
        this.f27702a = w0Var;
        w0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(w0Var);
    }

    public final void a() {
        String str;
        this.d = this.P.P.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f27705f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f27703b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((pm) arrayList.get(i10)).f27390k.f25818g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.f27704c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f27705f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f27705f.put(key, value);
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
                                        if ((value2 instanceof MediaController.PhotoEntry) && (str = ((MediaController.PhotoEntry) value2).path) != null && photoEntry != null && str.equals(photoEntry.path)) {
                                            Object key2 = entry2.getKey();
                                            this.f27705f.put(key2, value2);
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
        rm rmVar = this.P;
        om omVar = rmVar.J;
        PointF pointF = this.K;
        if (omVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!rmVar.K) {
            RectF f7 = omVar.f(omVar.e());
            RectF f10 = rmVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, rmVar.f28004y - ((rmVar.G - 0.5f) * rmVar.H), this.G);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + rmVar.J.f27118a.f27383a + f10.top, (rmVar.E - ((rmVar.F - 0.5f) * rmVar.I)) + rmVar.M, this.G);
            return pointF;
        } else {
            RectF f11 = omVar.f(omVar.e());
            RectF f12 = rmVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + rmVar.J.f27118a.f27383a + f12.top, this.I, this.G / this.J);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f27703b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((pm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                om omVar = (om) arrayList2.get(i11);
                vh.f fVar = omVar.f27133s;
                if (fVar != null) {
                    fVar.b(omVar.O.f27404z);
                    omVar.f27133s = null;
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
                pm pmVar = new pm(this);
                pm.a(pmVar, new km(this.P, arrayList3), false);
                arrayList.add(pmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        rm rmVar;
        ai.w0 w0Var;
        boolean z10;
        ArrayList arrayList = this.f27703b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f7 = this.f27706n;
        int computeVerticalScrollOffset = this.P.f28000r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - rmVar.getListTopPadding());
        this.f27709w = (w0Var.getMeasuredHeight() - rmVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((pm) arrayList.get(i10)).b() + f7;
            float f10 = this.v;
            if ((f7 >= f10 && f7 <= this.f27709w) || ((b10 >= f10 && b10 <= this.f27709w) || (f7 <= f10 && b10 >= this.f27709w))) {
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
        int i10 = this.f27706n + this.f27707r;
        ArrayList arrayList = this.f27703b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((pm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.w0 w0Var = this.f27702a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return w0Var.getMeasuredHeight() + i10;
    }

    public final void f(pm pmVar, MediaController.PhotoEntry photoEntry, int i10) {
        pm pmVar2;
        ArrayList arrayList = pmVar.f27390k.f25818g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (pmVar.f27390k.f25818g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) pmVar.f27390k.f25818g.get(10);
            pmVar.f27390k.f25818g.remove(10);
            ArrayList arrayList2 = this.f27703b;
            int indexOf = arrayList2.indexOf(pmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                if (i11 == arrayList2.size()) {
                    pmVar2 = null;
                } else {
                    pmVar2 = (pm) arrayList2.get(i11);
                }
                if (pmVar2 == null) {
                    pm pmVar3 = new pm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    pm.a(pmVar3, new km(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(pmVar2, photoEntry2, 0);
                }
            }
        }
        pm.a(pmVar, pmVar.f27390k, true);
    }

    public final void g() {
        float f7 = this.f27706n;
        ArrayList arrayList = this.f27703b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            pm pmVar = (pm) arrayList.get(i11);
            float b10 = pmVar.b();
            pmVar.f27383a = f7;
            pmVar.f27384b = i10;
            f7 += b10;
            i10 += pmVar.f27390k.f25818g.size();
        }
    }

    public final void h() {
        rm rmVar = this.P;
        ValueAnimator valueAnimator = rmVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        rmVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        rmVar.L = ofFloat;
        ofFloat.addUpdateListener(new lm(this, 1));
        rmVar.L.addListener(new r8(this, 10));
        rmVar.L.setDuration(200L);
        rmVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f27705f;
        ArrayList arrayList = this.h;
        im imVar = chatAttachAlertPhotoLayout.G;
        wi wiVar = chatAttachAlertPhotoLayout.f27087b;
        ul ulVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f22122s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f22123t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = ulVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ulVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z14 = imVar.f25112f;
                    boolean z15 = imVar.d;
                    if (z14 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (wiVar.Q0 != 0 || wiVar.H) {
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
                        if (R == imVar.h() - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        t5Var.d(b02, z11, z12, z13, wiVar.f30014i0);
                        if ((wiVar.f30005f0 instanceof org.telegram.ui.wn) && wiVar.T1) {
                            t5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            t5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.P.f27087b.V1(1);
        }
    }

    @Override
    public final void invalidate() {
        int b10 = org.telegram.messenger.f0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f27708s != b10) {
            this.f27708s = b10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f27703b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            pm pmVar = (pm) arrayList.get(i10);
            if (pmVar.f27390k.f25818g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - pmVar.f27390k.f25818g.size();
                pm pmVar2 = (pm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, pmVar2.f27390k.f25818g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) pmVar2.f27390k.f25818g.remove(0));
                }
                pmVar.f27390k.f25818g.addAll(arrayList2);
                pm.a(pmVar, pmVar.f27390k, true);
                pm.a(pmVar2, pmVar2.f27390k, true);
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
        om omVar;
        float f10;
        float f11 = this.f27706n;
        rm rmVar = this.P;
        int computeVerticalScrollOffset = rmVar.f28000r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - rmVar.getListTopPadding());
        this.f27709w = (w0Var.getMeasuredHeight() - rmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList2 = this.f27703b;
        int size = arrayList2.size();
        float f12 = f11;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            pm pmVar = (pm) arrayList2.get(i13);
            float b10 = pmVar.b();
            pmVar.f27383a = f12;
            pmVar.f27384b = i14;
            float f13 = this.v;
            if (f12 < f13 || f12 > this.f27709w) {
                float f14 = f12 + b10;
                if ((f14 < f13 || f14 > this.f27709w) && (f12 > f13 || f14 < this.f27709w)) {
                    f7 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f7);
                    f12 += f7;
                    i14 = pmVar.f27390k.f25818g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = pmVar.h;
            int i15 = pmVar.f27391l;
            org.telegram.ui.ActionBar.d5 d5Var = pmVar.f27402x;
            qm qmVar = pmVar.f27404z;
            arrayList = arrayList2;
            float interpolation = pmVar.f27389j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - pmVar.f27385c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(pmVar.f27386f, pmVar.d, interpolation);
            int width = qmVar.getWidth();
            rm rmVar2 = qmVar.P;
            float previewScale = width * lerp * rmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = rmVar2.getPreviewScale() * AndroidUtilities.lerp(pmVar.f27387g, pmVar.e, interpolation) * max;
            if (d5Var != null) {
                pmVar.f27395p = 0.0f;
                float width2 = qmVar.getWidth();
                float f15 = i15;
                pmVar.f27393n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                pmVar.f27394o = (Math.max(f15, previewScale) + qmVar.getWidth()) / 2.0f;
                pmVar.f27396q = Math.max(i15 * 2, previewScale2);
                pmVar.f27402x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                d5Var.setBounds((int) pmVar.f27393n, (int) pmVar.f27395p, (int) pmVar.f27394o, (int) pmVar.f27396q);
                if (pmVar.d <= 0.0f) {
                    f10 = 1.0f - interpolation;
                } else if (pmVar.f27386f <= 0.0f) {
                    f10 = interpolation;
                } else {
                    f10 = 1.0f;
                }
                d5Var.setAlpha((int) (f10 * 255.0f));
                d5Var.d(canvas, pmVar.f27403y, null);
                pmVar.f27395p += f15;
                pmVar.f27393n += f15;
                pmVar.f27396q -= f15;
                pmVar.f27394o -= f15;
            }
            pmVar.f27397r = pmVar.f27394o - pmVar.f27393n;
            pmVar.f27398s = pmVar.f27396q - pmVar.f27395p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                om omVar2 = (om) arrayList3.get(i16);
                if (omVar2 != null && (((omVar = rmVar2.J) == null || omVar.f27119b != omVar2.f27119b) && omVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = pmVar.f27401w;
            RectF rectF = pmVar.f27399t;
            long j3 = pmVar.f27388i;
            if (j3 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (pmVar.f27400u == null || pmVar.v != j3) {
                    pmVar.v = j3;
                    pmVar.f27400u = new t01(yh.w7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + pmVar.f27400u.f28363c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f16 = pmVar.f27393n;
                float f17 = pmVar.f27397r;
                float A = com.google.android.gms.internal.vision.e2.A(f17, dp, 2.0f, f16);
                i10 = size;
                float f18 = pmVar.f27395p;
                i11 = i13;
                float f19 = pmVar.f27398s;
                i12 = i14;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f19, dp2, 2.0f, f18), org.telegram.messenger.f0.a(f17, dp, 2.0f, f16), org.telegram.messenger.f0.a(f19, dp2, 2.0f, f18));
                paint.setColor(1610612736);
                float f20 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f20, f20, paint);
                f7 = b10;
                pmVar.f27400u.c(AndroidUtilities.dp(14.0f) + (((pmVar.f27397r / 2.0f) + pmVar.f27393n) - (dp / 2.0f)), pmVar.f27395p + (pmVar.f27398s / 2.0f), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f12 += f7;
            i14 = pmVar.f27390k.f25818g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.w0 w0Var2 = this.f27702a;
        w0Var2.W(f12, w0Var2.getMeasuredHeight());
        if (w0Var2.J()) {
            w0Var2.y(canvas, true);
            w0Var2.A(canvas, true);
        }
        w0Var2.draw(canvas);
        canvas.restore();
        if (rmVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (rmVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.w0 w0Var = this.f27702a;
        w0Var.layout(0, 0, w0Var.getMeasuredWidth(), w0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f27702a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f27708s <= 0) {
            this.f27708s = org.telegram.messenger.f0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f27708s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qm.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
