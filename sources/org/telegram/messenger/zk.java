package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f19794a;
    public final TopicsController f19795b;

    public zk(TopicsController topicsController, int i10) {
        this.f19794a = i10;
        this.f19795b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19794a) {
            case 0:
                this.f19795b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19795b.lambda$databaseCleared$25();
                return;
        }
    }
}
