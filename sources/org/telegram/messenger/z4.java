package org.telegram.messenger;

import android.util.SparseArray;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLRPC;
public final class z4 implements Runnable {
    public final int f28352a;
    public final Object f28353b;
    public final Object f28354c;

    public z4(int i7, Object obj, Object obj2) {
        this.f28352a = i7;
        this.f28353b = obj;
        this.f28354c = obj2;
    }

    private final void a() {
        int i7;
        ri riVar = (ri) this.f28353b;
        TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) this.f28354c;
        try {
            riVar.getMessagesStorage().f27151b.executeFast("DELETE FROM chat_hints WHERE 1").stepThis().dispose();
            riVar.getMessagesStorage().f27151b.beginTransaction();
            riVar.getMessagesStorage().m1(tL_contacts_topPeers.users, tL_contacts_topPeers.chats, false, false);
            SQLitePreparedStatement executeFast = riVar.getMessagesStorage().f27151b.executeFast("REPLACE INTO chat_hints VALUES(?, ?, ?, ?)");
            for (int i10 = 0; i10 < tL_contacts_topPeers.categories.size(); i10++) {
                TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i10);
                TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline) {
                    i7 = 1;
                } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                    i7 = 2;
                } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                    i7 = 3;
                } else {
                    i7 = 0;
                }
                for (int i11 = 0; i11 < tL_topPeerCategoryPeers.peers.size(); i11++) {
                    TLRPC.TL_topPeer tL_topPeer = tL_topPeerCategoryPeers.peers.get(i11);
                    executeFast.requery();
                    executeFast.bindLong(1, fj.B1(tL_topPeer.peer));
                    executeFast.bindInteger(2, i7);
                    executeFast.bindDouble(3, tL_topPeer.rating);
                    executeFast.bindInteger(4, 0);
                    executeFast.step();
                }
            }
            executeFast.dispose();
            riVar.getMessagesStorage().f27151b.commitTransaction();
            g0.g3(new eg(riVar, 7));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z4.run():void");
    }

    public z4(SparseArray sparseArray, Runnable runnable) {
        this.f28352a = 17;
        this.f28354c = sparseArray;
        this.f28353b = runnable;
    }
}
