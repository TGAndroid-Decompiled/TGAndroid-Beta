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
public final class mm extends ViewGroup {
    public lm B;
    public km C;
    public float D;
    public float E;
    public float F;
    public float G;
    public final PointF H;
    public boolean I;
    public final m2.b J;
    public final im K;
    public int L;
    public final nm M;
    public final org.telegram.ui.Cells.v0 f27088a;
    public final ArrayList f27089b;
    public final HashMap f27090c;
    public HashMap d;
    public ArrayList e;
    public HashMap f27091f;
    public ArrayList h;
    public final int f27092n;
    public final int f27093r;
    public int f27094s;
    public float v;
    public float f27095w;
    public boolean[] f27096x;
    public long f27097y;

    public mm(nm nmVar, Context context) {
        super(context);
        this.M = nmVar;
        this.f27089b = new ArrayList();
        this.f27090c = new HashMap();
        this.f27092n = AndroidUtilities.dp(16.0f);
        this.f27093r = AndroidUtilities.dp(64.0f);
        this.f27094s = 0;
        this.f27096x = null;
        this.f27097y = 0L;
        this.B = null;
        this.C = null;
        this.D = 0.0f;
        this.H = new PointF();
        this.I = false;
        this.J = new m2.b(this, 16);
        this.K = new im(this);
        this.L = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, nmVar.f27298n, true);
        this.f27088a = v0Var;
        v0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(v0Var);
    }

    public final void a() {
        String str;
        this.d = this.M.M.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f27091f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f27089b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((lm) arrayList.get(i10)).f26787k.f25200g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.f27090c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f27091f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f27091f.put(key, value);
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
                                            this.f27091f.put(key2, value2);
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
        nm nmVar = this.M;
        km kmVar = nmVar.G;
        PointF pointF = this.H;
        if (kmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!nmVar.H) {
            RectF f10 = kmVar.f(kmVar.e());
            RectF f11 = nmVar.G.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f10.width() / 2.0f) + f11.left, nmVar.f27303y - ((nmVar.D - 0.5f) * nmVar.E), this.D);
            pointF.y = AndroidUtilities.lerp((f10.height() / 2.0f) + nmVar.G.f26330a.f26780a + f11.top, (nmVar.B - ((nmVar.C - 0.5f) * nmVar.F)) + nmVar.J, this.D);
            return pointF;
        } else {
            RectF f12 = kmVar.f(kmVar.e());
            RectF f13 = nmVar.G.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f12.width() / 2.0f) + f13.left, this.E, this.D / this.G);
            pointF.y = AndroidUtilities.lerp((f12.height() / 2.0f) + nmVar.G.f26330a.f26780a + f13.top, this.F, this.D / this.G);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f27089b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((lm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                km kmVar = (km) arrayList2.get(i11);
                ih.j jVar = kmVar.f26345s;
                if (jVar != null) {
                    jVar.b(kmVar.O.f26801z);
                    kmVar.f26345s = null;
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
                lm lmVar = new lm(this);
                lm.a(lmVar, new gm(this.M, arrayList3), false);
                arrayList.add(lmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        nm nmVar;
        lh.e1 e1Var;
        boolean z4;
        ArrayList arrayList = this.f27089b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f10 = this.f27092n;
        int computeVerticalScrollOffset = this.M.f27299r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - nmVar.getListTopPadding());
        this.f27095w = (e1Var.getMeasuredHeight() - nmVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((lm) arrayList.get(i10)).b() + f10;
            float f11 = this.v;
            if ((f10 >= f11 && f10 <= this.f27095w) || ((b10 >= f11 && b10 <= this.f27095w) || (f10 <= f11 && b10 >= this.f27095w))) {
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
        int i10 = this.f27092n + this.f27093r;
        ArrayList arrayList = this.f27089b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((lm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.v0 v0Var = this.f27088a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return v0Var.getMeasuredHeight() + i10;
    }

    public final void f(lm lmVar, MediaController.PhotoEntry photoEntry, int i10) {
        lm lmVar2;
        ArrayList arrayList = lmVar.f26787k.f25200g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (lmVar.f26787k.f25200g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) lmVar.f26787k.f25200g.get(10);
            lmVar.f26787k.f25200g.remove(10);
            ArrayList arrayList2 = this.f27089b;
            int indexOf = arrayList2.indexOf(lmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                if (i11 == arrayList2.size()) {
                    lmVar2 = null;
                } else {
                    lmVar2 = (lm) arrayList2.get(i11);
                }
                if (lmVar2 == null) {
                    lm lmVar3 = new lm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    lm.a(lmVar3, new gm(this.M, arrayList3), true);
                    invalidate();
                } else {
                    f(lmVar2, photoEntry2, 0);
                }
            }
        }
        lm.a(lmVar, lmVar.f26787k, true);
    }

    public final void g() {
        float f10 = this.f27092n;
        ArrayList arrayList = this.f27089b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            lm lmVar = (lm) arrayList.get(i11);
            float b10 = lmVar.b();
            lmVar.f26780a = f10;
            lmVar.f26781b = i10;
            f10 += b10;
            i10 += lmVar.f26787k.f25200g.size();
        }
    }

    public final void h() {
        nm nmVar = this.M;
        ValueAnimator valueAnimator = nmVar.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.D;
        this.G = f10;
        this.E = b10.x;
        this.F = b10.y;
        nmVar.H = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        nmVar.I = ofFloat;
        ofFloat.addUpdateListener(new hm(this, 1));
        nmVar.I.addListener(new a9(this, 9));
        nmVar.I.setDuration(200L);
        nmVar.I.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z4) {
        boolean z10;
        boolean z11;
        boolean z12;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f27091f;
        ArrayList arrayList = this.h;
        dm dmVar = chatAttachAlertPhotoLayout.D;
        li liVar = chatAttachAlertPhotoLayout.f24282b;
        ol olVar = chatAttachAlertPhotoLayout.B;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f22869p1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f22870q1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z4) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = olVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = olVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s5) {
                    int R = RecyclerView.R(childAt);
                    boolean z13 = dmVar.f24310f;
                    boolean z14 = dmVar.d;
                    if (z13 && R > chatAttachAlertPhotoLayout.J0) {
                        R--;
                    }
                    if (z14 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                        R--;
                    }
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                    if (liVar.N0 != 0 || liVar.E) {
                        s5Var.getCheckBox().setVisibility(8);
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
                        if (R == dmVar.h() - 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        s5Var.d(b02, z10, z11, z12, liVar.f26695f0);
                        if ((liVar.f26685c0 instanceof org.telegram.ui.zn) && liVar.Q1) {
                            s5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            s5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.M.f24282b.V1(1);
        }
    }

    @Override
    public final void invalidate() {
        int c3 = kf.k0.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f27094s != c3) {
            this.f27094s = c3;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f27089b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            lm lmVar = (lm) arrayList.get(i10);
            if (lmVar.f26787k.f25200g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - lmVar.f26787k.f25200g.size();
                lm lmVar2 = (lm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, lmVar2.f26787k.f25200g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) lmVar2.f26787k.f25200g.remove(0));
                }
                lmVar.f26787k.f25200g.addAll(arrayList2);
                lm.a(lmVar, lmVar.f26787k, true);
                lm.a(lmVar2, lmVar2.f26787k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        lh.e1 e1Var;
        float f10;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        boolean z4;
        km kmVar;
        float f11;
        float f12 = this.f27092n;
        nm nmVar = this.M;
        int computeVerticalScrollOffset = nmVar.f27299r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - nmVar.getListTopPadding());
        this.f27095w = (e1Var.getMeasuredHeight() - nmVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f12);
        ArrayList arrayList2 = this.f27089b;
        int size = arrayList2.size();
        float f13 = f12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            lm lmVar = (lm) arrayList2.get(i13);
            float b10 = lmVar.b();
            lmVar.f26780a = f13;
            lmVar.f26781b = i14;
            float f14 = this.v;
            if (f13 < f14 || f13 > this.f27095w) {
                float f15 = f13 + b10;
                if ((f15 < f14 || f15 > this.f27095w) && (f13 > f14 || f15 < this.f27095w)) {
                    f10 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f10);
                    f13 += f10;
                    i14 = lmVar.f26787k.f25200g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = lmVar.h;
            int i15 = lmVar.f26788l;
            org.telegram.ui.ActionBar.g5 g5Var = lmVar.f26799x;
            mm mmVar = lmVar.f26801z;
            arrayList = arrayList2;
            float interpolation = lmVar.f26786j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - lmVar.f26782c)) / 200.0f));
            if (interpolation < 1.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(lmVar.f26783f, lmVar.d, interpolation);
            int width = mmVar.getWidth();
            nm nmVar2 = mmVar.M;
            float previewScale = width * lerp * nmVar2.getPreviewScale();
            boolean z10 = z4;
            float previewScale2 = nmVar2.getPreviewScale() * AndroidUtilities.lerp(lmVar.f26784g, lmVar.e, interpolation) * max;
            if (g5Var != null) {
                lmVar.f26792p = 0.0f;
                float width2 = mmVar.getWidth();
                float f16 = i15;
                lmVar.f26790n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                lmVar.f26791o = (Math.max(f16, previewScale) + mmVar.getWidth()) / 2.0f;
                lmVar.f26793q = Math.max(i15 * 2, previewScale2);
                lmVar.f26799x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                g5Var.setBounds((int) lmVar.f26790n, (int) lmVar.f26792p, (int) lmVar.f26791o, (int) lmVar.f26793q);
                if (lmVar.d <= 0.0f) {
                    f11 = 1.0f - interpolation;
                } else if (lmVar.f26783f <= 0.0f) {
                    f11 = interpolation;
                } else {
                    f11 = 1.0f;
                }
                g5Var.setAlpha((int) (f11 * 255.0f));
                g5Var.d(canvas, lmVar.f26800y, null);
                lmVar.f26792p += f16;
                lmVar.f26790n += f16;
                lmVar.f26793q -= f16;
                lmVar.f26791o -= f16;
            }
            lmVar.f26794r = lmVar.f26791o - lmVar.f26790n;
            lmVar.f26795s = lmVar.f26793q - lmVar.f26792p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                km kmVar2 = (km) arrayList3.get(i16);
                if (kmVar2 != null && (((kmVar = nmVar2.G) == null || kmVar.f26331b != kmVar2.f26331b) && kmVar2.c(canvas, false))) {
                    z10 = true;
                }
            }
            Paint paint = lmVar.f26798w;
            RectF rectF = lmVar.f26796t;
            long j10 = lmVar.f26785i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f10 = b10;
            } else {
                if (lmVar.f26797u == null || lmVar.v != j10) {
                    lmVar.v = j10;
                    lmVar.f26797u = new k01(lh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + lmVar.f26797u.f26124c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f17 = lmVar.f26790n;
                float f18 = lmVar.f26794r;
                float x10 = e2.c.x(f18, dp, 2.0f, f17);
                i10 = size;
                float f19 = lmVar.f26792p;
                i11 = i13;
                float f20 = lmVar.f26795s;
                i12 = i14;
                rectF.set(x10, e2.c.x(f20, dp2, 2.0f, f19), kf.k0.b(f18, dp, 2.0f, f17), kf.k0.b(f20, dp2, 2.0f, f19));
                paint.setColor(1610612736);
                float f21 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f21, f21, paint);
                f10 = b10;
                lmVar.f26797u.c(AndroidUtilities.dp(14.0f) + (((lmVar.f26794r / 2.0f) + lmVar.f26790n) - (dp / 2.0f)), lmVar.f26792p + (lmVar.f26795s / 2.0f), 1.0f, -1, canvas);
            }
            if (z10) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f13 += f10;
            i14 = lmVar.f26787k.f25200g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.v0 v0Var = this.f27088a;
        v0Var.W(f13, v0Var.getMeasuredHeight());
        if (v0Var.I()) {
            v0Var.y(canvas, true);
            v0Var.B(canvas, true);
        }
        v0Var.draw(canvas);
        canvas.restore();
        if (nmVar.G != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (nmVar.G.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.v0 v0Var = this.f27088a;
        v0Var.layout(0, 0, v0Var.getMeasuredWidth(), v0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f27088a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f27094s <= 0) {
            this.f27094s = kf.k0.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f27094s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mm.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
