package org.telegram.ui;
public final class c01 extends i71 {
    public final ProfileActivity e;

    public c01(ProfileActivity profileActivity, b01 b01Var) {
        super(b01Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.B5 = null;
    }
}
