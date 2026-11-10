package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class g5 extends r0 {
    public boolean A0;
    public n0 B0;
    public boolean C0;
    public boolean D0;
    public final f5 f27505z0;

    public g5(Context context, f5 f5Var, int i7, int i10, boolean z9, h6 h6Var) {
        super(context, null, i7, i10, z9, h6Var);
        this.C0 = true;
        this.D0 = true;
        this.f27505z0 = f5Var;
        setDelegate(new d5(f5Var));
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
        this.f27505z0.f27473a.x(z9, true);
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
        this.f27505z0.f27473a.setSearchItem(this);
        return this;
    }

    @Override
    public final void P(CharSequence charSequence, boolean z9) {
        this.f27505z0.f27473a.setSearchFieldText(charSequence);
    }

    @Override
    public final boolean T(boolean z9) {
        z4 z4Var = this.f27505z0.f27473a;
        if (z4Var.F) {
            z4Var.l(z9);
            return false;
        }
        return z4Var.x(z9, true);
    }

    public final void X() {
        if (!this.C0) {
            super.setVisibility(8);
        }
    }

    public final void Y(boolean z9, boolean z10) {
        boolean z11 = this.C0;
        f5 f5Var = this.f27505z0;
        if (z11 == z9) {
            if (!z9 && !z10 && getVisibility() != 8) {
                super.setVisibility(8);
                f5Var.f27477f = true;
                f5Var.requestLayout();
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
        } else if (!z10 || !isLaidOut() || !f5Var.isLaidOut()) {
            super.setVisibility(8);
        }
        if (!z10 || !f5Var.f27473a.v()) {
            f5Var.f27477f = true;
        }
        f5Var.requestLayout();
    }

    public f5 getParentMenu() {
        return this.f27505z0;
    }

    @Override
    public EditTextBoldCursor getSearchField() {
        return this.f27505z0.f27473a.getSearchField();
    }

    public n0 getSearchListener() {
        return this.B0;
    }

    @Override
    public j5 getSubMenuOverlay() {
        return this.f27505z0.f27473a.getMenuOverlay();
    }

    @Override
    public t4 getSubMenuOverlayHost() {
        return this.f27505z0.f27473a;
    }

    @Override
    public final boolean i() {
        f5 f5Var = this.f27505z0;
        if (f5Var.f27474b && !f5Var.f27473a.u()) {
            return false;
        }
        return true;
    }

    @Override
    public final void n() {
        this.f27505z0.f27473a.setSearchFieldText("");
    }

    @Override
    public void setSearchFieldCaption(CharSequence charSequence) {
        this.f27505z0.f27473a.setSearchFieldCaption(charSequence);
    }

    @Override
    public void setSearchFieldHint(CharSequence charSequence) {
        this.f27505z0.f27473a.setSearchFieldHint(charSequence);
        setContentDescription(charSequence);
    }

    @Override
    public void setVisibility(int i7) {
        boolean z9;
        f5 f5Var = this.f27505z0;
        if (f5Var != null && i7 != 4) {
            boolean z10 = false;
            if (i7 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            z4 z4Var = f5Var.f27473a;
            if (f5Var.isLaidOut() && z4Var.v() && (!f5Var.f27474b || (z4Var.u() && z4Var.getActionModeFactor() > 0.0f))) {
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
        return this.f27505z0.f27473a.F;
    }

    @Override
    public final boolean w() {
        return this.f27505z0.f27473a.F;
    }
}
