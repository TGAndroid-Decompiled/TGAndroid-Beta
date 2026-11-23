package org.telegram.ui.Components;

import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c1 implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.q1 {
    public final int f33959a;
    public final Object f33960b;
    public final Object f33961c;
    public final Object d;
    public final Object f33962e;
    public final Object f33963f;
    public final Object h;

    public c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f33959a = i7;
        this.f33960b = obj;
        this.f33961c = obj2;
        this.d = obj3;
        this.f33962e = obj4;
        this.f33963f = obj5;
        this.h = obj6;
    }

    @Override
    public void a(f5.f fVar, List list) {
        switch (this.f33959a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f33960b;
                org.telegram.messenger.y10 y10Var = (org.telegram.messenger.y10) this.f33963f;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.h;
                f5.i a10 = ((f5.m) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a10.f11321c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f33961c).currency)) * (a10.f11320b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new di.y6((org.telegram.messenger.y10) this.f33962e, list, fVar, y10Var, g2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f33960b;
                wg.v vVar = (wg.v) this.f33963f;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.h;
                f5.i a11 = ((f5.m) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a11.f11321c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f33961c).currency)) * (a11.f11320b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new di.y6((wg.v) this.f33962e, list, fVar, vVar, g2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f33959a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f33960b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.f33961c;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f33962e;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.f33963f;
                org.telegram.ui.Cells.d2[] d2VarArr = (org.telegram.ui.Cells.d2[]) this.h;
                if (user != null) {
                    org.telegram.messenger.ur a02 = org.telegram.messenger.ur.a0(cVar.f23202a);
                    a02.f27250a.c(new org.telegram.messenger.op(3, bnVar.a(), user.f28583id, a02));
                } else {
                    org.telegram.messenger.ur a03 = org.telegram.messenger.ur.a0(cVar.f23202a);
                    a03.f27250a.c(new org.telegram.messenger.op(3, bnVar.a(), -chat.f28434id, a03));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = gjVar.e1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (d2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (bnVar.getParentActivity() != null) {
                        bnVar.h8();
                        UndoView undoView = bnVar.N3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(cVar.f23202a).sendRequest(tL_contacts_blockFromReplies, new f2(cVar, 0));
                return;
            default:
                org.telegram.ui.qj0 qj0Var = (org.telegram.ui.qj0) this.f33960b;
                org.telegram.ui.hk0 hk0Var = qj0Var.f51295a;
                hk0Var.Z[0].setText((String) this.f33961c);
                hk0Var.Z[1].setText((String) this.d);
                hk0Var.Z[2].setText((String) this.f33962e);
                hk0Var.R1(true, true);
                qj0Var.c((org.telegram.ui.hf0) this.f33963f, (k8.a) this.h);
                return;
        }
    }

    public c1(TLRPC.User user, org.telegram.messenger.c cVar, org.telegram.ui.bn bnVar, TLRPC.Chat chat, org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.d2[] d2VarArr, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f33959a = 0;
        this.f33960b = user;
        this.f33961c = cVar;
        this.d = bnVar;
        this.f33962e = chat;
        this.f33963f = gjVar;
        this.h = d2VarArr;
    }
}
