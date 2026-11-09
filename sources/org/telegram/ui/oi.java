package org.telegram.ui;
public final class oi extends org.telegram.ui.ActionBar.g1 {
    public final cn f48453o;

    public oi(cn cnVar, mi miVar) {
        super(miVar, -2, -2);
        this.f48453o = cnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        cn cnVar = this.f48453o;
        if (cnVar.f44442e9 == this) {
            cnVar.f44442e9 = null;
            cnVar.f44507j9 = null;
            cnVar.f44494i9 = null;
            cnVar.B0.R = true;
            if (cnVar.f44456f9) {
                cnVar.w8(false, true, 0.0f);
            } else {
                cnVar.f44456f9 = true;
            }
            sj sjVar = cnVar.Z;
            if (sjVar != null && sjVar.getEditField() != null) {
                cnVar.Z.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
