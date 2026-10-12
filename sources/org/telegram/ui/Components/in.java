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
public final class in extends ViewGroup {
    public hn E;
    public gn F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final org.telegram.ui.Cells.l7 M;
    public final en N;
    public int O;
    public final jn P;
    public final org.telegram.ui.Cells.w0 f27226a;
    public final ArrayList f27227b;
    public final HashMap f27228c;
    public HashMap d;
    public ArrayList f27229e;
    public HashMap f27230f;
    public ArrayList h;
    public final int f27231n;
    public final int f27232r;
    public int f27233s;
    public float v;
    public float f27234w;
    public boolean[] f27235x;
    public long f27236y;

    public in(jn jnVar, Context context) {
        super(context);
        this.P = jnVar;
        this.f27227b = new ArrayList();
        this.f27228c = new HashMap();
        this.f27231n = AndroidUtilities.dp(16.0f);
        this.f27232r = AndroidUtilities.dp(64.0f);
        this.f27233s = 0;
        this.f27235x = null;
        this.f27236y = 0L;
        this.E = null;
        this.F = null;
        this.G = 0.0f;
        this.K = new PointF();
        this.L = false;
        this.M = new org.telegram.ui.Cells.l7(this, 6);
        this.N = new en(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, jnVar.f27565n, true);
        this.f27226a = w0Var;
        w0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(w0Var);
    }

    public final void a() {
        String str;
        this.d = this.P.P.getSelectedPhotos();
        this.f27229e = new ArrayList(this.d.entrySet());
        this.f27230f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f27227b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((hn) arrayList.get(i10)).f26809k.f24963g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.f27228c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f27230f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.f27229e.size()) {
                                Map.Entry entry = (Map.Entry) this.f27229e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f27230f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i12++;
                            } else {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < this.f27229e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.f27229e.get(i13);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof MediaController.PhotoEntry) && (str = ((MediaController.PhotoEntry) value2).path) != null && photoEntry != null && str.equals(photoEntry.path)) {
                                            Object key2 = entry2.getKey();
                                            this.f27230f.put(key2, value2);
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
        jn jnVar = this.P;
        gn gnVar = jnVar.J;
        PointF pointF = this.K;
        if (gnVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!jnVar.K) {
            RectF f7 = gnVar.f(gnVar.e());
            RectF f10 = jnVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, jnVar.f27570y - ((jnVar.G - 0.5f) * jnVar.H), this.G);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + jnVar.J.f26457a.f26801a + f10.top, (jnVar.E - ((jnVar.F - 0.5f) * jnVar.I)) + jnVar.M, this.G);
            return pointF;
        } else {
            RectF f11 = gnVar.f(gnVar.e());
            RectF f12 = jnVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + jnVar.J.f26457a.f26801a + f12.top, this.I, this.G / this.J);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f27227b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((hn) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                gn gnVar = (gn) arrayList2.get(i11);
                vh.f fVar = gnVar.f26473s;
                if (fVar != null) {
                    fVar.b(gnVar.O.f26823z);
                    gnVar.f26473s = null;
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
                hn hnVar = new hn(this);
                hn.a(hnVar, new cn(this.P, arrayList3), false);
                arrayList.add(hnVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        jn jnVar;
        ai.w0 w0Var;
        boolean z10;
        ArrayList arrayList = this.f27227b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f7 = this.f27231n;
        int computeVerticalScrollOffset = this.P.f27566r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - jnVar.getListTopPadding());
        this.f27234w = (w0Var.getMeasuredHeight() - jnVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((hn) arrayList.get(i10)).b() + f7;
            float f10 = this.v;
            if ((f7 >= f10 && f7 <= this.f27234w) || ((b10 >= f10 && b10 <= this.f27234w) || (f7 <= f10 && b10 >= this.f27234w))) {
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
        int i10 = this.f27231n + this.f27232r;
        ArrayList arrayList = this.f27227b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((hn) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.w0 w0Var = this.f27226a;
        if (w0Var.getMeasuredHeight() <= 0) {
            w0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return w0Var.getMeasuredHeight() + i10;
    }

    public final void f(hn hnVar, MediaController.PhotoEntry photoEntry, int i10) {
        hn hnVar2;
        ArrayList arrayList = hnVar.f26809k.f24963g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (hnVar.f26809k.f24963g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) hnVar.f26809k.f24963g.get(10);
            hnVar.f26809k.f24963g.remove(10);
            ArrayList arrayList2 = this.f27227b;
            int indexOf = arrayList2.indexOf(hnVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                if (i11 == arrayList2.size()) {
                    hnVar2 = null;
                } else {
                    hnVar2 = (hn) arrayList2.get(i11);
                }
                if (hnVar2 == null) {
                    hn hnVar3 = new hn(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    hn.a(hnVar3, new cn(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(hnVar2, photoEntry2, 0);
                }
            }
        }
        hn.a(hnVar, hnVar.f26809k, true);
    }

    public final void g() {
        float f7 = this.f27231n;
        ArrayList arrayList = this.f27227b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            hn hnVar = (hn) arrayList.get(i11);
            float b10 = hnVar.b();
            hnVar.f26801a = f7;
            hnVar.f26802b = i10;
            f7 += b10;
            i10 += hnVar.f26809k.f24963g.size();
        }
    }

    public final void h() {
        jn jnVar = this.P;
        ValueAnimator valueAnimator = jnVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        jnVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        jnVar.L = ofFloat;
        ofFloat.addUpdateListener(new dn(this, 1));
        jnVar.L.addListener(new t8(this, 10));
        jnVar.L.setDuration(200L);
        jnVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f27230f;
        ArrayList arrayList = this.h;
        an anVar = chatAttachAlertPhotoLayout.G;
        aj ajVar = chatAttachAlertPhotoLayout.f30570b;
        mm mmVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f23801s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f23802t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            boolean z15 = false;
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = mmVar.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = mmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z16 = anVar.f24437f;
                    boolean z17 = anVar.d;
                    if (z16 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z17 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (ajVar.T0 != 0 || ajVar.H) {
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
                        if (R == anVar.h() - 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        t5Var.d(b02, z12, z13, z14, ajVar.f24347i0);
                        if ((ajVar.f24338f0 instanceof org.telegram.ui.eo) && ajVar.W1) {
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
            this.P.f30570b.Z1(1);
        }
    }

    @Override
    public final void invalidate() {
        int f7 = hg.c.f(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f27233s != f7) {
            this.f27233s = f7;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f27227b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            hn hnVar = (hn) arrayList.get(i10);
            if (hnVar.f26809k.f24963g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - hnVar.f26809k.f24963g.size();
                hn hnVar2 = (hn) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, hnVar2.f26809k.f24963g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) hnVar2.f26809k.f24963g.remove(0));
                }
                hnVar.f26809k.f24963g.addAll(arrayList2);
                hn.a(hnVar, hnVar.f26809k, true);
                hn.a(hnVar2, hnVar2.f26809k, true);
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
        float f10;
        gn gnVar;
        float f11;
        float f12 = this.f27231n;
        jn jnVar = this.P;
        int computeVerticalScrollOffset = jnVar.f27566r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - jnVar.getListTopPadding());
        this.f27234w = (w0Var.getMeasuredHeight() - jnVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f12);
        ArrayList arrayList2 = this.f27227b;
        int size = arrayList2.size();
        float f13 = f12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            hn hnVar = (hn) arrayList2.get(i13);
            float b10 = hnVar.b();
            hnVar.f26801a = f13;
            hnVar.f26802b = i14;
            float f14 = this.v;
            if (f13 < f14 || f13 > this.f27234w) {
                float f15 = f13 + b10;
                if ((f15 < f14 || f15 > this.f27234w) && (f13 > f14 || f15 < this.f27234w)) {
                    f7 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f7);
                    f13 += f7;
                    i14 = hnVar.f26809k.f24963g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = hnVar.h;
            int i15 = hnVar.f26810l;
            org.telegram.ui.ActionBar.d5 d5Var = hnVar.f26821x;
            in inVar = hnVar.f26823z;
            arrayList = arrayList2;
            float interpolation = hnVar.f26808j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - hnVar.f26803c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(hnVar.f26805f, hnVar.d, interpolation);
            int width = inVar.getWidth();
            jn jnVar2 = inVar.P;
            float previewScale = width * lerp * jnVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = jnVar2.getPreviewScale() * AndroidUtilities.lerp(hnVar.f26806g, hnVar.f26804e, interpolation) * max;
            if (d5Var != null) {
                f10 = 2.0f;
                hnVar.f26814p = 0.0f;
                float width2 = inVar.getWidth();
                float f16 = i15;
                hnVar.f26812n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                hnVar.f26813o = (Math.max(f16, previewScale) + inVar.getWidth()) / 2.0f;
                hnVar.f26815q = Math.max(i15 * 2, previewScale2);
                hnVar.f26821x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                d5Var.setBounds((int) hnVar.f26812n, (int) hnVar.f26814p, (int) hnVar.f26813o, (int) hnVar.f26815q);
                if (hnVar.d <= 0.0f) {
                    f11 = 1.0f - interpolation;
                } else if (hnVar.f26805f <= 0.0f) {
                    f11 = interpolation;
                } else {
                    f11 = 1.0f;
                }
                d5Var.setAlpha((int) (f11 * 255.0f));
                d5Var.d(canvas, hnVar.f26822y, null);
                hnVar.f26814p += f16;
                hnVar.f26812n += f16;
                hnVar.f26815q -= f16;
                hnVar.f26813o -= f16;
            } else {
                f10 = 2.0f;
            }
            hnVar.f26816r = hnVar.f26813o - hnVar.f26812n;
            hnVar.f26817s = hnVar.f26815q - hnVar.f26814p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                gn gnVar2 = (gn) arrayList3.get(i16);
                if (gnVar2 != null && (((gnVar = jnVar2.J) == null || gnVar.f26458b != gnVar2.f26458b) && gnVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = hnVar.f26820w;
            RectF rectF = hnVar.f26818t;
            long j3 = hnVar.f26807i;
            if (j3 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (hnVar.f26819u == null || hnVar.v != j3) {
                    hnVar.v = j3;
                    hnVar.f26819u = new r11(yh.p7.Y0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j3), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + hnVar.f26819u.f29989c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f17 = hnVar.f26812n;
                float f18 = hnVar.f26816r;
                float f19 = f10;
                float z12 = com.google.android.gms.internal.vision.e2.z(f18, dp, f19, f17);
                i10 = size;
                float f20 = hnVar.f26814p;
                i11 = i13;
                float f21 = hnVar.f26817s;
                i12 = i14;
                rectF.set(z12, com.google.android.gms.internal.vision.e2.z(f21, dp2, f19, f20), org.telegram.messenger.v0.a(f18, dp, f19, f17), org.telegram.messenger.v0.a(f21, dp2, f19, f20));
                paint.setColor(1610612736);
                float f22 = dp2 / f19;
                canvas.drawRoundRect(rectF, f22, f22, paint);
                f7 = b10;
                hnVar.f26819u.c(AndroidUtilities.dp(14.0f) + (((hnVar.f26816r / f19) + hnVar.f26812n) - (dp / f19)), hnVar.f26814p + (hnVar.f26817s / f19), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f13 += f7;
            i14 = hnVar.f26809k.f24963g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.w0 w0Var2 = this.f27226a;
        w0Var2.a0(f13, w0Var2.getMeasuredHeight());
        if (w0Var2.K()) {
            w0Var2.A(canvas, true);
            w0Var2.D(canvas, true);
        }
        w0Var2.draw(canvas);
        canvas.restore();
        if (jnVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (jnVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.w0 w0Var = this.f27226a;
        w0Var.layout(0, 0, w0Var.getMeasuredWidth(), w0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f27226a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f27233s <= 0) {
            this.f27233s = hg.c.f(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f27233s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.in.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
