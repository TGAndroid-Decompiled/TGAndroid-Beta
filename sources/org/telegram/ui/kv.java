package org.telegram.ui;
public final class kv implements org.telegram.messenger.cs {
    public final int f39006a;
    public final zx f39007b;

    public kv(zx zxVar, int i10) {
        this.f39006a = i10;
        this.f39007b = zxVar;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f39006a) {
            case 0:
                zx zxVar = this.f39007b;
                zxVar.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zxVar.U1 = z10;
                org.telegram.messenger.wp.e1().edit().putBoolean("askAboutContacts", zxVar.U1).apply();
                zxVar.u3(false);
                return;
            default:
                zx zxVar2 = this.f39007b;
                zxVar2.getClass();
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zxVar2.U1 = z11;
                org.telegram.messenger.wp.e1().edit().putBoolean("askAboutContacts", zxVar2.U1).commit();
                zxVar2.u3(false);
                return;
        }
    }
}
