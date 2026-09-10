package org.telegram.ui.Components;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gf implements Runnable {
    public final int f23353a;
    public final Object f23354b;
    public final Object f23355c;
    public final Object d;

    public gf(Object obj, Object obj2, Object obj3, int i10) {
        this.f23353a = i10;
        this.f23354b = obj;
        this.f23355c = obj2;
        this.d = obj3;
    }

    private final void a() {
        hy0 hy0Var = (hy0) this.f23354b;
        String str = (String) this.f23355c;
        SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.d;
        if (!hy0Var.isDismissed()) {
            hy0Var.Z.remove(str);
            if (!"application/x-tgsticker".equals(importingSticker.mimeType)) {
                hy0Var.u0(importingSticker);
            } else {
                importingSticker.validated = true;
                int indexOf = hy0Var.Y.indexOf(importingSticker);
                if (indexOf >= 0) {
                    s4.c1 K = hy0Var.f23806c.K(indexOf);
                    if (K != null) {
                        ((org.telegram.ui.Cells.g8) K.f41610a).setSticker(importingSticker);
                    }
                } else {
                    hy0Var.d.l();
                }
            }
            if (hy0Var.Z.isEmpty()) {
                hy0Var.B0();
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gf.run():void");
    }

    public gf(je0 je0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f23353a = 16;
        this.f23354b = je0Var;
        this.f23355c = tL_error;
        this.d = tLObject;
    }
}
