package org.telegram.ui.Wallet;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.tl.TL_wallet;
public final class z0 implements Predicate {
    public final int f43403a;
    public final TL_wallet.tonConnectSession f43404b;

    public z0(TL_wallet.tonConnectSession tonconnectsession, int i7) {
        this.f43403a = i7;
        this.f43404b = tonconnectsession;
    }

    public Predicate and(Predicate predicate) {
        int i7 = this.f43403a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f43403a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i7 = this.f43403a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
        switch (this.f43403a) {
            case 0:
                if (tonconnectsession.f27218id == this.f43404b.f27218id) {
                    return true;
                }
                return false;
            default:
                if (tonconnectsession.f27218id == this.f43404b.f27218id) {
                    return true;
                }
                return false;
        }
    }
}
