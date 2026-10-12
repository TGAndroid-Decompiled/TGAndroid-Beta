package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class ei1 extends org.telegram.ui.ActionBar.m2 {
    public final SparseArray f37119a;
    public k0 f37120b;
    public di1 f37121c;
    public int d;
    public float f37122e;
    public boolean f37123f;
    public boolean h;
    public String f37124n;
    public int f37125r;
    public Runnable f37126s;

    public ei1() {
        super(null);
        this.f37119a = new SparseArray();
        this.d = -1;
        this.f37122e = 0.0f;
    }

    public final void U() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f37119a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ci1 ci1Var = (ci1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (ci1Var != null) {
                org.telegram.ui.ActionBar.m2 m2Var = ci1Var.f36443a;
                if (m2Var.fragmentView != null) {
                    float r10 = this.f37121c.r(keyAt);
                    boolean z11 = this.f37123f;
                    if (z11) {
                        f7 = this.f37122e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = ci1Var.f36447f;
                    float f12 = f7 * r10;
                    ci1Var.f36447f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!ci1Var.d && r10 > 0.0f && z11 && m2Var.fragmentView != null) {
                        m2Var.onResume();
                        ci1Var.d = true;
                    }
                    if (!ci1Var.f36446e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        m2Var.onTransitionAnimationStart(z10, false);
                        ci1Var.f36446e = true;
                    }
                    if (ci1Var.f36446e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        m2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (ci1Var.f36446e && (f12 == 0.0f || f12 == 1.0f)) {
                        m2Var.onTransitionAnimationEnd(z10, false);
                        ci1Var.f36446e = false;
                    }
                    if (!ci1Var.f36445c && f12 >= 1.0f) {
                        m2Var.onBecomeFullyVisible();
                        ci1Var.f36445c = true;
                    }
                    if (ci1Var.f36445c && ((f12 == 0.0f && !z12) || r10 == 0.0f)) {
                        m2Var.onBecomeFullyHidden();
                        ci1Var.f36445c = false;
                    }
                    if (ci1Var.d && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        m2Var.onPause();
                        ci1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.m2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f37119a;
        ci1 ci1Var = (ci1) sparseArray.get(i10);
        if (ci1Var != null) {
            org.telegram.ui.ActionBar.m2 m2Var = ci1Var.f36443a;
            if (ci1Var.f36445c) {
                m2Var.onBecomeFullyHidden();
            }
            if (ci1Var.d) {
                m2Var.onPause();
            }
            m2Var.onFragmentDestroy();
            m2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.m2 X() {
        di1 di1Var = this.f37121c;
        if (di1Var == null) {
            return null;
        }
        ci1 ci1Var = (ci1) this.f37119a.get(di1Var.getCurrentPosition());
        if (ci1Var == null) {
            return null;
        }
        return ci1Var.f36443a;
    }

    @Override
    public final void clearViews() {
        di1 di1Var = this.f37121c;
        if (di1Var != null) {
            this.d = di1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f37119a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ci1 ci1Var = (ci1) sparseArray.valueAt(i10);
            if (ci1Var != null) {
                org.telegram.ui.ActionBar.m2 m2Var = ci1Var.f36443a;
                if (ci1Var.d) {
                    m2Var.onPause();
                    ci1Var.d = false;
                }
                m2Var.clearViews();
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
        this.f37120b = new k0((gh0) this, context, 13);
        di1 di1Var = new di1(this, context);
        this.f37121c = di1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        di1Var.setPosition(this.d);
        this.f37121c.setAdapter(new kw0(this, context, 3));
        this.f37120b.addView(this.f37121c, w7.w5.d(-1.0f, -1));
        k0 k0Var = this.f37120b;
        this.fragmentView = k0Var;
        jq0 jq0Var = new jq0(this, 25);
        WeakHashMap weakHashMap = r0.i0.f46989a;
        r0.a0.i(k0Var, jq0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f37119a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ci1 ci1Var = (ci1) sparseArray.valueAt(i10);
            if (ci1Var != null) {
                org.telegram.ui.ActionBar.m2 m2Var = ci1Var.f36443a;
                if (m2Var.fragmentView != null) {
                    arrayList.addAll(m2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.m2 X = X();
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
        org.telegram.ui.ActionBar.m2 X = X();
        if (X != null && !X.onBackPressed(z10)) {
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.f37122e = 0.0f;
        this.h = false;
        U();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f37122e = 1.0f;
        this.h = true;
        U();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f37119a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ci1 ci1Var = (ci1) sparseArray.valueAt(i10);
            boolean z10 = ci1Var.f36444b;
            org.telegram.ui.ActionBar.m2 m2Var = ci1Var.f36443a;
            if (z10) {
                m2Var.onFragmentDestroy();
                m2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f37123f = false;
        U();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.m2 X = X();
        if (X != null) {
            X.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f37123f = true;
        checkSystemBarColors();
        U();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        if (!z10) {
            f7 = 1.0f - f7;
        }
        this.f37122e = f7;
        U();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.f37124n = str;
        this.f37125r = i10;
        this.f37126s = runnable;
        SparseArray sparseArray = this.f37119a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            ci1 ci1Var = (ci1) sparseArray.valueAt(i11);
            if (ci1Var != null) {
                ci1Var.f36443a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
