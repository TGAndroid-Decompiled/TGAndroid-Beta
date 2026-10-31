package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class p5 extends t0 {
    public boolean A0;
    public p0 B0;
    public boolean C0;
    public boolean D0;
    public final o5 f20654z0;

    public p5(Context context, o5 o5Var, int i10, int i11, boolean z10, p6 p6Var) {
        super(context, null, i10, i11, z10, p6Var);
        this.C0 = true;
        this.D0 = true;
        this.f20654z0 = o5Var;
        setDelegate(new m5(o5Var));
    }

    @Override
    public final void E() {
        p0 p0Var = this.B0;
        if (p0Var != null) {
            p0Var.k(getSearchField());
        }
    }

    @Override
    public final void F(boolean z10) {
        this.f20654z0.f20625a.w(z10, true);
    }

    @Override
    public final t0 J(p0 p0Var) {
        this.B0 = p0Var;
        return this;
    }

    @Override
    public final t0 M() {
        N();
        return this;
    }

    @Override
    public final t0 N() {
        this.A0 = true;
        this.f20654z0.f20625a.setSearchItem(this);
        return this;
    }

    @Override
    public final void P(CharSequence charSequence, boolean z10) {
        this.f20654z0.f20625a.setSearchFieldText(charSequence);
    }

    @Override
    public final boolean T(boolean z10) {
        i5 i5Var = this.f20654z0.f20625a;
        if (i5Var.F) {
            i5Var.j(z10);
            return false;
        }
        return i5Var.w(z10, true);
    }

    public final void X() {
        if (!this.C0) {
            super.setVisibility(8);
        }
    }

    public final void Y(boolean z10, boolean z11) {
        boolean z12 = this.C0;
        o5 o5Var = this.f20654z0;
        if (z12 == z10) {
            if (!z10 && !z11 && getVisibility() != 8) {
                super.setVisibility(8);
                o5Var.f20628f = true;
                o5Var.requestLayout();
                return;
            } else if (z10 && getVisibility() != 0) {
                super.setVisibility(0);
                return;
            } else {
                return;
            }
        }
        this.C0 = z10;
        if (z10) {
            setEnabled(this.D0);
        } else {
            this.D0 = isEnabled();
            setEnabled(false);
        }
        if (z10) {
            super.setVisibility(0);
        } else if (!z11 || !isLaidOut() || !o5Var.isLaidOut()) {
            super.setVisibility(8);
        }
        if (!z11 || !o5Var.f20625a.t()) {
            o5Var.f20628f = true;
        }
        o5Var.requestLayout();
    }

    public o5 getParentMenu() {
        return this.f20654z0;
    }

    @Override
    public EditTextBoldCursor getSearchField() {
        return this.f20654z0.f20625a.getSearchField();
    }

    public p0 getSearchListener() {
        return this.B0;
    }

    @Override
    public s5 getSubMenuOverlay() {
        return this.f20654z0.f20625a.getMenuOverlay();
    }

    @Override
    public b5 getSubMenuOverlayHost() {
        return this.f20654z0.f20625a;
    }

    @Override
    public final boolean i() {
        o5 o5Var = this.f20654z0;
        if (o5Var.f20626b && !o5Var.f20625a.s()) {
            return false;
        }
        return true;
    }

    @Override
    public final void n() {
        this.f20654z0.f20625a.setSearchFieldText("");
    }

    @Override
    public void setSearchFieldCaption(CharSequence charSequence) {
        this.f20654z0.f20625a.setSearchFieldCaption(charSequence);
    }

    @Override
    public void setSearchFieldHint(CharSequence charSequence) {
        this.f20654z0.f20625a.setSearchFieldHint(charSequence);
        setContentDescription(charSequence);
    }

    @Override
    public void setVisibility(int i10) {
        boolean z10;
        o5 o5Var = this.f20654z0;
        if (o5Var != null && i10 != 4) {
            boolean z11 = false;
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            i5 i5Var = o5Var.f20625a;
            if (o5Var.isLaidOut() && i5Var.t() && (!o5Var.f20626b || (i5Var.s() && i5Var.getActionModeFactor() > 0.0f))) {
                z11 = true;
            }
            Y(z10, z11);
            return;
        }
        super.setVisibility(i10);
    }

    @Override
    public final boolean u() {
        return this.A0;
    }

    @Override
    public final boolean v() {
        return this.f20654z0.f20625a.F;
    }

    @Override
    public final boolean w() {
        return this.f20654z0.f20625a.F;
    }
}
