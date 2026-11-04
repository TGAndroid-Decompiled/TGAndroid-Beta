package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
public abstract class gb1 extends org.telegram.ui.ActionBar.d2 {
    public final SparseArray f45620a;
    public l0 f45621b;
    public fb1 f45622c;
    public int d;
    public float f45623e;
    public boolean f45624f;
    public boolean h;
    public String f45625n;
    public int f45626r;
    public Runnable f45627s;

    public gb1() {
        super(null);
        this.f45620a = new SparseArray();
        this.d = -1;
        this.f45623e = 0.0f;
    }

    public final void Z() {
        float f10;
        boolean z10;
        float f11;
        SparseArray sparseArray = this.f45620a;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            eb1 eb1Var = (eb1) sparseArray.valueAt(i3);
            int keyAt = sparseArray.keyAt(i3);
            if (eb1Var != null) {
                org.telegram.ui.ActionBar.d2 d2Var = eb1Var.f44954a;
                if (d2Var.fragmentView != null) {
                    float p10 = this.f45622c.p(keyAt);
                    boolean z11 = this.f45624f;
                    if (z11) {
                        f10 = this.f45623e;
                    } else {
                        f10 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f12 = eb1Var.f44958f;
                    float f13 = f10 * p10;
                    eb1Var.f44958f = f13;
                    if (f13 > f12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!eb1Var.d && p10 > 0.0f && z11 && d2Var.fragmentView != null) {
                        d2Var.onResume();
                        eb1Var.d = true;
                    }
                    if (!eb1Var.f44957e && ((f12 == 0.0f || f12 == 1.0f) && f12 != f13 && Math.abs(f12 - f13) != 1.0f)) {
                        d2Var.onTransitionAnimationStart(z10, false);
                        eb1Var.f44957e = true;
                    }
                    if (eb1Var.f44957e && f12 != f13) {
                        if (z10) {
                            f11 = f13;
                        } else {
                            f11 = 1.0f - f13;
                        }
                        d2Var.onTransitionAnimationProgress(z10, f11);
                    }
                    if (eb1Var.f44957e && (f13 == 0.0f || f13 == 1.0f)) {
                        d2Var.onTransitionAnimationEnd(z10, false);
                        eb1Var.f44957e = false;
                    }
                    if (!eb1Var.f44956c && f13 >= 1.0f) {
                        d2Var.onBecomeFullyVisible();
                        eb1Var.f44956c = true;
                    }
                    if (eb1Var.f44956c && ((f13 == 0.0f && !z12) || p10 == 0.0f)) {
                        d2Var.onBecomeFullyHidden();
                        eb1Var.f44956c = false;
                    }
                    if (eb1Var.d && ((f13 == 0.0f && !z11) || p10 == 0.0f)) {
                        d2Var.onPause();
                        eb1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.d2 a0(int i3);

    @Override
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.f45620a;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            eb1 eb1Var = (eb1) sparseArray.valueAt(i3);
            if (eb1Var != null) {
                org.telegram.ui.ActionBar.d2 d2Var = eb1Var.f44954a;
                if (d2Var.fragmentView != null) {
                    d2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final void b0(int i3) {
        SparseArray sparseArray = this.f45620a;
        eb1 eb1Var = (eb1) sparseArray.get(i3);
        if (eb1Var != null) {
            org.telegram.ui.ActionBar.d2 d2Var = eb1Var.f44954a;
            if (eb1Var.f44956c) {
                d2Var.onBecomeFullyHidden();
            }
            if (eb1Var.d) {
                d2Var.onPause();
            }
            d2Var.onFragmentDestroy();
            d2Var.setParentLayout(null);
        }
        sparseArray.remove(i3);
    }

    public final org.telegram.ui.ActionBar.d2 c0() {
        fb1 fb1Var = this.f45622c;
        if (fb1Var == null) {
            return null;
        }
        eb1 eb1Var = (eb1) this.f45620a.get(fb1Var.getCurrentPosition());
        if (eb1Var == null) {
            return null;
        }
        return eb1Var.f44954a;
    }

    @Override
    public final void clearViews() {
        fb1 fb1Var = this.f45622c;
        if (fb1Var != null) {
            this.d = fb1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f45620a;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            eb1 eb1Var = (eb1) sparseArray.valueAt(i3);
            if (eb1Var != null) {
                org.telegram.ui.ActionBar.d2 d2Var = eb1Var.f44954a;
                if (eb1Var.d) {
                    d2Var.onPause();
                    eb1Var.d = false;
                }
                d2Var.clearViews();
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
        this.f45621b = new l0(14, context, (ee0) this);
        fb1 fb1Var = new fb1(this, context);
        this.f45622c = fb1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        fb1Var.setPosition(this.d);
        this.f45622c.setAdapter(new ci.o4(8, context, this));
        this.f45621b.addView(this.f45622c, b8.mf.c(-1.0f, -1));
        l0 l0Var = this.f45621b;
        this.fragmentView = l0Var;
        ci0 ci0Var = new ci0(this, 25);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(l0Var, ci0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f45620a;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            eb1 eb1Var = (eb1) sparseArray.valueAt(i3);
            if (eb1Var != null) {
                org.telegram.ui.ActionBar.d2 d2Var = eb1Var.f44954a;
                if (d2Var.fragmentView != null) {
                    arrayList.addAll(d2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.d2 c02 = c0();
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
        org.telegram.ui.ActionBar.y4 y4Var;
        org.telegram.ui.ActionBar.i5 i5Var;
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.d2 c02 = c0();
            if (c02 != null) {
                y4Var = c02.getSimpleActionBar();
            } else {
                y4Var = null;
            }
            if (y4Var != null && ((i5Var = y4Var.R) != null || (!y4Var.H && y4Var.G))) {
                if (z10) {
                    if (i5Var != null) {
                        i5Var.a(true);
                        return false;
                    }
                    if (!y4Var.H && y4Var.G) {
                        y4Var.j(true);
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
        this.f45623e = 0.0f;
        this.h = false;
        Z();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f45623e = 1.0f;
        this.h = true;
        Z();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f45620a;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            eb1 eb1Var = (eb1) sparseArray.valueAt(i3);
            boolean z10 = eb1Var.f44955b;
            org.telegram.ui.ActionBar.d2 d2Var = eb1Var.f44954a;
            if (z10) {
                d2Var.onFragmentDestroy();
                d2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f45624f = false;
        Z();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.d2 c02 = c0();
        if (c02 != null) {
            c02.onRequestPermissionsResultFragment(i3, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f45624f = true;
        checkSystemBarColors();
        Z();
    }

    @Override
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.f45620a;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            eb1 eb1Var = (eb1) sparseArray.valueAt(i3);
            if (eb1Var != null) {
                org.telegram.ui.ActionBar.d2 d2Var = eb1Var.f44954a;
                if (d2Var.fragmentView != null) {
                    try {
                        d2Var.onThemeColorsChanged();
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
        this.f45623e = f10;
        Z();
    }

    @Override
    public final void setTitleOverlayText(String str, int i3, Runnable runnable) {
        super.setTitleOverlayText(str, i3, runnable);
        this.f45625n = str;
        this.f45626r = i3;
        this.f45627s = runnable;
        SparseArray sparseArray = this.f45620a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            eb1 eb1Var = (eb1) sparseArray.valueAt(i10);
            if (eb1Var != null) {
                eb1Var.f44954a.setTitleOverlayText(str, i3, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i3, Runnable runnable) {
        setTitleOverlayText(str, i3, runnable);
    }
}
