package org.telegram.messenger;

import java.util.ArrayList;
public final class zf implements Runnable {
    public final int f20805a;
    public final MessagesStorage f20806b;
    public final ArrayList f20807c;
    public final int d;

    public zf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f20805a = 1;
        this.f20806b = messagesStorage;
        this.f20807c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20805a) {
            case 0:
                this.f20806b.lambda$putWallpapers$78(this.d, this.f20807c);
                return;
            case 1:
                this.f20806b.lambda$unpinAllDialogsExceptNew$247(this.f20807c, this.d);
                return;
            case 2:
                this.f20806b.lambda$getDownloadQueue$185(this.d, this.f20807c);
                return;
            default:
                this.f20806b.lambda$putWidgetDialogs$166(this.d, this.f20807c);
                return;
        }
    }

    public zf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f20805a = i11;
        this.f20806b = messagesStorage;
        this.d = i10;
        this.f20807c = arrayList;
    }
}
