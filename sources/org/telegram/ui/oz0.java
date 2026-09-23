package org.telegram.ui;
public final class oz0 extends q61 {
    public final ProfileActivity e;

    public oz0(ProfileActivity profileActivity, nz0 nz0Var) {
        super(nz0Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.B5 = null;
    }
}
