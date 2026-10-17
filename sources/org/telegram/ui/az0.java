package org.telegram.ui;
public final class az0 extends q51 {
    public final ProfileActivity e;

    public az0(ProfileActivity profileActivity, zy0 zy0Var) {
        super(zy0Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.D5 = null;
    }
}
