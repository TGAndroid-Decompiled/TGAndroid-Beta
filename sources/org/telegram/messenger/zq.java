package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zq implements Runnable {
    public final int f26964a;
    public final Object f26965b;
    public final long f26966c;
    public final Object d;

    public zq(Object obj, Object obj2, long j10, int i3) {
        this.f26964a = i3;
        this.f26965b = obj;
        this.d = obj2;
        this.f26966c = j10;
    }

    private final void a() {
        x00 x00Var = (x00) this.f26965b;
        long j10 = this.f26966c;
        s00 s00Var = (s00) this.d;
        synchronized (x00Var) {
            try {
                ArrayList arrayList = (ArrayList) x00Var.I.get(Long.valueOf(j10));
                if (arrayList != null) {
                    arrayList.remove(s00Var);
                    if (arrayList.isEmpty()) {
                        x00Var.I.remove(Long.valueOf(j10));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = x00Var.getMessagesController().j1(j10);
        tL_messages_translateRichMessage.f27124id = s00Var.f25262b;
        tL_messages_translateRichMessage.to_lang = x00.D(s00Var.d);
        int sendRequest = x00Var.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new fj(x00Var, s00Var, j10, 12));
        synchronized (x00Var) {
            s00Var.f25265f = sendRequest;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zq.run():void");
    }

    public zq(c1 c1Var, long j10, Object obj, int i3) {
        this.f26964a = i3;
        this.f26965b = c1Var;
        this.f26966c = j10;
        this.d = obj;
    }
}
