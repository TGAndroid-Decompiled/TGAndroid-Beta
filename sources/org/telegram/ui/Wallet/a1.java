package org.telegram.ui.Wallet;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.tl.TL_wallet;
public final class a1 implements Predicate {
    public final int f34272a;
    public final TL_wallet.tonConnectSession f34273b;

    public a1(TL_wallet.tonConnectSession tonconnectsession, int i10) {
        this.f34272a = i10;
        this.f34273b = tonconnectsession;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f34272a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f34272a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f34272a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
        switch (this.f34272a) {
            case 0:
                if (tonconnectsession.f20602id == this.f34273b.f20602id) {
                    return true;
                }
                return false;
            default:
                if (tonconnectsession.f20602id == this.f34273b.f20602id) {
                    return true;
                }
                return false;
        }
    }
}
