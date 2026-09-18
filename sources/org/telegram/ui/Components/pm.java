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
    public om E;
    public nm F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.t6 M;
    public final lm N;
    public int O;
    public final qm P;
    public final org.telegram.ui.Cells.w0 f27262a;
    public final ArrayList f27263b;
    public final HashMap f27264c;
    public HashMap d;
    public ArrayList e;
    public HashMap f27265f;
    public ArrayList h;
    public final int f27266n;
    public final int f27267r;
    public int f27268s;
    public float v;
    public float f27269w;
    public boolean[] f27270x;
    public long f27271y;

    public pm(qm qmVar, Context context) {
        super(context);
        this.P = qmVar;
        this.f27263b = new ArrayList();
        this.f27264c = new HashMap();
        this.f27266n = AndroidUtilities.dp(16.0f);
        this.f27267r = AndroidUtilities.dp(64.0f);
        this.f27268s = 0;
        this.f27270x = null;
        this.f27271y = 0L;
        this.E = null;
        this.F = null;
        this.G = 0.0f;
        this.K = new PointF();
        this.L = false;
        this.M = new org.telegram.ui.Cells.t6(this, 8);
        this.N = new lm(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, qmVar.f27683n, true);
        this.f27262a = w0Var;
        w0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(w0Var);
    }

    public final void a() {
        String str;
        this.d = this.P.P.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f27265f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f27263b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((om) arrayList.get(i10)).f26995k.f25368g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.f27264c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f27265f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f27265f.put(key, value);
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
                                            this.f27265f.put(key2, value2);
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
        qm qmVar = this.P;
        nm nmVar = qmVar.J;
        PointF pointF = this.K;
        if (nmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!qmVar.K) {
            RectF f7 = nmVar.f(nmVar.e());
            RectF f10 = qmVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, qmVar.f27688y - ((qmVar.G - 0.5f) * qmVar.H), this.G);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + qmVar.J.f26704a.f26988a + f10.top, (qmVar.E - ((qmVar.F - 0.5f) * qmVar.I)) + qmVar.M, this.G);
            return pointF;
        } else {
            RectF f11 = nmVar.f(nmVar.e());
            RectF f12 = qmVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + qmVar.J.f26704a.f26988a + f12.top, this.I, this.G / this.J);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f27263b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((om) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                nm nmVar = (nm) arrayList2.get(i11);
                vh.g gVar = nmVar.f26719s;
                if (gVar != null) {
                    gVar.b(nmVar.O.f27009z);
                    nmVar.f26719s = null;
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
                om.a(omVar, new jm(this.P, arrayList3), false);
                arrayList.add(omVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        qm qmVar;
        ai.w0 w0Var;
        boolean z10;
        ArrayList arrayList = this.f27263b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f7 = this.f27266n;
        int computeVerticalScrollOffset = this.P.f27684r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - qmVar.getListTopPadding());
        this.f27269w = (w0Var.getMeasuredHeight() - qmVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((om) arrayList.get(i10)).b() + f7;
            float f10 = this.v;
            if ((f7 >= f10 && f7 <= this.f27269w) || ((b10 >= f10 && b10 <= this.f27269w) || (f7 <= f10 && b10 >= this.f27269w))) {
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
        int i10 = this.f27266n + this.f27267r;
        ArrayList arrayList = this.f27263b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((om) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.w0 w0Var = this.f27262a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return w0Var.getMeasuredHeight() + i10;
    }

    public final void f(om omVar, MediaController.PhotoEntry photoEntry, int i10) {
        om omVar2;
        ArrayList arrayList = omVar.f26995k.f25368g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (omVar.f26995k.f25368g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) omVar.f26995k.f25368g.get(10);
            omVar.f26995k.f25368g.remove(10);
            ArrayList arrayList2 = this.f27263b;
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
                    om.a(omVar3, new jm(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(omVar2, photoEntry2, 0);
                }
            }
        }
        om.a(omVar, omVar.f26995k, true);
    }

    public final void g() {
        float f7 = this.f27266n;
        ArrayList arrayList = this.f27263b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            om omVar = (om) arrayList.get(i11);
            float b10 = omVar.b();
            omVar.f26988a = f7;
            omVar.f26989b = i10;
            f7 += b10;
            i10 += omVar.f26995k.f25368g.size();
        }
    }

    public final void h() {
        qm qmVar = this.P;
        ValueAnimator valueAnimator = qmVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        qmVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        qmVar.L = ofFloat;
        ofFloat.addUpdateListener(new km(this, 1));
        qmVar.L.addListener(new r8(this, 10));
        qmVar.L.setDuration(200L);
        qmVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f27265f;
        ArrayList arrayList = this.h;
        hm hmVar = chatAttachAlertPhotoLayout.G;
        vi viVar = chatAttachAlertPhotoLayout.f26688b;
        tl tlVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f22086s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f22087t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = tlVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = tlVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int S = RecyclerView.S(childAt);
                    boolean z14 = hmVar.f24691f;
                    boolean z15 = hmVar.d;
                    if (z14 && S > chatAttachAlertPhotoLayout.M0) {
                        S--;
                    }
                    if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        S--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (viVar.Q0 != 0 || viVar.H) {
                        t5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(S);
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
                        if (S == hmVar.h() - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        t5Var.d(b02, z11, z12, z13, viVar.f29030i0);
                        if ((viVar.f29021f0 instanceof org.telegram.ui.zn) && viVar.T1) {
                            t5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            t5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.P.f26688b.V1(1);
        }
    }

    @Override
    public final void invalidate() {
        int c10 = org.telegram.messenger.q.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f27268s != c10) {
            this.f27268s = c10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f27263b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            om omVar = (om) arrayList.get(i10);
            if (omVar.f26995k.f25368g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - omVar.f26995k.f25368g.size();
                om omVar2 = (om) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, omVar2.f26995k.f25368g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) omVar2.f26995k.f25368g.remove(0));
                }
                omVar.f26995k.f25368g.addAll(arrayList2);
                om.a(omVar, omVar.f26995k, true);
                om.a(omVar2, omVar2.f26995k, true);
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
        nm nmVar;
        float f10;
        float f11 = this.f27266n;
        qm qmVar = this.P;
        int computeVerticalScrollOffset = qmVar.f27684r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - qmVar.getListTopPadding());
        this.f27269w = (w0Var.getMeasuredHeight() - qmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList2 = this.f27263b;
        int size = arrayList2.size();
        float f12 = f11;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            om omVar = (om) arrayList2.get(i13);
            float b10 = omVar.b();
            omVar.f26988a = f12;
            omVar.f26989b = i14;
            float f13 = this.v;
            if (f12 < f13 || f12 > this.f27269w) {
                float f14 = f12 + b10;
                if ((f14 < f13 || f14 > this.f27269w) && (f12 > f13 || f14 < this.f27269w)) {
                    f7 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f7);
                    f12 += f7;
                    i14 = omVar.f26995k.f25368g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = omVar.h;
            int i15 = omVar.f26996l;
            org.telegram.ui.ActionBar.f5 f5Var = omVar.f27007x;
            pm pmVar = omVar.f27009z;
            arrayList = arrayList2;
            float interpolation = omVar.f26994j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - omVar.f26990c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(omVar.f26991f, omVar.d, interpolation);
            int width = pmVar.getWidth();
            qm qmVar2 = pmVar.P;
            float previewScale = width * lerp * qmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = qmVar2.getPreviewScale() * AndroidUtilities.lerp(omVar.f26992g, omVar.e, interpolation) * max;
            if (f5Var != null) {
                omVar.f27000p = 0.0f;
                float width2 = pmVar.getWidth();
                float f15 = i15;
                omVar.f26998n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                omVar.f26999o = (Math.max(f15, previewScale) + pmVar.getWidth()) / 2.0f;
                omVar.f27001q = Math.max(i15 * 2, previewScale2);
                omVar.f27007x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                f5Var.setBounds((int) omVar.f26998n, (int) omVar.f27000p, (int) omVar.f26999o, (int) omVar.f27001q);
                if (omVar.d <= 0.0f) {
                    f10 = 1.0f - interpolation;
                } else if (omVar.f26991f <= 0.0f) {
                    f10 = interpolation;
                } else {
                    f10 = 1.0f;
                }
                f5Var.setAlpha((int) (f10 * 255.0f));
                f5Var.d(canvas, omVar.f27008y, null);
                omVar.f27000p += f15;
                omVar.f26998n += f15;
                omVar.f27001q -= f15;
                omVar.f26999o -= f15;
            }
            omVar.f27002r = omVar.f26999o - omVar.f26998n;
            omVar.f27003s = omVar.f27001q - omVar.f27000p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                nm nmVar2 = (nm) arrayList3.get(i16);
                if (nmVar2 != null && (((nmVar = qmVar2.J) == null || nmVar.f26705b != nmVar2.f26705b) && nmVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = omVar.f27006w;
            RectF rectF = omVar.f27004t;
            long j3 = omVar.f26993i;
            if (j3 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (omVar.f27005u == null || omVar.v != j3) {
                    omVar.v = j3;
                    omVar.f27005u = new v01(yh.v7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + omVar.f27005u.f28868c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f16 = omVar.f26998n;
                float f17 = omVar.f27002r;
                float A = com.google.android.gms.internal.vision.e2.A(f17, dp, 2.0f, f16);
                i10 = size;
                float f18 = omVar.f27000p;
                i11 = i13;
                float f19 = omVar.f27003s;
                i12 = i14;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f19, dp2, 2.0f, f18), org.telegram.messenger.q.b(f17, dp, 2.0f, f16), org.telegram.messenger.q.b(f19, dp2, 2.0f, f18));
                paint.setColor(1610612736);
                float f20 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f20, f20, paint);
                f7 = b10;
                omVar.f27005u.c(AndroidUtilities.dp(14.0f) + (((omVar.f27002r / 2.0f) + omVar.f26998n) - (dp / 2.0f)), omVar.f27000p + (omVar.f27003s / 2.0f), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f12 += f7;
            i14 = omVar.f26995k.f25368g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.w0 w0Var2 = this.f27262a;
        w0Var2.W(f12, w0Var2.getMeasuredHeight());
        if (w0Var2.J()) {
            w0Var2.y(canvas, true);
            w0Var2.A(canvas, true);
        }
        w0Var2.draw(canvas);
        canvas.restore();
        if (qmVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (qmVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.w0 w0Var = this.f27262a;
        w0Var.layout(0, 0, w0Var.getMeasuredWidth(), w0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f27262a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f27268s <= 0) {
            this.f27268s = org.telegram.messenger.q.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f27268s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pm.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
