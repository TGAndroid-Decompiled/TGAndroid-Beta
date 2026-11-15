package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ym implements Runnable {
    public final np f27790a;
    public final TLRPC.TL_messages_dialogs f27791b;
    public final ArrayList f27792c;
    public final TLRPC.messages_Dialogs d;
    public final int f27793e;
    public final ArrayList f27794f;
    public final ArrayList h;
    public final ArrayList f27795n;
    public final Runnable f27796r;

    public ym(np npVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs, int i7, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f27790a = npVar;
        this.f27791b = tL_messages_dialogs;
        this.f27792c = arrayList;
        this.d = messages_dialogs;
        this.f27793e = i7;
        this.f27794f = arrayList2;
        this.h = arrayList3;
        this.f27795n = arrayList4;
        this.f27796r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ym.run():void");
    }
}
