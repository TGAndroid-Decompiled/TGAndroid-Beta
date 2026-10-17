package org.telegram.ui;
public final class h10 implements Runnable {
    public final int f37398a;
    public final FiltersSetupActivity f37399b;

    public h10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f37398a = i10;
        this.f37399b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f37398a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f37399b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f37399b;
                filtersSetupActivity2.f33128a.e1(new wt(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f37399b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
