package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class ms0 {
    public final TLRPC.TL_premiumSubscriptionOption f47776a;
    public int f47777b;
    public long f47778c;
    public long d;
    public long f47779e;
    public e5.l f47780f;
    public e5.k f47781g;
    public int h;

    public ms0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f47776a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        e5.l lVar = this.f47780f;
        if (lVar != null && this.f47781g == null) {
            ArrayList arrayList = lVar.h;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                e5.k kVar = (e5.k) obj;
                String str = ((e5.i) kVar.f9608b.f9606b.get(0)).d;
                int i10 = this.f47776a.months;
                if (i10 == 12) {
                    if (str.equals("P1Y")) {
                        this.f47781g = kVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i10 + "M")) {
                        this.f47781g = kVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean b10 = org.telegram.messenger.r2.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f47776a;
        if (!b10 && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f47780f != null) {
                a();
                e5.k kVar = this.f47781g;
                if (kVar == null) {
                    return "";
                }
                return ((e5.i) kVar.f9608b.f9606b.get(0)).f9604c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f47777b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.f47779e != 0) {
                int i3 = (int) ((1.0d - (i() / this.f47779e)) * 100.0d);
                this.f47777b = i3;
                if (i3 == 0) {
                    this.f47777b = -1;
                }
            }
        }
        return this.f47777b;
    }

    public final String d() {
        if (!org.telegram.messenger.r2.b() && this.f47776a.store_product != null) {
            if (this.f47780f == null) {
                return "";
            }
            org.telegram.messenger.r1 i3 = org.telegram.messenger.r1.i();
            long g7 = g();
            String b10 = b();
            i3.getClass();
            return org.telegram.messenger.r1.g(b10, 6, g7, false);
        }
        return org.telegram.messenger.r1.i().f(g(), b());
    }

    public final String e() {
        if (!org.telegram.messenger.r2.b() && this.f47776a.store_product != null) {
            if (this.f47780f == null) {
                return "";
            }
            org.telegram.messenger.r1 i3 = org.telegram.messenger.r1.i();
            long h = h();
            String b10 = b();
            i3.getClass();
            return org.telegram.messenger.r1.g(b10, 6, h, false);
        }
        return org.telegram.messenger.r1.i().f(h(), b());
    }

    public final String f() {
        if (!org.telegram.messenger.r2.b() && this.f47776a.store_product != null) {
            if (this.f47780f == null) {
                return "";
            }
            org.telegram.messenger.r1 i3 = org.telegram.messenger.r1.i();
            long i10 = i();
            String b10 = b();
            i3.getClass();
            return org.telegram.messenger.r1.g(b10, 6, i10, false);
        }
        return org.telegram.messenger.r1.i().f(i(), b());
    }

    public final long g() {
        boolean b10 = org.telegram.messenger.r2.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f47776a;
        if (!b10 && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f47780f != null) {
                a();
                e5.k kVar = this.f47781g;
                if (kVar == null) {
                    return 0L;
                }
                return ((e5.i) kVar.f9608b.f9606b.get(0)).f9603b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f47778c == 0) {
            long g7 = g();
            if (g7 != 0) {
                this.f47778c = g7 / this.f47776a.months;
            }
        }
        return this.f47778c;
    }

    public final long i() {
        if (this.d == 0) {
            long g7 = g();
            if (g7 != 0) {
                this.d = (long) ((g7 / this.f47776a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
