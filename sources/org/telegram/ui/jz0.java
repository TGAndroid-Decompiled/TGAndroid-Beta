package org.telegram.ui;
public final class jz0 extends n61 {
    public final ProfileActivity e;

    public jz0(ProfileActivity profileActivity, iz0 iz0Var) {
        super(iz0Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f32174y5 = null;
    }
}
