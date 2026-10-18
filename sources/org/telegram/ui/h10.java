package org.telegram.ui;
public final class h10 implements Runnable {
    public final int f37378a;
    public final FiltersSetupActivity f37379b;

    public h10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f37378a = i10;
        this.f37379b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f37378a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f37379b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f37379b;
                filtersSetupActivity2.f33128a.e1(new wt(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f37379b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
