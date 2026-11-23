package org.telegram.ui.Components;
public final class dl implements Runnable {
    public final int f34519a;
    public final ml f34520b;
    public final org.telegram.messenger.ya f34521c;

    public dl(ml mlVar, org.telegram.messenger.ya yaVar, int i7) {
        this.f34519a = i7;
        this.f34520b = mlVar;
        this.f34521c = yaVar;
    }

    @Override
    public final void run() {
        switch (this.f34519a) {
            case 0:
                org.telegram.messenger.ya yaVar = this.f34521c;
                try {
                    ((a8.r7) yaVar).y();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new dl(this.f34520b, yaVar, 1));
                return;
            default:
                ml.S(this.f34520b, this.f34521c);
                return;
        }
    }
}
