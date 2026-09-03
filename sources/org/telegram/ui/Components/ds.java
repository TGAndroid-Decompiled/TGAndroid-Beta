package org.telegram.ui.Components;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ds implements Predicate {
    public final int f26359a;
    public final TLObject f26360b;

    public ds(int i10, TLObject tLObject) {
        this.f26359a = i10;
        this.f26360b = tLObject;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f26359a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f26359a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f26359a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f26359a) {
            case 0:
                return MessageObject.peersEqual((TLRPC.InputPeer) this.f26360b, ((MessageObject) obj).messageOwner.from_id);
            default:
                MessageObject messageObject = (MessageObject) obj;
                TLObject tLObject = this.f26360b;
                if (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || messageObject.messageOwner.from_id.user_id != ((TLRPC.Chat) tLObject).f20845id) : messageObject.messageOwner.from_id.user_id == ((TLRPC.User) tLObject).f20992id) {
                    return true;
                }
                return false;
        }
    }
}
