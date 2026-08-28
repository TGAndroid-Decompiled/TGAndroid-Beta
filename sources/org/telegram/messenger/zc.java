package org.telegram.messenger;
public final class zc implements Runnable {
    public final int f22330a;
    public final MessagesController f22331b;

    public zc(MessagesController messagesController, int i9) {
        this.f22330a = i9;
        this.f22331b = messagesController;
    }

    @Override
    public final void run() {
        switch (this.f22330a) {
            case 0:
                this.f22331b.lambda$processLoadedDeleteTask$87();
                return;
            case 1:
                this.f22331b.lambda$markAllTopicsAsRead$5();
                return;
            case 2:
                this.f22331b.lambda$hidePromoDialog$136();
                return;
            case 3:
                this.f22331b.removePromoDialog();
                return;
            case 4:
                this.f22331b.lambda$putUsers$57();
                return;
            case 5:
                this.f22331b.lambda$didReceivedNotification$42();
                return;
            case 6:
                this.f22331b.lambda$addWebBrowserException$512();
                return;
            case 7:
                this.f22331b.lambda$markAllTopicsAsRead$6();
                return;
            case 8:
                this.f22331b.lambda$removeWebBrowserException$514();
                return;
            case 9:
                this.f22331b.lambda$new$13();
                return;
            case 10:
                this.f22331b.loadAppConfig();
                return;
            case 11:
                this.f22331b.lambda$new$17();
                return;
            default:
                this.f22331b.lambda$new$0();
                return;
        }
    }
}
