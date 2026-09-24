package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class fm0 extends lu0 {
    public final gn0 f33684a;

    public fm0(gn0 gn0Var) {
        this.f33684a = gn0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        gn0 gn0Var = this.f33684a;
        int i11 = gn0Var.S0;
        if (i11 == 1) {
            secureDocument = gn0Var.f33979j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) gn0Var.f33981k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = gn0Var.l1;
        } else if (i11 == 3) {
            secureDocument = gn0Var.f33983m1;
        } else {
            secureDocument = (SecureDocument) gn0Var.f33977i1.get(i10);
        }
        en0 en0Var = (en0) gn0Var.f33986n1.remove(secureDocument);
        if (en0Var == null) {
            return;
        }
        String n12 = gn0.n1(secureDocument);
        int i12 = gn0Var.S0;
        String str = null;
        if (i12 == 1) {
            gn0Var.f33979j1 = null;
            str = v7.j.g("selfie", n12);
        } else if (i12 == 4) {
            str = v7.j.g("translation", n12);
        } else if (i12 == 2) {
            gn0Var.l1 = null;
            str = v7.j.g("front", n12);
        } else if (i12 == 3) {
            gn0Var.f33983m1 = null;
            str = v7.j.g("reverse", n12);
        } else if (i12 == 0) {
            str = v7.j.g("files", n12);
        }
        if (str != null) {
            HashMap hashMap = gn0Var.f34010x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = gn0Var.f34013y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        gn0Var.S1(gn0Var.S0);
        gn0Var.f33976i0.removeView(en0Var);
    }

    @Override
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            gn0 gn0Var = this.f33684a;
            if (i10 < gn0Var.f33976i0.getChildCount()) {
                en0 en0Var = (en0) gn0Var.f33976i0.getChildAt(i10);
                int[] iArr = new int[2];
                en0Var.f33431c.getLocationInWindow(iArr);
                vu0 vu0Var = new vu0();
                vu0Var.f38805b = iArr[0];
                vu0Var.f38806c = iArr[1];
                vu0Var.d = gn0Var.f33976i0;
                ImageReceiver imageReceiver = en0Var.f33431c.getImageReceiver();
                vu0Var.f38804a = imageReceiver;
                vu0Var.e = imageReceiver.getBitmapSafe();
                return vu0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f33684a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
