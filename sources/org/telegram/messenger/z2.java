package org.telegram.messenger;

import android.util.Pair;
public final class z2 implements k20 {
    public final b3 f19658a;
    public final Pair f19659b;
    public final Object f19660c;
    public final int d;

    public z2(b3 b3Var, Pair pair, Object obj, int i10) {
        this.f19658a = b3Var;
        this.f19659b = pair;
        this.f19660c = obj;
        this.d = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Object obj3;
        Long l4 = (Long) obj;
        b3 b3Var = this.f19658a;
        Pair pair = this.f19659b;
        if (b3Var.i(pair)) {
            Object obj4 = this.f19660c;
            if (obj2 != null && b3Var.b(obj4)) {
                b3Var.a(pair, obj2);
                obj3 = obj2;
                i0.g3(new bi.n4((Object) b3Var, (Object) pair, obj3, false, 6));
            } else {
                obj3 = obj2;
            }
            long longValue = l4.longValue();
            int i10 = this.d;
            b3Var.f(i10, obj4, longValue, new a3(b3Var, pair, obj3, i10, obj4));
            return;
        }
        b3Var.a(pair, obj2);
        i0.g3(new bi.n4((Object) b3Var, (Object) pair, obj2, true, 6));
    }
}
