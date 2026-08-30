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
public final class nm extends ViewGroup {
    public mm B;
    public lm C;
    public float D;
    public float E;
    public float F;
    public float G;
    public final PointF H;
    public boolean I;
    public final m2.b J;
    public final jm K;
    public int L;
    public final om M;
    public final org.telegram.ui.Cells.v0 f27314a;
    public final ArrayList f27315b;
    public final HashMap f27316c;
    public HashMap d;
    public ArrayList e;
    public HashMap f27317f;
    public ArrayList h;
    public final int f27318n;
    public final int f27319r;
    public int f27320s;
    public float v;
    public float f27321w;
    public boolean[] f27322x;
    public long f27323y;

    public nm(om omVar, Context context) {
        super(context);
        this.M = omVar;
        this.f27315b = new ArrayList();
        this.f27316c = new HashMap();
        this.f27318n = AndroidUtilities.dp(16.0f);
        this.f27319r = AndroidUtilities.dp(64.0f);
        this.f27320s = 0;
        this.f27322x = null;
        this.f27323y = 0L;
        this.B = null;
        this.C = null;
        this.D = 0.0f;
        this.H = new PointF();
        this.I = false;
        this.J = new m2.b(this, 16);
        this.K = new jm(this);
        this.L = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, omVar.f27590n, true);
        this.f27314a = v0Var;
        v0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(v0Var);
    }

    public final void a() {
        String str;
        this.d = this.M.M.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f27317f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f27315b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((mm) arrayList.get(i10)).f27060k.f25197g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.f27316c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f27317f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f27317f.put(key, value);
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
                                            this.f27317f.put(key2, value2);
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
        om omVar = this.M;
        lm lmVar = omVar.G;
        PointF pointF = this.H;
        if (lmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!omVar.H) {
            RectF f10 = lmVar.f(lmVar.e());
            RectF f11 = omVar.G.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f10.width() / 2.0f) + f11.left, omVar.f27595y - ((omVar.D - 0.5f) * omVar.E), this.D);
            pointF.y = AndroidUtilities.lerp((f10.height() / 2.0f) + omVar.G.f26790a.f27053a + f11.top, (omVar.B - ((omVar.C - 0.5f) * omVar.F)) + omVar.J, this.D);
            return pointF;
        } else {
            RectF f12 = lmVar.f(lmVar.e());
            RectF f13 = omVar.G.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f12.width() / 2.0f) + f13.left, this.E, this.D / this.G);
            pointF.y = AndroidUtilities.lerp((f12.height() / 2.0f) + omVar.G.f26790a.f27053a + f13.top, this.F, this.D / this.G);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f27315b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((mm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                lm lmVar = (lm) arrayList2.get(i11);
                ih.j jVar = lmVar.f26805s;
                if (jVar != null) {
                    jVar.b(lmVar.O.f27074z);
                    lmVar.f26805s = null;
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
                mm mmVar = new mm(this);
                mm.a(mmVar, new gm(this.M, arrayList3), false);
                arrayList.add(mmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        om omVar;
        lh.e1 e1Var;
        boolean z4;
        ArrayList arrayList = this.f27315b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f10 = this.f27318n;
        int computeVerticalScrollOffset = this.M.f27591r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - omVar.getListTopPadding());
        this.f27321w = (e1Var.getMeasuredHeight() - omVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((mm) arrayList.get(i10)).b() + f10;
            float f11 = this.v;
            if ((f10 >= f11 && f10 <= this.f27321w) || ((b10 >= f11 && b10 <= this.f27321w) || (f10 <= f11 && b10 >= this.f27321w))) {
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
        int i10 = this.f27318n + this.f27319r;
        ArrayList arrayList = this.f27315b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((mm) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.v0 v0Var = this.f27314a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return v0Var.getMeasuredHeight() + i10;
    }

    public final void f(mm mmVar, MediaController.PhotoEntry photoEntry, int i10) {
        mm mmVar2;
        ArrayList arrayList = mmVar.f27060k.f25197g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (mmVar.f27060k.f25197g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) mmVar.f27060k.f25197g.get(10);
            mmVar.f27060k.f25197g.remove(10);
            ArrayList arrayList2 = this.f27315b;
            int indexOf = arrayList2.indexOf(mmVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                if (i11 == arrayList2.size()) {
                    mmVar2 = null;
                } else {
                    mmVar2 = (mm) arrayList2.get(i11);
                }
                if (mmVar2 == null) {
                    mm mmVar3 = new mm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    mm.a(mmVar3, new gm(this.M, arrayList3), true);
                    invalidate();
                } else {
                    f(mmVar2, photoEntry2, 0);
                }
            }
        }
        mm.a(mmVar, mmVar.f27060k, true);
    }

    public final void g() {
        float f10 = this.f27318n;
        ArrayList arrayList = this.f27315b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            mm mmVar = (mm) arrayList.get(i11);
            float b10 = mmVar.b();
            mmVar.f27053a = f10;
            mmVar.f27054b = i10;
            f10 += b10;
            i10 += mmVar.f27060k.f25197g.size();
        }
    }

    public final void h() {
        om omVar = this.M;
        ValueAnimator valueAnimator = omVar.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f10 = this.D;
        this.G = f10;
        this.E = b10.x;
        this.F = b10.y;
        omVar.H = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
        omVar.I = ofFloat;
        ofFloat.addUpdateListener(new im(this, 1));
        omVar.I.addListener(new a9(this, 9));
        omVar.I.setDuration(200L);
        omVar.I.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z4) {
        boolean z10;
        boolean z11;
        boolean z12;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f27317f;
        ArrayList arrayList = this.h;
        em emVar = chatAttachAlertPhotoLayout.D;
        li liVar = chatAttachAlertPhotoLayout.f24278b;
        pl plVar = chatAttachAlertPhotoLayout.B;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f22896p1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f22897q1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z4) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = plVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = plVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t5) {
                    int R = RecyclerView.R(childAt);
                    boolean z13 = emVar.f24601f;
                    boolean z14 = emVar.d;
                    if (z13 && R > chatAttachAlertPhotoLayout.J0) {
                        R--;
                    }
                    if (z14 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                        R--;
                    }
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                    if (liVar.N0 != 0 || liVar.E) {
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
                        if (R == emVar.h() - 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        t5Var.d(b02, z10, z11, z12, liVar.f26699f0);
                        if ((liVar.f26689c0 instanceof org.telegram.ui.xn) && liVar.Q1) {
                            t5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            t5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.M.f24278b.V1(1);
        }
    }

    @Override
    public final void invalidate() {
        int c3 = kh.a2.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f27320s != c3) {
            this.f27320s = c3;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f27315b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            mm mmVar = (mm) arrayList.get(i10);
            if (mmVar.f27060k.f25197g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - mmVar.f27060k.f25197g.size();
                mm mmVar2 = (mm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, mmVar2.f27060k.f25197g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) mmVar2.f27060k.f25197g.remove(0));
                }
                mmVar.f27060k.f25197g.addAll(arrayList2);
                mm.a(mmVar, mmVar.f27060k, true);
                mm.a(mmVar2, mmVar2.f27060k, true);
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
        lm lmVar;
        float f11;
        float f12 = this.f27318n;
        om omVar = this.M;
        int computeVerticalScrollOffset = omVar.f27591r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - omVar.getListTopPadding());
        this.f27321w = (e1Var.getMeasuredHeight() - omVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f12);
        ArrayList arrayList2 = this.f27315b;
        int size = arrayList2.size();
        float f13 = f12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            mm mmVar = (mm) arrayList2.get(i13);
            float b10 = mmVar.b();
            mmVar.f27053a = f13;
            mmVar.f27054b = i14;
            float f14 = this.v;
            if (f13 < f14 || f13 > this.f27321w) {
                float f15 = f13 + b10;
                if ((f15 < f14 || f15 > this.f27321w) && (f13 > f14 || f15 < this.f27321w)) {
                    f10 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f10);
                    f13 += f10;
                    i14 = mmVar.f27060k.f25197g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = mmVar.h;
            int i15 = mmVar.f27061l;
            org.telegram.ui.ActionBar.g5 g5Var = mmVar.f27072x;
            nm nmVar = mmVar.f27074z;
            arrayList = arrayList2;
            float interpolation = mmVar.f27059j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - mmVar.f27055c)) / 200.0f));
            if (interpolation < 1.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(mmVar.f27056f, mmVar.d, interpolation);
            int width = nmVar.getWidth();
            om omVar2 = nmVar.M;
            float previewScale = width * lerp * omVar2.getPreviewScale();
            boolean z10 = z4;
            float previewScale2 = omVar2.getPreviewScale() * AndroidUtilities.lerp(mmVar.f27057g, mmVar.e, interpolation) * max;
            if (g5Var != null) {
                mmVar.f27065p = 0.0f;
                float width2 = nmVar.getWidth();
                float f16 = i15;
                mmVar.f27063n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                mmVar.f27064o = (Math.max(f16, previewScale) + nmVar.getWidth()) / 2.0f;
                mmVar.f27066q = Math.max(i15 * 2, previewScale2);
                mmVar.f27072x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                g5Var.setBounds((int) mmVar.f27063n, (int) mmVar.f27065p, (int) mmVar.f27064o, (int) mmVar.f27066q);
                if (mmVar.d <= 0.0f) {
                    f11 = 1.0f - interpolation;
                } else if (mmVar.f27056f <= 0.0f) {
                    f11 = interpolation;
                } else {
                    f11 = 1.0f;
                }
                g5Var.setAlpha((int) (f11 * 255.0f));
                g5Var.d(canvas, mmVar.f27073y, null);
                mmVar.f27065p += f16;
                mmVar.f27063n += f16;
                mmVar.f27066q -= f16;
                mmVar.f27064o -= f16;
            }
            mmVar.f27067r = mmVar.f27064o - mmVar.f27063n;
            mmVar.f27068s = mmVar.f27066q - mmVar.f27065p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                lm lmVar2 = (lm) arrayList3.get(i16);
                if (lmVar2 != null && (((lmVar = omVar2.G) == null || lmVar.f26791b != lmVar2.f26791b) && lmVar2.c(canvas, false))) {
                    z10 = true;
                }
            }
            Paint paint = mmVar.f27071w;
            RectF rectF = mmVar.f27069t;
            long j10 = mmVar.f27058i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f10 = b10;
            } else {
                if (mmVar.f27070u == null || mmVar.v != j10) {
                    mmVar.v = j10;
                    mmVar.f27070u = new k01(lh.ja.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + mmVar.f27070u.f26084c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f17 = mmVar.f27063n;
                float f18 = mmVar.f27067r;
                float x10 = e2.c.x(f18, dp, 2.0f, f17);
                i10 = size;
                float f19 = mmVar.f27065p;
                i11 = i13;
                float f20 = mmVar.f27068s;
                i12 = i14;
                rectF.set(x10, e2.c.x(f20, dp2, 2.0f, f19), kh.a2.b(f18, dp, 2.0f, f17), kh.a2.b(f20, dp2, 2.0f, f19));
                paint.setColor(1610612736);
                float f21 = dp2 / 2.0f;
                canvas.drawRoundRect(rectF, f21, f21, paint);
                f10 = b10;
                mmVar.f27070u.c(AndroidUtilities.dp(14.0f) + (((mmVar.f27067r / 2.0f) + mmVar.f27063n) - (dp / 2.0f)), mmVar.f27065p + (mmVar.f27068s / 2.0f), 1.0f, -1, canvas);
            }
            if (z10) {
                invalidate();
            }
            canvas.translate(0.0f, f10);
            f13 += f10;
            i14 = mmVar.f27060k.f25197g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.v0 v0Var = this.f27314a;
        v0Var.W(f13, v0Var.getMeasuredHeight());
        if (v0Var.I()) {
            v0Var.y(canvas, true);
            v0Var.B(canvas, true);
        }
        v0Var.draw(canvas);
        canvas.restore();
        if (omVar.G != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (omVar.G.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.v0 v0Var = this.f27314a;
        v0Var.layout(0, 0, v0Var.getMeasuredWidth(), v0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f27314a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f27320s <= 0) {
            this.f27320s = kh.a2.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f27320s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nm.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
