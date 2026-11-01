package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
public abstract class hd1 extends org.telegram.ui.ActionBar.k2 {
    public final SparseArray f37787a;
    public l0 f37788b;
    public gd1 f37789c;
    public int d;
    public float e;
    public boolean f37790f;
    public boolean h;
    public String f37791n;
    public int f37792r;
    public Runnable f37793s;

    public hd1() {
        super(null);
        this.f37787a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void Z() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f37787a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fd1 fd1Var = (fd1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (fd1Var != null) {
                org.telegram.ui.ActionBar.k2 k2Var = fd1Var.f37108a;
                if (k2Var.fragmentView != null) {
                    float r10 = this.f37789c.r(keyAt);
                    boolean z11 = this.f37790f;
                    if (z11) {
                        f7 = this.e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = fd1Var.f37111f;
                    float f12 = f7 * r10;
                    fd1Var.f37111f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!fd1Var.d && r10 > 0.0f && z11 && k2Var.fragmentView != null) {
                        k2Var.onResume();
                        fd1Var.d = true;
                    }
                    if (!fd1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        k2Var.onTransitionAnimationStart(z10, false);
                        fd1Var.e = true;
                    }
                    if (fd1Var.e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        k2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (fd1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        k2Var.onTransitionAnimationEnd(z10, false);
                        fd1Var.e = false;
                    }
                    if (!fd1Var.f37110c && f12 >= 1.0f) {
                        k2Var.onBecomeFullyVisible();
                        fd1Var.f37110c = true;
                    }
                    if (fd1Var.f37110c && ((f12 == 0.0f && !z12) || r10 == 0.0f)) {
                        k2Var.onBecomeFullyHidden();
                        fd1Var.f37110c = false;
                    }
                    if (fd1Var.d && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        k2Var.onPause();
                        fd1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.k2 a0(int i10);

    @Override
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.f37787a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fd1 fd1Var = (fd1) sparseArray.valueAt(i10);
            if (fd1Var != null) {
                org.telegram.ui.ActionBar.k2 k2Var = fd1Var.f37108a;
                if (k2Var.fragmentView != null) {
                    k2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final void b0(int i10) {
        SparseArray sparseArray = this.f37787a;
        fd1 fd1Var = (fd1) sparseArray.get(i10);
        if (fd1Var != null) {
            org.telegram.ui.ActionBar.k2 k2Var = fd1Var.f37108a;
            if (fd1Var.f37110c) {
                k2Var.onBecomeFullyHidden();
            }
            if (fd1Var.d) {
                k2Var.onPause();
            }
            k2Var.onFragmentDestroy();
            k2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.k2 c0() {
        gd1 gd1Var = this.f37789c;
        if (gd1Var == null) {
            return null;
        }
        fd1 fd1Var = (fd1) this.f37787a.get(gd1Var.getCurrentPosition());
        if (fd1Var == null) {
            return null;
        }
        return fd1Var.f37108a;
    }

    @Override
    public final void clearViews() {
        gd1 gd1Var = this.f37789c;
        if (gd1Var != null) {
            this.d = gd1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f37787a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fd1 fd1Var = (fd1) sparseArray.valueAt(i10);
            if (fd1Var != null) {
                org.telegram.ui.ActionBar.k2 k2Var = fd1Var.f37108a;
                if (fd1Var.d) {
                    k2Var.onPause();
                    fd1Var.d = false;
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
        this.f37788b = new l0((of0) this, context, 15);
        gd1 gd1Var = new gd1(this, context);
        this.f37789c = gd1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        gd1Var.setPosition(this.d);
        this.f37789c.setAdapter(new mg.s(this, context, 7));
        this.f37788b.addView(this.f37789c, w7.b6.c(-1.0f, -1));
        l0 l0Var = this.f37788b;
        this.fragmentView = l0Var;
        rj0 rj0Var = new rj0(this, 25);
        WeakHashMap weakHashMap = r0.h0.f46134a;
        r0.z.i(l0Var, rj0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f37787a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fd1 fd1Var = (fd1) sparseArray.valueAt(i10);
            if (fd1Var != null) {
                org.telegram.ui.ActionBar.k2 k2Var = fd1Var.f37108a;
                if (k2Var.fragmentView != null) {
                    arrayList.addAll(k2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.k2 c02 = c0();
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
        org.telegram.ui.ActionBar.i5 i5Var;
        org.telegram.ui.ActionBar.s5 s5Var;
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.k2 c02 = c0();
            if (c02 != null) {
                i5Var = c02.getSimpleActionBar();
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
            } else if (c02 == null || c02.onBackPressed(z10)) {
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
        Z();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        Z();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f37787a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fd1 fd1Var = (fd1) sparseArray.valueAt(i10);
            boolean z10 = fd1Var.f37109b;
            org.telegram.ui.ActionBar.k2 k2Var = fd1Var.f37108a;
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
        this.f37790f = false;
        Z();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.k2 c02 = c0();
        if (c02 != null) {
            c02.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f37790f = true;
        checkSystemBarColors();
        Z();
    }

    @Override
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.f37787a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fd1 fd1Var = (fd1) sparseArray.valueAt(i10);
            if (fd1Var != null) {
                org.telegram.ui.ActionBar.k2 k2Var = fd1Var.f37108a;
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
        Z();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.f37791n = str;
        this.f37792r = i10;
        this.f37793s = runnable;
        SparseArray sparseArray = this.f37787a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            fd1 fd1Var = (fd1) sparseArray.valueAt(i11);
            if (fd1Var != null) {
                fd1Var.f37108a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
