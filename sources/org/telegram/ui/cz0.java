package org.telegram.ui;
public final class cz0 extends s51 {
    public final ProfileActivity e;

    public cz0(ProfileActivity profileActivity, bz0 bz0Var) {
        super(bz0Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.D5 = null;
    }
}
