package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yj implements Runnable {
    public final int f26652a;
    public final qp f26653b;
    public final int f26654c;
    public final ArrayList d;
    public final boolean f26655e;
    public final TLRPC.TL_messages_peerDialogs f26656f;
    public final a0.h h;
    public final TLRPC.TL_messages_dialogs f26657n;

    public yj(qp qpVar, int i7, ArrayList arrayList, boolean z9, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, a0.h hVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i10) {
        this.f26652a = i10;
        this.f26653b = qpVar;
        this.f26654c = i7;
        this.d = arrayList;
        this.f26655e = z9;
        this.f26656f = tL_messages_peerDialogs;
        this.h = hVar;
        this.f26657n = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yj.run():void");
    }
}
