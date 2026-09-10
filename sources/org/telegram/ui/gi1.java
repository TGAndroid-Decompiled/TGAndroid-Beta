package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class gi1 extends org.telegram.ui.ActionBar.p2 {
    public final SparseArray f33115a;
    public k0 f33116b;
    public fi1 f33117c;
    public int d;
    public float e;
    public boolean f33118f;
    public boolean h;
    public String f33119n;
    public int f33120r;
    public Runnable f33121s;

    public gi1() {
        super(null);
        this.f33115a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f33115a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ei1 ei1Var = (ei1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (ei1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = ei1Var.f32218a;
                if (p2Var.fragmentView != null) {
                    float r10 = this.f33117c.r(keyAt);
                    boolean z11 = this.f33118f;
                    if (z11) {
                        f7 = this.e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = ei1Var.f32221f;
                    float f12 = f7 * r10;
                    ei1Var.f32221f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!ei1Var.d && r10 > 0.0f && z11 && p2Var.fragmentView != null) {
                        p2Var.onResume();
                        ei1Var.d = true;
                    }
                    if (!ei1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        p2Var.onTransitionAnimationStart(z10, false);
                        ei1Var.e = true;
                    }
                    if (ei1Var.e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        p2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (ei1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        p2Var.onTransitionAnimationEnd(z10, false);
                        ei1Var.e = false;
                    }
                    if (!ei1Var.f32220c && f12 >= 1.0f) {
                        p2Var.onBecomeFullyVisible();
                        ei1Var.f32220c = true;
                    }
                    if (ei1Var.f32220c && ((f12 == 0.0f && !z12) || r10 == 0.0f)) {
                        p2Var.onBecomeFullyHidden();
                        ei1Var.f32220c = false;
                    }
                    if (ei1Var.d && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        p2Var.onPause();
                        ei1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.p2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f33115a;
        ei1 ei1Var = (ei1) sparseArray.get(i10);
        if (ei1Var != null) {
            org.telegram.ui.ActionBar.p2 p2Var = ei1Var.f32218a;
            if (ei1Var.f32220c) {
                p2Var.onBecomeFullyHidden();
            }
            if (ei1Var.d) {
                p2Var.onPause();
            }
            p2Var.onFragmentDestroy();
            p2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.p2 X() {
        fi1 fi1Var = this.f33117c;
        if (fi1Var == null) {
            return null;
        }
        ei1 ei1Var = (ei1) this.f33115a.get(fi1Var.getCurrentPosition());
        if (ei1Var == null) {
            return null;
        }
        return ei1Var.f32218a;
    }

    @Override
    public final void clearViews() {
        fi1 fi1Var = this.f33117c;
        if (fi1Var != null) {
            this.d = fi1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f33115a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ei1 ei1Var = (ei1) sparseArray.valueAt(i10);
            if (ei1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = ei1Var.f32218a;
                if (ei1Var.d) {
                    p2Var.onPause();
                    ei1Var.d = false;
                }
                p2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        return null;
    }

    @Override
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.f33116b = new k0((fh0) this, context, 13);
        fi1 fi1Var = new fi1(this, context);
        this.f33117c = fi1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        fi1Var.setPosition(this.d);
        this.f33117c.setAdapter(new kw0(this, context, 3));
        this.f33116b.addView(this.f33117c, w7.a6.c(-1.0f, -1));
        k0 k0Var = this.f33116b;
        this.fragmentView = k0Var;
        ul0 ul0Var = new ul0(this, 26);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(k0Var, ul0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f33115a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ei1 ei1Var = (ei1) sparseArray.valueAt(i10);
            if (ei1Var != null) {
                org.telegram.ui.ActionBar.p2 p2Var = ei1Var.f32218a;
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
    public boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
            }
            return false;
        }
        org.telegram.ui.ActionBar.p2 X = X();
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
        SparseArray sparseArray = this.f33115a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ei1 ei1Var = (ei1) sparseArray.valueAt(i10);
            boolean z10 = ei1Var.f32219b;
            org.telegram.ui.ActionBar.p2 p2Var = ei1Var.f32218a;
            if (z10) {
                p2Var.onFragmentDestroy();
                p2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f33118f = false;
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
        this.f33118f = true;
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
        this.f33119n = str;
        this.f33120r = i10;
        this.f33121s = runnable;
        SparseArray sparseArray = this.f33115a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            ei1 ei1Var = (ei1) sparseArray.valueAt(i11);
            if (ei1Var != null) {
                ei1Var.f32218a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
