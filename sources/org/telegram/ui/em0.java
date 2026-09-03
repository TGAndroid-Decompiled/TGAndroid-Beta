package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class em0 extends fu0 {
    public final fn0 f36524a;

    public em0(fn0 fn0Var) {
        this.f36524a = fn0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        fn0 fn0Var = this.f36524a;
        int i11 = fn0Var.P0;
        if (i11 == 1) {
            secureDocument = fn0Var.f36838g1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) fn0Var.f36840h1.get(i10);
        } else if (i11 == 2) {
            secureDocument = fn0Var.f36842i1;
        } else if (i11 == 3) {
            secureDocument = fn0Var.f36844j1;
        } else {
            secureDocument = (SecureDocument) fn0Var.f36836f1.get(i10);
        }
        dn0 dn0Var = (dn0) fn0Var.f36846k1.remove(secureDocument);
        if (dn0Var == null) {
            return;
        }
        String n12 = fn0.n1(secureDocument);
        int i12 = fn0Var.P0;
        String str = null;
        if (i12 == 1) {
            fn0Var.f36838g1 = null;
            str = yh.k("selfie", n12);
        } else if (i12 == 4) {
            str = yh.k("translation", n12);
        } else if (i12 == 2) {
            fn0Var.f36842i1 = null;
            str = yh.k("front", n12);
        } else if (i12 == 3) {
            fn0Var.f36844j1 = null;
            str = yh.k("reverse", n12);
        } else if (i12 == 0) {
            str = yh.k("files", n12);
        }
        if (str != null) {
            HashMap hashMap = fn0Var.f36867u1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = fn0Var.f36869v1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        fn0Var.S1(fn0Var.P0);
        fn0Var.f36835f0.removeView(dn0Var);
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        if (i10 >= 0) {
            fn0 fn0Var = this.f36524a;
            if (i10 < fn0Var.f36835f0.getChildCount()) {
                dn0 dn0Var = (dn0) fn0Var.f36835f0.getChildAt(i10);
                int[] iArr = new int[2];
                dn0Var.f36231c.getLocationInWindow(iArr);
                qu0 qu0Var = new qu0();
                qu0Var.f40679b = iArr[0];
                qu0Var.f40680c = iArr[1];
                qu0Var.d = fn0Var.f36835f0;
                ImageReceiver imageReceiver = dn0Var.f36231c.getImageReceiver();
                qu0Var.f40678a = imageReceiver;
                qu0Var.f40681e = imageReceiver.getBitmapSafe();
                return qu0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f36524a.P0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
