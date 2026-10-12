package org.telegram.ui;
public final class d20 implements Runnable {
    public final int f35121a;
    public final FiltersSetupActivity f35122b;

    public d20(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f35121a = i10;
        this.f35122b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f35121a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f35122b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f35122b;
                filtersSetupActivity2.f32088a.e1(new mu(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f35122b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
