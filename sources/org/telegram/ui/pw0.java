package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class pw0 {
    public final TLRPC.TL_premiumSubscriptionOption f40307a;
    public int f40308b;
    public long f40309c;
    public long d;
    public long e;
    public c5.p f40310f;
    public c5.o f40311g;
    public int h;

    public pw0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f40307a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        c5.p pVar = this.f40310f;
        if (pVar != null && this.f40311g == null) {
            ArrayList arrayList = pVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c5.o oVar = (c5.o) obj;
                String str = ((c5.m) oVar.f4774b.f4772a.get(0)).d;
                int i11 = this.f40307a.months;
                if (i11 == 12) {
                    if (str.equals("P1Y")) {
                        this.f40311g = oVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.f40311g = oVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f40307a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f40310f != null) {
                a();
                c5.o oVar = this.f40311g;
                if (oVar == null) {
                    return "";
                }
                return ((c5.m) oVar.f4774b.f4772a.get(0)).f4771c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f40308b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.e != 0) {
                int i10 = (int) ((1.0d - (i() / this.e)) * 100.0d);
                this.f40308b = i10;
                if (i10 == 0) {
                    this.f40308b = -1;
                }
            }
        }
        return this.f40308b;
    }

    public final String d() {
        if (!BuildVars.useInvoiceBilling() && this.f40307a.store_product != null) {
            if (this.f40310f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(g(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(g(), b());
    }

    public final String e() {
        if (!BuildVars.useInvoiceBilling() && this.f40307a.store_product != null) {
            if (this.f40310f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(h(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(h(), b());
    }

    public final String f() {
        if (!BuildVars.useInvoiceBilling() && this.f40307a.store_product != null) {
            if (this.f40310f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(i(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(i(), b());
    }

    public final long g() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f40307a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f40310f != null) {
                a();
                c5.o oVar = this.f40311g;
                if (oVar == null) {
                    return 0L;
                }
                return ((c5.m) oVar.f4774b.f4772a.get(0)).f4770b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f40309c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f40309c = g10 / this.f40307a.months;
            }
        }
        return this.f40309c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f40307a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
