package org.telegram.ui.Components;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class os implements Predicate {
    public final int f31370a;
    public final TLObject f31371b;

    public os(int i10, TLObject tLObject) {
        this.f31370a = i10;
        this.f31371b = tLObject;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f31370a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f31370a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f31370a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f31370a) {
            case 0:
                return MessageObject.peersEqual((TLRPC.InputPeer) this.f31371b, ((MessageObject) obj).messageOwner.from_id);
            default:
                MessageObject messageObject = (MessageObject) obj;
                TLObject tLObject = this.f31371b;
                if (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || messageObject.messageOwner.from_id.user_id != ((TLRPC.Chat) tLObject).f22027id) : messageObject.messageOwner.from_id.user_id == ((TLRPC.User) tLObject).f22174id) {
                    return true;
                }
                return false;
        }
    }
}
