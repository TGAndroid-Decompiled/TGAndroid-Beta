package org.telegram.ui.Components;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tr implements Predicate {
    public final int f32780a;
    public final TLObject f32781b;

    public tr(int i9, TLObject tLObject) {
        this.f32780a = i9;
        this.f32781b = tLObject;
    }

    public Predicate and(Predicate predicate) {
        int i9 = this.f32780a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f32780a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i9 = this.f32780a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f32780a) {
            case 0:
                return MessageObject.peersEqual((TLRPC.InputPeer) this.f32781b, ((MessageObject) obj).messageOwner.from_id);
            default:
                MessageObject messageObject = (MessageObject) obj;
                TLObject tLObject = this.f32781b;
                if (!(tLObject instanceof TLRPC.User) ? !(!(tLObject instanceof TLRPC.Chat) || messageObject.messageOwner.from_id.user_id != ((TLRPC.Chat) tLObject).f22380id) : messageObject.messageOwner.from_id.user_id == ((TLRPC.User) tLObject).f22527id) {
                    return true;
                }
                return false;
        }
    }
}
