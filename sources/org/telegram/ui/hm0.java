package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;
public final class hm0 extends gu0 {
    public final in0 f40038a;

    public hm0(in0 in0Var) {
        this.f40038a = in0Var;
    }

    @Override
    public final void B(int i10) {
        SecureDocument secureDocument;
        in0 in0Var = this.f40038a;
        int i11 = in0Var.S0;
        if (i11 == 1) {
            secureDocument = in0Var.f40295j1;
        } else if (i11 == 4) {
            secureDocument = (SecureDocument) in0Var.f40297k1.get(i10);
        } else if (i11 == 2) {
            secureDocument = in0Var.l1;
        } else if (i11 == 3) {
            secureDocument = in0Var.f40299m1;
        } else {
            secureDocument = (SecureDocument) in0Var.f40293i1.get(i10);
        }
        gn0 gn0Var = (gn0) in0Var.f40302n1.remove(secureDocument);
        if (gn0Var == null) {
            return;
        }
        String n12 = in0.n1(secureDocument);
        int i12 = in0Var.S0;
        String str = null;
        if (i12 == 1) {
            in0Var.f40295j1 = null;
            str = org.telegram.ui.Components.b10.j("selfie", n12);
        } else if (i12 == 4) {
            str = org.telegram.ui.Components.b10.j("translation", n12);
        } else if (i12 == 2) {
            in0Var.l1 = null;
            str = org.telegram.ui.Components.b10.j("front", n12);
        } else if (i12 == 3) {
            in0Var.f40299m1 = null;
            str = org.telegram.ui.Components.b10.j("reverse", n12);
        } else if (i12 == 0) {
            str = org.telegram.ui.Components.b10.j("files", n12);
        }
        if (str != null) {
            HashMap hashMap = in0Var.f40326x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = in0Var.f40329y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        in0Var.T1(in0Var.S0);
        in0Var.f40292i0.removeView(gn0Var);
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            in0 in0Var = this.f40038a;
            if (i10 < in0Var.f40292i0.getChildCount()) {
                gn0 gn0Var = (gn0) in0Var.f40292i0.getChildAt(i10);
                int[] iArr = new int[2];
                gn0Var.f39727c.getLocationInWindow(iArr);
                qu0 qu0Var = new qu0();
                qu0Var.f42920b = iArr[0];
                qu0Var.f42921c = iArr[1];
                qu0Var.d = in0Var.f40292i0;
                ImageReceiver imageReceiver = gn0Var.f39727c.getImageReceiver();
                qu0Var.f42919a = imageReceiver;
                qu0Var.e = imageReceiver.getBitmapSafe();
                return qu0Var;
            }
            return null;
        }
        return null;
    }

    @Override
    public final String b0() {
        if (this.f40038a.S0 == 1) {
            return LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]);
        }
        return LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
