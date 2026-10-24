package org.telegram.messenger;

import java.util.ArrayList;
public final class yf implements Runnable {
    public final int f20227a;
    public final MessagesStorage f20228b;
    public final ArrayList f20229c;
    public final int d;

    public yf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f20227a = 1;
        this.f20228b = messagesStorage;
        this.f20229c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20227a) {
            case 0:
                this.f20228b.lambda$putWallpapers$78(this.d, this.f20229c);
                return;
            case 1:
                this.f20228b.lambda$unpinAllDialogsExceptNew$247(this.f20229c, this.d);
                return;
            case 2:
                this.f20228b.lambda$getDownloadQueue$185(this.d, this.f20229c);
                return;
            default:
                this.f20228b.lambda$putWidgetDialogs$166(this.d, this.f20229c);
                return;
        }
    }

    public yf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f20227a = i11;
        this.f20228b = messagesStorage;
        this.d = i10;
        this.f20229c = arrayList;
    }
}
