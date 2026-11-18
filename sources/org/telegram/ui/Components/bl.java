package org.telegram.ui.Components;
public final class bl implements Runnable {
    public final int f33709a;
    public final kl f33710b;
    public final org.telegram.messenger.xa f33711c;

    public bl(kl klVar, org.telegram.messenger.xa xaVar, int i7) {
        this.f33709a = i7;
        this.f33710b = klVar;
        this.f33711c = xaVar;
    }

    @Override
    public final void run() {
        switch (this.f33709a) {
            case 0:
                org.telegram.messenger.xa xaVar = this.f33711c;
                try {
                    ((a8.r7) xaVar).y();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new bl(this.f33710b, xaVar, 1));
                return;
            default:
                kl.S(this.f33710b, this.f33711c);
                return;
        }
    }
}
