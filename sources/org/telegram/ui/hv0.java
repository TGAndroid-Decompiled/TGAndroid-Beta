package org.telegram.ui;
public final class hv0 extends i11 {
    public final ProfileActivity f48531e;

    public hv0(ProfileActivity profileActivity, gv0 gv0Var) {
        super(gv0Var);
        this.f48531e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f48531e.T5 = null;
    }
}
