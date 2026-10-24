package org.telegram.messenger;
public final class yg implements Runnable {
    public final int f20230a;
    public final NotificationsController f20231b;

    public yg(NotificationsController notificationsController, int i10) {
        this.f20230a = i10;
        this.f20231b = notificationsController;
    }

    @Override
    public final void run() {
        switch (this.f20230a) {
            case 0:
                this.f20231b.lambda$playInChatSound$41();
                return;
            case 1:
                this.f20231b.lambda$cleanup$3();
                return;
            case 2:
                this.f20231b.lambda$hideNotifications$37();
                return;
            case 3:
                this.f20231b.lambda$repeatNotificationMaybe$42();
                return;
            case 4:
                this.f20231b.lambda$processIgnoreStories$18();
                return;
            case 5:
                this.f20231b.lambda$updateBadge$35();
                return;
            case 6:
                this.f20231b.lambda$deleteAllNotificationChannels$45();
                return;
            case 7:
                this.f20231b.lambda$playOutChatSound$50();
                return;
            case 8:
                this.f20231b.checkStoryPushes();
                return;
            case 9:
                this.f20231b.lambda$new$0();
                return;
            case 10:
                this.f20231b.lambda$new$1();
                return;
            case 11:
                this.f20231b.lambda$showNotifications$36();
                return;
            case 12:
                this.f20231b.lambda$forceShowPopupForReply$8();
                return;
            default:
                this.f20231b.lambda$processIgnoreStoryReactions$19();
                return;
        }
    }
}
