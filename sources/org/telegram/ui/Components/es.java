package org.telegram.ui.Components;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class es implements Predicate {
    public final int f24054a;
    public final TLObject f24055b;

    public es(int i10, TLObject tLObject) {
        this.f24054a = i10;
        this.f24055b = tLObject;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f24054a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f24054a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f24054a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f24054a) {
            case 0:
                return MessageObject.peersEqual((TLRPC.InputPeer) this.f24055b, ((MessageObject) obj).messageOwner.from_id);
            default:
                MessageObject messageObject = (MessageObject) obj;
                TLObject tLObject = this.f24055b;
                if (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || messageObject.messageOwner.from_id.user_id != ((TLRPC.Chat) tLObject).f18336id) : messageObject.messageOwner.from_id.user_id == ((TLRPC.User) tLObject).f18483id) {
                    return true;
                }
                return false;
        }
    }
}
