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
public final class rm extends ViewGroup {
    public qm E;
    public pm F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.t6 M;
    public final nm N;
    public int O;
    public final sm P;
    public final org.telegram.ui.Cells.w0 f27998a;
    public final ArrayList f27999b;
    public final HashMap f28000c;
    public HashMap d;
    public ArrayList e;
    public HashMap f28001f;
    public ArrayList h;
    public final int f28002n;
    public final int f28003r;
    public int f28004s;
    public float v;
    public float f28005w;
    public boolean[] f28006x;
    public long f28007y;

    public rm(sm smVar, Context context) {
        super(context);
        this.P = smVar;
        this.f27999b = new ArrayList();
        this.f28000c = new HashMap();
        this.f28002n = AndroidUtilities.dp(16.0f);
        this.f28003r = AndroidUtilities.dp(64.0f);
        this.f28004s = 0;
        this.f28006x = null;
        this.f28007y = 0L;
        this.E = null;
        this.F = null;
        this.G = 0.0f;
        this.K = new PointF();
        this.L = false;
        this.M = new org.telegram.ui.Cells.t6(this, 8);
        this.N = new nm(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, smVar.f28308n, true);
        this.f27998a = w0Var;
        w0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(w0Var);
    }

    public final void a() {
        String str;
        this.d = this.P.P.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f28001f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f27999b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((qm) arrayList.get(i10)).f27722k.f26110g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.f28000c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f28001f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f28001f.put(key, value);
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
                                            this.f28001f.put(key2, value2);
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
        sm smVar = this.P;
        pm pmVar = smVar.J;
        PointF pointF = this.K;
        if (pmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!smVar.K) {
            RectF f7 = pmVar.f(pmVar.e());
            RectF f10 = smVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, smVar.f28313y - ((smVar.G - 0.5f) * smVar.H), this.G);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + smVar.J.f27423a.f27715a + f10.top, (smVar.E - ((smVar.F - 0.5f) * smVar.I)) + smVar.M, this.G);
            return pointF;
        } else {
            RectF f11 = pmVar.f(pmVar.e());
            RectF f12 = smVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + smVar.J.f27423a.f27715a + f12.top, this.I, this.G / this.J);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f27999b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((qm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                pm pmVar = (pm) arrayList2.get(i11);
                vh.f fVar = pmVar.f27438s;
                if (fVar != null) {
                    fVar.b(pmVar.O.f27736z);
                    pmVar.f27438s = null;
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
                qm qmVar = new qm(this);
                qm.a(qmVar, new lm(this.P, arrayList3), false);
                arrayList.add(qmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        sm smVar;
        ai.w0 w0Var;
        boolean z10;
        ArrayList arrayList = this.f27999b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f7 = this.f28002n;
        int computeVerticalScrollOffset = this.P.f28309r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - smVar.getListTopPadding());
        this.f28005w = (w0Var.getMeasuredHeight() - smVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((qm) arrayList.get(i10)).b() + f7;
            float f10 = this.v;
            if ((f7 >= f10 && f7 <= this.f28005w) || ((b10 >= f10 && b10 <= this.f28005w) || (f7 <= f10 && b10 >= this.f28005w))) {
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
        int i10 = this.f28002n + this.f28003r;
        ArrayList arrayList = this.f27999b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((qm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.w0 w0Var = this.f27998a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return w0Var.getMeasuredHeight() + i10;
    }

    public final void f(qm qmVar, MediaController.PhotoEntry photoEntry, int i10) {
        qm qmVar2;
        ArrayList arrayList = qmVar.f27722k.f26110g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (qmVar.f27722k.f26110g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) qmVar.f27722k.f26110g.get(10);
            qmVar.f27722k.f26110g.remove(10);
            ArrayList arrayList2 = this.f27999b;
            int indexOf = arrayList2.indexOf(qmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                if (i11 == arrayList2.size()) {
                    qmVar2 = null;
                } else {
                    qmVar2 = (qm) arrayList2.get(i11);
                }
                if (qmVar2 == null) {
                    qm qmVar3 = new qm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    qm.a(qmVar3, new lm(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(qmVar2, photoEntry2, 0);
                }
            }
        }
        qm.a(qmVar, qmVar.f27722k, true);
    }

    public final void g() {
        float f7 = this.f28002n;
        ArrayList arrayList = this.f27999b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            qm qmVar = (qm) arrayList.get(i11);
            float b10 = qmVar.b();
            qmVar.f27715a = f7;
            qmVar.f27716b = i10;
            f7 += b10;
            i10 += qmVar.f27722k.f26110g.size();
        }
    }

    public final void h() {
        sm smVar = this.P;
        ValueAnimator valueAnimator = smVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        smVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        smVar.L = ofFloat;
        ofFloat.addUpdateListener(new mm(this, 1));
        smVar.L.addListener(new r8(this, 10));
        smVar.L.setDuration(200L);
        smVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f28001f;
        ArrayList arrayList = this.h;
        jm jmVar = chatAttachAlertPhotoLayout.G;
        wi wiVar = chatAttachAlertPhotoLayout.f27043b;
        vl vlVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f22122s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f22123t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = vlVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = vlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z14 = jmVar.f25466f;
                    boolean z15 = jmVar.d;
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
                        if (R == jmVar.h() - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        t5Var.d(b02, z11, z12, z13, wiVar.f30029i0);
                        if ((wiVar.f30020f0 instanceof org.telegram.ui.wn) && wiVar.T1) {
                            t5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            t5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.P.f27043b.V1(1);
        }
    }

    @Override
    public final void invalidate() {
        int b10 = org.telegram.messenger.f0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f28004s != b10) {
            this.f28004s = b10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f27999b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            qm qmVar = (qm) arrayList.get(i10);
            if (qmVar.f27722k.f26110g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - qmVar.f27722k.f26110g.size();
                qm qmVar2 = (qm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, qmVar2.f27722k.f26110g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) qmVar2.f27722k.f26110g.remove(0));
                }
                qmVar.f27722k.f26110g.addAll(arrayList2);
                qm.a(qmVar, qmVar.f27722k, true);
                qm.a(qmVar2, qmVar2.f27722k, true);
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
        pm pmVar;
        float f10;
        float f11 = this.f28002n;
        sm smVar = this.P;
        int computeVerticalScrollOffset = smVar.f28309r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - smVar.getListTopPadding());
        this.f28005w = (w0Var.getMeasuredHeight() - smVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList2 = this.f27999b;
        int size = arrayList2.size();
        float f12 = f11;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            qm qmVar = (qm) arrayList2.get(i13);
            float b10 = qmVar.b();
            qmVar.f27715a = f12;
            qmVar.f27716b = i14;
            float f13 = this.v;
            if (f12 < f13 || f12 > this.f28005w) {
                float f14 = f12 + b10;
                if ((f14 < f13 || f14 > this.f28005w) && (f12 > f13 || f14 < this.f28005w)) {
                    f7 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f7);
                    f12 += f7;
                    i14 = qmVar.f27722k.f26110g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = qmVar.h;
            int i15 = qmVar.f27723l;
            org.telegram.ui.ActionBar.d5 d5Var = qmVar.f27734x;
            rm rmVar = qmVar.f27736z;
            arrayList = arrayList2;
            float interpolation = qmVar.f27721j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - qmVar.f27717c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(qmVar.f27718f, qmVar.d, interpolation);
            int width = rmVar.getWidth();
            sm smVar2 = rmVar.P;
            float previewScale = width * lerp * smVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = smVar2.getPreviewScale() * AndroidUtilities.lerp(qmVar.f27719g, qmVar.e, interpolation) * max;
            if (d5Var != null) {
                qmVar.f27727p = 0.0f;
                float width2 = rmVar.getWidth();
                float f15 = i15;
                qmVar.f27725n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                qmVar.f27726o = (Math.max(f15, previewScale) + rmVar.getWidth()) / 2.0f;
                qmVar.f27728q = Math.max(i15 * 2, previewScale2);
                qmVar.f27734x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                d5Var.setBounds((int) qmVar.f27725n, (int) qmVar.f27727p, (int) qmVar.f27726o, (int) qmVar.f27728q);
                if (qmVar.d <= 0.0f) {
                    f10 = 1.0f - interpolation;
                } else if (qmVar.f27718f <= 0.0f) {
                    f10 = interpolation;
                } else {
                    f10 = 1.0f;
                }
                d5Var.setAlpha((int) (f10 * 255.0f));
                d5Var.d(canvas, qmVar.f27735y, null);
                qmVar.f27727p += f15;
                qmVar.f27725n += f15;
                qmVar.f27728q -= f15;
                qmVar.f27726o -= f15;
            }
            qmVar.f27729r = qmVar.f27726o - qmVar.f27725n;
            qmVar.f27730s = qmVar.f27728q - qmVar.f27727p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                pm pmVar2 = (pm) arrayList3.get(i16);
                if (pmVar2 != null && (((pmVar = smVar2.J) == null || pmVar.f27424b != pmVar2.f27424b) && pmVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = qmVar.f27733w;
            RectF rectF = qmVar.f27731t;
            long j3 = qmVar.f27720i;
            if (j3 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (qmVar.f27732u == null || qmVar.v != j3) {
                    qmVar.v = j3;
                    qmVar.f27732u = new u01(yh.w7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + qmVar.f27732u.f28649c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f16 = qmVar.f27725n;
                float f17 = qmVar.f27729r;
                float A = com.google.android.gms.internal.vision.e2.A(f17, dp, 2.0f, f16);
                i10 = size;
                float f18 = qmVar.f27727p;
                i11 = i13;
                float f19 = qmVar.f27730s;
                i12 = i14;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f19, dp2, 2.0f, f18), org.telegram.messenger.f0.a(f17, dp, 2.0f, f16), org.telegram.messenger.f0.a(f19, dp2, 2.0f, f18));
                paint.setColor(1610612736);
                float f20 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f20, f20, paint);
                f7 = b10;
                qmVar.f27732u.c(AndroidUtilities.dp(14.0f) + (((qmVar.f27729r / 2.0f) + qmVar.f27725n) - (dp / 2.0f)), qmVar.f27727p + (qmVar.f27730s / 2.0f), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f12 += f7;
            i14 = qmVar.f27722k.f26110g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.w0 w0Var2 = this.f27998a;
        w0Var2.W(f12, w0Var2.getMeasuredHeight());
        if (w0Var2.J()) {
            w0Var2.y(canvas, true);
            w0Var2.A(canvas, true);
        }
        w0Var2.draw(canvas);
        canvas.restore();
        if (smVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (smVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.w0 w0Var = this.f27998a;
        w0Var.layout(0, 0, w0Var.getMeasuredWidth(), w0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f27998a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f28004s <= 0) {
            this.f28004s = org.telegram.messenger.f0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f28004s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rm.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
