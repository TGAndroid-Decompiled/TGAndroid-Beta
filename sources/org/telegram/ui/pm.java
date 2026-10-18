package org.telegram.ui;
public final class pm implements Runnable {
    public final int f40211a;
    public final en f40212b;

    public pm(en enVar, int i10) {
        this.f40211a = i10;
        this.f40212b = enVar;
    }

    @Override
    public final void run() {
        switch (this.f40211a) {
            case 0:
                sn snVar = this.f40212b.f36573a;
                snVar.f41210d5 = null;
                snVar.f41222e5 = null;
                return;
            case 1:
                en enVar = this.f40212b;
                enVar.getClass();
                sn snVar2 = enVar.f36573a;
                new sg.x0((org.telegram.ui.ActionBar.n2) snVar2, 8, true).show();
                snVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                en enVar2 = this.f40212b;
                enVar2.getClass();
                sn snVar3 = enVar2.f36573a;
                new sg.x0((org.telegram.ui.ActionBar.n2) snVar3, 8, true).show();
                snVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                en enVar3 = this.f40212b;
                enVar3.getClass();
                sn snVar4 = enVar3.f36573a;
                new sg.x0((org.telegram.ui.ActionBar.n2) snVar4, 8, true).show();
                snVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f40212b.f36573a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                sn snVar5 = this.f40212b.f36573a;
                snVar5.f41210d5 = null;
                snVar5.f41222e5 = null;
                return;
            case 6:
                this.f40212b.f36573a.Y.F0();
                return;
            case 7:
                this.f40212b.f36573a.Y.F0();
                return;
            case 8:
                sn snVar6 = this.f40212b.f36573a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                snVar6.presentFragment(themeActivity);
                return;
            default:
                sn snVar7 = this.f40212b.f36573a;
                snVar7.showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) snVar7, 39, false));
                return;
        }
    }
}
