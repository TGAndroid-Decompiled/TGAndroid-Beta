package org.telegram.ui;
public final class gv0 extends h11 {
    public final ProfileActivity f48364e;

    public gv0(ProfileActivity profileActivity, fv0 fv0Var) {
        super(fv0Var);
        this.f48364e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f48364e.T5 = null;
    }
}
