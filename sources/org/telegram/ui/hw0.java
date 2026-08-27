package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;

public final class hw0 {

    public final TLRPC.TL_premiumSubscriptionOption f38895a;

    public int f38896b;

    public long f38897c;
    public long d;

    public long f38898e;

    public n2.l f38899f;

    public n2.k f38900g;
    public int h;

    public hw0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f38895a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        n2.l lVar = this.f38899f;
        if (lVar != null && this.f38900g == null) {
            ArrayList arrayList = lVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                n2.k kVar = (n2.k) obj;
                String str = ((n2.j) kVar.f18160b.f8872a.get(0)).d;
                int i11 = this.f38895a.months;
                if (i11 != 12) {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.f38900g = kVar;
                        return;
                    }
                } else if (str.equals("P1Y")) {
                    this.f38900g = kVar;
                    return;
                }
            }
        }
    }

    public final String b() {
        boolean zUseInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f38895a;
        if (zUseInvoiceBilling || tL_premiumSubscriptionOption.store_product == null) {
            return tL_premiumSubscriptionOption.currency;
        }
        if (this.f38899f == null) {
            return "";
        }
        a();
        n2.k kVar = this.f38900g;
        return kVar == null ? "" : ((n2.j) kVar.f18160b.f8872a.get(0)).f18158c;
    }

    public final int c() {
        if (this.f38896b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.f38898e != 0) {
                int i10 = (int) ((1.0d - (i() / this.f38898e)) * 100.0d);
                this.f38896b = i10;
                if (i10 == 0) {
                    this.f38896b = -1;
                }
            }
        }
        return this.f38896b;
    }

    public final String d() {
        if (BuildVars.useInvoiceBilling() || this.f38895a.store_product == null) {
            return BillingController.getInstance().formatCurrency(g(), b());
        }
        return this.f38899f == null ? "" : BillingController.getInstance().formatCurrency(g(), b(), 6);
    }

    public final String e() {
        if (BuildVars.useInvoiceBilling() || this.f38895a.store_product == null) {
            return BillingController.getInstance().formatCurrency(h(), b());
        }
        return this.f38899f == null ? "" : BillingController.getInstance().formatCurrency(h(), b(), 6);
    }

    public final String f() {
        if (BuildVars.useInvoiceBilling() || this.f38895a.store_product == null) {
            return BillingController.getInstance().formatCurrency(i(), b());
        }
        return this.f38899f == null ? "" : BillingController.getInstance().formatCurrency(i(), b(), 6);
    }

    public final long g() {
        boolean zUseInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f38895a;
        if (zUseInvoiceBilling || tL_premiumSubscriptionOption.store_product == null) {
            return tL_premiumSubscriptionOption.amount;
        }
        if (this.f38899f == null) {
            return 0L;
        }
        a();
        n2.k kVar = this.f38900g;
        if (kVar == null) {
            return 0L;
        }
        return ((n2.j) kVar.f18160b.f8872a.get(0)).f18157b;
    }

    public final long h() {
        if (this.f38897c == 0) {
            long jG = g();
            if (jG != 0) {
                this.f38897c = jG / ((long) this.f38895a.months);
            }
        }
        return this.f38897c;
    }

    public final long i() {
        if (this.d == 0) {
            long jG = g();
            if (jG != 0) {
                this.d = (long) ((jG / ((double) this.f38895a.months)) * 12.0d);
            }
        }
        return this.d;
    }
}
