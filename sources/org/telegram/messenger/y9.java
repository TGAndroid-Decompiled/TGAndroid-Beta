package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import j$.util.Comparator$CC;
import j$.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.z70;
public final class y9 extends f1 {
    public static volatile y9[] h = new y9[4];
    public final androidx.activity.o f19565a;
    public final LongSparseArray f19566b;
    public final ArrayList f19567c;
    public boolean d;
    public final LongSparseArray e;
    public final je.b f19568f;

    public y9(int i10) {
        super(i10);
        this.f19565a = new androidx.activity.o(2);
        this.f19566b = new LongSparseArray();
        this.f19567c = new ArrayList();
        this.e = new LongSparseArray();
        this.f19568f = new je.b(false, true);
    }

    public static y9 c(int i10) {
        y9 y9Var;
        y9 y9Var2 = h[i10];
        if (y9Var2 == null) {
            synchronized (y9.class) {
                try {
                    y9Var = h[i10];
                    if (y9Var == null) {
                        y9[] y9VarArr = h;
                        y9 y9Var3 = new y9(i10);
                        y9VarArr[i10] = y9Var3;
                        y9Var = y9Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return y9Var;
        }
        return y9Var2;
    }

    public final void a(TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        v9 d = d(starGift.f20022id);
        u9 u9Var = d.f18599b;
        if (u9Var == null) {
            u9 u9Var2 = new u9(this.currentAccount, starGift, starGiftAuctionState, tL_StarGiftAuctionUserState);
            d.f18599b = u9Var2;
            u9Var2.h = d.f18600c;
        } else {
            u9Var.d = starGift;
            u9Var.a(starGiftAuctionState);
            u9 u9Var3 = d.f18599b;
            u9Var3.e = tL_StarGiftAuctionUserState;
            u9Var3.h();
        }
        o();
        g(starGift.f20022id);
    }

    public final u9 b(long j10) {
        v9 v9Var = (v9) this.f19566b.get(j10);
        if (v9Var != null) {
            return v9Var.f18599b;
        }
        return null;
    }

    public final v9 d(long j10) {
        LongSparseArray longSparseArray = this.f19566b;
        v9 v9Var = (v9) longSparseArray.get(j10);
        if (v9Var == null) {
            v9 v9Var2 = new v9(j10);
            longSparseArray.put(j10, v9Var2);
            return v9Var2;
        }
        return v9Var;
    }

    public final void e(long j10, r20 r20Var) {
        u9 u9Var;
        v9 v9Var = (v9) this.f19566b.get(j10);
        if (v9Var != null && (u9Var = v9Var.f18599b) != null) {
            ArrayList arrayList = v9Var.f18602g;
            if (arrayList != null && u9Var.e.acquired_count == arrayList.size()) {
                r20Var.a(v9Var.f18602g);
                return;
            }
            TL_payments.TL_getStarGiftAuctionAcquiredGifts tL_getStarGiftAuctionAcquiredGifts = new TL_payments.TL_getStarGiftAuctionAcquiredGifts();
            tL_getStarGiftAuctionAcquiredGifts.gift_id = j10;
            getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionAcquiredGifts, new a3.b(1), new p9(this, r20Var, v9Var));
            return;
        }
        r20Var.a(null);
    }

    public final void f(long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        a(tL_StarGiftAuctionState.gift, tL_StarGiftAuctionState.state, tL_StarGiftAuctionState.user_state);
        v9 v9Var = (v9) this.f19566b.get(j10);
        if (v9Var != null && v9Var.e) {
            d4 d4Var = new d4(this, v9Var, j10, 11);
            v9Var.d = d4Var;
            i0.h3(d4Var, tL_StarGiftAuctionState.timeout * 1000);
        }
    }

    public final void g(long j10) {
        Iterator it;
        u9 b10 = b(j10);
        androidx.activity.o oVar = this.f19565a;
        Long valueOf = Long.valueOf(j10);
        synchronized (((HashMap) oVar.d)) {
            try {
                je.b bVar = (je.b) ((HashMap) oVar.d).get(valueOf);
                if (bVar != null) {
                    it = bVar.iterator();
                } else {
                    it = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (b10 != null && it != null) {
            while (it.hasNext()) {
                ((x9) it.next()).c(b10);
            }
        }
    }

    public final void h(TL_update.TL_updateStarGiftAuctionState tL_updateStarGiftAuctionState) {
        u9 u9Var;
        v9 v9Var = (v9) this.f19566b.get(tL_updateStarGiftAuctionState.gift_id);
        if (v9Var != null && (u9Var = v9Var.f18599b) != null && u9Var.a(tL_updateStarGiftAuctionState.state)) {
            o();
            g(v9Var.f18598a);
        }
    }

    public final void i(TL_update.TL_updateStarGiftAuctionUserState tL_updateStarGiftAuctionUserState) {
        u9 u9Var;
        v9 v9Var = (v9) this.f19566b.get(tL_updateStarGiftAuctionUserState.gift_id);
        if (v9Var != null && (u9Var = v9Var.f18599b) != null) {
            u9Var.e = tL_updateStarGiftAuctionUserState.user_state;
            u9Var.h();
            o();
            g(v9Var.f18598a);
        }
    }

    public final void j(long j10, r20 r20Var) {
        TL_stars.getStarGiftUpgradeAttributes getstargiftupgradeattributes = new TL_stars.getStarGiftUpgradeAttributes();
        getstargiftupgradeattributes.gift_id = j10;
        getConnectionsManager().sendRequestTyped(getstargiftupgradeattributes, new a3.b(1), new t9(r20Var, 0));
    }

    public final void k(long j10, ph.l lVar, long j11, z70 z70Var) {
        boolean z10;
        v9 v9Var = (v9) this.f19566b.get(j10);
        if (v9Var != null && !v9Var.f18601f) {
            if (!rh.e6.y(this.currentAccount, false).e) {
                rh.e6.y(this.currentAccount, false).r(new n9(this, z70Var, j10, lVar, j11));
                return;
            }
            u9 u9Var = v9Var.f18599b;
            if (u9Var != null && u9Var.e.bid_amount > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            v9Var.f18601f = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            TLRPC.TL_inputInvoiceStarGiftAuctionBid tL_inputInvoiceStarGiftAuctionBid = new TLRPC.TL_inputInvoiceStarGiftAuctionBid();
            tL_inputInvoiceStarGiftAuctionBid.gift_id = j10;
            tL_inputInvoiceStarGiftAuctionBid.bid_amount = j11;
            tL_inputInvoiceStarGiftAuctionBid.update_bid = z10;
            if (lVar != null) {
                long j12 = lVar.f45183a;
                if (j12 == 0) {
                    tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    tL_inputInvoiceStarGiftAuctionBid.peer = getMessagesController().i1(j12);
                }
                tL_inputInvoiceStarGiftAuctionBid.message = lVar.f45185c;
                tL_inputInvoiceStarGiftAuctionBid.hide_name = lVar.f45184b;
            } else if (!z10) {
                tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
                tL_inputInvoiceStarGiftAuctionBid.hide_name = false;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftAuctionBid;
            getConnectionsManager().sendRequestTyped(tL_payments_getPaymentForm, new a3.b(1), new o9(this, z70Var, v9Var, tL_payments_getPaymentForm, 0));
            return;
        }
        z70Var.a(Boolean.FALSE, null);
    }

    public final u9 l(long j10, x9 x9Var) {
        androidx.activity.o oVar = this.f19565a;
        Long valueOf = Long.valueOf(j10);
        synchronized (((HashMap) oVar.d)) {
            try {
                je.b bVar = (je.b) ((HashMap) oVar.d).get(valueOf);
                if (bVar == null) {
                    bVar = (je.b) oVar.f954c;
                    if (bVar != null) {
                        oVar.f954c = bVar.h;
                        bVar.h = null;
                    } else {
                        bVar = new je.b(false, oVar.f953b);
                    }
                    ((HashMap) oVar.d).put(valueOf, bVar);
                }
                bVar.add(x9Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m(j10);
        return b(j10);
    }

    public final void m(long j10) {
        v9 d = d(j10);
        d.e = true;
        d4 d4Var = d.d;
        if (d4Var != null) {
            i0.r(d4Var);
            d.d = null;
        }
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = d.f18598a;
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        u9 u9Var = d.f18599b;
        int i10 = 0;
        if (u9Var != null) {
            if (u9Var.f()) {
                i10 = Integer.MAX_VALUE;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = u9Var.f18405f;
                if (tL_starGiftAuctionState != null) {
                    i10 = tL_starGiftAuctionState.version;
                }
            }
        }
        tL_getStarGiftAuctionState.version = i10;
        getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new a3.b(1), new r9(this, j10));
    }

    public final void n(long j10, x9 x9Var) {
        androidx.activity.o oVar = this.f19565a;
        Long valueOf = Long.valueOf(j10);
        synchronized (((HashMap) oVar.d)) {
            try {
                je.b bVar = (je.b) ((HashMap) oVar.d).get(valueOf);
                if (bVar != null) {
                    bVar.remove(x9Var);
                    if (bVar.isEmpty()) {
                        ((HashMap) oVar.d).remove(valueOf);
                        bVar.h = (je.b) oVar.f954c;
                        oVar.f954c = bVar;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        v9 v9Var = (v9) this.f19566b.get(j10);
        if (v9Var != null) {
            v9Var.e = this.f19565a.b(Long.valueOf(j10));
            d4 d4Var = v9Var.d;
            if (d4Var != null) {
                i0.r(d4Var);
                v9Var.d = null;
            }
        }
    }

    public final void o() {
        SharedPreferences sharedPreferences = getMessagesController().f7;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("lastGiftAuctionTimeUpdate", System.currentTimeMillis()).apply();
        }
        ArrayList arrayList = this.f19567c;
        arrayList.clear();
        LongSparseArray longSparseArray = this.f19566b;
        int size = longSparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            v9 v9Var = (v9) longSparseArray.valueAt(i10);
            u9 u9Var = v9Var.f18599b;
            if (u9Var != null && !u9Var.f()) {
                u9 u9Var2 = v9Var.f18599b;
                if (u9Var2.e.bid_amount > 0) {
                    arrayList.add(u9Var2);
                }
            }
        }
        List.EL.sort(arrayList, Comparator$CC.comparingInt(new bi.t6(2)));
        Iterator it = this.f19568f.iterator();
        while (it.hasNext()) {
            ((w9) it.next()).g(arrayList);
        }
        at.f(this.currentAccount).k(at.Q3, new Object[0]);
    }
}
