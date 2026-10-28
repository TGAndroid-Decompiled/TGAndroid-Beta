package org.telegram.ui;
public final class hz0 extends w51 {
    public final ProfileActivity e;

    public hz0(ProfileActivity profileActivity, gz0 gz0Var) {
        super(gz0Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.H5 = null;
    }
}
