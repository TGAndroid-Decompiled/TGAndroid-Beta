package org.telegram.ui;
public final class a10 implements Runnable {
    public final int f35509a;
    public final FiltersSetupActivity f35510b;

    public a10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f35509a = i10;
        this.f35510b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f35509a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f35510b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f35510b;
                filtersSetupActivity2.f33331a.e1(new tt(filtersSetupActivity2, 11), 700, true);
                return;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.f35510b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) filtersSetupActivity3, 9, true));
                return;
            default:
                this.f35510b.getMessagesController().a3(true, null);
                return;
        }
    }
}
