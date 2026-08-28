package org.telegram.ui;
public final class g10 implements Runnable {
    public final int f38408a;
    public final FiltersSetupActivity f38409b;

    public g10(FiltersSetupActivity filtersSetupActivity, int i9) {
        this.f38408a = i9;
        this.f38409b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f38408a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f38409b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f38409b;
                filtersSetupActivity2.f35476a.e1(new wt(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f38409b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
