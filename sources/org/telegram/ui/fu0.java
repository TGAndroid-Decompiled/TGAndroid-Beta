package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class fu0 {
    public final TLRPC.TL_premiumSubscriptionOption f37348a;
    public int f37349b;
    public long f37350c;
    public long d;
    public long e;
    public c5.m f37351f;
    public c5.l f37352g;
    public int h;

    public fu0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f37348a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        c5.m mVar = this.f37351f;
        if (mVar != null && this.f37352g == null) {
            ArrayList arrayList = mVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c5.l lVar = (c5.l) obj;
                String str = ((c5.j) lVar.f3798b.f3796a.get(0)).d;
                int i11 = this.f37348a.months;
                if (i11 == 12) {
                    if (str.equals("P1Y")) {
                        this.f37352g = lVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.f37352g = lVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean b10 = org.telegram.messenger.v2.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f37348a;
        if (!b10 && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f37351f != null) {
                a();
                c5.l lVar = this.f37352g;
                if (lVar == null) {
                    return "";
                }
                return ((c5.j) lVar.f3798b.f3796a.get(0)).f3795c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f37349b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.e != 0) {
                int i10 = (int) ((1.0d - (i() / this.e)) * 100.0d);
                this.f37349b = i10;
                if (i10 == 0) {
                    this.f37349b = -1;
                }
            }
        }
        return this.f37349b;
    }

    public final String d() {
        if (!org.telegram.messenger.v2.b() && this.f37348a.store_product != null) {
            if (this.f37351f == null) {
                return "";
            }
            org.telegram.messenger.u1 i10 = org.telegram.messenger.u1.i();
            long g10 = g();
            String b10 = b();
            i10.getClass();
            return org.telegram.messenger.u1.g(b10, 6, g10, false);
        }
        return org.telegram.messenger.u1.i().f(g(), b());
    }

    public final String e() {
        if (!org.telegram.messenger.v2.b() && this.f37348a.store_product != null) {
            if (this.f37351f == null) {
                return "";
            }
            org.telegram.messenger.u1 i10 = org.telegram.messenger.u1.i();
            long h = h();
            String b10 = b();
            i10.getClass();
            return org.telegram.messenger.u1.g(b10, 6, h, false);
        }
        return org.telegram.messenger.u1.i().f(h(), b());
    }

    public final String f() {
        if (!org.telegram.messenger.v2.b() && this.f37348a.store_product != null) {
            if (this.f37351f == null) {
                return "";
            }
            org.telegram.messenger.u1 i10 = org.telegram.messenger.u1.i();
            long i11 = i();
            String b10 = b();
            i10.getClass();
            return org.telegram.messenger.u1.g(b10, 6, i11, false);
        }
        return org.telegram.messenger.u1.i().f(i(), b());
    }

    public final long g() {
        boolean b10 = org.telegram.messenger.v2.b();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f37348a;
        if (!b10 && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f37351f != null) {
                a();
                c5.l lVar = this.f37352g;
                if (lVar == null) {
                    return 0L;
                }
                return ((c5.j) lVar.f3798b.f3796a.get(0)).f3794b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f37350c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f37350c = g10 / this.f37348a.months;
            }
        }
        return this.f37350c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f37348a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
