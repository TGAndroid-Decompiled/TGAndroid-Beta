package org.telegram.ui;
public final class lu implements org.telegram.messenger.sr {
    public final int f47693a;
    public final zw f47694b;

    public lu(zw zwVar, int i7) {
        this.f47693a = i7;
        this.f47694b = zwVar;
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        boolean z10;
        switch (this.f47693a) {
            case 0:
                zw zwVar = this.f47694b;
                zwVar.getClass();
                if (i7 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zwVar.V1 = z9;
                org.telegram.messenger.qp.f1().edit().putBoolean("askAboutContacts", zwVar.V1).apply();
                zwVar.u3(false);
                return;
            default:
                zw zwVar2 = this.f47694b;
                zwVar2.getClass();
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zwVar2.V1 = z10;
                org.telegram.messenger.qp.f1().edit().putBoolean("askAboutContacts", zwVar2.V1).commit();
                zwVar2.u3(false);
                return;
        }
    }
}
