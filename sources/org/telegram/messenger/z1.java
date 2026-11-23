package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z1 implements Runnable {
    public final int f28243a;
    public final int f28244b;
    public final long f28245c;
    public final Object d;
    public final Object f28246e;
    public final Object f28247f;

    public z1(Object obj, int i7, long j3, Object obj2, Serializable serializable, int i10) {
        this.f28243a = i10;
        this.d = obj;
        this.f28244b = i7;
        this.f28245c = j3;
        this.f28246e = obj2;
        this.f28247f = serializable;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z1.a():void");
    }

    private final void b() {
        f00 f00Var = (f00) this.d;
        TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) this.f28246e;
        a0.h hVar = (a0.h) this.f28247f;
        f00Var.getMessagesStorage().m1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
        int i7 = 0;
        f00Var.getMessagesController().f4(tL_messages_savedDialogs.users, false);
        f00Var.getMessagesController().Z3(tL_messages_savedDialogs.chats, false);
        LongSparseIntArray longSparseIntArray = f00Var.f23773c;
        long j3 = this.f28245c;
        longSparseIntArray.put(j3, 0);
        ArrayList m10 = qg.c.m(tL_messages_savedDialogs.dialogs);
        int size = tL_messages_savedDialogs.dialogs.size();
        int i10 = this.f28244b;
        f00Var.u(j3, m10, hVar, false, i10, size);
        f00Var.y(j3, true);
        List list = (List) f00Var.f23771a.f(j3);
        f00Var.getMessagesStorage().C1(f00Var.getConnectionsManager().getCurrentTime(), -j3, list, true);
        f00Var.getMessagesStorage().j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
        if (!tL_messages_savedDialogs.dialogs.isEmpty() && i10 == 1) {
            TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) i5.c.h(1, tL_messages_savedDialogs.dialogs);
            TLRPC.Message message = (TLRPC.Message) hVar.f(tL_monoForumDialog.top_message);
            int i11 = tL_monoForumDialog.top_message;
            if (message != null) {
                i7 = message.date;
            }
            f00Var.x(j3, n5.o(tL_monoForumDialog.peer), i11, i7);
        } else if (f00Var.l(j3) != null && f00Var.l(j3).size() >= tL_messages_savedDialogs.dialogs.size()) {
        } else {
            f00Var.f23778s.l(j3);
            f00Var.o(j3);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z1.run():void");
    }

    public z1(f2 f2Var, long[] jArr, long j3, int i7, Runnable runnable) {
        this.f28243a = 0;
        this.d = f2Var;
        this.f28246e = jArr;
        this.f28245c = j3;
        this.f28244b = i7;
        this.f28247f = runnable;
    }

    public z1(si siVar, TLObject tLObject, int i7, y10 y10Var, long j3) {
        this.f28243a = 1;
        this.d = siVar;
        this.f28246e = tLObject;
        this.f28244b = i7;
        this.f28247f = y10Var;
        this.f28245c = j3;
    }

    public z1(ur urVar, long j3, int i7, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong, jk jkVar) {
        this.f28243a = 3;
        this.d = urVar;
        this.f28245c = j3;
        this.f28244b = i7;
        this.f28246e = tL_updates_channelDifferenceTooLong;
        this.f28247f = jkVar;
    }

    public z1(ur urVar, ArrayList arrayList, ArrayList arrayList2, int i7, long j3) {
        this.f28243a = 4;
        this.d = urVar;
        this.f28246e = arrayList;
        this.f28247f = arrayList2;
        this.f28244b = i7;
        this.f28245c = j3;
    }

    public z1(az azVar, gj gjVar, TLRPC.Message message, long j3, int i7) {
        this.f28243a = 5;
        this.d = azVar;
        this.f28246e = gjVar;
        this.f28247f = message;
        this.f28245c = j3;
        this.f28244b = i7;
    }

    public z1(f00 f00Var, TLRPC.messages_SavedDialogs messages_saveddialogs, long j3, a0.h hVar, int i7, int i10) {
        this.f28243a = i10;
        this.d = f00Var;
        this.f28246e = messages_saveddialogs;
        this.f28245c = j3;
        this.f28247f = hVar;
        this.f28244b = i7;
    }
}
