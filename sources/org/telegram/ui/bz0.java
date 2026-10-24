package org.telegram.ui;
public final class bz0 extends r51 {
    public final ProfileActivity e;

    public bz0(ProfileActivity profileActivity, az0 az0Var) {
        super(az0Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.D5 = null;
    }
}
