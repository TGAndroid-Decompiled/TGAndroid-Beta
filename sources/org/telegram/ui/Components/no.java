package org.telegram.ui.Components;
public final class no implements Runnable {
    public final int f37653a;
    public final ep f37654b;

    public no(ep epVar, int i7) {
        this.f37653a = i7;
        this.f37654b = epVar;
    }

    @Override
    public final void run() {
        switch (this.f37653a) {
            case 0:
                this.f37654b.f34396r1.f();
                return;
            case 1:
                this.f37654b.K0(true);
                return;
            case 2:
                ep epVar = this.f37654b;
                org.telegram.ui.an anVar = epVar.f34400v1;
                org.telegram.ui.ActionBar.e2 g02 = org.telegram.ui.z41.g0(anVar.getMessagesController().M0(Long.valueOf(-anVar.a())), true);
                ?? obj = new Object();
                obj.f28476a = true;
                g02.setResourceProvider(anVar.getResourceProvider());
                obj.f28478c = new ih(2);
                obj.d = new no(epVar, 3);
                obj.f28477b = new no(epVar, 4);
                obj.f28479e = true;
                epVar.R1 = g02;
                anVar.showAsSheet(g02, obj);
                return;
            case 3:
                this.f37654b.O0();
                return;
            case 4:
                this.f37654b.R1 = null;
                return;
            case 5:
                this.f37654b.O0();
                return;
            case 6:
                this.f37654b.R1 = null;
                return;
            default:
                ep epVar2 = this.f37654b;
                epVar2.O1.c(epVar2.A1);
                return;
        }
    }
}
