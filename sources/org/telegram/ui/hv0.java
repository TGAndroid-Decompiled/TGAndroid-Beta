package org.telegram.ui;
public final class hv0 extends j11 {
    public final ProfileActivity f48534e;

    public hv0(ProfileActivity profileActivity, gv0 gv0Var) {
        super(gv0Var);
        this.f48534e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f48534e.T5 = null;
    }
}
