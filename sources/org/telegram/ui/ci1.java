package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class ci1 extends org.telegram.ui.ActionBar.n2 {
    public final SparseArray f36729a;
    public k0 f36730b;
    public bi1 f36731c;
    public int d;
    public float f36732e;
    public boolean f36733f;
    public boolean h;
    public String f36734n;
    public int f36735r;
    public Runnable f36736s;

    public ci1() {
        super(null);
        this.f36729a = new SparseArray();
        this.d = -1;
        this.f36732e = 0.0f;
    }

    public final void U() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f36729a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ai1 ai1Var = (ai1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (ai1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = ai1Var.f35982a;
                if (n2Var.fragmentView != null) {
                    float r10 = this.f36731c.r(keyAt);
                    boolean z11 = this.f36733f;
                    if (z11) {
                        f7 = this.f36732e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = ai1Var.f35986f;
                    float f12 = f7 * r10;
                    ai1Var.f35986f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!ai1Var.d && r10 > 0.0f && z11 && n2Var.fragmentView != null) {
                        n2Var.onResume();
                        ai1Var.d = true;
                    }
                    if (!ai1Var.f35985e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        n2Var.onTransitionAnimationStart(z10, false);
                        ai1Var.f35985e = true;
                    }
                    if (ai1Var.f35985e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        n2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (ai1Var.f35985e && (f12 == 0.0f || f12 == 1.0f)) {
                        n2Var.onTransitionAnimationEnd(z10, false);
                        ai1Var.f35985e = false;
                    }
                    if (!ai1Var.f35984c && f12 >= 1.0f) {
                        n2Var.onBecomeFullyVisible();
                        ai1Var.f35984c = true;
                    }
                    if (ai1Var.f35984c && ((f12 == 0.0f && !z12) || r10 == 0.0f)) {
                        n2Var.onBecomeFullyHidden();
                        ai1Var.f35984c = false;
                    }
                    if (ai1Var.d && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        n2Var.onPause();
                        ai1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.n2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f36729a;
        ai1 ai1Var = (ai1) sparseArray.get(i10);
        if (ai1Var != null) {
            org.telegram.ui.ActionBar.n2 n2Var = ai1Var.f35982a;
            if (ai1Var.f35984c) {
                n2Var.onBecomeFullyHidden();
            }
            if (ai1Var.d) {
                n2Var.onPause();
            }
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.n2 X() {
        bi1 bi1Var = this.f36731c;
        if (bi1Var == null) {
            return null;
        }
        ai1 ai1Var = (ai1) this.f36729a.get(bi1Var.getCurrentPosition());
        if (ai1Var == null) {
            return null;
        }
        return ai1Var.f35982a;
    }

    @Override
    public final void clearViews() {
        bi1 bi1Var = this.f36731c;
        if (bi1Var != null) {
            this.d = bi1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f36729a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ai1 ai1Var = (ai1) sparseArray.valueAt(i10);
            if (ai1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = ai1Var.f35982a;
                if (ai1Var.d) {
                    n2Var.onPause();
                    ai1Var.d = false;
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
        this.f36730b = new k0((fh0) this, context, 13);
        bi1 bi1Var = new bi1(this, context);
        this.f36731c = bi1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        bi1Var.setPosition(this.d);
        this.f36731c.setAdapter(new iw0(this, context, 3));
        this.f36730b.addView(this.f36731c, w7.x5.d(-1.0f, -1));
        k0 k0Var = this.f36730b;
        this.fragmentView = k0Var;
        hq0 hq0Var = new hq0(this, 25);
        WeakHashMap weakHashMap = r0.i0.f46810a;
        r0.a0.i(k0Var, hq0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f36729a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ai1 ai1Var = (ai1) sparseArray.valueAt(i10);
            if (ai1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = ai1Var.f35982a;
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
        this.f36732e = 0.0f;
        this.h = false;
        U();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f36732e = 1.0f;
        this.h = true;
        U();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f36729a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ai1 ai1Var = (ai1) sparseArray.valueAt(i10);
            boolean z10 = ai1Var.f35983b;
            org.telegram.ui.ActionBar.n2 n2Var = ai1Var.f35982a;
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
        this.f36733f = false;
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
        this.f36733f = true;
        checkSystemBarColors();
        U();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        if (!z10) {
            f7 = 1.0f - f7;
        }
        this.f36732e = f7;
        U();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.f36734n = str;
        this.f36735r = i10;
        this.f36736s = runnable;
        SparseArray sparseArray = this.f36729a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            ai1 ai1Var = (ai1) sparseArray.valueAt(i11);
            if (ai1Var != null) {
                ai1Var.f35982a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
