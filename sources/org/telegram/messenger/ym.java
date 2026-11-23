package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ym implements Runnable {
    public final np f28139a;
    public final TLRPC.TL_messages_dialogs f28140b;
    public final ArrayList f28141c;
    public final TLRPC.messages_Dialogs d;
    public final int f28142e;
    public final ArrayList f28143f;
    public final ArrayList h;
    public final ArrayList f28144n;
    public final Runnable f28145r;

    public ym(np npVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs, int i7, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f28139a = npVar;
        this.f28140b = tL_messages_dialogs;
        this.f28141c = arrayList;
        this.d = messages_dialogs;
        this.f28142e = i7;
        this.f28143f = arrayList2;
        this.h = arrayList3;
        this.f28144n = arrayList4;
        this.f28145r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ym.run():void");
    }
}
