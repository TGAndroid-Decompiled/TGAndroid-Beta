package org.telegram.ui;
public final class ku implements org.telegram.messenger.pr {
    public final int f48772a;
    public final yw f48773b;

    public ku(yw ywVar, int i7) {
        this.f48772a = i7;
        this.f48773b = ywVar;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        boolean z11;
        switch (this.f48772a) {
            case 0:
                yw ywVar = this.f48773b;
                ywVar.getClass();
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ywVar.W1 = z10;
                org.telegram.messenger.np.f1().edit().putBoolean("askAboutContacts", ywVar.W1).apply();
                ywVar.u3(false);
                return;
            default:
                yw ywVar2 = this.f48773b;
                ywVar2.getClass();
                if (i7 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ywVar2.W1 = z11;
                org.telegram.messenger.np.f1().edit().putBoolean("askAboutContacts", ywVar2.W1).commit();
                ywVar2.u3(false);
                return;
        }
    }
}
