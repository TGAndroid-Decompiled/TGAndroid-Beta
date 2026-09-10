package org.telegram.messenger;
public final class za implements Runnable {
    public final int f17141a;
    public final Runnable f17142b;

    public za(int i10, Runnable runnable) {
        this.f17141a = i10;
        this.f17142b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17141a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f17142b);
                return;
            case 1:
                this.f17142b.run();
                return;
            default:
                AndroidUtilities.runOnUIThread(this.f17142b);
                return;
        }
    }
}
