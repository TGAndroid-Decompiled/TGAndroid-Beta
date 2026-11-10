package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class sw extends pj0 {
    public boolean f38088e3;
    public final SparseArray f38089f3;
    public final ArrayList f38090g3;
    public final ArrayList f38091h3;
    public final ArrayList f38092i3;
    public final ArrayList j3;
    public int f38093k3;
    public SparseArray f38094l3;
    public final gy f38095m3;

    public sw(gy gyVar, Context context) {
        super(context, null);
        this.f38095m3 = gyVar;
        this.f38089f3 = new SparseArray();
        this.f38090g3 = new ArrayList();
        this.f38091h3 = new ArrayList();
        this.f38092i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.f38093k3 = -1;
        new SparseIntArray();
        wq wqVar = wq.f40046f;
    }

    public final void A1(View view) {
        if (this.f38094l3 != null) {
            int i7 = 0;
            while (i7 < this.f38094l3.size()) {
                rw rwVar = (rw) this.f38094l3.valueAt(i7);
                if (rwVar.d == view) {
                    this.f38094l3.removeAt(i7);
                    i7--;
                    View view2 = rwVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        rwVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = rwVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i7++;
            }
        }
    }

    public final void B1() {
        gy gyVar = this.f38095m3;
        int i7 = gyVar.f34014c;
        sw swVar = gyVar.P;
        sw swVar2 = gyVar.P;
        q5[] q5VarArr = new q5[swVar.getChildCount()];
        for (int i10 = 0; i10 < swVar2.getChildCount(); i10++) {
            View childAt = swVar2.getChildAt(i10);
            if (childAt instanceof px) {
                q5VarArr[i10] = ((px) childAt).getSpan();
            }
        }
        gyVar.d2 = q5.update(i7, this, q5VarArr, gyVar.d2);
    }

    @Override
    public final void J0(Canvas canvas, RectF rectF, long j3) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z9;
        ArrayList arrayList2;
        int i7;
        boolean z10;
        Canvas canvas2 = canvas;
        gy gyVar = this.f38095m3;
        sw swVar = gyVar.P;
        super.J0(canvas, rectF, j3);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.f38093k3 != getChildCount()) {
            B1();
            this.f38093k3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.f38089f3;
            int size = sparseArray.size();
            arrayList = this.f38092i3;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        int i12 = 1;
        if (gyVar.f34075v2 > 0 && SystemClock.elapsedRealtime() - gyVar.f34075v2 < z1() && gyVar.f34066s2 != null && gyVar.f34069t2 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        float f10 = 0.0f;
        if (gyVar.d2 != null && swVar != null) {
            int i13 = 0;
            while (i13 < swVar.getChildCount()) {
                View childAt = swVar.getChildAt(i13);
                if (childAt instanceof px) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) org.telegram.ui.Cells.f1.k(i12, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((px) childAt);
                }
                if (z9 && childAt != null && RecyclerView.R(childAt) == gyVar.f34069t2 - i12) {
                    z10 = z9;
                    float interpolation = wq.f40047g.getInterpolation(c8.j9.a(((float) (SystemClock.elapsedRealtime() - gyVar.f34075v2)) / 140.0f, f10, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i7 = i13;
                    } else {
                        float f11 = 1.0f - interpolation;
                        i7 = i13;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f11), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f12 = (f11 * 0.5f) + 0.5f;
                        canvas2.scale(f12, f12, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        gyVar.f34066s2.draw(canvas2);
                        canvas2.restore();
                    }
                } else {
                    i7 = i13;
                    z10 = z9;
                }
                i13 = i7 + 1;
                z9 = z10;
                f10 = 0.0f;
                i12 = 1;
            }
        }
        ArrayList arrayList5 = this.f38091h3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f38090g3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i14 = 0;
        while (true) {
            int size2 = sparseArray.size();
            qw qwVar = null;
            arrayList2 = this.j3;
            if (i14 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i14);
            px pxVar = (px) arrayList7.get(i10);
            int i15 = pxVar.f37087a;
            int i16 = i10;
            while (true) {
                if (i16 >= arrayList5.size()) {
                    break;
                } else if (((qw) arrayList5.get(i16)).M == i15) {
                    qwVar = (qw) arrayList5.get(i16);
                    arrayList5.remove(i16);
                    break;
                } else {
                    i16++;
                }
            }
            if (qwVar == null) {
                if (!arrayList2.isEmpty()) {
                    qwVar = (qw) org.telegram.ui.Cells.f1.k(1, arrayList2);
                } else {
                    qwVar = new qw(this);
                }
                qwVar.M = i15;
                qwVar.e();
            }
            arrayList6.add(qwVar);
            qwVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(pxVar.getLeft(), pxVar.getY() + pxVar.getPaddingTop());
            qwVar.N = pxVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (pxVar.getLeft() * 2);
            int measuredHeight = pxVar.getMeasuredHeight() - pxVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                qwVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i14++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((qw) arrayList5.get(i17));
                ((qw) arrayList5.get(i17)).O = null;
                ((qw) arrayList5.get(i17)).k();
            } else {
                ((qw) arrayList5.get(i17)).f();
            }
        }
        arrayList5.clear();
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z9;
        ArrayList arrayList2;
        super.dispatchDraw(canvas);
        gy gyVar = this.f38095m3;
        sw swVar = gyVar.P;
        gyVar.f34049n2.g();
        if (this.f38093k3 != getChildCount()) {
            B1();
            this.f38093k3 = getChildCount();
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            sparseArray = this.f38089f3;
            int size = sparseArray.size();
            arrayList = this.f38092i3;
            if (i10 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i10);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i10++;
        }
        sparseArray.clear();
        if (gyVar.f34075v2 > 0 && SystemClock.elapsedRealtime() - gyVar.f34075v2 < z1() && gyVar.f34066s2 != null && gyVar.f34069t2 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (gyVar.d2 != null && swVar != null) {
            for (int i11 = 0; i11 < swVar.getChildCount(); i11++) {
                View childAt = swVar.getChildAt(i11);
                if (childAt instanceof px) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) org.telegram.ui.Cells.f1.k(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((px) childAt);
                }
                if (z9 && childAt != null && RecyclerView.R(childAt) == gyVar.f34069t2 - 1) {
                    float interpolation = wq.f40047g.getInterpolation(c8.j9.a(((float) (SystemClock.elapsedRealtime() - gyVar.f34075v2)) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f10 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        gyVar.f34066s2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.f38091h3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f38090g3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i12 = 0;
        while (true) {
            int size2 = sparseArray.size();
            qw qwVar = null;
            arrayList2 = this.j3;
            if (i12 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
            px pxVar = (px) arrayList7.get(i7);
            int i13 = pxVar.f37087a;
            int i14 = i7;
            while (true) {
                if (i14 >= arrayList5.size()) {
                    break;
                } else if (((qw) arrayList5.get(i14)).M == i13) {
                    qwVar = (qw) arrayList5.get(i14);
                    arrayList5.remove(i14);
                    break;
                } else {
                    i14++;
                }
            }
            if (qwVar == null) {
                if (!arrayList2.isEmpty()) {
                    qwVar = (qw) org.telegram.ui.Cells.f1.k(1, arrayList2);
                } else {
                    qwVar = new qw(this);
                }
                qwVar.M = i13;
                qwVar.e();
            }
            arrayList6.add(qwVar);
            qwVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(pxVar.getLeft(), pxVar.getY() + pxVar.getPaddingTop());
            qwVar.N = pxVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (pxVar.getLeft() * 2);
            int measuredHeight = pxVar.getMeasuredHeight() - pxVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                qwVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i12++;
            canvas2 = canvas;
            i7 = 0;
        }
        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((qw) arrayList5.get(i15));
                ((qw) arrayList5.get(i15)).O = null;
                ((qw) arrayList5.get(i15)).k();
            } else {
                ((qw) arrayList5.get(i15)).f();
            }
        }
        arrayList5.clear();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        boolean z11;
        if (motionEvent.getActionMasked() != 5 && motionEvent.getActionMasked() != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (motionEvent.getActionMasked() != 6 && motionEvent.getActionMasked() != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (motionEvent.getActionMasked() == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 || z10 || z11) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.f38094l3 == null) {
                this.f38094l3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            View E = E(x10, y10);
            if (z9) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f37744a = x10;
                    obj.f37745b = y10;
                    obj.f37746c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f38094l3.put(pointerId, obj);
                    C0();
                }
            } else {
                rw rwVar = (rw) this.f38094l3.get(pointerId);
                this.f38094l3.remove(pointerId);
                if (E != null && rwVar != null) {
                    if (Math.sqrt(Math.pow(y10 - rwVar.f37745b, 2.0d) + Math.pow(x10 - rwVar.f37744a, 2.0d)) < org.telegram.messenger.g0.f22546e * 3.0f && !z11) {
                        gy gyVar = this.f38095m3;
                        if (!gyVar.B1.isShowing() || SystemClock.elapsedRealtime() - rwVar.f37746c < ViewConfiguration.getLongPressTimeout()) {
                            View view = rwVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof px) {
                                    gy.d(gyVar, (px) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof vw) {
                                    gyVar.R.E(R, (vw) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (rwVar != null && (rwVar.d.getBackground() instanceof RippleDrawable)) {
                    rwVar.d.getBackground().setState(new int[0]);
                }
                if (rwVar != null) {
                    rwVar.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z11 || this.f38094l3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void k0(int i7) {
        if (i7 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            gy gyVar = this.f38095m3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                gyVar.M(true);
            }
            if (!canScrollVertically(1)) {
                gy.e(gyVar, 1, org.telegram.messenger.g0.L(36.0f));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        B1();
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        q5.release(this, this.f38095m3.d2);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            arrayList = this.f38090g3;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((qw) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.j3;
            if (i7 < arrayList2.size()) {
                ((qw) arrayList2.get(i7)).f();
                i7++;
            } else {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        gy gyVar = this.f38095m3;
        if (!gyVar.f34024f) {
            boolean q10 = org.telegram.ui.ns.p().q(motionEvent, this, gyVar.f34030g2, this.f36980n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        gy gyVar = this.f38095m3;
        if (gyVar.f34018d0 && gyVar.f34015c0) {
            this.f38088e3 = true;
            gyVar.Q.h1(0, 0);
            gyVar.f34015c0 = false;
            this.f38088e3 = false;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        gyVar.l(true);
        B1();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        this.f38088e3 = true;
        int size = View.MeasureSpec.getSize(i7);
        gy gyVar = this.f38095m3;
        gw gwVar = gyVar.Q;
        int i11 = gwVar.J;
        if (org.telegram.messenger.g0.Q1()) {
            f10 = 60.0f;
        } else {
            f10 = 45.0f;
        }
        gwVar.y1(Math.max(1, size / org.telegram.messenger.g0.L(f10)));
        this.f38088e3 = false;
        super.onMeasure(i7, i10);
        if (i11 != gwVar.J) {
            gyVar.R.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        gy gyVar = this.f38095m3;
        int[] iArr = gyVar.D1;
        xt xtVar = gyVar.B1;
        if (gyVar.R1 != null && xtVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f10 = gyVar.U1;
                    if (f10 != -10000.0f) {
                        if (Math.abs(f10 - motionEvent.getX()) > org.telegram.messenger.g0.a1(true, 0.2f) || Math.abs(gyVar.V1 - motionEvent.getY()) > org.telegram.messenger.g0.a1(false, 0.2f)) {
                            gyVar.U1 = -10000.0f;
                            gyVar.V1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x10 = motionEvent.getX() + iArr[0];
                    xtVar.f40403c.getLocationOnScreen(iArr);
                    int L = (int) (x10 - (org.telegram.messenger.g0.L(3.0f) + iArr[0]));
                    boolean z9 = xtVar.d;
                    wt wtVar = xtVar.f40403c;
                    if (!z9) {
                        int max = Math.max(0, Math.min(5, L / (org.telegram.messenger.g0.L(4.0f) + xtVar.f40404e)));
                        if (wtVar.f40070n[0] != max) {
                            org.telegram.messenger.g0.c4(wtVar);
                            int[] iArr2 = wtVar.f40070n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                wtVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (xtVar != null && xtVar.isShowing() && !xtVar.d) {
                    xtVar.dismiss();
                    int i7 = xtVar.f40403c.f40070n[0];
                    if (i7 >= 1 && i7 <= 5) {
                        str = (String) org.telegram.messenger.h4.f22844a.get(i7 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) gyVar.R1.getTag();
                    if (!gyVar.R1.f37089c) {
                        if (str != null) {
                            org.telegram.messenger.i6.f23063j.put(str2, str);
                            str2 = gy.g(str2, str);
                        } else {
                            org.telegram.messenger.i6.f23063j.remove(str2);
                        }
                        gyVar.R1.a(org.telegram.messenger.i6.f(str2), gyVar.R1.f37089c);
                        gy.d(gyVar, gyVar.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.i6.q();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            gy.d(gyVar, gyVar.R1, gy.g(replace, str));
                        } else {
                            gy.d(gyVar, gyVar.R1, replace);
                        }
                    }
                }
                if (xtVar == null || !xtVar.d) {
                    gyVar.R1 = null;
                }
                gyVar.U1 = -10000.0f;
                gyVar.V1 = -10000.0f;
            }
            if (xtVar == null || !xtVar.d || xtVar.isShowing()) {
                return true;
            }
        }
        gyVar.S1 = motionEvent.getX();
        gyVar.T1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f38088e3) {
            return;
        }
        super.requestLayout();
    }

    public final long z1() {
        gy gyVar = this.f38095m3;
        return Math.max(400L, Math.min(45, gyVar.f34072u2 - gyVar.f34069t2) * 35) + Math.max(600L, Math.min(55, gyVar.f34072u2 - gyVar.f34069t2) * 40) + 150;
    }
}
