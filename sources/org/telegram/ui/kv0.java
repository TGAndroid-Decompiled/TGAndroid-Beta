package org.telegram.ui;
public final class kv0 extends k11 {
    public final ProfileActivity f47438e;

    public kv0(ProfileActivity profileActivity, jv0 jv0Var) {
        super(jv0Var);
        this.f47438e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f47438e.P5 = null;
    }
}
