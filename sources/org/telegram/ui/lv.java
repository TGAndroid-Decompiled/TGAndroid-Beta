package org.telegram.ui;
public final class lv implements org.telegram.messenger.bs {
    public final int f39416a;
    public final ay f39417b;

    public lv(ay ayVar, int i10) {
        this.f39416a = i10;
        this.f39417b = ayVar;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f39416a) {
            case 0:
                ay ayVar = this.f39417b;
                ayVar.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ayVar.U1 = z10;
                org.telegram.messenger.vp.e1().edit().putBoolean("askAboutContacts", ayVar.U1).apply();
                ayVar.t3(false);
                return;
            default:
                ay ayVar2 = this.f39417b;
                ayVar2.getClass();
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ayVar2.U1 = z11;
                org.telegram.messenger.vp.e1().edit().putBoolean("askAboutContacts", ayVar2.U1).commit();
                ayVar2.t3(false);
                return;
        }
    }
}
