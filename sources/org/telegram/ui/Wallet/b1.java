package org.telegram.ui.Wallet;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.tl.TL_wallet;
public final class b1 implements Predicate {
    public final int f42119a;
    public final TL_wallet.tonConnectSession f42120b;

    public b1(TL_wallet.tonConnectSession tonconnectsession, int i7) {
        this.f42119a = i7;
        this.f42120b = tonconnectsession;
    }

    public Predicate and(Predicate predicate) {
        int i7 = this.f42119a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f42119a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i7 = this.f42119a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
        switch (this.f42119a) {
            case 0:
                if (tonconnectsession.f27215id == this.f42120b.f27215id) {
                    return true;
                }
                return false;
            default:
                if (tonconnectsession.f27215id == this.f42120b.f27215id) {
                    return true;
                }
                return false;
        }
    }
}
