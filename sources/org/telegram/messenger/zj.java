package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;
public final class zj implements Runnable {
    public final int f26928a;
    public final hp f26929b;
    public final TL_update.TL_updatePeerBlocked f26930c;

    public zj(hp hpVar, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i3) {
        this.f26928a = i3;
        this.f26929b = hpVar;
        this.f26930c = tL_updatePeerBlocked;
    }

    @Override
    public final void run() {
        switch (this.f26928a) {
            case 0:
                g0.h3(new zj(this.f26929b, this.f26930c, 1));
                return;
            default:
                hp hpVar = this.f26929b;
                LongSparseIntArray longSparseIntArray = hpVar.H0;
                TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.f26930c;
                long C1 = zi.C1(tL_updatePeerBlocked.peer_id);
                if (tL_updatePeerBlocked.blocked) {
                    if (longSparseIntArray.indexOfKey(C1) < 0) {
                        longSparseIntArray.put(C1, 1);
                    }
                } else {
                    longSparseIntArray.delete(C1);
                }
                hpVar.getNotificationCenter().k(43, new Object[0]);
                hpVar.P1().m0(C1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                return;
        }
    }
}
