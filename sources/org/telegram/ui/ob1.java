package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
public abstract class ob1 extends org.telegram.ui.ActionBar.g2 {
    public final SparseArray f50632a;
    public k0 f50633b;
    public nb1 f50634c;
    public int d;
    public float f50635e;
    public boolean f50636f;
    public boolean h;
    public String f50637n;
    public int f50638r;
    public Runnable f50639s;

    public ob1() {
        super(null);
        this.f50632a = new SparseArray();
        this.d = -1;
        this.f50635e = 0.0f;
    }

    public final void Z() {
        float f10;
        boolean z10;
        float f11;
        SparseArray sparseArray = this.f50632a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            mb1 mb1Var = (mb1) sparseArray.valueAt(i7);
            int keyAt = sparseArray.keyAt(i7);
            if (mb1Var != null) {
                org.telegram.ui.ActionBar.g2 g2Var = mb1Var.f50028a;
                if (g2Var.fragmentView != null) {
                    float o4 = this.f50634c.o(keyAt);
                    boolean z11 = this.f50636f;
                    if (z11) {
                        f10 = this.f50635e;
                    } else {
                        f10 = 0.0f;
                    }
                    boolean z12 = this.h;
                    if (mb1Var.f50033g <= 0.0f && o4 > 0.0f && z11 && (g2Var instanceof ke0)) {
                        ke0 ke0Var = (ke0) g2Var;
                    }
                    mb1Var.f50033g = o4;
                    float f12 = mb1Var.f50032f;
                    float f13 = f10 * o4;
                    mb1Var.f50032f = f13;
                    if (f13 > f12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!mb1Var.d && o4 > 0.0f && z11 && g2Var.fragmentView != null) {
                        g2Var.onResume();
                        mb1Var.d = true;
                    }
                    if (!mb1Var.f50031e && ((f12 == 0.0f || f12 == 1.0f) && f12 != f13 && Math.abs(f12 - f13) != 1.0f)) {
                        g2Var.onTransitionAnimationStart(z10, false);
                        mb1Var.f50031e = true;
                    }
                    if (mb1Var.f50031e && f12 != f13) {
                        if (z10) {
                            f11 = f13;
                        } else {
                            f11 = 1.0f - f13;
                        }
                        g2Var.onTransitionAnimationProgress(z10, f11);
                    }
                    if (mb1Var.f50031e && (f13 == 0.0f || f13 == 1.0f)) {
                        g2Var.onTransitionAnimationEnd(z10, false);
                        mb1Var.f50031e = false;
                    }
                    if (!mb1Var.f50030c && f13 >= 1.0f) {
                        g2Var.onBecomeFullyVisible();
                        mb1Var.f50030c = true;
                    }
                    if (mb1Var.f50030c && ((f13 == 0.0f && !z12) || o4 == 0.0f)) {
                        g2Var.onBecomeFullyHidden();
                        mb1Var.f50030c = false;
                    }
                    if (mb1Var.d && ((f13 == 0.0f && !z11) || o4 == 0.0f)) {
                        g2Var.onPause();
                        mb1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.g2 a0(int i7);

    @Override
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.f50632a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            mb1 mb1Var = (mb1) sparseArray.valueAt(i7);
            if (mb1Var != null) {
                org.telegram.ui.ActionBar.g2 g2Var = mb1Var.f50028a;
                if (g2Var.fragmentView != null) {
                    g2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final void b0(int i7) {
        SparseArray sparseArray = this.f50632a;
        mb1 mb1Var = (mb1) sparseArray.get(i7);
        if (mb1Var != null) {
            org.telegram.ui.ActionBar.g2 g2Var = mb1Var.f50028a;
            if (mb1Var.f50030c) {
                g2Var.onBecomeFullyHidden();
            }
            if (mb1Var.d) {
                g2Var.onPause();
            }
            g2Var.onFragmentDestroy();
            g2Var.setParentLayout(null);
        }
        sparseArray.remove(i7);
    }

    public final org.telegram.ui.ActionBar.g2 c0() {
        nb1 nb1Var = this.f50634c;
        if (nb1Var == null) {
            return null;
        }
        mb1 mb1Var = (mb1) this.f50632a.get(nb1Var.getCurrentPosition());
        if (mb1Var == null) {
            return null;
        }
        return mb1Var.f50028a;
    }

    @Override
    public final void clearViews() {
        nb1 nb1Var = this.f50634c;
        if (nb1Var != null) {
            this.d = nb1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f50632a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            mb1 mb1Var = (mb1) sparseArray.valueAt(i7);
            if (mb1Var != null) {
                org.telegram.ui.ActionBar.g2 g2Var = mb1Var.f50028a;
                if (mb1Var.d) {
                    g2Var.onPause();
                    mb1Var.d = false;
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
        this.f50633b = new k0(14, context, (le0) this);
        nb1 nb1Var = new nb1(this, context);
        this.f50634c = nb1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        nb1Var.setPosition(this.d);
        this.f50634c.setAdapter(new di.i4(8, context, this));
        this.f50633b.addView(this.f50634c, c8.na.c(-1.0f, -1));
        k0 k0Var = this.f50633b;
        this.fragmentView = k0Var;
        oi0 oi0Var = new oi0(this, 24);
        WeakHashMap weakHashMap = r0.i0.f56367a;
        r0.a0.i(k0Var, oi0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f50632a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            mb1 mb1Var = (mb1) sparseArray.valueAt(i7);
            if (mb1Var != null) {
                org.telegram.ui.ActionBar.g2 g2Var = mb1Var.f50028a;
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
        this.f50635e = 0.0f;
        this.h = false;
        Z();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f50635e = 1.0f;
        this.h = true;
        Z();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f50632a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            mb1 mb1Var = (mb1) sparseArray.valueAt(i7);
            boolean z10 = mb1Var.f50029b;
            org.telegram.ui.ActionBar.g2 g2Var = mb1Var.f50028a;
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
        this.f50636f = false;
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
        this.f50636f = true;
        checkSystemBarColors();
        Z();
    }

    @Override
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.f50632a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            mb1 mb1Var = (mb1) sparseArray.valueAt(i7);
            if (mb1Var != null) {
                org.telegram.ui.ActionBar.g2 g2Var = mb1Var.f50028a;
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
        this.f50635e = f10;
        Z();
    }

    @Override
    public final void setTitleOverlayText(String str, int i7, Runnable runnable) {
        super.setTitleOverlayText(str, i7, runnable);
        this.f50637n = str;
        this.f50638r = i7;
        this.f50639s = runnable;
        SparseArray sparseArray = this.f50632a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            mb1 mb1Var = (mb1) sparseArray.valueAt(i10);
            if (mb1Var != null) {
                mb1Var.f50028a.setTitleOverlayText(str, i7, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i7, Runnable runnable) {
        setTitleOverlayText(str, i7, runnable);
    }
}
