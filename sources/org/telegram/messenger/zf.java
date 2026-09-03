package org.telegram.messenger;

import java.util.ArrayList;
public final class zf implements Runnable {
    public final int f19122a;
    public final MessagesStorage f19123b;
    public final ArrayList f19124c;
    public final int d;

    public zf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19122a = 1;
        this.f19123b = messagesStorage;
        this.f19124c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19122a) {
            case 0:
                this.f19123b.lambda$putWallpapers$78(this.d, this.f19124c);
                return;
            case 1:
                this.f19123b.lambda$unpinAllDialogsExceptNew$247(this.f19124c, this.d);
                return;
            case 2:
                this.f19123b.lambda$getDownloadQueue$185(this.d, this.f19124c);
                return;
            default:
                this.f19123b.lambda$putWidgetDialogs$166(this.d, this.f19124c);
                return;
        }
    }

    public zf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19122a = i11;
        this.f19123b = messagesStorage;
        this.d = i10;
        this.f19124c = arrayList;
    }
}
