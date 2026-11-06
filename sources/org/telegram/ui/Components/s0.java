package org.telegram.ui.Components;

import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s0 implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.q1 {
    public final int f37902a;
    public final Object f37903b;
    public final Object f37904c;
    public final Object d;
    public final Object f37905e;
    public final Object f37906f;
    public final Object h;

    public s0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f37902a = i7;
        this.f37903b = obj;
        this.f37904c = obj2;
        this.d = obj3;
        this.f37905e = obj4;
        this.f37906f = obj5;
        this.h = obj6;
    }

    @Override
    public void a(f5.f fVar, List list) {
        switch (this.f37902a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f37903b;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.f37906f;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.h;
                f5.h a10 = ((f5.l) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a10.f11156c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f37904c).currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new bi.c8((org.telegram.messenger.c20) this.f37905e, list, fVar, c20Var, f2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f37903b;
                wg.v vVar = (wg.v) this.f37906f;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) this.h;
                f5.h a11 = ((f5.l) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a11.f11156c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f37904c).currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new bi.c8((wg.v) this.f37905e, list, fVar, vVar, f2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f37902a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f37903b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.f37904c;
                org.telegram.ui.an anVar = (org.telegram.ui.an) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f37905e;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.f37906f;
                org.telegram.ui.Cells.c2[] c2VarArr = (org.telegram.ui.Cells.c2[]) this.h;
                if (user != null) {
                    org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(cVar.f21723a);
                    a02.f26688a.c(new org.telegram.messenger.vp(3, anVar.a(), user.f27101id, a02));
                } else {
                    org.telegram.messenger.yr a03 = org.telegram.messenger.yr.a0(cVar.f21723a);
                    a03.f26688a.c(new org.telegram.messenger.vp(3, anVar.a(), -chat.f26952id, a03));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = ijVar.f1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (c2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (anVar.getParentActivity() != null) {
                        anVar.f8();
                        UndoView undoView = anVar.M3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(cVar.f21723a).sendRequest(tL_contacts_blockFromReplies, new x1(cVar, 0));
                return;
            default:
                org.telegram.ui.kj0 kj0Var = (org.telegram.ui.kj0) this.f37903b;
                org.telegram.ui.bk0 bk0Var = kj0Var.f47178a;
                bk0Var.Y[0].setText((String) this.f37904c);
                bk0Var.Y[1].setText((String) this.d);
                bk0Var.Y[2].setText((String) this.f37905e);
                bk0Var.R1(true, true);
                kj0Var.c((org.telegram.ui.ef0) this.f37906f, (m4.d0) this.h);
                return;
        }
    }

    public s0(TLRPC.User user, org.telegram.messenger.c cVar, org.telegram.ui.an anVar, TLRPC.Chat chat, org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.c2[] c2VarArr, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f37902a = 0;
        this.f37903b = user;
        this.f37904c = cVar;
        this.d = anVar;
        this.f37905e = chat;
        this.f37906f = ijVar;
        this.h = c2VarArr;
    }
}
