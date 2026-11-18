package org.telegram.ui.Components;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vr implements Predicate {
    public final int f41399a;
    public final TLObject f41400b;

    public vr(int i7, TLObject tLObject) {
        this.f41399a = i7;
        this.f41400b = tLObject;
    }

    public Predicate and(Predicate predicate) {
        int i7 = this.f41399a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f41399a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i7 = this.f41399a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f41399a) {
            case 0:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.f41400b;
                TLRPC.Peer peer = ((org.telegram.messenger.fj) obj).f23965k.from_id;
                if ((inputPeer == null && peer == null) || (inputPeer != null && peer != null && (!(inputPeer instanceof TLRPC.TL_inputPeerChat) || !(peer instanceof TLRPC.TL_peerChat) ? !(!(inputPeer instanceof TLRPC.TL_inputPeerChannel) || !(peer instanceof TLRPC.TL_peerChannel) ? !(inputPeer instanceof TLRPC.TL_inputPeerUser) || !(peer instanceof TLRPC.TL_peerUser) || inputPeer.user_id != peer.user_id : inputPeer.channel_id != peer.channel_id) : inputPeer.chat_id == peer.chat_id))) {
                    return true;
                }
                return false;
            default:
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                TLObject tLObject = this.f41400b;
                if (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || fjVar.f23965k.from_id.user_id != ((TLRPC.Chat) tLObject).f28403id) : fjVar.f23965k.from_id.user_id == ((TLRPC.User) tLObject).f28552id) {
                    return true;
                }
                return false;
        }
    }
}
