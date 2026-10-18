package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ya implements Runnable {
    public final int f20148a;
    public final MessagesController f20149b;
    public final int f20150c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f20151f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f20152n;

    public ya(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f20148a = i11;
        this.f20149b = messagesController;
        this.f20150c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f20151f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f20152n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f20148a) {
            case 0:
                this.f20149b.lambda$loadPinnedDialogs$365(this.f20150c, this.d, this.e, this.f20151f, this.h, this.f20152n);
                return;
            default:
                this.f20149b.lambda$loadPinnedDialogs$364(this.f20150c, this.d, this.e, this.f20151f, this.h, this.f20152n);
                return;
        }
    }
}
