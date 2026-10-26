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
public final class bn extends ViewGroup {
    public an E;
    public zm F;
    public float G;
    public float H;
    public float I;
    public float J;
    public final PointF K;
    public boolean L;
    public final m.g3 M;
    public final xm N;
    public int O;
    public final cn P;
    public final org.telegram.ui.Cells.v0 f26906a;
    public final ArrayList f26907b;
    public final HashMap f26908c;
    public HashMap d;
    public ArrayList e;
    public HashMap f26909f;
    public ArrayList h;
    public final int f26910n;
    public final int f26911r;
    public int f26912s;
    public float v;
    public float f26913w;
    public boolean[] f26914x;
    public long f26915y;

    public bn(cn cnVar, Context context) {
        super(context);
        this.P = cnVar;
        this.f26907b = new ArrayList();
        this.f26908c = new HashMap();
        this.f26910n = AndroidUtilities.dp(16.0f);
        this.f26911r = AndroidUtilities.dp(64.0f);
        this.f26912s = 0;
        this.f26914x = null;
        this.f26915y = 0L;
        this.E = null;
        this.F = null;
        this.G = 0.0f;
        this.K = new PointF();
        this.L = false;
        this.M = new m.g3(this, 12);
        this.N = new xm(this);
        this.O = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, cnVar.f27200n, true);
        this.f26906a = v0Var;
        v0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(v0Var);
    }

    public final void a() {
        String str;
        this.d = this.P.P.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f26909f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f26907b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((an) arrayList.get(i10)).f26563k.f33688g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap hashMap = this.f26908c;
                    if (hashMap.containsKey(photoEntry)) {
                        Object obj = hashMap.get(photoEntry);
                        this.f26909f.put(obj, photoEntry);
                        this.h.add(obj);
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i12);
                                Object value = entry.getValue();
                                if (value == photoEntry) {
                                    Object key = entry.getKey();
                                    this.f26909f.put(key, value);
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
                                            this.f26909f.put(key2, value2);
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
        cn cnVar = this.P;
        zm zmVar = cnVar.J;
        PointF pointF = this.K;
        if (zmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!cnVar.K) {
            RectF f7 = zmVar.f(zmVar.e());
            RectF f10 = cnVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f7.width() / 2.0f) + f10.left, cnVar.f27205y - ((cnVar.G - 0.5f) * cnVar.H), this.G);
            pointF.y = AndroidUtilities.lerp((f7.height() / 2.0f) + cnVar.J.f35357a.f26556a + f10.top, (cnVar.E - ((cnVar.F - 0.5f) * cnVar.I)) + cnVar.M, this.G);
            return pointF;
        } else {
            RectF f11 = zmVar.f(zmVar.e());
            RectF f12 = cnVar.J.f(1.0f);
            pointF.x = AndroidUtilities.lerp((f11.width() / 2.0f) + f12.left, this.H, this.G / this.J);
            pointF.y = AndroidUtilities.lerp((f11.height() / 2.0f) + cnVar.J.f35357a.f26556a + f12.top, this.I, this.G / this.J);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f26907b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((an) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                zm zmVar = (zm) arrayList2.get(i11);
                xh.f fVar = zmVar.f35372s;
                if (fVar != null) {
                    fVar.b(zmVar.O.f26577z);
                    zmVar.f35372s = null;
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
                an anVar = new an(this);
                an.a(anVar, new vm(this.P, arrayList3), false);
                arrayList.add(anVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        cn cnVar;
        bi.r1 r1Var;
        boolean z10;
        ArrayList arrayList = this.f26907b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f7 = this.f26910n;
        int computeVerticalScrollOffset = this.P.f27201r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - cnVar.getListTopPadding());
        this.f26913w = (r1Var.getMeasuredHeight() - cnVar.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float b10 = ((an) arrayList.get(i10)).b() + f7;
            float f10 = this.v;
            if ((f7 >= f10 && f7 <= this.f26913w) || ((b10 >= f10 && b10 <= this.f26913w) || (f7 <= f10 && b10 >= this.f26913w))) {
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
        int i10 = this.f26910n + this.f26911r;
        ArrayList arrayList = this.f26907b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (int) (((an) arrayList.get(i11)).b() + i10);
        }
        org.telegram.ui.Cells.v0 v0Var = this.f26906a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return v0Var.getMeasuredHeight() + i10;
    }

    public final void f(an anVar, MediaController.PhotoEntry photoEntry, int i10) {
        an anVar2;
        ArrayList arrayList = anVar.f26563k.f33688g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (anVar.f26563k.f33688g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) anVar.f26563k.f33688g.get(10);
            anVar.f26563k.f33688g.remove(10);
            ArrayList arrayList2 = this.f26907b;
            int indexOf = arrayList2.indexOf(anVar);
            if (indexOf >= 0) {
                int i11 = indexOf + 1;
                if (i11 == arrayList2.size()) {
                    anVar2 = null;
                } else {
                    anVar2 = (an) arrayList2.get(i11);
                }
                if (anVar2 == null) {
                    an anVar3 = new an(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    an.a(anVar3, new vm(this.P, arrayList3), true);
                    invalidate();
                } else {
                    f(anVar2, photoEntry2, 0);
                }
            }
        }
        an.a(anVar, anVar.f26563k, true);
    }

    public final void g() {
        float f7 = this.f26910n;
        ArrayList arrayList = this.f26907b;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            an anVar = (an) arrayList.get(i11);
            float b10 = anVar.b();
            anVar.f26556a = f7;
            anVar.f26557b = i10;
            f7 += b10;
            i10 += anVar.f26563k.f33688g.size();
        }
    }

    public final void h() {
        cn cnVar = this.P;
        ValueAnimator valueAnimator = cnVar.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b10 = b();
        float f7 = this.G;
        this.J = f7;
        this.H = b10.x;
        this.I = b10.y;
        cnVar.K = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
        cnVar.L = ofFloat;
        ofFloat.addUpdateListener(new wm(this, 1));
        cnVar.L.addListener(new org.telegram.ui.qp(this, 16));
        cnVar.L.setDuration(200L);
        cnVar.L.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f26909f;
        ArrayList arrayList = this.h;
        tm tmVar = chatAttachAlertPhotoLayout.G;
        ti tiVar = chatAttachAlertPhotoLayout.f30215b;
        fm fmVar = chatAttachAlertPhotoLayout.E;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.f26017s1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f26018t1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            boolean z15 = false;
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = fmVar.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = fmVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.x5) {
                    int R = RecyclerView.R(childAt);
                    boolean z16 = tmVar.f33102f;
                    boolean z17 = tmVar.d;
                    if (z16 && R > chatAttachAlertPhotoLayout.M0) {
                        R--;
                    }
                    if (z17 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                        R--;
                    }
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                    if (tiVar.T0 != 0 || tiVar.H) {
                        x5Var.getCheckBox().setVisibility(8);
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
                        if (R == tmVar.h() - 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        x5Var.d(b02, z12, z13, z14, tiVar.f33030i0);
                        if ((tiVar.f33021f0 instanceof org.telegram.ui.un) && tiVar.W1) {
                            z11 = false;
                            x5Var.b(arrayList2.indexOf(Integer.valueOf(b02.imageId)), hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
                        } else {
                            z11 = false;
                            x5Var.b(-1, hashMap2.containsKey(Integer.valueOf(b02.imageId)), false);
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
            this.P.f30215b.c2(1);
        }
    }

    @Override
    public final void invalidate() {
        int c10 = org.telegram.messenger.t.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f26912s != c10) {
            this.f26912s = c10;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f26907b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            an anVar = (an) arrayList.get(i10);
            if (anVar.f26563k.f33688g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - anVar.f26563k.f33688g.size();
                an anVar2 = (an) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, anVar2.f26563k.f33688g.size());
                for (int i11 = 0; i11 < min; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) anVar2.f26563k.f33688g.remove(0));
                }
                anVar.f26563k.f33688g.addAll(arrayList2);
                an.a(anVar, anVar.f26563k, true);
                an.a(anVar2, anVar2.f26563k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bi.r1 r1Var;
        float f7;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        boolean z10;
        float f10;
        zm zmVar;
        float f11;
        float f12 = this.f26910n;
        cn cnVar = this.P;
        int computeVerticalScrollOffset = cnVar.f27201r.computeVerticalScrollOffset();
        this.v = Math.max(0, computeVerticalScrollOffset - cnVar.getListTopPadding());
        this.f26913w = (r1Var.getMeasuredHeight() - cnVar.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f12);
        ArrayList arrayList2 = this.f26907b;
        int size = arrayList2.size();
        float f13 = f12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            an anVar = (an) arrayList2.get(i13);
            float b10 = anVar.b();
            anVar.f26556a = f13;
            anVar.f26557b = i14;
            float f14 = this.v;
            if (f13 < f14 || f13 > this.f26913w) {
                float f15 = f13 + b10;
                if ((f15 < f14 || f15 > this.f26913w) && (f13 > f14 || f15 < this.f26913w)) {
                    f7 = b10;
                    arrayList = arrayList2;
                    i10 = size;
                    i11 = i13;
                    i12 = i14;
                    canvas.translate(0.0f, f7);
                    f13 += f7;
                    i14 = anVar.f26563k.f33688g.size() + i12;
                    i13 = i11 + 1;
                    size = i10;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = anVar.h;
            int i15 = anVar.f26564l;
            org.telegram.ui.ActionBar.l5 l5Var = anVar.f26575x;
            bn bnVar = anVar.f26577z;
            arrayList = arrayList2;
            float interpolation = anVar.f26562j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - anVar.f26558c)) / 200.0f));
            if (interpolation < 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            Point point = AndroidUtilities.displaySize;
            float max = Math.max(point.x, point.y) * 0.5f;
            float lerp = AndroidUtilities.lerp(anVar.f26559f, anVar.d, interpolation);
            int width = bnVar.getWidth();
            cn cnVar2 = bnVar.P;
            float previewScale = width * lerp * cnVar2.getPreviewScale();
            boolean z11 = z10;
            float previewScale2 = cnVar2.getPreviewScale() * AndroidUtilities.lerp(anVar.f26560g, anVar.e, interpolation) * max;
            if (l5Var != null) {
                f10 = 2.0f;
                anVar.f26568p = 0.0f;
                float width2 = bnVar.getWidth();
                float f16 = i15;
                anVar.f26566n = (width2 - Math.max(f16, previewScale)) / 2.0f;
                anVar.f26567o = (Math.max(f16, previewScale) + bnVar.getWidth()) / 2.0f;
                anVar.f26569q = Math.max(i15 * 2, previewScale2);
                anVar.f26575x.n(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                l5Var.setBounds((int) anVar.f26566n, (int) anVar.f26568p, (int) anVar.f26567o, (int) anVar.f26569q);
                if (anVar.d <= 0.0f) {
                    f11 = 1.0f - interpolation;
                } else if (anVar.f26559f <= 0.0f) {
                    f11 = interpolation;
                } else {
                    f11 = 1.0f;
                }
                l5Var.setAlpha((int) (f11 * 255.0f));
                l5Var.d(canvas, anVar.f26576y, null);
                anVar.f26568p += f16;
                anVar.f26566n += f16;
                anVar.f26569q -= f16;
                anVar.f26567o -= f16;
            } else {
                f10 = 2.0f;
            }
            anVar.f26570r = anVar.f26567o - anVar.f26566n;
            anVar.f26571s = anVar.f26569q - anVar.f26568p;
            int size2 = arrayList3.size();
            for (int i16 = 0; i16 < size2; i16++) {
                zm zmVar2 = (zm) arrayList3.get(i16);
                if (zmVar2 != null && (((zmVar = cnVar2.J) == null || zmVar.f35358b != zmVar2.f35358b) && zmVar2.c(canvas, false))) {
                    z11 = true;
                }
            }
            Paint paint = anVar.f26574w;
            RectF rectF = anVar.f26572t;
            long j10 = anVar.f26561i;
            if (j10 <= 0) {
                i10 = size;
                i11 = i13;
                i12 = i14;
                f7 = b10;
            } else {
                if (anVar.f26573u == null || anVar.v != j10) {
                    anVar.v = j10;
                    anVar.f26573u = new q11(bi.dd.W0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                }
                float dp = AndroidUtilities.dp(28.0f) + anVar.f26573u.f31790c;
                float dp2 = AndroidUtilities.dp(32.0f);
                float f17 = anVar.f26566n;
                float f18 = anVar.f26570r;
                float f19 = f10;
                float B = c3.h0.B(f18, dp, f19, f17);
                i10 = size;
                float f20 = anVar.f26568p;
                i11 = i13;
                float f21 = anVar.f26571s;
                i12 = i14;
                rectF.set(B, c3.h0.B(f21, dp2, f19, f20), org.telegram.messenger.t.b(f18, dp, f19, f17), org.telegram.messenger.t.b(f21, dp2, f19, f20));
                paint.setColor(1610612736);
                float f22 = dp2 / f19;
                canvas.drawRoundRect(rectF, f22, f22, paint);
                f7 = b10;
                anVar.f26573u.c(AndroidUtilities.dp(14.0f) + (((anVar.f26570r / f19) + anVar.f26566n) - (dp / f19)), anVar.f26568p + (anVar.f26571s / f19), 1.0f, -1, canvas);
            }
            if (z11) {
                invalidate();
            }
            canvas.translate(0.0f, f7);
            f13 += f7;
            i14 = anVar.f26563k.f33688g.size() + i12;
            i13 = i11 + 1;
            size = i10;
            arrayList2 = arrayList;
        }
        org.telegram.ui.Cells.v0 v0Var = this.f26906a;
        v0Var.Y(f13, v0Var.getMeasuredHeight());
        if (v0Var.J()) {
            v0Var.y(canvas, true);
            v0Var.B(canvas, true);
        }
        v0Var.draw(canvas);
        canvas.restore();
        if (cnVar.J != null) {
            canvas.save();
            PointF b11 = b();
            canvas.translate(b11.x, b11.y);
            if (cnVar.J.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.v0 v0Var = this.f26906a;
        v0Var.layout(0, 0, v0Var.getMeasuredWidth(), v0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f26906a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f26912s <= 0) {
            this.f26912s = org.telegram.messenger.t.c(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f26912s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bn.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
