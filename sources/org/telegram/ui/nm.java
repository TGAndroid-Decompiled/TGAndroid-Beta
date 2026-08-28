package org.telegram.ui;
public final class nm implements Runnable {
    public final int f40774a;
    public final cn f40775b;

    public nm(cn cnVar, int i9) {
        this.f40774a = i9;
        this.f40775b = cnVar;
    }

    @Override
    public final void run() {
        switch (this.f40774a) {
            case 0:
                qn qnVar = this.f40775b.f37236a;
                qnVar.Z4 = null;
                qnVar.f41843a5 = null;
                return;
            case 1:
                cn cnVar = this.f40775b;
                cnVar.getClass();
                qn qnVar2 = cnVar.f37236a;
                new zf.x0((org.telegram.ui.ActionBar.o2) qnVar2, 8, true).show();
                qnVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                cn cnVar2 = this.f40775b;
                cnVar2.getClass();
                qn qnVar3 = cnVar2.f37236a;
                new zf.x0((org.telegram.ui.ActionBar.o2) qnVar3, 8, true).show();
                qnVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                cn cnVar3 = this.f40775b;
                cnVar3.getClass();
                qn qnVar4 = cnVar3.f37236a;
                new zf.x0((org.telegram.ui.ActionBar.o2) qnVar4, 8, true).show();
                qnVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f40775b.f37236a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                qn qnVar5 = this.f40775b.f37236a;
                qnVar5.Z4 = null;
                qnVar5.f41843a5 = null;
                return;
            case 6:
                this.f40775b.f37236a.U.G0();
                return;
            case 7:
                this.f40775b.f37236a.U.G0();
                return;
            case 8:
                qn qnVar6 = this.f40775b.f37236a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.P0 = true;
                qnVar6.presentFragment(themeActivity);
                return;
            default:
                qn qnVar7 = this.f40775b.f37236a;
                qnVar7.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) qnVar7, 39, false));
                return;
        }
    }
}
