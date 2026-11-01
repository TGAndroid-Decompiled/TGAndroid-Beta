package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
public final class zg implements Runnable {
    public final int f19710a = 1;
    public final boolean f19711b;
    public final Object f19712c;
    public final f1 d;
    public final Object e;
    public final Object f19713f;
    public final Object h;
    public final Object f19714n;
    public final Object f19715r;

    public zg(i5 i5Var, HashMap hashMap, HashMap hashMap2, boolean z10, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.d = i5Var;
        this.e = hashMap;
        this.f19713f = hashMap2;
        this.f19711b = z10;
        this.h = hashMap3;
        this.f19712c = arrayList;
        this.f19714n = hashMap4;
        this.f19715r = zArr;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f19710a) {
            case 0:
                vi viVar = (vi) this.d;
                boolean z11 = this.f19711b;
                ArrayList arrayList = (ArrayList) this.f19713f;
                ArrayList arrayList2 = (ArrayList) this.h;
                a0.h hVar = (a0.h) this.f19714n;
                a0.h hVar2 = (a0.h) this.f19715r;
                viVar.getMessagesController().V3((ArrayList) this.f19712c, z11);
                viVar.getMessagesController().P3((ArrayList) this.e, z11);
                int size = arrayList.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i11);
                    if ((kj.o1(message) instanceof TLRPC.TL_messageMediaDocument) || (kj.o1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                        i10++;
                    }
                    int i12 = viVar.currentAccount;
                    if (i10 < 30) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList2.add(new kj(i12, message, hVar, hVar2, false, z10));
                }
                i0.g3(new ih(viVar, arrayList2, 0));
                return;
            case 1:
                i5 i5Var = (i5) this.d;
                boolean z12 = this.f19711b;
                HashMap hashMap = (HashMap) this.h;
                ArrayList arrayList3 = (ArrayList) this.f19712c;
                HashMap hashMap2 = (HashMap) this.f19714n;
                boolean[] zArr = (boolean[]) this.f19715r;
                i5Var.Z = (HashMap) this.e;
                i5Var.Y = (HashMap) this.f19713f;
                i5Var.e = false;
                i5Var.f16228r = true;
                if (z12) {
                    i5Var.h = true;
                }
                if (!i5Var.f16231x.isEmpty() && i5Var.h) {
                    i5Var.c(i5Var.f16231x, null, null, null);
                    i5Var.f16231x.clear();
                }
                i0.g3(new y4(i5Var, hashMap, arrayList3, hashMap2, 3));
                if (zArr[0]) {
                    Utilities.e.d(new a5(i5Var, 7), 300000L);
                    return;
                }
                return;
            default:
                rz rzVar = (rz) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f19712c;
                TLObject tLObject = (TLObject) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f19713f;
                boolean z13 = this.f19711b;
                kj kjVar = (kj) this.h;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.f19714n;
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.f19715r;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    rzVar.n0(z13, kjVar, keyboardButtonProto, twoStepVerificationActivity.q0(), twoStepVerificationActivity, unVar);
                    return;
                }
                return;
        }
    }

    public zg(vi viVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        this.d = viVar;
        this.f19712c = arrayList;
        this.f19711b = z10;
        this.e = arrayList2;
        this.f19713f = arrayList3;
        this.h = arrayList4;
        this.f19714n = hVar;
        this.f19715r = hVar2;
    }

    public zg(rz rzVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, kj kjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.un unVar) {
        this.d = rzVar;
        this.f19712c = tL_error;
        this.e = tLObject;
        this.f19713f = twoStepVerificationActivity;
        this.f19711b = z10;
        this.h = kjVar;
        this.f19714n = keyboardButtonProto;
        this.f19715r = unVar;
    }
}
