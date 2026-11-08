package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
public abstract class ob1 extends org.telegram.ui.ActionBar.f2 {
    public final SparseArray f48361a;
    public k0 f48362b;
    public nb1 f48363c;
    public int d;
    public float f48364e;
    public boolean f48365f;
    public boolean h;
    public String f48366n;
    public int f48367r;
    public Runnable f48368s;

    public ob1() {
        super(null);
        this.f48361a = new SparseArray();
        this.d = -1;
        this.f48364e = 0.0f;
    }

    public final void Z() {
        float f10;
        boolean z9;
        float f11;
        SparseArray sparseArray = this.f48361a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            mb1 mb1Var = (mb1) sparseArray.valueAt(i7);
            int keyAt = sparseArray.keyAt(i7);
            if (mb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = mb1Var.f47776a;
                if (f2Var.fragmentView != null) {
                    float r10 = this.f48363c.r(keyAt);
                    boolean z10 = this.f48365f;
                    if (z10) {
                        f10 = this.f48364e;
                    } else {
                        f10 = 0.0f;
                    }
                    boolean z11 = this.h;
                    float f12 = mb1Var.f47780f;
                    float f13 = f10 * r10;
                    mb1Var.f47780f = f13;
                    if (f13 > f12) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!mb1Var.d && r10 > 0.0f && z10 && f2Var.fragmentView != null) {
                        f2Var.onResume();
                        mb1Var.d = true;
                    }
                    if (!mb1Var.f47779e && ((f12 == 0.0f || f12 == 1.0f) && f12 != f13 && Math.abs(f12 - f13) != 1.0f)) {
                        f2Var.onTransitionAnimationStart(z9, false);
                        mb1Var.f47779e = true;
                    }
                    if (mb1Var.f47779e && f12 != f13) {
                        if (z9) {
                            f11 = f13;
                        } else {
                            f11 = 1.0f - f13;
                        }
                        f2Var.onTransitionAnimationProgress(z9, f11);
                    }
                    if (mb1Var.f47779e && (f13 == 0.0f || f13 == 1.0f)) {
                        f2Var.onTransitionAnimationEnd(z9, false);
                        mb1Var.f47779e = false;
                    }
                    if (!mb1Var.f47778c && f13 >= 1.0f) {
                        f2Var.onBecomeFullyVisible();
                        mb1Var.f47778c = true;
                    }
                    if (mb1Var.f47778c && ((f13 == 0.0f && !z11) || r10 == 0.0f)) {
                        f2Var.onBecomeFullyHidden();
                        mb1Var.f47778c = false;
                    }
                    if (mb1Var.d && ((f13 == 0.0f && !z10) || r10 == 0.0f)) {
                        f2Var.onPause();
                        mb1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.f2 a0(int i7);

    @Override
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.f48361a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            mb1 mb1Var = (mb1) sparseArray.valueAt(i7);
            if (mb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = mb1Var.f47776a;
                if (f2Var.fragmentView != null) {
                    f2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final void b0(int i7) {
        SparseArray sparseArray = this.f48361a;
        mb1 mb1Var = (mb1) sparseArray.get(i7);
        if (mb1Var != null) {
            org.telegram.ui.ActionBar.f2 f2Var = mb1Var.f47776a;
            if (mb1Var.f47778c) {
                f2Var.onBecomeFullyHidden();
            }
            if (mb1Var.d) {
                f2Var.onPause();
            }
            f2Var.onFragmentDestroy();
            f2Var.setParentLayout(null);
        }
        sparseArray.remove(i7);
    }

    public final org.telegram.ui.ActionBar.f2 c0() {
        nb1 nb1Var = this.f48363c;
        if (nb1Var == null) {
            return null;
        }
        mb1 mb1Var = (mb1) this.f48361a.get(nb1Var.getCurrentPosition());
        if (mb1Var == null) {
            return null;
        }
        return mb1Var.f47776a;
    }

    @Override
    public final void clearViews() {
        nb1 nb1Var = this.f48363c;
        if (nb1Var != null) {
            this.d = nb1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f48361a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            mb1 mb1Var = (mb1) sparseArray.valueAt(i7);
            if (mb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = mb1Var.f47776a;
                if (mb1Var.d) {
                    f2Var.onPause();
                    mb1Var.d = false;
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
        this.f48362b = new k0(14, context, (je0) this);
        nb1 nb1Var = new nb1(this, context);
        this.f48363c = nb1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        nb1Var.setPosition(this.d);
        this.f48363c.setAdapter(new bi.g5(8, context, this));
        this.f48362b.addView(this.f48363c, c8.ha.c(-1.0f, -1));
        k0 k0Var = this.f48362b;
        this.fragmentView = k0Var;
        li0 li0Var = new li0(this, 24);
        WeakHashMap weakHashMap = r0.i0.f54191a;
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
        SparseArray sparseArray = this.f48361a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            mb1 mb1Var = (mb1) sparseArray.valueAt(i7);
            if (mb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = mb1Var.f47776a;
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
        this.f48364e = 0.0f;
        this.h = false;
        Z();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f48364e = 1.0f;
        this.h = true;
        Z();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f48361a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            mb1 mb1Var = (mb1) sparseArray.valueAt(i7);
            boolean z9 = mb1Var.f47777b;
            org.telegram.ui.ActionBar.f2 f2Var = mb1Var.f47776a;
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
        this.f48365f = false;
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
        this.f48365f = true;
        checkSystemBarColors();
        Z();
    }

    @Override
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.f48361a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            mb1 mb1Var = (mb1) sparseArray.valueAt(i7);
            if (mb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = mb1Var.f47776a;
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
        this.f48364e = f10;
        Z();
    }

    @Override
    public final void setTitleOverlayText(String str, int i7, Runnable runnable) {
        super.setTitleOverlayText(str, i7, runnable);
        this.f48366n = str;
        this.f48367r = i7;
        this.f48368s = runnable;
        SparseArray sparseArray = this.f48361a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            mb1 mb1Var = (mb1) sparseArray.valueAt(i10);
            if (mb1Var != null) {
                mb1Var.f47776a.setTitleOverlayText(str, i7, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i7, Runnable runnable) {
        setTitleOverlayText(str, i7, runnable);
    }
}
