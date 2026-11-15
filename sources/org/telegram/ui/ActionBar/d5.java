package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d5 extends q0 {
    public final c5 A0;
    public boolean B0;
    public m0 C0;
    public boolean D0;
    public boolean E0;

    public d5(Context context, c5 c5Var, int i7, int i10, boolean z10, e6 e6Var) {
        super(context, null, i7, i10, z10, e6Var);
        this.D0 = true;
        this.E0 = true;
        this.A0 = c5Var;
        setDelegate(new a5(c5Var));
    }

    @Override
    public final void F() {
        m0 m0Var = this.C0;
        if (m0Var != null) {
            m0Var.k(getSearchField());
        }
    }

    @Override
    public final void G(boolean z10) {
        this.A0.f28492a.y(z10, true);
    }

    @Override
    public final q0 K(m0 m0Var) {
        this.C0 = m0Var;
        return this;
    }

    @Override
    public final q0 N() {
        O();
        return this;
    }

    @Override
    public final q0 O() {
        this.B0 = true;
        this.A0.f28492a.setSearchItem(this);
        return this;
    }

    @Override
    public final void Q(CharSequence charSequence, boolean z10) {
        this.A0.f28492a.setSearchFieldText(charSequence);
    }

    @Override
    public final boolean U(boolean z10) {
        w4 w4Var = this.A0.f28492a;
        if (w4Var.G) {
            w4Var.m(z10);
            return false;
        }
        return w4Var.y(z10, true);
    }

    public final void Y() {
        if (!this.D0) {
            super.setVisibility(8);
        }
    }

    public final void Z(boolean z10, boolean z11) {
        boolean z12 = this.D0;
        c5 c5Var = this.A0;
        if (z12 == z10) {
            if (!z10 && !z11 && getVisibility() != 8) {
                super.setVisibility(8);
                c5Var.f28496f = true;
                c5Var.requestLayout();
                return;
            } else if (z10 && getVisibility() != 0) {
                super.setVisibility(0);
                return;
            } else {
                return;
            }
        }
        this.D0 = z10;
        if (z10) {
            setEnabled(this.E0);
        } else {
            this.E0 = isEnabled();
            setEnabled(false);
        }
        if (z10) {
            super.setVisibility(0);
        } else if (!z11 || !isLaidOut() || !c5Var.isLaidOut()) {
            super.setVisibility(8);
        }
        if (!z11 || !c5Var.f28492a.w()) {
            c5Var.f28496f = true;
        }
        c5Var.requestLayout();
    }

    public c5 getParentMenu() {
        return this.A0;
    }

    @Override
    public EditTextBoldCursor getSearchField() {
        return this.A0.f28492a.getSearchField();
    }

    public m0 getSearchListener() {
        return this.C0;
    }

    @Override
    public g5 getSubMenuOverlay() {
        return this.A0.f28492a.getMenuOverlay();
    }

    @Override
    public q4 getSubMenuOverlayHost() {
        return this.A0.f28492a;
    }

    @Override
    public final boolean j() {
        c5 c5Var = this.A0;
        if (c5Var.f28493b && !c5Var.f28492a.v()) {
            return false;
        }
        return true;
    }

    @Override
    public final void o() {
        this.A0.f28492a.setSearchFieldText("");
    }

    @Override
    public void setSearchFieldCaption(CharSequence charSequence) {
        this.A0.f28492a.setSearchFieldCaption(charSequence);
    }

    @Override
    public void setSearchFieldHint(CharSequence charSequence) {
        this.A0.f28492a.setSearchFieldHint(charSequence);
        setContentDescription(charSequence);
    }

    @Override
    public void setVisibility(int i7) {
        boolean z10;
        c5 c5Var = this.A0;
        if (c5Var != null && i7 != 4) {
            boolean z11 = false;
            if (i7 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w4 w4Var = c5Var.f28492a;
            if (c5Var.isLaidOut() && w4Var.w() && (!c5Var.f28493b || (w4Var.v() && w4Var.getActionModeFactor() > 0.0f))) {
                z11 = true;
            }
            Z(z10, z11);
            return;
        }
        super.setVisibility(i7);
    }

    @Override
    public final boolean v() {
        return this.B0;
    }

    @Override
    public final boolean w() {
        return this.A0.f28492a.G;
    }

    @Override
    public final boolean x() {
        return this.A0.f28492a.G;
    }
}
