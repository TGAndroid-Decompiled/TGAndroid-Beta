package org.telegram.ui;
public final class k10 implements Runnable {
    public final int f40641a;
    public final FiltersSetupActivity f40642b;

    public k10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f40641a = i10;
        this.f40642b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f40641a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f40642b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f40642b;
                filtersSetupActivity2.f35532a.e1(new st(filtersSetupActivity2, 11), 700, true);
                return;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.f40642b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) filtersSetupActivity3, 9, true));
                return;
            default:
                this.f40642b.getMessagesController().loadRemoteFilters(true);
                return;
        }
    }
}
