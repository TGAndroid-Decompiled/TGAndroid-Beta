package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class em0 extends lu0 {
    public final fn0 f33524a;

    public em0(fn0 fn0Var) {
        this.f33524a = fn0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        fn0 fn0Var = this.f33524a;
        int i11 = fn0Var.S0;
        if (i11 == 1) {
            secureDocument = fn0Var.f33810j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) fn0Var.f33812k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = fn0Var.l1;
        } else if (i11 == 3) {
            secureDocument = fn0Var.f33814m1;
        } else {
            secureDocument = (SecureDocument) fn0Var.f33808i1.get(i10);
        }
        dn0 dn0Var = (dn0) fn0Var.f33817n1.remove(secureDocument);
        if (dn0Var == null) {
            return;
        }
        String n12 = fn0.n1(secureDocument);
        int i12 = fn0Var.S0;
        String str = null;
        if (i12 == 1) {
            fn0Var.f33810j1 = null;
            str = v7.j.g("selfie", n12);
        } else if (i12 == 4) {
            str = v7.j.g("translation", n12);
        } else if (i12 == 2) {
            fn0Var.l1 = null;
            str = v7.j.g("front", n12);
        } else if (i12 == 3) {
            fn0Var.f33814m1 = null;
            str = v7.j.g("reverse", n12);
        } else if (i12 == 0) {
            str = v7.j.g("files", n12);
        }
        if (str != null) {
            HashMap hashMap = fn0Var.f33841x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = fn0Var.f33844y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        fn0Var.S1(fn0Var.S0);
        fn0Var.f33807i0.removeView(dn0Var);
    }

    @Override
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            fn0 fn0Var = this.f33524a;
            if (i10 < fn0Var.f33807i0.getChildCount()) {
                dn0 dn0Var = (dn0) fn0Var.f33807i0.getChildAt(i10);
                int[] iArr = new int[2];
                dn0Var.f33245c.getLocationInWindow(iArr);
                vu0 vu0Var = new vu0();
                vu0Var.f38908b = iArr[0];
                vu0Var.f38909c = iArr[1];
                vu0Var.d = fn0Var.f33807i0;
                ImageReceiver imageReceiver = dn0Var.f33245c.getImageReceiver();
                vu0Var.f38907a = imageReceiver;
                vu0Var.e = imageReceiver.getBitmapSafe();
                return vu0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f33524a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
