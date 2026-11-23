package org.telegram.ui;
public final class d00 implements Runnable {
    public final int f46846a;
    public final FiltersSetupActivity f46847b;

    public d00(FiltersSetupActivity filtersSetupActivity, int i7) {
        this.f46846a = i7;
        this.f46847b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f46846a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f46847b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f46847b;
                filtersSetupActivity2.f43094a.e1(new zr(filtersSetupActivity2, 12), 700, true);
                return;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.f46847b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) filtersSetupActivity3, 9, true));
                return;
            default:
                this.f46847b.getMessagesController().i3(true, null);
                return;
        }
    }
}
