package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class gw0 {
    public final TLRPC.TL_premiumSubscriptionOption f38677a;
    public int f38678b;
    public long f38679c;
    public long d;
    public long f38680e;
    public p2.l f38681f;
    public p2.k f38682g;
    public int h;

    public gw0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f38677a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        p2.l lVar = this.f38681f;
        if (lVar != null && this.f38682g == null) {
            ArrayList arrayList = lVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                p2.k kVar = (p2.k) obj;
                String str = ((p2.j) ((ArrayList) kVar.f45470b.f19159b).get(0)).d;
                int i11 = this.f38677a.months;
                if (i11 == 12) {
                    if (str.equals("P1Y")) {
                        this.f38682g = kVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.f38682g = kVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f38677a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f38681f != null) {
                a();
                p2.k kVar = this.f38682g;
                if (kVar == null) {
                    return "";
                }
                return ((p2.j) ((ArrayList) kVar.f45470b.f19159b).get(0)).f45468c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f38678b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.f38680e != 0) {
                int i10 = (int) ((1.0d - (i() / this.f38680e)) * 100.0d);
                this.f38678b = i10;
                if (i10 == 0) {
                    this.f38678b = -1;
                }
            }
        }
        return this.f38678b;
    }

    public final String d() {
        if (!BuildVars.useInvoiceBilling() && this.f38677a.store_product != null) {
            if (this.f38681f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(g(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(g(), b());
    }

    public final String e() {
        if (!BuildVars.useInvoiceBilling() && this.f38677a.store_product != null) {
            if (this.f38681f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(h(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(h(), b());
    }

    public final String f() {
        if (!BuildVars.useInvoiceBilling() && this.f38677a.store_product != null) {
            if (this.f38681f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(i(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(i(), b());
    }

    public final long g() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f38677a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f38681f != null) {
                a();
                p2.k kVar = this.f38682g;
                if (kVar == null) {
                    return 0L;
                }
                return ((p2.j) ((ArrayList) kVar.f45470b.f19159b).get(0)).f45467b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f38679c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f38679c = g10 / this.f38677a.months;
            }
        }
        return this.f38679c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f38677a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
