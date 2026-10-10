package org.telegram.ui.Components;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ts implements Predicate {
    public final int f31209a;
    public final TLObject f31210b;

    public ts(int i10, TLObject tLObject) {
        this.f31209a = i10;
        this.f31210b = tLObject;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f31209a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f31209a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f31209a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f31209a) {
            case 0:
                return MessageObject.peersEqual((TLRPC.InputPeer) this.f31210b, ((MessageObject) obj).messageOwner.from_id);
            default:
                MessageObject messageObject = (MessageObject) obj;
                TLObject tLObject = this.f31210b;
                if (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || messageObject.messageOwner.from_id.user_id != ((TLRPC.Chat) tLObject).f20042id) : messageObject.messageOwner.from_id.user_id == ((TLRPC.User) tLObject).f20189id) {
                    return true;
                }
                return false;
        }
    }
}
