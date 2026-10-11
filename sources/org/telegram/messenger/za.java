package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class za implements Runnable {
    public final int f19985a;
    public final MessagesController f19986b;
    public final int f19987c;
    public final ArrayList d;
    public final boolean f19988e;
    public final TLRPC.TL_messages_peerDialogs f19989f;
    public final a0.i h;
    public final TLRPC.TL_messages_dialogs f19990n;

    public za(MessagesController messagesController, int i10, ArrayList arrayList, boolean z10, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.i iVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f19985a = i11;
        this.f19986b = messagesController;
        this.f19987c = i10;
        this.d = arrayList;
        this.f19988e = z10;
        this.f19989f = tL_messages_peerDialogs;
        this.h = iVar;
        this.f19990n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f19985a) {
            case 0:
                this.f19986b.lambda$loadPinnedDialogs$365(this.f19987c, this.d, this.f19988e, this.f19989f, this.h, this.f19990n);
                return;
            default:
                this.f19986b.lambda$loadPinnedDialogs$364(this.f19987c, this.d, this.f19988e, this.f19989f, this.h, this.f19990n);
                return;
        }
    }
}
