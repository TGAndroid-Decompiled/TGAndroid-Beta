package org.telegram.ui.Components;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class is implements Predicate {
    public final int f24072a;
    public final TLObject f24073b;

    public is(int i10, TLObject tLObject) {
        this.f24072a = i10;
        this.f24073b = tLObject;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f24072a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f24072a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f24072a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f24072a) {
            case 0:
                return MessageObject.peersEqual((TLRPC.InputPeer) this.f24073b, ((MessageObject) obj).messageOwner.from_id);
            default:
                MessageObject messageObject = (MessageObject) obj;
                TLObject tLObject = this.f24073b;
                if (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || messageObject.messageOwner.from_id.user_id != ((TLRPC.Chat) tLObject).f17195id) : messageObject.messageOwner.from_id.user_id == ((TLRPC.User) tLObject).f17342id) {
                    return true;
                }
                return false;
        }
    }
}
