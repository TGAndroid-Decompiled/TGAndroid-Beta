package org.telegram.ui;
public final class mz0 extends r61 {
    public final ProfileActivity e;

    public mz0(ProfileActivity profileActivity, lz0 lz0Var) {
        super(lz0Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.B5 = null;
    }
}
