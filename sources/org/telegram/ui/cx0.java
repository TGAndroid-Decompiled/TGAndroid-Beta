package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;
public final class cx0 {
    public final TLRPC.TL_premiumSubscriptionOption f32813a;
    public int f32814b;
    public long f32815c;
    public long d;
    public long e;
    public c5.o f32816f;
    public c5.n f32817g;
    public int h;

    public cx0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.f32813a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        c5.o oVar = this.f32816f;
        if (oVar != null && this.f32817g == null) {
            ArrayList arrayList = oVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c5.n nVar = (c5.n) obj;
                String str = ((c5.l) nVar.f3906b.f3904a.get(0)).d;
                int i11 = this.f32813a.months;
                if (i11 == 12) {
                    if (str.equals("P1Y")) {
                        this.f32817g = nVar;
                        return;
                    }
                } else {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.f32817g = nVar;
                        return;
                    }
                }
            }
        }
    }

    public final String b() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f32813a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f32816f != null) {
                a();
                c5.n nVar = this.f32817g;
                if (nVar == null) {
                    return "";
                }
                return ((c5.l) nVar.f3906b.f3904a.get(0)).f3903c;
            }
            return "";
        }
        return tL_premiumSubscriptionOption.currency;
    }

    public final int c() {
        if (this.f32814b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.e != 0) {
                int i10 = (int) ((1.0d - (i() / this.e)) * 100.0d);
                this.f32814b = i10;
                if (i10 == 0) {
                    this.f32814b = -1;
                }
            }
        }
        return this.f32814b;
    }

    public final String d() {
        if (!BuildVars.useInvoiceBilling() && this.f32813a.store_product != null) {
            if (this.f32816f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(g(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(g(), b());
    }

    public final String e() {
        if (!BuildVars.useInvoiceBilling() && this.f32813a.store_product != null) {
            if (this.f32816f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(h(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(h(), b());
    }

    public final String f() {
        if (!BuildVars.useInvoiceBilling() && this.f32813a.store_product != null) {
            if (this.f32816f == null) {
                return "";
            }
            return BillingController.getInstance().formatCurrency(i(), b(), 6);
        }
        return BillingController.getInstance().formatCurrency(i(), b());
    }

    public final long g() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.f32813a;
        if (!useInvoiceBilling && tL_premiumSubscriptionOption.store_product != null) {
            if (this.f32816f != null) {
                a();
                c5.n nVar = this.f32817g;
                if (nVar == null) {
                    return 0L;
                }
                return ((c5.l) nVar.f3906b.f3904a.get(0)).f3902b;
            }
            return 0L;
        }
        return tL_premiumSubscriptionOption.amount;
    }

    public final long h() {
        if (this.f32815c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.f32815c = g10 / this.f32813a.months;
            }
        }
        return this.f32815c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.f32813a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
