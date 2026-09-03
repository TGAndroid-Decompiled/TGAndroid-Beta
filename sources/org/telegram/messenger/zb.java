package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zb implements Runnable {
    public final int f19108a;
    public final MessagesController f19109b;
    public final int f19110c;
    public final ArrayList d;
    public final boolean e;
    public final TLRPC.TL_messages_peerDialogs f19111f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f19112n;

    public zb(MessagesController messagesController, int i10, ArrayList arrayList, boolean z4, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i11) {
        this.f19108a = i11;
        this.f19109b = messagesController;
        this.f19110c = i10;
        this.d = arrayList;
        this.e = z4;
        this.f19111f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f19112n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.f19108a) {
            case 0:
                this.f19109b.lambda$loadPinnedDialogs$366(this.f19110c, this.d, this.e, this.f19111f, this.h, this.f19112n);
                return;
            default:
                this.f19109b.lambda$loadPinnedDialogs$365(this.f19110c, this.d, this.e, this.f19111f, this.h, this.f19112n);
                return;
        }
    }
}
