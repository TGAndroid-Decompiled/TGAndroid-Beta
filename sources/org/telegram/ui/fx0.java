package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class fx0 {
    public final TLRPC.TL_premiumSubscriptionOption f36427a;
    public int f36428b;
    public long f36429c;
    public long d;
    public long f36430e;
    public c5.o f36431f;
    public c5.n f36432g;
    public int h;

    public fx0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f36427a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        c5.o oVar = this.f36431f;
        if (oVar != null && this.f36432g == null) {
            ArrayList arrayList = oVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c5.n nVar = (c5.n) obj;
                String str = ((c5.l) nVar.f4226b.f4224a.get(0)).d;
                int i11 = this.f36427a.months;
                if (i11 == 12) {
                    if (str.equals("P1Y")) {
                        this.f36432g = nVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.f36432g = nVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f36427a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f36431f != null) {
                a();
                c5.n nVar = this.f36432g;
                if (nVar == null) {
                    return "";
                }
                return ((c5.l) nVar.f4226b.f4224a.get(0)).f4223c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f36428b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.f36430e != 0) {
                int i10 = (int) ((1.0d - (i() / this.f36430e)) * 100.0d);
                this.f36428b = i10;
                if (i10 == 0) {
                    this.f36428b = -1;
                }
            }
        }
        return this.f36428b;
    }

    public final String d() {
        if (!BuildVars.useInvoiceBilling() && this.f36427a.store_product != null) {
            if (this.f36431f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(g(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(g(), b());
    }

    public final String e() {
        if (!BuildVars.useInvoiceBilling() && this.f36427a.store_product != null) {
            if (this.f36431f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(h(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(h(), b());
    }

    public final String f() {
        if (!BuildVars.useInvoiceBilling() && this.f36427a.store_product != null) {
            if (this.f36431f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(i(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(i(), b());
    }

    public final long g() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f36427a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f36431f != null) {
                a();
                c5.n nVar = this.f36432g;
                if (nVar == null) {
                    return 0L;
                }
                return ((c5.l) nVar.f4226b.f4224a.get(0)).f4222b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f36429c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f36429c = g10 / this.f36427a.months;
            }
        }
        return this.f36429c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f36427a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
