package org.telegram.messenger;

import java.util.ArrayList;
public final class zf implements Runnable {
    public final int f19147a;
    public final MessagesStorage f19148b;
    public final ArrayList f19149c;
    public final int d;

    public zf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19147a = 1;
        this.f19148b = messagesStorage;
        this.f19149c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19147a) {
            case 0:
                this.f19148b.lambda$putWallpapers$78(this.d, this.f19149c);
                return;
            case 1:
                this.f19148b.lambda$unpinAllDialogsExceptNew$247(this.f19149c, this.d);
                return;
            case 2:
                this.f19148b.lambda$getDownloadQueue$185(this.d, this.f19149c);
                return;
            default:
                this.f19148b.lambda$putWidgetDialogs$166(this.d, this.f19149c);
                return;
        }
    }

    public zf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19147a = i11;
        this.f19148b = messagesStorage;
        this.d = i10;
        this.f19149c = arrayList;
    }
}
