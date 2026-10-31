package org.telegram.ui;
public final class pm implements Runnable {
    public final int f40687a;
    public final fn f40688b;

    public pm(fn fnVar, int i10) {
        this.f40687a = i10;
        this.f40688b = fnVar;
    }

    @Override
    public final void run() {
        switch (this.f40687a) {
            case 0:
                un unVar = this.f40688b.f37301a;
                unVar.f42421t5 = null;
                unVar.f42434u5 = null;
                return;
            case 1:
                fn fnVar = this.f40688b;
                fnVar.getClass();
                un unVar2 = fnVar.f37301a;
                new kg.i1((org.telegram.ui.ActionBar.k2) unVar2, 8, true).show();
                unVar2.getMessagesController().B3();
                return;
            case 2:
                fn fnVar2 = this.f40688b;
                fnVar2.getClass();
                un unVar3 = fnVar2.f37301a;
                new kg.i1((org.telegram.ui.ActionBar.k2) unVar3, 8, true).show();
                unVar3.getMessagesController().B3();
                return;
            case 3:
                fn fnVar3 = this.f40688b;
                fnVar3.getClass();
                un unVar4 = fnVar3.f37301a;
                new kg.i1((org.telegram.ui.ActionBar.k2) unVar4, 8, true).show();
                unVar4.getMessagesController().B3();
                return;
            case 4:
                this.f40688b.f37301a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                un unVar5 = this.f40688b.f37301a;
                unVar5.f42421t5 = null;
                unVar5.f42434u5 = null;
                return;
            case 6:
                this.f40688b.f37301a.Z.F0();
                return;
            case 7:
                this.f40688b.f37301a.Z.F0();
                return;
            case 8:
                un unVar6 = this.f40688b.f37301a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                unVar6.presentFragment(themeActivity);
                return;
            default:
                un unVar7 = this.f40688b.f37301a;
                unVar7.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) unVar7, 39, false));
                return;
        }
    }
}
