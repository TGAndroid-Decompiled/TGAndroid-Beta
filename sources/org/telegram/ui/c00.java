package org.telegram.ui;
public final class c00 implements Runnable {
    public final int f44192a;
    public final FiltersSetupActivity f44193b;

    public c00(FiltersSetupActivity filtersSetupActivity, int i7) {
        this.f44192a = i7;
        this.f44193b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f44192a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f44193b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f44193b;
                filtersSetupActivity2.f41234a.e1(new zr(filtersSetupActivity2, 12), 700, true);
                return;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.f44193b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) filtersSetupActivity3, 9, true));
                return;
            default:
                this.f44193b.getMessagesController().c3(true, null);
                return;
        }
    }
}
