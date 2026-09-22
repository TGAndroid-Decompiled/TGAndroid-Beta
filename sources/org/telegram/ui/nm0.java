package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class nm0 extends tu0 {
    public final on0 f36016a;

    public nm0(on0 on0Var) {
        this.f36016a = on0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        on0 on0Var = this.f36016a;
        int i11 = on0Var.S0;
        if (i11 == 1) {
            secureDocument = on0Var.f36279j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) on0Var.f36281k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = on0Var.l1;
        } else if (i11 == 3) {
            secureDocument = on0Var.f36283m1;
        } else {
            secureDocument = (SecureDocument) on0Var.f36277i1.get(i10);
        }
        mn0 mn0Var = (mn0) on0Var.f36286n1.remove(secureDocument);
        if (mn0Var == null) {
            return;
        }
        String n12 = on0.n1(secureDocument);
        int i12 = on0Var.S0;
        String str = null;
        if (i12 == 1) {
            on0Var.f36279j1 = null;
            str = org.telegram.ui.Cells.q3.i("selfie", n12);
        } else if (i12 == 4) {
            str = org.telegram.ui.Cells.q3.i("translation", n12);
        } else if (i12 == 2) {
            on0Var.l1 = null;
            str = org.telegram.ui.Cells.q3.i("front", n12);
        } else if (i12 == 3) {
            on0Var.f36283m1 = null;
            str = org.telegram.ui.Cells.q3.i("reverse", n12);
        } else if (i12 == 0) {
            str = org.telegram.ui.Cells.q3.i("files", n12);
        }
        if (str != null) {
            HashMap hashMap = on0Var.f36310x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = on0Var.f36313y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        on0Var.S1(on0Var.S0);
        on0Var.f36276i0.removeView(mn0Var);
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            on0 on0Var = this.f36016a;
            if (i10 < on0Var.f36276i0.getChildCount()) {
                mn0 mn0Var = (mn0) on0Var.f36276i0.getChildAt(i10);
                int[] iArr = new int[2];
                mn0Var.f35780c.getLocationInWindow(iArr);
                dv0 dv0Var = new dv0();
                dv0Var.f33097b = iArr[0];
                dv0Var.f33098c = iArr[1];
                dv0Var.d = on0Var.f36276i0;
                ImageReceiver imageReceiver = mn0Var.f35780c.getImageReceiver();
                dv0Var.f33096a = imageReceiver;
                dv0Var.e = imageReceiver.getBitmapSafe();
                return dv0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f36016a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
