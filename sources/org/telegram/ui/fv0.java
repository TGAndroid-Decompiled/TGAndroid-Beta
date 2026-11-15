package org.telegram.ui;
public final class fv0 extends e11 {
    public final ProfileActivity f47197e;

    public fv0(ProfileActivity profileActivity, ev0 ev0Var) {
        super(ev0Var);
        this.f47197e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f47197e.R5 = null;
    }
}
