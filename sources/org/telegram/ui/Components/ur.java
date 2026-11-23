package org.telegram.ui.Components;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ur implements Predicate {
    public final int f40443a;
    public final TLObject f40444b;

    public ur(int i7, TLObject tLObject) {
        this.f40443a = i7;
        this.f40444b = tLObject;
    }

    public Predicate and(Predicate predicate) {
        int i7 = this.f40443a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f40443a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i7 = this.f40443a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f40443a) {
            case 0:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f40444b;
                TLRPC.Peer peer = ((org.telegram.messenger.fj) obj).f24073k.from_id;
                if ((inputPeer == null && peer == null) || (inputPeer != null && peer != null && (!(inputPeer instanceof TLRPC.TL_inputPeerChat) || !(peer instanceof TLRPC.TL_peerChat) ? !(!(inputPeer instanceof TLRPC.TL_inputPeerChannel) || !(peer instanceof TLRPC.TL_peerChannel) ? !(inputPeer instanceof TLRPC.TL_inputPeerUser) || !(peer instanceof TLRPC.TL_peerUser) || inputPeer.user_id != peer.user_id : inputPeer.channel_id != peer.channel_id) : inputPeer.chat_id == peer.chat_id))) {
                    return true;
                }
                return false;
            default:
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                TLObject tLObject = this.f40444b;
                if (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || fjVar.f24073k.from_id.user_id != ((TLRPC.Chat) tLObject).f28492id) : fjVar.f24073k.from_id.user_id == ((TLRPC.User) tLObject).f28641id) {
                    return true;
                }
                return false;
        }
    }
}
