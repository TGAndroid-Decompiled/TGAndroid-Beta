package org.telegram.ui;
public final class iv0 extends i11 {
    public final ProfileActivity f48837e;

    public iv0(ProfileActivity profileActivity, hv0 hv0Var) {
        super(hv0Var);
        this.f48837e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f48837e.T5 = null;
    }
}
