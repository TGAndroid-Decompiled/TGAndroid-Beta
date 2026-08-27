package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

public final class dm extends ViewGroup {
    public cm A;
    public bm B;
    public float C;
    public float D;
    public float E;
    public float F;
    public final PointF G;
    public boolean H;
    public final m.i3 I;
    public final zl J;
    public int K;
    public final em L;

    public final org.telegram.ui.Cells.v0 f27798a;

    public final ArrayList f27799b;

    public final HashMap f27800c;
    public HashMap d;

    public ArrayList f27801e;

    public HashMap f27802f;
    public ArrayList h;

    public final int f27803n;

    public final int f27804r;

    public int f27805s;
    public float v;

    public float f27806w;

    public boolean[] f27807x;

    public long f27808y;

    public dm(em emVar, Context context) {
        super(context);
        this.L = emVar;
        this.f27799b = new ArrayList();
        this.f27800c = new HashMap();
        this.f27803n = AndroidUtilities.dp(16.0f);
        this.f27804r = AndroidUtilities.dp(64.0f);
        this.f27805s = 0;
        this.f27807x = null;
        this.f27808y = 0L;
        this.A = null;
        this.B = null;
        this.C = 0.0f;
        this.G = new PointF();
        this.H = false;
        this.I = new m.i3(this, 14);
        this.J = new zl(this);
        this.K = 0;
        new HashMap();
        setWillNotDraw(false);
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, emVar.f28086n, true);
        this.f27798a = v0Var;
        v0Var.setCustomText(LocaleController.getString(R.string.AttachMediaDragHint));
        addView(v0Var);
    }

    public final void a() {
        String str;
        this.d = this.L.L.getSelectedPhotos();
        this.f27801e = new ArrayList(this.d.entrySet());
        this.f27802f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.f27799b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = ((cm) arrayList.get(i10)).f27491k.f34285g;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) arrayList2.get(i11);
                    HashMap map = this.f27800c;
                    if (!map.containsKey(photoEntry)) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= this.f27801e.size()) {
                                for (int i13 = 0; i13 < this.f27801e.size(); i13++) {
                                    Map.Entry entry = (Map.Entry) this.f27801e.get(i13);
                                    Object value = entry.getValue();
                                    if ((value instanceof MediaController.PhotoEntry) && (str = ((MediaController.PhotoEntry) value).path) != null && photoEntry != null && str.equals(photoEntry.path)) {
                                        Object key = entry.getKey();
                                        this.f27802f.put(key, value);
                                        this.h.add(key);
                                        break;
                                    }
                                }
                                break;
                            }
                            Map.Entry entry2 = (Map.Entry) this.f27801e.get(i12);
                            Object value2 = entry2.getValue();
                            if (value2 == photoEntry) {
                                Object key2 = entry2.getKey();
                                this.f27802f.put(key2, value2);
                                this.h.add(key2);
                                break;
                            }
                            i12++;
                        }
                    } else {
                        Object obj = map.get(photoEntry);
                        this.f27802f.put(obj, photoEntry);
                        this.h.add(obj);
                    }
                }
            }
        }
    }

    public final PointF b() {
        em emVar = this.L;
        bm bmVar = emVar.F;
        PointF pointF = this.G;
        if (bmVar == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        }
        if (emVar.G) {
            RectF rectFF = bmVar.f(bmVar.e());
            RectF rectFF2 = emVar.F.f(1.0f);
            pointF.x = AndroidUtilities.lerp((rectFF.width() / 2.0f) + rectFF2.left, this.D, this.C / this.F);
            pointF.y = AndroidUtilities.lerp((rectFF.height() / 2.0f) + emVar.F.f27137a.f27483a + rectFF2.top, this.E, this.C / this.F);
            return pointF;
        }
        RectF rectFF3 = bmVar.f(bmVar.e());
        RectF rectFF4 = emVar.F.f(1.0f);
        pointF.x = AndroidUtilities.lerp((rectFF3.width() / 2.0f) + rectFF4.left, emVar.f28091y - ((emVar.C - 0.5f) * emVar.D), this.C);
        pointF.y = AndroidUtilities.lerp((rectFF3.height() / 2.0f) + emVar.F.f27137a.f27483a + rectFF4.top, (emVar.A - ((emVar.B - 0.5f) * emVar.E)) + emVar.I, this.C);
        return pointF;
    }

    public final void c() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f27799b;
            if (i10 >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((cm) arrayList.get(i10)).h;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                bm bmVar = (bm) arrayList2.get(i11);
                eh.j jVar = bmVar.f27153s;
                if (jVar != null) {
                    jVar.b(bmVar.O.f27505z);
                    bmVar.f27153s = null;
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
                cm cmVar = new cm(this);
                cm.a(cmVar, new wl(this.L, arrayList3), false);
                arrayList.add(cmVar);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        ArrayList arrayList = this.f27799b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f10 = this.f27803n;
        em emVar = this.L;
        hh.f1 f1Var = emVar.f28087r;
        int iComputeVerticalScrollOffset = f1Var.computeVerticalScrollOffset();
        this.v = Math.max(0, iComputeVerticalScrollOffset - emVar.getListTopPadding());
        this.f27806w = (f1Var.getMeasuredHeight() - emVar.getListTopPadding()) + iComputeVerticalScrollOffset;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            float fB = ((cm) arrayList.get(i10)).b() + f10;
            float f11 = this.v;
            zArr[i10] = (f10 >= f11 && f10 <= this.f27806w) || (fB >= f11 && fB <= this.f27806w) || (f10 <= f11 && fB >= this.f27806w);
            i10++;
            f10 = fB;
        }
        return zArr;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final int e() {
        int iB = this.f27803n + this.f27804r;
        ArrayList arrayList = this.f27799b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            iB = (int) (((cm) arrayList.get(i10)).b() + iB);
        }
        org.telegram.ui.Cells.v0 v0Var = this.f27798a;
        if (v0Var.getMeasuredHeight() <= 0) {
            v0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        }
        return v0Var.getMeasuredHeight() + iB;
    }

    public final void f(cm cmVar, MediaController.PhotoEntry photoEntry, int i10) {
        ArrayList arrayList = cmVar.f27491k.f34285g;
        arrayList.add(Math.min(arrayList.size(), i10), photoEntry);
        if (cmVar.f27491k.f34285g.size() == 11) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) cmVar.f27491k.f34285g.get(10);
            cmVar.f27491k.f34285g.remove(10);
            ArrayList arrayList2 = this.f27799b;
            int iIndexOf = arrayList2.indexOf(cmVar);
            if (iIndexOf >= 0) {
                int i11 = iIndexOf + 1;
                cm cmVar2 = i11 == arrayList2.size() ? null : (cm) arrayList2.get(i11);
                if (cmVar2 == null) {
                    cm cmVar3 = new cm(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(photoEntry2);
                    cm.a(cmVar3, new wl(this.L, arrayList3), true);
                    invalidate();
                } else {
                    f(cmVar2, photoEntry2, 0);
                }
            }
        }
        cm.a(cmVar, cmVar.f27491k, true);
    }

    public final void g() {
        float f10 = this.f27803n;
        ArrayList arrayList = this.f27799b;
        int size = arrayList.size();
        int size2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            cm cmVar = (cm) arrayList.get(i10);
            float fB = cmVar.b();
            cmVar.f27483a = f10;
            cmVar.f27484b = size2;
            f10 += fB;
            size2 += cmVar.f27491k.f34285g.size();
        }
    }

    public final void h() {
        em emVar = this.L;
        ValueAnimator valueAnimator = emVar.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF pointFB = b();
        float f10 = this.C;
        this.F = f10;
        this.D = pointFB.x;
        this.E = pointFB.y;
        emVar.G = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, 0.0f);
        emVar.H = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new yl(this, 1));
        emVar.H.addListener(new org.telegram.ui.am(this, 18));
        emVar.H.setDuration(200L);
        emVar.H.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap map = this.f27802f;
        ArrayList arrayList = this.h;
        ul ulVar = chatAttachAlertPhotoLayout.C;
        gi giVar = chatAttachAlertPhotoLayout.f34900b;
        gl glVar = chatAttachAlertPhotoLayout.A;
        HashMap map2 = ChatAttachAlertPhotoLayout.f26239o1;
        map2.clear();
        map2.putAll(map);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f26240p1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z10) {
            chatAttachAlertPhotoLayout.y0(false);
            chatAttachAlertPhotoLayout.w0();
            int childCount = glVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = glVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q5) {
                    int iR = RecyclerView.R(childAt);
                    boolean z11 = ulVar.f33116f;
                    boolean z12 = ulVar.d;
                    if (z11 && iR > chatAttachAlertPhotoLayout.I0) {
                        iR--;
                    }
                    if (z12 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                        iR--;
                    }
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                    if (giVar.M0 != 0 || giVar.D) {
                        q5Var.getCheckBox().setVisibility(8);
                    }
                    MediaController.PhotoEntry photoEntryB0 = chatAttachAlertPhotoLayout.b0(iR);
                    if (photoEntryB0 != null) {
                        q5Var.d(photoEntryB0, map2.size() > 1, z12 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0, iR == ulVar.h() - 1, giVar.f28646e0);
                        if ((giVar.f28635b0 instanceof org.telegram.ui.rn) && giVar.P1) {
                            q5Var.b(arrayList2.indexOf(Integer.valueOf(photoEntryB0.imageId)), map2.containsKey(Integer.valueOf(photoEntryB0.imageId)), false);
                        } else {
                            q5Var.b(-1, map2.containsKey(Integer.valueOf(photoEntryB0.imageId)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.L.f34900b.V1(1);
        }
    }

    @Override
    public final void invalidate() {
        int iD = i0.a.d(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        if (this.f27805s != iD) {
            this.f27805s = iD;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.f27799b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            cm cmVar = (cm) arrayList.get(i10);
            if (cmVar.f27491k.f34285g.size() < 10 && i10 < arrayList.size() - 1) {
                int size2 = 10 - cmVar.f27491k.f34285g.size();
                cm cmVar2 = (cm) arrayList.get(i10 + 1);
                ArrayList arrayList2 = new ArrayList();
                int iMin = Math.min(size2, cmVar2.f27491k.f34285g.size());
                for (int i11 = 0; i11 < iMin; i11++) {
                    arrayList2.add((MediaController.PhotoEntry) cmVar2.f27491k.f34285g.remove(0));
                }
                cmVar.f27491k.f34285g.addAll(arrayList2);
                cm.a(cmVar, cmVar.f27491k, true);
                cm.a(cmVar2, cmVar2.f27491k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        org.telegram.ui.ActionBar.d5 d5Var;
        dm dmVar;
        float interpolation;
        boolean z10;
        float previewScale;
        boolean z11;
        float previewScale2;
        int size;
        int i11;
        Paint paint;
        RectF rectF;
        long j10;
        bm bmVar;
        bm bmVar2;
        float f10;
        float f11 = this.f27803n;
        em emVar = this.L;
        hh.f1 f1Var = emVar.f28087r;
        int iComputeVerticalScrollOffset = f1Var.computeVerticalScrollOffset();
        this.v = Math.max(0, iComputeVerticalScrollOffset - emVar.getListTopPadding());
        this.f27806w = (f1Var.getMeasuredHeight() - emVar.getListTopPadding()) + iComputeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f11);
        ArrayList arrayList3 = this.f27799b;
        int size2 = arrayList3.size();
        float f12 = f11;
        int i12 = 0;
        int size3 = 0;
        while (i12 < size2) {
            cm cmVar = (cm) arrayList3.get(i12);
            float fB = cmVar.b();
            cmVar.f27483a = f12;
            cmVar.f27484b = size3;
            float f13 = this.v;
            if (f12 < f13 || f12 > this.f27806w) {
                float f14 = f12 + fB;
                if ((f14 < f13 || f14 > this.f27806w) && (f12 > f13 || f14 < this.f27806w)) {
                    arrayList = arrayList3;
                    size2 = size2;
                    i12 = i12;
                    size3 = size3;
                } else {
                    arrayList2 = cmVar.h;
                    i10 = cmVar.f27492l;
                    d5Var = cmVar.f27503x;
                    dmVar = cmVar.f27505z;
                    arrayList = arrayList3;
                    interpolation = cmVar.f27490j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - cmVar.f27485c) / 200.0f));
                    if (interpolation < 1.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Point point = AndroidUtilities.displaySize;
                    float fMax = Math.max(point.x, point.y) * 0.5f;
                    float fLerp = AndroidUtilities.lerp(cmVar.f27487f, cmVar.d, interpolation);
                    int width = dmVar.getWidth();
                    em emVar2 = dmVar.L;
                    previewScale = width * fLerp * emVar2.getPreviewScale();
                    z11 = z10;
                    previewScale2 = emVar2.getPreviewScale() * AndroidUtilities.lerp(cmVar.f27488g, cmVar.f27486e, interpolation) * fMax;
                    if (d5Var != null) {
                        cmVar.f27496p = 0.0f;
                        float width2 = dmVar.getWidth();
                        float f15 = i10;
                        cmVar.f27494n = (width2 - Math.max(f15, previewScale)) / 2.0f;
                        cmVar.f27495o = (Math.max(f15, previewScale) + dmVar.getWidth()) / 2.0f;
                        cmVar.f27497q = Math.max(i10 * 2, previewScale2);
                        cmVar.f27503x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                        d5Var.setBounds((int) cmVar.f27494n, (int) cmVar.f27496p, (int) cmVar.f27495o, (int) cmVar.f27497q);
                        if (cmVar.d <= 0.0f) {
                            f10 = 1.0f - interpolation;
                        } else if (cmVar.f27487f <= 0.0f) {
                            f10 = interpolation;
                        } else {
                            f10 = 1.0f;
                        }
                        d5Var.setAlpha((int) (f10 * 255.0f));
                        d5Var.d(canvas, cmVar.f27504y, null);
                        cmVar.f27496p += f15;
                        cmVar.f27494n += f15;
                        cmVar.f27497q -= f15;
                        cmVar.f27495o -= f15;
                    }
                    cmVar.f27498r = cmVar.f27495o - cmVar.f27494n;
                    cmVar.f27499s = cmVar.f27497q - cmVar.f27496p;
                    size = arrayList2.size();
                    for (i11 = 0; i11 < size; i11++) {
                        bmVar = (bm) arrayList2.get(i11);
                        if (bmVar != null && (((bmVar2 = emVar2.F) == null || bmVar2.f27138b != bmVar.f27138b) && bmVar.c(canvas, false))) {
                            z11 = true;
                        }
                    }
                    paint = cmVar.f27502w;
                    rectF = cmVar.f27500t;
                    j10 = cmVar.f27489i;
                    if (j10 > 0) {
                        if (cmVar.f27501u != null || cmVar.v != j10) {
                            cmVar.v = j10;
                            cmVar.f27501u = new pz0(hh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                        }
                        float fDp = AndroidUtilities.dp(28.0f) + cmVar.f27501u.f31697c;
                        float fDp2 = AndroidUtilities.dp(32.0f);
                        float f16 = cmVar.f27494n;
                        float f17 = cmVar.f27498r;
                        float fA = com.google.android.recaptcha.internal.a.A(f17, fDp, 2.0f, f16);
                        float f18 = cmVar.f27496p;
                        float f19 = cmVar.f27499s;
                        rectF.set(fA, com.google.android.recaptcha.internal.a.A(f19, fDp2, 2.0f, f18), i0.a.c(f17, fDp, 2.0f, f16), i0.a.c(f19, fDp2, 2.0f, f18));
                        paint.setColor(1610612736);
                        float f20 = fDp2 / 2.0f;
                        canvas.drawRoundRect(rectF, f20, f20, paint);
                        cmVar.f27501u.c(AndroidUtilities.dp(14.0f) + (((cmVar.f27498r / 2.0f) + cmVar.f27494n) - (fDp / 2.0f)), cmVar.f27496p + (cmVar.f27499s / 2.0f), 1.0f, -1, canvas);
                    }
                    if (z11) {
                        invalidate();
                    }
                }
            } else {
                arrayList2 = cmVar.h;
                i10 = cmVar.f27492l;
                d5Var = cmVar.f27503x;
                dmVar = cmVar.f27505z;
                arrayList = arrayList3;
                interpolation = cmVar.f27490j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - cmVar.f27485c) / 200.0f));
                if (interpolation < 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Point point2 = AndroidUtilities.displaySize;
                float fMax2 = Math.max(point2.x, point2.y) * 0.5f;
                float fLerp2 = AndroidUtilities.lerp(cmVar.f27487f, cmVar.d, interpolation);
                int width3 = dmVar.getWidth();
                em emVar3 = dmVar.L;
                previewScale = width3 * fLerp2 * emVar3.getPreviewScale();
                z11 = z10;
                previewScale2 = emVar3.getPreviewScale() * AndroidUtilities.lerp(cmVar.f27488g, cmVar.f27486e, interpolation) * fMax2;
                if (d5Var != null) {
                    cmVar.f27496p = 0.0f;
                    float width4 = dmVar.getWidth();
                    float f110 = i10;
                    cmVar.f27494n = (width4 - Math.max(f110, previewScale)) / 2.0f;
                    cmVar.f27495o = (Math.max(f110, previewScale) + dmVar.getWidth()) / 2.0f;
                    cmVar.f27497q = Math.max(i10 * 2, previewScale2);
                    cmVar.f27503x.o(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                    d5Var.setBounds((int) cmVar.f27494n, (int) cmVar.f27496p, (int) cmVar.f27495o, (int) cmVar.f27497q);
                    if (cmVar.d <= 0.0f) {
                        f10 = 1.0f - interpolation;
                    } else if (cmVar.f27487f <= 0.0f) {
                        f10 = interpolation;
                    } else {
                        f10 = 1.0f;
                    }
                    d5Var.setAlpha((int) (f10 * 255.0f));
                    d5Var.d(canvas, cmVar.f27504y, null);
                    cmVar.f27496p += f110;
                    cmVar.f27494n += f110;
                    cmVar.f27497q -= f110;
                    cmVar.f27495o -= f110;
                }
                cmVar.f27498r = cmVar.f27495o - cmVar.f27494n;
                cmVar.f27499s = cmVar.f27497q - cmVar.f27496p;
                size = arrayList2.size();
                while (i11 < size) {
                    bmVar = (bm) arrayList2.get(i11);
                    if (bmVar != null) {
                        z11 = true;
                    }
                }
                paint = cmVar.f27502w;
                rectF = cmVar.f27500t;
                j10 = cmVar.f27489i;
                if (j10 > 0) {
                    if (cmVar.f27501u != null) {
                        cmVar.v = j10;
                        cmVar.f27501u = new pz0(hh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                    } else {
                        cmVar.v = j10;
                        cmVar.f27501u = new pz0(hh.oa.X0(false, LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, AndroidUtilities.bold());
                    }
                    float fDp3 = AndroidUtilities.dp(28.0f) + cmVar.f27501u.f31697c;
                    float fDp4 = AndroidUtilities.dp(32.0f);
                    float f111 = cmVar.f27494n;
                    float f112 = cmVar.f27498r;
                    float fA2 = com.google.android.recaptcha.internal.a.A(f112, fDp3, 2.0f, f111);
                    float f113 = cmVar.f27496p;
                    float f114 = cmVar.f27499s;
                    rectF.set(fA2, com.google.android.recaptcha.internal.a.A(f114, fDp4, 2.0f, f113), i0.a.c(f112, fDp3, 2.0f, f111), i0.a.c(f114, fDp4, 2.0f, f113));
                    paint.setColor(1610612736);
                    float f21 = fDp4 / 2.0f;
                    canvas.drawRoundRect(rectF, f21, f21, paint);
                    cmVar.f27501u.c(AndroidUtilities.dp(14.0f) + (((cmVar.f27498r / 2.0f) + cmVar.f27494n) - (fDp3 / 2.0f)), cmVar.f27496p + (cmVar.f27499s / 2.0f), 1.0f, -1, canvas);
                }
                if (z11) {
                    invalidate();
                }
            }
            canvas.translate(0.0f, fB);
            f12 += fB;
            size3 = cmVar.f27491k.f34285g.size() + size3;
            i12++;
            size2 = size2;
            arrayList3 = arrayList;
        }
        org.telegram.ui.Cells.v0 v0Var = this.f27798a;
        v0Var.W(f12, v0Var.getMeasuredHeight());
        if (v0Var.J()) {
            v0Var.z(canvas, true);
            v0Var.C(canvas, true);
        }
        v0Var.draw(canvas);
        canvas.restore();
        if (emVar.F != null) {
            canvas.save();
            PointF pointFB = b();
            canvas.translate(pointFB.x, pointFB.y);
            if (emVar.F.c(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Cells.v0 v0Var = this.f27798a;
        v0Var.layout(0, 0, v0Var.getMeasuredWidth(), v0Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f27798a.measure(i10, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
        if (this.f27805s <= 0) {
            this.f27805s = i0.a.d(45.0f, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), this.f27805s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cm cmVar;
        bm bmVar;
        float f10;
        cm cmVar2;
        bm bmVar2;
        int action;
        m.i3 i3Var;
        boolean z10;
        bm bmVar3;
        int i10;
        org.telegram.ui.rn rnVar;
        bm bmVar4;
        wl wlVar;
        ArrayList arrayList;
        bm bmVar5;
        bm bmVar6;
        ValueAnimator valueAnimator;
        wl wlVar2;
        int i11;
        int i12;
        float f11;
        em emVar = this.L;
        gi giVar = emVar.f34900b;
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        ArrayList arrayList2 = this.f27799b;
        int size = arrayList2.size();
        int i13 = 0;
        float f12 = 0.0f;
        while (true) {
            if (i13 >= size) {
                cmVar = null;
                break;
            }
            cmVar = (cm) arrayList2.get(i13);
            float fB = cmVar.b();
            if (y10 >= f12 && y10 <= f12 + fB) {
                break;
            }
            f12 += fB;
            i13++;
        }
        if (cmVar == null) {
            bmVar = null;
            break;
        }
        ArrayList arrayList3 = cmVar.h;
        int size2 = arrayList3.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                bmVar = null;
                break;
            }
            bmVar = (bm) arrayList3.get(i14);
            if (bmVar != null && bmVar.d().contains(x8, y10 - f12)) {
                break;
            }
            i14++;
        }
        bm bmVar7 = emVar.F;
        if (bmVar7 != null) {
            RectF rectFF = bmVar7.f(bmVar7.e());
            PointF pointFB = b();
            RectF rectF = new RectF();
            float f13 = pointFB.x;
            float f14 = pointFB.y;
            f10 = 2.0f;
            rectF.set(f13 - (rectFF.width() / 2.0f), f14 - (rectFF.height() / 2.0f), (rectFF.width() / 2.0f) + f13, (rectFF.height() / 2.0f) + f14);
            int i15 = 0;
            cmVar2 = null;
            float f15 = 0.0f;
            float f16 = 0.0f;
            while (i15 < size) {
                cm cmVar3 = (cm) arrayList2.get(i15);
                float fB2 = cmVar3.b() + f15;
                int i16 = size;
                if (fB2 >= rectF.top) {
                    float f17 = rectF.bottom;
                    if (f17 >= f15) {
                        float fMin = Math.min(fB2, f17) - Math.max(f15, rectF.top);
                        if (fMin > f16) {
                            f16 = fMin;
                            cmVar2 = cmVar3;
                        }
                    }
                }
                i15++;
                f15 = fB2;
                size = i16;
            }
            if (cmVar2 != null) {
                ArrayList arrayList4 = cmVar2.h;
                int size3 = arrayList4.size();
                int i17 = 0;
                bmVar2 = null;
                float f18 = 0.0f;
                while (i17 < size3) {
                    bm bmVar8 = (bm) arrayList4.get(i17);
                    ArrayList arrayList5 = arrayList4;
                    if (bmVar8 == null || bmVar8 == emVar.F) {
                        i11 = size3;
                    } else {
                        i11 = size3;
                        if (cmVar2.f27491k.f34285g.contains(bmVar8.f27138b)) {
                            RectF rectFD = bmVar8.d();
                            int i18 = bmVar8.f27143i;
                            if ((i18 & 4) > 0) {
                                f11 = 0.0f;
                                rectFD.top = 0.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            if ((i18 & 1) > 0) {
                                rectFD.left = f11;
                            }
                            if ((i18 & 2) > 0) {
                                rectFD.right = getWidth();
                            }
                            if ((bmVar8.f27143i & 8) > 0) {
                                rectFD.bottom = cmVar2.f27499s;
                            }
                            if (RectF.intersects(rectF, rectFD)) {
                                i12 = i17;
                                float fMin2 = ((Math.min(rectFD.bottom, rectF.bottom) - Math.max(rectFD.top, rectF.top)) * (Math.min(rectFD.right, rectF.right) - Math.max(rectFD.left, rectF.left))) / (rectF.height() * rectF.width());
                                if (fMin2 > 0.15f && fMin2 > f18) {
                                    f18 = fMin2;
                                    bmVar2 = bmVar8;
                                }
                            }
                        }
                        i17 = i12 + 1;
                        arrayList4 = arrayList5;
                        size3 = i11;
                    }
                    i12 = i17;
                    i17 = i12 + 1;
                    arrayList4 = arrayList5;
                    size3 = i11;
                }
            }
            action = motionEvent.getAction();
            i3Var = this.I;
            if (action != 0 && emVar.F == null && !emVar.f28087r.G1 && (((valueAnimator = emVar.H) == null || !valueAnimator.isRunning()) && cmVar != null && bmVar != null && (wlVar2 = cmVar.f27491k) != null && wlVar2.f34285g.contains(bmVar.f27138b))) {
                this.A = cmVar;
                this.B = bmVar;
                emVar.f28091y = x8;
                emVar.A = y10;
                emVar.F = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f27808y = jElapsedRealtime;
                AndroidUtilities.runOnUIThread(new e5.u(this, jElapsedRealtime, this.B, 23), ViewConfiguration.getLongPressTimeout());
                invalidate();
            } else if (action == 2 || emVar.F == null || emVar.G) {
                if (action == 1 || (bmVar5 = emVar.F) == null) {
                    if (action == 1 || emVar.F != null || (bmVar3 = this.B) == null || this.A == null) {
                        z10 = false;
                    } else if (bmVar3.f27140e && bmVar3.f27146l == 0.0f) {
                        float x10 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        bmVar3.f27147m = x10;
                        bmVar3.f27148n = y11;
                        RectF rectFD2 = bmVar3.d();
                        bmVar3.f27149o = (float) Math.sqrt(Math.pow(rectFD2.height(), 2.0d) + Math.pow(rectFD2.width(), 2.0d));
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration((long) h7.n.a(bmVar3.f27149o * 0.3f, 250.0f, 550.0f));
                        duration.setInterpolator(er.f28125j);
                        duration.addUpdateListener(new e6(bmVar3, 11));
                        duration.addListener(new am(bmVar3));
                        duration.start();
                    } else {
                        RectF rectFD3 = bmVar3.d();
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float fDp = rectFD3.right - AndroidUtilities.dp(36.4f);
                        float f19 = this.A.f27496p + rectFD3.top;
                        rectF2.set(fDp, f19, rectFD3.right, AndroidUtilities.dp(36.4f) + f19);
                        if (!rectF2.contains(x8, y10 - this.B.f27137a.f27483a)) {
                            a();
                            ArrayList arrayList6 = new ArrayList();
                            int size4 = arrayList2.size();
                            for (int i19 = 0; i19 < size4; i19++) {
                                cm cmVar4 = (cm) arrayList2.get(i19);
                                if (cmVar4 != null && (wlVar = cmVar4.f27491k) != null && (arrayList = wlVar.f34285g) != null) {
                                    arrayList6.addAll(arrayList);
                                }
                            }
                            int iIndexOf = arrayList6.indexOf(this.B.f27138b);
                            int i20 = giVar.M0;
                            org.telegram.ui.ActionBar.n2 n2VarR = giVar.f28635b0;
                            if (i20 != 0) {
                                i10 = 1;
                            } else {
                                if (n2VarR instanceof org.telegram.ui.rn) {
                                    rnVar = (org.telegram.ui.rn) n2VarR;
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                if (n2VarR == null) {
                                    n2VarR = LaunchActivity.R();
                                }
                                if (!giVar.V1.s()) {
                                    AndroidUtilities.hideKeyboard(n2VarR.getFragmentView().findFocus());
                                    AndroidUtilities.hideKeyboard(giVar.getContainer().findFocus());
                                }
                                PhotoViewer.t1().K2(null, n2VarR, emVar.f34899a);
                                PhotoViewer.t1().L2(giVar);
                                PhotoViewer photoViewerT1 = PhotoViewer.t1();
                                int i21 = giVar.O1;
                                boolean z11 = giVar.P1;
                                photoViewerT1.h = i21;
                                photoViewerT1.f35700n = z11;
                                this.J.f35306a = arrayList6;
                                PhotoViewer.t1().f2(new ArrayList(arrayList6), iIndexOf, i10, false, this.J, rnVar);
                                emVar.L.getClass();
                                if (ChatAttachAlertPhotoLayout.T()) {
                                    PhotoViewer photoViewerT2 = PhotoViewer.t1();
                                    Editable text = giVar.m1().getText();
                                    photoViewerT2.f35690l7 = true;
                                    photoViewerT2.f35698m7 = text;
                                    bmVar4 = null;
                                    photoViewerT2.A2(null, text, false, false);
                                    photoViewerT2.t3(null);
                                }
                                this.B = bmVar4;
                                this.f27808y = 0L;
                                emVar.F = bmVar4;
                                this.C = 0.0f;
                            }
                            rnVar = null;
                            if (n2VarR == null) {
                                n2VarR = LaunchActivity.R();
                            }
                            if (!giVar.V1.s()) {
                                AndroidUtilities.hideKeyboard(n2VarR.getFragmentView().findFocus());
                                AndroidUtilities.hideKeyboard(giVar.getContainer().findFocus());
                            }
                            PhotoViewer.t1().K2(null, n2VarR, emVar.f34899a);
                            PhotoViewer.t1().L2(giVar);
                            PhotoViewer photoViewerT3 = PhotoViewer.t1();
                            int i22 = giVar.O1;
                            boolean z12 = giVar.P1;
                            photoViewerT3.h = i22;
                            photoViewerT3.f35700n = z12;
                            this.J.f35306a = arrayList6;
                            PhotoViewer.t1().f2(new ArrayList(arrayList6), iIndexOf, i10, false, this.J, rnVar);
                            emVar.L.getClass();
                            if (ChatAttachAlertPhotoLayout.T()) {
                                PhotoViewer photoViewerT4 = PhotoViewer.t1();
                                Editable text2 = giVar.m1().getText();
                                photoViewerT4.f35690l7 = true;
                                photoViewerT4.f35698m7 = text2;
                                bmVar4 = null;
                                photoViewerT4.A2(null, text2, false, false);
                                photoViewerT4.t3(null);
                            }
                            this.B = bmVar4;
                            this.f27808y = 0L;
                            emVar.F = bmVar4;
                            this.C = 0.0f;
                        } else if (emVar.getSelectedItemsCount() > 1) {
                            MediaController.PhotoEntry photoEntry = this.B.f27138b;
                            int iIndexOf2 = this.A.f27491k.f34285g.indexOf(photoEntry);
                            if (iIndexOf2 >= 0) {
                                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = emVar.L;
                                if (chatAttachAlertPhotoLayout != null) {
                                    ArrayList arrayList7 = new ArrayList(chatAttachAlertPhotoLayout.getSelectedPhotos().entrySet());
                                    int size5 = arrayList7.size();
                                    for (int i23 = 0; i23 < size5; i23++) {
                                        if (((Map.Entry) arrayList7.get(i23)).getValue() == photoEntry) {
                                            this.f27800c.put(photoEntry, ((Map.Entry) arrayList7.get(i23)).getKey());
                                            break;
                                        }
                                    }
                                }
                                cm cmVar5 = this.A;
                                cmVar5.f27491k.f34285g.remove(iIndexOf2);
                                cm.a(cmVar5, cmVar5.f27491k, true);
                                j();
                                i(emVar.L, false);
                                int i24 = this.K + 1;
                                this.K = i24;
                                emVar.f28089w.k(0L, 82, photoEntry, null, null, new ag.k0(this, cmVar5, photoEntry, iIndexOf2, 15));
                                postDelayed(new xl(this, i24, 0), 4000L);
                            }
                            ValueAnimator valueAnimator2 = emVar.H;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                        }
                        bmVar4 = null;
                        this.B = bmVar4;
                        this.f27808y = 0L;
                        emVar.F = bmVar4;
                        this.C = 0.0f;
                    }
                    if (action != 1 || action == 3) {
                        this.f27808y = 0L;
                        removeCallbacks(i3Var);
                        this.H = false;
                        if (!z10) {
                            h();
                            return true;
                        }
                    }
                    return z10;
                }
                if (cmVar == null || bmVar == null || bmVar == bmVar5) {
                    if (cmVar2 == null || bmVar2 == null || bmVar2 == bmVar5 || bmVar2.f27138b == bmVar5.f27138b) {
                        cmVar = null;
                        bmVar = null;
                    } else {
                        cmVar = cmVar2;
                        bmVar = bmVar2;
                    }
                }
                if (cmVar != null) {
                    ArrayList arrayList8 = cmVar.h;
                    if (bmVar != null && bmVar != bmVar5) {
                        int iIndexOf3 = bmVar5.f27137a.f27491k.f34285g.indexOf(bmVar5.f27138b);
                        int iIndexOf4 = cmVar.f27491k.f34285g.indexOf(bmVar.f27138b);
                        if (iIndexOf3 >= 0) {
                            emVar.F.f27137a.f27491k.f34285g.remove(iIndexOf3);
                            cm cmVar6 = emVar.F.f27137a;
                            cm.a(cmVar6, cmVar6.f27491k, true);
                        }
                        if (iIndexOf4 >= 0) {
                            if (arrayList2.indexOf(cmVar) > arrayList2.indexOf(emVar.F.f27137a)) {
                                iIndexOf4++;
                            }
                            f(cmVar, emVar.F.f27138b, iIndexOf4);
                            if (emVar.F.f27137a != cmVar) {
                                int size6 = arrayList8.size();
                                int i25 = 0;
                                while (true) {
                                    if (i25 >= size6) {
                                        bmVar6 = null;
                                        break;
                                    }
                                    bmVar6 = (bm) arrayList8.get(i25);
                                    if (bmVar6.f27138b == emVar.F.f27138b) {
                                        break;
                                    }
                                    i25++;
                                }
                                if (bmVar6 != null) {
                                    g();
                                    bm bmVar9 = emVar.F;
                                    RectF rectF3 = bmVar6.f27142g;
                                    cm cmVar7 = bmVar6.O;
                                    float f20 = bmVar9.f27144j;
                                    RectF rectF4 = bmVar9.f27142g;
                                    bmVar6.f27144j = AndroidUtilities.lerp(f20, bmVar9.f27145k, bmVar9.e());
                                    if (bmVar6.f27141f == null) {
                                        bmVar6.f27141f = new RectF();
                                    }
                                    RectF rectF5 = new RectF();
                                    RectF rectF6 = bmVar6.f27141f;
                                    if (rectF6 == null) {
                                        rectF5.set(rectF3);
                                    } else {
                                        AndroidUtilities.lerp(rectF6, rectF3, bmVar6.e(), rectF5);
                                    }
                                    RectF rectF7 = bmVar9.f27141f;
                                    if (rectF7 != null) {
                                        AndroidUtilities.lerp(rectF7, rectF4, bmVar9.e(), bmVar6.f27141f);
                                        bmVar6.f27141f.set(rectF5.centerX() - (((bmVar6.f27141f.width() / f10) * bmVar9.f27137a.f27498r) / cmVar7.f27498r), rectF5.centerY() - (((bmVar6.f27141f.height() / f10) * bmVar9.f27137a.f27499s) / cmVar7.f27499s), (((bmVar6.f27141f.width() / f10) * bmVar9.f27137a.f27498r) / cmVar7.f27498r) + rectF5.centerX(), (((bmVar6.f27141f.height() / f10) * bmVar9.f27137a.f27499s) / cmVar7.f27499s) + rectF5.centerY());
                                    } else {
                                        bmVar6.f27141f.set(rectF5.centerX() - (((rectF4.width() / f10) * bmVar9.f27137a.f27498r) / cmVar7.f27498r), rectF5.centerY() - (((rectF4.height() / f10) * bmVar9.f27137a.f27499s) / cmVar7.f27499s), (((rectF4.width() / f10) * bmVar9.f27137a.f27498r) / cmVar7.f27498r) + rectF5.centerX(), (((rectF4.height() / f10) * bmVar9.f27137a.f27499s) / cmVar7.f27499s) + rectF5.centerY());
                                    }
                                    bmVar6.f27144j = AndroidUtilities.lerp(bmVar6.f27144j, bmVar6.f27145k, bmVar6.e());
                                    bmVar6.h = SystemClock.elapsedRealtime();
                                    emVar.F = bmVar6;
                                    bmVar6.f27137a = cmVar;
                                    bmVar6.f27144j = 1.0f;
                                    bmVar6.f27145k = 1.0f;
                                    g();
                                }
                            }
                        }
                        try {
                            emVar.performHapticFeedback(7, 2);
                        } catch (Exception unused) {
                        }
                        j();
                        i(emVar.L, false);
                    }
                }
                h();
            } else {
                emVar.f28091y = x8;
                emVar.A = y10;
                if (!this.H) {
                    this.H = true;
                    postDelayed(i3Var, 16L);
                }
                invalidate();
            }
            z10 = true;
            if (action != 1) {
                this.f27808y = 0L;
                removeCallbacks(i3Var);
                this.H = false;
                if (!z10) {
                    h();
                    return true;
                }
            } else {
                this.f27808y = 0L;
                removeCallbacks(i3Var);
                this.H = false;
                if (!z10) {
                    h();
                    return true;
                }
            }
            return z10;
        }
        f10 = 2.0f;
        cmVar2 = null;
        bmVar2 = null;
        action = motionEvent.getAction();
        i3Var = this.I;
        if (action != 0) {
            if (action == 2) {
                if (action == 1) {
                    if (action == 1) {
                    }
                    z10 = false;
                } else {
                    if (action == 1) {
                    }
                    z10 = false;
                }
            } else if (action == 1) {
                if (action == 1) {
                }
                z10 = false;
            } else {
                if (action == 1) {
                }
                z10 = false;
            }
        } else if (action == 2) {
            if (action == 1) {
                if (action == 1) {
                }
                z10 = false;
            } else {
                if (action == 1) {
                }
                z10 = false;
            }
        } else if (action == 1) {
            if (action == 1) {
            }
            z10 = false;
        } else {
            if (action == 1) {
            }
            z10 = false;
        }
        if (action != 1) {
            this.f27808y = 0L;
            removeCallbacks(i3Var);
            this.H = false;
            if (!z10) {
                h();
                return true;
            }
        } else {
            this.f27808y = 0L;
            removeCallbacks(i3Var);
            this.H = false;
            if (!z10) {
                h();
                return true;
            }
        }
        return z10;
    }
}
