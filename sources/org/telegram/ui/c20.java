package org.telegram.ui;
public final class c20 implements Runnable {
    public final int f34426a;
    public final FiltersSetupActivity f34427b;

    public c20(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f34426a = i10;
        this.f34427b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f34426a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f34427b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f34427b;
                filtersSetupActivity2.f31790a.e1(new mu(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f34427b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
