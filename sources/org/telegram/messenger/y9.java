package org.telegram.messenger;
public final class y9 implements Runnable {
    public final int f21898a;
    public final MessagesController f21899b;

    public y9(MessagesController messagesController, int i10) {
        this.f21898a = i10;
        this.f21899b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f21898a) {
            case 0:
                this.f21899b.lambda$registerForPush$324();
                return;
            case 1:
                this.f21899b.lambda$processUpdateArray$415();
                return;
            case 2:
                this.f21899b.lambda$processUpdateArray$416();
                return;
            case 3:
                this.f21899b.lambda$processUpdateArray$417();
                return;
            case 4:
                this.f21899b.lambda$updateTimerProc$157();
                return;
            case 5:
                this.f21899b.lambda$updateTimerProc$160();
                return;
            case 6:
                this.f21899b.lambda$applyAppConfig$35();
                return;
            case 7:
                this.f21899b.lambda$applyAppConfig$36();
                return;
            case 8:
                this.f21899b.lambda$loadRemoteFilters$26();
                return;
            case 9:
                this.f21899b.lambda$loadRemoteFilters$27();
                return;
            case 10:
                this.f21899b.lambda$loadRemoteFilters$28();
                return;
            case 11:
                this.f21899b.lambda$loadRemoteFilters$29();
                return;
            case 12:
                this.f21899b.lambda$migrateDialogs$214();
                return;
            case 13:
                this.f21899b.lambda$processUpdates$385();
                return;
            case 14:
                this.f21899b.lambda$migrateDialogs$212();
                return;
            case 15:
                this.f21899b.lambda$cleanup$51();
                return;
            case 16:
                this.f21899b.lambda$cleanup$52();
                return;
            case 17:
                this.f21899b.lambda$cleanup$53();
                return;
            case 18:
                this.f21899b.lambda$processLoadedDeleteTask$86();
                return;
            case 19:
                this.f21899b.lambda$didReceivedNotification$41();
                return;
            case 20:
                this.f21899b.lambda$scheduleTranscriptionUpdate$37();
                return;
            case 21:
                this.f21899b.lambda$toggleChannelForum$284();
                return;
            case 22:
                this.f21899b.lambda$toggleChannelSignatures$282();
                return;
            case 23:
                this.f21899b.lambda$addWebBrowserException$518();
                return;
            case 24:
                this.f21899b.lambda$updateEmojiStatusUntil$480();
                return;
            case 25:
                this.f21899b.lambda$checkPromoInfoInternal$165();
                return;
            case 26:
                this.f21899b.lambda$markAllTopicsAsRead$5();
                return;
            case 27:
                this.f21899b.lambda$hidePromoDialog$135();
                return;
            case 28:
                this.f21899b.lambda$putUsers$56();
                return;
            default:
                this.f21899b.removePromoDialog();
                return;
        }
    }
}
