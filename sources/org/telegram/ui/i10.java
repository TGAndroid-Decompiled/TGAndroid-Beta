package org.telegram.ui;
public final class i10 implements Runnable {
    public final int f39103a;
    public final FiltersSetupActivity f39104b;

    public i10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f39103a = i10;
        this.f39104b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f39103a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f39104b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f39104b;
                filtersSetupActivity2.f35543a.e1(new xt(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f39104b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
