package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yb implements Runnable {
    public final int f22252a;
    public final MessagesController f22253b;
    public final int f22254c;
    public final ArrayList d;
    public final boolean f22255e;
    public final TLRPC.TL_messages_peerDialogs f22256f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f22257n;

    public yb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f22252a = i11;
        this.f22253b = messagesController;
        this.f22254c = i10;
        this.d = arrayList;
        this.f22255e = z10;
        this.f22256f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f22257n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f22252a) {
            case 0:
                this.f22253b.lambda$loadPinnedDialogs$366(this.f22254c, this.d, this.f22255e, this.f22256f, this.h, this.f22257n);
                return;
            default:
                this.f22253b.lambda$loadPinnedDialogs$365(this.f22254c, this.d, this.f22255e, this.f22256f, this.h, this.f22257n);
                return;
        }
    }
}
