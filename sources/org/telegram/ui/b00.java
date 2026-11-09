package org.telegram.ui;
public final class b00 implements Runnable {
    public final int f43844a;
    public final FiltersSetupActivity f43845b;

    public b00(FiltersSetupActivity filtersSetupActivity, int i7) {
        this.f43844a = i7;
        this.f43845b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f43844a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f43845b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f43845b;
                filtersSetupActivity2.f41243a.e1(new yr(filtersSetupActivity2, 12), 700, true);
                return;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.f43845b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) filtersSetupActivity3, 9, true));
                return;
            default:
                this.f43845b.getMessagesController().c3(true, null);
                return;
        }
    }
}
