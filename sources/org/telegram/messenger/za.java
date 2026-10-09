package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f19984a;
    public final MessagesController f19985b;
    public final int f19986c;
    public final ArrayList d;
    public final boolean f19987e;
    public final TLRPC.TL_messages_peerDialogs f19988f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f19989n;

    public za(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f19984a = i11;
        this.f19985b = messagesController;
        this.f19986c = i10;
        this.d = arrayList;
        this.f19987e = z10;
        this.f19988f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f19989n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f19984a) {
            case 0:
                this.f19985b.lambda$loadPinnedDialogs$365(this.f19986c, this.d, this.f19987e, this.f19988f, this.h, this.f19989n);
                return;
            default:
                this.f19985b.lambda$loadPinnedDialogs$364(this.f19986c, this.d, this.f19987e, this.f19988f, this.h, this.f19989n);
                return;
        }
    }
}
