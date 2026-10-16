package org.telegram.ui;
public final class bn implements Runnable {
    public final int f34352a;
    public final qn f34353b;

    public bn(qn qnVar, int i10) {
        this.f34352a = i10;
        this.f34353b = qnVar;
    }

    @Override
    public final void run() {
        switch (this.f34352a) {
            case 0:
                fo foVar = this.f34353b.f39190a;
                foVar.f35617d5 = null;
                foVar.f35629e5 = null;
                return;
            case 1:
                qn qnVar = this.f34353b;
                qnVar.getClass();
                fo foVar2 = qnVar.f39190a;
                new sg.y0((org.telegram.ui.ActionBar.m2) foVar2, 8, true).show();
                foVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                qn qnVar2 = this.f34353b;
                qnVar2.getClass();
                fo foVar3 = qnVar2.f39190a;
                new sg.y0((org.telegram.ui.ActionBar.m2) foVar3, 8, true).show();
                foVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                qn qnVar3 = this.f34353b;
                qnVar3.getClass();
                fo foVar4 = qnVar3.f39190a;
                new sg.y0((org.telegram.ui.ActionBar.m2) foVar4, 8, true).show();
                foVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f34353b.f39190a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                fo foVar5 = this.f34353b.f39190a;
                foVar5.f35617d5 = null;
                foVar5.f35629e5 = null;
                return;
            case 6:
                this.f34353b.f39190a.Y.F0();
                return;
            case 7:
                this.f34353b.f39190a.Y.F0();
                return;
            case 8:
                fo foVar6 = this.f34353b.f39190a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                foVar6.presentFragment(themeActivity);
                return;
            default:
                fo foVar7 = this.f34353b.f39190a;
                foVar7.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) foVar7, 39, false));
                return;
        }
    }
}
