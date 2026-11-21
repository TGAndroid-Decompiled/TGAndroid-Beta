package org.telegram.ui.Components;
public final class dl implements Runnable {
    public final int f34524a;
    public final ml f34525b;
    public final org.telegram.messenger.xa f34526c;

    public dl(ml mlVar, org.telegram.messenger.xa xaVar, int i7) {
        this.f34524a = i7;
        this.f34525b = mlVar;
        this.f34526c = xaVar;
    }

    @Override
    public final void run() {
        switch (this.f34524a) {
            case 0:
                org.telegram.messenger.xa xaVar = this.f34526c;
                try {
                    ((a8.r7) xaVar).y();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new dl(this.f34525b, xaVar, 1));
                return;
            default:
                ml.S(this.f34525b, this.f34526c);
                return;
        }
    }
}
