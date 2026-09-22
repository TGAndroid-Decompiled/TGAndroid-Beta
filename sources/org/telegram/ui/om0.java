package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class om0 extends tu0 {
    public final pn0 f36365a;

    public om0(pn0 pn0Var) {
        this.f36365a = pn0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        pn0 pn0Var = this.f36365a;
        int i11 = pn0Var.S0;
        if (i11 == 1) {
            secureDocument = pn0Var.f36647j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) pn0Var.f36649k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = pn0Var.l1;
        } else if (i11 == 3) {
            secureDocument = pn0Var.f36651m1;
        } else {
            secureDocument = (SecureDocument) pn0Var.f36645i1.get(i10);
        }
        nn0 nn0Var = (nn0) pn0Var.f36654n1.remove(secureDocument);
        if (nn0Var == null) {
            return;
        }
        String n12 = pn0.n1(secureDocument);
        int i12 = pn0Var.S0;
        String str = null;
        if (i12 == 1) {
            pn0Var.f36647j1 = null;
            str = v7.j0.g("selfie", n12);
        } else if (i12 == 4) {
            str = v7.j0.g("translation", n12);
        } else if (i12 == 2) {
            pn0Var.l1 = null;
            str = v7.j0.g("front", n12);
        } else if (i12 == 3) {
            pn0Var.f36651m1 = null;
            str = v7.j0.g("reverse", n12);
        } else if (i12 == 0) {
            str = v7.j0.g("files", n12);
        }
        if (str != null) {
            HashMap hashMap = pn0Var.f36678x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = pn0Var.f36681y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        pn0Var.S1(pn0Var.S0);
        pn0Var.f36644i0.removeView(nn0Var);
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            pn0 pn0Var = this.f36365a;
            if (i10 < pn0Var.f36644i0.getChildCount()) {
                nn0 nn0Var = (nn0) pn0Var.f36644i0.getChildAt(i10);
                int[] iArr = new int[2];
                nn0Var.f36083c.getLocationInWindow(iArr);
                dv0 dv0Var = new dv0();
                dv0Var.f33164b = iArr[0];
                dv0Var.f33165c = iArr[1];
                dv0Var.d = pn0Var.f36644i0;
                ImageReceiver imageReceiver = nn0Var.f36083c.getImageReceiver();
                dv0Var.f33163a = imageReceiver;
                dv0Var.e = imageReceiver.getBitmapSafe();
                return dv0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f36365a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
