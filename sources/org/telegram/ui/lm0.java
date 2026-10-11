package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class lm0 extends tu0 {
    public final mn0 f39734a;

    public lm0(mn0 mn0Var) {
        this.f39734a = mn0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        mn0 mn0Var = this.f39734a;
        int i11 = mn0Var.S0;
        if (i11 == 1) {
            secureDocument = mn0Var.f40040j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) mn0Var.f40042k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = mn0Var.l1;
        } else if (i11 == 3) {
            secureDocument = mn0Var.f40044m1;
        } else {
            secureDocument = (SecureDocument) mn0Var.f40038i1.get(i10);
        }
        kn0 kn0Var = (kn0) mn0Var.f40047n1.remove(secureDocument);
        if (kn0Var == null) {
            return;
        }
        String m12 = mn0.m1(secureDocument);
        int i12 = mn0Var.S0;
        String str = null;
        if (i12 == 1) {
            mn0Var.f40040j1 = null;
            str = sc.v.i("selfie", m12);
        } else if (i12 == 4) {
            str = sc.v.i("translation", m12);
        } else if (i12 == 2) {
            mn0Var.l1 = null;
            str = sc.v.i("front", m12);
        } else if (i12 == 3) {
            mn0Var.f40044m1 = null;
            str = sc.v.i("reverse", m12);
        } else if (i12 == 0) {
            str = sc.v.i("files", m12);
        }
        if (str != null) {
            HashMap hashMap = mn0Var.f40071x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = mn0Var.f40074y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        mn0Var.R1(mn0Var.S0);
        mn0Var.f40037i0.removeView(kn0Var);
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            mn0 mn0Var = this.f39734a;
            if (i10 < mn0Var.f40037i0.getChildCount()) {
                kn0 kn0Var = (kn0) mn0Var.f40037i0.getChildAt(i10);
                int[] iArr = new int[2];
                kn0Var.f39417c.getLocationInWindow(iArr);
                dv0 dv0Var = new dv0();
                dv0Var.f37148b = iArr[0];
                dv0Var.f37149c = iArr[1];
                dv0Var.d = mn0Var.f40037i0;
                ImageReceiver imageReceiver = kn0Var.f39417c.getImageReceiver();
                dv0Var.f37147a = imageReceiver;
                dv0Var.f37150e = imageReceiver.getBitmapSafe();
                return dv0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f39734a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
