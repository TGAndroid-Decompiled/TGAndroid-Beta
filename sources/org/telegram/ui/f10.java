package org.telegram.ui;
public final class f10 implements Runnable {
    public final int f36865a;
    public final FiltersSetupActivity f36866b;

    public f10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f36865a = i10;
        this.f36866b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f36865a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f36866b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f36866b;
                filtersSetupActivity2.f33145a.e1(new ut(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f36866b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
