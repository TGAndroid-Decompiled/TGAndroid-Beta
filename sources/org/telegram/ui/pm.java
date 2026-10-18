package org.telegram.ui;
public final class pm implements Runnable {
    public final int f40169a;
    public final en f40170b;

    public pm(en enVar, int i10) {
        this.f40169a = i10;
        this.f40170b = enVar;
    }

    @Override
    public final void run() {
        switch (this.f40169a) {
            case 0:
                sn snVar = this.f40170b.f36557a;
                snVar.f41175d5 = null;
                snVar.f41187e5 = null;
                return;
            case 1:
                en enVar = this.f40170b;
                enVar.getClass();
                sn snVar2 = enVar.f36557a;
                new sg.y0((org.telegram.ui.ActionBar.n2) snVar2, 8, true).show();
                snVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                en enVar2 = this.f40170b;
                enVar2.getClass();
                sn snVar3 = enVar2.f36557a;
                new sg.y0((org.telegram.ui.ActionBar.n2) snVar3, 8, true).show();
                snVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                en enVar3 = this.f40170b;
                enVar3.getClass();
                sn snVar4 = enVar3.f36557a;
                new sg.y0((org.telegram.ui.ActionBar.n2) snVar4, 8, true).show();
                snVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f40170b.f36557a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                sn snVar5 = this.f40170b.f36557a;
                snVar5.f41175d5 = null;
                snVar5.f41187e5 = null;
                return;
            case 6:
                this.f40170b.f36557a.Y.F0();
                return;
            case 7:
                this.f40170b.f36557a.Y.F0();
                return;
            case 8:
                sn snVar6 = this.f40170b.f36557a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                snVar6.presentFragment(themeActivity);
                return;
            default:
                sn snVar7 = this.f40170b.f36557a;
                snVar7.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) snVar7, 39, false));
                return;
        }
    }
}
