package org.telegram.ui;

import android.view.View;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Predicate {
    public final int f48322a;
    public final long f48323b;

    public o8(long j3, int i7) {
        this.f48322a = i7;
        this.f48323b = j3;
    }

    public Predicate and(Predicate predicate) {
        int i7 = this.f48322a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f48322a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            case 2:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i7 = this.f48322a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f48322a) {
            case 0:
                if (((TLRPC.User) obj).f27105id == this.f48323b) {
                    return true;
                }
                return false;
            case 1:
                if (((TLRPC.User) obj).f27105id == this.f48323b) {
                    return true;
                }
                return false;
            case 2:
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    if (((TLRPC.User) tLObject).f27105id != this.f48323b) {
                        return true;
                    }
                } else if (tLObject instanceof TLRPC.Chat) {
                    return true ^ org.telegram.messenger.t3.N((TLRPC.Chat) tLObject);
                }
                return false;
            default:
                Map.Entry entry = (Map.Entry) obj;
                if (((View) entry.getKey()).isAttachedToWindow() && ((View) entry.getKey()).isShown() && ((View) entry.getKey()).getWindowVisibility() == 0) {
                    if (this.f48323b - ((Long) entry.getValue()).longValue() <= 300) {
                        return false;
                    }
                }
                return true;
        }
    }
}
