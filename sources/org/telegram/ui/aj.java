package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class aj implements Runnable {
    public final boolean f33947a;
    public final boolean f33948b;
    public final int f33949c;
    public final boolean d;
    public final org.telegram.ui.Components.gl0 e;
    public final float f33950f;
    public final float h;
    public final ah.i1 f33951n;
    public final MessageObject f33952r;
    public final fo f33953s;

    public aj(fo foVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.gl0 gl0Var, float f7, float f10, ah.i1 i1Var, MessageObject messageObject) {
        this.f33953s = foVar;
        this.f33947a = z10;
        this.f33948b = z11;
        this.f33949c = i10;
        this.d = z12;
        this.e = gl0Var;
        this.f33950f = f7;
        this.h = f10;
        this.f33951n = i1Var;
        this.f33952r = messageObject;
    }

    @Override
    public final void run() {
        if (!this.f33947a) {
            fo foVar = this.f33953s;
            if (foVar.f35611cc != null) {
                foVar.f35611cc = null;
                if (this.f33948b) {
                    foVar.k8(new zi(this, this.f33949c, this.d, this.e, this.f33950f, this.h, this.f33951n, 0));
                } else {
                    foVar.k8(new jd(18, this, this.f33952r));
                }
                foVar.D7(true);
            }
        }
    }
}
