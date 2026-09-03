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
public final class om extends ViewGroup {
    public nm B;
    public mm C;
    public float D;
    public float E;
    public float F;
    public float G;
    public final PointF H;
    public boolean I;
    public final m2.b J;
    public final km K;
    public int L;
    public final pm M;
    public final org.telegram.ui.Cells.v0 f29810a;
    public final ArrayList f29811b;
    public final HashMap f29812c;
    public HashMap d;
    public ArrayList f29813e;
    public HashMap f29814f;
    public ArrayList h;
    public final int f29815n;
    public final int f29816r;
    public int f29817s;
    public float v;
    public float f29818w;
    public boolean[] f29819x;
    public long f29820y;

    public om(pm pmVar, Context context) {
        super(context);
        this.M = pmVar;
        this.f29811b = new ArrayList();
        this.f29812c = new HashMap();
        this.f29815n = AndroidUtilities.dp(16.0f);
        this.f29816r = AndroidUtilities.dp(64.0f);
        this.f29817s = 0;
        this.f29819x = null;
        this.f29820y = 0L;
        this.B = null;
        this.C = null;
        this.D = 0.0f;
        this.H = new PointF();
        this.I = false;
        this.J = new m2.b(this, 16);
        this.K = new km(this);
        this.L = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, pmVar.f30121n, true);
        this.f29810a = v0Var;
        v0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(v0Var);
    }

    public final void a() {
        String str;
        this.d = this.M.M.getSelectedPhotos();
        this.f29813e = new ArrayList(this.d.entrySet());
        this.f29814f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f29811b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((nm) arrayList.get(i10)).f29524k.f27565g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.f29812c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f29814f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.f29813e.size()) {
                                Map.Entry entry = (Map.Entry) this.f29813e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f29814f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i12++;
                            } else {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < this.f29813e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.f29813e.get(i13);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof MediaController.PhotoEntry) && (str = ((MediaController.PhotoEntry) value2).path) != null && photoEntry != null && str.equals(photoEntry.path)) {
                                            Object key2 = entry2.getKey();
                                            this.f29814f.put(key2, value2);
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
        pm pmVar = this.M;
        mm mmVar = pmVar.G;
        PointF pointF = this.H;
        if (mmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!pmVar.H) {
            RectF f10 = mmVar.f(mmVar.e());
            RectF f11 = pmVar.G.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f10.width() / 2.0f) + f11.left, pmVar.f30126y - ((pmVar.D - 0.5f) * pmVar.E), this.D);
            pointF.y = AndroidUtilities.lerp((f10.height() / 2.0f) + pmVar.G.f29156a.f29516a + f11.top, (pmVar.B - ((pmVar.C - 0.5f) * pmVar.F)) + pmVar.J, this.D);
            return pointF;
        } else {
            RectF f12 = mmVar.f(mmVar.e());
            RectF f13 = pmVar.G.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f12.width() / 2.0f) + f13.left, this.E, this.D / this.G);
            pointF.y = AndroidUtilities.lerp((f12.height() / 2.0f) + pmVar.G.f29156a.f29516a + f13.top, this.F, this.D / this.G);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f29811b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((nm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                mm mmVar = (mm) arrayList2.get(i11);
                jh.j jVar = mmVar.f29172s;
                if (jVar != null) {
                    jVar.b(mmVar.O.f29538z);
                    mmVar.f29172s = null;
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
                nm nmVar = new nm(this);
                nm.a(nmVar, new hm(this.M, arrayList3), false);
                arrayList.add(nmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        pm pmVar;
        mh.d1 d1Var;
        boolean z4;
        ArrayList arrayList = this.f29811b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f10 = this.f29815n;
        int computeVerticalScrollOffset = this.M.f30122r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - pmVar.getListTopPadding());
        this.f29818w = (d1Var.getMeasuredHeight() - pmVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((nm) arrayList.get(i10)).b() + f10;
            float f11 = this.v;
            if ((f10 >= f11 && f10 <= this.f29818w) || ((b10 >= f11 && b10 <= this.f29818w) || (f10 <= f11 && b10 >= this.f29818w))) {
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
        int i10 = this.f29815n + this.f29816r;
        ArrayList arrayList = this.f29811b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((nm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.v0 v0Var = this.f29810a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return v0Var.getMeasuredHeight() + i10;
    }

    public final void f(nm nmVar, MediaController.PhotoEntry photoEntry, int i10) {
        nm nmVar2;
        ArrayList arrayList = nmVar.f29524k.f27565g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (nmVar.f29524k.f27565g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) nmVar.f29524k.f27565g.get(10);
            nmVar.f29524k.f27565g.remove(10);
            ArrayList arrayList2 = this.f29811b;
            int indexOf = arrayList2.indexOf(nmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                if (i11 == arrayList2.size()) {
                    nmVar2 = null;
                } else {
                    nmVar2 = (nm) arrayList2.get(i11);
                }
                if (nmVar2 == null) {
                    nm nmVar3 = new nm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    nm.a(nmVar3, new hm(this.M, arrayList3), true);
                    invalidate();
                } else {
                    f(nmVar2, photoEntry2, 0);
                }
            }
        }
        nm.a(nmVar, nmVar.f29524k, true);
    }

    public final void g() {
        float f10 = this.f29815n;
        ArrayList arrayList = this.f29811b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            nm nmVar = (nm) arrayList.get(i11);
            float b10 = nmVar.b();
            nmVar.f29516a = f10;
            nmVar.f29517b = i10;
            f10 += b10;
            i10 += nmVar.f29524k.f27565g.size();
        }
    }

    public final void h() {
        pm pmVar = this.M;
        ValueAnimator valueAnimator = pmVar.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.D;
        this.G = f10;
        this.E = b10.x;
        this.F = b10.y;
        pmVar.H = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        pmVar.I = ofFloat;
        ofFloat.addUpdateListener(new jm(this, 1));
        pmVar.I.addListener(new a9(this, 9));
        pmVar.I.setDuration(200L);
        pmVar.I.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z4) {
        boolean z10;
        boolean z11;
        boolean z12;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f29814f;
        ArrayList arrayList = this.h;
        fm fmVar = chatAttachAlertPhotoLayout.D;
        mi miVar = chatAttachAlertPhotoLayout.f26590b;
        ql qlVar = chatAttachAlertPhotoLayout.B;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f24740p1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f24741q1;
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
                    boolean z13 = fmVar.f26943f;
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
                        t5Var.d(b02, z10, z11, z12, miVar.f29069f0);
                        if ((miVar.f29058c0 instanceof org.telegram.ui.xn) && miVar.Q1) {
                            t5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            t5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.M.f26590b.V1(1);
        }
    }

    @Override
    public final void invalidate() {
        int c3 = l.d.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f29817s != c3) {
            this.f29817s = c3;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f29811b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            nm nmVar = (nm) arrayList.get(i10);
            if (nmVar.f29524k.f27565g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - nmVar.f29524k.f27565g.size();
                nm nmVar2 = (nm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, nmVar2.f29524k.f27565g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) nmVar2.f29524k.f27565g.remove(0));
                }
                nmVar.f29524k.f27565g.addAll(arrayList2);
                nm.a(nmVar, nmVar.f29524k, true);
                nm.a(nmVar2, nmVar2.f29524k, true);
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
        mm mmVar;
        float f11;
        float f12 = this.f29815n;
        pm pmVar = this.M;
        int computeVerticalScrollOffset = pmVar.f30122r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - pmVar.getListTopPadding());
        this.f29818w = (d1Var.getMeasuredHeight() - pmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f12);
        ArrayList arrayList2 = this.f29811b;
        int size = arrayList2.size();
        float f13 = f12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            nm nmVar = (nm) arrayList2.get(i13);
            float b10 = nmVar.b();
            nmVar.f29516a = f13;
            nmVar.f29517b = i14;
            float f14 = this.v;
            if (f13 < f14 || f13 > this.f29818w) {
                float f15 = f13 + b10;
                if ((f15 < f14 || f15 > this.f29818w) && (f13 > f14 || f15 < this.f29818w)) {
                    f10 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f10);
                    f13 += f10;
                    i14 = nmVar.f29524k.f27565g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = nmVar.h;
            int i15 = nmVar.f29525l;
            org.telegram.ui.ActionBar.h5 h5Var = nmVar.f29536x;
            om omVar = nmVar.f29538z;
            arrayList = arrayList2;
            float interpolation = nmVar.f29523j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - nmVar.f29518c)) / 200.0f));
            if (interpolation < 1.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(nmVar.f29520f, nmVar.d, interpolation);
            int width = omVar.getWidth();
            pm pmVar2 = omVar.M;
            float previewScale = width * lerp * pmVar2.getPreviewScale();
            boolean z10 = z4;
            float previewScale2 = pmVar2.getPreviewScale() * AndroidUtilities.lerp(nmVar.f29521g, nmVar.f29519e, interpolation) * max;
            if (h5Var != null) {
                nmVar.f29529p = 0.0f;
                float width2 = omVar.getWidth();
                float f16 = i15;
                nmVar.f29527n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                nmVar.f29528o = (Math.max(f16, previewScale) + omVar.getWidth()) / 2.0f;
                nmVar.f29530q = Math.max(i15 * 2, previewScale2);
                nmVar.f29536x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                h5Var.setBounds((int) nmVar.f29527n, (int) nmVar.f29529p, (int) nmVar.f29528o, (int) nmVar.f29530q);
                if (nmVar.d <= 0.0f) {
                    f11 = 1.0f - interpolation;
                } else if (nmVar.f29520f <= 0.0f) {
                    f11 = interpolation;
                } else {
                    f11 = 1.0f;
                }
                h5Var.setAlpha((int) (f11 * 255.0f));
                h5Var.d(canvas, nmVar.f29537y, null);
                nmVar.f29529p += f16;
                nmVar.f29527n += f16;
                nmVar.f29530q -= f16;
                nmVar.f29528o -= f16;
            }
            nmVar.f29531r = nmVar.f29528o - nmVar.f29527n;
            nmVar.f29532s = nmVar.f29530q - nmVar.f29529p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                mm mmVar2 = (mm) arrayList3.get(i16);
                if (mmVar2 != null && (((mmVar = pmVar2.G) == null || mmVar.f29157b != mmVar2.f29157b) && mmVar2.c(canvas, false))) {
                    z10 = true;
                }
            }
            Paint paint = nmVar.f29535w;
            RectF rectF = nmVar.f29533t;
            long j10 = nmVar.f29522i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f10 = b10;
            } else {
                if (nmVar.f29534u == null || nmVar.v != j10) {
                    nmVar.v = j10;
                    nmVar.f29534u = new k01(mh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + nmVar.f29534u.f28227c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f17 = nmVar.f29527n;
                float f18 = nmVar.f29531r;
                float x10 = e2.c.x(f18, dp, 2.0f, f17);
                i10 = size;
                float f19 = nmVar.f29529p;
                i11 = i13;
                float f20 = nmVar.f29532s;
                i12 = i14;
                rectF.set(x10, e2.c.x(f20, dp2, 2.0f, f19), l.d.b(f18, dp, 2.0f, f17), l.d.b(f20, dp2, 2.0f, f19));
                paint.setColor(1610612736);
                float f21 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f21, f21, paint);
                f10 = b10;
                nmVar.f29534u.c(AndroidUtilities.dp(14.0f) + (((nmVar.f29531r / 2.0f) + nmVar.f29527n) - (dp / 2.0f)), nmVar.f29529p + (nmVar.f29532s / 2.0f), 1.0f, -1, canvas);
            }
            if (z10) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f13 += f10;
            i14 = nmVar.f29524k.f27565g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.v0 v0Var = this.f29810a;
        v0Var.W(f13, v0Var.getMeasuredHeight());
        if (v0Var.I()) {
            v0Var.y(canvas, true);
            v0Var.B(canvas, true);
        }
        v0Var.draw(canvas);
        canvas.restore();
        if (pmVar.G != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (pmVar.G.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.v0 v0Var = this.f29810a;
        v0Var.layout(0, 0, v0Var.getMeasuredWidth(), v0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f29810a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f29817s <= 0) {
            this.f29817s = l.d.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f29817s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.om.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
