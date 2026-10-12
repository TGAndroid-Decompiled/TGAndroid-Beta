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
public final class dn extends ViewGroup {
    public cn E;
    public bn F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.t6 M;
    public final zm N;
    public int O;
    public final en P;
    public final org.telegram.ui.Cells.x0 f24449a;
    public final ArrayList f24450b;
    public final HashMap f24451c;
    public HashMap d;
    public ArrayList e;
    public HashMap f24452f;
    public ArrayList h;
    public final int f24453n;
    public final int f24454r;
    public int f24455s;
    public float v;
    public float f24456w;
    public boolean[] f24457x;
    public long f24458y;

    public dn(en enVar, Context context) {
        super(context);
        this.P = enVar;
        this.f24450b = new ArrayList();
        this.f24451c = new HashMap();
        this.f24453n = AndroidUtilities.dp(16.0f);
        this.f24454r = AndroidUtilities.dp(64.0f);
        this.f24455s = 0;
        this.f24457x = null;
        this.f24458y = 0L;
        this.E = null;
        this.F = null;
        this.G = 0.0f;
        this.K = new PointF();
        this.L = false;
        this.M = new org.telegram.ui.Cells.t6(this, 7);
        this.N = new zm(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(context, enVar.f24745n, true);
        this.f24449a = x0Var;
        x0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(x0Var);
    }

    public final void a() {
        String str;
        this.d = this.P.P.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f24452f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f24450b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((cn) arrayList.get(i10)).f24125k.f31275g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.f24451c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f24452f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f24452f.put(key, value);
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
                                            this.f24452f.put(key2, value2);
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
        en enVar = this.P;
        bn bnVar = enVar.J;
        PointF pointF = this.K;
        if (bnVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!enVar.K) {
            RectF f7 = bnVar.f(bnVar.e());
            RectF f10 = enVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, enVar.f24750y - ((enVar.G - 0.5f) * enVar.H), this.G);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + enVar.J.f23803a.f24118a + f10.top, (enVar.E - ((enVar.F - 0.5f) * enVar.I)) + enVar.M, this.G);
            return pointF;
        } else {
            RectF f11 = bnVar.f(bnVar.e());
            RectF f12 = enVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + enVar.J.f23803a.f24118a + f12.top, this.I, this.G / this.J);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f24450b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((cn) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                bn bnVar = (bn) arrayList2.get(i11);
                wh.f fVar = bnVar.f23818s;
                if (fVar != null) {
                    fVar.b(bnVar.O.f24139z);
                    bnVar.f23818s = null;
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
                cn cnVar = new cn(this);
                cn.a(cnVar, new xm(this.P, arrayList3), false);
                arrayList.add(cnVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        en enVar;
        bi.o0 o0Var;
        boolean z10;
        ArrayList arrayList = this.f24450b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f7 = this.f24453n;
        int computeVerticalScrollOffset = this.P.f24746r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - enVar.getListTopPadding());
        this.f24456w = (o0Var.getMeasuredHeight() - enVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((cn) arrayList.get(i10)).b() + f7;
            float f10 = this.v;
            if ((f7 >= f10 && f7 <= this.f24456w) || ((b10 >= f10 && b10 <= this.f24456w) || (f7 <= f10 && b10 >= this.f24456w))) {
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final int e() {
        int i10 = this.f24453n + this.f24454r;
        ArrayList arrayList = this.f24450b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((cn) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.x0 x0Var = this.f24449a;
        if (x0Var.getMeasuredHeight() <= 0) {
            x0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return x0Var.getMeasuredHeight() + i10;
    }

    public final void f(cn cnVar, MediaController.PhotoEntry photoEntry, int i10) {
        cn cnVar2;
        ArrayList arrayList = cnVar.f24125k.f31275g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (cnVar.f24125k.f31275g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) cnVar.f24125k.f31275g.get(10);
            cnVar.f24125k.f31275g.remove(10);
            ArrayList arrayList2 = this.f24450b;
            int indexOf = arrayList2.indexOf(cnVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                if (i11 == arrayList2.size()) {
                    cnVar2 = null;
                } else {
                    cnVar2 = (cn) arrayList2.get(i11);
                }
                if (cnVar2 == null) {
                    cn cnVar3 = new cn(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    cn.a(cnVar3, new xm(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(cnVar2, photoEntry2, 0);
                }
            }
        }
        cn.a(cnVar, cnVar.f24125k, true);
    }

    public final void g() {
        float f7 = this.f24453n;
        ArrayList arrayList = this.f24450b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            cn cnVar = (cn) arrayList.get(i11);
            float b10 = cnVar.b();
            cnVar.f24118a = f7;
            cnVar.f24119b = i10;
            f7 += b10;
            i10 += cnVar.f24125k.f31275g.size();
        }
    }

    public final void h() {
        en enVar = this.P;
        ValueAnimator valueAnimator = enVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        enVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        enVar.L = ofFloat;
        ofFloat.addUpdateListener(new ym(this, 1));
        enVar.L.addListener(new l6(this, 13));
        enVar.L.setDuration(200L);
        enVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f24452f;
        ArrayList arrayList = this.h;
        vm vmVar = chatAttachAlertPhotoLayout.G;
        vi viVar = chatAttachAlertPhotoLayout.f27671b;
        hm hmVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f23020s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f23021t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            boolean z15 = false;
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = hmVar.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = hmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z16 = vmVar.f30085f;
                    boolean z17 = vmVar.d;
                    if (z16 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z17 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (viVar.T0 != 0 || viVar.H) {
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
                        if (R == vmVar.h() - 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        t5Var.d(b02, z12, z13, z14, viVar.f30010i0);
                        if ((viVar.f30001f0 instanceof org.telegram.ui.fo) && viVar.W1) {
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
            this.P.f27671b.Z1(1);
        }
    }

    @Override
    public final void invalidate() {
        int c10 = org.telegram.messenger.q.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f24455s != c10) {
            this.f24455s = c10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f24450b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            cn cnVar = (cn) arrayList.get(i10);
            if (cnVar.f24125k.f31275g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - cnVar.f24125k.f31275g.size();
                cn cnVar2 = (cn) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, cnVar2.f24125k.f31275g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) cnVar2.f24125k.f31275g.remove(0));
                }
                cnVar.f24125k.f31275g.addAll(arrayList2);
                cn.a(cnVar, cnVar.f24125k, true);
                cn.a(cnVar2, cnVar2.f24125k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bi.o0 o0Var;
        float f7;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        boolean z10;
        float f10;
        bn bnVar;
        float f11;
        float f12 = this.f24453n;
        en enVar = this.P;
        int computeVerticalScrollOffset = enVar.f24746r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - enVar.getListTopPadding());
        this.f24456w = (o0Var.getMeasuredHeight() - enVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f12);
        ArrayList arrayList2 = this.f24450b;
        int size = arrayList2.size();
        float f13 = f12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            cn cnVar = (cn) arrayList2.get(i13);
            float b10 = cnVar.b();
            cnVar.f24118a = f13;
            cnVar.f24119b = i14;
            float f14 = this.v;
            if (f13 < f14 || f13 > this.f24456w) {
                float f15 = f13 + b10;
                if ((f15 < f14 || f15 > this.f24456w) && (f13 > f14 || f15 < this.f24456w)) {
                    f7 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f7);
                    f13 += f7;
                    i14 = cnVar.f24125k.f31275g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = cnVar.h;
            int i15 = cnVar.f24126l;
            org.telegram.ui.ActionBar.d5 d5Var = cnVar.f24137x;
            dn dnVar = cnVar.f24139z;
            arrayList = arrayList2;
            float interpolation = cnVar.f24124j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - cnVar.f24120c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(cnVar.f24121f, cnVar.d, interpolation);
            int width = dnVar.getWidth();
            en enVar2 = dnVar.P;
            float previewScale = width * lerp * enVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = enVar2.getPreviewScale() * AndroidUtilities.lerp(cnVar.f24122g, cnVar.e, interpolation) * max;
            if (d5Var != null) {
                f10 = 2.0f;
                cnVar.f24130p = 0.0f;
                float width2 = dnVar.getWidth();
                float f16 = i15;
                cnVar.f24128n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                cnVar.f24129o = (Math.max(f16, previewScale) + dnVar.getWidth()) / 2.0f;
                cnVar.f24131q = Math.max(i15 * 2, previewScale2);
                cnVar.f24137x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                d5Var.setBounds((int) cnVar.f24128n, (int) cnVar.f24130p, (int) cnVar.f24129o, (int) cnVar.f24131q);
                if (cnVar.d <= 0.0f) {
                    f11 = 1.0f - interpolation;
                } else if (cnVar.f24121f <= 0.0f) {
                    f11 = interpolation;
                } else {
                    f11 = 1.0f;
                }
                d5Var.setAlpha((int) (f11 * 255.0f));
                d5Var.d(canvas, cnVar.f24138y, null);
                cnVar.f24130p += f16;
                cnVar.f24128n += f16;
                cnVar.f24131q -= f16;
                cnVar.f24129o -= f16;
            } else {
                f10 = 2.0f;
            }
            cnVar.f24132r = cnVar.f24129o - cnVar.f24128n;
            cnVar.f24133s = cnVar.f24131q - cnVar.f24130p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                bn bnVar2 = (bn) arrayList3.get(i16);
                if (bnVar2 != null && (((bnVar = enVar2.J) == null || bnVar.f23804b != bnVar2.f23804b) && bnVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = cnVar.f24136w;
            RectF rectF = cnVar.f24134t;
            long j10 = cnVar.f24123i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (cnVar.f24135u == null || cnVar.v != j10) {
                    cnVar.v = j10;
                    cnVar.f24135u = new h11(zh.p7.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + cnVar.f24135u.f25473c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f17 = cnVar.f24128n;
                float f18 = cnVar.f24132r;
                float f19 = f10;
                float z12 = com.google.android.gms.internal.play_billing.k3.z(f18, dp, f19, f17);
                i10 = size;
                float f20 = cnVar.f24130p;
                i11 = i13;
                float f21 = cnVar.f24133s;
                i12 = i14;
                rectF.set(z12, com.google.android.gms.internal.play_billing.k3.z(f21, dp2, f19, f20), org.telegram.messenger.q.b(f18, dp, f19, f17), org.telegram.messenger.q.b(f21, dp2, f19, f20));
                paint.setColor(1610612736);
                float f22 = dp2 / f19;
                canvas.drawRoundRect(rectF, f22, f22, paint);
                f7 = b10;
                cnVar.f24135u.c(AndroidUtilities.dp(14.0f) + (((cnVar.f24132r / f19) + cnVar.f24128n) - (dp / f19)), cnVar.f24130p + (cnVar.f24133s / f19), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f13 += f7;
            i14 = cnVar.f24125k.f31275g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.x0 x0Var = this.f24449a;
        x0Var.a0(f13, x0Var.getMeasuredHeight());
        if (x0Var.K()) {
            x0Var.A(canvas, true);
            x0Var.D(canvas, true);
        }
        x0Var.draw(canvas);
        canvas.restore();
        if (enVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (enVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.x0 x0Var = this.f24449a;
        x0Var.layout(0, 0, x0Var.getMeasuredWidth(), x0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f24449a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f24455s <= 0) {
            this.f24455s = org.telegram.messenger.q.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f24455s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dn.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
