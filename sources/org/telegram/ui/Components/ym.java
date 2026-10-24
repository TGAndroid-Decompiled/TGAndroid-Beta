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
public final class ym extends ViewGroup {
    public xm E;
    public wm F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.u5 M;
    public final um N;
    public int O;
    public final zm P;
    public final org.telegram.ui.Cells.v0 f32978a;
    public final ArrayList f32979b;
    public final HashMap f32980c;
    public HashMap d;
    public ArrayList e;
    public HashMap f32981f;
    public ArrayList h;
    public final int f32982n;
    public final int f32983r;
    public int f32984s;
    public float v;
    public float f32985w;
    public boolean[] f32986x;
    public long f32987y;

    public ym(zm zmVar, Context context) {
        super(context);
        this.P = zmVar;
        this.f32979b = new ArrayList();
        this.f32980c = new HashMap();
        this.f32982n = AndroidUtilities.dp(16.0f);
        this.f32983r = AndroidUtilities.dp(64.0f);
        this.f32984s = 0;
        this.f32986x = null;
        this.f32987y = 0L;
        this.E = null;
        this.F = null;
        this.G = 0.0f;
        this.K = new PointF();
        this.L = false;
        this.M = new org.telegram.ui.Cells.u5(this, 8);
        this.N = new um(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, zmVar.f33291n, true);
        this.f32978a = v0Var;
        v0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(v0Var);
    }

    public final void a() {
        String str;
        this.d = this.P.P.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f32981f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f32979b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((xm) arrayList.get(i10)).f32644k.f30570g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.f32980c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f32981f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f32981f.put(key, value);
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
                                            this.f32981f.put(key2, value2);
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
        zm zmVar = this.P;
        wm wmVar = zmVar.J;
        PointF pointF = this.K;
        if (wmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!zmVar.K) {
            RectF f7 = wmVar.f(wmVar.e());
            RectF f10 = zmVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, zmVar.f33296y - ((zmVar.G - 0.5f) * zmVar.H), this.G);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + zmVar.J.f32266a.f32637a + f10.top, (zmVar.E - ((zmVar.F - 0.5f) * zmVar.I)) + zmVar.M, this.G);
            return pointF;
        } else {
            RectF f11 = wmVar.f(wmVar.e());
            RectF f12 = zmVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + zmVar.J.f32266a.f32637a + f12.top, this.I, this.G / this.J);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f32979b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((xm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                wm wmVar = (wm) arrayList2.get(i11);
                wh.f fVar = wmVar.f32281s;
                if (fVar != null) {
                    fVar.b(wmVar.O.f32658z);
                    wmVar.f32281s = null;
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
                xm xmVar = new xm(this);
                xm.a(xmVar, new sm(this.P, arrayList3), false);
                arrayList.add(xmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        zm zmVar;
        ai.u1 u1Var;
        boolean z10;
        ArrayList arrayList = this.f32979b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f7 = this.f32982n;
        int computeVerticalScrollOffset = this.P.f33292r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - zmVar.getListTopPadding());
        this.f32985w = (u1Var.getMeasuredHeight() - zmVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((xm) arrayList.get(i10)).b() + f7;
            float f10 = this.v;
            if ((f7 >= f10 && f7 <= this.f32985w) || ((b10 >= f10 && b10 <= this.f32985w) || (f7 <= f10 && b10 >= this.f32985w))) {
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
        int i10 = this.f32982n + this.f32983r;
        ArrayList arrayList = this.f32979b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((xm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.v0 v0Var = this.f32978a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return v0Var.getMeasuredHeight() + i10;
    }

    public final void f(xm xmVar, MediaController.PhotoEntry photoEntry, int i10) {
        xm xmVar2;
        ArrayList arrayList = xmVar.f32644k.f30570g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (xmVar.f32644k.f30570g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) xmVar.f32644k.f30570g.get(10);
            xmVar.f32644k.f30570g.remove(10);
            ArrayList arrayList2 = this.f32979b;
            int indexOf = arrayList2.indexOf(xmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                if (i11 == arrayList2.size()) {
                    xmVar2 = null;
                } else {
                    xmVar2 = (xm) arrayList2.get(i11);
                }
                if (xmVar2 == null) {
                    xm xmVar3 = new xm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    xm.a(xmVar3, new sm(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(xmVar2, photoEntry2, 0);
                }
            }
        }
        xm.a(xmVar, xmVar.f32644k, true);
    }

    public final void g() {
        float f7 = this.f32982n;
        ArrayList arrayList = this.f32979b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            xm xmVar = (xm) arrayList.get(i11);
            float b10 = xmVar.b();
            xmVar.f32637a = f7;
            xmVar.f32638b = i10;
            f7 += b10;
            i10 += xmVar.f32644k.f30570g.size();
        }
    }

    public final void h() {
        zm zmVar = this.P;
        ValueAnimator valueAnimator = zmVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        zmVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        zmVar.L = ofFloat;
        ofFloat.addUpdateListener(new tm(this, 1));
        zmVar.L.addListener(new org.telegram.ui.pq(this, 15));
        zmVar.L.setDuration(200L);
        zmVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f32981f;
        ArrayList arrayList = this.h;
        qm qmVar = chatAttachAlertPhotoLayout.G;
        ri riVar = chatAttachAlertPhotoLayout.f27704b;
        cm cmVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f24225s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f24226t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            boolean z15 = false;
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = cmVar.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = cmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    int R = RecyclerView.R(childAt);
                    boolean z16 = qmVar.f29954f;
                    boolean z17 = qmVar.d;
                    if (z16 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z17 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    if (riVar.T0 != 0 || riVar.H) {
                        s5Var.getCheckBox().setVisibility(8);
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
                        if (R == qmVar.h() - 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        s5Var.d(b02, z12, z13, z14, riVar.f30155i0);
                        if ((riVar.f30146f0 instanceof org.telegram.ui.sn) && riVar.W1) {
                            z11 = false;
                            s5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            z11 = false;
                            s5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
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
            this.P.f27704b.d2(1);
        }
    }

    @Override
    public final void invalidate() {
        int g10 = i2.o1.g(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f32984s != g10) {
            this.f32984s = g10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f32979b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            xm xmVar = (xm) arrayList.get(i10);
            if (xmVar.f32644k.f30570g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - xmVar.f32644k.f30570g.size();
                xm xmVar2 = (xm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, xmVar2.f32644k.f30570g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) xmVar2.f32644k.f30570g.remove(0));
                }
                xmVar.f32644k.f30570g.addAll(arrayList2);
                xm.a(xmVar, xmVar.f32644k, true);
                xm.a(xmVar2, xmVar2.f32644k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ai.u1 u1Var;
        float f7;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        boolean z10;
        float f10;
        wm wmVar;
        float f11;
        float f12 = this.f32982n;
        zm zmVar = this.P;
        int computeVerticalScrollOffset = zmVar.f33292r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - zmVar.getListTopPadding());
        this.f32985w = (u1Var.getMeasuredHeight() - zmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f12);
        ArrayList arrayList2 = this.f32979b;
        int size = arrayList2.size();
        float f13 = f12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            xm xmVar = (xm) arrayList2.get(i13);
            float b10 = xmVar.b();
            xmVar.f32637a = f13;
            xmVar.f32638b = i14;
            float f14 = this.v;
            if (f13 < f14 || f13 > this.f32985w) {
                float f15 = f13 + b10;
                if ((f15 < f14 || f15 > this.f32985w) && (f13 > f14 || f15 < this.f32985w)) {
                    f7 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f7);
                    f13 += f7;
                    i14 = xmVar.f32644k.f30570g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = xmVar.h;
            int i15 = xmVar.f32645l;
            org.telegram.ui.ActionBar.j5 j5Var = xmVar.f32656x;
            ym ymVar = xmVar.f32658z;
            arrayList = arrayList2;
            float interpolation = xmVar.f32643j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - xmVar.f32639c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(xmVar.f32640f, xmVar.d, interpolation);
            int width = ymVar.getWidth();
            zm zmVar2 = ymVar.P;
            float previewScale = width * lerp * zmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = zmVar2.getPreviewScale() * AndroidUtilities.lerp(xmVar.f32641g, xmVar.e, interpolation) * max;
            if (j5Var != null) {
                f10 = 2.0f;
                xmVar.f32649p = 0.0f;
                float width2 = ymVar.getWidth();
                float f16 = i15;
                xmVar.f32647n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                xmVar.f32648o = (Math.max(f16, previewScale) + ymVar.getWidth()) / 2.0f;
                xmVar.f32650q = Math.max(i15 * 2, previewScale2);
                xmVar.f32656x.n(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                j5Var.setBounds((int) xmVar.f32647n, (int) xmVar.f32649p, (int) xmVar.f32648o, (int) xmVar.f32650q);
                if (xmVar.d <= 0.0f) {
                    f11 = 1.0f - interpolation;
                } else if (xmVar.f32640f <= 0.0f) {
                    f11 = interpolation;
                } else {
                    f11 = 1.0f;
                }
                j5Var.setAlpha((int) (f11 * 255.0f));
                j5Var.d(canvas, xmVar.f32657y, null);
                xmVar.f32649p += f16;
                xmVar.f32647n += f16;
                xmVar.f32650q -= f16;
                xmVar.f32648o -= f16;
            } else {
                f10 = 2.0f;
            }
            xmVar.f32651r = xmVar.f32648o - xmVar.f32647n;
            xmVar.f32652s = xmVar.f32650q - xmVar.f32649p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                wm wmVar2 = (wm) arrayList3.get(i16);
                if (wmVar2 != null && (((wmVar = zmVar2.J) == null || wmVar.f32267b != wmVar2.f32267b) && wmVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = xmVar.f32655w;
            RectF rectF = xmVar.f32653t;
            long j10 = xmVar.f32642i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (xmVar.f32654u == null || xmVar.v != j10) {
                    xmVar.v = j10;
                    xmVar.f32654u = new h11(ai.nd.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + xmVar.f32654u.f26843c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f17 = xmVar.f32647n;
                float f18 = xmVar.f32651r;
                float f19 = f10;
                float z12 = com.google.android.gms.internal.play_billing.k3.z(f18, dp, f19, f17);
                i10 = size;
                float f20 = xmVar.f32649p;
                i11 = i13;
                float f21 = xmVar.f32652s;
                i12 = i14;
                rectF.set(z12, com.google.android.gms.internal.play_billing.k3.z(f21, dp2, f19, f20), org.telegram.messenger.v0.a(f18, dp, f19, f17), org.telegram.messenger.v0.a(f21, dp2, f19, f20));
                paint.setColor(1610612736);
                float f22 = dp2 / f19;
                canvas.drawRoundRect(rectF, f22, f22, paint);
                f7 = b10;
                xmVar.f32654u.c(AndroidUtilities.dp(14.0f) + (((xmVar.f32651r / f19) + xmVar.f32647n) - (dp / f19)), xmVar.f32649p + (xmVar.f32652s / f19), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f13 += f7;
            i14 = xmVar.f32644k.f30570g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.v0 v0Var = this.f32978a;
        v0Var.Z(f13, v0Var.getMeasuredHeight());
        if (v0Var.J()) {
            v0Var.z(canvas, true);
            v0Var.B(canvas, true);
        }
        v0Var.draw(canvas);
        canvas.restore();
        if (zmVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (zmVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.v0 v0Var = this.f32978a;
        v0Var.layout(0, 0, v0Var.getMeasuredWidth(), v0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f32978a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f32984s <= 0) {
            this.f32984s = i2.o1.g(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f32984s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ym.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
