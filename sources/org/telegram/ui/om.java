package org.telegram.ui;

public final class om implements Runnable {

    public final int f41139a;

    public final dn f41140b;

    public om(dn dnVar, int i10) {
        this.f41139a = i10;
        this.f41140b = dnVar;
    }

    @Override
    public final void run() {
        switch (this.f41139a) {
            case 0:
                rn rnVar = this.f41140b.f37446a;
                rnVar.Z4 = null;
                rnVar.f41978a5 = null;
                break;
            case 1:
                dn dnVar = this.f41140b;
                dnVar.getClass();
                rn rnVar2 = dnVar.f37446a;
                new ag.g2((org.telegram.ui.ActionBar.n2) rnVar2, 8, true).show();
                rnVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                dn dnVar2 = this.f41140b;
                dnVar2.getClass();
                rn rnVar3 = dnVar2.f37446a;
                new ag.g2((org.telegram.ui.ActionBar.n2) rnVar3, 8, true).show();
                rnVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                dn dnVar3 = this.f41140b;
                dnVar3.getClass();
                rn rnVar4 = dnVar3.f37446a;
                new ag.g2((org.telegram.ui.ActionBar.n2) rnVar4, 8, true).show();
                rnVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.f41140b.f37446a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                rn rnVar5 = this.f41140b.f37446a;
                rnVar5.Z4 = null;
                rnVar5.f41978a5 = null;
                break;
            case 6:
                this.f41140b.f37446a.U.H0();
                break;
            case 7:
                this.f41140b.f37446a.U.H0();
                break;
            case 8:
                rn rnVar6 = this.f41140b.f37446a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.P0 = true;
                rnVar6.presentFragment(themeActivity);
                break;
            default:
                rn rnVar7 = this.f41140b.f37446a;
                rnVar7.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) rnVar7, 39, false));
                break;
        }
    }
}
