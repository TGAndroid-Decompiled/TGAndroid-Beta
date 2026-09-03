package org.telegram.ui;
public final class jz0 extends n61 {
    public final ProfileActivity f38147e;

    public jz0(ProfileActivity profileActivity, iz0 iz0Var) {
        super(iz0Var);
        this.f38147e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f38147e.f34733y5 = null;
    }
}
