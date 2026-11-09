package org.telegram.ui;
public final class ku implements org.telegram.messenger.sr {
    public final int f47369a;
    public final yw f47370b;

    public ku(yw ywVar, int i7) {
        this.f47369a = i7;
        this.f47370b = ywVar;
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        boolean z10;
        switch (this.f47369a) {
            case 0:
                yw ywVar = this.f47370b;
                ywVar.getClass();
                if (i7 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ywVar.V1 = z9;
                org.telegram.messenger.qp.f1().edit().putBoolean("askAboutContacts", ywVar.V1).apply();
                ywVar.u3(false);
                return;
            default:
                yw ywVar2 = this.f47370b;
                ywVar2.getClass();
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ywVar2.V1 = z10;
                org.telegram.messenger.qp.f1().edit().putBoolean("askAboutContacts", ywVar2.V1).commit();
                ywVar2.u3(false);
                return;
        }
    }
}
