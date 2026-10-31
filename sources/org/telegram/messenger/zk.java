package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class zk implements Runnable {
    public final int f19544a = 1;
    public final vp f19545b;
    public final long f19546c;
    public final int d;
    public final long e;
    public final Object f19547f;
    public final Object h;
    public final Object f19548n;
    public final Object f19549r;

    public zk(vp vpVar, ArrayList arrayList, long j10, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, a0.h hVar, int i10, long j11) {
        this.f19545b = vpVar;
        this.f19547f = arrayList;
        this.f19546c = j10;
        this.h = updates_channeldifference;
        this.f19548n = chat;
        this.f19549r = hVar;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        TLRPC.Chat chat;
        a0.h hVar;
        switch (this.f19544a) {
            case 0:
                vp vpVar = this.f19545b;
                boolean[] zArr = (boolean[]) this.f19547f;
                hs hsVar = (hs) this.h;
                long j10 = this.f19546c;
                Runnable[] runnableArr = (Runnable[]) this.f19548n;
                long j11 = this.e;
                int i10 = this.d;
                jp jpVar = (jp) this.f19549r;
                if (!zArr[0]) {
                    i0.g3(new qb(vpVar, zArr, hsVar.O(j10), runnableArr, j11, i10, jpVar));
                    return;
                }
                return;
            default:
                vp vpVar2 = this.f19545b;
                ArrayList arrayList = (ArrayList) this.f19547f;
                long j12 = this.f19546c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.h;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f19548n;
                a0.h hVar2 = (a0.h) this.f19549r;
                int i11 = this.d;
                long j13 = this.e;
                if (!arrayList.isEmpty()) {
                    SparseArray sparseArray = new SparseArray();
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        TLRPC.Chat chat3 = chat2;
                        a0.h hVar3 = hVar2;
                        ArrayList arrayList2 = arrayList;
                        long[] a2 = vpVar2.getMessagesStorage().a2(tL_updateMessageID.random_id, -j12, null, tL_updateMessageID.f20050id, 0, -1, 0);
                        if (a2 != null) {
                            sparseArray.put(tL_updateMessageID.f20050id, a2);
                        }
                        chat2 = chat3;
                        hVar2 = hVar3;
                        arrayList = arrayList2;
                    }
                    chat = chat2;
                    hVar = hVar2;
                    if (sparseArray.size() != 0) {
                        i0.g3(new tl(vpVar2, sparseArray, 1));
                    }
                } else {
                    chat = chat2;
                    hVar = hVar2;
                }
                Utilities.d.c(new zm(vpVar2, updates_channeldifference, j12, chat, hVar, i11, j13));
                return;
        }
    }

    public zk(vp vpVar, boolean[] zArr, hs hsVar, long j10, Runnable[] runnableArr, long j11, int i10, jp jpVar) {
        this.f19545b = vpVar;
        this.f19547f = zArr;
        this.h = hsVar;
        this.f19546c = j10;
        this.f19548n = runnableArr;
        this.e = j11;
        this.d = i10;
        this.f19549r = jpVar;
    }
}
