package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f20217a;
    public final MessagesController f20218b;
    public final int f20219c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f20220f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f20221n;

    public za(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f20217a = i11;
        this.f20218b = messagesController;
        this.f20219c = i10;
        this.d = arrayList;
        this.e = z10;
        this.f20220f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f20221n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f20217a) {
            case 0:
                this.f20218b.lambda$loadPinnedDialogs$365(this.f20219c, this.d, this.e, this.f20220f, this.h, this.f20221n);
                return;
            default:
                this.f20218b.lambda$loadPinnedDialogs$364(this.f20219c, this.d, this.e, this.f20220f, this.h, this.f20221n);
                return;
        }
    }
}
