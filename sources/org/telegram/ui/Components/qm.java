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
    public final org.telegram.ui.Cells.w0 f27696a;
    public final ArrayList f27697b;
    public final HashMap f27698c;
    public HashMap d;
    public ArrayList e;
    public HashMap f27699f;
    public ArrayList h;
    public final int f27700n;
    public final int f27701r;
    public int f27702s;
    public float v;
    public float f27703w;
    public boolean[] f27704x;
    public long f27705y;

    public qm(rm rmVar, Context context) {
        super(context);
        this.P = rmVar;
        this.f27697b = new ArrayList();
        this.f27698c = new HashMap();
        this.f27700n = AndroidUtilities.dp(16.0f);
        this.f27701r = AndroidUtilities.dp(64.0f);
        this.f27702s = 0;
        this.f27704x = null;
        this.f27705y = 0L;
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
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, rmVar.f27991n, true);
        this.f27696a = w0Var;
        w0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(w0Var);
    }

    public final void a() {
        String str;
        this.d = this.P.P.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f27699f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f27697b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((pm) arrayList.get(i10)).f27376k.f25800g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.f27698c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f27699f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f27699f.put(key, value);
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
                                            this.f27699f.put(key2, value2);
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
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, rmVar.f27996y - ((rmVar.G - 0.5f) * rmVar.H), this.G);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + rmVar.J.f27114a.f27369a + f10.top, (rmVar.E - ((rmVar.F - 0.5f) * rmVar.I)) + rmVar.M, this.G);
            return pointF;
        } else {
            RectF f11 = omVar.f(omVar.e());
            RectF f12 = rmVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + rmVar.J.f27114a.f27369a + f12.top, this.I, this.G / this.J);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f27697b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((pm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                om omVar = (om) arrayList2.get(i11);
                vh.f fVar = omVar.f27129s;
                if (fVar != null) {
                    fVar.b(omVar.O.f27390z);
                    omVar.f27129s = null;
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
        ArrayList arrayList = this.f27697b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f7 = this.f27700n;
        int computeVerticalScrollOffset = this.P.f27992r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - rmVar.getListTopPadding());
        this.f27703w = (w0Var.getMeasuredHeight() - rmVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((pm) arrayList.get(i10)).b() + f7;
            float f10 = this.v;
            if ((f7 >= f10 && f7 <= this.f27703w) || ((b10 >= f10 && b10 <= this.f27703w) || (f7 <= f10 && b10 >= this.f27703w))) {
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
        int i10 = this.f27700n + this.f27701r;
        ArrayList arrayList = this.f27697b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((pm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.w0 w0Var = this.f27696a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return w0Var.getMeasuredHeight() + i10;
    }

    public final void f(pm pmVar, MediaController.PhotoEntry photoEntry, int i10) {
        pm pmVar2;
        ArrayList arrayList = pmVar.f27376k.f25800g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (pmVar.f27376k.f25800g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) pmVar.f27376k.f25800g.get(10);
            pmVar.f27376k.f25800g.remove(10);
            ArrayList arrayList2 = this.f27697b;
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
        pm.a(pmVar, pmVar.f27376k, true);
    }

    public final void g() {
        float f7 = this.f27700n;
        ArrayList arrayList = this.f27697b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            pm pmVar = (pm) arrayList.get(i11);
            float b10 = pmVar.b();
            pmVar.f27369a = f7;
            pmVar.f27370b = i10;
            f7 += b10;
            i10 += pmVar.f27376k.f25800g.size();
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
        HashMap hashMap = this.f27699f;
        ArrayList arrayList = this.h;
        im imVar = chatAttachAlertPhotoLayout.G;
        wi wiVar = chatAttachAlertPhotoLayout.f27083b;
        ul ulVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f22108s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f22109t1;
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
                    boolean z14 = imVar.f25086f;
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
                        t5Var.d(b02, z11, z12, z13, wiVar.f29994i0);
                        if ((wiVar.f29985f0 instanceof org.telegram.ui.wn) && wiVar.T1) {
                            t5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            t5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.P.f27083b.V1(1);
        }
    }

    @Override
    public final void invalidate() {
        int b10 = org.telegram.messenger.f0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f27702s != b10) {
            this.f27702s = b10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f27697b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            pm pmVar = (pm) arrayList.get(i10);
            if (pmVar.f27376k.f25800g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - pmVar.f27376k.f25800g.size();
                pm pmVar2 = (pm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, pmVar2.f27376k.f25800g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) pmVar2.f27376k.f25800g.remove(0));
                }
                pmVar.f27376k.f25800g.addAll(arrayList2);
                pm.a(pmVar, pmVar.f27376k, true);
                pm.a(pmVar2, pmVar2.f27376k, true);
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
        float f11 = this.f27700n;
        rm rmVar = this.P;
        int computeVerticalScrollOffset = rmVar.f27992r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - rmVar.getListTopPadding());
        this.f27703w = (w0Var.getMeasuredHeight() - rmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList2 = this.f27697b;
        int size = arrayList2.size();
        float f12 = f11;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            pm pmVar = (pm) arrayList2.get(i13);
            float b10 = pmVar.b();
            pmVar.f27369a = f12;
            pmVar.f27370b = i14;
            float f13 = this.v;
            if (f12 < f13 || f12 > this.f27703w) {
                float f14 = f12 + b10;
                if ((f14 < f13 || f14 > this.f27703w) && (f12 > f13 || f14 < this.f27703w)) {
                    f7 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f7);
                    f12 += f7;
                    i14 = pmVar.f27376k.f25800g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = pmVar.h;
            int i15 = pmVar.f27377l;
            org.telegram.ui.ActionBar.d5 d5Var = pmVar.f27388x;
            qm qmVar = pmVar.f27390z;
            arrayList = arrayList2;
            float interpolation = pmVar.f27375j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - pmVar.f27371c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(pmVar.f27372f, pmVar.d, interpolation);
            int width = qmVar.getWidth();
            rm rmVar2 = qmVar.P;
            float previewScale = width * lerp * rmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = rmVar2.getPreviewScale() * AndroidUtilities.lerp(pmVar.f27373g, pmVar.e, interpolation) * max;
            if (d5Var != null) {
                pmVar.f27381p = 0.0f;
                float width2 = qmVar.getWidth();
                float f15 = i15;
                pmVar.f27379n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                pmVar.f27380o = (Math.max(f15, previewScale) + qmVar.getWidth()) / 2.0f;
                pmVar.f27382q = Math.max(i15 * 2, previewScale2);
                pmVar.f27388x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                d5Var.setBounds((int) pmVar.f27379n, (int) pmVar.f27381p, (int) pmVar.f27380o, (int) pmVar.f27382q);
                if (pmVar.d <= 0.0f) {
                    f10 = 1.0f - interpolation;
                } else if (pmVar.f27372f <= 0.0f) {
                    f10 = interpolation;
                } else {
                    f10 = 1.0f;
                }
                d5Var.setAlpha((int) (f10 * 255.0f));
                d5Var.d(canvas, pmVar.f27389y, null);
                pmVar.f27381p += f15;
                pmVar.f27379n += f15;
                pmVar.f27382q -= f15;
                pmVar.f27380o -= f15;
            }
            pmVar.f27383r = pmVar.f27380o - pmVar.f27379n;
            pmVar.f27384s = pmVar.f27382q - pmVar.f27381p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                om omVar2 = (om) arrayList3.get(i16);
                if (omVar2 != null && (((omVar = rmVar2.J) == null || omVar.f27115b != omVar2.f27115b) && omVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = pmVar.f27387w;
            RectF rectF = pmVar.f27385t;
            long j3 = pmVar.f27374i;
            if (j3 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (pmVar.f27386u == null || pmVar.v != j3) {
                    pmVar.v = j3;
                    pmVar.f27386u = new t01(yh.w7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + pmVar.f27386u.f28357c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f16 = pmVar.f27379n;
                float f17 = pmVar.f27383r;
                float A = com.google.android.gms.internal.vision.e2.A(f17, dp, 2.0f, f16);
                i10 = size;
                float f18 = pmVar.f27381p;
                i11 = i13;
                float f19 = pmVar.f27384s;
                i12 = i14;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f19, dp2, 2.0f, f18), org.telegram.messenger.f0.a(f17, dp, 2.0f, f16), org.telegram.messenger.f0.a(f19, dp2, 2.0f, f18));
                paint.setColor(1610612736);
                float f20 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f20, f20, paint);
                f7 = b10;
                pmVar.f27386u.c(AndroidUtilities.dp(14.0f) + (((pmVar.f27383r / 2.0f) + pmVar.f27379n) - (dp / 2.0f)), pmVar.f27381p + (pmVar.f27384s / 2.0f), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f12 += f7;
            i14 = pmVar.f27376k.f25800g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.w0 w0Var2 = this.f27696a;
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
        org.telegram.ui.Cells.w0 w0Var = this.f27696a;
        w0Var.layout(0, 0, w0Var.getMeasuredWidth(), w0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f27696a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f27702s <= 0) {
            this.f27702s = org.telegram.messenger.f0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f27702s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qm.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
