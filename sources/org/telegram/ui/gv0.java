package org.telegram.ui;
public final class gv0 extends h11 {
    public final ProfileActivity f46100e;

    public gv0(ProfileActivity profileActivity, fv0 fv0Var) {
        super(fv0Var);
        this.f46100e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f46100e.N5 = null;
    }
}
