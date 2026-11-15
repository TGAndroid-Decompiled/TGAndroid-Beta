package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z1 implements Runnable {
    public final int f27872a;
    public final int f27873b;
    public final long f27874c;
    public final Object d;
    public final Object f27875e;
    public final Object f27876f;

    public z1(Object obj, int i7, long j3, Object obj2, Serializable serializable, int i10) {
        this.f27872a = i10;
        this.d = obj;
        this.f27873b = i7;
        this.f27874c = j3;
        this.f27875e = obj2;
        this.f27876f = serializable;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z1.a():void");
    }

    private final void b() {
        h00 h00Var = (h00) this.d;
        TLRPC.TL_messages_savedDialogsSlice tL_messages_savedDialogsSlice = (TLRPC.TL_messages_savedDialogsSlice) this.f27875e;
        a0.h hVar = (a0.h) this.f27876f;
        h00Var.getMessagesStorage().m1(tL_messages_savedDialogsSlice.users, tL_messages_savedDialogsSlice.chats, true, true);
        int i7 = 0;
        h00Var.getMessagesController().Y3(tL_messages_savedDialogsSlice.users, false);
        h00Var.getMessagesController().S3(tL_messages_savedDialogsSlice.chats, false);
        LongSparseIntArray longSparseIntArray = h00Var.f24013c;
        long j3 = this.f27874c;
        longSparseIntArray.put(j3, 0);
        ArrayList l10 = qg.c.l(tL_messages_savedDialogsSlice.dialogs);
        int i10 = tL_messages_savedDialogsSlice.count;
        int i11 = this.f27873b;
        h00Var.u(j3, l10, hVar, false, i11, i10);
        h00Var.y(j3, true);
        List list = (List) h00Var.f24011a.f(j3);
        h00Var.getMessagesStorage().C1(h00Var.getConnectionsManager().getCurrentTime(), -j3, list, true);
        h00Var.getMessagesStorage().j1(tL_messages_savedDialogsSlice.messages, false, true, false, 0, false, 0, 0L);
        if (!tL_messages_savedDialogsSlice.dialogs.isEmpty() && i11 == 1) {
            TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) i5.c.h(1, tL_messages_savedDialogsSlice.dialogs);
            TLRPC.Message message = (TLRPC.Message) hVar.f(tL_monoForumDialog.top_message);
            int i12 = tL_monoForumDialog.top_message;
            if (message != null) {
                i7 = message.date;
            }
            h00Var.x(j3, m5.o(tL_monoForumDialog.peer), i12, i7);
        } else if (h00Var.l(j3) != null && h00Var.l(j3).size() >= tL_messages_savedDialogsSlice.count) {
        } else {
            h00Var.h.l(j3);
            h00Var.o(j3);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z1.run():void");
    }

    public z1(f2 f2Var, long[] jArr, long j3, int i7, Runnable runnable) {
        this.f27872a = 0;
        this.d = f2Var;
        this.f27875e = jArr;
        this.f27874c = j3;
        this.f27873b = i7;
        this.f27876f = runnable;
    }

    public z1(si siVar, TLObject tLObject, int i7, z10 z10Var, long j3) {
        this.f27872a = 1;
        this.d = siVar;
        this.f27875e = tLObject;
        this.f27873b = i7;
        this.f27876f = z10Var;
        this.f27874c = j3;
    }

    public z1(vr vrVar, long j3, int i7, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong, kk kkVar) {
        this.f27872a = 3;
        this.d = vrVar;
        this.f27874c = j3;
        this.f27873b = i7;
        this.f27875e = tL_updates_channelDifferenceTooLong;
        this.f27876f = kkVar;
    }

    public z1(vr vrVar, ArrayList arrayList, ArrayList arrayList2, int i7, long j3) {
        this.f27872a = 4;
        this.d = vrVar;
        this.f27875e = arrayList;
        this.f27876f = arrayList2;
        this.f27873b = i7;
        this.f27874c = j3;
    }

    public z1(ez ezVar, gj gjVar, TLRPC.Message message, long j3, int i7) {
        this.f27872a = 5;
        this.d = ezVar;
        this.f27875e = gjVar;
        this.f27876f = message;
        this.f27874c = j3;
        this.f27873b = i7;
    }

    public z1(h00 h00Var, TLRPC.messages_SavedDialogs messages_saveddialogs, long j3, a0.h hVar, int i7, int i10) {
        this.f27872a = i10;
        this.d = h00Var;
        this.f27875e = messages_saveddialogs;
        this.f27874c = j3;
        this.f27876f = hVar;
        this.f27873b = i7;
    }
}
