package org.telegram.ui;
public final class c00 implements Runnable {
    public final int f46679a;
    public final FiltersSetupActivity f46680b;

    public c00(FiltersSetupActivity filtersSetupActivity, int i7) {
        this.f46679a = i7;
        this.f46680b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f46679a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f46680b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f46680b;
                filtersSetupActivity2.f43169a.e1(new zr(filtersSetupActivity2, 12), 700, true);
                return;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.f46680b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) filtersSetupActivity3, 9, true));
                return;
            default:
                this.f46680b.getMessagesController().i3(true, null);
                return;
        }
    }
}
