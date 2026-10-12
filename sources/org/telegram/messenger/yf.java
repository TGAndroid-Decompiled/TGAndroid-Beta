package org.telegram.messenger;

import java.util.ArrayList;
public final class yf implements Runnable {
    public final int f19677a;
    public final MessagesStorage f19678b;
    public final ArrayList f19679c;
    public final int d;

    public yf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19677a = 1;
        this.f19678b = messagesStorage;
        this.f19679c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19677a) {
            case 0:
                this.f19678b.lambda$putWallpapers$78(this.d, this.f19679c);
                return;
            case 1:
                this.f19678b.lambda$unpinAllDialogsExceptNew$247(this.f19679c, this.d);
                return;
            case 2:
                this.f19678b.lambda$getDownloadQueue$185(this.d, this.f19679c);
                return;
            default:
                this.f19678b.lambda$putWidgetDialogs$166(this.d, this.f19679c);
                return;
        }
    }

    public yf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19677a = i11;
        this.f19678b = messagesStorage;
        this.d = i10;
        this.f19679c = arrayList;
    }
}
