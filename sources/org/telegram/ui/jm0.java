package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class jm0 extends ou0 {
    public final kn0 f37724a;

    public jm0(kn0 kn0Var) {
        this.f37724a = kn0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        kn0 kn0Var = this.f37724a;
        int i11 = kn0Var.S0;
        if (i11 == 1) {
            secureDocument = kn0Var.f38027j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) kn0Var.f38029k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = kn0Var.l1;
        } else if (i11 == 3) {
            secureDocument = kn0Var.f38031m1;
        } else {
            secureDocument = (SecureDocument) kn0Var.f38025i1.get(i10);
        }
        in0 in0Var = (in0) kn0Var.f38034n1.remove(secureDocument);
        if (in0Var == null) {
            return;
        }
        String n12 = kn0.n1(secureDocument);
        int i12 = kn0Var.S0;
        String str = null;
        if (i12 == 1) {
            kn0Var.f38027j1 = null;
            str = t8.b.i("selfie", n12);
        } else if (i12 == 4) {
            str = t8.b.i("translation", n12);
        } else if (i12 == 2) {
            kn0Var.l1 = null;
            str = t8.b.i("front", n12);
        } else if (i12 == 3) {
            kn0Var.f38031m1 = null;
            str = t8.b.i("reverse", n12);
        } else if (i12 == 0) {
            str = t8.b.i("files", n12);
        }
        if (str != null) {
            HashMap hashMap = kn0Var.f38058x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = kn0Var.f38061y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        kn0Var.S1(kn0Var.S0);
        kn0Var.f38024i0.removeView(in0Var);
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            kn0 kn0Var = this.f37724a;
            if (i10 < kn0Var.f38024i0.getChildCount()) {
                in0 in0Var = (in0) kn0Var.f38024i0.getChildAt(i10);
                int[] iArr = new int[2];
                in0Var.f37468c.getLocationInWindow(iArr);
                yu0 yu0Var = new yu0();
                yu0Var.f43620b = iArr[0];
                yu0Var.f43621c = iArr[1];
                yu0Var.d = kn0Var.f38024i0;
                ImageReceiver imageReceiver = in0Var.f37468c.getImageReceiver();
                yu0Var.f43619a = imageReceiver;
                yu0Var.f43622e = imageReceiver.getBitmapSafe();
                return yu0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f37724a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
