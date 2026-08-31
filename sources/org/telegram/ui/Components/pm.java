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
public final class pm extends ViewGroup {
    public om B;
    public nm C;
    public float D;
    public float E;
    public float F;
    public float G;
    public final PointF H;
    public boolean I;
    public final m2.b J;
    public final lm K;
    public int L;
    public final qm M;
    public final org.telegram.ui.Cells.v0 f30114a;
    public final ArrayList f30115b;
    public final HashMap f30116c;
    public HashMap d;
    public ArrayList f30117e;
    public HashMap f30118f;
    public ArrayList h;
    public final int f30119n;
    public final int f30120r;
    public int f30121s;
    public float v;
    public float f30122w;
    public boolean[] f30123x;
    public long f30124y;

    public pm(qm qmVar, Context context) {
        super(context);
        this.M = qmVar;
        this.f30115b = new ArrayList();
        this.f30116c = new HashMap();
        this.f30119n = AndroidUtilities.dp(16.0f);
        this.f30120r = AndroidUtilities.dp(64.0f);
        this.f30121s = 0;
        this.f30123x = null;
        this.f30124y = 0L;
        this.B = null;
        this.C = null;
        this.D = 0.0f;
        this.H = new PointF();
        this.I = false;
        this.J = new m2.b(this, 16);
        this.K = new lm(this);
        this.L = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, qmVar.f30415n, true);
        this.f30114a = v0Var;
        v0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(v0Var);
    }

    public final void a() {
        String str;
        this.d = this.M.M.getSelectedPhotos();
        this.f30117e = new ArrayList(this.d.entrySet());
        this.f30118f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f30115b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((om) arrayList.get(i10)).f29806k.f27860g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.f30116c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f30118f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.f30117e.size()) {
                                Map.Entry entry = (Map.Entry) this.f30117e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f30118f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i12++;
                            } else {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < this.f30117e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.f30117e.get(i13);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof MediaController.PhotoEntry) && (str = ((MediaController.PhotoEntry) value2).path) != null && photoEntry != null && str.equals(photoEntry.path)) {
                                            Object key2 = entry2.getKey();
                                            this.f30118f.put(key2, value2);
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
        qm qmVar = this.M;
        nm nmVar = qmVar.G;
        PointF pointF = this.H;
        if (nmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!qmVar.H) {
            RectF f10 = nmVar.f(nmVar.e());
            RectF f11 = qmVar.G.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f10.width() / 2.0f) + f11.left, qmVar.f30420y - ((qmVar.D - 0.5f) * qmVar.E), this.D);
            pointF.y = AndroidUtilities.lerp((f10.height() / 2.0f) + qmVar.G.f29541a.f29798a + f11.top, (qmVar.B - ((qmVar.C - 0.5f) * qmVar.F)) + qmVar.J, this.D);
            return pointF;
        } else {
            RectF f12 = nmVar.f(nmVar.e());
            RectF f13 = qmVar.G.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f12.width() / 2.0f) + f13.left, this.E, this.D / this.G);
            pointF.y = AndroidUtilities.lerp((f12.height() / 2.0f) + qmVar.G.f29541a.f29798a + f13.top, this.F, this.D / this.G);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f30115b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((om) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                nm nmVar = (nm) arrayList2.get(i11);
                jh.j jVar = nmVar.f29557s;
                if (jVar != null) {
                    jVar.b(nmVar.O.f29820z);
                    nmVar.f29557s = null;
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
                om omVar = new om(this);
                om.a(omVar, new im(this.M, arrayList3), false);
                arrayList.add(omVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        qm qmVar;
        mh.d1 d1Var;
        boolean z4;
        ArrayList arrayList = this.f30115b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f10 = this.f30119n;
        int computeVerticalScrollOffset = this.M.f30416r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - qmVar.getListTopPadding());
        this.f30122w = (d1Var.getMeasuredHeight() - qmVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((om) arrayList.get(i10)).b() + f10;
            float f11 = this.v;
            if ((f10 >= f11 && f10 <= this.f30122w) || ((b10 >= f11 && b10 <= this.f30122w) || (f10 <= f11 && b10 >= this.f30122w))) {
                z4 = true;
            } else {
                z4 = false;
            }
            zArr[i10] = z4;
            i10++;
            f10 = b10;
        }
        return zArr;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final int e() {
        int i10 = this.f30119n + this.f30120r;
        ArrayList arrayList = this.f30115b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((om) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.v0 v0Var = this.f30114a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return v0Var.getMeasuredHeight() + i10;
    }

    public final void f(om omVar, MediaController.PhotoEntry photoEntry, int i10) {
        om omVar2;
        ArrayList arrayList = omVar.f29806k.f27860g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (omVar.f29806k.f27860g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) omVar.f29806k.f27860g.get(10);
            omVar.f29806k.f27860g.remove(10);
            ArrayList arrayList2 = this.f30115b;
            int indexOf = arrayList2.indexOf(omVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                if (i11 == arrayList2.size()) {
                    omVar2 = null;
                } else {
                    omVar2 = (om) arrayList2.get(i11);
                }
                if (omVar2 == null) {
                    om omVar3 = new om(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    om.a(omVar3, new im(this.M, arrayList3), true);
                    invalidate();
                } else {
                    f(omVar2, photoEntry2, 0);
                }
            }
        }
        om.a(omVar, omVar.f29806k, true);
    }

    public final void g() {
        float f10 = this.f30119n;
        ArrayList arrayList = this.f30115b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            om omVar = (om) arrayList.get(i11);
            float b10 = omVar.b();
            omVar.f29798a = f10;
            omVar.f29799b = i10;
            f10 += b10;
            i10 += omVar.f29806k.f27860g.size();
        }
    }

    public final void h() {
        qm qmVar = this.M;
        ValueAnimator valueAnimator = qmVar.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.D;
        this.G = f10;
        this.E = b10.x;
        this.F = b10.y;
        qmVar.H = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        qmVar.I = ofFloat;
        ofFloat.addUpdateListener(new km(this, 1));
        qmVar.I.addListener(new a9(this, 9));
        qmVar.I.setDuration(200L);
        qmVar.I.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z4) {
        boolean z10;
        boolean z11;
        boolean z12;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f30118f;
        ArrayList arrayList = this.h;
        fm fmVar = chatAttachAlertPhotoLayout.D;
        mi miVar = chatAttachAlertPhotoLayout.f26546b;
        ql qlVar = chatAttachAlertPhotoLayout.B;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f24738p1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f24739q1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z4) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = qlVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = qlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z13 = fmVar.f26944f;
                    boolean z14 = fmVar.d;
                    if (z13 && R > chatAttachAlertPhotoLayout.J0) {
                        R--;
                    }
                    if (z14 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                        R--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (miVar.N0 != 0 || miVar.E) {
                        t5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(R);
                    if (b02 != null) {
                        if (hashMap2.size() > 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z14 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (R == fmVar.h() - 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        t5Var.d(b02, z10, z11, z12, miVar.f29051f0);
                        if ((miVar.f29040c0 instanceof org.telegram.ui.xn) && miVar.Q1) {
                            t5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            t5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.M.f26546b.V1(1);
        }
    }

    @Override
    public final void invalidate() {
        int c3 = l.d.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f30121s != c3) {
            this.f30121s = c3;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f30115b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            om omVar = (om) arrayList.get(i10);
            if (omVar.f29806k.f27860g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - omVar.f29806k.f27860g.size();
                om omVar2 = (om) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, omVar2.f29806k.f27860g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) omVar2.f29806k.f27860g.remove(0));
                }
                omVar.f29806k.f27860g.addAll(arrayList2);
                om.a(omVar, omVar.f29806k, true);
                om.a(omVar2, omVar2.f29806k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        mh.d1 d1Var;
        float f10;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        boolean z4;
        nm nmVar;
        float f11;
        float f12 = this.f30119n;
        qm qmVar = this.M;
        int computeVerticalScrollOffset = qmVar.f30416r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - qmVar.getListTopPadding());
        this.f30122w = (d1Var.getMeasuredHeight() - qmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f12);
        ArrayList arrayList2 = this.f30115b;
        int size = arrayList2.size();
        float f13 = f12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            om omVar = (om) arrayList2.get(i13);
            float b10 = omVar.b();
            omVar.f29798a = f13;
            omVar.f29799b = i14;
            float f14 = this.v;
            if (f13 < f14 || f13 > this.f30122w) {
                float f15 = f13 + b10;
                if ((f15 < f14 || f15 > this.f30122w) && (f13 > f14 || f15 < this.f30122w)) {
                    f10 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f10);
                    f13 += f10;
                    i14 = omVar.f29806k.f27860g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = omVar.h;
            int i15 = omVar.f29807l;
            org.telegram.ui.ActionBar.h5 h5Var = omVar.f29818x;
            pm pmVar = omVar.f29820z;
            arrayList = arrayList2;
            float interpolation = omVar.f29805j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - omVar.f29800c)) / 200.0f));
            if (interpolation < 1.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(omVar.f29802f, omVar.d, interpolation);
            int width = pmVar.getWidth();
            qm qmVar2 = pmVar.M;
            float previewScale = width * lerp * qmVar2.getPreviewScale();
            boolean z10 = z4;
            float previewScale2 = qmVar2.getPreviewScale() * AndroidUtilities.lerp(omVar.f29803g, omVar.f29801e, interpolation) * max;
            if (h5Var != null) {
                omVar.f29811p = 0.0f;
                float width2 = pmVar.getWidth();
                float f16 = i15;
                omVar.f29809n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                omVar.f29810o = (Math.max(f16, previewScale) + pmVar.getWidth()) / 2.0f;
                omVar.f29812q = Math.max(i15 * 2, previewScale2);
                omVar.f29818x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                h5Var.setBounds((int) omVar.f29809n, (int) omVar.f29811p, (int) omVar.f29810o, (int) omVar.f29812q);
                if (omVar.d <= 0.0f) {
                    f11 = 1.0f - interpolation;
                } else if (omVar.f29802f <= 0.0f) {
                    f11 = interpolation;
                } else {
                    f11 = 1.0f;
                }
                h5Var.setAlpha((int) (f11 * 255.0f));
                h5Var.d(canvas, omVar.f29819y, null);
                omVar.f29811p += f16;
                omVar.f29809n += f16;
                omVar.f29812q -= f16;
                omVar.f29810o -= f16;
            }
            omVar.f29813r = omVar.f29810o - omVar.f29809n;
            omVar.f29814s = omVar.f29812q - omVar.f29811p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                nm nmVar2 = (nm) arrayList3.get(i16);
                if (nmVar2 != null && (((nmVar = qmVar2.G) == null || nmVar.f29542b != nmVar2.f29542b) && nmVar2.c(canvas, false))) {
                    z10 = true;
                }
            }
            Paint paint = omVar.f29817w;
            RectF rectF = omVar.f29815t;
            long j10 = omVar.f29804i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f10 = b10;
            } else {
                if (omVar.f29816u == null || omVar.v != j10) {
                    omVar.v = j10;
                    omVar.f29816u = new l01(mh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + omVar.f29816u.f28521c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f17 = omVar.f29809n;
                float f18 = omVar.f29813r;
                float x10 = e2.c.x(f18, dp, 2.0f, f17);
                i10 = size;
                float f19 = omVar.f29811p;
                i11 = i13;
                float f20 = omVar.f29814s;
                i12 = i14;
                rectF.set(x10, e2.c.x(f20, dp2, 2.0f, f19), l.d.b(f18, dp, 2.0f, f17), l.d.b(f20, dp2, 2.0f, f19));
                paint.setColor(1610612736);
                float f21 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f21, f21, paint);
                f10 = b10;
                omVar.f29816u.c(AndroidUtilities.dp(14.0f) + (((omVar.f29813r / 2.0f) + omVar.f29809n) - (dp / 2.0f)), omVar.f29811p + (omVar.f29814s / 2.0f), 1.0f, -1, canvas);
            }
            if (z10) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f13 += f10;
            i14 = omVar.f29806k.f27860g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.v0 v0Var = this.f30114a;
        v0Var.W(f13, v0Var.getMeasuredHeight());
        if (v0Var.I()) {
            v0Var.y(canvas, true);
            v0Var.B(canvas, true);
        }
        v0Var.draw(canvas);
        canvas.restore();
        if (qmVar.G != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (qmVar.G.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.v0 v0Var = this.f30114a;
        v0Var.layout(0, 0, v0Var.getMeasuredWidth(), v0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f30114a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f30121s <= 0) {
            this.f30121s = l.d.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f30121s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pm.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
