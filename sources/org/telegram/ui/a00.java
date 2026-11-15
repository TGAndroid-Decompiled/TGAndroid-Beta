package org.telegram.ui;
public final class a00 implements Runnable {
    public final int f44894a;
    public final FiltersSetupActivity f44895b;

    public a00(FiltersSetupActivity filtersSetupActivity, int i7) {
        this.f44894a = i7;
        this.f44895b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f44894a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f44895b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f44895b;
                filtersSetupActivity2.f42604a.e1(new zr(filtersSetupActivity2, 12), 700, true);
                return;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.f44895b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) filtersSetupActivity3, 9, true));
                return;
            default:
                this.f44895b.getMessagesController().c3(true, null);
                return;
        }
    }
}
