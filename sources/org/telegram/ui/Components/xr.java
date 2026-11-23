package org.telegram.ui.Components;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xr implements Predicate {
    public final int f42201a;
    public final TLObject f42202b;

    public xr(int i7, TLObject tLObject) {
        this.f42201a = i7;
        this.f42202b = tLObject;
    }

    public Predicate and(Predicate predicate) {
        int i7 = this.f42201a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f42201a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i7 = this.f42201a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f42201a) {
            case 0:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f42202b;
                TLRPC.Peer peer = ((org.telegram.messenger.gj) obj).f24213k.from_id;
                if ((inputPeer == null && peer == null) || (inputPeer != null && peer != null && (!(inputPeer instanceof TLRPC.TL_inputPeerChat) || !(peer instanceof TLRPC.TL_peerChat) ? !(!(inputPeer instanceof TLRPC.TL_inputPeerChannel) || !(peer instanceof TLRPC.TL_peerChannel) ? !(inputPeer instanceof TLRPC.TL_inputPeerUser) || !(peer instanceof TLRPC.TL_peerUser) || inputPeer.user_id != peer.user_id : inputPeer.channel_id != peer.channel_id) : inputPeer.chat_id == peer.chat_id))) {
                    return true;
                }
                return false;
            default:
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                TLObject tLObject = this.f42202b;
                if (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || gjVar.f24213k.from_id.user_id != ((TLRPC.Chat) tLObject).f28434id) : gjVar.f24213k.from_id.user_id == ((TLRPC.User) tLObject).f28583id) {
                    return true;
                }
                return false;
        }
    }
}
