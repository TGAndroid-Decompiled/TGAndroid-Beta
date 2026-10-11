package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class bi1 extends org.telegram.ui.ActionBar.m2 {
    public final SparseArray f36433a;
    public j0 f36434b;
    public ai1 f36435c;
    public int d;
    public float f36436e;
    public boolean f36437f;
    public boolean h;
    public String f36438n;
    public int f36439r;
    public Runnable f36440s;

    public bi1() {
        super(null);
        this.f36433a = new SparseArray();
        this.d = -1;
        this.f36436e = 0.0f;
    }

    public final void U() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f36433a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            zh1 zh1Var = (zh1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (zh1Var != null) {
                org.telegram.ui.ActionBar.m2 m2Var = zh1Var.f44702a;
                if (m2Var.fragmentView != null) {
                    float r10 = this.f36435c.r(keyAt);
                    boolean z11 = this.f36437f;
                    if (z11) {
                        f7 = this.f36436e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = zh1Var.f44706f;
                    float f12 = f7 * r10;
                    zh1Var.f44706f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!zh1Var.d && r10 > 0.0f && z11 && m2Var.fragmentView != null) {
                        m2Var.onResume();
                        zh1Var.d = true;
                    }
                    if (!zh1Var.f44705e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        m2Var.onTransitionAnimationStart(z10, false);
                        zh1Var.f44705e = true;
                    }
                    if (zh1Var.f44705e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        m2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (zh1Var.f44705e && (f12 == 0.0f || f12 == 1.0f)) {
                        m2Var.onTransitionAnimationEnd(z10, false);
                        zh1Var.f44705e = false;
                    }
                    if (!zh1Var.f44704c && f12 >= 1.0f) {
                        m2Var.onBecomeFullyVisible();
                        zh1Var.f44704c = true;
                    }
                    if (zh1Var.f44704c && ((f12 == 0.0f && !z12) || r10 == 0.0f)) {
                        m2Var.onBecomeFullyHidden();
                        zh1Var.f44704c = false;
                    }
                    if (zh1Var.d && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        m2Var.onPause();
                        zh1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.m2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f36433a;
        zh1 zh1Var = (zh1) sparseArray.get(i10);
        if (zh1Var != null) {
            org.telegram.ui.ActionBar.m2 m2Var = zh1Var.f44702a;
            if (zh1Var.f44704c) {
                m2Var.onBecomeFullyHidden();
            }
            if (zh1Var.d) {
                m2Var.onPause();
            }
            m2Var.onFragmentDestroy();
            m2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.m2 X() {
        ai1 ai1Var = this.f36435c;
        if (ai1Var == null) {
            return null;
        }
        zh1 zh1Var = (zh1) this.f36433a.get(ai1Var.getCurrentPosition());
        if (zh1Var == null) {
            return null;
        }
        return zh1Var.f44702a;
    }

    @Override
    public final void clearViews() {
        ai1 ai1Var = this.f36435c;
        if (ai1Var != null) {
            this.d = ai1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f36433a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            zh1 zh1Var = (zh1) sparseArray.valueAt(i10);
            if (zh1Var != null) {
                org.telegram.ui.ActionBar.m2 m2Var = zh1Var.f44702a;
                if (zh1Var.d) {
                    m2Var.onPause();
                    zh1Var.d = false;
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
        this.f36434b = new j0((eh0) this, context, 13);
        ai1 ai1Var = new ai1(this, context);
        this.f36435c = ai1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        ai1Var.setPosition(this.d);
        this.f36435c.setAdapter(new hw0(this, context, 3));
        this.f36434b.addView(this.f36435c, w7.x5.d(-1.0f, -1));
        j0 j0Var = this.f36434b;
        this.fragmentView = j0Var;
        gq0 gq0Var = new gq0(this, 25);
        WeakHashMap weakHashMap = r0.i0.f46890a;
        r0.a0.i(j0Var, gq0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f36433a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            zh1 zh1Var = (zh1) sparseArray.valueAt(i10);
            if (zh1Var != null) {
                org.telegram.ui.ActionBar.m2 m2Var = zh1Var.f44702a;
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
        this.f36436e = 0.0f;
        this.h = false;
        U();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f36436e = 1.0f;
        this.h = true;
        U();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f36433a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            zh1 zh1Var = (zh1) sparseArray.valueAt(i10);
            boolean z10 = zh1Var.f44703b;
            org.telegram.ui.ActionBar.m2 m2Var = zh1Var.f44702a;
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
        this.f36437f = false;
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
        this.f36437f = true;
        checkSystemBarColors();
        U();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        if (!z10) {
            f7 = 1.0f - f7;
        }
        this.f36436e = f7;
        U();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.f36438n = str;
        this.f36439r = i10;
        this.f36440s = runnable;
        SparseArray sparseArray = this.f36433a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            zh1 zh1Var = (zh1) sparseArray.valueAt(i11);
            if (zh1Var != null) {
                zh1Var.f44702a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
