package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class h5 extends r0 {
    public final g5 A0;
    public boolean B0;
    public n0 C0;
    public boolean D0;
    public boolean E0;

    public h5(Context context, g5 g5Var, int i7, int i10, boolean z10, i6 i6Var) {
        super(context, null, i7, i10, z10, i6Var);
        this.D0 = true;
        this.E0 = true;
        this.A0 = g5Var;
        setDelegate(new e5(g5Var));
    }

    @Override
    public final void F() {
        n0 n0Var = this.C0;
        if (n0Var != null) {
            n0Var.k(getSearchField());
        }
    }

    @Override
    public final void G(boolean z10) {
        this.A0.f28973a.B(z10, true);
    }

    @Override
    public final r0 K(n0 n0Var) {
        this.C0 = n0Var;
        return this;
    }

    @Override
    public final r0 N() {
        O();
        return this;
    }

    @Override
    public final r0 O() {
        this.B0 = true;
        this.A0.f28973a.setSearchItem(this);
        return this;
    }

    @Override
    public final void Q(CharSequence charSequence, boolean z10) {
        this.A0.f28973a.setSearchFieldText(charSequence);
    }

    @Override
    public final boolean U(boolean z10) {
        a5 a5Var = this.A0.f28973a;
        if (a5Var.G) {
            a5Var.o(z10);
            return false;
        }
        return a5Var.B(z10, true);
    }

    public final void Y() {
        if (!this.D0) {
            super.setVisibility(8);
        }
    }

    public final void Z(boolean z10, boolean z11) {
        boolean z12 = this.D0;
        g5 g5Var = this.A0;
        if (z12 == z10) {
            if (!z10 && !z11 && getVisibility() != 8) {
                super.setVisibility(8);
                g5Var.f28977f = true;
                g5Var.requestLayout();
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
        } else if (!z11 || !isLaidOut() || !g5Var.isLaidOut()) {
            super.setVisibility(8);
        }
        if (!z11 || !g5Var.f28973a.y()) {
            g5Var.f28977f = true;
        }
        g5Var.requestLayout();
    }

    public g5 getParentMenu() {
        return this.A0;
    }

    @Override
    public EditTextBoldCursor getSearchField() {
        return this.A0.f28973a.getSearchField();
    }

    public n0 getSearchListener() {
        return this.C0;
    }

    @Override
    public k5 getSubMenuOverlay() {
        return this.A0.f28973a.getMenuOverlay();
    }

    @Override
    public u4 getSubMenuOverlayHost() {
        return this.A0.f28973a;
    }

    @Override
    public final boolean j() {
        g5 g5Var = this.A0;
        if (g5Var.f28974b && !g5Var.f28973a.x()) {
            return false;
        }
        return true;
    }

    @Override
    public final void o() {
        this.A0.f28973a.setSearchFieldText("");
    }

    @Override
    public void setSearchFieldCaption(CharSequence charSequence) {
        this.A0.f28973a.setSearchFieldCaption(charSequence);
    }

    @Override
    public void setSearchFieldHint(CharSequence charSequence) {
        this.A0.f28973a.setSearchFieldHint(charSequence);
        setContentDescription(charSequence);
    }

    @Override
    public void setVisibility(int i7) {
        boolean z10;
        g5 g5Var = this.A0;
        if (g5Var != null && i7 != 4) {
            boolean z11 = false;
            if (i7 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            a5 a5Var = g5Var.f28973a;
            if (g5Var.isLaidOut() && a5Var.y() && (!g5Var.f28974b || (a5Var.x() && a5Var.getActionModeFactor() > 0.0f))) {
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
        return this.A0.f28973a.G;
    }

    @Override
    public final boolean x() {
        return this.A0.f28973a.G;
    }
}
