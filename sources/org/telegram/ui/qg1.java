package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class qg1 extends org.telegram.ui.ActionBar.n2 {
    public final SparseArray f40425a;
    public m0 f40426b;
    public pg1 f40427c;
    public int d;
    public float e;
    public boolean f40428f;
    public boolean h;
    public String f40429n;
    public int f40430r;
    public Runnable f40431s;

    public qg1() {
        super(null);
        this.f40425a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f40425a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            og1 og1Var = (og1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (og1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = og1Var.f39775a;
                if (n2Var.fragmentView != null) {
                    float r10 = this.f40427c.r(keyAt);
                    boolean z11 = this.f40428f;
                    if (z11) {
                        f7 = this.e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = og1Var.f39778f;
                    float f12 = f7 * r10;
                    og1Var.f39778f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!og1Var.d && r10 > 0.0f && z11 && n2Var.fragmentView != null) {
                        n2Var.onResume();
                        og1Var.d = true;
                    }
                    if (!og1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        n2Var.onTransitionAnimationStart(z10, false);
                        og1Var.e = true;
                    }
                    if (og1Var.e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        n2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (og1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        n2Var.onTransitionAnimationEnd(z10, false);
                        og1Var.e = false;
                    }
                    if (!og1Var.f39777c && f12 >= 1.0f) {
                        n2Var.onBecomeFullyVisible();
                        og1Var.f39777c = true;
                    }
                    if (og1Var.f39777c && ((f12 == 0.0f && !z12) || r10 == 0.0f)) {
                        n2Var.onBecomeFullyHidden();
                        og1Var.f39777c = false;
                    }
                    if (og1Var.d && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        n2Var.onPause();
                        og1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.n2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f40425a;
        og1 og1Var = (og1) sparseArray.get(i10);
        if (og1Var != null) {
            org.telegram.ui.ActionBar.n2 n2Var = og1Var.f39775a;
            if (og1Var.f39777c) {
                n2Var.onBecomeFullyHidden();
            }
            if (og1Var.d) {
                n2Var.onPause();
            }
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.n2 X() {
        pg1 pg1Var = this.f40427c;
        if (pg1Var == null) {
            return null;
        }
        og1 og1Var = (og1) this.f40425a.get(pg1Var.getCurrentPosition());
        if (og1Var == null) {
            return null;
        }
        return og1Var.f39775a;
    }

    @Override
    public final void clearViews() {
        pg1 pg1Var = this.f40427c;
        if (pg1Var != null) {
            this.d = pg1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f40425a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            og1 og1Var = (og1) sparseArray.valueAt(i10);
            if (og1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = og1Var.f39775a;
                if (og1Var.d) {
                    n2Var.onPause();
                    og1Var.d = false;
                }
                n2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.f40426b = new m0((pg0) this, context, 13);
        pg1 pg1Var = new pg1(this, context);
        this.f40427c = pg1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        pg1Var.setPosition(this.d);
        this.f40427c.setAdapter(new ai.i5(this, context, 4));
        this.f40426b.addView(this.f40427c, w7.z5.d(-1.0f, -1));
        m0 m0Var = this.f40426b;
        this.fragmentView = m0Var;
        qp0 qp0Var = new qp0(this, 25);
        WeakHashMap weakHashMap = r0.i0.f44844a;
        r0.a0.i(m0Var, qp0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f40425a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            og1 og1Var = (og1) sparseArray.valueAt(i10);
            if (og1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = og1Var.f39775a;
                if (n2Var.fragmentView != null) {
                    arrayList.addAll(n2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null && X.fragmentView != null) {
            return X.isLightStatusBar();
        }
        return super.isLightStatusBar();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
            }
            return false;
        }
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null && !X.onBackPressed(z10)) {
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        U();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        U();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f40425a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            og1 og1Var = (og1) sparseArray.valueAt(i10);
            boolean z10 = og1Var.f39776b;
            org.telegram.ui.ActionBar.n2 n2Var = og1Var.f39775a;
            if (z10) {
                n2Var.onFragmentDestroy();
                n2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f40428f = false;
        U();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null) {
            X.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f40428f = true;
        checkSystemBarColors();
        U();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        if (!z10) {
            f7 = 1.0f - f7;
        }
        this.e = f7;
        U();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.f40429n = str;
        this.f40430r = i10;
        this.f40431s = runnable;
        SparseArray sparseArray = this.f40425a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            og1 og1Var = (og1) sparseArray.valueAt(i11);
            if (og1Var != null) {
                og1Var.f39775a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
