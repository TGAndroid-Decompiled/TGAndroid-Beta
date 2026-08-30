package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class hh1 extends org.telegram.ui.ActionBar.p2 {
    public final SparseArray f34873a;
    public l0 f34874b;
    public gh1 f34875c;
    public int d;
    public float e;
    public boolean f34876f;
    public boolean h;
    public String f34877n;
    public int f34878r;
    public Runnable f34879s;

    public hh1() {
        super(null);
        this.f34873a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        float f10;
        boolean z4;
        float f11;
        SparseArray sparseArray = this.f34873a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fh1 fh1Var = (fh1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (fh1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = fh1Var.f34260a;
                if (p2Var.fragmentView != null) {
                    float r10 = this.f34875c.r(keyAt);
                    boolean z10 = this.f34876f;
                    if (z10) {
                        f10 = this.e;
                    } else {
                        f10 = 0.0f;
                    }
                    boolean z11 = this.h;
                    float f12 = fh1Var.f34263f;
                    float f13 = f10 * r10;
                    fh1Var.f34263f = f13;
                    if (f13 > f12) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!fh1Var.d && r10 > 0.0f && z10 && p2Var.fragmentView != null) {
                        p2Var.onResume();
                        fh1Var.d = true;
                    }
                    if (!fh1Var.e && ((f12 == 0.0f || f12 == 1.0f) && f12 != f13 && Math.abs(f12 - f13) != 1.0f)) {
                        p2Var.onTransitionAnimationStart(z4, false);
                        fh1Var.e = true;
                    }
                    if (fh1Var.e && f12 != f13) {
                        if (z4) {
                            f11 = f13;
                        } else {
                            f11 = 1.0f - f13;
                        }
                        p2Var.onTransitionAnimationProgress(z4, f11);
                    }
                    if (fh1Var.e && (f13 == 0.0f || f13 == 1.0f)) {
                        p2Var.onTransitionAnimationEnd(z4, false);
                        fh1Var.e = false;
                    }
                    if (!fh1Var.f34262c && f13 >= 1.0f) {
                        p2Var.onBecomeFullyVisible();
                        fh1Var.f34262c = true;
                    }
                    if (fh1Var.f34262c && ((f13 == 0.0f && !z11) || r10 == 0.0f)) {
                        p2Var.onBecomeFullyHidden();
                        fh1Var.f34262c = false;
                    }
                    if (fh1Var.d && ((f13 == 0.0f && !z10) || r10 == 0.0f)) {
                        p2Var.onPause();
                        fh1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.p2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f34873a;
        fh1 fh1Var = (fh1) sparseArray.get(i10);
        if (fh1Var != null) {
            org.telegram.ui.ActionBar.p2 p2Var = fh1Var.f34260a;
            if (fh1Var.f34262c) {
                p2Var.onBecomeFullyHidden();
            }
            if (fh1Var.d) {
                p2Var.onPause();
            }
            p2Var.onFragmentDestroy();
            p2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.p2 X() {
        gh1 gh1Var = this.f34875c;
        if (gh1Var == null) {
            return null;
        }
        fh1 fh1Var = (fh1) this.f34873a.get(gh1Var.getCurrentPosition());
        if (fh1Var == null) {
            return null;
        }
        return fh1Var.f34260a;
    }

    @Override
    public final void clearViews() {
        gh1 gh1Var = this.f34875c;
        if (gh1Var != null) {
            this.d = gh1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f34873a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fh1 fh1Var = (fh1) sparseArray.valueAt(i10);
            if (fh1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = fh1Var.f34260a;
                if (fh1Var.d) {
                    p2Var.onPause();
                    fh1Var.d = false;
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
        this.f34874b = new l0((vg0) this, context, 13);
        gh1 gh1Var = new gh1(this, context);
        this.f34875c = gh1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        gh1Var.setPosition(this.d);
        this.f34875c.setAdapter(new gg.u(this, context, 5));
        this.f34874b.addView(this.f34875c, k7.b6.c(-1.0f, -1));
        l0 l0Var = this.f34874b;
        this.fragmentView = l0Var;
        il0 il0Var = new il0(this, 26);
        WeakHashMap weakHashMap = r0.j0.f43118a;
        r0.b0.j(l0Var, il0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f34873a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fh1 fh1Var = (fh1) sparseArray.valueAt(i10);
            if (fh1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = fh1Var.f34260a;
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
        SparseArray sparseArray = this.f34873a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            fh1 fh1Var = (fh1) sparseArray.valueAt(i10);
            boolean z4 = fh1Var.f34261b;
            org.telegram.ui.ActionBar.p2 p2Var = fh1Var.f34260a;
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
        this.f34876f = false;
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
        this.f34876f = true;
        checkSystemBarColors();
        U();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        super.onTransitionAnimationProgress(z4, f10);
        if (!z4) {
            f10 = 1.0f - f10;
        }
        this.e = f10;
        U();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.f34877n = str;
        this.f34878r = i10;
        this.f34879s = runnable;
        SparseArray sparseArray = this.f34873a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            fh1 fh1Var = (fh1) sparseArray.valueAt(i11);
            if (fh1Var != null) {
                fh1Var.f34260a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
