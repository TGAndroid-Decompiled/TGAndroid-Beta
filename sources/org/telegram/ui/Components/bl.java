package org.telegram.ui.Components;
public final class bl implements Runnable {
    public final int f33762a;
    public final kl f33763b;
    public final org.telegram.messenger.xa f33764c;

    public bl(kl klVar, org.telegram.messenger.xa xaVar, int i7) {
        this.f33762a = i7;
        this.f33763b = klVar;
        this.f33764c = xaVar;
    }

    @Override
    public final void run() {
        switch (this.f33762a) {
            case 0:
                org.telegram.messenger.xa xaVar = this.f33764c;
                try {
                    ((a8.r7) xaVar).B();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new bl(this.f33763b, xaVar, 1));
                return;
            default:
                kl.S(this.f33763b, this.f33764c);
                return;
        }
    }
}
