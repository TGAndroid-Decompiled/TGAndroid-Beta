package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class aj implements Runnable {
    public final boolean f34230a;
    public final boolean f34231b;
    public final int f34232c;
    public final boolean d;
    public final org.telegram.ui.Components.gl0 e;
    public final float f34233f;
    public final float h;
    public final ah.i1 f34234n;
    public final MessageObject f34235r;
    public final fo f34236s;

    public aj(fo foVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.gl0 gl0Var, float f7, float f10, ah.i1 i1Var, MessageObject messageObject) {
        this.f34236s = foVar;
        this.f34230a = z10;
        this.f34231b = z11;
        this.f34232c = i10;
        this.d = z12;
        this.e = gl0Var;
        this.f34233f = f7;
        this.h = f10;
        this.f34234n = i1Var;
        this.f34235r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f34230a) {
            fo foVar = this.f34236s;
            if (foVar.f35910cc != null) {
                foVar.f35910cc = null;
                if (this.f34231b) {
                    foVar.k8(new zi(this, this.f34232c, this.d, this.e, this.f34233f, this.h, this.f34234n, 0));
                } else {
                    foVar.k8(new fc(23, this, this.f34235r));
                }
                foVar.D7(true);
            }
        }
    }
}
