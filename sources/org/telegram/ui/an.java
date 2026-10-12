package org.telegram.ui;
public final class an implements Runnable {
    public final int f35906a;
    public final pn f35907b;

    public an(pn pnVar, int i10) {
        this.f35906a = i10;
        this.f35907b = pnVar;
    }

    @Override
    public final void run() {
        switch (this.f35906a) {
            case 0:
                eo eoVar = this.f35907b.f41000a;
                eoVar.f37238d5 = null;
                eoVar.f37252e5 = null;
                return;
            case 1:
                pn pnVar = this.f35907b;
                pnVar.getClass();
                eo eoVar2 = pnVar.f41000a;
                new rg.y0((org.telegram.ui.ActionBar.m2) eoVar2, 8, true).show();
                eoVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                pn pnVar2 = this.f35907b;
                pnVar2.getClass();
                eo eoVar3 = pnVar2.f41000a;
                new rg.y0((org.telegram.ui.ActionBar.m2) eoVar3, 8, true).show();
                eoVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                pn pnVar3 = this.f35907b;
                pnVar3.getClass();
                eo eoVar4 = pnVar3.f41000a;
                new rg.y0((org.telegram.ui.ActionBar.m2) eoVar4, 8, true).show();
                eoVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f35907b.f41000a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                eo eoVar5 = this.f35907b.f41000a;
                eoVar5.f37238d5 = null;
                eoVar5.f37252e5 = null;
                return;
            case 6:
                this.f35907b.f41000a.Y.J0();
                return;
            case 7:
                this.f35907b.f41000a.Y.J0();
                return;
            case 8:
                eo eoVar6 = this.f35907b.f41000a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                eoVar6.presentFragment(themeActivity);
                return;
            default:
                eo eoVar7 = this.f35907b.f41000a;
                eoVar7.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) eoVar7, 39, false));
                return;
        }
    }
}
