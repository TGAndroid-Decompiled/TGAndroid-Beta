package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
public abstract class jd1 extends org.telegram.ui.ActionBar.k2 {
    public final SparseArray f38497a;
    public l0 f38498b;
    public id1 f38499c;
    public int d;
    public float e;
    public boolean f38500f;
    public boolean h;
    public String f38501n;
    public int f38502r;
    public Runnable f38503s;

    public jd1() {
        super(null);
        this.f38497a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void Y() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f38497a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hd1 hd1Var = (hd1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (hd1Var != null) {
                org.telegram.ui.ActionBar.k2 k2Var = hd1Var.f37897a;
                if (k2Var.fragmentView != null) {
                    float r10 = this.f38499c.r(keyAt);
                    boolean z11 = this.f38500f;
                    if (z11) {
                        f7 = this.e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = hd1Var.f37900f;
                    float f12 = f7 * r10;
                    hd1Var.f37900f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!hd1Var.d && r10 > 0.0f && z11 && k2Var.fragmentView != null) {
                        k2Var.onResume();
                        hd1Var.d = true;
                    }
                    if (!hd1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        k2Var.onTransitionAnimationStart(z10, false);
                        hd1Var.e = true;
                    }
                    if (hd1Var.e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        k2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (hd1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        k2Var.onTransitionAnimationEnd(z10, false);
                        hd1Var.e = false;
                    }
                    if (!hd1Var.f37899c && f12 >= 1.0f) {
                        k2Var.onBecomeFullyVisible();
                        hd1Var.f37899c = true;
                    }
                    if (hd1Var.f37899c && ((f12 == 0.0f && !z12) || r10 == 0.0f)) {
                        k2Var.onBecomeFullyHidden();
                        hd1Var.f37899c = false;
                    }
                    if (hd1Var.d && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        k2Var.onPause();
                        hd1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.k2 Z(int i10);

    public final void a0(int i10) {
        SparseArray sparseArray = this.f38497a;
        hd1 hd1Var = (hd1) sparseArray.get(i10);
        if (hd1Var != null) {
            org.telegram.ui.ActionBar.k2 k2Var = hd1Var.f37897a;
            if (hd1Var.f37899c) {
                k2Var.onBecomeFullyHidden();
            }
            if (hd1Var.d) {
                k2Var.onPause();
            }
            k2Var.onFragmentDestroy();
            k2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    @Override
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.f38497a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hd1 hd1Var = (hd1) sparseArray.valueAt(i10);
            if (hd1Var != null) {
                org.telegram.ui.ActionBar.k2 k2Var = hd1Var.f37897a;
                if (k2Var.fragmentView != null) {
                    k2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final org.telegram.ui.ActionBar.k2 b0() {
        id1 id1Var = this.f38499c;
        if (id1Var == null) {
            return null;
        }
        hd1 hd1Var = (hd1) this.f38497a.get(id1Var.getCurrentPosition());
        if (hd1Var == null) {
            return null;
        }
        return hd1Var.f37897a;
    }

    @Override
    public final void clearViews() {
        id1 id1Var = this.f38499c;
        if (id1Var != null) {
            this.d = id1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f38497a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hd1 hd1Var = (hd1) sparseArray.valueAt(i10);
            if (hd1Var != null) {
                org.telegram.ui.ActionBar.k2 k2Var = hd1Var.f37897a;
                if (hd1Var.d) {
                    k2Var.onPause();
                    hd1Var.d = false;
                }
                k2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        return null;
    }

    @Override
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.f38498b = new l0((pf0) this, context, 15);
        id1 id1Var = new id1(this, context);
        this.f38499c = id1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        id1Var.setPosition(this.d);
        this.f38499c.setAdapter(new mg.s(this, context, 7));
        this.f38498b.addView(this.f38499c, w7.b6.c(-1.0f, -1));
        l0 l0Var = this.f38498b;
        this.fragmentView = l0Var;
        tj0 tj0Var = new tj0(this, 25);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.z.i(l0Var, tj0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f38497a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hd1 hd1Var = (hd1) sparseArray.valueAt(i10);
            if (hd1Var != null) {
                org.telegram.ui.ActionBar.k2 k2Var = hd1Var.f37897a;
                if (k2Var.fragmentView != null) {
                    arrayList.addAll(k2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.k2 b02 = b0();
        if (b02 != null && b02.fragmentView != null) {
            return b02.isLightStatusBar();
        }
        return super.isLightStatusBar();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.i5 i5Var;
        org.telegram.ui.ActionBar.s5 s5Var;
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.k2 b02 = b0();
            if (b02 != null) {
                i5Var = b02.getSimpleActionBar();
            } else {
                i5Var = null;
            }
            if (i5Var != null && ((s5Var = i5Var.Q) != null || (!i5Var.G && i5Var.F))) {
                if (z10) {
                    if (s5Var != null) {
                        s5Var.a(true);
                        return false;
                    }
                    if (!i5Var.G && i5Var.F) {
                        i5Var.j(true);
                    }
                    return false;
                }
            } else if (b02 == null || b02.onBackPressed(z10)) {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        Y();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        Y();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f38497a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hd1 hd1Var = (hd1) sparseArray.valueAt(i10);
            boolean z10 = hd1Var.f37898b;
            org.telegram.ui.ActionBar.k2 k2Var = hd1Var.f37897a;
            if (z10) {
                k2Var.onFragmentDestroy();
                k2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f38500f = false;
        Y();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.k2 b02 = b0();
        if (b02 != null) {
            b02.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f38500f = true;
        checkSystemBarColors();
        Y();
    }

    @Override
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.f38497a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hd1 hd1Var = (hd1) sparseArray.valueAt(i10);
            if (hd1Var != null) {
                org.telegram.ui.ActionBar.k2 k2Var = hd1Var.f37897a;
                if (k2Var.fragmentView != null) {
                    try {
                        k2Var.onThemeColorsChanged();
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        if (!z10) {
            f7 = 1.0f - f7;
        }
        this.e = f7;
        Y();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.f38501n = str;
        this.f38502r = i10;
        this.f38503s = runnable;
        SparseArray sparseArray = this.f38497a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            hd1 hd1Var = (hd1) sparseArray.valueAt(i11);
            if (hd1Var != null) {
                hd1Var.f37897a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
