package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class og1 extends org.telegram.ui.ActionBar.n2 {
    public final SparseArray f39880a;
    public m0 f39881b;
    public ng1 f39882c;
    public int d;
    public float e;
    public boolean f39883f;
    public boolean h;
    public String f39884n;
    public int f39885r;
    public Runnable f39886s;

    public og1() {
        super(null);
        this.f39880a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f39880a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            mg1 mg1Var = (mg1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (mg1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = mg1Var.f39236a;
                if (n2Var.fragmentView != null) {
                    float r10 = this.f39882c.r(keyAt);
                    boolean z11 = this.f39883f;
                    if (z11) {
                        f7 = this.e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = mg1Var.f39239f;
                    float f12 = f7 * r10;
                    mg1Var.f39239f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!mg1Var.d && r10 > 0.0f && z11 && n2Var.fragmentView != null) {
                        n2Var.onResume();
                        mg1Var.d = true;
                    }
                    if (!mg1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        n2Var.onTransitionAnimationStart(z10, false);
                        mg1Var.e = true;
                    }
                    if (mg1Var.e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        n2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (mg1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        n2Var.onTransitionAnimationEnd(z10, false);
                        mg1Var.e = false;
                    }
                    if (!mg1Var.f39238c && f12 >= 1.0f) {
                        n2Var.onBecomeFullyVisible();
                        mg1Var.f39238c = true;
                    }
                    if (mg1Var.f39238c && ((f12 == 0.0f && !z12) || r10 == 0.0f)) {
                        n2Var.onBecomeFullyHidden();
                        mg1Var.f39238c = false;
                    }
                    if (mg1Var.d && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        n2Var.onPause();
                        mg1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.n2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f39880a;
        mg1 mg1Var = (mg1) sparseArray.get(i10);
        if (mg1Var != null) {
            org.telegram.ui.ActionBar.n2 n2Var = mg1Var.f39236a;
            if (mg1Var.f39238c) {
                n2Var.onBecomeFullyHidden();
            }
            if (mg1Var.d) {
                n2Var.onPause();
            }
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.n2 X() {
        ng1 ng1Var = this.f39882c;
        if (ng1Var == null) {
            return null;
        }
        mg1 mg1Var = (mg1) this.f39880a.get(ng1Var.getCurrentPosition());
        if (mg1Var == null) {
            return null;
        }
        return mg1Var.f39236a;
    }

    @Override
    public final void clearViews() {
        ng1 ng1Var = this.f39882c;
        if (ng1Var != null) {
            this.d = ng1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f39880a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            mg1 mg1Var = (mg1) sparseArray.valueAt(i10);
            if (mg1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = mg1Var.f39236a;
                if (mg1Var.d) {
                    n2Var.onPause();
                    mg1Var.d = false;
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
        this.f39881b = new m0((ng0) this, context, 13);
        ng1 ng1Var = new ng1(this, context);
        this.f39882c = ng1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        ng1Var.setPosition(this.d);
        this.f39882c.setAdapter(new ai.j5(this, context, 4));
        this.f39881b.addView(this.f39882c, w7.z5.c(-1.0f, -1));
        m0 m0Var = this.f39881b;
        this.fragmentView = m0Var;
        pp0 pp0Var = new pp0(this, 25);
        WeakHashMap weakHashMap = r0.i0.f44818a;
        r0.a0.i(m0Var, pp0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f39880a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            mg1 mg1Var = (mg1) sparseArray.valueAt(i10);
            if (mg1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = mg1Var.f39236a;
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
        SparseArray sparseArray = this.f39880a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            mg1 mg1Var = (mg1) sparseArray.valueAt(i10);
            boolean z10 = mg1Var.f39237b;
            org.telegram.ui.ActionBar.n2 n2Var = mg1Var.f39236a;
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
        this.f39883f = false;
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
        this.f39883f = true;
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
        this.f39884n = str;
        this.f39885r = i10;
        this.f39886s = runnable;
        SparseArray sparseArray = this.f39880a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            mg1 mg1Var = (mg1) sparseArray.valueAt(i11);
            if (mg1Var != null) {
                mg1Var.f39236a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
