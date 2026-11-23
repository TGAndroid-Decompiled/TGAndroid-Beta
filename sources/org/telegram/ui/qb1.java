package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
public abstract class qb1 extends org.telegram.ui.ActionBar.g2 {
    public final SparseArray f51132a;
    public k0 f51133b;
    public pb1 f51134c;
    public int d;
    public float f51135e;
    public boolean f51136f;
    public boolean h;
    public String f51137n;
    public int f51138r;
    public Runnable f51139s;

    public qb1() {
        super(null);
        this.f51132a = new SparseArray();
        this.d = -1;
        this.f51135e = 0.0f;
    }

    public final void Z() {
        float f10;
        boolean z10;
        float f11;
        SparseArray sparseArray = this.f51132a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            int keyAt = sparseArray.keyAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.g2 g2Var = ob1Var.f50523a;
                if (g2Var.fragmentView != null) {
                    float m10 = this.f51134c.m(keyAt);
                    boolean z11 = this.f51136f;
                    if (z11) {
                        f10 = this.f51135e;
                    } else {
                        f10 = 0.0f;
                    }
                    boolean z12 = this.h;
                    if (ob1Var.f50528g <= 0.0f && m10 > 0.0f && z11 && (g2Var instanceof ke0)) {
                        ke0 ke0Var = (ke0) g2Var;
                    }
                    ob1Var.f50528g = m10;
                    float f12 = ob1Var.f50527f;
                    float f13 = f10 * m10;
                    ob1Var.f50527f = f13;
                    if (f13 > f12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!ob1Var.d && m10 > 0.0f && z11 && g2Var.fragmentView != null) {
                        g2Var.onResume();
                        ob1Var.d = true;
                    }
                    if (!ob1Var.f50526e && ((f12 == 0.0f || f12 == 1.0f) && f12 != f13 && Math.abs(f12 - f13) != 1.0f)) {
                        g2Var.onTransitionAnimationStart(z10, false);
                        ob1Var.f50526e = true;
                    }
                    if (ob1Var.f50526e && f12 != f13) {
                        if (z10) {
                            f11 = f13;
                        } else {
                            f11 = 1.0f - f13;
                        }
                        g2Var.onTransitionAnimationProgress(z10, f11);
                    }
                    if (ob1Var.f50526e && (f13 == 0.0f || f13 == 1.0f)) {
                        g2Var.onTransitionAnimationEnd(z10, false);
                        ob1Var.f50526e = false;
                    }
                    if (!ob1Var.f50525c && f13 >= 1.0f) {
                        g2Var.onBecomeFullyVisible();
                        ob1Var.f50525c = true;
                    }
                    if (ob1Var.f50525c && ((f13 == 0.0f && !z12) || m10 == 0.0f)) {
                        g2Var.onBecomeFullyHidden();
                        ob1Var.f50525c = false;
                    }
                    if (ob1Var.d && ((f13 == 0.0f && !z11) || m10 == 0.0f)) {
                        g2Var.onPause();
                        ob1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.g2 a0(int i7);

    @Override
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.f51132a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.g2 g2Var = ob1Var.f50523a;
                if (g2Var.fragmentView != null) {
                    g2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final void b0(int i7) {
        SparseArray sparseArray = this.f51132a;
        ob1 ob1Var = (ob1) sparseArray.get(i7);
        if (ob1Var != null) {
            org.telegram.ui.ActionBar.g2 g2Var = ob1Var.f50523a;
            if (ob1Var.f50525c) {
                g2Var.onBecomeFullyHidden();
            }
            if (ob1Var.d) {
                g2Var.onPause();
            }
            g2Var.onFragmentDestroy();
            g2Var.setParentLayout(null);
        }
        sparseArray.remove(i7);
    }

    public final org.telegram.ui.ActionBar.g2 c0() {
        pb1 pb1Var = this.f51134c;
        if (pb1Var == null) {
            return null;
        }
        ob1 ob1Var = (ob1) this.f51132a.get(pb1Var.getCurrentPosition());
        if (ob1Var == null) {
            return null;
        }
        return ob1Var.f50523a;
    }

    @Override
    public final void clearViews() {
        pb1 pb1Var = this.f51134c;
        if (pb1Var != null) {
            this.d = pb1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f51132a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.g2 g2Var = ob1Var.f50523a;
                if (ob1Var.d) {
                    g2Var.onPause();
                    ob1Var.d = false;
                }
                g2Var.clearViews();
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
        this.f51133b = new k0(14, context, (le0) this);
        pb1 pb1Var = new pb1(this, context);
        this.f51134c = pb1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        pb1Var.setPosition(this.d);
        this.f51134c.setAdapter(new di.i4(8, context, this));
        this.f51133b.addView(this.f51134c, c8.na.c(-1.0f, -1));
        k0 k0Var = this.f51133b;
        this.fragmentView = k0Var;
        qi0 qi0Var = new qi0(this, 24);
        WeakHashMap weakHashMap = r0.i0.f56254a;
        r0.a0.i(k0Var, qi0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f51132a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.g2 g2Var = ob1Var.f50523a;
                if (g2Var.fragmentView != null) {
                    arrayList.addAll(g2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.g2 c02 = c0();
        if (c02 != null && c02.fragmentView != null) {
            return c02.isLightStatusBar();
        }
        return super.isLightStatusBar();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.g2 c02 = c0();
            if (c02 != null) {
                z4Var = c02.getSimpleActionBar();
            } else {
                z4Var = null;
            }
            if (z4Var != null && (z4Var.R != null || (!z4Var.H && z4Var.G))) {
                if (z10) {
                    z4Var.A();
                    return false;
                }
            } else if (c02 == null || c02.onBackPressed(z10)) {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.f51135e = 0.0f;
        this.h = false;
        Z();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f51135e = 1.0f;
        this.h = true;
        Z();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f51132a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            boolean z10 = ob1Var.f50524b;
            org.telegram.ui.ActionBar.g2 g2Var = ob1Var.f50523a;
            if (z10) {
                g2Var.onFragmentDestroy();
                g2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f51136f = false;
        Z();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.g2 c02 = c0();
        if (c02 != null) {
            c02.onRequestPermissionsResultFragment(i7, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f51136f = true;
        checkSystemBarColors();
        Z();
    }

    @Override
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.f51132a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.g2 g2Var = ob1Var.f50523a;
                if (g2Var.fragmentView != null) {
                    try {
                        g2Var.onThemeColorsChanged();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        if (!z10) {
            f10 = 1.0f - f10;
        }
        this.f51135e = f10;
        Z();
    }

    @Override
    public final void setTitleOverlayText(String str, int i7, Runnable runnable) {
        super.setTitleOverlayText(str, i7, runnable);
        this.f51137n = str;
        this.f51138r = i7;
        this.f51139s = runnable;
        SparseArray sparseArray = this.f51132a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i10);
            if (ob1Var != null) {
                ob1Var.f50523a.setTitleOverlayText(str, i7, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i7, Runnable runnable) {
        setTitleOverlayText(str, i7, runnable);
    }
}
