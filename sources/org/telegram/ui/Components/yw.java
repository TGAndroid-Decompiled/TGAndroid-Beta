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
public final class yw extends uj0 {
    public boolean f42163f3;
    public final SparseArray f42164g3;
    public final ArrayList f42165h3;
    public final ArrayList f42166i3;
    public final ArrayList j3;
    public final ArrayList f42167k3;
    public int f42168l3;
    public SparseArray f42169m3;
    public final ly f42170n3;

    public yw(ly lyVar, Context context) {
        super(context, null);
        this.f42170n3 = lyVar;
        this.f42164g3 = new SparseArray();
        this.f42165h3 = new ArrayList();
        this.f42166i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.f42167k3 = new ArrayList();
        this.f42168l3 = -1;
        new SparseIntArray();
        er erVar = er.f34420f;
    }

    public final void A1(View view) {
        if (this.f42169m3 != null) {
            int i7 = 0;
            while (i7 < this.f42169m3.size()) {
                xw xwVar = (xw) this.f42169m3.valueAt(i7);
                if (xwVar.d == view) {
                    this.f42169m3.removeAt(i7);
                    i7--;
                    View view2 = xwVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        xwVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = xwVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i7++;
            }
        }
    }

    public final void B1() {
        ly lyVar = this.f42170n3;
        int i7 = lyVar.f36936c;
        yw ywVar = lyVar.Q;
        yw ywVar2 = lyVar.Q;
        p5[] p5VarArr = new p5[ywVar.getChildCount()];
        for (int i10 = 0; i10 < ywVar2.getChildCount(); i10++) {
            View childAt = ywVar2.getChildAt(i10);
            if (childAt instanceof ux) {
                p5VarArr[i10] = ((ux) childAt).getSpan();
            }
        }
        lyVar.f36945e2 = p5.update(i7, this, p5VarArr, lyVar.f36945e2);
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
        ly lyVar = this.f42170n3;
        yw ywVar = lyVar.Q;
        super.J0(canvas, rectF, j3);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.f42168l3 != getChildCount()) {
            B1();
            this.f42168l3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.f42164g3;
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
        if (lyVar.f37001w2 > 0 && SystemClock.elapsedRealtime() - lyVar.f37001w2 < z1() && lyVar.f36991t2 != null && lyVar.f36994u2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (lyVar.f36945e2 != null && ywVar != null) {
            int i13 = 0;
            while (i13 < ywVar.getChildCount()) {
                View childAt = ywVar.getChildAt(i13);
                if (childAt instanceof ux) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) r.b.g(i12, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((ux) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == lyVar.f36994u2 - i12) {
                    z11 = z10;
                    float interpolation = er.f34421g.getInterpolation(c8.i9.a(((float) (SystemClock.elapsedRealtime() - lyVar.f37001w2)) / 140.0f, f10, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i7 = i13;
                    } else {
                        float f11 = 1.0f - interpolation;
                        i7 = i13;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f11), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f12 = (f11 * 0.5f) + 0.5f;
                        canvas2.scale(f12, f12, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        lyVar.f36991t2.draw(canvas2);
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
        ArrayList arrayList5 = this.f42166i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f42165h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i14 = 0;
        while (true) {
            int size2 = sparseArray.size();
            ww wwVar = null;
            arrayList2 = this.f42167k3;
            if (i14 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i14);
            ux uxVar = (ux) arrayList7.get(i10);
            int i15 = uxVar.f40179a;
            int i16 = i10;
            while (true) {
                if (i16 >= arrayList5.size()) {
                    break;
                } else if (((ww) arrayList5.get(i16)).N == i15) {
                    wwVar = (ww) arrayList5.get(i16);
                    arrayList5.remove(i16);
                    break;
                } else {
                    i16++;
                }
            }
            if (wwVar == null) {
                if (!arrayList2.isEmpty()) {
                    wwVar = (ww) r.b.g(1, arrayList2);
                } else {
                    wwVar = new ww(this);
                }
                wwVar.N = i15;
                wwVar.e();
            }
            arrayList6.add(wwVar);
            wwVar.P = arrayList7;
            canvas2.save();
            canvas2.translate(uxVar.getLeft(), uxVar.getY() + uxVar.getPaddingTop());
            wwVar.O = uxVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (uxVar.getLeft() * 2);
            int measuredHeight = uxVar.getMeasuredHeight() - uxVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                wwVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i14++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((ww) arrayList5.get(i17));
                ((ww) arrayList5.get(i17)).P = null;
                ((ww) arrayList5.get(i17)).k();
            } else {
                ((ww) arrayList5.get(i17)).f();
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
        ly lyVar = this.f42170n3;
        yw ywVar = lyVar.Q;
        lyVar.f36974o2.g();
        if (this.f42168l3 != getChildCount()) {
            B1();
            this.f42168l3 = getChildCount();
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            sparseArray = this.f42164g3;
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
        if (lyVar.f37001w2 > 0 && SystemClock.elapsedRealtime() - lyVar.f37001w2 < z1() && lyVar.f36991t2 != null && lyVar.f36994u2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (lyVar.f36945e2 != null && ywVar != null) {
            for (int i11 = 0; i11 < ywVar.getChildCount(); i11++) {
                View childAt = ywVar.getChildAt(i11);
                if (childAt instanceof ux) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) r.b.g(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((ux) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == lyVar.f36994u2 - 1) {
                    float interpolation = er.f34421g.getInterpolation(c8.i9.a(((float) (SystemClock.elapsedRealtime() - lyVar.f37001w2)) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f10 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        lyVar.f36991t2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.f42166i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f42165h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i12 = 0;
        while (true) {
            int size2 = sparseArray.size();
            ww wwVar = null;
            arrayList2 = this.f42167k3;
            if (i12 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
            ux uxVar = (ux) arrayList7.get(i7);
            int i13 = uxVar.f40179a;
            int i14 = i7;
            while (true) {
                if (i14 >= arrayList5.size()) {
                    break;
                } else if (((ww) arrayList5.get(i14)).N == i13) {
                    wwVar = (ww) arrayList5.get(i14);
                    arrayList5.remove(i14);
                    break;
                } else {
                    i14++;
                }
            }
            if (wwVar == null) {
                if (!arrayList2.isEmpty()) {
                    wwVar = (ww) r.b.g(1, arrayList2);
                } else {
                    wwVar = new ww(this);
                }
                wwVar.N = i13;
                wwVar.e();
            }
            arrayList6.add(wwVar);
            wwVar.P = arrayList7;
            canvas2.save();
            canvas2.translate(uxVar.getLeft(), uxVar.getY() + uxVar.getPaddingTop());
            wwVar.O = uxVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (uxVar.getLeft() * 2);
            int measuredHeight = uxVar.getMeasuredHeight() - uxVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                wwVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i12++;
            canvas2 = canvas;
            i7 = 0;
        }
        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((ww) arrayList5.get(i15));
                ((ww) arrayList5.get(i15)).P = null;
                ((ww) arrayList5.get(i15)).k();
            } else {
                ((ww) arrayList5.get(i15)).f();
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
            if (this.f42169m3 == null) {
                this.f42169m3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            View E = E(x10, y10);
            if (z10) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f41776a = x10;
                    obj.f41777b = y10;
                    obj.f41778c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f42169m3.put(pointerId, obj);
                    C0();
                }
            } else {
                xw xwVar = (xw) this.f42169m3.get(pointerId);
                this.f42169m3.remove(pointerId);
                if (E != null && xwVar != null) {
                    if (Math.sqrt(Math.pow(y10 - xwVar.f41777b, 2.0d) + Math.pow(x10 - xwVar.f41776a, 2.0d)) < org.telegram.messenger.g0.f23588e * 3.0f && !z12) {
                        ly lyVar = this.f42170n3;
                        if (!lyVar.C1.isShowing() || SystemClock.elapsedRealtime() - xwVar.f41778c < ViewConfiguration.getLongPressTimeout()) {
                            View view = xwVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof ux) {
                                    ly.d(lyVar, (ux) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof bx) {
                                    lyVar.S.E(R, (bx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (xwVar != null && (xwVar.d.getBackground() instanceof RippleDrawable)) {
                    xwVar.d.getBackground().setState(new int[0]);
                }
                if (xwVar != null) {
                    xwVar.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z12 || this.f42169m3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void k0(int i7) {
        if (i7 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            ly lyVar = this.f42170n3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                lyVar.N(true);
            }
            if (!canScrollVertically(1)) {
                ly.e(lyVar, 1, org.telegram.messenger.g0.L(36.0f));
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
        p5.release(this, this.f42170n3.f36945e2);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            arrayList = this.f42165h3;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((ww) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.f42167k3;
            if (i7 < arrayList2.size()) {
                ((ww) arrayList2.get(i7)).f();
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
        ly lyVar = this.f42170n3;
        if (!lyVar.f36946f) {
            boolean q10 = org.telegram.ui.ns.p().q(motionEvent, this, lyVar.f36955h2, this.f40069o2);
            if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ly lyVar = this.f42170n3;
        if (lyVar.f36943e0 && lyVar.f36940d0) {
            this.f42163f3 = true;
            lyVar.R.h1(0, 0);
            lyVar.f36940d0 = false;
            this.f42163f3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        lyVar.l(true);
        B1();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        this.f42163f3 = true;
        int size = View.MeasureSpec.getSize(i7);
        ly lyVar = this.f42170n3;
        mw mwVar = lyVar.R;
        int i11 = mwVar.J;
        if (org.telegram.messenger.g0.Q1()) {
            f10 = 60.0f;
        } else {
            f10 = 45.0f;
        }
        mwVar.y1(Math.max(1, size / org.telegram.messenger.g0.L(f10)));
        this.f42163f3 = false;
        super.onMeasure(i7, i10);
        if (i11 != mwVar.J) {
            lyVar.S.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        ly lyVar = this.f42170n3;
        int[] iArr = lyVar.E1;
        du duVar = lyVar.C1;
        if (lyVar.S1 != null && duVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f10 = lyVar.V1;
                    if (f10 != -10000.0f) {
                        if (Math.abs(f10 - motionEvent.getX()) > org.telegram.messenger.g0.a1(true, 0.2f) || Math.abs(lyVar.W1 - motionEvent.getY()) > org.telegram.messenger.g0.a1(false, 0.2f)) {
                            lyVar.V1 = -10000.0f;
                            lyVar.W1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x10 = motionEvent.getX() + iArr[0];
                    duVar.f34069c.getLocationOnScreen(iArr);
                    int L = (int) (x10 - (org.telegram.messenger.g0.L(3.0f) + iArr[0]));
                    boolean z10 = duVar.d;
                    cu cuVar = duVar.f34069c;
                    if (!z10) {
                        int max = Math.max(0, Math.min(5, L / (org.telegram.messenger.g0.L(4.0f) + duVar.f34070e)));
                        if (cuVar.f33678n[0] != max) {
                            org.telegram.messenger.g0.b4(cuVar);
                            int[] iArr2 = cuVar.f33678n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                cuVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (duVar != null && duVar.isShowing() && !duVar.d) {
                    duVar.dismiss();
                    int i7 = duVar.f34069c.f33678n[0];
                    if (i7 >= 1 && i7 <= 5) {
                        str = (String) org.telegram.messenger.h4.f24053a.get(i7 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) lyVar.S1.getTag();
                    if (!lyVar.S1.f40181c) {
                        if (str != null) {
                            org.telegram.messenger.j6.f24527j.put(str2, str);
                            str2 = ly.g(str2, str);
                        } else {
                            org.telegram.messenger.j6.f24527j.remove(str2);
                        }
                        lyVar.S1.a(org.telegram.messenger.j6.f(str2), lyVar.S1.f40181c);
                        ly.d(lyVar, lyVar.S1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.j6.q();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            ly.d(lyVar, lyVar.S1, ly.g(replace, str));
                        } else {
                            ly.d(lyVar, lyVar.S1, replace);
                        }
                    }
                }
                if (duVar == null || !duVar.d) {
                    lyVar.S1 = null;
                }
                lyVar.V1 = -10000.0f;
                lyVar.W1 = -10000.0f;
            }
            if (duVar == null || !duVar.d || duVar.isShowing()) {
                return true;
            }
        }
        lyVar.T1 = motionEvent.getX();
        lyVar.U1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f42163f3) {
            return;
        }
        super.requestLayout();
    }

    public final long z1() {
        ly lyVar = this.f42170n3;
        return Math.max(400L, Math.min(45, lyVar.f36997v2 - lyVar.f36994u2) * 35) + Math.max(600L, Math.min(55, lyVar.f36997v2 - lyVar.f36994u2) * 40) + 150;
    }
}
