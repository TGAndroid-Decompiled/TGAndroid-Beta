package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class hw0 {
    public final TLRPC.TL_premiumSubscriptionOption f38943a;
    public int f38944b;
    public long f38945c;
    public long d;
    public long f38946e;
    public n2.l f38947f;
    public n2.k f38948g;
    public int h;

    public hw0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f38943a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        n2.l lVar = this.f38947f;
        if (lVar != null && this.f38948g == null) {
            ArrayList arrayList = lVar.h;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                n2.k kVar = (n2.k) obj;
                String str = ((n2.j) ((ArrayList) kVar.f18332b.f17378b).get(0)).d;
                int i10 = this.f38943a.months;
                if (i10 == 12) {
                    if (str.equals("P1Y")) {
                        this.f38948g = kVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i10 + "M")) {
                        this.f38948g = kVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f38943a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f38947f != null) {
                a();
                n2.k kVar = this.f38948g;
                if (kVar == null) {
                    return "";
                }
                return ((n2.j) ((ArrayList) kVar.f18332b.f17378b).get(0)).f18330c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f38944b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.f38946e != 0) {
                int i9 = (int) ((1.0d - (i() / this.f38946e)) * 100.0d);
                this.f38944b = i9;
                if (i9 == 0) {
                    this.f38944b = -1;
                }
            }
        }
        return this.f38944b;
    }

    public final String d() {
        if (!BuildVars.useInvoiceBilling() && this.f38943a.store_product != null) {
            if (this.f38947f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(g(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(g(), b());
    }

    public final String e() {
        if (!BuildVars.useInvoiceBilling() && this.f38943a.store_product != null) {
            if (this.f38947f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(h(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(h(), b());
    }

    public final String f() {
        if (!BuildVars.useInvoiceBilling() && this.f38943a.store_product != null) {
            if (this.f38947f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(i(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(i(), b());
    }

    public final long g() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f38943a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f38947f != null) {
                a();
                n2.k kVar = this.f38948g;
                if (kVar == null) {
                    return 0L;
                }
                return ((n2.j) ((ArrayList) kVar.f18332b.f17378b).get(0)).f18329b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f38945c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f38945c = g10 / this.f38943a.months;
            }
        }
        return this.f38945c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f38943a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
