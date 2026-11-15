package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
public abstract class mb1 extends org.telegram.ui.ActionBar.e2 {
    public final SparseArray f49203a;
    public k0 f49204b;
    public lb1 f49205c;
    public int d;
    public float f49206e;
    public boolean f49207f;
    public boolean h;
    public String f49208n;
    public int f49209r;
    public Runnable f49210s;

    public mb1() {
        super(null);
        this.f49203a = new SparseArray();
        this.d = -1;
        this.f49206e = 0.0f;
    }

    public final void Z() {
        float f10;
        boolean z10;
        float f11;
        SparseArray sparseArray = this.f49203a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            kb1 kb1Var = (kb1) sparseArray.valueAt(i7);
            int keyAt = sparseArray.keyAt(i7);
            if (kb1Var != null) {
                org.telegram.ui.ActionBar.e2 e2Var = kb1Var.f48666a;
                if (e2Var.fragmentView != null) {
                    float o4 = this.f49205c.o(keyAt);
                    boolean z11 = this.f49207f;
                    if (z11) {
                        f10 = this.f49206e;
                    } else {
                        f10 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f12 = kb1Var.f48670f;
                    float f13 = f10 * o4;
                    kb1Var.f48670f = f13;
                    if (f13 > f12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!kb1Var.d && o4 > 0.0f && z11 && e2Var.fragmentView != null) {
                        e2Var.onResume();
                        kb1Var.d = true;
                    }
                    if (!kb1Var.f48669e && ((f12 == 0.0f || f12 == 1.0f) && f12 != f13 && Math.abs(f12 - f13) != 1.0f)) {
                        e2Var.onTransitionAnimationStart(z10, false);
                        kb1Var.f48669e = true;
                    }
                    if (kb1Var.f48669e && f12 != f13) {
                        if (z10) {
                            f11 = f13;
                        } else {
                            f11 = 1.0f - f13;
                        }
                        e2Var.onTransitionAnimationProgress(z10, f11);
                    }
                    if (kb1Var.f48669e && (f13 == 0.0f || f13 == 1.0f)) {
                        e2Var.onTransitionAnimationEnd(z10, false);
                        kb1Var.f48669e = false;
                    }
                    if (!kb1Var.f48668c && f13 >= 1.0f) {
                        e2Var.onBecomeFullyVisible();
                        kb1Var.f48668c = true;
                    }
                    if (kb1Var.f48668c && ((f13 == 0.0f && !z12) || o4 == 0.0f)) {
                        e2Var.onBecomeFullyHidden();
                        kb1Var.f48668c = false;
                    }
                    if (kb1Var.d && ((f13 == 0.0f && !z11) || o4 == 0.0f)) {
                        e2Var.onPause();
                        kb1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.e2 a0(int i7);

    @Override
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.f49203a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            kb1 kb1Var = (kb1) sparseArray.valueAt(i7);
            if (kb1Var != null) {
                org.telegram.ui.ActionBar.e2 e2Var = kb1Var.f48666a;
                if (e2Var.fragmentView != null) {
                    e2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final void b0(int i7) {
        SparseArray sparseArray = this.f49203a;
        kb1 kb1Var = (kb1) sparseArray.get(i7);
        if (kb1Var != null) {
            org.telegram.ui.ActionBar.e2 e2Var = kb1Var.f48666a;
            if (kb1Var.f48668c) {
                e2Var.onBecomeFullyHidden();
            }
            if (kb1Var.d) {
                e2Var.onPause();
            }
            e2Var.onFragmentDestroy();
            e2Var.setParentLayout(null);
        }
        sparseArray.remove(i7);
    }

    public final org.telegram.ui.ActionBar.e2 c0() {
        lb1 lb1Var = this.f49205c;
        if (lb1Var == null) {
            return null;
        }
        kb1 kb1Var = (kb1) this.f49203a.get(lb1Var.getCurrentPosition());
        if (kb1Var == null) {
            return null;
        }
        return kb1Var.f48666a;
    }

    @Override
    public final void clearViews() {
        lb1 lb1Var = this.f49205c;
        if (lb1Var != null) {
            this.d = lb1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f49203a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            kb1 kb1Var = (kb1) sparseArray.valueAt(i7);
            if (kb1Var != null) {
                org.telegram.ui.ActionBar.e2 e2Var = kb1Var.f48666a;
                if (kb1Var.d) {
                    e2Var.onPause();
                    kb1Var.d = false;
                }
                e2Var.clearViews();
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
        this.f49204b = new k0(14, context, (je0) this);
        lb1 lb1Var = new lb1(this, context);
        this.f49205c = lb1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        lb1Var.setPosition(this.d);
        this.f49205c.setAdapter(new di.f4(8, context, this));
        this.f49204b.addView(this.f49205c, c8.ja.c(-1.0f, -1));
        k0 k0Var = this.f49204b;
        this.fragmentView = k0Var;
        ni0 ni0Var = new ni0(this, 24);
        WeakHashMap weakHashMap = r0.i0.f55671a;
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
        SparseArray sparseArray = this.f49203a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            kb1 kb1Var = (kb1) sparseArray.valueAt(i7);
            if (kb1Var != null) {
                org.telegram.ui.ActionBar.e2 e2Var = kb1Var.f48666a;
                if (e2Var.fragmentView != null) {
                    arrayList.addAll(e2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.e2 c02 = c0();
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
        org.telegram.ui.ActionBar.w4 w4Var;
        org.telegram.ui.ActionBar.g5 g5Var;
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.e2 c02 = c0();
            if (c02 != null) {
                w4Var = c02.getSimpleActionBar();
            } else {
                w4Var = null;
            }
            if (w4Var != null && ((g5Var = w4Var.R) != null || (!w4Var.H && w4Var.G))) {
                if (z10) {
                    if (g5Var != null) {
                        g5Var.a(true);
                        return false;
                    }
                    if (!w4Var.H && w4Var.G) {
                        w4Var.m(true);
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
        this.f49206e = 0.0f;
        this.h = false;
        Z();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f49206e = 1.0f;
        this.h = true;
        Z();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f49203a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            kb1 kb1Var = (kb1) sparseArray.valueAt(i7);
            boolean z10 = kb1Var.f48667b;
            org.telegram.ui.ActionBar.e2 e2Var = kb1Var.f48666a;
            if (z10) {
                e2Var.onFragmentDestroy();
                e2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f49207f = false;
        Z();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.e2 c02 = c0();
        if (c02 != null) {
            c02.onRequestPermissionsResultFragment(i7, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f49207f = true;
        checkSystemBarColors();
        Z();
    }

    @Override
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.f49203a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            kb1 kb1Var = (kb1) sparseArray.valueAt(i7);
            if (kb1Var != null) {
                org.telegram.ui.ActionBar.e2 e2Var = kb1Var.f48666a;
                if (e2Var.fragmentView != null) {
                    try {
                        e2Var.onThemeColorsChanged();
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
        this.f49206e = f10;
        Z();
    }

    @Override
    public final void setTitleOverlayText(String str, int i7, Runnable runnable) {
        super.setTitleOverlayText(str, i7, runnable);
        this.f49208n = str;
        this.f49209r = i7;
        this.f49210s = runnable;
        SparseArray sparseArray = this.f49203a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            kb1 kb1Var = (kb1) sparseArray.valueAt(i10);
            if (kb1Var != null) {
                kb1Var.f48666a.setTitleOverlayText(str, i7, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i7, Runnable runnable) {
        setTitleOverlayText(str, i7, runnable);
    }
}
