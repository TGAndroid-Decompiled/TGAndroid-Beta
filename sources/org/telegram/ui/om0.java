package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class om0 extends wu0 {
    public final pn0 f40745a;

    public om0(pn0 pn0Var) {
        this.f40745a = pn0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        pn0 pn0Var = this.f40745a;
        int i11 = pn0Var.S0;
        if (i11 == 1) {
            secureDocument = pn0Var.f41025j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) pn0Var.f41027k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = pn0Var.l1;
        } else if (i11 == 3) {
            secureDocument = pn0Var.f41029m1;
        } else {
            secureDocument = (SecureDocument) pn0Var.f41023i1.get(i10);
        }
        nn0 nn0Var = (nn0) pn0Var.f41032n1.remove(secureDocument);
        if (nn0Var == null) {
            return;
        }
        String m12 = pn0.m1(secureDocument);
        int i12 = pn0Var.S0;
        String str = null;
        if (i12 == 1) {
            pn0Var.f41025j1 = null;
            str = sc.v.i("selfie", m12);
        } else if (i12 == 4) {
            str = sc.v.i("translation", m12);
        } else if (i12 == 2) {
            pn0Var.l1 = null;
            str = sc.v.i("front", m12);
        } else if (i12 == 3) {
            pn0Var.f41029m1 = null;
            str = sc.v.i("reverse", m12);
        } else if (i12 == 0) {
            str = sc.v.i("files", m12);
        }
        if (str != null) {
            HashMap hashMap = pn0Var.f41056x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = pn0Var.f41059y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        pn0Var.R1(pn0Var.S0);
        pn0Var.f41022i0.removeView(nn0Var);
    }

    @Override
    public final gv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            pn0 pn0Var = this.f40745a;
            if (i10 < pn0Var.f41022i0.getChildCount()) {
                nn0 nn0Var = (nn0) pn0Var.f41022i0.getChildAt(i10);
                int[] iArr = new int[2];
                nn0Var.f40443c.getLocationInWindow(iArr);
                gv0 gv0Var = new gv0();
                gv0Var.f38148b = iArr[0];
                gv0Var.f38149c = iArr[1];
                gv0Var.d = pn0Var.f41022i0;
                ImageReceiver imageReceiver = nn0Var.f40443c.getImageReceiver();
                gv0Var.f38147a = imageReceiver;
                gv0Var.f38150e = imageReceiver.getBitmapSafe();
                return gv0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f40745a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
