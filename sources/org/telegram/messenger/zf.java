package org.telegram.messenger;

import java.util.ArrayList;
public final class zf implements Runnable {
    public final int f20803a;
    public final MessagesStorage f20804b;
    public final ArrayList f20805c;
    public final int d;

    public zf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f20803a = 1;
        this.f20804b = messagesStorage;
        this.f20805c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20803a) {
            case 0:
                this.f20804b.lambda$putWallpapers$78(this.d, this.f20805c);
                return;
            case 1:
                this.f20804b.lambda$unpinAllDialogsExceptNew$247(this.f20805c, this.d);
                return;
            case 2:
                this.f20804b.lambda$getDownloadQueue$185(this.d, this.f20805c);
                return;
            default:
                this.f20804b.lambda$putWidgetDialogs$166(this.d, this.f20805c);
                return;
        }
    }

    public zf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f20803a = i11;
        this.f20804b = messagesStorage;
        this.d = i10;
        this.f20805c = arrayList;
    }
}
