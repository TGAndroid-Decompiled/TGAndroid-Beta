package org.telegram.ui;
public final class b01 extends i71 {
    public final ProfileActivity e;

    public b01(ProfileActivity profileActivity, a01 a01Var) {
        super(a01Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.B5 = null;
    }
}
