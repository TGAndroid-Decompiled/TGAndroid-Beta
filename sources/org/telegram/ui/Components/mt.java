package org.telegram.ui.Components;

public final class mt implements Runnable {

    public final int f30746a;

    public final nt f30747b;

    public mt(nt ntVar, int i10) {
        this.f30746a = i10;
        this.f30747b = ntVar;
    }

    @Override
    public final void run() {
        switch (this.f30746a) {
            case 0:
                nt ntVar = this.f30747b;
                ntVar.post(new mt(ntVar, 1));
                break;
            case 1:
                nt ntVar2 = this.f30747b;
                ntVar2.invalidateSpoilers();
                ntVar2.b();
                break;
            case 2:
                nt.a(this.f30747b);
                break;
            case 3:
                nt ntVar3 = this.f30747b;
                ntVar3.post(new mt(ntVar3, 4));
                break;
            default:
                this.f30747b.setSpoilersRevealed(false, true);
                break;
        }
    }
}
