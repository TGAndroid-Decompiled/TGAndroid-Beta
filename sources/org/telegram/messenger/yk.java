package org.telegram.messenger;
public final class yk implements Runnable {
    public final int f19693a;
    public final TopicsController f19694b;
    public final long f19695c;

    public yk(TopicsController topicsController, long j3, int i10) {
        this.f19693a = i10;
        this.f19694b = topicsController;
        this.f19695c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19693a) {
            case 0:
                this.f19694b.lambda$loadTopics$6(this.f19695c);
                return;
            default:
                this.f19694b.lambda$processTopics$8(this.f19695c);
                return;
        }
    }
}
