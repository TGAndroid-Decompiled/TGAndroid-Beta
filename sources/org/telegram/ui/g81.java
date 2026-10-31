package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g81 implements RequestDelegate {
    public final int f37487a;
    public final m91 f37488b;

    public g81(m91 m91Var, int i10) {
        this.f37487a = i10;
        this.f37488b = m91Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37487a) {
            case 0:
                final m91 m91Var = this.f37488b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                m91.a0(m91Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        m91 m91Var2 = m91Var;
                                        m91Var2.X0 = tL_wallPaper;
                                        m91Var2.f1(false);
                                        m91Var2.n1();
                                        m91Var2.V0.add(0, m91Var2.X0);
                                        k91 k91Var = m91Var2.R0;
                                        if (k91Var != null) {
                                            k91Var.f();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final m91 m91Var2 = this.f37488b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                m91.a0(m91Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        m91 m91Var22 = m91Var2;
                                        m91Var22.X0 = tL_wallPaper;
                                        m91Var22.f1(false);
                                        m91Var22.n1();
                                        m91Var22.V0.add(0, m91Var22.X0);
                                        k91 k91Var = m91Var22.R0;
                                        if (k91Var != null) {
                                            k91Var.f();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
