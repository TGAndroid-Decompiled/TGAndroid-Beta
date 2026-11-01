package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z10 implements Runnable {
    public final int f19655a;
    public final a20 f19656b;
    public final TLObject f19657c;
    public final x10 d;
    public final TLRPC.TL_error e;

    public z10(a20 a20Var, x10 x10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f19655a = i10;
        this.f19656b = a20Var;
        this.d = x10Var;
        this.f19657c = tLObject;
        this.e = tL_error;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f19655a) {
            case 0:
                b20 b20Var = this.f19656b.f14559i;
                if ((this.f19657c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z10 = true;
                } else {
                    b20Var.getClass();
                    z10 = false;
                }
                this.d.a(Boolean.valueOf(z10));
                b20Var.getClass();
                return;
            case 1:
                b20 b20Var2 = this.f19656b.f14559i;
                TLObject tLObject = this.f19657c;
                boolean z12 = tLObject instanceof TLRPC.Updates;
                boolean z13 = false;
                if (z12) {
                    wp.r1(b20Var2.f14906a).L3((TLRPC.Updates) tLObject, false);
                }
                ag.k.a(b20Var2.f14906a).b();
                if (z12 && this.e == null) {
                    z13 = true;
                }
                this.d.a(Boolean.valueOf(z13));
                return;
            default:
                b20 b20Var3 = this.f19656b.f14559i;
                if ((this.f19657c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z11 = true;
                } else {
                    b20Var3.getClass();
                    z11 = false;
                }
                this.d.a(Boolean.valueOf(z11));
                b20Var3.getClass();
                return;
        }
    }

    public z10(a20 a20Var, TLObject tLObject, x10 x10Var, TLRPC.TL_error tL_error) {
        this.f19655a = 1;
        this.f19656b = a20Var;
        this.f19657c = tLObject;
        this.d = x10Var;
        this.e = tL_error;
    }
}
