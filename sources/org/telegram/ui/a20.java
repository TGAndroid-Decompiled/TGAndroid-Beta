package org.telegram.ui;
public final class a20 implements Runnable {
    public final int f30786a;
    public final FiltersSetupActivity f30787b;

    public a20(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f30786a = i10;
        this.f30787b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f30786a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f30787b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f30787b;
                filtersSetupActivity2.f29912a.d1(new iu(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f30787b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
