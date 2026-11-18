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
public final class ex extends ck0 {
    public boolean f34816f3;
    public final SparseArray f34817g3;
    public final ArrayList f34818h3;
    public final ArrayList f34819i3;
    public final ArrayList j3;
    public final ArrayList f34820k3;
    public int f34821l3;
    public SparseArray f34822m3;
    public final ry f34823n3;

    public ex(ry ryVar, Context context) {
        super(context, null);
        this.f34823n3 = ryVar;
        this.f34817g3 = new SparseArray();
        this.f34818h3 = new ArrayList();
        this.f34819i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.f34820k3 = new ArrayList();
        this.f34821l3 = -1;
        new SparseIntArray();
        lr lrVar = lr.f37208f;
    }

    public final void A1(View view) {
        if (this.f34822m3 != null) {
            int i7 = 0;
            while (i7 < this.f34822m3.size()) {
                dx dxVar = (dx) this.f34822m3.valueAt(i7);
                if (dxVar.d == view) {
                    this.f34822m3.removeAt(i7);
                    i7--;
                    View view2 = dxVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        dxVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = dxVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i7++;
            }
        }
    }

    public final void B1() {
        ry ryVar = this.f34823n3;
        int i7 = ryVar.f39340c;
        ex exVar = ryVar.Q;
        ex exVar2 = ryVar.Q;
        x5[] x5VarArr = new x5[exVar.getChildCount()];
        for (int i10 = 0; i10 < exVar2.getChildCount(); i10++) {
            View childAt = exVar2.getChildAt(i10);
            if (childAt instanceof zx) {
                x5VarArr[i10] = ((zx) childAt).getSpan();
            }
        }
        ryVar.f39349e2 = x5.update(i7, this, x5VarArr, ryVar.f39349e2);
    }

    @Override
    public final void J0(Canvas canvas, RectF rectF, long j3) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        int i7;
        boolean z11;
        Canvas canvas2 = canvas;
        ry ryVar = this.f34823n3;
        ex exVar = ryVar.Q;
        super.J0(canvas, rectF, j3);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.f34821l3 != getChildCount()) {
            B1();
            this.f34821l3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.f34817g3;
            int size = sparseArray.size();
            arrayList = this.j3;
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
        if (ryVar.f39405w2 > 0 && SystemClock.elapsedRealtime() - ryVar.f39405w2 < z1() && ryVar.f39395t2 != null && ryVar.f39398u2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (ryVar.f39349e2 != null && exVar != null) {
            int i13 = 0;
            while (i13 < exVar.getChildCount()) {
                View childAt = exVar.getChildAt(i13);
                if (childAt instanceof zx) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) p5.c.g(i12, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((zx) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == ryVar.f39398u2 - i12) {
                    z11 = z10;
                    float interpolation = lr.f37209g.getInterpolation(c8.l9.a(((float) (SystemClock.elapsedRealtime() - ryVar.f39405w2)) / 140.0f, f10, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i7 = i13;
                    } else {
                        float f11 = 1.0f - interpolation;
                        i7 = i13;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f11), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f12 = (f11 * 0.5f) + 0.5f;
                        canvas2.scale(f12, f12, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        ryVar.f39395t2.draw(canvas2);
                        canvas2.restore();
                    }
                } else {
                    i7 = i13;
                    z11 = z10;
                }
                i13 = i7 + 1;
                z10 = z11;
                f10 = 0.0f;
                i12 = 1;
            }
        }
        ArrayList arrayList5 = this.f34819i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f34818h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i14 = 0;
        while (true) {
            int size2 = sparseArray.size();
            cx cxVar = null;
            arrayList2 = this.f34820k3;
            if (i14 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i14);
            zx zxVar = (zx) arrayList7.get(i10);
            int i15 = zxVar.f42960a;
            int i16 = i10;
            while (true) {
                if (i16 >= arrayList5.size()) {
                    break;
                } else if (((cx) arrayList5.get(i16)).N == i15) {
                    cxVar = (cx) arrayList5.get(i16);
                    arrayList5.remove(i16);
                    break;
                } else {
                    i16++;
                }
            }
            if (cxVar == null) {
                if (!arrayList2.isEmpty()) {
                    cxVar = (cx) p5.c.g(1, arrayList2);
                } else {
                    cxVar = new cx(this);
                }
                cxVar.N = i15;
                cxVar.e();
            }
            arrayList6.add(cxVar);
            cxVar.P = arrayList7;
            canvas2.save();
            canvas2.translate(zxVar.getLeft(), zxVar.getY() + zxVar.getPaddingTop());
            cxVar.O = zxVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (zxVar.getLeft() * 2);
            int measuredHeight = zxVar.getMeasuredHeight() - zxVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                cxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i14++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((cx) arrayList5.get(i17));
                ((cx) arrayList5.get(i17)).P = null;
                ((cx) arrayList5.get(i17)).k();
            } else {
                ((cx) arrayList5.get(i17)).f();
            }
        }
        arrayList5.clear();
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        super.dispatchDraw(canvas);
        ry ryVar = this.f34823n3;
        ex exVar = ryVar.Q;
        ryVar.f39378o2.g();
        if (this.f34821l3 != getChildCount()) {
            B1();
            this.f34821l3 = getChildCount();
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            sparseArray = this.f34817g3;
            int size = sparseArray.size();
            arrayList = this.j3;
            if (i10 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i10);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i10++;
        }
        sparseArray.clear();
        if (ryVar.f39405w2 > 0 && SystemClock.elapsedRealtime() - ryVar.f39405w2 < z1() && ryVar.f39395t2 != null && ryVar.f39398u2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ryVar.f39349e2 != null && exVar != null) {
            for (int i11 = 0; i11 < exVar.getChildCount(); i11++) {
                View childAt = exVar.getChildAt(i11);
                if (childAt instanceof zx) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) p5.c.g(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((zx) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == ryVar.f39398u2 - 1) {
                    float interpolation = lr.f37209g.getInterpolation(c8.l9.a(((float) (SystemClock.elapsedRealtime() - ryVar.f39405w2)) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f10 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        ryVar.f39395t2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.f34819i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f34818h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i12 = 0;
        while (true) {
            int size2 = sparseArray.size();
            cx cxVar = null;
            arrayList2 = this.f34820k3;
            if (i12 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
            zx zxVar = (zx) arrayList7.get(i7);
            int i13 = zxVar.f42960a;
            int i14 = i7;
            while (true) {
                if (i14 >= arrayList5.size()) {
                    break;
                } else if (((cx) arrayList5.get(i14)).N == i13) {
                    cxVar = (cx) arrayList5.get(i14);
                    arrayList5.remove(i14);
                    break;
                } else {
                    i14++;
                }
            }
            if (cxVar == null) {
                if (!arrayList2.isEmpty()) {
                    cxVar = (cx) p5.c.g(1, arrayList2);
                } else {
                    cxVar = new cx(this);
                }
                cxVar.N = i13;
                cxVar.e();
            }
            arrayList6.add(cxVar);
            cxVar.P = arrayList7;
            canvas2.save();
            canvas2.translate(zxVar.getLeft(), zxVar.getY() + zxVar.getPaddingTop());
            cxVar.O = zxVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (zxVar.getLeft() * 2);
            int measuredHeight = zxVar.getMeasuredHeight() - zxVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                cxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i12++;
            canvas2 = canvas;
            i7 = 0;
        }
        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((cx) arrayList5.get(i15));
                ((cx) arrayList5.get(i15)).P = null;
                ((cx) arrayList5.get(i15)).k();
            } else {
                ((cx) arrayList5.get(i15)).f();
            }
        }
        arrayList5.clear();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (motionEvent.getActionMasked() != 5 && motionEvent.getActionMasked() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (motionEvent.getActionMasked() != 6 && motionEvent.getActionMasked() != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (motionEvent.getActionMasked() == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 || z11 || z12) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.f34822m3 == null) {
                this.f34822m3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            View E = E(x10, y10);
            if (z10) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f34524a = x10;
                    obj.f34525b = y10;
                    obj.f34526c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f34822m3.put(pointerId, obj);
                    C0();
                }
            } else {
                dx dxVar = (dx) this.f34822m3.get(pointerId);
                this.f34822m3.remove(pointerId);
                if (E != null && dxVar != null) {
                    if (Math.sqrt(Math.pow(y10 - dxVar.f34525b, 2.0d) + Math.pow(x10 - dxVar.f34524a, 2.0d)) < org.telegram.messenger.g0.f24097e * 3.0f && !z12) {
                        ry ryVar = this.f34823n3;
                        if (!ryVar.C1.isShowing() || SystemClock.elapsedRealtime() - dxVar.f34526c < ViewConfiguration.getLongPressTimeout()) {
                            View view = dxVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof zx) {
                                    ry.d(ryVar, (zx) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof hx) {
                                    ryVar.S.E(R, (hx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (dxVar != null && (dxVar.d.getBackground() instanceof RippleDrawable)) {
                    dxVar.d.getBackground().setState(new int[0]);
                }
                if (dxVar != null) {
                    dxVar.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z12 || this.f34822m3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void k0(int i7) {
        if (i7 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            ry ryVar = this.f34823n3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                ryVar.N(true);
            }
            if (!canScrollVertically(1)) {
                ry.e(ryVar, 1, org.telegram.messenger.g0.L(36.0f));
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
        x5.release(this, this.f34823n3.f39349e2);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            arrayList = this.f34818h3;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((cx) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.f34820k3;
            if (i7 < arrayList2.size()) {
                ((cx) arrayList2.get(i7)).f();
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
        ry ryVar = this.f34823n3;
        if (!ryVar.f39350f) {
            boolean q10 = org.telegram.ui.ns.p().q(motionEvent, this, ryVar.f39359h2, this.f34074o2);
            if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ry ryVar = this.f34823n3;
        if (ryVar.f39347e0 && ryVar.f39344d0) {
            this.f34816f3 = true;
            ryVar.R.h1(0, 0);
            ryVar.f39344d0 = false;
            this.f34816f3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        ryVar.l(true);
        B1();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        this.f34816f3 = true;
        int size = View.MeasureSpec.getSize(i7);
        ry ryVar = this.f34823n3;
        sw swVar = ryVar.R;
        int i11 = swVar.J;
        if (org.telegram.messenger.g0.Q1()) {
            f10 = 60.0f;
        } else {
            f10 = 45.0f;
        }
        swVar.y1(Math.max(1, size / org.telegram.messenger.g0.L(f10)));
        this.f34816f3 = false;
        super.onMeasure(i7, i10);
        if (i11 != swVar.J) {
            ryVar.S.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        ry ryVar = this.f34823n3;
        int[] iArr = ryVar.E1;
        iu iuVar = ryVar.C1;
        if (ryVar.S1 != null && iuVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f10 = ryVar.V1;
                    if (f10 != -10000.0f) {
                        if (Math.abs(f10 - motionEvent.getX()) > org.telegram.messenger.g0.a1(true, 0.2f) || Math.abs(ryVar.W1 - motionEvent.getY()) > org.telegram.messenger.g0.a1(false, 0.2f)) {
                            ryVar.V1 = -10000.0f;
                            ryVar.W1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x10 = motionEvent.getX() + iArr[0];
                    iuVar.f36199c.getLocationOnScreen(iArr);
                    int L = (int) (x10 - (org.telegram.messenger.g0.L(3.0f) + iArr[0]));
                    boolean z10 = iuVar.d;
                    hu huVar = iuVar.f36199c;
                    if (!z10) {
                        int max = Math.max(0, Math.min(5, L / (org.telegram.messenger.g0.L(4.0f) + iuVar.f36200e)));
                        if (huVar.f35974n[0] != max) {
                            org.telegram.messenger.g0.a4(huVar);
                            int[] iArr2 = huVar.f35974n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                huVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (iuVar != null && iuVar.isShowing() && !iuVar.d) {
                    iuVar.dismiss();
                    int i7 = iuVar.f36199c.f35974n[0];
                    if (i7 >= 1 && i7 <= 5) {
                        str = (String) org.telegram.messenger.j4.f24806a.get(i7 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) ryVar.S1.getTag();
                    if (!ryVar.S1.f42962c) {
                        if (str != null) {
                            org.telegram.messenger.j6.f24817j.put(str2, str);
                            str2 = ry.g(str2, str);
                        } else {
                            org.telegram.messenger.j6.f24817j.remove(str2);
                        }
                        ryVar.S1.a(org.telegram.messenger.j6.f(str2), ryVar.S1.f42962c);
                        ry.d(ryVar, ryVar.S1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.j6.q();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            ry.d(ryVar, ryVar.S1, ry.g(replace, str));
                        } else {
                            ry.d(ryVar, ryVar.S1, replace);
                        }
                    }
                }
                if (iuVar == null || !iuVar.d) {
                    ryVar.S1 = null;
                }
                ryVar.V1 = -10000.0f;
                ryVar.W1 = -10000.0f;
            }
            if (iuVar == null || !iuVar.d || iuVar.isShowing()) {
                return true;
            }
        }
        ryVar.T1 = motionEvent.getX();
        ryVar.U1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f34816f3) {
            return;
        }
        super.requestLayout();
    }

    public final long z1() {
        ry ryVar = this.f34823n3;
        return Math.max(400L, Math.min(45, ryVar.f39401v2 - ryVar.f39398u2) * 35) + Math.max(600L, Math.min(55, ryVar.f39401v2 - ryVar.f39398u2) * 40) + 150;
    }
}
