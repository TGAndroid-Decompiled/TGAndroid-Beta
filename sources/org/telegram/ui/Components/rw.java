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
public final class rw extends tj0 {
    public boolean f37813f3;
    public final SparseArray f37814g3;
    public final ArrayList f37815h3;
    public final ArrayList i3;
    public final ArrayList f37816j3;
    public final ArrayList f37817k3;
    public int f37818l3;
    public SparseArray f37819m3;
    public final ey f37820n3;

    public rw(ey eyVar, Context context) {
        super(context, null);
        this.f37820n3 = eyVar;
        this.f37814g3 = new SparseArray();
        this.f37815h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.f37816j3 = new ArrayList();
        this.f37817k3 = new ArrayList();
        this.f37818l3 = -1;
        new SparseIntArray();
        xq xqVar = xq.f40452f;
    }

    public final void A1(View view) {
        if (this.f37819m3 != null) {
            int i3 = 0;
            while (i3 < this.f37819m3.size()) {
                qw qwVar = (qw) this.f37819m3.valueAt(i3);
                if (qwVar.d == view) {
                    this.f37819m3.removeAt(i3);
                    i3--;
                    View view2 = qwVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        qwVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = qwVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i3++;
            }
        }
    }

    public final void B1() {
        ey eyVar = this.f37820n3;
        int i3 = eyVar.f33525c;
        rw rwVar = eyVar.Q;
        rw rwVar2 = eyVar.Q;
        p5[] p5VarArr = new p5[rwVar.getChildCount()];
        for (int i10 = 0; i10 < rwVar2.getChildCount(); i10++) {
            View childAt = rwVar2.getChildAt(i10);
            if (childAt instanceof nx) {
                p5VarArr[i10] = ((nx) childAt).getSpan();
            }
        }
        eyVar.f33534e2 = p5.update(i3, this, p5VarArr, eyVar.f33534e2);
    }

    @Override
    public final void J0(Canvas canvas, RectF rectF, long j10) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        int i3;
        boolean z11;
        Canvas canvas2 = canvas;
        ey eyVar = this.f37820n3;
        rw rwVar = eyVar.Q;
        super.J0(canvas, rectF, j10);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.f37818l3 != getChildCount()) {
            B1();
            this.f37818l3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.f37814g3;
            int size = sparseArray.size();
            arrayList = this.f37816j3;
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
        if (eyVar.f33590w2 > 0 && SystemClock.elapsedRealtime() - eyVar.f33590w2 < z1() && eyVar.f33580t2 != null && eyVar.f33583u2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = 0.0f;
        if (eyVar.f33534e2 != null && rwVar != null) {
            int i13 = 0;
            while (i13 < rwVar.getChildCount()) {
                View childAt = rwVar.getChildAt(i13);
                if (childAt instanceof nx) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) org.telegram.ui.Cells.f1.o(i12, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((nx) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == eyVar.f33583u2 - i12) {
                    z11 = z10;
                    float interpolation = xq.f40453g.getInterpolation(b8.be.a(((float) (SystemClock.elapsedRealtime() - eyVar.f33590w2)) / 140.0f, f10, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i3 = i13;
                    } else {
                        float f11 = 1.0f - interpolation;
                        i3 = i13;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f11), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f12 = (f11 * 0.5f) + 0.5f;
                        canvas2.scale(f12, f12, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        eyVar.f33580t2.draw(canvas2);
                        canvas2.restore();
                    }
                } else {
                    i3 = i13;
                    z11 = z10;
                }
                i13 = i3 + 1;
                z10 = z11;
                f10 = 0.0f;
                i12 = 1;
            }
        }
        ArrayList arrayList5 = this.i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f37815h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i14 = 0;
        while (true) {
            int size2 = sparseArray.size();
            pw pwVar = null;
            arrayList2 = this.f37817k3;
            if (i14 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i14);
            nx nxVar = (nx) arrayList7.get(i10);
            int i15 = nxVar.f36636a;
            int i16 = i10;
            while (true) {
                if (i16 >= arrayList5.size()) {
                    break;
                } else if (((pw) arrayList5.get(i16)).N == i15) {
                    pwVar = (pw) arrayList5.get(i16);
                    arrayList5.remove(i16);
                    break;
                } else {
                    i16++;
                }
            }
            if (pwVar == null) {
                if (!arrayList2.isEmpty()) {
                    pwVar = (pw) org.telegram.ui.Cells.f1.o(1, arrayList2);
                } else {
                    pwVar = new pw(this);
                }
                pwVar.N = i15;
                pwVar.e();
            }
            arrayList6.add(pwVar);
            pwVar.P = arrayList7;
            canvas2.save();
            canvas2.translate(nxVar.getLeft(), nxVar.getY() + nxVar.getPaddingTop());
            pwVar.O = nxVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (nxVar.getLeft() * 2);
            int measuredHeight = nxVar.getMeasuredHeight() - nxVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                pwVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i14++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((pw) arrayList5.get(i17));
                ((pw) arrayList5.get(i17)).P = null;
                ((pw) arrayList5.get(i17)).k();
            } else {
                ((pw) arrayList5.get(i17)).f();
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
        ey eyVar = this.f37820n3;
        rw rwVar = eyVar.Q;
        eyVar.f33563o2.g();
        if (this.f37818l3 != getChildCount()) {
            B1();
            this.f37818l3 = getChildCount();
        }
        int i3 = 0;
        int i10 = 0;
        while (true) {
            sparseArray = this.f37814g3;
            int size = sparseArray.size();
            arrayList = this.f37816j3;
            if (i10 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i10);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i10++;
        }
        sparseArray.clear();
        if (eyVar.f33590w2 > 0 && SystemClock.elapsedRealtime() - eyVar.f33590w2 < z1() && eyVar.f33580t2 != null && eyVar.f33583u2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (eyVar.f33534e2 != null && rwVar != null) {
            for (int i11 = 0; i11 < rwVar.getChildCount(); i11++) {
                View childAt = rwVar.getChildAt(i11);
                if (childAt instanceof nx) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) org.telegram.ui.Cells.f1.o(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((nx) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == eyVar.f33583u2 - 1) {
                    float interpolation = xq.f40453g.getInterpolation(b8.be.a(((float) (SystemClock.elapsedRealtime() - eyVar.f33590w2)) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f10 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        eyVar.f33580t2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f37815h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i12 = 0;
        while (true) {
            int size2 = sparseArray.size();
            pw pwVar = null;
            arrayList2 = this.f37817k3;
            if (i12 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
            nx nxVar = (nx) arrayList7.get(i3);
            int i13 = nxVar.f36636a;
            int i14 = i3;
            while (true) {
                if (i14 >= arrayList5.size()) {
                    break;
                } else if (((pw) arrayList5.get(i14)).N == i13) {
                    pwVar = (pw) arrayList5.get(i14);
                    arrayList5.remove(i14);
                    break;
                } else {
                    i14++;
                }
            }
            if (pwVar == null) {
                if (!arrayList2.isEmpty()) {
                    pwVar = (pw) org.telegram.ui.Cells.f1.o(1, arrayList2);
                } else {
                    pwVar = new pw(this);
                }
                pwVar.N = i13;
                pwVar.e();
            }
            arrayList6.add(pwVar);
            pwVar.P = arrayList7;
            canvas2.save();
            canvas2.translate(nxVar.getLeft(), nxVar.getY() + nxVar.getPaddingTop());
            pwVar.O = nxVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (nxVar.getLeft() * 2);
            int measuredHeight = nxVar.getMeasuredHeight() - nxVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                pwVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i12++;
            canvas2 = canvas;
            i3 = 0;
        }
        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((pw) arrayList5.get(i15));
                ((pw) arrayList5.get(i15)).P = null;
                ((pw) arrayList5.get(i15)).k();
            } else {
                ((pw) arrayList5.get(i15)).f();
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
            if (this.f37819m3 == null) {
                this.f37819m3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y9 = motionEvent.getY(actionIndex);
            View E = E(x10, y9);
            if (z10) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f37550a = x10;
                    obj.f37551b = y9;
                    obj.f37552c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f37819m3.put(pointerId, obj);
                    C0();
                }
            } else {
                qw qwVar = (qw) this.f37819m3.get(pointerId);
                this.f37819m3.remove(pointerId);
                if (E != null && qwVar != null) {
                    if (Math.sqrt(Math.pow(y9 - qwVar.f37551b, 2.0d) + Math.pow(x10 - qwVar.f37550a, 2.0d)) < org.telegram.messenger.g0.f22587e * 3.0f && !z12) {
                        ey eyVar = this.f37820n3;
                        if (!eyVar.C1.isShowing() || SystemClock.elapsedRealtime() - qwVar.f37552c < ViewConfiguration.getLongPressTimeout()) {
                            View view = qwVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof nx) {
                                    ey.b(eyVar, (nx) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof uw) {
                                    eyVar.S.E(R, (uw) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (qwVar != null && (qwVar.d.getBackground() instanceof RippleDrawable)) {
                    qwVar.d.getBackground().setState(new int[0]);
                }
                if (qwVar != null) {
                    qwVar.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z12 || this.f37819m3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void k0(int i3) {
        if (i3 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            ey eyVar = this.f37820n3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                eyVar.M(true);
            }
            if (!canScrollVertically(1)) {
                ey.e(eyVar, 1, org.telegram.messenger.g0.L(36.0f));
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
        p5.release(this, this.f37820n3.f33534e2);
        int i3 = 0;
        int i10 = 0;
        while (true) {
            arrayList = this.f37815h3;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((pw) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.f37817k3;
            if (i3 < arrayList2.size()) {
                ((pw) arrayList2.get(i3)).f();
                i3++;
            } else {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ey eyVar = this.f37820n3;
        if (!eyVar.f33535f) {
            boolean q10 = org.telegram.ui.is.p().q(motionEvent, this, eyVar.f33544h2, this.f38460o2);
            if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        ey eyVar = this.f37820n3;
        if (eyVar.f33532e0 && eyVar.f33528d0) {
            this.f37813f3 = true;
            eyVar.R.h1(0, 0);
            eyVar.f33528d0 = false;
            this.f37813f3 = false;
        }
        super.onLayout(z10, i3, i10, i11, i12);
        eyVar.l(true);
        B1();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        this.f37813f3 = true;
        int size = View.MeasureSpec.getSize(i3);
        ey eyVar = this.f37820n3;
        fw fwVar = eyVar.R;
        int i11 = fwVar.J;
        if (org.telegram.messenger.g0.Q1()) {
            f10 = 60.0f;
        } else {
            f10 = 45.0f;
        }
        fwVar.y1(Math.max(1, size / org.telegram.messenger.g0.L(f10)));
        this.f37813f3 = false;
        super.onMeasure(i3, i10);
        if (i11 != fwVar.J) {
            eyVar.S.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        ey eyVar = this.f37820n3;
        int[] iArr = eyVar.E1;
        wt wtVar = eyVar.C1;
        if (eyVar.S1 != null && wtVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f10 = eyVar.V1;
                    if (f10 != -10000.0f) {
                        if (Math.abs(f10 - motionEvent.getX()) > org.telegram.messenger.g0.a1(true, 0.2f) || Math.abs(eyVar.W1 - motionEvent.getY()) > org.telegram.messenger.g0.a1(false, 0.2f)) {
                            eyVar.V1 = -10000.0f;
                            eyVar.W1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x10 = motionEvent.getX() + iArr[0];
                    wtVar.f40149c.getLocationOnScreen(iArr);
                    int L = (int) (x10 - (org.telegram.messenger.g0.L(3.0f) + iArr[0]));
                    boolean z10 = wtVar.d;
                    vt vtVar = wtVar.f40149c;
                    if (!z10) {
                        int max = Math.max(0, Math.min(5, L / (org.telegram.messenger.g0.L(4.0f) + wtVar.f40150e)));
                        if (vtVar.f39789n[0] != max) {
                            org.telegram.messenger.g0.c4(vtVar);
                            int[] iArr2 = vtVar.f39789n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                vtVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (wtVar != null && wtVar.isShowing() && !wtVar.d) {
                    wtVar.dismiss();
                    int i3 = wtVar.f40149c.f39789n[0];
                    if (i3 >= 1 && i3 <= 5) {
                        str = (String) org.telegram.messenger.h4.f22883a.get(i3 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) eyVar.S1.getTag();
                    if (!eyVar.S1.f36638c) {
                        if (str != null) {
                            org.telegram.messenger.i6.f23453j.put(str2, str);
                            str2 = ey.g(str2, str);
                        } else {
                            org.telegram.messenger.i6.f23453j.remove(str2);
                        }
                        eyVar.S1.a(org.telegram.messenger.i6.f(str2), eyVar.S1.f36638c);
                        ey.b(eyVar, eyVar.S1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.i6.q();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            ey.b(eyVar, eyVar.S1, ey.g(replace, str));
                        } else {
                            ey.b(eyVar, eyVar.S1, replace);
                        }
                    }
                }
                if (wtVar == null || !wtVar.d) {
                    eyVar.S1 = null;
                }
                eyVar.V1 = -10000.0f;
                eyVar.W1 = -10000.0f;
            }
            if (wtVar == null || !wtVar.d || wtVar.isShowing()) {
                return true;
            }
        }
        eyVar.T1 = motionEvent.getX();
        eyVar.U1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f37813f3) {
            return;
        }
        super.requestLayout();
    }

    public final long z1() {
        ey eyVar = this.f37820n3;
        return Math.max(400L, Math.min(45, eyVar.f33586v2 - eyVar.f33583u2) * 35) + Math.max(600L, Math.min(55, eyVar.f33586v2 - eyVar.f33583u2) * 40) + 150;
    }
}
