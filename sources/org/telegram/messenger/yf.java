package org.telegram.messenger;

import java.util.ArrayList;
public final class yf implements Runnable {
    public final int f18800a;
    public final MessagesStorage f18801b;
    public final ArrayList f18802c;
    public final int d;

    public yf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f18800a = 1;
        this.f18801b = messagesStorage;
        this.f18802c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18800a) {
            case 0:
                this.f18801b.lambda$putWallpapers$78(this.d, this.f18802c);
                return;
            case 1:
                this.f18801b.lambda$unpinAllDialogsExceptNew$247(this.f18802c, this.d);
                return;
            case 2:
                this.f18801b.lambda$getDownloadQueue$185(this.d, this.f18802c);
                return;
            default:
                this.f18801b.lambda$putWidgetDialogs$166(this.d, this.f18802c);
                return;
        }
    }

    public yf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f18800a = i11;
        this.f18801b = messagesStorage;
        this.d = i10;
        this.f18802c = arrayList;
    }
}
