package org.telegram.messenger;
public final class yk implements Runnable {
    public final int f19694a;
    public final TopicsController f19695b;
    public final long f19696c;

    public yk(TopicsController topicsController, long j3, int i10) {
        this.f19694a = i10;
        this.f19695b = topicsController;
        this.f19696c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19694a) {
            case 0:
                this.f19695b.lambda$loadTopics$6(this.f19696c);
                return;
            default:
                this.f19695b.lambda$processTopics$8(this.f19696c);
                return;
        }
    }
}
