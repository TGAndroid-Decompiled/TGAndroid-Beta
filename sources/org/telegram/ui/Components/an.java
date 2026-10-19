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
public final class an extends ViewGroup {
    public zm E;
    public ym F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.k7 M;
    public final wm N;
    public int O;
    public final bn P;
    public final org.telegram.ui.Cells.w0 f24645a;
    public final ArrayList f24646b;
    public final HashMap f24647c;
    public HashMap d;
    public ArrayList e;
    public HashMap f24648f;
    public ArrayList h;
    public final int f24649n;
    public final int f24650r;
    public int f24651s;
    public float v;
    public float f24652w;
    public boolean[] f24653x;
    public long f24654y;

    public an(bn bnVar, Context context) {
        super(context);
        this.P = bnVar;
        this.f24646b = new ArrayList();
        this.f24647c = new HashMap();
        this.f24649n = AndroidUtilities.dp(16.0f);
        this.f24650r = AndroidUtilities.dp(64.0f);
        this.f24651s = 0;
        this.f24653x = null;
        this.f24654y = 0L;
        this.E = null;
        this.F = null;
        this.G = 0.0f;
        this.K = new PointF();
        this.L = false;
        this.M = new org.telegram.ui.Cells.k7(this, 6);
        this.N = new wm(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, bnVar.f24990n, true);
        this.f24645a = w0Var;
        w0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(w0Var);
    }

    public final void a() {
        String str;
        this.d = this.P.P.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f24648f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f24646b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((zm) arrayList.get(i10)).f32978k.f31021g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.f24647c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f24648f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f24648f.put(key, value);
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
                                            this.f24648f.put(key2, value2);
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
        bn bnVar = this.P;
        ym ymVar = bnVar.J;
        PointF pointF = this.K;
        if (ymVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!bnVar.K) {
            RectF f7 = ymVar.f(ymVar.e());
            RectF f10 = bnVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, bnVar.f24995y - ((bnVar.G - 0.5f) * bnVar.H), this.G);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + bnVar.J.f32671a.f32971a + f10.top, (bnVar.E - ((bnVar.F - 0.5f) * bnVar.I)) + bnVar.M, this.G);
            return pointF;
        } else {
            RectF f11 = ymVar.f(ymVar.e());
            RectF f12 = bnVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + bnVar.J.f32671a.f32971a + f12.top, this.I, this.G / this.J);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f24646b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((zm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                ym ymVar = (ym) arrayList2.get(i11);
                wh.f fVar = ymVar.f32686s;
                if (fVar != null) {
                    fVar.b(ymVar.O.f32992z);
                    ymVar.f32686s = null;
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
                zm zmVar = new zm(this);
                zm.a(zmVar, new um(this.P, arrayList3), false);
                arrayList.add(zmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        bn bnVar;
        ai.u1 u1Var;
        boolean z10;
        ArrayList arrayList = this.f24646b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f7 = this.f24649n;
        int computeVerticalScrollOffset = this.P.f24991r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - bnVar.getListTopPadding());
        this.f24652w = (u1Var.getMeasuredHeight() - bnVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((zm) arrayList.get(i10)).b() + f7;
            float f10 = this.v;
            if ((f7 >= f10 && f7 <= this.f24652w) || ((b10 >= f10 && b10 <= this.f24652w) || (f7 <= f10 && b10 >= this.f24652w))) {
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
        int i10 = this.f24649n + this.f24650r;
        ArrayList arrayList = this.f24646b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((zm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.w0 w0Var = this.f24645a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return w0Var.getMeasuredHeight() + i10;
    }

    public final void f(zm zmVar, MediaController.PhotoEntry photoEntry, int i10) {
        zm zmVar2;
        ArrayList arrayList = zmVar.f32978k.f31021g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (zmVar.f32978k.f31021g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) zmVar.f32978k.f31021g.get(10);
            zmVar.f32978k.f31021g.remove(10);
            ArrayList arrayList2 = this.f24646b;
            int indexOf = arrayList2.indexOf(zmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                if (i11 == arrayList2.size()) {
                    zmVar2 = null;
                } else {
                    zmVar2 = (zm) arrayList2.get(i11);
                }
                if (zmVar2 == null) {
                    zm zmVar3 = new zm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    zm.a(zmVar3, new um(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(zmVar2, photoEntry2, 0);
                }
            }
        }
        zm.a(zmVar, zmVar.f32978k, true);
    }

    public final void g() {
        float f7 = this.f24649n;
        ArrayList arrayList = this.f24646b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            zm zmVar = (zm) arrayList.get(i11);
            float b10 = zmVar.b();
            zmVar.f32971a = f7;
            zmVar.f32972b = i10;
            f7 += b10;
            i10 += zmVar.f32978k.f31021g.size();
        }
    }

    public final void h() {
        bn bnVar = this.P;
        ValueAnimator valueAnimator = bnVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        bnVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        bnVar.L = ofFloat;
        ofFloat.addUpdateListener(new vm(this, 1));
        bnVar.L.addListener(new org.telegram.ui.nq(this, 15));
        bnVar.L.setDuration(200L);
        bnVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f24648f;
        ArrayList arrayList = this.h;
        sm smVar = chatAttachAlertPhotoLayout.G;
        ti tiVar = chatAttachAlertPhotoLayout.f28223b;
        em emVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f24076s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f24077t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            boolean z15 = false;
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = emVar.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = emVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    int R = RecyclerView.R(childAt);
                    boolean z16 = smVar.f30282f;
                    boolean z17 = smVar.d;
                    if (z16 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z17 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    if (tiVar.T0 != 0 || tiVar.H) {
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
                        if (R == smVar.h() - 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        s5Var.d(b02, z12, z13, z14, tiVar.f30543i0);
                        if ((tiVar.f30534f0 instanceof org.telegram.ui.qn) && tiVar.W1) {
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
            this.P.f28223b.Z1(1);
        }
    }

    @Override
    public final void invalidate() {
        int b10 = org.telegram.messenger.g0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f24651s != b10) {
            this.f24651s = b10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f24646b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            zm zmVar = (zm) arrayList.get(i10);
            if (zmVar.f32978k.f31021g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - zmVar.f32978k.f31021g.size();
                zm zmVar2 = (zm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, zmVar2.f32978k.f31021g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) zmVar2.f32978k.f31021g.remove(0));
                }
                zmVar.f32978k.f31021g.addAll(arrayList2);
                zm.a(zmVar, zmVar.f32978k, true);
                zm.a(zmVar2, zmVar2.f32978k, true);
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
        ym ymVar;
        float f11;
        float f12 = this.f24649n;
        bn bnVar = this.P;
        int computeVerticalScrollOffset = bnVar.f24991r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - bnVar.getListTopPadding());
        this.f24652w = (u1Var.getMeasuredHeight() - bnVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f12);
        ArrayList arrayList2 = this.f24646b;
        int size = arrayList2.size();
        float f13 = f12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            zm zmVar = (zm) arrayList2.get(i13);
            float b10 = zmVar.b();
            zmVar.f32971a = f13;
            zmVar.f32972b = i14;
            float f14 = this.v;
            if (f13 < f14 || f13 > this.f24652w) {
                float f15 = f13 + b10;
                if ((f15 < f14 || f15 > this.f24652w) && (f13 > f14 || f15 < this.f24652w)) {
                    f7 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f7);
                    f13 += f7;
                    i14 = zmVar.f32978k.f31021g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = zmVar.h;
            int i15 = zmVar.f32979l;
            org.telegram.ui.ActionBar.f5 f5Var = zmVar.f32990x;
            an anVar = zmVar.f32992z;
            arrayList = arrayList2;
            float interpolation = zmVar.f32977j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - zmVar.f32973c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(zmVar.f32974f, zmVar.d, interpolation);
            int width = anVar.getWidth();
            bn bnVar2 = anVar.P;
            float previewScale = width * lerp * bnVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = bnVar2.getPreviewScale() * AndroidUtilities.lerp(zmVar.f32975g, zmVar.e, interpolation) * max;
            if (f5Var != null) {
                f10 = 2.0f;
                zmVar.f32983p = 0.0f;
                float width2 = anVar.getWidth();
                float f16 = i15;
                zmVar.f32981n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                zmVar.f32982o = (Math.max(f16, previewScale) + anVar.getWidth()) / 2.0f;
                zmVar.f32984q = Math.max(i15 * 2, previewScale2);
                zmVar.f32990x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                f5Var.setBounds((int) zmVar.f32981n, (int) zmVar.f32983p, (int) zmVar.f32982o, (int) zmVar.f32984q);
                if (zmVar.d <= 0.0f) {
                    f11 = 1.0f - interpolation;
                } else if (zmVar.f32974f <= 0.0f) {
                    f11 = interpolation;
                } else {
                    f11 = 1.0f;
                }
                f5Var.setAlpha((int) (f11 * 255.0f));
                f5Var.d(canvas, zmVar.f32991y, null);
                zmVar.f32983p += f16;
                zmVar.f32981n += f16;
                zmVar.f32984q -= f16;
                zmVar.f32982o -= f16;
            } else {
                f10 = 2.0f;
            }
            zmVar.f32985r = zmVar.f32982o - zmVar.f32981n;
            zmVar.f32986s = zmVar.f32984q - zmVar.f32983p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                ym ymVar2 = (ym) arrayList3.get(i16);
                if (ymVar2 != null && (((ymVar = bnVar2.J) == null || ymVar.f32672b != ymVar2.f32672b) && ymVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = zmVar.f32989w;
            RectF rectF = zmVar.f32987t;
            long j10 = zmVar.f32976i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (zmVar.f32988u == null || zmVar.v != j10) {
                    zmVar.v = j10;
                    zmVar.f32988u = new e11(ai.md.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + zmVar.f32988u.f25728c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f17 = zmVar.f32981n;
                float f18 = zmVar.f32985r;
                float f19 = f10;
                float z12 = com.google.android.gms.internal.play_billing.k3.z(f18, dp, f19, f17);
                i10 = size;
                float f20 = zmVar.f32983p;
                i11 = i13;
                float f21 = zmVar.f32986s;
                i12 = i14;
                rectF.set(z12, com.google.android.gms.internal.play_billing.k3.z(f21, dp2, f19, f20), org.telegram.messenger.g0.a(f18, dp, f19, f17), org.telegram.messenger.g0.a(f21, dp2, f19, f20));
                paint.setColor(1610612736);
                float f22 = dp2 / f19;
                canvas.drawRoundRect(rectF, f22, f22, paint);
                f7 = b10;
                zmVar.f32988u.c(AndroidUtilities.dp(14.0f) + (((zmVar.f32985r / f19) + zmVar.f32981n) - (dp / f19)), zmVar.f32983p + (zmVar.f32986s / f19), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f13 += f7;
            i14 = zmVar.f32978k.f31021g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.w0 w0Var = this.f24645a;
        w0Var.a0(f13, w0Var.getMeasuredHeight());
        if (w0Var.K()) {
            w0Var.A(canvas, true);
            w0Var.C(canvas, true);
        }
        w0Var.draw(canvas);
        canvas.restore();
        if (bnVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (bnVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.w0 w0Var = this.f24645a;
        w0Var.layout(0, 0, w0Var.getMeasuredWidth(), w0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f24645a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f24651s <= 0) {
            this.f24651s = org.telegram.messenger.g0.b(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f24651s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.an.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
