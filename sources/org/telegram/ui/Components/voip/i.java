package org.telegram.ui.Components.voip;
public final class i implements Runnable {
    public final int f39194a;
    public final k f39195b;

    public i(k kVar, int i7) {
        this.f39194a = i7;
        this.f39195b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f39194a) {
            case 0:
                k kVar = this.f39195b;
                kVar.f39233x = false;
                kVar.c();
                return;
            default:
                this.f39195b.f39224a.setVisibility(4);
                return;
        }
    }
}
