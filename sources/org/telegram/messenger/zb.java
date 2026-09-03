package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zb implements Runnable {
    public final int f20790a;
    public final MessagesController f20791b;
    public final int f20792c;
    public final ArrayList d;
    public final boolean f20793e;
    public final TLRPC.TL_messages_peerDialogs f20794f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f20795n;

    public zb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z4, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f20790a = i11;
        this.f20791b = messagesController;
        this.f20792c = i10;
        this.d = arrayList;
        this.f20793e = z4;
        this.f20794f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f20795n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f20790a) {
            case 0:
                this.f20791b.lambda$loadPinnedDialogs$366(this.f20792c, this.d, this.f20793e, this.f20794f, this.h, this.f20795n);
                return;
            default:
                this.f20791b.lambda$loadPinnedDialogs$365(this.f20792c, this.d, this.f20793e, this.f20794f, this.h, this.f20795n);
                return;
        }
    }
}
