package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class hm0 extends mu0 {
    public final in0 f33886a;

    public hm0(in0 in0Var) {
        this.f33886a = in0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        in0 in0Var = this.f33886a;
        int i11 = in0Var.S0;
        if (i11 == 1) {
            secureDocument = in0Var.f34185j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) in0Var.f34187k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = in0Var.l1;
        } else if (i11 == 3) {
            secureDocument = in0Var.f34189m1;
        } else {
            secureDocument = (SecureDocument) in0Var.f34183i1.get(i10);
        }
        gn0 gn0Var = (gn0) in0Var.f34192n1.remove(secureDocument);
        if (gn0Var == null) {
            return;
        }
        String n12 = in0.n1(secureDocument);
        int i12 = in0Var.S0;
        String str = null;
        if (i12 == 1) {
            in0Var.f34185j1 = null;
            str = org.telegram.ui.Cells.q3.i("selfie", n12);
        } else if (i12 == 4) {
            str = org.telegram.ui.Cells.q3.i("translation", n12);
        } else if (i12 == 2) {
            in0Var.l1 = null;
            str = org.telegram.ui.Cells.q3.i("front", n12);
        } else if (i12 == 3) {
            in0Var.f34189m1 = null;
            str = org.telegram.ui.Cells.q3.i("reverse", n12);
        } else if (i12 == 0) {
            str = org.telegram.ui.Cells.q3.i("files", n12);
        }
        if (str != null) {
            HashMap hashMap = in0Var.f34216x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = in0Var.f34219y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        in0Var.S1(in0Var.S0);
        in0Var.f34182i0.removeView(gn0Var);
    }

    @Override
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            in0 in0Var = this.f33886a;
            if (i10 < in0Var.f34182i0.getChildCount()) {
                gn0 gn0Var = (gn0) in0Var.f34182i0.getChildAt(i10);
                int[] iArr = new int[2];
                gn0Var.f33595c.getLocationInWindow(iArr);
                wu0 wu0Var = new wu0();
                wu0Var.f39095b = iArr[0];
                wu0Var.f39096c = iArr[1];
                wu0Var.d = in0Var.f34182i0;
                ImageReceiver imageReceiver = gn0Var.f33595c.getImageReceiver();
                wu0Var.f39094a = imageReceiver;
                wu0Var.e = imageReceiver.getBitmapSafe();
                return wu0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f33886a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
