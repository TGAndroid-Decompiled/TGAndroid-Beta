package org.telegram.ui.Components;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kg implements Runnable {
    public final int f29953a;
    public final Object f29954b;
    public final Object f29955c;
    public final Object d;

    public kg(Object obj, Object obj2, Object obj3, int i10) {
        this.f29953a = i10;
        this.f29954b = obj;
        this.d = obj2;
        this.f29955c = obj3;
    }

    private final void a() {
        dz0 dz0Var = (dz0) this.f29954b;
        String str = (String) this.d;
        SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.f29955c;
        if (!dz0Var.isDismissed()) {
            dz0Var.Z.remove(str);
            if (!"application/x-tgsticker".equals(importingSticker.mimeType)) {
                dz0Var.w0(importingSticker);
            } else {
                importingSticker.validated = true;
                int indexOf = dz0Var.Y.indexOf(importingSticker);
                if (indexOf >= 0) {
                    s4.e1 K = dz0Var.f27581c.K(indexOf);
                    if (K != null) {
                        ((org.telegram.ui.Cells.i8) K.f47773a).setSticker(importingSticker);
                    }
                } else {
                    dz0Var.d.l();
                }
            }
            if (dz0Var.Z.isEmpty()) {
                dz0Var.D0();
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kg.run():void");
    }

    public kg(ue0 ue0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f29953a = 16;
        this.f29954b = ue0Var;
        this.d = tL_error;
        this.f29955c = tLObject;
    }
}
