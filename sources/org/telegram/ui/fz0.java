package org.telegram.ui;
public final class fz0 extends i61 {
    public final ProfileActivity f37039e;

    public fz0(ProfileActivity profileActivity, ez0 ez0Var) {
        super(ez0Var);
        this.f37039e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f37039e.f34733y5 = null;
    }
}
