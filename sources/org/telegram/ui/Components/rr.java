package org.telegram.ui.Components;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rr implements Predicate {
    public final int f30075a;
    public final TLObject f30076b;

    public rr(int i10, TLObject tLObject) {
        this.f30075a = i10;
        this.f30076b = tLObject;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f30075a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f30075a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f30075a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f30075a) {
            case 0:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f30076b;
                TLRPC.Peer peer = ((org.telegram.messenger.kj) obj).f16690k.from_id;
                if ((inputPeer == null && peer == null) || (inputPeer != null && peer != null && (!(inputPeer instanceof TLRPC.TL_inputPeerChat) || !(peer instanceof TLRPC.TL_peerChat) ? !(!(inputPeer instanceof TLRPC.TL_inputPeerChannel) || !(peer instanceof TLRPC.TL_peerChannel) ? !(inputPeer instanceof TLRPC.TL_inputPeerUser) || !(peer instanceof TLRPC.TL_peerUser) || inputPeer.user_id != peer.user_id : inputPeer.channel_id != peer.channel_id) : inputPeer.chat_id == peer.chat_id))) {
                    return true;
                }
                return false;
            default:
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj;
                TLObject tLObject = this.f30076b;
                if (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || kjVar.f16690k.from_id.user_id != ((TLRPC.Chat) tLObject).f19794id) : kjVar.f16690k.from_id.user_id == ((TLRPC.User) tLObject).f19943id) {
                    return true;
                }
                return false;
        }
    }
}
