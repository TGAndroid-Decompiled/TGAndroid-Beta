package org.telegram.ui.Wallet;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.tl.TL_wallet;
public final class z0 implements Predicate {
    public final int f33898a;
    public final TL_wallet.tonConnectSession f33899b;

    public z0(TL_wallet.tonConnectSession tonconnectsession, int i10) {
        this.f33898a = i10;
        this.f33899b = tonconnectsession;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f33898a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f33898a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f33898a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
        switch (this.f33898a) {
            case 0:
                if (tonconnectsession.f19475id == this.f33899b.f19475id) {
                    return true;
                }
                return false;
            default:
                if (tonconnectsession.f19475id == this.f33899b.f19475id) {
                    return true;
                }
                return false;
        }
    }
}
