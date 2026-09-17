package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f19877a;
    public final NotificationsController f19878b;
    public final int f19879c;

    public zg(NotificationsController notificationsController, int i10, int i11) {
        this.f19877a = i11;
        this.f19878b = notificationsController;
        this.f19879c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19877a) {
            case 0:
                this.f19878b.lambda$processDialogsUpdateRead$29(this.f19879c);
                return;
            case 1:
                this.f19878b.lambda$removeDeletedHisoryFromNotifications$12(this.f19879c);
                return;
            case 2:
                this.f19878b.lambda$processSeenStoryReactions$14(this.f19879c);
                return;
            case 3:
                this.f19878b.lambda$processNewMessages$24(this.f19879c);
                return;
            case 4:
                this.f19878b.lambda$processNewMessages$26(this.f19879c);
                return;
            case 5:
                this.f19878b.lambda$setLastOnlineFromOtherDevice$5(this.f19879c);
                return;
            case 6:
                this.f19878b.lambda$processLoadedUnreadMessages$32(this.f19879c);
                return;
            default:
                this.f19878b.lambda$removeDeletedMessagesFromNotifications$9(this.f19879c);
                return;
        }
    }
}
