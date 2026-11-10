package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.TwoStepVerificationActivity;
public final class zg implements Runnable {
    public final int f26874a = 1;
    public final boolean f26875b;
    public final Object f26876c;
    public final c1 d;
    public final Object f26877e;
    public final Object f26878f;
    public final Object h;
    public final Object f26879n;
    public final Object f26880r;

    public zg(g5 g5Var, HashMap hashMap, HashMap hashMap2, boolean z9, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.d = g5Var;
        this.f26877e = hashMap;
        this.f26878f = hashMap2;
        this.f26875b = z9;
        this.h = hashMap3;
        this.f26876c = arrayList;
        this.f26879n = hashMap4;
        this.f26880r = zArr;
    }

    @Override
    public final void run() {
        boolean z9;
        switch (this.f26874a) {
            case 0:
                ui uiVar = (ui) this.d;
                boolean z10 = this.f26875b;
                ArrayList arrayList = (ArrayList) this.f26878f;
                ArrayList arrayList2 = (ArrayList) this.h;
                a0.h hVar = (a0.h) this.f26879n;
                a0.h hVar2 = (a0.h) this.f26880r;
                uiVar.getMessagesController().Y3((ArrayList) this.f26876c, z10);
                uiVar.getMessagesController().S3((ArrayList) this.f26877e, z10);
                int size = arrayList.size();
                int i7 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                    if ((ij.n1(message) instanceof TLRPC.TL_messageMediaDocument) || (ij.n1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                        i7++;
                    }
                    int i11 = uiVar.currentAccount;
                    if (i7 < 30) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    arrayList2.add(new ij(i11, message, hVar, hVar2, false, z9));
                }
                g0.h3(new jh(uiVar, arrayList2, 0));
                return;
            case 1:
                g5 g5Var = (g5) this.d;
                boolean z11 = this.f26875b;
                HashMap hashMap = (HashMap) this.h;
                ArrayList arrayList3 = (ArrayList) this.f26876c;
                HashMap hashMap2 = (HashMap) this.f26879n;
                boolean[] zArr = (boolean[]) this.f26880r;
                g5Var.Z = (HashMap) this.f26877e;
                g5Var.Y = (HashMap) this.f26878f;
                g5Var.f22611e = false;
                g5Var.f22622r = true;
                if (z11) {
                    g5Var.h = true;
                }
                if (!g5Var.f22625x.isEmpty() && g5Var.h) {
                    g5Var.c(g5Var.f22625x, null, null, null);
                    g5Var.f22625x.clear();
                }
                g0.h3(new u4(g5Var, hashMap, arrayList3, hashMap2, 3));
                if (zArr[0]) {
                    Utilities.f21341e.d(new k4(g5Var, 7), 300000L);
                    return;
                }
                return;
            default:
                gz gzVar = (gz) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f26876c;
                TLObject tLObject = (TLObject) this.f26877e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f26878f;
                boolean z12 = this.f26875b;
                ij ijVar = (ij) this.h;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.f26879n;
                org.telegram.ui.cn cnVar = (org.telegram.ui.cn) this.f26880r;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    gzVar.n0(z12, ijVar, keyboardButtonProto, twoStepVerificationActivity.q0(), twoStepVerificationActivity, cnVar);
                    return;
                }
                return;
        }
    }

    public zg(ui uiVar, ArrayList arrayList, boolean z9, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        this.d = uiVar;
        this.f26876c = arrayList;
        this.f26875b = z9;
        this.f26877e = arrayList2;
        this.f26878f = arrayList3;
        this.h = arrayList4;
        this.f26879n = hVar;
        this.f26880r = hVar2;
    }

    public zg(gz gzVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, ij ijVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.ui.cn cnVar) {
        this.d = gzVar;
        this.f26876c = tL_error;
        this.f26877e = tLObject;
        this.f26878f = twoStepVerificationActivity;
        this.f26875b = z9;
        this.h = ijVar;
        this.f26879n = keyboardButtonProto;
        this.f26880r = cnVar;
    }
}
