package org.telegram.messenger;
public final class za implements Runnable {
    public final int f20233a;
    public final MessagesController f20234b;
    public final a0.h f20235c;

    public za(MessagesController messagesController, a0.h hVar, int i10) {
        this.f20233a = i10;
        this.f20234b = messagesController;
        this.f20235c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f20233a) {
            case 0:
                this.f20234b.lambda$processUpdateArray$409(this.f20235c);
                return;
            case 1:
                this.f20234b.lambda$processUpdateArray$410(this.f20235c);
                return;
            default:
                this.f20234b.lambda$getChannelDifference$339(this.f20235c);
                return;
        }
    }
}
