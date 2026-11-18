package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
public abstract class qb1 extends org.telegram.ui.ActionBar.h2 {
    public final SparseArray f51151a;
    public k0 f51152b;
    public pb1 f51153c;
    public int d;
    public float f51154e;
    public boolean f51155f;
    public boolean h;
    public String f51156n;
    public int f51157r;
    public Runnable f51158s;

    public qb1() {
        super(null);
        this.f51151a = new SparseArray();
        this.d = -1;
        this.f51154e = 0.0f;
    }

    public final void Z() {
        float f10;
        boolean z10;
        float f11;
        SparseArray sparseArray = this.f51151a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            int keyAt = sparseArray.keyAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.h2 h2Var = ob1Var.f50509a;
                if (h2Var.fragmentView != null) {
                    float m10 = this.f51153c.m(keyAt);
                    boolean z11 = this.f51155f;
                    if (z11) {
                        f10 = this.f51154e;
                    } else {
                        f10 = 0.0f;
                    }
                    boolean z12 = this.h;
                    if (ob1Var.f50514g <= 0.0f && m10 > 0.0f && z11 && (h2Var instanceof le0)) {
                        le0 le0Var = (le0) h2Var;
                    }
                    ob1Var.f50514g = m10;
                    float f12 = ob1Var.f50513f;
                    float f13 = f10 * m10;
                    ob1Var.f50513f = f13;
                    if (f13 > f12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!ob1Var.d && m10 > 0.0f && z11 && h2Var.fragmentView != null) {
                        h2Var.onResume();
                        ob1Var.d = true;
                    }
                    if (!ob1Var.f50512e && ((f12 == 0.0f || f12 == 1.0f) && f12 != f13 && Math.abs(f12 - f13) != 1.0f)) {
                        h2Var.onTransitionAnimationStart(z10, false);
                        ob1Var.f50512e = true;
                    }
                    if (ob1Var.f50512e && f12 != f13) {
                        if (z10) {
                            f11 = f13;
                        } else {
                            f11 = 1.0f - f13;
                        }
                        h2Var.onTransitionAnimationProgress(z10, f11);
                    }
                    if (ob1Var.f50512e && (f13 == 0.0f || f13 == 1.0f)) {
                        h2Var.onTransitionAnimationEnd(z10, false);
                        ob1Var.f50512e = false;
                    }
                    if (!ob1Var.f50511c && f13 >= 1.0f) {
                        h2Var.onBecomeFullyVisible();
                        ob1Var.f50511c = true;
                    }
                    if (ob1Var.f50511c && ((f13 == 0.0f && !z12) || m10 == 0.0f)) {
                        h2Var.onBecomeFullyHidden();
                        ob1Var.f50511c = false;
                    }
                    if (ob1Var.d && ((f13 == 0.0f && !z11) || m10 == 0.0f)) {
                        h2Var.onPause();
                        ob1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.h2 a0(int i7);

    @Override
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.f51151a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.h2 h2Var = ob1Var.f50509a;
                if (h2Var.fragmentView != null) {
                    h2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final void b0(int i7) {
        SparseArray sparseArray = this.f51151a;
        ob1 ob1Var = (ob1) sparseArray.get(i7);
        if (ob1Var != null) {
            org.telegram.ui.ActionBar.h2 h2Var = ob1Var.f50509a;
            if (ob1Var.f50511c) {
                h2Var.onBecomeFullyHidden();
            }
            if (ob1Var.d) {
                h2Var.onPause();
            }
            h2Var.onFragmentDestroy();
            h2Var.setParentLayout(null);
        }
        sparseArray.remove(i7);
    }

    public final org.telegram.ui.ActionBar.h2 c0() {
        pb1 pb1Var = this.f51153c;
        if (pb1Var == null) {
            return null;
        }
        ob1 ob1Var = (ob1) this.f51151a.get(pb1Var.getCurrentPosition());
        if (ob1Var == null) {
            return null;
        }
        return ob1Var.f50509a;
    }

    @Override
    public final void clearViews() {
        pb1 pb1Var = this.f51153c;
        if (pb1Var != null) {
            this.d = pb1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f51151a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.h2 h2Var = ob1Var.f50509a;
                if (ob1Var.d) {
                    h2Var.onPause();
                    ob1Var.d = false;
                }
                h2Var.clearViews();
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
        this.f51152b = new k0(14, context, (me0) this);
        pb1 pb1Var = new pb1(this, context);
        this.f51153c = pb1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        pb1Var.setPosition(this.d);
        this.f51153c.setAdapter(new di.i4(8, context, this));
        this.f51152b.addView(this.f51153c, c8.ma.c(-1.0f, -1));
        k0 k0Var = this.f51152b;
        this.fragmentView = k0Var;
        qi0 qi0Var = new qi0(this, 24);
        WeakHashMap weakHashMap = r0.i0.f56244a;
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
        SparseArray sparseArray = this.f51151a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.h2 h2Var = ob1Var.f50509a;
                if (h2Var.fragmentView != null) {
                    arrayList.addAll(h2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.h2 c02 = c0();
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
        org.telegram.ui.ActionBar.a5 a5Var;
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.h2 c02 = c0();
            if (c02 != null) {
                a5Var = c02.getSimpleActionBar();
            } else {
                a5Var = null;
            }
            if (a5Var != null && (a5Var.R != null || (!a5Var.H && a5Var.G))) {
                if (z10) {
                    a5Var.A();
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
        this.f51154e = 0.0f;
        this.h = false;
        Z();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f51154e = 1.0f;
        this.h = true;
        Z();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f51151a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            boolean z10 = ob1Var.f50510b;
            org.telegram.ui.ActionBar.h2 h2Var = ob1Var.f50509a;
            if (z10) {
                h2Var.onFragmentDestroy();
                h2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f51155f = false;
        Z();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.h2 c02 = c0();
        if (c02 != null) {
            c02.onRequestPermissionsResultFragment(i7, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f51155f = true;
        checkSystemBarColors();
        Z();
    }

    @Override
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.f51151a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i7);
            if (ob1Var != null) {
                org.telegram.ui.ActionBar.h2 h2Var = ob1Var.f50509a;
                if (h2Var.fragmentView != null) {
                    try {
                        h2Var.onThemeColorsChanged();
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
        this.f51154e = f10;
        Z();
    }

    @Override
    public final void setTitleOverlayText(String str, int i7, Runnable runnable) {
        super.setTitleOverlayText(str, i7, runnable);
        this.f51156n = str;
        this.f51157r = i7;
        this.f51158s = runnable;
        SparseArray sparseArray = this.f51151a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ob1 ob1Var = (ob1) sparseArray.valueAt(i10);
            if (ob1Var != null) {
                ob1Var.f50509a.setTitleOverlayText(str, i7, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i7, Runnable runnable) {
        setTitleOverlayText(str, i7, runnable);
    }
}
