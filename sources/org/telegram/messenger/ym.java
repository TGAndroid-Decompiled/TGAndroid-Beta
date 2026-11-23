package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ym implements Runnable {
    public final np f28103a;
    public final TLRPC.TL_messages_dialogs f28104b;
    public final ArrayList f28105c;
    public final TLRPC.messages_Dialogs d;
    public final int f28106e;
    public final ArrayList f28107f;
    public final ArrayList h;
    public final ArrayList f28108n;
    public final Runnable f28109r;

    public ym(np npVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs, int i7, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f28103a = npVar;
        this.f28104b = tL_messages_dialogs;
        this.f28105c = arrayList;
        this.d = messages_dialogs;
        this.f28106e = i7;
        this.f28107f = arrayList2;
        this.h = arrayList3;
        this.f28108n = arrayList4;
        this.f28109r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ym.run():void");
    }
}
