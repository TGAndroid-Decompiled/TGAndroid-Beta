package org.telegram.ui;
public final class gu implements org.telegram.messenger.kr {
    public final int f45717a;
    public final uw f45718b;

    public gu(uw uwVar, int i3) {
        this.f45717a = i3;
        this.f45718b = uwVar;
    }

    @Override
    public final void a(int i3) {
        boolean z10;
        boolean z11;
        switch (this.f45717a) {
            case 0:
                uw uwVar = this.f45718b;
                uwVar.getClass();
                if (i3 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                uwVar.V1 = z10;
                org.telegram.messenger.hp.f1().edit().putBoolean("askAboutContacts", uwVar.V1).apply();
                uwVar.u3(false);
                return;
            default:
                uw uwVar2 = this.f45718b;
                uwVar2.getClass();
                if (i3 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                uwVar2.V1 = z11;
                org.telegram.messenger.hp.f1().edit().putBoolean("askAboutContacts", uwVar2.V1).commit();
                uwVar2.u3(false);
                return;
        }
    }
}
