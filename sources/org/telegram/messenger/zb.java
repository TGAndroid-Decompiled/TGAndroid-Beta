package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zb implements Runnable {
    public final int f20788a;
    public final MessagesController f20789b;
    public final int f20790c;
    public final ArrayList d;
    public final boolean f20791e;
    public final TLRPC.TL_messages_peerDialogs f20792f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f20793n;

    public zb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z4, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f20788a = i11;
        this.f20789b = messagesController;
        this.f20790c = i10;
        this.d = arrayList;
        this.f20791e = z4;
        this.f20792f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f20793n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f20788a) {
            case 0:
                this.f20789b.lambda$loadPinnedDialogs$366(this.f20790c, this.d, this.f20791e, this.f20792f, this.h, this.f20793n);
                return;
            default:
                this.f20789b.lambda$loadPinnedDialogs$365(this.f20790c, this.d, this.f20791e, this.f20792f, this.h, this.f20793n);
                return;
        }
    }
}
