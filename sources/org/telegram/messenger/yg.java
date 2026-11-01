package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class yg implements Runnable {
    public final int f19584a;
    public final vi f19585b;
    public final long f19586c;

    public yg(vi viVar, long j10, int i10) {
        this.f19584a = i10;
        this.f19585b = viVar;
        this.f19586c = j10;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f19584a;
        vi viVar = this.f19585b;
        long j10 = this.f19586c;
        int i12 = 0;
        switch (i11) {
            case 0:
                a0.h hVar = viVar.f18684w1;
                ArrayList arrayList = (ArrayList) hVar.f(j10);
                if (arrayList != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        int i14 = viVar.currentAccount;
                        hs a2 = hs.a(j10, kj.c2(i14, (TLRPC.Message) arrayList.get(i13), w3.b0(i14, j10), false));
                        viVar.f18687x1.remove(a2);
                        viVar.getNotificationCenter().k(69, null, a2);
                    }
                }
                hVar.l(j10);
                return;
            case 1:
                viVar.f18667p1.l(j10);
                return;
            case 2:
                final long j11 = this.f19586c;
                final vi viVar2 = this.f19585b;
                viVar2.getClass();
                double d = 0.0d;
                try {
                    SQLiteDatabase sQLiteDatabase = viVar2.getMessagesStorage().f16333b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT MAX(mid), MAX(date) FROM messages_v2 WHERE uid = " + j11 + " AND out = 1", new Object[0]);
                    if (queryFinalized.next()) {
                        i12 = queryFinalized.intValue(0);
                        i10 = queryFinalized.intValue(1);
                    } else {
                        i10 = 0;
                    }
                    queryFinalized.dispose();
                    if (i12 > 0 && viVar2.getUserConfig().D != 0) {
                        d = i10 - viVar2.getUserConfig().D;
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                }
                final double d10 = d;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        vi viVar3;
                        long j12;
                        TLRPC.TL_topPeer tL_topPeer;
                        int i15 = 0;
                        while (true) {
                            viVar3 = vi.this;
                            int size = viVar3.f18654i1.size();
                            j12 = j11;
                            if (i15 < size) {
                                tL_topPeer = (TLRPC.TL_topPeer) viVar3.f18654i1.get(i15);
                                if (tL_topPeer.peer.user_id == j12) {
                                    break;
                                }
                                i15++;
                            } else {
                                tL_topPeer = null;
                                break;
                            }
                        }
                        if (tL_topPeer == null) {
                            tL_topPeer = new TLRPC.TL_topPeer();
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_topPeer.peer = tL_peerUser;
                            tL_peerUser.user_id = j12;
                            viVar3.f18654i1.add(tL_topPeer);
                        }
                        tL_topPeer.rating = Math.exp(d10 / viVar3.getMessagesController().Z2) + tL_topPeer.rating;
                        Collections.sort(viVar3.f18654i1, new a4.d(24));
                        viVar3.getMessagesStorage().f16331a.c(new ah(viVar3, j12, 0, tL_topPeer.rating));
                        viVar3.getNotificationCenter().k(at.S0, new Object[0]);
                    }
                });
                return;
            default:
                vi viVar3 = this.f19585b;
                ArrayList[] arrayListArr = viVar3.f18678u0;
                arrayListArr[0].remove(Long.valueOf(j10));
                viVar3.f18680v0[0].remove(Long.valueOf(j10));
                long[] jArr = viVar3.f18666p0;
                ArrayList[] arrayListArr2 = viVar3.f18674s0;
                jArr[0] = viVar3.o(arrayListArr2[0], false);
                viVar3.getNotificationCenter().k(62, new Object[0]);
                viVar3.G1(false, arrayListArr2[0], arrayListArr[0], viVar3.f18668q0[0], jArr[0], viVar3.f18671r0);
                return;
        }
    }
}
