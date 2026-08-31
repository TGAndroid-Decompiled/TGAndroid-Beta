package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class jh1 extends org.telegram.ui.ActionBar.p2 {
    public final SparseArray f38156a;
    public l0 f38157b;
    public ih1 f38158c;
    public int d;
    public float f38159e;
    public boolean f38160f;
    public boolean h;
    public String f38161n;
    public int f38162r;
    public Runnable f38163s;

    public jh1() {
        super(null);
        this.f38156a = new SparseArray();
        this.d = -1;
        this.f38159e = 0.0f;
    }

    public final void U() {
        float f10;
        boolean z4;
        float f11;
        SparseArray sparseArray = this.f38156a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hh1 hh1Var = (hh1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (hh1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = hh1Var.f37508a;
                if (p2Var.fragmentView != null) {
                    float r10 = this.f38158c.r(keyAt);
                    boolean z10 = this.f38160f;
                    if (z10) {
                        f10 = this.f38159e;
                    } else {
                        f10 = 0.0f;
                    }
                    boolean z11 = this.h;
                    float f12 = hh1Var.f37512f;
                    float f13 = f10 * r10;
                    hh1Var.f37512f = f13;
                    if (f13 > f12) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!hh1Var.d && r10 > 0.0f && z10 && p2Var.fragmentView != null) {
                        p2Var.onResume();
                        hh1Var.d = true;
                    }
                    if (!hh1Var.f37511e && ((f12 == 0.0f || f12 == 1.0f) && f12 != f13 && Math.abs(f12 - f13) != 1.0f)) {
                        p2Var.onTransitionAnimationStart(z4, false);
                        hh1Var.f37511e = true;
                    }
                    if (hh1Var.f37511e && f12 != f13) {
                        if (z4) {
                            f11 = f13;
                        } else {
                            f11 = 1.0f - f13;
                        }
                        p2Var.onTransitionAnimationProgress(z4, f11);
                    }
                    if (hh1Var.f37511e && (f13 == 0.0f || f13 == 1.0f)) {
                        p2Var.onTransitionAnimationEnd(z4, false);
                        hh1Var.f37511e = false;
                    }
                    if (!hh1Var.f37510c && f13 >= 1.0f) {
                        p2Var.onBecomeFullyVisible();
                        hh1Var.f37510c = true;
                    }
                    if (hh1Var.f37510c && ((f13 == 0.0f && !z11) || r10 == 0.0f)) {
                        p2Var.onBecomeFullyHidden();
                        hh1Var.f37510c = false;
                    }
                    if (hh1Var.d && ((f13 == 0.0f && !z10) || r10 == 0.0f)) {
                        p2Var.onPause();
                        hh1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.p2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f38156a;
        hh1 hh1Var = (hh1) sparseArray.get(i10);
        if (hh1Var != null) {
            org.telegram.ui.ActionBar.p2 p2Var = hh1Var.f37508a;
            if (hh1Var.f37510c) {
                p2Var.onBecomeFullyHidden();
            }
            if (hh1Var.d) {
                p2Var.onPause();
            }
            p2Var.onFragmentDestroy();
            p2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.p2 X() {
        ih1 ih1Var = this.f38158c;
        if (ih1Var == null) {
            return null;
        }
        hh1 hh1Var = (hh1) this.f38156a.get(ih1Var.getCurrentPosition());
        if (hh1Var == null) {
            return null;
        }
        return hh1Var.f37508a;
    }

    @Override
    public final void clearViews() {
        ih1 ih1Var = this.f38158c;
        if (ih1Var != null) {
            this.d = ih1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f38156a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hh1 hh1Var = (hh1) sparseArray.valueAt(i10);
            if (hh1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = hh1Var.f37508a;
                if (hh1Var.d) {
                    p2Var.onPause();
                    hh1Var.d = false;
                }
                p2Var.clearViews();
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
        this.f38157b = new l0((wg0) this, context, 13);
        ih1 ih1Var = new ih1(this, context);
        this.f38158c = ih1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        ih1Var.setPosition(this.d);
        this.f38158c.setAdapter(new hg.u(this, context, 5));
        this.f38157b.addView(this.f38158c, k7.c6.c(-1.0f, -1));
        l0 l0Var = this.f38157b;
        this.fragmentView = l0Var;
        kl0 kl0Var = new kl0(this, 26);
        WeakHashMap weakHashMap = r0.j0.f46438a;
        r0.b0.j(l0Var, kl0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f38156a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hh1 hh1Var = (hh1) sparseArray.valueAt(i10);
            if (hh1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = hh1Var.f37508a;
                if (p2Var.fragmentView != null) {
                    arrayList.addAll(p2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.p2 X = X();
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
    public boolean onBackPressed(boolean z4) {
        if (hasShownSheet()) {
            if (z4) {
                closeSheet();
            }
            return false;
        }
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null && !X.onBackPressed(z4)) {
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.f38159e = 0.0f;
        this.h = false;
        U();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f38159e = 1.0f;
        this.h = true;
        U();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f38156a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hh1 hh1Var = (hh1) sparseArray.valueAt(i10);
            boolean z4 = hh1Var.f37509b;
            org.telegram.ui.ActionBar.p2 p2Var = hh1Var.f37508a;
            if (z4) {
                p2Var.onFragmentDestroy();
                p2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f38160f = false;
        U();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            X.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f38160f = true;
        checkSystemBarColors();
        U();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        super.onTransitionAnimationProgress(z4, f10);
        if (!z4) {
            f10 = 1.0f - f10;
        }
        this.f38159e = f10;
        U();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.f38161n = str;
        this.f38162r = i10;
        this.f38163s = runnable;
        SparseArray sparseArray = this.f38156a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            hh1 hh1Var = (hh1) sparseArray.valueAt(i11);
            if (hh1Var != null) {
                hh1Var.f37508a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
