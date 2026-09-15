package org.telegram.ui.Components;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cs implements Predicate {
    public final int f23130a;
    public final TLObject f23131b;

    public cs(int i10, TLObject tLObject) {
        this.f23130a = i10;
        this.f23131b = tLObject;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f23130a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f23130a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f23130a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f23130a) {
            case 0:
                return MessageObject.peersEqual((TLRPC.InputPeer) this.f23131b, ((MessageObject) obj).messageOwner.from_id);
            default:
                MessageObject messageObject = (MessageObject) obj;
                TLObject tLObject = this.f23131b;
                if (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || messageObject.messageOwner.from_id.user_id != ((TLRPC.Chat) tLObject).f18112id) : messageObject.messageOwner.from_id.user_id == ((TLRPC.User) tLObject).f18259id) {
                    return true;
                }
                return false;
        }
    }
}
