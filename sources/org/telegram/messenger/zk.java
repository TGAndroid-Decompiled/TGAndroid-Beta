package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f19793a;
    public final TopicsController f19794b;

    public zk(TopicsController topicsController, int i10) {
        this.f19793a = i10;
        this.f19794b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19793a) {
            case 0:
                this.f19794b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19794b.lambda$databaseCleared$25();
                return;
        }
    }
}
