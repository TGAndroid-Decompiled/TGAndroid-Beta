package org.telegram.ui;
public final class nm implements Runnable {
    public final int f39657a;
    public final cn f39658b;

    public nm(cn cnVar, int i10) {
        this.f39657a = i10;
        this.f39658b = cnVar;
    }

    @Override
    public final void run() {
        switch (this.f39657a) {
            case 0:
                qn qnVar = this.f39658b.f36015a;
                qnVar.f40661d5 = null;
                qnVar.f40673e5 = null;
                return;
            case 1:
                cn cnVar = this.f39658b;
                cnVar.getClass();
                qn qnVar2 = cnVar.f36015a;
                new sg.y0((org.telegram.ui.ActionBar.n2) qnVar2, 8, true).show();
                qnVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                cn cnVar2 = this.f39658b;
                cnVar2.getClass();
                qn qnVar3 = cnVar2.f36015a;
                new sg.y0((org.telegram.ui.ActionBar.n2) qnVar3, 8, true).show();
                qnVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                cn cnVar3 = this.f39658b;
                cnVar3.getClass();
                qn qnVar4 = cnVar3.f36015a;
                new sg.y0((org.telegram.ui.ActionBar.n2) qnVar4, 8, true).show();
                qnVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f39658b.f36015a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                qn qnVar5 = this.f39658b.f36015a;
                qnVar5.f40661d5 = null;
                qnVar5.f40673e5 = null;
                return;
            case 6:
                this.f39658b.f36015a.Y.F0();
                return;
            case 7:
                this.f39658b.f36015a.Y.F0();
                return;
            case 8:
                qn qnVar6 = this.f39658b.f36015a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                qnVar6.presentFragment(themeActivity);
                return;
            default:
                qn qnVar7 = this.f39658b.f36015a;
                qnVar7.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) qnVar7, 39, false));
                return;
        }
    }
}
