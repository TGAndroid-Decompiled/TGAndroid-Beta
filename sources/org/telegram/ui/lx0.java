package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class lx0 {
    public final TLRPC.TL_premiumSubscriptionOption f35535a;
    public int f35536b;
    public long f35537c;
    public long d;
    public long e;
    public c5.o f35538f;
    public c5.n f35539g;
    public int h;

    public lx0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f35535a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        c5.o oVar = this.f35538f;
        if (oVar != null && this.f35539g == null) {
            ArrayList arrayList = oVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c5.n nVar = (c5.n) obj;
                String str = ((c5.l) nVar.f3915b.f3913a.get(0)).d;
                int i11 = this.f35535a.months;
                if (i11 == 12) {
                    if (str.equals("P1Y")) {
                        this.f35539g = nVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.f35539g = nVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f35535a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f35538f != null) {
                a();
                c5.n nVar = this.f35539g;
                if (nVar == null) {
                    return "";
                }
                return ((c5.l) nVar.f3915b.f3913a.get(0)).f3912c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f35536b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.e != 0) {
                int i10 = (int) ((1.0d - (i() / this.e)) * 100.0d);
                this.f35536b = i10;
                if (i10 == 0) {
                    this.f35536b = -1;
                }
            }
        }
        return this.f35536b;
    }

    public final String d() {
        if (!BuildVars.useInvoiceBilling() && this.f35535a.store_product != null) {
            if (this.f35538f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(g(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(g(), b());
    }

    public final String e() {
        if (!BuildVars.useInvoiceBilling() && this.f35535a.store_product != null) {
            if (this.f35538f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(h(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(h(), b());
    }

    public final String f() {
        if (!BuildVars.useInvoiceBilling() && this.f35535a.store_product != null) {
            if (this.f35538f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(i(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(i(), b());
    }

    public final long g() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f35535a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f35538f != null) {
                a();
                c5.n nVar = this.f35539g;
                if (nVar == null) {
                    return 0L;
                }
                return ((c5.l) nVar.f3915b.f3913a.get(0)).f3911b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f35537c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f35537c = g10 / this.f35535a.months;
            }
        }
        return this.f35537c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f35535a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
