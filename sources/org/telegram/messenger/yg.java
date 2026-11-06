package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class yg implements Runnable {
    public final int f26637a;
    public final ui f26638b;
    public final long f26639c;

    public yg(ui uiVar, long j3, int i7) {
        this.f26637a = i7;
        this.f26638b = uiVar;
        this.f26639c = j3;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f26637a;
        ui uiVar = this.f26638b;
        long j3 = this.f26639c;
        int i11 = 0;
        switch (i10) {
            case 0:
                a0.h hVar = uiVar.f25839w1;
                ArrayList arrayList = (ArrayList) hVar.f(j3);
                if (arrayList != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        int i13 = uiVar.currentAccount;
                        xr a10 = xr.a(j3, ij.c2(i13, (TLRPC.Message) arrayList.get(i12), t3.b0(i13, j3), false));
                        uiVar.f25842x1.remove(a10);
                        uiVar.getNotificationCenter().k(69, null, a10);
                    }
                }
                hVar.l(j3);
                return;
            case 1:
                uiVar.f25822p1.l(j3);
                return;
            case 2:
                final long j10 = this.f26639c;
                final ui uiVar2 = this.f26638b;
                uiVar2.getClass();
                double d = 0.0d;
                try {
                    SQLiteDatabase sQLiteDatabase = uiVar2.getMessagesStorage().f26690b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT MAX(mid), MAX(date) FROM messages_v2 WHERE uid = " + j10 + " AND out = 1", new Object[0]);
                    if (queryFinalized.next()) {
                        i11 = queryFinalized.intValue(0);
                        i7 = queryFinalized.intValue(1);
                    } else {
                        i7 = 0;
                    }
                    queryFinalized.dispose();
                    if (i11 > 0 && uiVar2.getUserConfig().D != 0) {
                        d = i7 - uiVar2.getUserConfig().D;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                final double d2 = d;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        ui uiVar3;
                        long j11;
                        TLRPC.TL_topPeer tL_topPeer;
                        int i14 = 0;
                        while (true) {
                            uiVar3 = ui.this;
                            int size = uiVar3.f25810i1.size();
                            j11 = j10;
                            if (i14 < size) {
                                tL_topPeer = (TLRPC.TL_topPeer) uiVar3.f25810i1.get(i14);
                                if (tL_topPeer.peer.user_id == j11) {
                                    break;
                                }
                                i14++;
                            } else {
                                tL_topPeer = null;
                                break;
                            }
                        }
                        if (tL_topPeer == null) {
                            tL_topPeer = new TLRPC.TL_topPeer();
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_topPeer.peer = tL_peerUser;
                            tL_peerUser.user_id = j11;
                            uiVar3.f25810i1.add(tL_topPeer);
                        }
                        tL_topPeer.rating = Math.exp(d2 / uiVar3.getMessagesController().Z2) + tL_topPeer.rating;
                        Collections.sort(uiVar3.f25810i1, new jg.x(22));
                        uiVar3.getMessagesStorage().f26688a.c(new ah(uiVar3, j11, 0, tL_topPeer.rating));
                        uiVar3.getNotificationCenter().k(qs.S0, new Object[0]);
                    }
                });
                return;
            default:
                ui uiVar3 = this.f26638b;
                ArrayList[] arrayListArr = uiVar3.f25833u0;
                arrayListArr[0].remove(Long.valueOf(j3));
                uiVar3.f25835v0[0].remove(Long.valueOf(j3));
                long[] jArr = uiVar3.f25821p0;
                ArrayList[] arrayListArr2 = uiVar3.f25829s0;
                jArr[0] = uiVar3.o(arrayListArr2[0], false);
                uiVar3.getNotificationCenter().k(62, new Object[0]);
                uiVar3.G1(false, arrayListArr2[0], arrayListArr[0], uiVar3.f25823q0[0], jArr[0], uiVar3.f25826r0);
                return;
        }
    }
}
