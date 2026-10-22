package org.telegram.ui;
public final class nm implements Runnable {
    public final int f39656a;
    public final cn f39657b;

    public nm(cn cnVar, int i10) {
        this.f39656a = i10;
        this.f39657b = cnVar;
    }

    @Override
    public final void run() {
        switch (this.f39656a) {
            case 0:
                qn qnVar = this.f39657b.f36014a;
                qnVar.f40660d5 = null;
                qnVar.f40672e5 = null;
                return;
            case 1:
                cn cnVar = this.f39657b;
                cnVar.getClass();
                qn qnVar2 = cnVar.f36014a;
                new sg.y0((org.telegram.ui.ActionBar.n2) qnVar2, 8, true).show();
                qnVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                cn cnVar2 = this.f39657b;
                cnVar2.getClass();
                qn qnVar3 = cnVar2.f36014a;
                new sg.y0((org.telegram.ui.ActionBar.n2) qnVar3, 8, true).show();
                qnVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                cn cnVar3 = this.f39657b;
                cnVar3.getClass();
                qn qnVar4 = cnVar3.f36014a;
                new sg.y0((org.telegram.ui.ActionBar.n2) qnVar4, 8, true).show();
                qnVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f39657b.f36014a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                qn qnVar5 = this.f39657b.f36014a;
                qnVar5.f40660d5 = null;
                qnVar5.f40672e5 = null;
                return;
            case 6:
                this.f39657b.f36014a.Y.F0();
                return;
            case 7:
                this.f39657b.f36014a.Y.F0();
                return;
            case 8:
                qn qnVar6 = this.f39657b.f36014a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                qnVar6.presentFragment(themeActivity);
                return;
            default:
                qn qnVar7 = this.f39657b.f36014a;
                qnVar7.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) qnVar7, 39, false));
                return;
        }
    }
}
