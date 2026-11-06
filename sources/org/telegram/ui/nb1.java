package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
public abstract class nb1 extends org.telegram.ui.ActionBar.f2 {
    public final SparseArray f47987a;
    public k0 f47988b;
    public mb1 f47989c;
    public int d;
    public float f47990e;
    public boolean f47991f;
    public boolean h;
    public String f47992n;
    public int f47993r;
    public Runnable f47994s;

    public nb1() {
        super(null);
        this.f47987a = new SparseArray();
        this.d = -1;
        this.f47990e = 0.0f;
    }

    public final void Z() {
        float f10;
        boolean z9;
        float f11;
        SparseArray sparseArray = this.f47987a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            lb1 lb1Var = (lb1) sparseArray.valueAt(i7);
            int keyAt = sparseArray.keyAt(i7);
            if (lb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = lb1Var.f47478a;
                if (f2Var.fragmentView != null) {
                    float r10 = this.f47989c.r(keyAt);
                    boolean z10 = this.f47991f;
                    if (z10) {
                        f10 = this.f47990e;
                    } else {
                        f10 = 0.0f;
                    }
                    boolean z11 = this.h;
                    float f12 = lb1Var.f47482f;
                    float f13 = f10 * r10;
                    lb1Var.f47482f = f13;
                    if (f13 > f12) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!lb1Var.d && r10 > 0.0f && z10 && f2Var.fragmentView != null) {
                        f2Var.onResume();
                        lb1Var.d = true;
                    }
                    if (!lb1Var.f47481e && ((f12 == 0.0f || f12 == 1.0f) && f12 != f13 && Math.abs(f12 - f13) != 1.0f)) {
                        f2Var.onTransitionAnimationStart(z9, false);
                        lb1Var.f47481e = true;
                    }
                    if (lb1Var.f47481e && f12 != f13) {
                        if (z9) {
                            f11 = f13;
                        } else {
                            f11 = 1.0f - f13;
                        }
                        f2Var.onTransitionAnimationProgress(z9, f11);
                    }
                    if (lb1Var.f47481e && (f13 == 0.0f || f13 == 1.0f)) {
                        f2Var.onTransitionAnimationEnd(z9, false);
                        lb1Var.f47481e = false;
                    }
                    if (!lb1Var.f47480c && f13 >= 1.0f) {
                        f2Var.onBecomeFullyVisible();
                        lb1Var.f47480c = true;
                    }
                    if (lb1Var.f47480c && ((f13 == 0.0f && !z11) || r10 == 0.0f)) {
                        f2Var.onBecomeFullyHidden();
                        lb1Var.f47480c = false;
                    }
                    if (lb1Var.d && ((f13 == 0.0f && !z10) || r10 == 0.0f)) {
                        f2Var.onPause();
                        lb1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.f2 a0(int i7);

    @Override
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.f47987a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            lb1 lb1Var = (lb1) sparseArray.valueAt(i7);
            if (lb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = lb1Var.f47478a;
                if (f2Var.fragmentView != null) {
                    f2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final void b0(int i7) {
        SparseArray sparseArray = this.f47987a;
        lb1 lb1Var = (lb1) sparseArray.get(i7);
        if (lb1Var != null) {
            org.telegram.ui.ActionBar.f2 f2Var = lb1Var.f47478a;
            if (lb1Var.f47480c) {
                f2Var.onBecomeFullyHidden();
            }
            if (lb1Var.d) {
                f2Var.onPause();
            }
            f2Var.onFragmentDestroy();
            f2Var.setParentLayout(null);
        }
        sparseArray.remove(i7);
    }

    public final org.telegram.ui.ActionBar.f2 c0() {
        mb1 mb1Var = this.f47989c;
        if (mb1Var == null) {
            return null;
        }
        lb1 lb1Var = (lb1) this.f47987a.get(mb1Var.getCurrentPosition());
        if (lb1Var == null) {
            return null;
        }
        return lb1Var.f47478a;
    }

    @Override
    public final void clearViews() {
        mb1 mb1Var = this.f47989c;
        if (mb1Var != null) {
            this.d = mb1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f47987a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            lb1 lb1Var = (lb1) sparseArray.valueAt(i7);
            if (lb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = lb1Var.f47478a;
                if (lb1Var.d) {
                    f2Var.onPause();
                    lb1Var.d = false;
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
        this.f47988b = new k0(14, context, (je0) this);
        mb1 mb1Var = new mb1(this, context);
        this.f47989c = mb1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        mb1Var.setPosition(this.d);
        this.f47989c.setAdapter(new bi.g5(8, context, this));
        this.f47988b.addView(this.f47989c, c8.ha.c(-1.0f, -1));
        k0 k0Var = this.f47988b;
        this.fragmentView = k0Var;
        li0 li0Var = new li0(this, 24);
        WeakHashMap weakHashMap = r0.i0.f54073a;
        r0.a0.i(k0Var, li0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f47987a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            lb1 lb1Var = (lb1) sparseArray.valueAt(i7);
            if (lb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = lb1Var.f47478a;
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
        org.telegram.ui.ActionBar.i5 i5Var;
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
            if (y4Var != null && ((i5Var = y4Var.Q) != null || (!y4Var.G && y4Var.F))) {
                if (z9) {
                    if (i5Var != null) {
                        i5Var.a(true);
                        return false;
                    }
                    if (!y4Var.G && y4Var.F) {
                        y4Var.j(true);
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
        this.f47990e = 0.0f;
        this.h = false;
        Z();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f47990e = 1.0f;
        this.h = true;
        Z();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f47987a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            lb1 lb1Var = (lb1) sparseArray.valueAt(i7);
            boolean z9 = lb1Var.f47479b;
            org.telegram.ui.ActionBar.f2 f2Var = lb1Var.f47478a;
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
        this.f47991f = false;
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
        this.f47991f = true;
        checkSystemBarColors();
        Z();
    }

    @Override
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.f47987a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            lb1 lb1Var = (lb1) sparseArray.valueAt(i7);
            if (lb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = lb1Var.f47478a;
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
        this.f47990e = f10;
        Z();
    }

    @Override
    public final void setTitleOverlayText(String str, int i7, Runnable runnable) {
        super.setTitleOverlayText(str, i7, runnable);
        this.f47992n = str;
        this.f47993r = i7;
        this.f47994s = runnable;
        SparseArray sparseArray = this.f47987a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            lb1 lb1Var = (lb1) sparseArray.valueAt(i10);
            if (lb1Var != null) {
                lb1Var.f47478a.setTitleOverlayText(str, i7, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i7, Runnable runnable) {
        setTitleOverlayText(str, i7, runnable);
    }
}
