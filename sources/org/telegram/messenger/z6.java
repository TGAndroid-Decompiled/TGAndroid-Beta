package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z6 implements Runnable {
    public final int f17122a = 0;
    public final boolean f17123b;
    public final boolean f17124c;
    public final Object d;
    public final Object e;
    public final Object f17125f;
    public final Object h;
    public final Object f17126n;

    public z6(MediaController.MediaLoader mediaLoader, boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
        this.d = mediaLoader;
        this.f17123b = z10;
        this.e = photoSize;
        this.f17125f = messageObject;
        this.h = photo;
        this.f17124c = z11;
        this.f17126n = document;
    }

    @Override
    public final void run() {
        switch (this.f17122a) {
            case 0:
                ((MediaController.MediaLoader) this.d).lambda$processLivePhotoMessage$5(this.f17123b, (TLRPC.PhotoSize) this.e, (MessageObject) this.f17125f, (TLRPC.Photo) this.h, this.f17124c, (TLRPC.Document) this.f17126n);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$fillWithAnimatedEmoji$225((Integer) this.e, (ArrayList) this.f17125f, this.f17123b, this.f17124c, (ArrayList[]) this.h, (Runnable) this.f17126n);
                return;
            default:
                ((MessagesController) this.d).lambda$addUserToChat$302((MessagesController.ErrorDelegate) this.e, (TLRPC.TL_error) this.f17125f, (org.telegram.ui.ActionBar.p2) this.h, (TLObject) this.f17126n, this.f17123b, this.f17124c);
                return;
        }
    }

    public z6(MediaDataController mediaDataController, Integer num, ArrayList arrayList, boolean z10, boolean z11, ArrayList[] arrayListArr, Runnable runnable) {
        this.d = mediaDataController;
        this.e = num;
        this.f17125f = arrayList;
        this.f17123b = z10;
        this.f17124c = z11;
        this.h = arrayListArr;
        this.f17126n = runnable;
    }

    public z6(MessagesController messagesController, MessagesController.ErrorDelegate errorDelegate, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, TLObject tLObject, boolean z10, boolean z11) {
        this.d = messagesController;
        this.e = errorDelegate;
        this.f17125f = tL_error;
        this.h = p2Var;
        this.f17126n = tLObject;
        this.f17123b = z10;
        this.f17124c = z11;
    }
}
