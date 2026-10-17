package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ya implements Runnable {
    public final int f20140a;
    public final MessagesController f20141b;
    public final int f20142c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f20143f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f20144n;

    public ya(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f20140a = i11;
        this.f20141b = messagesController;
        this.f20142c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f20143f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f20144n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f20140a) {
            case 0:
                this.f20141b.lambda$loadPinnedDialogs$365(this.f20142c, this.d, this.e, this.f20143f, this.h, this.f20144n);
                return;
            default:
                this.f20141b.lambda$loadPinnedDialogs$364(this.f20142c, this.d, this.e, this.f20143f, this.h, this.f20144n);
                return;
        }
    }
}
