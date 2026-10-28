package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class jm0 extends iu0 {
    public final kn0 f40563a;

    public jm0(kn0 kn0Var) {
        this.f40563a = kn0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        kn0 kn0Var = this.f40563a;
        int i11 = kn0Var.S0;
        if (i11 == 1) {
            secureDocument = kn0Var.f40858j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) kn0Var.f40860k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = kn0Var.l1;
        } else if (i11 == 3) {
            secureDocument = kn0Var.f40862m1;
        } else {
            secureDocument = (SecureDocument) kn0Var.f40856i1.get(i10);
        }
        in0 in0Var = (in0) kn0Var.f40865n1.remove(secureDocument);
        if (in0Var == null) {
            return;
        }
        String n12 = kn0.n1(secureDocument);
        int i12 = kn0Var.S0;
        String str = null;
        if (i12 == 1) {
            kn0Var.f40858j1 = null;
            str = org.telegram.ui.Components.b10.j("selfie", n12);
        } else if (i12 == 4) {
            str = org.telegram.ui.Components.b10.j("translation", n12);
        } else if (i12 == 2) {
            kn0Var.l1 = null;
            str = org.telegram.ui.Components.b10.j("front", n12);
        } else if (i12 == 3) {
            kn0Var.f40862m1 = null;
            str = org.telegram.ui.Components.b10.j("reverse", n12);
        } else if (i12 == 0) {
            str = org.telegram.ui.Components.b10.j("files", n12);
        }
        if (str != null) {
            HashMap hashMap = kn0Var.f40889x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = kn0Var.f40892y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        kn0Var.T1(kn0Var.S0);
        kn0Var.f40855i0.removeView(in0Var);
    }

    @Override
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            kn0 kn0Var = this.f40563a;
            if (i10 < kn0Var.f40855i0.getChildCount()) {
                in0 in0Var = (in0) kn0Var.f40855i0.getChildAt(i10);
                int[] iArr = new int[2];
                in0Var.f40217c.getLocationInWindow(iArr);
                su0 su0Var = new su0();
                su0Var.f43407b = iArr[0];
                su0Var.f43408c = iArr[1];
                su0Var.d = kn0Var.f40855i0;
                ImageReceiver imageReceiver = in0Var.f40217c.getImageReceiver();
                su0Var.f43406a = imageReceiver;
                su0Var.e = imageReceiver.getBitmapSafe();
                return su0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f40563a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
