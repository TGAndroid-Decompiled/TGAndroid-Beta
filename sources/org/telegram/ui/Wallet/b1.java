package org.telegram.ui.Wallet;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.tl.TL_wallet;
public final class b1 implements Predicate {
    public final int f34708a;
    public final TL_wallet.tonConnectSession f34709b;

    public b1(TL_wallet.tonConnectSession tonconnectsession, int i10) {
        this.f34708a = i10;
        this.f34709b = tonconnectsession;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f34708a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f34708a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f34708a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
        switch (this.f34708a) {
            case 0:
                if (tonconnectsession.f20329id == this.f34709b.f20329id) {
                    return true;
                }
                return false;
            default:
                if (tonconnectsession.f20329id == this.f34709b.f20329id) {
                    return true;
                }
                return false;
        }
    }
}
