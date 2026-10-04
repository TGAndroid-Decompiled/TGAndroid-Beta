package org.telegram.ui;
public final class pz0 extends t61 {
    public final ProfileActivity f39559e;

    public pz0(ProfileActivity profileActivity, oz0 oz0Var) {
        super(oz0Var);
        this.f39559e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f39559e.B5 = null;
    }
}
