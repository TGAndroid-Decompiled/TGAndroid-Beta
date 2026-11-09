package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class jh0 implements Runnable {
    public final int f35022a;
    public final sh0 f35023b;
    public final TLObject f35024c;

    public jh0(sh0 sh0Var, TLObject tLObject, int i7) {
        this.f35022a = i7;
        this.f35023b = sh0Var;
        this.f35024c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f35022a) {
            case 0:
                sh0 sh0Var = this.f35023b;
                org.telegram.messenger.qs.f(sh0Var.f38064b).d(new jh0(sh0Var, this.f35024c, 1));
                return;
            default:
                sh0.a(this.f35023b, this.f35024c);
                return;
        }
    }
}
