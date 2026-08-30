package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class cm0 extends yt0 {
    public final dn0 f33391a;

    public cm0(dn0 dn0Var) {
        this.f33391a = dn0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        dn0 dn0Var = this.f33391a;
        int i11 = dn0Var.P0;
        if (i11 == 1) {
            secureDocument = dn0Var.f33699g1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) dn0Var.f33701h1.get(i10);
        } else if (i11 == 2) {
            secureDocument = dn0Var.f33703i1;
        } else if (i11 == 3) {
            secureDocument = dn0Var.f33705j1;
        } else {
            secureDocument = (SecureDocument) dn0Var.f33697f1.get(i10);
        }
        bn0 bn0Var = (bn0) dn0Var.f33707k1.remove(secureDocument);
        if (bn0Var == null) {
            return;
        }
        String n12 = dn0.n1(secureDocument);
        int i12 = dn0Var.P0;
        String str = null;
        if (i12 == 1) {
            dn0Var.f33699g1 = null;
            str = vh.v2.e("selfie", n12);
        } else if (i12 == 4) {
            str = vh.v2.e("translation", n12);
        } else if (i12 == 2) {
            dn0Var.f33703i1 = null;
            str = vh.v2.e("front", n12);
        } else if (i12 == 3) {
            dn0Var.f33705j1 = null;
            str = vh.v2.e("reverse", n12);
        } else if (i12 == 0) {
            str = vh.v2.e("files", n12);
        }
        if (str != null) {
            HashMap hashMap = dn0Var.f33728u1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = dn0Var.f33730v1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        dn0Var.S1(dn0Var.P0);
        dn0Var.f33696f0.removeView(bn0Var);
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        if (i10 >= 0) {
            dn0 dn0Var = this.f33391a;
            if (i10 < dn0Var.f33696f0.getChildCount()) {
                bn0 bn0Var = (bn0) dn0Var.f33696f0.getChildAt(i10);
                int[] iArr = new int[2];
                bn0Var.f32990c.getLocationInWindow(iArr);
                ju0 ju0Var = new ju0();
                ju0Var.f35496b = iArr[0];
                ju0Var.f35497c = iArr[1];
                ju0Var.d = dn0Var.f33696f0;
                ImageReceiver imageReceiver = bn0Var.f32990c.getImageReceiver();
                ju0Var.f35495a = imageReceiver;
                ju0Var.e = imageReceiver.getBitmapSafe();
                return ju0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f33391a.P0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
