package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z1 implements Runnable {
    public final int f28340a;
    public final int f28341b;
    public final long f28342c;
    public final Object d;
    public final Object f28343e;
    public final Object f28344f;

    public z1(Object obj, int i7, long j3, Object obj2, Serializable serializable, int i10) {
        this.f28340a = i10;
        this.d = obj;
        this.f28341b = i7;
        this.f28342c = j3;
        this.f28343e = obj2;
        this.f28344f = serializable;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z1.a():void");
    }

    private final void b() {
        d00 d00Var = (d00) this.d;
        TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) this.f28343e;
        a0.h hVar = (a0.h) this.f28344f;
        d00Var.getMessagesStorage().m1(tL_messages_savedDialogs.users, tL_messages_savedDialogs.chats, true, true);
        int i7 = 0;
        d00Var.getMessagesController().f4(tL_messages_savedDialogs.users, false);
        d00Var.getMessagesController().Z3(tL_messages_savedDialogs.chats, false);
        LongSparseIntArray longSparseIntArray = d00Var.f23572c;
        long j3 = this.f28342c;
        longSparseIntArray.put(j3, 0);
        ArrayList m10 = qg.c.m(tL_messages_savedDialogs.dialogs);
        int size = tL_messages_savedDialogs.dialogs.size();
        int i10 = this.f28341b;
        d00Var.u(j3, m10, hVar, false, i10, size);
        d00Var.y(j3, true);
        List list = (List) d00Var.f23570a.f(j3);
        d00Var.getMessagesStorage().C1(d00Var.getConnectionsManager().getCurrentTime(), -j3, list, true);
        d00Var.getMessagesStorage().j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
        if (!tL_messages_savedDialogs.dialogs.isEmpty() && i10 == 1) {
            TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) i5.c.h(1, tL_messages_savedDialogs.dialogs);
            TLRPC.Message message = (TLRPC.Message) hVar.f(tL_monoForumDialog.top_message);
            int i11 = tL_monoForumDialog.top_message;
            if (message != null) {
                i7 = message.date;
            }
            d00Var.x(j3, n5.o(tL_monoForumDialog.peer), i11, i7);
        } else if (d00Var.l(j3) != null && d00Var.l(j3).size() >= tL_messages_savedDialogs.dialogs.size()) {
        } else {
            d00Var.f23577s.l(j3);
            d00Var.o(j3);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z1.run():void");
    }

    public z1(f2 f2Var, long[] jArr, long j3, int i7, Runnable runnable) {
        this.f28340a = 0;
        this.d = f2Var;
        this.f28343e = jArr;
        this.f28342c = j3;
        this.f28341b = i7;
        this.f28344f = runnable;
    }

    public z1(ri riVar, TLObject tLObject, int i7, w10 w10Var, long j3) {
        this.f28340a = 1;
        this.d = riVar;
        this.f28343e = tLObject;
        this.f28341b = i7;
        this.f28344f = w10Var;
        this.f28342c = j3;
    }

    public z1(tr trVar, long j3, int i7, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong, ik ikVar) {
        this.f28340a = 3;
        this.d = trVar;
        this.f28342c = j3;
        this.f28341b = i7;
        this.f28343e = tL_updates_channelDifferenceTooLong;
        this.f28344f = ikVar;
    }

    public z1(tr trVar, ArrayList arrayList, ArrayList arrayList2, int i7, long j3) {
        this.f28340a = 4;
        this.d = trVar;
        this.f28343e = arrayList;
        this.f28344f = arrayList2;
        this.f28341b = i7;
        this.f28342c = j3;
    }

    public z1(zy zyVar, fj fjVar, TLRPC.Message message, long j3, int i7) {
        this.f28340a = 5;
        this.d = zyVar;
        this.f28343e = fjVar;
        this.f28344f = message;
        this.f28342c = j3;
        this.f28341b = i7;
    }

    public z1(d00 d00Var, TLRPC.messages_SavedDialogs messages_saveddialogs, long j3, a0.h hVar, int i7, int i10) {
        this.f28340a = i10;
        this.d = d00Var;
        this.f28343e = messages_saveddialogs;
        this.f28342c = j3;
        this.f28344f = hVar;
        this.f28341b = i7;
    }
}
