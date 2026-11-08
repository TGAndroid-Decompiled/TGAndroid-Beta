package org.telegram.ui;
public final class iu implements org.telegram.messenger.sr {
    public final int f46745a;
    public final ww f46746b;

    public iu(ww wwVar, int i7) {
        this.f46745a = i7;
        this.f46746b = wwVar;
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        boolean z10;
        switch (this.f46745a) {
            case 0:
                ww wwVar = this.f46746b;
                wwVar.getClass();
                if (i7 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                wwVar.U1 = z9;
                org.telegram.messenger.qp.f1().edit().putBoolean("askAboutContacts", wwVar.U1).apply();
                wwVar.u3(false);
                return;
            default:
                ww wwVar2 = this.f46746b;
                wwVar2.getClass();
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wwVar2.U1 = z10;
                org.telegram.messenger.qp.f1().edit().putBoolean("askAboutContacts", wwVar2.U1).commit();
                wwVar2.u3(false);
                return;
        }
    }
}
