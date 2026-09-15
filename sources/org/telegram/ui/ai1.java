package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class ai1 extends org.telegram.ui.ActionBar.n2 {
    public final SparseArray f31845a;
    public j0 f31846b;
    public zh1 f31847c;
    public int d;
    public float e;
    public boolean f31848f;
    public boolean h;
    public String f31849n;
    public int f31850r;
    public Runnable f31851s;

    public ai1() {
        super(null);
        this.f31845a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f31845a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            yh1 yh1Var = (yh1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (yh1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = yh1Var.f39911a;
                if (n2Var.fragmentView != null) {
                    float r10 = this.f31847c.r(keyAt);
                    boolean z11 = this.f31848f;
                    if (z11) {
                        f7 = this.e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = yh1Var.f39914f;
                    float f12 = f7 * r10;
                    yh1Var.f39914f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!yh1Var.d && r10 > 0.0f && z11 && n2Var.fragmentView != null) {
                        n2Var.onResume();
                        yh1Var.d = true;
                    }
                    if (!yh1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        n2Var.onTransitionAnimationStart(z10, false);
                        yh1Var.e = true;
                    }
                    if (yh1Var.e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        n2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (yh1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        n2Var.onTransitionAnimationEnd(z10, false);
                        yh1Var.e = false;
                    }
                    if (!yh1Var.f39913c && f12 >= 1.0f) {
                        n2Var.onBecomeFullyVisible();
                        yh1Var.f39913c = true;
                    }
                    if (yh1Var.f39913c && ((f12 == 0.0f && !z12) || r10 == 0.0f)) {
                        n2Var.onBecomeFullyHidden();
                        yh1Var.f39913c = false;
                    }
                    if (yh1Var.d && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        n2Var.onPause();
                        yh1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.n2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f31845a;
        yh1 yh1Var = (yh1) sparseArray.get(i10);
        if (yh1Var != null) {
            org.telegram.ui.ActionBar.n2 n2Var = yh1Var.f39911a;
            if (yh1Var.f39913c) {
                n2Var.onBecomeFullyHidden();
            }
            if (yh1Var.d) {
                n2Var.onPause();
            }
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.n2 X() {
        zh1 zh1Var = this.f31847c;
        if (zh1Var == null) {
            return null;
        }
        yh1 yh1Var = (yh1) this.f31845a.get(zh1Var.getCurrentPosition());
        if (yh1Var == null) {
            return null;
        }
        return yh1Var.f39911a;
    }

    @Override
    public final void clearViews() {
        zh1 zh1Var = this.f31847c;
        if (zh1Var != null) {
            this.d = zh1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f31845a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            yh1 yh1Var = (yh1) sparseArray.valueAt(i10);
            if (yh1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = yh1Var.f39911a;
                if (yh1Var.d) {
                    n2Var.onPause();
                    yh1Var.d = false;
                }
                n2Var.clearViews();
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
        this.f31846b = new j0((eh0) this, context, 13);
        zh1 zh1Var = new zh1(this, context);
        this.f31847c = zh1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        zh1Var.setPosition(this.d);
        this.f31847c.setAdapter(new iw0(this, context, 3));
        this.f31846b.addView(this.f31847c, w7.x5.c(-1.0f, -1));
        j0 j0Var = this.f31846b;
        this.fragmentView = j0Var;
        tl0 tl0Var = new tl0(this, 27);
        WeakHashMap weakHashMap = r0.i0.f41843a;
        r0.a0.j(j0Var, tl0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f31845a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            yh1 yh1Var = (yh1) sparseArray.valueAt(i10);
            if (yh1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = yh1Var.f39911a;
                if (n2Var.fragmentView != null) {
                    arrayList.addAll(n2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.n2 X = X();
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
    public boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
            }
            return false;
        }
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null && !X.onBackPressed(z10)) {
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        U();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        U();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f31845a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            yh1 yh1Var = (yh1) sparseArray.valueAt(i10);
            boolean z10 = yh1Var.f39912b;
            org.telegram.ui.ActionBar.n2 n2Var = yh1Var.f39911a;
            if (z10) {
                n2Var.onFragmentDestroy();
                n2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f31848f = false;
        U();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null) {
            X.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f31848f = true;
        checkSystemBarColors();
        U();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        if (!z10) {
            f7 = 1.0f - f7;
        }
        this.e = f7;
        U();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.f31849n = str;
        this.f31850r = i10;
        this.f31851s = runnable;
        SparseArray sparseArray = this.f31845a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            yh1 yh1Var = (yh1) sparseArray.valueAt(i11);
            if (yh1Var != null) {
                yh1Var.f39911a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
