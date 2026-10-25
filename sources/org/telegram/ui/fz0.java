package org.telegram.ui;
public final class fz0 extends t51 {
    public final ProfileActivity e;

    public fz0(ProfileActivity profileActivity, ez0 ez0Var) {
        super(ez0Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.H5 = null;
    }
}
