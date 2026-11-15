package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ym implements Runnable {
    public final np f27788a;
    public final TLRPC.TL_messages_dialogs f27789b;
    public final ArrayList f27790c;
    public final TLRPC.messages_Dialogs d;
    public final int f27791e;
    public final ArrayList f27792f;
    public final ArrayList h;
    public final ArrayList f27793n;
    public final Runnable f27794r;

    public ym(np npVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs, int i7, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f27788a = npVar;
        this.f27789b = tL_messages_dialogs;
        this.f27790c = arrayList;
        this.d = messages_dialogs;
        this.f27791e = i7;
        this.f27792f = arrayList2;
        this.h = arrayList3;
        this.f27793n = arrayList4;
        this.f27794r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ym.run():void");
    }
}
