package org.telegram.ui;
public final class i10 implements Runnable {
    public final int f40116a;
    public final FiltersSetupActivity f40117b;

    public i10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f40116a = i10;
        this.f40117b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f40116a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f40117b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f40117b;
                filtersSetupActivity2.f35508a.e1(new qt(filtersSetupActivity2, 11), 700, true);
                return;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.f40117b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) filtersSetupActivity3, 9, true));
                return;
            default:
                this.f40117b.getMessagesController().loadRemoteFilters(true);
                return;
        }
    }
}
