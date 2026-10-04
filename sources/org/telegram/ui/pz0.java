package org.telegram.ui;
public final class pz0 extends t61 {
    public final ProfileActivity f39560e;

    public pz0(ProfileActivity profileActivity, oz0 oz0Var) {
        super(oz0Var);
        this.f39560e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f39560e.B5 = null;
    }
}
