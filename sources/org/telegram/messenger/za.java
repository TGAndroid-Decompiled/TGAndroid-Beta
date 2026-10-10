package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f19988a;
    public final MessagesController f19989b;
    public final int f19990c;
    public final ArrayList d;
    public final boolean f19991e;
    public final TLRPC.TL_messages_peerDialogs f19992f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f19993n;

    public za(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f19988a = i11;
        this.f19989b = messagesController;
        this.f19990c = i10;
        this.d = arrayList;
        this.f19991e = z10;
        this.f19992f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f19993n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f19988a) {
            case 0:
                this.f19989b.lambda$loadPinnedDialogs$365(this.f19990c, this.d, this.f19991e, this.f19992f, this.h, this.f19993n);
                return;
            default:
                this.f19989b.lambda$loadPinnedDialogs$364(this.f19990c, this.d, this.f19991e, this.f19992f, this.h, this.f19993n);
                return;
        }
    }
}
