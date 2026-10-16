package org.telegram.ui.Wallet;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.tl.TL_wallet;
public final class a1 implements Predicate {
    public final int f32615a;
    public final TL_wallet.tonConnectSession f32616b;

    public a1(TL_wallet.tonConnectSession tonconnectsession, int i10) {
        this.f32615a = i10;
        this.f32616b = tonconnectsession;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f32615a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f32615a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f32615a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
        switch (this.f32615a) {
            case 0:
                if (tonconnectsession.f19175id == this.f32616b.f19175id) {
                    return true;
                }
                return false;
            default:
                if (tonconnectsession.f19175id == this.f32616b.f19175id) {
                    return true;
                }
                return false;
        }
    }
}
