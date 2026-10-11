package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f20021a;
    public final MessagesController f20022b;
    public final int f20023c;
    public final ArrayList d;
    public final boolean f20024e;
    public final TLRPC.TL_messages_peerDialogs f20025f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f20026n;

    public za(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f20021a = i11;
        this.f20022b = messagesController;
        this.f20023c = i10;
        this.d = arrayList;
        this.f20024e = z10;
        this.f20025f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f20026n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f20021a) {
            case 0:
                this.f20022b.lambda$loadPinnedDialogs$365(this.f20023c, this.d, this.f20024e, this.f20025f, this.h, this.f20026n);
                return;
            default:
                this.f20022b.lambda$loadPinnedDialogs$364(this.f20023c, this.d, this.f20024e, this.f20025f, this.h, this.f20026n);
                return;
        }
    }
}
