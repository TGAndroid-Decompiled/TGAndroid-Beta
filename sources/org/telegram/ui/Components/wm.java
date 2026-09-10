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
public final class wm extends ViewGroup {
    public vm E;
    public um F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.l9 M;
    public final sm N;
    public int O;
    public final xm P;
    public final org.telegram.ui.Cells.w0 f28791a;
    public final ArrayList f28792b;
    public final HashMap f28793c;
    public HashMap d;
    public ArrayList e;
    public HashMap f28794f;
    public ArrayList h;
    public final int f28795n;
    public final int f28796r;
    public int f28797s;
    public float v;
    public float f28798w;
    public boolean[] f28799x;
    public long f28800y;

    public wm(xm xmVar, Context context) {
        super(context);
        this.P = xmVar;
        this.f28792b = new ArrayList();
        this.f28793c = new HashMap();
        this.f28795n = AndroidUtilities.dp(16.0f);
        this.f28796r = AndroidUtilities.dp(64.0f);
        this.f28797s = 0;
        this.f28799x = null;
        this.f28800y = 0L;
        this.E = null;
        this.F = null;
        this.G = 0.0f;
        this.K = new PointF();
        this.L = false;
        this.M = new org.telegram.ui.Cells.l9(this, 5);
        this.N = new sm(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, xmVar.f29079n, true);
        this.f28791a = w0Var;
        w0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(w0Var);
    }

    public final void a() {
        String str;
        this.d = this.P.P.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f28794f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f28792b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((vm) arrayList.get(i10)).f28015k.f26212g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.f28793c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f28794f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f28794f.put(key, value);
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
                                            this.f28794f.put(key2, value2);
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
        xm xmVar = this.P;
        um umVar = xmVar.J;
        PointF pointF = this.K;
        if (umVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!xmVar.K) {
            RectF f7 = umVar.f(umVar.e());
            RectF f10 = xmVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, xmVar.f29084y - ((xmVar.G - 0.5f) * xmVar.H), this.G);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + xmVar.J.f27697a.f28008a + f10.top, (xmVar.E - ((xmVar.F - 0.5f) * xmVar.I)) + xmVar.M, this.G);
            return pointF;
        } else {
            RectF f11 = umVar.f(umVar.e());
            RectF f12 = xmVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + xmVar.J.f27697a.f28008a + f12.top, this.I, this.G / this.J);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f28792b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((vm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                um umVar = (um) arrayList2.get(i11);
                uh.g gVar = umVar.f27712s;
                if (gVar != null) {
                    gVar.b(umVar.O.f28029z);
                    umVar.f27712s = null;
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
                vm vmVar = new vm(this);
                vm.a(vmVar, new pm(this.P, arrayList3), false);
                arrayList.add(vmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        xm xmVar;
        bi.y1 y1Var;
        boolean z10;
        ArrayList arrayList = this.f28792b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f7 = this.f28795n;
        int computeVerticalScrollOffset = this.P.f29080r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - xmVar.getListTopPadding());
        this.f28798w = (y1Var.getMeasuredHeight() - xmVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((vm) arrayList.get(i10)).b() + f7;
            float f10 = this.v;
            if ((f7 >= f10 && f7 <= this.f28798w) || ((b10 >= f10 && b10 <= this.f28798w) || (f7 <= f10 && b10 >= this.f28798w))) {
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
        int i10 = this.f28795n + this.f28796r;
        ArrayList arrayList = this.f28792b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((vm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.w0 w0Var = this.f28791a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return w0Var.getMeasuredHeight() + i10;
    }

    public final void f(vm vmVar, MediaController.PhotoEntry photoEntry, int i10) {
        vm vmVar2;
        ArrayList arrayList = vmVar.f28015k.f26212g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (vmVar.f28015k.f26212g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) vmVar.f28015k.f26212g.get(10);
            vmVar.f28015k.f26212g.remove(10);
            ArrayList arrayList2 = this.f28792b;
            int indexOf = arrayList2.indexOf(vmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                if (i11 == arrayList2.size()) {
                    vmVar2 = null;
                } else {
                    vmVar2 = (vm) arrayList2.get(i11);
                }
                if (vmVar2 == null) {
                    vm vmVar3 = new vm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    vm.a(vmVar3, new pm(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(vmVar2, photoEntry2, 0);
                }
            }
        }
        vm.a(vmVar, vmVar.f28015k, true);
    }

    public final void g() {
        float f7 = this.f28795n;
        ArrayList arrayList = this.f28792b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            vm vmVar = (vm) arrayList.get(i11);
            float b10 = vmVar.b();
            vmVar.f28008a = f7;
            vmVar.f28009b = i10;
            f7 += b10;
            i10 += vmVar.f28015k.f26212g.size();
        }
    }

    public final void h() {
        xm xmVar = this.P;
        ValueAnimator valueAnimator = xmVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        xmVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        xmVar.L = ofFloat;
        ofFloat.addUpdateListener(new qm(this, 1));
        xmVar.L.addListener(new rm(this, 0));
        xmVar.L.setDuration(200L);
        xmVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f28794f;
        ArrayList arrayList = this.h;
        nm nmVar = chatAttachAlertPhotoLayout.G;
        yi yiVar = chatAttachAlertPhotoLayout.f26422b;
        yl ylVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f20985s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f20986t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = ylVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ylVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z14 = nmVar.f25556f;
                    boolean z15 = nmVar.d;
                    if (z14 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (yiVar.Q0 != 0 || yiVar.H) {
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
                        if (R == nmVar.h() - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        t5Var.d(b02, z11, z12, z13, yiVar.f29375i0);
                        if ((yiVar.f29366f0 instanceof org.telegram.ui.eo) && yiVar.T1) {
                            t5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            t5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.P.f26422b.V1(1);
        }
    }

    @Override
    public final void invalidate() {
        int g10 = hc.b.g(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), e());
        if (this.f28797s != g10) {
            this.f28797s = g10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f28792b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            vm vmVar = (vm) arrayList.get(i10);
            if (vmVar.f28015k.f26212g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - vmVar.f28015k.f26212g.size();
                vm vmVar2 = (vm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, vmVar2.f28015k.f26212g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) vmVar2.f28015k.f26212g.remove(0));
                }
                vmVar.f28015k.f26212g.addAll(arrayList2);
                vm.a(vmVar, vmVar.f28015k, true);
                vm.a(vmVar2, vmVar2.f28015k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bi.y1 y1Var;
        float f7;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        boolean z10;
        um umVar;
        float f10;
        float f11 = this.f28795n;
        xm xmVar = this.P;
        int computeVerticalScrollOffset = xmVar.f29080r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - xmVar.getListTopPadding());
        this.f28798w = (y1Var.getMeasuredHeight() - xmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList2 = this.f28792b;
        int size = arrayList2.size();
        float f12 = f11;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            vm vmVar = (vm) arrayList2.get(i13);
            float b10 = vmVar.b();
            vmVar.f28008a = f12;
            vmVar.f28009b = i14;
            float f13 = this.v;
            if (f12 < f13 || f12 > this.f28798w) {
                float f14 = f12 + b10;
                if ((f14 < f13 || f14 > this.f28798w) && (f12 > f13 || f14 < this.f28798w)) {
                    f7 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f7);
                    f12 += f7;
                    i14 = vmVar.f28015k.f26212g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = vmVar.h;
            int i15 = vmVar.f28016l;
            org.telegram.ui.ActionBar.h5 h5Var = vmVar.f28027x;
            wm wmVar = vmVar.f28029z;
            arrayList = arrayList2;
            float interpolation = vmVar.f28014j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - vmVar.f28010c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(vmVar.f28011f, vmVar.d, interpolation);
            int width = wmVar.getWidth();
            xm xmVar2 = wmVar.P;
            float previewScale = width * lerp * xmVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = xmVar2.getPreviewScale() * AndroidUtilities.lerp(vmVar.f28012g, vmVar.e, interpolation) * max;
            if (h5Var != null) {
                vmVar.f28020p = 0.0f;
                float width2 = wmVar.getWidth();
                float f15 = i15;
                vmVar.f28018n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                vmVar.f28019o = (Math.max(f15, previewScale) + wmVar.getWidth()) / 2.0f;
                vmVar.f28021q = Math.max(i15 * 2, previewScale2);
                vmVar.f28027x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                h5Var.setBounds((int) vmVar.f28018n, (int) vmVar.f28020p, (int) vmVar.f28019o, (int) vmVar.f28021q);
                if (vmVar.d <= 0.0f) {
                    f10 = 1.0f - interpolation;
                } else if (vmVar.f28011f <= 0.0f) {
                    f10 = interpolation;
                } else {
                    f10 = 1.0f;
                }
                h5Var.setAlpha((int) (f10 * 255.0f));
                h5Var.d(canvas, vmVar.f28028y, null);
                vmVar.f28020p += f15;
                vmVar.f28018n += f15;
                vmVar.f28021q -= f15;
                vmVar.f28019o -= f15;
            }
            vmVar.f28022r = vmVar.f28019o - vmVar.f28018n;
            vmVar.f28023s = vmVar.f28021q - vmVar.f28020p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                um umVar2 = (um) arrayList3.get(i16);
                if (umVar2 != null && (((umVar = xmVar2.J) == null || umVar.f27698b != umVar2.f27698b) && umVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = vmVar.f28026w;
            RectF rectF = vmVar.f28024t;
            long j3 = vmVar.f28013i;
            if (j3 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (vmVar.f28025u == null || vmVar.v != j3) {
                    vmVar.v = j3;
                    vmVar.f28025u = new t01(xh.z7.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + vmVar.f28025u.f27247c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f16 = vmVar.f28018n;
                float f17 = vmVar.f28022r;
                float A = com.google.android.gms.internal.vision.e2.A(f17, dp, 2.0f, f16);
                i10 = size;
                float f18 = vmVar.f28020p;
                i11 = i13;
                float f19 = vmVar.f28023s;
                i12 = i14;
                rectF.set(A, com.google.android.gms.internal.vision.e2.A(f19, dp2, 2.0f, f18), org.telegram.messenger.a2.a(f17, dp, 2.0f, f16), org.telegram.messenger.a2.a(f19, dp2, 2.0f, f18));
                paint.setColor(1610612736);
                float f20 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f20, f20, paint);
                f7 = b10;
                vmVar.f28025u.c(AndroidUtilities.dp(14.0f) + (((vmVar.f28022r / 2.0f) + vmVar.f28018n) - (dp / 2.0f)), vmVar.f28020p + (vmVar.f28023s / 2.0f), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f12 += f7;
            i14 = vmVar.f28015k.f26212g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.w0 w0Var = this.f28791a;
        w0Var.W(f12, w0Var.getMeasuredHeight());
        if (w0Var.J()) {
            w0Var.y(canvas, true);
            w0Var.A(canvas, true);
        }
        w0Var.draw(canvas);
        canvas.restore();
        if (xmVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (xmVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.w0 w0Var = this.f28791a;
        w0Var.layout(0, 0, w0Var.getMeasuredWidth(), w0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f28791a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f28797s <= 0) {
            this.f28797s = hc.b.g(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f28797s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wm.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
