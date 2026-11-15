package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
public final class yg implements Runnable {
    public final int f27733a = 2;
    public final boolean f27734b;
    public final Object f27735c;
    public final c1 d;
    public final Object f27736e;
    public final Object f27737f;
    public final Object h;
    public final Object f27738n;
    public final Object f27739r;

    public yg(g5 g5Var, HashMap hashMap, HashMap hashMap2, boolean z10, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.d = g5Var;
        this.f27736e = hashMap;
        this.f27737f = hashMap2;
        this.f27734b = z10;
        this.h = hashMap3;
        this.f27735c = arrayList;
        this.f27738n = hashMap4;
        this.f27739r = zArr;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f27733a) {
            case 0:
                si siVar = (si) this.d;
                boolean z11 = this.f27734b;
                ArrayList arrayList = (ArrayList) this.f27737f;
                ArrayList arrayList2 = (ArrayList) this.h;
                a0.h hVar = (a0.h) this.f27738n;
                a0.h hVar2 = (a0.h) this.f27739r;
                siVar.getMessagesController().Y3((ArrayList) this.f27735c, z11);
                siVar.getMessagesController().S3((ArrayList) this.f27736e, z11);
                int size = arrayList.size();
                int i7 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                    if ((gj.n1(message) instanceof TLRPC.TL_messageMediaDocument) || (gj.n1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                        i7++;
                    }
                    int i11 = siVar.currentAccount;
                    if (i7 < 30) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList2.add(new gj(i11, message, hVar, hVar2, false, z10));
                }
                g0.h3(new hh(siVar, arrayList2, 0));
                return;
            case 1:
                g5 g5Var = (g5) this.d;
                boolean z12 = this.f27734b;
                HashMap hashMap = (HashMap) this.h;
                ArrayList arrayList3 = (ArrayList) this.f27735c;
                HashMap hashMap2 = (HashMap) this.f27738n;
                boolean[] zArr = (boolean[]) this.f27739r;
                g5Var.f23670a0 = (HashMap) this.f27736e;
                g5Var.Z = (HashMap) this.f27737f;
                g5Var.f23676e = false;
                g5Var.f23688r = true;
                if (z12) {
                    g5Var.h = true;
                }
                if (!g5Var.f23691x.isEmpty() && g5Var.h) {
                    g5Var.c(g5Var.f23691x, null, null, null);
                    g5Var.f23691x.clear();
                }
                g0.h3(new u4(g5Var, hashMap, arrayList3, hashMap2, 3));
                if (zArr[0]) {
                    Utilities.f22416e.d(new k4(g5Var, 7), 300000L);
                    return;
                }
                return;
            default:
                ez ezVar = (ez) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f27735c;
                TLObject tLObject = (TLObject) this.f27736e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f27737f;
                boolean z13 = this.f27734b;
                gj gjVar = (gj) this.h;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.f27738n;
                org.telegram.ui.an anVar = (org.telegram.ui.an) this.f27739r;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    ezVar.n0(z13, gjVar, keyboardButtonProto, twoStepVerificationActivity.q0(), twoStepVerificationActivity, anVar);
                    return;
                }
                return;
        }
    }

    public yg(si siVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        this.d = siVar;
        this.f27735c = arrayList;
        this.f27734b = z10;
        this.f27736e = arrayList2;
        this.f27737f = arrayList3;
        this.h = arrayList4;
        this.f27738n = hVar;
        this.f27739r = hVar2;
    }

    public yg(ez ezVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, gj gjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.an anVar) {
        this.d = ezVar;
        this.f27735c = tL_error;
        this.f27736e = tLObject;
        this.f27737f = twoStepVerificationActivity;
        this.f27734b = z10;
        this.h = gjVar;
        this.f27738n = keyboardButtonProto;
        this.f27739r = anVar;
    }
}
