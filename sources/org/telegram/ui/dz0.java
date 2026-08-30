package org.telegram.ui;
public final class dz0 extends g61 {
    public final ProfileActivity e;

    public dz0(ProfileActivity profileActivity, cz0 cz0Var) {
        super(cz0Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f32200y5 = null;
    }
}
