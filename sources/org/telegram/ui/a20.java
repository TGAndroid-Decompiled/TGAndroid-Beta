package org.telegram.ui;
public final class a20 implements Runnable {
    public final int f31687a;
    public final FiltersSetupActivity f31688b;

    public a20(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f31687a = i10;
        this.f31688b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f31687a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f31688b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f31688b;
                filtersSetupActivity2.f30816a.f1(new gu(filtersSetupActivity2, 10), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f31688b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
