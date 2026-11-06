package org.telegram.ui;
public final class hv0 extends h11 {
    public final ProfileActivity f46502e;

    public hv0(ProfileActivity profileActivity, gv0 gv0Var) {
        super(gv0Var);
        this.f46502e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f46502e.N5 = null;
    }
}
