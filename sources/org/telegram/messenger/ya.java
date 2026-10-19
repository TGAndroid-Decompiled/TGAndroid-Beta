package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ya implements Runnable {
    public final int f20142a;
    public final MessagesController f20143b;
    public final int f20144c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f20145f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f20146n;

    public ya(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f20142a = i11;
        this.f20143b = messagesController;
        this.f20144c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f20145f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f20146n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f20142a) {
            case 0:
                this.f20143b.lambda$loadPinnedDialogs$365(this.f20144c, this.d, this.e, this.f20145f, this.h, this.f20146n);
                return;
            default:
                this.f20143b.lambda$loadPinnedDialogs$364(this.f20144c, this.d, this.e, this.f20145f, this.h, this.f20146n);
                return;
        }
    }
}
