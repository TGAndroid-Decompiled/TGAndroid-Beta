package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class im0 extends ou0 {
    public final jn0 f34503a;

    public im0(jn0 jn0Var) {
        this.f34503a = jn0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        jn0 jn0Var = this.f34503a;
        int i11 = jn0Var.S0;
        if (i11 == 1) {
            secureDocument = jn0Var.f34790j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) jn0Var.f34792k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = jn0Var.l1;
        } else if (i11 == 3) {
            secureDocument = jn0Var.f34794m1;
        } else {
            secureDocument = (SecureDocument) jn0Var.f34788i1.get(i10);
        }
        hn0 hn0Var = (hn0) jn0Var.f34797n1.remove(secureDocument);
        if (hn0Var == null) {
            return;
        }
        String n12 = jn0.n1(secureDocument);
        int i12 = jn0Var.S0;
        String str = null;
        if (i12 == 1) {
            jn0Var.f34790j1 = null;
            str = v7.k0.g("selfie", n12);
        } else if (i12 == 4) {
            str = v7.k0.g("translation", n12);
        } else if (i12 == 2) {
            jn0Var.l1 = null;
            str = v7.k0.g("front", n12);
        } else if (i12 == 3) {
            jn0Var.f34794m1 = null;
            str = v7.k0.g("reverse", n12);
        } else if (i12 == 0) {
            str = v7.k0.g("files", n12);
        }
        if (str != null) {
            HashMap hashMap = jn0Var.f34821x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = jn0Var.f34824y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        jn0Var.S1(jn0Var.S0);
        jn0Var.f34787i0.removeView(hn0Var);
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            jn0 jn0Var = this.f34503a;
            if (i10 < jn0Var.f34787i0.getChildCount()) {
                hn0 hn0Var = (hn0) jn0Var.f34787i0.getChildAt(i10);
                int[] iArr = new int[2];
                hn0Var.f34259c.getLocationInWindow(iArr);
                yu0 yu0Var = new yu0();
                yu0Var.f40326b = iArr[0];
                yu0Var.f40327c = iArr[1];
                yu0Var.d = jn0Var.f34787i0;
                ImageReceiver imageReceiver = hn0Var.f34259c.getImageReceiver();
                yu0Var.f40325a = imageReceiver;
                yu0Var.e = imageReceiver.getBitmapSafe();
                return yu0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f34503a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
