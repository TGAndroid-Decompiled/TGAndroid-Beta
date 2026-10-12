package org.telegram.ui.Wallet;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.tl.TL_wallet;
public final class b1 implements Predicate {
    public final int f34485a;
    public final TL_wallet.tonConnectSession f34486b;

    public b1(TL_wallet.tonConnectSession tonconnectsession, int i10) {
        this.f34485a = i10;
        this.f34486b = tonconnectsession;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f34485a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f34485a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f34485a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
        switch (this.f34485a) {
            case 0:
                if (tonconnectsession.f20066id == this.f34486b.f20066id) {
                    return true;
                }
                return false;
            default:
                if (tonconnectsession.f20066id == this.f34486b.f20066id) {
                    return true;
                }
                return false;
        }
    }
}
