package org.telegram.ui.Wallet;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.tl.TL_wallet;
public final class b1 implements Predicate {
    public final int f34674a;
    public final TL_wallet.tonConnectSession f34675b;

    public b1(TL_wallet.tonConnectSession tonconnectsession, int i10) {
        this.f34674a = i10;
        this.f34675b = tonconnectsession;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f34674a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f34674a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f34674a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
        switch (this.f34674a) {
            case 0:
                if (tonconnectsession.f20293id == this.f34675b.f20293id) {
                    return true;
                }
                return false;
            default:
                if (tonconnectsession.f20293id == this.f34675b.f20293id) {
                    return true;
                }
                return false;
        }
    }
}
