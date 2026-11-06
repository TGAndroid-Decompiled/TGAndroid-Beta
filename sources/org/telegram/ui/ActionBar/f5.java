package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class f5 extends r0 {
    public boolean A0;
    public n0 B0;
    public boolean C0;
    public boolean D0;
    public final e5 f27468z0;

    public f5(Context context, e5 e5Var, int i7, int i10, boolean z9, f6 f6Var) {
        super(context, null, i7, i10, z9, f6Var);
        this.C0 = true;
        this.D0 = true;
        this.f27468z0 = e5Var;
        setDelegate(new c5(e5Var));
    }

    @Override
    public final void E() {
        n0 n0Var = this.B0;
        if (n0Var != null) {
            n0Var.k(getSearchField());
        }
    }

    @Override
    public final void F(boolean z9) {
        this.f27468z0.f27449a.v(z9, true);
    }

    @Override
    public final r0 J(n0 n0Var) {
        this.B0 = n0Var;
        return this;
    }

    @Override
    public final r0 M() {
        N();
        return this;
    }

    @Override
    public final r0 N() {
        this.A0 = true;
        this.f27468z0.f27449a.setSearchItem(this);
        return this;
    }

    @Override
    public final void P(CharSequence charSequence, boolean z9) {
        this.f27468z0.f27449a.setSearchFieldText(charSequence);
    }

    @Override
    public final boolean T(boolean z9) {
        y4 y4Var = this.f27468z0.f27449a;
        if (y4Var.F) {
            y4Var.j(z9);
            return false;
        }
        return y4Var.v(z9, true);
    }

    public final void X() {
        if (!this.C0) {
            super.setVisibility(8);
        }
    }

    public final void Y(boolean z9, boolean z10) {
        boolean z11 = this.C0;
        e5 e5Var = this.f27468z0;
        if (z11 == z9) {
            if (!z9 && !z10 && getVisibility() != 8) {
                super.setVisibility(8);
                e5Var.f27453f = true;
                e5Var.requestLayout();
                return;
            } else if (z9 && getVisibility() != 0) {
                super.setVisibility(0);
                return;
            } else {
                return;
            }
        }
        this.C0 = z9;
        if (z9) {
            setEnabled(this.D0);
        } else {
            this.D0 = isEnabled();
            setEnabled(false);
        }
        if (z9) {
            super.setVisibility(0);
        } else if (!z10 || !isLaidOut() || !e5Var.isLaidOut()) {
            super.setVisibility(8);
        }
        if (!z10 || !e5Var.f27449a.t()) {
            e5Var.f27453f = true;
        }
        e5Var.requestLayout();
    }

    public e5 getParentMenu() {
        return this.f27468z0;
    }

    @Override
    public EditTextBoldCursor getSearchField() {
        return this.f27468z0.f27449a.getSearchField();
    }

    public n0 getSearchListener() {
        return this.B0;
    }

    @Override
    public i5 getSubMenuOverlay() {
        return this.f27468z0.f27449a.getMenuOverlay();
    }

    @Override
    public s4 getSubMenuOverlayHost() {
        return this.f27468z0.f27449a;
    }

    @Override
    public final boolean i() {
        e5 e5Var = this.f27468z0;
        if (e5Var.f27450b && !e5Var.f27449a.s()) {
            return false;
        }
        return true;
    }

    @Override
    public final void n() {
        this.f27468z0.f27449a.setSearchFieldText("");
    }

    @Override
    public void setSearchFieldCaption(CharSequence charSequence) {
        this.f27468z0.f27449a.setSearchFieldCaption(charSequence);
    }

    @Override
    public void setSearchFieldHint(CharSequence charSequence) {
        this.f27468z0.f27449a.setSearchFieldHint(charSequence);
        setContentDescription(charSequence);
    }

    @Override
    public void setVisibility(int i7) {
        boolean z9;
        e5 e5Var = this.f27468z0;
        if (e5Var != null && i7 != 4) {
            boolean z10 = false;
            if (i7 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            y4 y4Var = e5Var.f27449a;
            if (e5Var.isLaidOut() && y4Var.t() && (!e5Var.f27450b || (y4Var.s() && y4Var.getActionModeFactor() > 0.0f))) {
                z10 = true;
            }
            Y(z9, z10);
            return;
        }
        super.setVisibility(i7);
    }

    @Override
    public final boolean u() {
        return this.A0;
    }

    @Override
    public final boolean v() {
        return this.f27468z0.f27449a.F;
    }

    @Override
    public final boolean w() {
        return this.f27468z0.f27449a.F;
    }
}
