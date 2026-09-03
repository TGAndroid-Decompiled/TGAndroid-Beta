package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class ph1 extends org.telegram.ui.ActionBar.p2 {
    public final SparseArray f40020a;
    public l0 f40021b;
    public oh1 f40022c;
    public int d;
    public float f40023e;
    public boolean f40024f;
    public boolean h;
    public String f40025n;
    public int f40026r;
    public Runnable f40027s;

    public ph1() {
        super(null);
        this.f40020a = new SparseArray();
        this.d = -1;
        this.f40023e = 0.0f;
    }

    public final void U() {
        float f10;
        boolean z4;
        float f11;
        SparseArray sparseArray = this.f40020a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            nh1 nh1Var = (nh1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (nh1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = nh1Var.f39375a;
                if (p2Var.fragmentView != null) {
                    float r10 = this.f40022c.r(keyAt);
                    boolean z10 = this.f40024f;
                    if (z10) {
                        f10 = this.f40023e;
                    } else {
                        f10 = 0.0f;
                    }
                    boolean z11 = this.h;
                    float f12 = nh1Var.f39379f;
                    float f13 = f10 * r10;
                    nh1Var.f39379f = f13;
                    if (f13 > f12) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!nh1Var.d && r10 > 0.0f && z10 && p2Var.fragmentView != null) {
                        p2Var.onResume();
                        nh1Var.d = true;
                    }
                    if (!nh1Var.f39378e && ((f12 == 0.0f || f12 == 1.0f) && f12 != f13 && Math.abs(f12 - f13) != 1.0f)) {
                        p2Var.onTransitionAnimationStart(z4, false);
                        nh1Var.f39378e = true;
                    }
                    if (nh1Var.f39378e && f12 != f13) {
                        if (z4) {
                            f11 = f13;
                        } else {
                            f11 = 1.0f - f13;
                        }
                        p2Var.onTransitionAnimationProgress(z4, f11);
                    }
                    if (nh1Var.f39378e && (f13 == 0.0f || f13 == 1.0f)) {
                        p2Var.onTransitionAnimationEnd(z4, false);
                        nh1Var.f39378e = false;
                    }
                    if (!nh1Var.f39377c && f13 >= 1.0f) {
                        p2Var.onBecomeFullyVisible();
                        nh1Var.f39377c = true;
                    }
                    if (nh1Var.f39377c && ((f13 == 0.0f && !z11) || r10 == 0.0f)) {
                        p2Var.onBecomeFullyHidden();
                        nh1Var.f39377c = false;
                    }
                    if (nh1Var.d && ((f13 == 0.0f && !z10) || r10 == 0.0f)) {
                        p2Var.onPause();
                        nh1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.p2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f40020a;
        nh1 nh1Var = (nh1) sparseArray.get(i10);
        if (nh1Var != null) {
            org.telegram.ui.ActionBar.p2 p2Var = nh1Var.f39375a;
            if (nh1Var.f39377c) {
                p2Var.onBecomeFullyHidden();
            }
            if (nh1Var.d) {
                p2Var.onPause();
            }
            p2Var.onFragmentDestroy();
            p2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.p2 X() {
        oh1 oh1Var = this.f40022c;
        if (oh1Var == null) {
            return null;
        }
        nh1 nh1Var = (nh1) this.f40020a.get(oh1Var.getCurrentPosition());
        if (nh1Var == null) {
            return null;
        }
        return nh1Var.f39375a;
    }

    @Override
    public final void clearViews() {
        oh1 oh1Var = this.f40022c;
        if (oh1Var != null) {
            this.d = oh1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f40020a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            nh1 nh1Var = (nh1) sparseArray.valueAt(i10);
            if (nh1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = nh1Var.f39375a;
                if (nh1Var.d) {
                    p2Var.onPause();
                    nh1Var.d = false;
                }
                p2Var.clearViews();
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
        this.f40021b = new l0((wg0) this, context, 13);
        oh1 oh1Var = new oh1(this, context);
        this.f40022c = oh1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        oh1Var.setPosition(this.d);
        this.f40022c.setAdapter(new hg.u(this, context, 5));
        this.f40021b.addView(this.f40022c, k7.c6.c(-1.0f, -1));
        l0 l0Var = this.f40021b;
        this.fragmentView = l0Var;
        kl0 kl0Var = new kl0(this, 26);
        WeakHashMap weakHashMap = r0.j0.f46469a;
        r0.b0.j(l0Var, kl0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f40020a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            nh1 nh1Var = (nh1) sparseArray.valueAt(i10);
            if (nh1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = nh1Var.f39375a;
                if (p2Var.fragmentView != null) {
                    arrayList.addAll(p2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.p2 X = X();
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
    public boolean onBackPressed(boolean z4) {
        if (hasShownSheet()) {
            if (z4) {
                closeSheet();
            }
            return false;
        }
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null && !X.onBackPressed(z4)) {
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.f40023e = 0.0f;
        this.h = false;
        U();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f40023e = 1.0f;
        this.h = true;
        U();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f40020a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            nh1 nh1Var = (nh1) sparseArray.valueAt(i10);
            boolean z4 = nh1Var.f39376b;
            org.telegram.ui.ActionBar.p2 p2Var = nh1Var.f39375a;
            if (z4) {
                p2Var.onFragmentDestroy();
                p2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f40024f = false;
        U();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            X.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f40024f = true;
        checkSystemBarColors();
        U();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        super.onTransitionAnimationProgress(z4, f10);
        if (!z4) {
            f10 = 1.0f - f10;
        }
        this.f40023e = f10;
        U();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.f40025n = str;
        this.f40026r = i10;
        this.f40027s = runnable;
        SparseArray sparseArray = this.f40020a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            nh1 nh1Var = (nh1) sparseArray.valueAt(i11);
            if (nh1Var != null) {
                nh1Var.f39375a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
