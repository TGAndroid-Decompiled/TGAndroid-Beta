package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class nm0 extends tu0 {
    public final on0 f35306a;

    public nm0(on0 on0Var) {
        this.f35306a = on0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        on0 on0Var = this.f35306a;
        int i11 = on0Var.S0;
        if (i11 == 1) {
            secureDocument = on0Var.f35540j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) on0Var.f35542k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = on0Var.l1;
        } else if (i11 == 3) {
            secureDocument = on0Var.f35544m1;
        } else {
            secureDocument = (SecureDocument) on0Var.f35538i1.get(i10);
        }
        mn0 mn0Var = (mn0) on0Var.f35547n1.remove(secureDocument);
        if (mn0Var == null) {
            return;
        }
        String n12 = on0.n1(secureDocument);
        int i12 = on0Var.S0;
        String str = null;
        if (i12 == 1) {
            on0Var.f35540j1 = null;
            str = org.telegram.ui.Cells.r6.i("selfie", n12);
        } else if (i12 == 4) {
            str = org.telegram.ui.Cells.r6.i("translation", n12);
        } else if (i12 == 2) {
            on0Var.l1 = null;
            str = org.telegram.ui.Cells.r6.i("front", n12);
        } else if (i12 == 3) {
            on0Var.f35544m1 = null;
            str = org.telegram.ui.Cells.r6.i("reverse", n12);
        } else if (i12 == 0) {
            str = org.telegram.ui.Cells.r6.i("files", n12);
        }
        if (str != null) {
            HashMap hashMap = on0Var.f35571x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = on0Var.f35574y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        on0Var.S1(on0Var.S0);
        on0Var.f35537i0.removeView(mn0Var);
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            on0 on0Var = this.f35306a;
            if (i10 < on0Var.f35537i0.getChildCount()) {
                mn0 mn0Var = (mn0) on0Var.f35537i0.getChildAt(i10);
                int[] iArr = new int[2];
                mn0Var.f35007c.getLocationInWindow(iArr);
                ev0 ev0Var = new ev0();
                ev0Var.f32617b = iArr[0];
                ev0Var.f32618c = iArr[1];
                ev0Var.d = on0Var.f35537i0;
                ImageReceiver imageReceiver = mn0Var.f35007c.getImageReceiver();
                ev0Var.f32616a = imageReceiver;
                ev0Var.e = imageReceiver.getBitmapSafe();
                return ev0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f35306a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
