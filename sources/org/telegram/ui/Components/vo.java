package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id1;
public final class vo implements id1 {
    public final int f29514a;
    public final li f29515b;
    public final org.telegram.ui.y3 f29516c;

    public vo(li liVar, org.telegram.ui.y3 y3Var, int i10) {
        this.f29514a = i10;
        this.f29515b = liVar;
        this.f29516c = y3Var;
    }

    @Override
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.f29514a) {
            case 0:
                this.f29515b.dismissInternal();
                this.f29516c.run(tL_wallPaper);
                return;
            default:
                this.f29515b.dismissInternal();
                this.f29516c.run(tL_wallPaper);
                return;
        }
    }
}
