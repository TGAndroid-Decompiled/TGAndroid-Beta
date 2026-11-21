package org.telegram.ui;
public final class ct0 implements org.telegram.ui.ActionBar.q1 {
    public final int f46669a;
    public final PrivacyControlActivity f46670b;

    public ct0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f46669a = i7;
        this.f46670b = privacyControlActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f46669a) {
            case 0:
                this.f46670b.K0();
                return;
            case 1:
                this.f46670b.finishFragment();
                return;
            default:
                this.f46670b.finishFragment();
                return;
        }
    }
}
