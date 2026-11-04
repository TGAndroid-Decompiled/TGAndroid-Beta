package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class f5 extends q0 {
    public final e5 A0;
    public boolean B0;
    public m0 C0;
    public boolean D0;
    public boolean E0;

    public f5(Context context, e5 e5Var, int i3, int i10, boolean z10, e6 e6Var) {
        super(context, null, i3, i10, z10, e6Var);
        this.D0 = true;
        this.E0 = true;
        this.A0 = e5Var;
        setDelegate(new c5(e5Var));
    }

    @Override
    public final void E() {
        m0 m0Var = this.C0;
        if (m0Var != null) {
            m0Var.k(getSearchField());
        }
    }

    @Override
    public final void F(boolean z10) {
        this.A0.f27477a.v(z10, true);
    }

    @Override
    public final q0 J(m0 m0Var) {
        this.C0 = m0Var;
        return this;
    }

    @Override
    public final q0 M() {
        N();
        return this;
    }

    @Override
    public final q0 N() {
        this.B0 = true;
        this.A0.f27477a.setSearchItem(this);
        return this;
    }

    @Override
    public final void P(CharSequence charSequence, boolean z10) {
        this.A0.f27477a.setSearchFieldText(charSequence);
    }

    @Override
    public final boolean T(boolean z10) {
        y4 y4Var = this.A0.f27477a;
        if (y4Var.G) {
            y4Var.j(z10);
            return false;
        }
        return y4Var.v(z10, true);
    }

    public final void X() {
        if (!this.D0) {
            super.setVisibility(8);
        }
    }

    public final void Y(boolean z10, boolean z11) {
        boolean z12 = this.D0;
        e5 e5Var = this.A0;
        if (z12 == z10) {
            if (!z10 && !z11 && getVisibility() != 8) {
                super.setVisibility(8);
                e5Var.f27481f = true;
                e5Var.requestLayout();
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
        } else if (!z11 || !isLaidOut() || !e5Var.isLaidOut()) {
            super.setVisibility(8);
        }
        if (!z11 || !e5Var.f27477a.t()) {
            e5Var.f27481f = true;
        }
        e5Var.requestLayout();
    }

    public e5 getParentMenu() {
        return this.A0;
    }

    @Override
    public EditTextBoldCursor getSearchField() {
        return this.A0.f27477a.getSearchField();
    }

    public m0 getSearchListener() {
        return this.C0;
    }

    @Override
    public i5 getSubMenuOverlay() {
        return this.A0.f27477a.getMenuOverlay();
    }

    @Override
    public s4 getSubMenuOverlayHost() {
        return this.A0.f27477a;
    }

    @Override
    public final boolean i() {
        e5 e5Var = this.A0;
        if (e5Var.f27478b && !e5Var.f27477a.s()) {
            return false;
        }
        return true;
    }

    @Override
    public final void n() {
        this.A0.f27477a.setSearchFieldText("");
    }

    @Override
    public void setSearchFieldCaption(CharSequence charSequence) {
        this.A0.f27477a.setSearchFieldCaption(charSequence);
    }

    @Override
    public void setSearchFieldHint(CharSequence charSequence) {
        this.A0.f27477a.setSearchFieldHint(charSequence);
        setContentDescription(charSequence);
    }

    @Override
    public void setVisibility(int i3) {
        boolean z10;
        e5 e5Var = this.A0;
        if (e5Var != null && i3 != 4) {
            boolean z11 = false;
            if (i3 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            y4 y4Var = e5Var.f27477a;
            if (e5Var.isLaidOut() && y4Var.t() && (!e5Var.f27478b || (y4Var.s() && y4Var.getActionModeFactor() > 0.0f))) {
                z11 = true;
            }
            Y(z10, z11);
            return;
        }
        super.setVisibility(i3);
    }

    @Override
    public final boolean u() {
        return this.B0;
    }

    @Override
    public final boolean v() {
        return this.A0.f27477a.G;
    }

    @Override
    public final boolean w() {
        return this.A0.f27477a.G;
    }
}
