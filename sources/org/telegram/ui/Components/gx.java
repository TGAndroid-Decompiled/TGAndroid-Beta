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
public final class gx extends ek0 {
    public boolean f35693f3;
    public final SparseArray f35694g3;
    public final ArrayList f35695h3;
    public final ArrayList f35696i3;
    public final ArrayList j3;
    public final ArrayList f35697k3;
    public int f35698l3;
    public SparseArray f35699m3;
    public final ty f35700n3;

    public gx(ty tyVar, Context context) {
        super(context, null);
        this.f35700n3 = tyVar;
        this.f35694g3 = new SparseArray();
        this.f35695h3 = new ArrayList();
        this.f35696i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.f35697k3 = new ArrayList();
        this.f35698l3 = -1;
        new SparseIntArray();
        nr nrVar = nr.f37960f;
    }

    public final void A1(View view) {
        if (this.f35699m3 != null) {
            int i7 = 0;
            while (i7 < this.f35699m3.size()) {
                fx fxVar = (fx) this.f35699m3.valueAt(i7);
                if (fxVar.d == view) {
                    this.f35699m3.removeAt(i7);
                    i7--;
                    View view2 = fxVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        fxVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = fxVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i7++;
            }
        }
    }

    public final void B1() {
        ty tyVar = this.f35700n3;
        int i7 = tyVar.f40086c;
        gx gxVar = tyVar.Q;
        gx gxVar2 = tyVar.Q;
        y5[] y5VarArr = new y5[gxVar.getChildCount()];
        for (int i10 = 0; i10 < gxVar2.getChildCount(); i10++) {
            View childAt = gxVar2.getChildAt(i10);
            if (childAt instanceof cy) {
                y5VarArr[i10] = ((cy) childAt).getSpan();
            }
        }
        tyVar.f40095e2 = y5.update(i7, this, y5VarArr, tyVar.f40095e2);
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
        ty tyVar = this.f35700n3;
        gx gxVar = tyVar.Q;
        super.J0(canvas, rectF, j3);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.f35698l3 != getChildCount()) {
            B1();
            this.f35698l3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.f35694g3;
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
        if (tyVar.f40151w2 > 0 && SystemClock.elapsedRealtime() - tyVar.f40151w2 < z1() && tyVar.f40141t2 != null && tyVar.f40144u2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (tyVar.f40095e2 != null && gxVar != null) {
            int i13 = 0;
            while (i13 < gxVar.getChildCount()) {
                View childAt = gxVar.getChildAt(i13);
                if (childAt instanceof cy) {
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
                    arrayList4.add((cy) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == tyVar.f40144u2 - i12) {
                    z11 = z10;
                    float interpolation = nr.f37961g.getInterpolation(c8.l9.a(((float) (SystemClock.elapsedRealtime() - tyVar.f40151w2)) / 140.0f, f10, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i7 = i13;
                    } else {
                        float f11 = 1.0f - interpolation;
                        i7 = i13;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f11), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f12 = (f11 * 0.5f) + 0.5f;
                        canvas2.scale(f12, f12, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        tyVar.f40141t2.draw(canvas2);
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
        ArrayList arrayList5 = this.f35696i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f35695h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i14 = 0;
        while (true) {
            int size2 = sparseArray.size();
            ex exVar = null;
            arrayList2 = this.f35697k3;
            if (i14 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i14);
            cy cyVar = (cy) arrayList7.get(i10);
            int i15 = cyVar.f34324a;
            int i16 = i10;
            while (true) {
                if (i16 >= arrayList5.size()) {
                    break;
                } else if (((ex) arrayList5.get(i16)).N == i15) {
                    exVar = (ex) arrayList5.get(i16);
                    arrayList5.remove(i16);
                    break;
                } else {
                    i16++;
                }
            }
            if (exVar == null) {
                if (!arrayList2.isEmpty()) {
                    exVar = (ex) p5.c.g(1, arrayList2);
                } else {
                    exVar = new ex(this);
                }
                exVar.N = i15;
                exVar.e();
            }
            arrayList6.add(exVar);
            exVar.P = arrayList7;
            canvas2.save();
            canvas2.translate(cyVar.getLeft(), cyVar.getY() + cyVar.getPaddingTop());
            exVar.O = cyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (cyVar.getLeft() * 2);
            int measuredHeight = cyVar.getMeasuredHeight() - cyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                exVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i14++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((ex) arrayList5.get(i17));
                ((ex) arrayList5.get(i17)).P = null;
                ((ex) arrayList5.get(i17)).k();
            } else {
                ((ex) arrayList5.get(i17)).f();
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
        ty tyVar = this.f35700n3;
        gx gxVar = tyVar.Q;
        tyVar.f40124o2.g();
        if (this.f35698l3 != getChildCount()) {
            B1();
            this.f35698l3 = getChildCount();
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            sparseArray = this.f35694g3;
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
        if (tyVar.f40151w2 > 0 && SystemClock.elapsedRealtime() - tyVar.f40151w2 < z1() && tyVar.f40141t2 != null && tyVar.f40144u2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (tyVar.f40095e2 != null && gxVar != null) {
            for (int i11 = 0; i11 < gxVar.getChildCount(); i11++) {
                View childAt = gxVar.getChildAt(i11);
                if (childAt instanceof cy) {
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
                    arrayList4.add((cy) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == tyVar.f40144u2 - 1) {
                    float interpolation = nr.f37961g.getInterpolation(c8.l9.a(((float) (SystemClock.elapsedRealtime() - tyVar.f40151w2)) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f10 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        tyVar.f40141t2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.f35696i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f35695h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i12 = 0;
        while (true) {
            int size2 = sparseArray.size();
            ex exVar = null;
            arrayList2 = this.f35697k3;
            if (i12 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
            cy cyVar = (cy) arrayList7.get(i7);
            int i13 = cyVar.f34324a;
            int i14 = i7;
            while (true) {
                if (i14 >= arrayList5.size()) {
                    break;
                } else if (((ex) arrayList5.get(i14)).N == i13) {
                    exVar = (ex) arrayList5.get(i14);
                    arrayList5.remove(i14);
                    break;
                } else {
                    i14++;
                }
            }
            if (exVar == null) {
                if (!arrayList2.isEmpty()) {
                    exVar = (ex) p5.c.g(1, arrayList2);
                } else {
                    exVar = new ex(this);
                }
                exVar.N = i13;
                exVar.e();
            }
            arrayList6.add(exVar);
            exVar.P = arrayList7;
            canvas2.save();
            canvas2.translate(cyVar.getLeft(), cyVar.getY() + cyVar.getPaddingTop());
            exVar.O = cyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (cyVar.getLeft() * 2);
            int measuredHeight = cyVar.getMeasuredHeight() - cyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                exVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i12++;
            canvas2 = canvas;
            i7 = 0;
        }
        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((ex) arrayList5.get(i15));
                ((ex) arrayList5.get(i15)).P = null;
                ((ex) arrayList5.get(i15)).k();
            } else {
                ((ex) arrayList5.get(i15)).f();
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
            if (this.f35699m3 == null) {
                this.f35699m3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            View E = E(x10, y10);
            if (z10) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f35324a = x10;
                    obj.f35325b = y10;
                    obj.f35326c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f35699m3.put(pointerId, obj);
                    C0();
                }
            } else {
                fx fxVar = (fx) this.f35699m3.get(pointerId);
                this.f35699m3.remove(pointerId);
                if (E != null && fxVar != null) {
                    if (Math.sqrt(Math.pow(y10 - fxVar.f35325b, 2.0d) + Math.pow(x10 - fxVar.f35324a, 2.0d)) < org.telegram.messenger.g0.f24025e * 3.0f && !z12) {
                        ty tyVar = this.f35700n3;
                        if (!tyVar.C1.isShowing() || SystemClock.elapsedRealtime() - fxVar.f35326c < ViewConfiguration.getLongPressTimeout()) {
                            View view = fxVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof cy) {
                                    ty.d(tyVar, (cy) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof jx) {
                                    tyVar.S.E(R, (jx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (fxVar != null && (fxVar.d.getBackground() instanceof RippleDrawable)) {
                    fxVar.d.getBackground().setState(new int[0]);
                }
                if (fxVar != null) {
                    fxVar.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z12 || this.f35699m3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void k0(int i7) {
        if (i7 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            ty tyVar = this.f35700n3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                tyVar.N(true);
            }
            if (!canScrollVertically(1)) {
                ty.e(tyVar, 1, org.telegram.messenger.g0.L(36.0f));
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
        y5.release(this, this.f35700n3.f40095e2);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            arrayList = this.f35695h3;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((ex) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.f35697k3;
            if (i7 < arrayList2.size()) {
                ((ex) arrayList2.get(i7)).f();
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
        ty tyVar = this.f35700n3;
        if (!tyVar.f40096f) {
            boolean q10 = org.telegram.ui.ns.p().q(motionEvent, this, tyVar.f40105h2, this.f34873o2);
            if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ty tyVar = this.f35700n3;
        if (tyVar.f40093e0 && tyVar.f40090d0) {
            this.f35693f3 = true;
            tyVar.R.h1(0, 0);
            tyVar.f40090d0 = false;
            this.f35693f3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        tyVar.l(true);
        B1();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        this.f35693f3 = true;
        int size = View.MeasureSpec.getSize(i7);
        ty tyVar = this.f35700n3;
        uw uwVar = tyVar.R;
        int i11 = uwVar.J;
        if (org.telegram.messenger.g0.Q1()) {
            f10 = 60.0f;
        } else {
            f10 = 45.0f;
        }
        uwVar.y1(Math.max(1, size / org.telegram.messenger.g0.L(f10)));
        this.f35693f3 = false;
        super.onMeasure(i7, i10);
        if (i11 != uwVar.J) {
            tyVar.S.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        ty tyVar = this.f35700n3;
        int[] iArr = tyVar.E1;
        ku kuVar = tyVar.C1;
        if (tyVar.S1 != null && kuVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f10 = tyVar.V1;
                    if (f10 != -10000.0f) {
                        if (Math.abs(f10 - motionEvent.getX()) > org.telegram.messenger.g0.a1(true, 0.2f) || Math.abs(tyVar.W1 - motionEvent.getY()) > org.telegram.messenger.g0.a1(false, 0.2f)) {
                            tyVar.V1 = -10000.0f;
                            tyVar.W1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x10 = motionEvent.getX() + iArr[0];
                    kuVar.f36984c.getLocationOnScreen(iArr);
                    int L = (int) (x10 - (org.telegram.messenger.g0.L(3.0f) + iArr[0]));
                    boolean z10 = kuVar.d;
                    ju juVar = kuVar.f36984c;
                    if (!z10) {
                        int max = Math.max(0, Math.min(5, L / (org.telegram.messenger.g0.L(4.0f) + kuVar.f36985e)));
                        if (juVar.f36691n[0] != max) {
                            org.telegram.messenger.g0.a4(juVar);
                            int[] iArr2 = juVar.f36691n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                juVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (kuVar != null && kuVar.isShowing() && !kuVar.d) {
                    kuVar.dismiss();
                    int i7 = kuVar.f36984c.f36691n[0];
                    if (i7 >= 1 && i7 <= 5) {
                        str = (String) org.telegram.messenger.j4.f24826a.get(i7 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) tyVar.S1.getTag();
                    if (!tyVar.S1.f34326c) {
                        if (str != null) {
                            org.telegram.messenger.j6.f24837j.put(str2, str);
                            str2 = ty.g(str2, str);
                        } else {
                            org.telegram.messenger.j6.f24837j.remove(str2);
                        }
                        tyVar.S1.a(org.telegram.messenger.j6.f(str2), tyVar.S1.f34326c);
                        ty.d(tyVar, tyVar.S1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.j6.q();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            ty.d(tyVar, tyVar.S1, ty.g(replace, str));
                        } else {
                            ty.d(tyVar, tyVar.S1, replace);
                        }
                    }
                }
                if (kuVar == null || !kuVar.d) {
                    tyVar.S1 = null;
                }
                tyVar.V1 = -10000.0f;
                tyVar.W1 = -10000.0f;
            }
            if (kuVar == null || !kuVar.d || kuVar.isShowing()) {
                return true;
            }
        }
        tyVar.T1 = motionEvent.getX();
        tyVar.U1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f35693f3) {
            return;
        }
        super.requestLayout();
    }

    public final long z1() {
        ty tyVar = this.f35700n3;
        return Math.max(400L, Math.min(45, tyVar.f40147v2 - tyVar.f40144u2) * 35) + Math.max(600L, Math.min(55, tyVar.f40147v2 - tyVar.f40144u2) * 40) + 150;
    }
}
