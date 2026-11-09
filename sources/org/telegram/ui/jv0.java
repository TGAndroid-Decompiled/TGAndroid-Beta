package org.telegram.ui;
public final class jv0 extends j11 {
    public final ProfileActivity f47104e;

    public jv0(ProfileActivity profileActivity, iv0 iv0Var) {
        super(iv0Var);
        this.f47104e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f47104e.P5 = null;
    }
}
