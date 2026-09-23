package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f18066a;
    public final NotificationsController f18067b;
    public final int f18068c;

    public zg(NotificationsController notificationsController, int i10, int i11) {
        this.f18066a = i11;
        this.f18067b = notificationsController;
        this.f18068c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18066a) {
            case 0:
                this.f18067b.lambda$processDialogsUpdateRead$29(this.f18068c);
                return;
            case 1:
                this.f18067b.lambda$removeDeletedHisoryFromNotifications$12(this.f18068c);
                return;
            case 2:
                this.f18067b.lambda$processSeenStoryReactions$14(this.f18068c);
                return;
            case 3:
                this.f18067b.lambda$processNewMessages$24(this.f18068c);
                return;
            case 4:
                this.f18067b.lambda$processNewMessages$26(this.f18068c);
                return;
            case 5:
                this.f18067b.lambda$setLastOnlineFromOtherDevice$5(this.f18068c);
                return;
            case 6:
                this.f18067b.lambda$processLoadedUnreadMessages$32(this.f18068c);
                return;
            default:
                this.f18067b.lambda$removeDeletedMessagesFromNotifications$9(this.f18068c);
                return;
        }
    }
}
