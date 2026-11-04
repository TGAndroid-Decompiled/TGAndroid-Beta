package org.telegram.ui;
public final class pl implements Runnable {
    public final int f48603a;
    public final hm f48604b;

    public pl(hm hmVar, int i3) {
        this.f48603a = i3;
        this.f48604b = hmVar;
    }

    @Override
    public final void run() {
        switch (this.f48603a) {
            case 0:
                wm wmVar = this.f48604b.f45934a;
                wmVar.f51500u5 = null;
                wmVar.f51512v5 = null;
                return;
            case 1:
                hm hmVar = this.f48604b;
                hmVar.getClass();
                wm wmVar2 = hmVar.f45934a;
                new vg.v0((org.telegram.ui.ActionBar.d2) wmVar2, 8, true).show();
                wmVar2.getMessagesController().E3();
                return;
            case 2:
                hm hmVar2 = this.f48604b;
                hmVar2.getClass();
                wm wmVar3 = hmVar2.f45934a;
                new vg.v0((org.telegram.ui.ActionBar.d2) wmVar3, 8, true).show();
                wmVar3.getMessagesController().E3();
                return;
            case 3:
                hm hmVar3 = this.f48604b;
                hmVar3.getClass();
                wm wmVar4 = hmVar3.f45934a;
                new vg.v0((org.telegram.ui.ActionBar.d2) wmVar4, 8, true).show();
                wmVar4.getMessagesController().E3();
                return;
            case 4:
                this.f48604b.f45934a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                wm wmVar5 = this.f48604b.f45934a;
                wmVar5.f51500u5 = null;
                wmVar5.f51512v5 = null;
                return;
            case 6:
                this.f48604b.f45934a.f51237a0.G0();
                return;
            case 7:
                this.f48604b.f45934a.f51237a0.G0();
                return;
            case 8:
                wm wmVar6 = this.f48604b.f45934a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.U0 = true;
                wmVar6.presentFragment(themeActivity);
                return;
            default:
                wm wmVar7 = this.f48604b.f45934a;
                wmVar7.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) wmVar7, 39, false));
                return;
        }
    }
}
