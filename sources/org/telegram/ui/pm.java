package org.telegram.ui;
public final class pm implements Runnable {
    public final int f41433a;
    public final fn f41434b;

    public pm(fn fnVar, int i10) {
        this.f41433a = i10;
        this.f41434b = fnVar;
    }

    @Override
    public final void run() {
        switch (this.f41433a) {
            case 0:
                tn tnVar = this.f41434b.f38212a;
                tnVar.Z4 = null;
                tnVar.f42741a5 = null;
                return;
            case 1:
                fn fnVar = this.f41434b;
                fnVar.getClass();
                tn tnVar2 = fnVar.f38212a;
                new cg.p1((org.telegram.ui.ActionBar.o2) tnVar2, 8, true).show();
                tnVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                fn fnVar2 = this.f41434b;
                fnVar2.getClass();
                tn tnVar3 = fnVar2.f38212a;
                new cg.p1((org.telegram.ui.ActionBar.o2) tnVar3, 8, true).show();
                tnVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                fn fnVar3 = this.f41434b;
                fnVar3.getClass();
                tn tnVar4 = fnVar3.f38212a;
                new cg.p1((org.telegram.ui.ActionBar.o2) tnVar4, 8, true).show();
                tnVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f41434b.f38212a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                tn tnVar5 = this.f41434b.f38212a;
                tnVar5.Z4 = null;
                tnVar5.f42741a5 = null;
                return;
            case 6:
                this.f41434b.f38212a.U.H0();
                return;
            case 7:
                this.f41434b.f38212a.U.H0();
                return;
            case 8:
                tn tnVar6 = this.f41434b.f38212a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.P0 = true;
                tnVar6.presentFragment(themeActivity);
                return;
            default:
                tn tnVar7 = this.f41434b.f38212a;
                tnVar7.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) tnVar7, 39, false));
                return;
        }
    }
}
