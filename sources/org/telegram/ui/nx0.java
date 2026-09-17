package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class nx0 {
    public final TLRPC.TL_premiumSubscriptionOption f36170a;
    public int f36171b;
    public long f36172c;
    public long d;
    public long e;
    public c5.o f36173f;
    public c5.n f36174g;
    public int h;

    public nx0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f36170a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        c5.o oVar = this.f36173f;
        if (oVar != null && this.f36174g == null) {
            ArrayList arrayList = oVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c5.n nVar = (c5.n) obj;
                String str = ((c5.l) nVar.f3914b.f3912a.get(0)).d;
                int i11 = this.f36170a.months;
                if (i11 == 12) {
                    if (str.equals("P1Y")) {
                        this.f36174g = nVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.f36174g = nVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f36170a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f36173f != null) {
                a();
                c5.n nVar = this.f36174g;
                if (nVar == null) {
                    return "";
                }
                return ((c5.l) nVar.f3914b.f3912a.get(0)).f3911c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f36171b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.e != 0) {
                int i10 = (int) ((1.0d - (i() / this.e)) * 100.0d);
                this.f36171b = i10;
                if (i10 == 0) {
                    this.f36171b = -1;
                }
            }
        }
        return this.f36171b;
    }

    public final String d() {
        if (!BuildVars.useInvoiceBilling() && this.f36170a.store_product != null) {
            if (this.f36173f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(g(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(g(), b());
    }

    public final String e() {
        if (!BuildVars.useInvoiceBilling() && this.f36170a.store_product != null) {
            if (this.f36173f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(h(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(h(), b());
    }

    public final String f() {
        if (!BuildVars.useInvoiceBilling() && this.f36170a.store_product != null) {
            if (this.f36173f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(i(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(i(), b());
    }

    public final long g() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f36170a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f36173f != null) {
                a();
                c5.n nVar = this.f36174g;
                if (nVar == null) {
                    return 0L;
                }
                return ((c5.l) nVar.f3914b.f3912a.get(0)).f3910b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f36172c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f36172c = g10 / this.f36170a.months;
            }
        }
        return this.f36172c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f36170a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
