package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zb implements Runnable {
    public final int f19133a;
    public final MessagesController f19134b;
    public final int f19135c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f19136f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f19137n;

    public zb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z4, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f19133a = i11;
        this.f19134b = messagesController;
        this.f19135c = i10;
        this.d = arrayList;
        this.e = z4;
        this.f19136f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f19137n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f19133a) {
            case 0:
                this.f19134b.lambda$loadPinnedDialogs$366(this.f19135c, this.d, this.e, this.f19136f, this.h, this.f19137n);
                return;
            default:
                this.f19134b.lambda$loadPinnedDialogs$365(this.f19135c, this.d, this.e, this.f19136f, this.h, this.f19137n);
                return;
        }
    }
}
