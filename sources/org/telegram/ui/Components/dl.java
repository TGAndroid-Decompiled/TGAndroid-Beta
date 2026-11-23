package org.telegram.ui.Components;
public final class dl implements Runnable {
    public final int f34481a;
    public final ml f34482b;
    public final org.telegram.messenger.ya f34483c;

    public dl(ml mlVar, org.telegram.messenger.ya yaVar, int i7) {
        this.f34481a = i7;
        this.f34482b = mlVar;
        this.f34483c = yaVar;
    }

    @Override
    public final void run() {
        switch (this.f34481a) {
            case 0:
                org.telegram.messenger.ya yaVar = this.f34483c;
                try {
                    ((a8.r7) yaVar).y();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new dl(this.f34482b, yaVar, 1));
                return;
            default:
                ml.S(this.f34482b, this.f34483c);
                return;
        }
    }
}
