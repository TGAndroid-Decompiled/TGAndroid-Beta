package org.telegram.messenger;

import java.util.ArrayList;
public final class yf implements Runnable {
    public final int f19099a;
    public final MessagesStorage f19100b;
    public final ArrayList f19101c;
    public final int d;

    public yf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19099a = 1;
        this.f19100b = messagesStorage;
        this.f19101c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19099a) {
            case 0:
                this.f19100b.lambda$putWallpapers$78(this.d, this.f19101c);
                return;
            case 1:
                this.f19100b.lambda$unpinAllDialogsExceptNew$247(this.f19101c, this.d);
                return;
            case 2:
                this.f19100b.lambda$getDownloadQueue$185(this.d, this.f19101c);
                return;
            default:
                this.f19100b.lambda$putWidgetDialogs$166(this.d, this.f19101c);
                return;
        }
    }

    public yf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19099a = i11;
        this.f19100b = messagesStorage;
        this.d = i10;
        this.f19101c = arrayList;
    }
}
