package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
public final class yg implements Runnable {
    public final int f19382a = 1;
    public final boolean f19383b;
    public final Object f19384c;
    public final f1 d;
    public final Object e;
    public final Object f19385f;
    public final Object h;
    public final Object f19386n;
    public final Object f19387r;

    public yg(i5 i5Var, HashMap hashMap, HashMap hashMap2, boolean z10, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.d = i5Var;
        this.e = hashMap;
        this.f19385f = hashMap2;
        this.f19383b = z10;
        this.h = hashMap3;
        this.f19384c = arrayList;
        this.f19386n = hashMap4;
        this.f19387r = zArr;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f19382a) {
            case 0:
                ui uiVar = (ui) this.d;
                boolean z11 = this.f19383b;
                ArrayList arrayList = (ArrayList) this.f19385f;
                ArrayList arrayList2 = (ArrayList) this.h;
                a0.h hVar = (a0.h) this.f19386n;
                a0.h hVar2 = (a0.h) this.f19387r;
                uiVar.getMessagesController().V3((ArrayList) this.f19384c, z11);
                uiVar.getMessagesController().P3((ArrayList) this.e, z11);
                int size = arrayList.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i11);
                    if ((jj.o1(message) instanceof TLRPC.TL_messageMediaDocument) || (jj.o1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                        i10++;
                    }
                    int i12 = uiVar.currentAccount;
                    if (i10 < 30) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList2.add(new jj(i12, message, hVar, hVar2, false, z10));
                }
                i0.g3(new hh(uiVar, arrayList2, 0));
                return;
            case 1:
                i5 i5Var = (i5) this.d;
                boolean z12 = this.f19383b;
                HashMap hashMap = (HashMap) this.h;
                ArrayList arrayList3 = (ArrayList) this.f19384c;
                HashMap hashMap2 = (HashMap) this.f19386n;
                boolean[] zArr = (boolean[]) this.f19387r;
                i5Var.Z = (HashMap) this.e;
                i5Var.Y = (HashMap) this.f19385f;
                i5Var.e = false;
                i5Var.f16075r = true;
                if (z12) {
                    i5Var.h = true;
                }
                if (!i5Var.f16078x.isEmpty() && i5Var.h) {
                    i5Var.c(i5Var.f16078x, null, null, null);
                    i5Var.f16078x.clear();
                }
                i0.g3(new y4(i5Var, hashMap, arrayList3, hashMap2, 3));
                if (zArr[0]) {
                    Utilities.e.d(new a5(i5Var, 7), 300000L);
                    return;
                }
                return;
            default:
                qz qzVar = (qz) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f19384c;
                TLObject tLObject = (TLObject) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f19385f;
                boolean z13 = this.f19383b;
                jj jjVar = (jj) this.h;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.f19386n;
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.f19387r;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.q0(password);
                    qzVar.n0(z13, jjVar, keyboardButtonProto, twoStepVerificationActivity.p0(), twoStepVerificationActivity, unVar);
                    return;
                }
                return;
        }
    }

    public yg(ui uiVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        this.d = uiVar;
        this.f19384c = arrayList;
        this.f19383b = z10;
        this.e = arrayList2;
        this.f19385f = arrayList3;
        this.h = arrayList4;
        this.f19386n = hVar;
        this.f19387r = hVar2;
    }

    public yg(qz qzVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, jj jjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.un unVar) {
        this.d = qzVar;
        this.f19384c = tL_error;
        this.e = tLObject;
        this.f19385f = twoStepVerificationActivity;
        this.f19383b = z10;
        this.h = jjVar;
        this.f19386n = keyboardButtonProto;
        this.f19387r = unVar;
    }
}
