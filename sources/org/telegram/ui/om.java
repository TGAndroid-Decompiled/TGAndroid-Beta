package org.telegram.ui;
public final class om implements Runnable {
    public final int f40217a;
    public final dn f40218b;

    public om(dn dnVar, int i10) {
        this.f40217a = i10;
        this.f40218b = dnVar;
    }

    @Override
    public final void run() {
        switch (this.f40217a) {
            case 0:
                sn snVar = this.f40218b.f36651a;
                snVar.p5 = null;
                snVar.f41647q5 = null;
                return;
            case 1:
                dn dnVar = this.f40218b;
                dnVar.getClass();
                sn snVar2 = dnVar.f36651a;
                new sg.y0((org.telegram.ui.ActionBar.o2) snVar2, 8, true).show();
                snVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                dn dnVar2 = this.f40218b;
                dnVar2.getClass();
                sn snVar3 = dnVar2.f36651a;
                new sg.y0((org.telegram.ui.ActionBar.o2) snVar3, 8, true).show();
                snVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                dn dnVar3 = this.f40218b;
                dnVar3.getClass();
                sn snVar4 = dnVar3.f36651a;
                new sg.y0((org.telegram.ui.ActionBar.o2) snVar4, 8, true).show();
                snVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f40218b.f36651a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                sn snVar5 = this.f40218b.f36651a;
                snVar5.p5 = null;
                snVar5.f41647q5 = null;
                return;
            case 6:
                this.f40218b.f36651a.Y.F0();
                return;
            case 7:
                this.f40218b.f36651a.Y.F0();
                return;
            case 8:
                sn snVar6 = this.f40218b.f36651a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                snVar6.presentFragment(themeActivity);
                return;
            default:
                sn snVar7 = this.f40218b.f36651a;
                snVar7.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) snVar7, 39, false));
                return;
        }
    }
}
