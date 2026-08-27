package org.telegram.ui.Components;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class rr implements Predicate {

    public final int f32258a;

    public final TLObject f32259b;

    public rr(int i10, TLObject tLObject) {
        this.f32258a = i10;
        this.f32259b = tLObject;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f32258a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f32258a) {
            case 0:
                break;
        }
        return Predicate$CC.$default$negate(this);
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f32258a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f32258a) {
            case 0:
                return MessageObject.peersEqual((TLRPC.InputPeer) this.f32259b, ((MessageObject) obj).messageOwner.from_id);
            default:
                MessageObject messageObject = (MessageObject) obj;
                TLObject tLObject = this.f32259b;
                return !(tLObject instanceof TLRPC.User) ? !((tLObject instanceof TLRPC.Chat) && messageObject.messageOwner.from_id.user_id == ((TLRPC.Chat) tLObject).f22380id) : messageObject.messageOwner.from_id.user_id != ((TLRPC.User) tLObject).f22527id;
        }
    }
}
