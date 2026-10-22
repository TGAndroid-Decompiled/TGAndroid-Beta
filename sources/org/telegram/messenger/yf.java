package org.telegram.messenger;

import java.util.ArrayList;
public final class yf implements Runnable {
    public final int f20158a;
    public final MessagesStorage f20159b;
    public final ArrayList f20160c;
    public final int d;

    public yf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f20158a = 1;
        this.f20159b = messagesStorage;
        this.f20160c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20158a) {
            case 0:
                this.f20159b.lambda$putWallpapers$78(this.d, this.f20160c);
                return;
            case 1:
                this.f20159b.lambda$unpinAllDialogsExceptNew$247(this.f20160c, this.d);
                return;
            case 2:
                this.f20159b.lambda$getDownloadQueue$185(this.d, this.f20160c);
                return;
            default:
                this.f20159b.lambda$putWidgetDialogs$166(this.d, this.f20160c);
                return;
        }
    }

    public yf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f20158a = i11;
        this.f20159b = messagesStorage;
        this.d = i10;
        this.f20160c = arrayList;
    }
}
