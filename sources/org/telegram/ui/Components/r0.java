package org.telegram.ui.Components;

import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class r0 implements org.telegram.ui.ActionBar.p1, org.telegram.messenger.q1 {
    public final int f37580a;
    public final Object f37581b;
    public final Object f37582c;
    public final Object d;
    public final Object f37583e;
    public final Object f37584f;
    public final Object h;

    public r0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i3) {
        this.f37580a = i3;
        this.f37581b = obj;
        this.f37582c = obj2;
        this.d = obj3;
        this.f37583e = obj4;
        this.f37584f = obj5;
        this.h = obj6;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f37580a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f37581b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.f37582c;
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f37583e;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.f37584f;
                org.telegram.ui.Cells.c2[] c2VarArr = (org.telegram.ui.Cells.c2[]) this.h;
                if (user != null) {
                    org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(cVar.f21919a);
                    a02.f24934a.c(new org.telegram.messenger.mp(3, wmVar.a(), user.f27150id, a02));
                } else {
                    org.telegram.messenger.qr a03 = org.telegram.messenger.qr.a0(cVar.f21919a);
                    a03.f24934a.c(new org.telegram.messenger.mp(3, wmVar.a(), -chat.f27001id, a03));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = ziVar.f1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (c2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (wmVar.getParentActivity() != null) {
                        wmVar.f8();
                        UndoView undoView = wmVar.N3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(cVar.f21919a).sendRequest(tL_contacts_blockFromReplies, new w1(cVar, 0));
                return;
            default:
                org.telegram.ui.hj0 hj0Var = (org.telegram.ui.hj0) this.f37581b;
                org.telegram.ui.yj0 yj0Var = hj0Var.f45928a;
                yj0Var.Z[0].setText((String) this.f37582c);
                yj0Var.Z[1].setText((String) this.d);
                yj0Var.Z[2].setText((String) this.f37583e);
                yj0Var.R1(true, true);
                hj0Var.c((org.telegram.ui.sg0) this.f37584f, (m2.t) this.h);
                return;
        }
    }

    @Override
    public void k(e5.f fVar, List list) {
        switch (this.f37580a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f37581b;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.f37584f;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.h;
                e5.h a10 = ((e5.l) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a10.f9598c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f37582c).currency)) * (a10.f9597b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new ci.d7((org.telegram.messenger.u10) this.f37583e, list, fVar, u10Var, d2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f37581b;
                xg.v vVar = (xg.v) this.f37584f;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.h;
                e5.h a11 = ((e5.l) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a11.f9598c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f37582c).currency)) * (a11.f9597b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new ci.d7((xg.v) this.f37583e, list, fVar, vVar, d2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                return;
        }
    }

    public r0(TLRPC.User user, org.telegram.messenger.c cVar, org.telegram.ui.wm wmVar, TLRPC.Chat chat, org.telegram.messenger.zi ziVar, org.telegram.ui.Cells.c2[] c2VarArr, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f37580a = 0;
        this.f37581b = user;
        this.f37582c = cVar;
        this.d = wmVar;
        this.f37583e = chat;
        this.f37584f = ziVar;
        this.h = c2VarArr;
    }
}
