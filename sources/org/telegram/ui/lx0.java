package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class lx0 {
    public final TLRPC.TL_premiumSubscriptionOption f35558a;
    public int f35559b;
    public long f35560c;
    public long d;
    public long e;
    public c5.n f35561f;
    public c5.m f35562g;
    public int h;

    public lx0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f35558a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        c5.n nVar = this.f35561f;
        if (nVar != null && this.f35562g == null) {
            ArrayList arrayList = nVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c5.m mVar = (c5.m) obj;
                String str = ((c5.l) ((ArrayList) mVar.f3911b.f46056b).get(0)).d;
                int i11 = this.f35558a.months;
                if (i11 == 12) {
                    if (str.equals("P1Y")) {
                        this.f35562g = mVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.f35562g = mVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f35558a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f35561f != null) {
                a();
                c5.m mVar = this.f35562g;
                if (mVar == null) {
                    return "";
                }
                return ((c5.l) ((ArrayList) mVar.f3911b.f46056b).get(0)).f3909c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f35559b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.e != 0) {
                int i10 = (int) ((1.0d - (i() / this.e)) * 100.0d);
                this.f35559b = i10;
                if (i10 == 0) {
                    this.f35559b = -1;
                }
            }
        }
        return this.f35559b;
    }

    public final String d() {
        if (!BuildVars.useInvoiceBilling() && this.f35558a.store_product != null) {
            if (this.f35561f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(g(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(g(), b());
    }

    public final String e() {
        if (!BuildVars.useInvoiceBilling() && this.f35558a.store_product != null) {
            if (this.f35561f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(h(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(h(), b());
    }

    public final String f() {
        if (!BuildVars.useInvoiceBilling() && this.f35558a.store_product != null) {
            if (this.f35561f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(i(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(i(), b());
    }

    public final long g() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f35558a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f35561f != null) {
                a();
                c5.m mVar = this.f35562g;
                if (mVar == null) {
                    return 0L;
                }
                return ((c5.l) ((ArrayList) mVar.f3911b.f46056b).get(0)).f3908b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f35560c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f35560c = g10 / this.f35558a.months;
            }
        }
        return this.f35560c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f35558a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
