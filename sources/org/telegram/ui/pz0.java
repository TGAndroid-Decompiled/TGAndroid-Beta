package org.telegram.ui;
public final class pz0 extends r61 {
    public final ProfileActivity f39649e;

    public pz0(ProfileActivity profileActivity, oz0 oz0Var) {
        super(oz0Var);
        this.f39649e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f39649e.B5 = null;
    }
}
