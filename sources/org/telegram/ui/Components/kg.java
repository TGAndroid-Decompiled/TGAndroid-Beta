package org.telegram.ui.Components;

import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kg implements Runnable {
    public final int f29916a;
    public final Object f29917b;
    public final Object f29918c;
    public final Object d;

    public kg(Object obj, Object obj2, Object obj3, int i10) {
        this.f29916a = i10;
        this.f29917b = obj;
        this.d = obj2;
        this.f29918c = obj3;
    }

    private final void a() {
        cz0 cz0Var = (cz0) this.f29917b;
        String str = (String) this.d;
        SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.f29918c;
        if (!cz0Var.isDismissed()) {
            cz0Var.Z.remove(str);
            if (!"application/x-tgsticker".equals(importingSticker.mimeType)) {
                cz0Var.w0(importingSticker);
            } else {
                importingSticker.validated = true;
                int indexOf = cz0Var.Y.indexOf(importingSticker);
                if (indexOf >= 0) {
                    s4.e1 K = cz0Var.f27291c.K(indexOf);
                    if (K != null) {
                        ((org.telegram.ui.Cells.i8) K.f47738a).setSticker(importingSticker);
                    }
                } else {
                    cz0Var.d.l();
                }
            }
            if (cz0Var.Z.isEmpty()) {
                cz0Var.D0();
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kg.run():void");
    }

    public kg(te0 te0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f29916a = 16;
        this.f29917b = te0Var;
        this.d = tL_error;
        this.f29918c = tLObject;
    }
}
