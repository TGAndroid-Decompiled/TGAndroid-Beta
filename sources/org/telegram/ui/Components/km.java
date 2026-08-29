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
public final class km extends ViewGroup {
    public jm A;
    public im B;
    public float C;
    public float D;
    public float E;
    public float F;
    public final PointF G;
    public boolean H;
    public final lh.m7 I;
    public final gm J;
    public int K;
    public final lm L;
    public final org.telegram.ui.Cells.v0 f30096a;
    public final ArrayList f30097b;
    public final HashMap f30098c;
    public HashMap d;
    public ArrayList f30099e;
    public HashMap f30100f;
    public ArrayList h;
    public final int f30101n;
    public final int f30102r;
    public int f30103s;
    public float v;
    public float f30104w;
    public boolean[] f30105x;
    public long f30106y;

    public km(lm lmVar, Context context) {
        super(context);
        this.L = lmVar;
        this.f30097b = new ArrayList();
        this.f30098c = new HashMap();
        this.f30101n = AndroidUtilities.dp(16.0f);
        this.f30102r = AndroidUtilities.dp(64.0f);
        this.f30103s = 0;
        this.f30105x = null;
        this.f30106y = 0L;
        this.A = null;
        this.B = null;
        this.C = 0.0f;
        this.G = new PointF();
        this.H = false;
        this.I = new lh.m7(this, 17);
        this.J = new gm(this);
        this.K = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, lmVar.f30371n, true);
        this.f30096a = v0Var;
        v0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(v0Var);
    }

    public final void a() {
        String str;
        this.d = this.L.L.getSelectedPhotos();
        this.f30099e = new ArrayList(this.d.entrySet());
        this.f30100f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f30097b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((jm) arrayList.get(i10)).f29746k.f28112g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.f30098c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f30100f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.f30099e.size()) {
                                Map.Entry entry = (Map.Entry) this.f30099e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f30100f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i12++;
                            } else {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < this.f30099e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.f30099e.get(i13);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof MediaController.PhotoEntry) && (str = ((MediaController.PhotoEntry) value2).path) != null && photoEntry != null && str.equals(photoEntry.path)) {
                                            Object key2 = entry2.getKey();
                                            this.f30100f.put(key2, value2);
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
        lm lmVar = this.L;
        im imVar = lmVar.F;
        PointF pointF = this.G;
        if (imVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!lmVar.G) {
            RectF f9 = imVar.f(imVar.e());
            RectF f10 = lmVar.F.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f9.width() / 2.0f) + f10.left, lmVar.f30376y - ((lmVar.C - 0.5f) * lmVar.D), this.C);
            pointF.y = AndroidUtilities.lerp((f9.height() / 2.0f) + lmVar.F.f29408a.f29738a + f10.top, (lmVar.A - ((lmVar.B - 0.5f) * lmVar.E)) + lmVar.I, this.C);
            return pointF;
        } else {
            RectF f11 = imVar.f(imVar.e());
            RectF f12 = lmVar.F.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, this.D, this.C / this.F);
            pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + lmVar.F.f29408a.f29738a + f12.top, this.E, this.C / this.F);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f30097b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((jm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                im imVar = (im) arrayList2.get(i11);
                gh.j jVar = imVar.f29424s;
                if (jVar != null) {
                    jVar.b(imVar.O.f29760z);
                    imVar.f29424s = null;
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
                jm jmVar = new jm(this);
                jm.a(jmVar, new em(this.L, arrayList3), false);
                arrayList.add(jmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        lm lmVar;
        jh.e1 e1Var;
        boolean z10;
        ArrayList arrayList = this.f30097b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f9 = this.f30101n;
        int computeVerticalScrollOffset = this.L.f30372r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - lmVar.getListTopPadding());
        this.f30104w = (e1Var.getMeasuredHeight() - lmVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((jm) arrayList.get(i10)).b() + f9;
            float f10 = this.v;
            if ((f9 >= f10 && f9 <= this.f30104w) || ((b10 >= f10 && b10 <= this.f30104w) || (f9 <= f10 && b10 >= this.f30104w))) {
                z10 = true;
            } else {
                z10 = false;
            }
            zArr[i10] = z10;
            i10++;
            f9 = b10;
        }
        return zArr;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final int e() {
        int i10 = this.f30101n + this.f30102r;
        ArrayList arrayList = this.f30097b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((jm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.v0 v0Var = this.f30096a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return v0Var.getMeasuredHeight() + i10;
    }

    public final void f(jm jmVar, MediaController.PhotoEntry photoEntry, int i10) {
        jm jmVar2;
        ArrayList arrayList = jmVar.f29746k.f28112g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (jmVar.f29746k.f28112g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) jmVar.f29746k.f28112g.get(10);
            jmVar.f29746k.f28112g.remove(10);
            ArrayList arrayList2 = this.f30097b;
            int indexOf = arrayList2.indexOf(jmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                if (i11 == arrayList2.size()) {
                    jmVar2 = null;
                } else {
                    jmVar2 = (jm) arrayList2.get(i11);
                }
                if (jmVar2 == null) {
                    jm jmVar3 = new jm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    jm.a(jmVar3, new em(this.L, arrayList3), true);
                    invalidate();
                } else {
                    f(jmVar2, photoEntry2, 0);
                }
            }
        }
        jm.a(jmVar, jmVar.f29746k, true);
    }

    public final void g() {
        float f9 = this.f30101n;
        ArrayList arrayList = this.f30097b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jm jmVar = (jm) arrayList.get(i11);
            float b10 = jmVar.b();
            jmVar.f29738a = f9;
            jmVar.f29739b = i10;
            f9 += b10;
            i10 += jmVar.f29746k.f28112g.size();
        }
    }

    public final void h() {
        lm lmVar = this.L;
        ValueAnimator valueAnimator = lmVar.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f9 = this.C;
        this.F = f9;
        this.D = b10.x;
        this.E = b10.y;
        lmVar.G = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, 0.0f);
        lmVar.H = ofFloat;
        ofFloat.addUpdateListener(new fm(this, 1));
        lmVar.H.addListener(new org.telegram.ui.bm(this, 18));
        lmVar.H.setDuration(200L);
        lmVar.H.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f30100f;
        ArrayList arrayList = this.h;
        cm cmVar = chatAttachAlertPhotoLayout.C;
        ni niVar = chatAttachAlertPhotoLayout.f28403b;
        ol olVar = chatAttachAlertPhotoLayout.A;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f26254o1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f26255p1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = olVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = olVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.r5) {
                    int R = RecyclerView.R(childAt);
                    boolean z14 = cmVar.f27505f;
                    boolean z15 = cmVar.d;
                    if (z14 && R > chatAttachAlertPhotoLayout.I0) {
                        R--;
                    }
                    if (z15 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                        R--;
                    }
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                    if (niVar.M0 != 0 || niVar.D) {
                        r5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(R);
                    if (b02 != null) {
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
                        if (R == cmVar.h() - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        r5Var.d(b02, z11, z12, z13, niVar.f31001e0);
                        if ((niVar.f30990b0 instanceof org.telegram.ui.tn) && niVar.P1) {
                            r5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            r5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.L.f28403b.V1(1);
        }
    }

    @Override
    public final void invalidate() {
        int d = j7.l1.d(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), e());
        if (this.f30103s != d) {
            this.f30103s = d;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f30097b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            jm jmVar = (jm) arrayList.get(i10);
            if (jmVar.f29746k.f28112g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - jmVar.f29746k.f28112g.size();
                jm jmVar2 = (jm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, jmVar2.f29746k.f28112g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) jmVar2.f29746k.f28112g.remove(0));
                }
                jmVar.f29746k.f28112g.addAll(arrayList2);
                jm.a(jmVar, jmVar.f29746k, true);
                jm.a(jmVar2, jmVar2.f29746k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        jh.e1 e1Var;
        float f9;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        boolean z10;
        im imVar;
        float f10;
        float f11 = this.f30101n;
        lm lmVar = this.L;
        int computeVerticalScrollOffset = lmVar.f30372r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - lmVar.getListTopPadding());
        this.f30104w = (e1Var.getMeasuredHeight() - lmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList2 = this.f30097b;
        int size = arrayList2.size();
        float f12 = f11;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            jm jmVar = (jm) arrayList2.get(i13);
            float b10 = jmVar.b();
            jmVar.f29738a = f12;
            jmVar.f29739b = i14;
            float f13 = this.v;
            if (f12 < f13 || f12 > this.f30104w) {
                float f14 = f12 + b10;
                if ((f14 < f13 || f14 > this.f30104w) && (f12 > f13 || f14 < this.f30104w)) {
                    f9 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f9);
                    f12 += f9;
                    i14 = jmVar.f29746k.f28112g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = jmVar.h;
            int i15 = jmVar.f29747l;
            org.telegram.ui.ActionBar.d5 d5Var = jmVar.f29758x;
            km kmVar = jmVar.f29760z;
            arrayList = arrayList2;
            float interpolation = jmVar.f29745j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - jmVar.f29740c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(jmVar.f29742f, jmVar.d, interpolation);
            int width = kmVar.getWidth();
            lm lmVar2 = kmVar.L;
            float previewScale = width * lerp * lmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = lmVar2.getPreviewScale() * AndroidUtilities.lerp(jmVar.f29743g, jmVar.f29741e, interpolation) * max;
            if (d5Var != null) {
                jmVar.f29751p = 0.0f;
                float width2 = kmVar.getWidth();
                float f15 = i15;
                jmVar.f29749n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                jmVar.f29750o = (Math.max(f15, previewScale) + kmVar.getWidth()) / 2.0f;
                jmVar.f29752q = Math.max(i15 * 2, previewScale2);
                jmVar.f29758x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                d5Var.setBounds((int) jmVar.f29749n, (int) jmVar.f29751p, (int) jmVar.f29750o, (int) jmVar.f29752q);
                if (jmVar.d <= 0.0f) {
                    f10 = 1.0f - interpolation;
                } else if (jmVar.f29742f <= 0.0f) {
                    f10 = interpolation;
                } else {
                    f10 = 1.0f;
                }
                d5Var.setAlpha((int) (f10 * 255.0f));
                d5Var.d(canvas, jmVar.f29759y, null);
                jmVar.f29751p += f15;
                jmVar.f29749n += f15;
                jmVar.f29752q -= f15;
                jmVar.f29750o -= f15;
            }
            jmVar.f29753r = jmVar.f29750o - jmVar.f29749n;
            jmVar.f29754s = jmVar.f29752q - jmVar.f29751p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                im imVar2 = (im) arrayList3.get(i16);
                if (imVar2 != null && (((imVar = lmVar2.F) == null || imVar.f29409b != imVar2.f29409b) && imVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = jmVar.f29757w;
            RectF rectF = jmVar.f29755t;
            long j10 = jmVar.f29744i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f9 = b10;
            } else {
                if (jmVar.f29756u == null || jmVar.v != j10) {
                    jmVar.v = j10;
                    jmVar.f29756u = new zz0(jh.ia.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + jmVar.f29756u.f35462c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f16 = jmVar.f29749n;
                float f17 = jmVar.f29753r;
                float A = com.google.android.recaptcha.internal.a.A(f17, dp, 2.0f, f16);
                i10 = size;
                float f18 = jmVar.f29751p;
                i11 = i13;
                float f19 = jmVar.f29754s;
                i12 = i14;
                rectF.set(A, com.google.android.recaptcha.internal.a.A(f19, dp2, 2.0f, f18), j7.l1.c(f17, dp, 2.0f, f16), j7.l1.c(f19, dp2, 2.0f, f18));
                paint.setColor(1610612736);
                float f20 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f20, f20, paint);
                f9 = b10;
                jmVar.f29756u.c(AndroidUtilities.dp(14.0f) + (((jmVar.f29753r / 2.0f) + jmVar.f29749n) - (dp / 2.0f)), jmVar.f29751p + (jmVar.f29754s / 2.0f), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f9);
            f12 += f9;
            i14 = jmVar.f29746k.f28112g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.v0 v0Var = this.f30096a;
        v0Var.W(f12, v0Var.getMeasuredHeight());
        if (v0Var.I()) {
            v0Var.y(canvas, true);
            v0Var.B(canvas, true);
        }
        v0Var.draw(canvas);
        canvas.restore();
        if (lmVar.F != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (lmVar.F.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.v0 v0Var = this.f30096a;
        v0Var.layout(0, 0, v0Var.getMeasuredWidth(), v0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f30096a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f30103s <= 0) {
            this.f30103s = j7.l1.d(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f30103s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.km.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
