package org.telegram.ui;
public final class hv0 extends h11 {
    public final ProfileActivity f46503e;

    public hv0(ProfileActivity profileActivity, gv0 gv0Var) {
        super(gv0Var);
        this.f46503e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f46503e.N5 = null;
    }
}
