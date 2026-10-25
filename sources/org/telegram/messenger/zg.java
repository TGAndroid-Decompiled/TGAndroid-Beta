package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f22001a;
    public final NotificationsController f22002b;

    public zg(NotificationsController notificationsController, int i10) {
        this.f22001a = i10;
        this.f22002b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f22001a) {
            case 0:
                this.f22002b.lambda$playInChatSound$41();
                return;
            case 1:
                this.f22002b.lambda$cleanup$3();
                return;
            case 2:
                this.f22002b.lambda$hideNotifications$37();
                return;
            case 3:
                this.f22002b.lambda$repeatNotificationMaybe$42();
                return;
            case 4:
                this.f22002b.lambda$processIgnoreStories$18();
                return;
            case 5:
                this.f22002b.lambda$updateBadge$35();
                return;
            case 6:
                this.f22002b.lambda$deleteAllNotificationChannels$45();
                return;
            case 7:
                this.f22002b.lambda$playOutChatSound$50();
                return;
            case 8:
                this.f22002b.checkStoryPushes();
                return;
            case 9:
                this.f22002b.lambda$new$0();
                return;
            case 10:
                this.f22002b.lambda$new$1();
                return;
            case 11:
                this.f22002b.lambda$showNotifications$36();
                return;
            case 12:
                this.f22002b.lambda$forceShowPopupForReply$8();
                return;
            default:
                this.f22002b.lambda$processIgnoreStoryReactions$19();
                return;
        }
    }
}
