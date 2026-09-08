package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class om0 extends su0 {
    public final pn0 f39309a;

    public om0(pn0 pn0Var) {
        this.f39309a = pn0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        pn0 pn0Var = this.f39309a;
        int i11 = pn0Var.S0;
        if (i11 == 1) {
            secureDocument = pn0Var.f39599j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) pn0Var.f39601k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = pn0Var.l1;
        } else if (i11 == 3) {
            secureDocument = pn0Var.f39603m1;
        } else {
            secureDocument = (SecureDocument) pn0Var.f39597i1.get(i10);
        }
        nn0 nn0Var = (nn0) pn0Var.f39606n1.remove(secureDocument);
        if (nn0Var == null) {
            return;
        }
        String n12 = pn0.n1(secureDocument);
        int i12 = pn0Var.S0;
        String str = null;
        if (i12 == 1) {
            pn0Var.f39599j1 = null;
            str = org.telegram.ui.Cells.p6.i("selfie", n12);
        } else if (i12 == 4) {
            str = org.telegram.ui.Cells.p6.i("translation", n12);
        } else if (i12 == 2) {
            pn0Var.l1 = null;
            str = org.telegram.ui.Cells.p6.i("front", n12);
        } else if (i12 == 3) {
            pn0Var.f39603m1 = null;
            str = org.telegram.ui.Cells.p6.i("reverse", n12);
        } else if (i12 == 0) {
            str = org.telegram.ui.Cells.p6.i("files", n12);
        }
        if (str != null) {
            HashMap hashMap = pn0Var.f39630x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = pn0Var.f39633y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        pn0Var.S1(pn0Var.S0);
        pn0Var.f39596i0.removeView(nn0Var);
    }

    @Override
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            pn0 pn0Var = this.f39309a;
            if (i10 < pn0Var.f39596i0.getChildCount()) {
                nn0 nn0Var = (nn0) pn0Var.f39596i0.getChildAt(i10);
                int[] iArr = new int[2];
                nn0Var.f39017c.getLocationInWindow(iArr);
                cv0 cv0Var = new cv0();
                cv0Var.f35568b = iArr[0];
                cv0Var.f35569c = iArr[1];
                cv0Var.d = pn0Var.f39596i0;
                ImageReceiver imageReceiver = nn0Var.f39017c.getImageReceiver();
                cv0Var.f35567a = imageReceiver;
                cv0Var.f35570e = imageReceiver.getBitmapSafe();
                return cv0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f39309a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
