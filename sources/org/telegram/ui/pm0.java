package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class pm0 extends vu0 {
    public final qn0 f36658a;

    public pm0(qn0 qn0Var) {
        this.f36658a = qn0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        qn0 qn0Var = this.f36658a;
        int i11 = qn0Var.S0;
        if (i11 == 1) {
            secureDocument = qn0Var.f36965j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) qn0Var.f36967k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = qn0Var.l1;
        } else if (i11 == 3) {
            secureDocument = qn0Var.f36969m1;
        } else {
            secureDocument = (SecureDocument) qn0Var.f36963i1.get(i10);
        }
        on0 on0Var = (on0) qn0Var.f36972n1.remove(secureDocument);
        if (on0Var == null) {
            return;
        }
        String n12 = qn0.n1(secureDocument);
        int i12 = qn0Var.S0;
        String str = null;
        if (i12 == 1) {
            qn0Var.f36965j1 = null;
            str = org.telegram.ui.Cells.p6.i("selfie", n12);
        } else if (i12 == 4) {
            str = org.telegram.ui.Cells.p6.i("translation", n12);
        } else if (i12 == 2) {
            qn0Var.l1 = null;
            str = org.telegram.ui.Cells.p6.i("front", n12);
        } else if (i12 == 3) {
            qn0Var.f36969m1 = null;
            str = org.telegram.ui.Cells.p6.i("reverse", n12);
        } else if (i12 == 0) {
            str = org.telegram.ui.Cells.p6.i("files", n12);
        }
        if (str != null) {
            HashMap hashMap = qn0Var.f36996x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = qn0Var.f36999y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        qn0Var.S1(qn0Var.S0);
        qn0Var.f36962i0.removeView(on0Var);
    }

    @Override
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            qn0 qn0Var = this.f36658a;
            if (i10 < qn0Var.f36962i0.getChildCount()) {
                on0 on0Var = (on0) qn0Var.f36962i0.getChildAt(i10);
                int[] iArr = new int[2];
                on0Var.f36388c.getLocationInWindow(iArr);
                fv0 fv0Var = new fv0();
                fv0Var.f33764b = iArr[0];
                fv0Var.f33765c = iArr[1];
                fv0Var.d = qn0Var.f36962i0;
                ImageReceiver imageReceiver = on0Var.f36388c.getImageReceiver();
                fv0Var.f33763a = imageReceiver;
                fv0Var.e = imageReceiver.getBitmapSafe();
                return fv0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String a0() {
        if (this.f36658a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
