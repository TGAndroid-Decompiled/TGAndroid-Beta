package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class ji1 extends org.telegram.ui.ActionBar.m2 {
    public final SparseArray f37070a;
    public l0 f37071b;
    public ii1 f37072c;
    public int d;
    public float e;
    public boolean f37073f;
    public boolean h;
    public String f37074n;
    public int f37075r;
    public Runnable f37076s;

    public ji1() {
        super(null);
        this.f37070a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f37070a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hi1 hi1Var = (hi1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (hi1Var != null) {
                org.telegram.ui.ActionBar.m2 m2Var = hi1Var.f36579a;
                if (m2Var.fragmentView != null) {
                    float r10 = this.f37072c.r(keyAt);
                    boolean z11 = this.f37073f;
                    if (z11) {
                        f7 = this.e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = hi1Var.f36582f;
                    float f12 = f7 * r10;
                    hi1Var.f36582f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!hi1Var.d && r10 > 0.0f && z11 && m2Var.fragmentView != null) {
                        m2Var.onResume();
                        hi1Var.d = true;
                    }
                    if (!hi1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        m2Var.onTransitionAnimationStart(z10, false);
                        hi1Var.e = true;
                    }
                    if (hi1Var.e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        m2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (hi1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        m2Var.onTransitionAnimationEnd(z10, false);
                        hi1Var.e = false;
                    }
                    if (!hi1Var.f36581c && f12 >= 1.0f) {
                        m2Var.onBecomeFullyVisible();
                        hi1Var.f36581c = true;
                    }
                    if (hi1Var.f36581c && ((f12 == 0.0f && !z12) || r10 == 0.0f)) {
                        m2Var.onBecomeFullyHidden();
                        hi1Var.f36581c = false;
                    }
                    if (hi1Var.d && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        m2Var.onPause();
                        hi1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.m2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f37070a;
        hi1 hi1Var = (hi1) sparseArray.get(i10);
        if (hi1Var != null) {
            org.telegram.ui.ActionBar.m2 m2Var = hi1Var.f36579a;
            if (hi1Var.f36581c) {
                m2Var.onBecomeFullyHidden();
            }
            if (hi1Var.d) {
                m2Var.onPause();
            }
            m2Var.onFragmentDestroy();
            m2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.m2 X() {
        ii1 ii1Var = this.f37072c;
        if (ii1Var == null) {
            return null;
        }
        hi1 hi1Var = (hi1) this.f37070a.get(ii1Var.getCurrentPosition());
        if (hi1Var == null) {
            return null;
        }
        return hi1Var.f36579a;
    }

    @Override
    public final void clearViews() {
        ii1 ii1Var = this.f37072c;
        if (ii1Var != null) {
            this.d = ii1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f37070a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hi1 hi1Var = (hi1) sparseArray.valueAt(i10);
            if (hi1Var != null) {
                org.telegram.ui.ActionBar.m2 m2Var = hi1Var.f36579a;
                if (hi1Var.d) {
                    m2Var.onPause();
                    hi1Var.d = false;
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
        this.f37071b = new l0((jh0) this, context, 13);
        ii1 ii1Var = new ii1(this, context);
        this.f37072c = ii1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        ii1Var.setPosition(this.d);
        this.f37072c.setAdapter(new nw0(this, context, 3));
        this.f37071b.addView(this.f37072c, w7.z5.d(-1.0f, -1));
        l0 l0Var = this.f37071b;
        this.fragmentView = l0Var;
        lq0 lq0Var = new lq0(this, 25);
        WeakHashMap weakHashMap = r0.i0.f43485a;
        r0.a0.i(l0Var, lq0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f37070a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hi1 hi1Var = (hi1) sparseArray.valueAt(i10);
            if (hi1Var != null) {
                org.telegram.ui.ActionBar.m2 m2Var = hi1Var.f36579a;
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
        SparseArray sparseArray = this.f37070a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            hi1 hi1Var = (hi1) sparseArray.valueAt(i10);
            boolean z10 = hi1Var.f36580b;
            org.telegram.ui.ActionBar.m2 m2Var = hi1Var.f36579a;
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
        this.f37073f = false;
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
        this.f37073f = true;
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
        this.f37074n = str;
        this.f37075r = i10;
        this.f37076s = runnable;
        SparseArray sparseArray = this.f37070a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            hi1 hi1Var = (hi1) sparseArray.valueAt(i11);
            if (hi1Var != null) {
                hi1Var.f36579a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
