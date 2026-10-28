package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.l80;
public final class y5 extends w0 {
    public boolean A0;
    public boolean B0;
    public final x5 f23290x0;
    public boolean f23291y0;
    public s0 f23292z0;

    public y5(Context context, x5 x5Var, int i10, int i11, boolean z10, u6 u6Var) {
        super(context, null, i10, i11, z10, u6Var);
        this.A0 = true;
        this.B0 = true;
        this.f23290x0 = x5Var;
        setDelegate(new v5(x5Var));
    }

    private z5 getShownOverlay() {
        z5 openMenuOverlay = this.f23290x0.f23248a.getOpenMenuOverlay();
        if (openMenuOverlay != null && openMenuOverlay.f23791b == this) {
            if (openMenuOverlay.f23794n || openMenuOverlay.H) {
                return openMenuOverlay;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void E() {
        s0 s0Var = this.f23292z0;
        if (s0Var != null) {
            s0Var.k(getSearchField());
        }
    }

    @Override
    public final void F(boolean z10) {
        this.f23290x0.f23248a.r(z10, true);
    }

    @Override
    public final w0 J(s0 s0Var) {
        this.f23292z0 = s0Var;
        return this;
    }

    @Override
    public final w0 M() {
        N();
        return this;
    }

    @Override
    public final w0 N() {
        this.f23291y0 = true;
        this.f23290x0.f23248a.setSearchItem(this);
        return this;
    }

    @Override
    public final void P(CharSequence charSequence, boolean z10) {
        this.f23290x0.f23248a.setSearchFieldText(charSequence);
    }

    @Override
    public final boolean T(boolean z10) {
        r5 r5Var = this.f23290x0.f23248a;
        if (r5Var.F) {
            r5Var.f(z10);
            return false;
        }
        return r5Var.r(z10, true);
    }

    @Override
    public final void U(View view, View view2) {
        boolean z10;
        x5 x5Var = this.f23290x0;
        z5 menuOverlay = x5Var.f23248a.getMenuOverlay();
        eh.d dVar = null;
        if (menuOverlay == null) {
            super.U(null, null);
            return;
        }
        y();
        if (s()) {
            boolean z11 = x5Var.f23249b;
            r5 r5Var = x5Var.f23248a;
            if (!z11 || r5Var.o()) {
                if (menuOverlay.f23791b == this && (((z10 = menuOverlay.f23794n) || menuOverlay.H) && z10)) {
                    menuOverlay.a(true);
                    return;
                }
                this.T = false;
                t0 t0Var = this.Q;
                if (t0Var != null) {
                    t0Var.b();
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = getPopupLayout();
                if (!menuOverlay.f23794n || menuOverlay.f23791b != this) {
                    y5 y5Var = menuOverlay.f23791b;
                    if (y5Var != null && y5Var != this) {
                        menuOverlay.d();
                    }
                    menuOverlay.f23790a = r5Var;
                    menuOverlay.f23791b = this;
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = menuOverlay.f23792c;
                    if (actionBarPopupWindow$ActionBarPopupWindowLayout != popupLayout) {
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                            AndroidUtilities.removeFromParent(actionBarPopupWindow$ActionBarPopupWindowLayout);
                        }
                        menuOverlay.f23792c = popupLayout;
                    }
                    popupLayout.setBackgroundDrawable(null);
                    popupLayout.setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
                    popupLayout.setTranslationX(0.0f);
                    popupLayout.setTranslationY(0.0f);
                    popupLayout.setAlpha(1.0f);
                    f7.e0(popupLayout, false);
                    l80.U(popupLayout, y6.o1(0.06f, y6.w0(y6.E8, menuOverlay.f23790a.f23029a)));
                    popupLayout.f();
                    if (popupLayout.getSwipeBack() != null) {
                        popupLayout.getSwipeBack().b(false);
                    }
                    ScrollView scrollView = popupLayout.K;
                    if (scrollView != null) {
                        scrollView.scrollTo(0, 0);
                    }
                    if (popupLayout.getParent() != menuOverlay) {
                        AndroidUtilities.removeFromParent(popupLayout);
                        menuOverlay.addView(popupLayout, new FrameLayout.LayoutParams(-2, -2));
                    }
                    if (menuOverlay.d == null || menuOverlay.e != r5Var) {
                        ch.b bVar = r5Var.L;
                        if (bVar != null) {
                            dVar = bVar.c(menuOverlay, null, false);
                            dVar.v(r5Var.M);
                            wh.s(dVar, AndroidUtilities.dp(23.0f), 6.0f);
                        }
                        menuOverlay.d = dVar;
                        menuOverlay.e = r5Var;
                    }
                    ViewParent parent = menuOverlay.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).bringChildToFront(menuOverlay);
                    }
                    menuOverlay.setVisibility(0);
                    menuOverlay.f23794n = true;
                    menuOverlay.v = SystemClock.uptimeMillis();
                    menuOverlay.f23799y = Math.max(menuOverlay.E, menuOverlay.F);
                    menuOverlay.f23798x = 0L;
                    menuOverlay.H = true;
                    menuOverlay.invalidate();
                    r5Var.O = menuOverlay;
                    r5Var.P = this;
                    r5Var.invalidate();
                    menuOverlay.c();
                    if (!menuOverlay.f23795r) {
                        getIconView().setAlpha(0.0f);
                    }
                    menuOverlay.setFocusableInTouchMode(true);
                    menuOverlay.requestFocus();
                }
            }
        }
    }

    public final void X() {
        if (!this.A0) {
            super.setVisibility(8);
        }
    }

    public final void Y(boolean z10, boolean z11) {
        boolean z12 = this.A0;
        x5 x5Var = this.f23290x0;
        if (z12 == z10) {
            if (!z10 && !z11 && getVisibility() != 8) {
                super.setVisibility(8);
                x5Var.f23251f = true;
                x5Var.requestLayout();
                return;
            } else if (z10 && getVisibility() != 0) {
                super.setVisibility(0);
                return;
            } else {
                return;
            }
        }
        this.A0 = z10;
        if (z10) {
            setEnabled(this.B0);
        } else {
            this.B0 = isEnabled();
            setEnabled(false);
        }
        if (z10) {
            super.setVisibility(0);
        } else if (!z11 || !isLaidOut() || !x5Var.isLaidOut()) {
            super.setVisibility(8);
        }
        if (!z11 || !x5Var.f23248a.p()) {
            x5Var.f23251f = true;
        }
        x5Var.requestLayout();
    }

    public x5 getParentMenu() {
        return this.f23290x0;
    }

    @Override
    public EditTextBoldCursor getSearchField() {
        return this.f23290x0.f23248a.getSearchField();
    }

    public s0 getSearchListener() {
        return this.f23292z0;
    }

    @Override
    public final void n() {
        this.f23290x0.f23248a.setSearchFieldText("");
    }

    @Override
    public final void o() {
        z5 shownOverlay = getShownOverlay();
        if (shownOverlay != null) {
            shownOverlay.a(true);
        } else {
            super.o();
        }
    }

    @Override
    public final void q() {
        z5 shownOverlay = getShownOverlay();
        if (shownOverlay != null) {
            shownOverlay.a(true);
        } else {
            super.q();
        }
    }

    @Override
    public void setSearchFieldCaption(CharSequence charSequence) {
        this.f23290x0.f23248a.setSearchFieldCaption(charSequence);
    }

    @Override
    public void setSearchFieldHint(CharSequence charSequence) {
        this.f23290x0.f23248a.setSearchFieldHint(charSequence);
        setContentDescription(charSequence);
    }

    @Override
    public void setVisibility(int i10) {
        boolean z10;
        x5 x5Var = this.f23290x0;
        if (x5Var != null && i10 != 4) {
            boolean z11 = false;
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            r5 r5Var = x5Var.f23248a;
            if (x5Var.isLaidOut() && r5Var.p() && (!x5Var.f23249b || (r5Var.o() && r5Var.getActionModeFactor() > 0.0f))) {
                z11 = true;
            }
            Y(z10, z11);
            return;
        }
        super.setVisibility(i10);
    }

    @Override
    public final boolean u() {
        return this.f23291y0;
    }

    @Override
    public final boolean v() {
        return this.f23290x0.f23248a.F;
    }

    @Override
    public final boolean w() {
        return this.f23290x0.f23248a.F;
    }

    @Override
    public final boolean x() {
        z5 shownOverlay = getShownOverlay();
        if (shownOverlay != null) {
            return shownOverlay.f23794n;
        }
        return super.x();
    }
}
