package org.telegram.ui;
public final class j10 implements Runnable {
    public final int f38430a;
    public final FiltersSetupActivity f38431b;

    public j10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f38430a = i10;
        this.f38431b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f38430a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f38431b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f38431b;
                filtersSetupActivity2.f33444a.f1(new xt(filtersSetupActivity2, 9), 700, true);
                return;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.f38431b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) filtersSetupActivity3, 9, true));
                return;
            default:
                this.f38431b.getMessagesController().loadRemoteFilters(true);
                return;
        }
    }
}
