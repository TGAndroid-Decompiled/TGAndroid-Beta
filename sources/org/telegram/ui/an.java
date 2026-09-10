package org.telegram.ui;
public final class an implements Runnable {
    public final int f31039a;
    public final pn f31040b;

    public an(pn pnVar, int i10) {
        this.f31039a = i10;
        this.f31040b = pnVar;
    }

    @Override
    public final void run() {
        switch (this.f31039a) {
            case 0:
                eo eoVar = this.f31040b.f35881a;
                eoVar.f32299d5 = null;
                eoVar.f32312e5 = null;
                return;
            case 1:
                pn pnVar = this.f31040b;
                pnVar.getClass();
                eo eoVar2 = pnVar.f35881a;
                new qg.a1((org.telegram.ui.ActionBar.p2) eoVar2, 8, true).show();
                eoVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                pn pnVar2 = this.f31040b;
                pnVar2.getClass();
                eo eoVar3 = pnVar2.f35881a;
                new qg.a1((org.telegram.ui.ActionBar.p2) eoVar3, 8, true).show();
                eoVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                pn pnVar3 = this.f31040b;
                pnVar3.getClass();
                eo eoVar4 = pnVar3.f35881a;
                new qg.a1((org.telegram.ui.ActionBar.p2) eoVar4, 8, true).show();
                eoVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f31040b.f35881a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                eo eoVar5 = this.f31040b.f35881a;
                eoVar5.f32299d5 = null;
                eoVar5.f32312e5 = null;
                return;
            case 6:
                this.f31040b.f35881a.Y.H0();
                return;
            case 7:
                this.f31040b.f35881a.Y.H0();
                return;
            case 8:
                eo eoVar6 = this.f31040b.f35881a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                eoVar6.presentFragment(themeActivity);
                return;
            default:
                eo eoVar7 = this.f31040b.f35881a;
                eoVar7.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) eoVar7, 39, false));
                return;
        }
    }
}
