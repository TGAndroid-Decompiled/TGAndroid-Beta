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
public final class hx extends tk0 {
    public boolean f26834e3;
    public final SparseArray f26835f3;
    public final ArrayList f26836g3;
    public final ArrayList f26837h3;
    public final ArrayList f26838i3;
    public final ArrayList f26839j3;
    public int f26840k3;
    public SparseArray f26841l3;
    public final vy f26842m3;

    public hx(vy vyVar, Context context) {
        super(context, null);
        this.f26842m3 = vyVar;
        this.f26835f3 = new SparseArray();
        this.f26836g3 = new ArrayList();
        this.f26837h3 = new ArrayList();
        this.f26838i3 = new ArrayList();
        this.f26839j3 = new ArrayList();
        this.f26840k3 = -1;
        new SparseIntArray();
        gr grVar = gr.f26495f;
    }

    public final void A1(View view) {
        if (this.f26841l3 != null) {
            int i10 = 0;
            while (i10 < this.f26841l3.size()) {
                gx gxVar = (gx) this.f26841l3.valueAt(i10);
                if (gxVar.d == view) {
                    this.f26841l3.removeAt(i10);
                    i10--;
                    View view2 = gxVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        gxVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = gxVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void B1() {
        vy vyVar = this.f26842m3;
        int i10 = vyVar.f31863c;
        hx hxVar = vyVar.P;
        hx hxVar2 = vyVar.P;
        o5[] o5VarArr = new o5[hxVar.getChildCount()];
        for (int i11 = 0; i11 < hxVar2.getChildCount(); i11++) {
            View childAt = hxVar2.getChildAt(i11);
            if (childAt instanceof ey) {
                o5VarArr[i11] = ((ey) childAt).getSpan();
            }
        }
        vyVar.f31869d2 = o5.update(i10, this, o5VarArr, vyVar.f31869d2);
    }

    @Override
    public final void J0(Canvas canvas, RectF rectF, long j10) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        int i10;
        boolean z11;
        Canvas canvas2 = canvas;
        vy vyVar = this.f26842m3;
        hx hxVar = vyVar.P;
        super.J0(canvas, rectF, j10);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.f26840k3 != getChildCount()) {
            B1();
            this.f26840k3 = getChildCount();
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            sparseArray = this.f26835f3;
            int size = sparseArray.size();
            arrayList = this.f26838i3;
            if (i12 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i12);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i12++;
        }
        sparseArray.clear();
        int i13 = 1;
        if (vyVar.f31925v2 > 0 && SystemClock.elapsedRealtime() - vyVar.f31925v2 < z1() && vyVar.f31916s2 != null && vyVar.f31919t2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f7 = 0.0f;
        if (vyVar.f31869d2 != null && hxVar != null) {
            int i14 = 0;
            while (i14 < hxVar.getChildCount()) {
                View childAt = hxVar.getChildAt(i14);
                if (childAt instanceof ey) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) i0.a.v(i13, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((ey) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == vyVar.f31919t2 - i13) {
                    z11 = z10;
                    float interpolation = gr.f26496g.getInterpolation(w7.u.a(((float) (SystemClock.elapsedRealtime() - vyVar.f31925v2)) / 140.0f, f7, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i10 = i14;
                    } else {
                        float f10 = 1.0f - interpolation;
                        i10 = i14;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        vyVar.f31916s2.draw(canvas2);
                        canvas2.restore();
                    }
                } else {
                    i10 = i14;
                    z11 = z10;
                }
                i14 = i10 + 1;
                z10 = z11;
                f7 = 0.0f;
                i13 = 1;
            }
        }
        ArrayList arrayList5 = this.f26837h3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f26836g3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i15 = 0;
        while (true) {
            int size2 = sparseArray.size();
            fx fxVar = null;
            arrayList2 = this.f26839j3;
            if (i15 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i15);
            ey eyVar = (ey) arrayList7.get(i11);
            int i16 = eyVar.f25888a;
            int i17 = i11;
            while (true) {
                if (i17 >= arrayList5.size()) {
                    break;
                } else if (((fx) arrayList5.get(i17)).M == i16) {
                    fxVar = (fx) arrayList5.get(i17);
                    arrayList5.remove(i17);
                    break;
                } else {
                    i17++;
                }
            }
            if (fxVar == null) {
                if (!arrayList2.isEmpty()) {
                    fxVar = (fx) i0.a.v(1, arrayList2);
                } else {
                    fxVar = new fx(this);
                }
                fxVar.M = i16;
                fxVar.e();
            }
            arrayList6.add(fxVar);
            fxVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(eyVar.getLeft(), eyVar.getY() + eyVar.getPaddingTop());
            fxVar.N = eyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (eyVar.getLeft() * 2);
            int measuredHeight = eyVar.getMeasuredHeight() - eyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                fxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i15++;
            canvas2 = canvas;
            i11 = 0;
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((fx) arrayList5.get(i18));
                ((fx) arrayList5.get(i18)).O = null;
                ((fx) arrayList5.get(i18)).k();
            } else {
                ((fx) arrayList5.get(i18)).f();
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
        vy vyVar = this.f26842m3;
        hx hxVar = vyVar.P;
        vyVar.f31899n2.g();
        if (this.f26840k3 != getChildCount()) {
            B1();
            this.f26840k3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.f26835f3;
            int size = sparseArray.size();
            arrayList = this.f26838i3;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        if (vyVar.f31925v2 > 0 && SystemClock.elapsedRealtime() - vyVar.f31925v2 < z1() && vyVar.f31916s2 != null && vyVar.f31919t2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (vyVar.f31869d2 != null && hxVar != null) {
            for (int i12 = 0; i12 < hxVar.getChildCount(); i12++) {
                View childAt = hxVar.getChildAt(i12);
                if (childAt instanceof ey) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) i0.a.v(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((ey) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == vyVar.f31919t2 - 1) {
                    float interpolation = gr.f26496g.getInterpolation(w7.u.a(((float) (SystemClock.elapsedRealtime() - vyVar.f31925v2)) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f7 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f7), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f10 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f10, f10, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        vyVar.f31916s2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.f26837h3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f26836g3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            fx fxVar = null;
            arrayList2 = this.f26839j3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            ey eyVar = (ey) arrayList7.get(i10);
            int i14 = eyVar.f25888a;
            int i15 = i10;
            while (true) {
                if (i15 >= arrayList5.size()) {
                    break;
                } else if (((fx) arrayList5.get(i15)).M == i14) {
                    fxVar = (fx) arrayList5.get(i15);
                    arrayList5.remove(i15);
                    break;
                } else {
                    i15++;
                }
            }
            if (fxVar == null) {
                if (!arrayList2.isEmpty()) {
                    fxVar = (fx) i0.a.v(1, arrayList2);
                } else {
                    fxVar = new fx(this);
                }
                fxVar.M = i14;
                fxVar.e();
            }
            arrayList6.add(fxVar);
            fxVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(eyVar.getLeft(), eyVar.getY() + eyVar.getPaddingTop());
            fxVar.N = eyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (eyVar.getLeft() * 2);
            int measuredHeight = eyVar.getMeasuredHeight() - eyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                fxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i13++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((fx) arrayList5.get(i16));
                ((fx) arrayList5.get(i16)).O = null;
                ((fx) arrayList5.get(i16)).k();
            } else {
                ((fx) arrayList5.get(i16)).f();
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
            if (this.f26841l3 == null) {
                this.f26841l3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y3 = motionEvent.getY(actionIndex);
            View E = E(x10, y3);
            if (z10) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f26531a = x10;
                    obj.f26532b = y3;
                    obj.f26533c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f26841l3.put(pointerId, obj);
                    C0();
                }
            } else {
                gx gxVar = (gx) this.f26841l3.get(pointerId);
                this.f26841l3.remove(pointerId);
                if (E != null && gxVar != null) {
                    if (Math.sqrt(Math.pow(y3 - gxVar.f26532b, 2.0d) + Math.pow(x10 - gxVar.f26531a, 2.0d)) < org.telegram.messenger.i0.e * 3.0f && !z12) {
                        vy vyVar = this.f26842m3;
                        if (!vyVar.B1.isShowing() || SystemClock.elapsedRealtime() - gxVar.f26533c < ViewConfiguration.getLongPressTimeout()) {
                            View view = gxVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof ey) {
                                    vy.b(vyVar, (ey) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof kx) {
                                    vyVar.R.E(R, (kx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (gxVar != null && (gxVar.d.getBackground() instanceof RippleDrawable)) {
                    gxVar.d.getBackground().setState(new int[0]);
                }
                if (gxVar != null) {
                    gxVar.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z12 || this.f26841l3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void k0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            vy vyVar = this.f26842m3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                vyVar.N(true);
            }
            if (!canScrollVertically(1)) {
                vy.e(vyVar, 1, org.telegram.messenger.i0.L(36.0f));
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
        o5.release(this, this.f26842m3.f31869d2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.f26836g3;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((fx) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f26839j3;
            if (i10 < arrayList2.size()) {
                ((fx) arrayList2.get(i10)).f();
                i10++;
            } else {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vy vyVar = this.f26842m3;
        if (!vyVar.f31873f) {
            boolean q6 = org.telegram.ui.lt.p().q(motionEvent, this, vyVar.f31879g2, this.f30625n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !q6) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        vy vyVar = this.f26842m3;
        if (vyVar.f31867d0 && vyVar.f31864c0) {
            this.f26834e3 = true;
            vyVar.Q.h1(0, 0);
            vyVar.f31864c0 = false;
            this.f26834e3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        vyVar.l(true);
        B1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        this.f26834e3 = true;
        int size = View.MeasureSpec.getSize(i10);
        vy vyVar = this.f26842m3;
        vw vwVar = vyVar.Q;
        int i12 = vwVar.J;
        if (org.telegram.messenger.i0.Q1()) {
            f7 = 60.0f;
        } else {
            f7 = 45.0f;
        }
        vwVar.y1(Math.max(1, size / org.telegram.messenger.i0.L(f7)));
        this.f26834e3 = false;
        super.onMeasure(i10, i11);
        if (i12 != vwVar.J) {
            vyVar.R.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        vy vyVar = this.f26842m3;
        int[] iArr = vyVar.D1;
        ju juVar = vyVar.B1;
        if (vyVar.R1 != null && juVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f7 = vyVar.U1;
                    if (f7 != -10000.0f) {
                        if (Math.abs(f7 - motionEvent.getX()) > org.telegram.messenger.i0.a1(true, 0.2f) || Math.abs(vyVar.V1 - motionEvent.getY()) > org.telegram.messenger.i0.a1(false, 0.2f)) {
                            vyVar.U1 = -10000.0f;
                            vyVar.V1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x10 = motionEvent.getX() + iArr[0];
                    juVar.f27495c.getLocationOnScreen(iArr);
                    int L = (int) (x10 - (org.telegram.messenger.i0.L(3.0f) + iArr[0]));
                    boolean z10 = juVar.d;
                    iu iuVar = juVar.f27495c;
                    if (!z10) {
                        int max = Math.max(0, Math.min(5, L / (org.telegram.messenger.i0.L(4.0f) + juVar.e)));
                        if (iuVar.f27089n[0] != max) {
                            org.telegram.messenger.i0.b4(iuVar);
                            int[] iArr2 = iuVar.f27089n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                iuVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (juVar != null && juVar.isShowing() && !juVar.d) {
                    juVar.dismiss();
                    int i10 = juVar.f27495c.f27089n[0];
                    if (i10 >= 1 && i10 <= 5) {
                        str = (String) org.telegram.messenger.k4.f16523a.get(i10 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) vyVar.R1.getTag();
                    if (!vyVar.R1.f25890c) {
                        if (str != null) {
                            org.telegram.messenger.k6.f16536j.put(str2, str);
                            str2 = vy.g(str2, str);
                        } else {
                            org.telegram.messenger.k6.f16536j.remove(str2);
                        }
                        vyVar.R1.a(org.telegram.messenger.k6.f(str2), vyVar.R1.f25890c);
                        vy.b(vyVar, vyVar.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.k6.q();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            vy.b(vyVar, vyVar.R1, vy.g(replace, str));
                        } else {
                            vy.b(vyVar, vyVar.R1, replace);
                        }
                    }
                }
                if (juVar == null || !juVar.d) {
                    vyVar.R1 = null;
                }
                vyVar.U1 = -10000.0f;
                vyVar.V1 = -10000.0f;
            }
            if (juVar == null || !juVar.d || juVar.isShowing()) {
                return true;
            }
        }
        vyVar.S1 = motionEvent.getX();
        vyVar.T1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f26834e3) {
            return;
        }
        super.requestLayout();
    }

    public final long z1() {
        vy vyVar = this.f26842m3;
        return Math.max(400L, Math.min(45, vyVar.f31922u2 - vyVar.f31919t2) * 35) + Math.max(600L, Math.min(55, vyVar.f31922u2 - vyVar.f31919t2) * 40) + 150;
    }
}
