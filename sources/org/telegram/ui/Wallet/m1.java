package org.telegram.ui.Wallet;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.tl.TL_wallet;
public final class m1 implements Predicate {
    public final int f44553a;
    public final TL_wallet.tonConnectSession f44554b;

    public m1(TL_wallet.tonConnectSession tonconnectsession, int i7) {
        this.f44553a = i7;
        this.f44554b = tonconnectsession;
    }

    public Predicate and(Predicate predicate) {
        int i7 = this.f44553a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f44553a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i7 = this.f44553a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
        switch (this.f44553a) {
            case 0:
                if (tonconnectsession.f28696id == this.f44554b.f28696id) {
                    return true;
                }
                return false;
            default:
                if (tonconnectsession.f28696id == this.f44554b.f28696id) {
                    return true;
                }
                return false;
        }
    }
}
