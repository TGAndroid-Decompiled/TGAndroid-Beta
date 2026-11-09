package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
public abstract class qb1 extends org.telegram.ui.ActionBar.f2 {
    public final SparseArray f49012a;
    public k0 f49013b;
    public pb1 f49014c;
    public int d;
    public float f49015e;
    public boolean f49016f;
    public boolean h;
    public String f49017n;
    public int f49018r;
    public Runnable f49019s;

    public qb1() {
        super(null);
        this.f49012a = new SparseArray();
        this.d = -1;
        this.f49015e = 0.0f;
    }

    public final void Z() {
        float f10;
        boolean z9;
        float f11;
        SparseArray sparseArray = this.f49012a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            int keyAt = sparseArray.keyAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = ob1Var.f48422a;
                if (f2Var.fragmentView != null) {
                    float r10 = this.f49014c.r(keyAt);
                    boolean z10 = this.f49016f;
                    if (z10) {
                        f10 = this.f49015e;
                    } else {
                        f10 = 0.0f;
                    }
                    boolean z11 = this.h;
                    float f12 = ob1Var.f48426f;
                    float f13 = f10 * r10;
                    ob1Var.f48426f = f13;
                    if (f13 > f12) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!ob1Var.d && r10 > 0.0f && z10 && f2Var.fragmentView != null) {
                        f2Var.onResume();
                        ob1Var.d = true;
                    }
                    if (!ob1Var.f48425e && ((f12 == 0.0f || f12 == 1.0f) && f12 != f13 && Math.abs(f12 - f13) != 1.0f)) {
                        f2Var.onTransitionAnimationStart(z9, false);
                        ob1Var.f48425e = true;
                    }
                    if (ob1Var.f48425e && f12 != f13) {
                        if (z9) {
                            f11 = f13;
                        } else {
                            f11 = 1.0f - f13;
                        }
                        f2Var.onTransitionAnimationProgress(z9, f11);
                    }
                    if (ob1Var.f48425e && (f13 == 0.0f || f13 == 1.0f)) {
                        f2Var.onTransitionAnimationEnd(z9, false);
                        ob1Var.f48425e = false;
                    }
                    if (!ob1Var.f48424c && f13 >= 1.0f) {
                        f2Var.onBecomeFullyVisible();
                        ob1Var.f48424c = true;
                    }
                    if (ob1Var.f48424c && ((f13 == 0.0f && !z11) || r10 == 0.0f)) {
                        f2Var.onBecomeFullyHidden();
                        ob1Var.f48424c = false;
                    }
                    if (ob1Var.d && ((f13 == 0.0f && !z10) || r10 == 0.0f)) {
                        f2Var.onPause();
                        ob1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.f2 a0(int i7);

    @Override
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.f49012a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = ob1Var.f48422a;
                if (f2Var.fragmentView != null) {
                    f2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final void b0(int i7) {
        SparseArray sparseArray = this.f49012a;
        ob1 ob1Var = (ob1) sparseArray.get(i7);
        if (ob1Var != null) {
            org.telegram.ui.ActionBar.f2 f2Var = ob1Var.f48422a;
            if (ob1Var.f48424c) {
                f2Var.onBecomeFullyHidden();
            }
            if (ob1Var.d) {
                f2Var.onPause();
            }
            f2Var.onFragmentDestroy();
            f2Var.setParentLayout(null);
        }
        sparseArray.remove(i7);
    }

    public final org.telegram.ui.ActionBar.f2 c0() {
        pb1 pb1Var = this.f49014c;
        if (pb1Var == null) {
            return null;
        }
        ob1 ob1Var = (ob1) this.f49012a.get(pb1Var.getCurrentPosition());
        if (ob1Var == null) {
            return null;
        }
        return ob1Var.f48422a;
    }

    @Override
    public final void clearViews() {
        pb1 pb1Var = this.f49014c;
        if (pb1Var != null) {
            this.d = pb1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f49012a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = ob1Var.f48422a;
                if (ob1Var.d) {
                    f2Var.onPause();
                    ob1Var.d = false;
                }
                f2Var.clearViews();
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
        this.f49013b = new k0(14, context, (le0) this);
        pb1 pb1Var = new pb1(this, context);
        this.f49014c = pb1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        pb1Var.setPosition(this.d);
        this.f49014c.setAdapter(new bi.g5(8, context, this));
        this.f49013b.addView(this.f49014c, c8.ha.c(-1.0f, -1));
        k0 k0Var = this.f49013b;
        this.fragmentView = k0Var;
        ni0 ni0Var = new ni0(this, 24);
        WeakHashMap weakHashMap = r0.i0.f54203a;
        r0.a0.i(k0Var, ni0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f49012a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = ob1Var.f48422a;
                if (f2Var.fragmentView != null) {
                    arrayList.addAll(f2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.f2 c02 = c0();
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
    public boolean onBackPressed(boolean z9) {
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.j5 j5Var;
        if (hasShownSheet()) {
            if (z9) {
                closeSheet();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.f2 c02 = c0();
            if (c02 != null) {
                y4Var = c02.getSimpleActionBar();
            } else {
                y4Var = null;
            }
            if (y4Var != null && ((j5Var = y4Var.Q) != null || (!y4Var.G && y4Var.F))) {
                if (z9) {
                    if (j5Var != null) {
                        j5Var.a(true);
                        return false;
                    }
                    if (!y4Var.G && y4Var.F) {
                        y4Var.k(true);
                    }
                    return false;
                }
            } else if (c02 == null || c02.onBackPressed(z9)) {
                return super.onBackPressed(z9);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.f49015e = 0.0f;
        this.h = false;
        Z();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f49015e = 1.0f;
        this.h = true;
        Z();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f49012a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            boolean z9 = ob1Var.f48423b;
            org.telegram.ui.ActionBar.f2 f2Var = ob1Var.f48422a;
            if (z9) {
                f2Var.onFragmentDestroy();
                f2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f49016f = false;
        Z();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.f2 c02 = c0();
        if (c02 != null) {
            c02.onRequestPermissionsResultFragment(i7, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f49016f = true;
        checkSystemBarColors();
        Z();
    }

    @Override
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.f49012a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = ob1Var.f48422a;
                if (f2Var.fragmentView != null) {
                    try {
                        f2Var.onThemeColorsChanged();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        super.onTransitionAnimationProgress(z9, f10);
        if (!z9) {
            f10 = 1.0f - f10;
        }
        this.f49015e = f10;
        Z();
    }

    @Override
    public final void setTitleOverlayText(String str, int i7, Runnable runnable) {
        super.setTitleOverlayText(str, i7, runnable);
        this.f49017n = str;
        this.f49018r = i7;
        this.f49019s = runnable;
        SparseArray sparseArray = this.f49012a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i10);
            if (ob1Var != null) {
                ob1Var.f48422a.setTitleOverlayText(str, i7, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i7, Runnable runnable) {
        setTitleOverlayText(str, i7, runnable);
    }
}
