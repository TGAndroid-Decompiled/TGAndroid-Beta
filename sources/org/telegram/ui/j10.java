package org.telegram.ui;

public final class j10 implements Runnable {

    public final int f39221a;

    public final FiltersSetupActivity f39222b;

    public j10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f39221a = i10;
        this.f39222b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f39221a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f39222b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f39222b;
                filtersSetupActivity2.f35479a.e1(new zt(filtersSetupActivity2, 9), 700, true);
                break;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f39222b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) filtersSetupActivity3, 9, true));
                break;
        }
    }
}
