package org.telegram.ui;
public final class d00 implements Runnable {
    public final int f46843a;
    public final FiltersSetupActivity f46844b;

    public d00(FiltersSetupActivity filtersSetupActivity, int i7) {
        this.f46843a = i7;
        this.f46844b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f46843a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f46844b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f46844b;
                filtersSetupActivity2.f43090a.e1(new zr(filtersSetupActivity2, 12), 700, true);
                return;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.f46844b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) filtersSetupActivity3, 9, true));
                return;
            default:
                this.f46844b.getMessagesController().i3(true, null);
                return;
        }
    }
}
