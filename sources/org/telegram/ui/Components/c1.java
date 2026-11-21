package org.telegram.ui.Components;

import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c1 implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.q1 {
    public final int f33966a;
    public final Object f33967b;
    public final Object f33968c;
    public final Object d;
    public final Object f33969e;
    public final Object f33970f;
    public final Object h;

    public c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f33966a = i7;
        this.f33967b = obj;
        this.f33968c = obj2;
        this.d = obj3;
        this.f33969e = obj4;
        this.f33970f = obj5;
        this.h = obj6;
    }

    @Override
    public void a(f5.f fVar, List list) {
        switch (this.f33966a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f33967b;
                org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) this.f33970f;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.h;
                f5.i a10 = ((f5.m) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a10.f11318c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f33968c).currency)) * (a10.f11317b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new di.y6((org.telegram.messenger.x10) this.f33969e, list, fVar, x10Var, g2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f33967b;
                wg.v vVar = (wg.v) this.f33970f;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.h;
                f5.i a11 = ((f5.m) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a11.f11318c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f33968c).currency)) * (a11.f11317b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new di.y6((wg.v) this.f33969e, list, fVar, vVar, g2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f33966a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f33967b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.f33968c;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f33969e;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f33970f;
                org.telegram.ui.Cells.d2[] d2VarArr = (org.telegram.ui.Cells.d2[]) this.h;
                if (user != null) {
                    org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(cVar.f23246a);
                    a02.f27080a.c(new org.telegram.messenger.np(3, bnVar.a(), user.f28580id, a02));
                } else {
                    org.telegram.messenger.tr a03 = org.telegram.messenger.tr.a0(cVar.f23246a);
                    a03.f27080a.c(new org.telegram.messenger.np(3, bnVar.a(), -chat.f28431id, a03));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = fjVar.e1();
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
                ConnectionsManager.getInstance(cVar.f23246a).sendRequest(tL_contacts_blockFromReplies, new f2(cVar, 0));
                return;
            default:
                org.telegram.ui.qj0 qj0Var = (org.telegram.ui.qj0) this.f33967b;
                org.telegram.ui.hk0 hk0Var = qj0Var.f51291a;
                hk0Var.Z[0].setText((String) this.f33968c);
                hk0Var.Z[1].setText((String) this.d);
                hk0Var.Z[2].setText((String) this.f33969e);
                hk0Var.R1(true, true);
                qj0Var.c((org.telegram.ui.hf0) this.f33970f, (k8.a) this.h);
                return;
        }
    }

    public c1(TLRPC.User user, org.telegram.messenger.c cVar, org.telegram.ui.bn bnVar, TLRPC.Chat chat, org.telegram.messenger.fj fjVar, org.telegram.ui.Cells.d2[] d2VarArr, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f33966a = 0;
        this.f33967b = user;
        this.f33968c = cVar;
        this.d = bnVar;
        this.f33969e = chat;
        this.f33970f = fjVar;
        this.h = d2VarArr;
    }
}
