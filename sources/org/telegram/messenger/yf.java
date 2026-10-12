package org.telegram.messenger;

import java.util.ArrayList;
public final class yf implements Runnable {
    public final int f19678a;
    public final MessagesStorage f19679b;
    public final ArrayList f19680c;
    public final int d;

    public yf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19678a = 1;
        this.f19679b = messagesStorage;
        this.f19680c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19678a) {
            case 0:
                this.f19679b.lambda$putWallpapers$78(this.d, this.f19680c);
                return;
            case 1:
                this.f19679b.lambda$unpinAllDialogsExceptNew$247(this.f19680c, this.d);
                return;
            case 2:
                this.f19679b.lambda$getDownloadQueue$185(this.d, this.f19680c);
                return;
            default:
                this.f19679b.lambda$putWidgetDialogs$166(this.d, this.f19680c);
                return;
        }
    }

    public yf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19678a = i11;
        this.f19679b = messagesStorage;
        this.d = i10;
        this.f19680c = arrayList;
    }
}
