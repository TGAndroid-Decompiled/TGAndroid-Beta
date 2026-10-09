package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class mm0 extends uu0 {
    public final nn0 f39943a;

    public mm0(nn0 nn0Var) {
        this.f39943a = nn0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        nn0 nn0Var = this.f39943a;
        int i11 = nn0Var.S0;
        if (i11 == 1) {
            secureDocument = nn0Var.f40262j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) nn0Var.f40264k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = nn0Var.l1;
        } else if (i11 == 3) {
            secureDocument = nn0Var.f40266m1;
        } else {
            secureDocument = (SecureDocument) nn0Var.f40260i1.get(i10);
        }
        ln0 ln0Var = (ln0) nn0Var.f40269n1.remove(secureDocument);
        if (ln0Var == null) {
            return;
        }
        String m12 = nn0.m1(secureDocument);
        int i12 = nn0Var.S0;
        String str = null;
        if (i12 == 1) {
            nn0Var.f40262j1 = null;
            str = sc.v.i("selfie", m12);
        } else if (i12 == 4) {
            str = sc.v.i("translation", m12);
        } else if (i12 == 2) {
            nn0Var.l1 = null;
            str = sc.v.i("front", m12);
        } else if (i12 == 3) {
            nn0Var.f40266m1 = null;
            str = sc.v.i("reverse", m12);
        } else if (i12 == 0) {
            str = sc.v.i("files", m12);
        }
        if (str != null) {
            HashMap hashMap = nn0Var.f40293x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = nn0Var.f40296y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        nn0Var.R1(nn0Var.S0);
        nn0Var.f40259i0.removeView(ln0Var);
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            nn0 nn0Var = this.f39943a;
            if (i10 < nn0Var.f40259i0.getChildCount()) {
                ln0 ln0Var = (ln0) nn0Var.f40259i0.getChildAt(i10);
                int[] iArr = new int[2];
                ln0Var.f39637c.getLocationInWindow(iArr);
                ev0 ev0Var = new ev0();
                ev0Var.f37355b = iArr[0];
                ev0Var.f37356c = iArr[1];
                ev0Var.d = nn0Var.f40259i0;
                ImageReceiver imageReceiver = ln0Var.f39637c.getImageReceiver();
                ev0Var.f37354a = imageReceiver;
                ev0Var.f37357e = imageReceiver.getBitmapSafe();
                return ev0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f39943a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
