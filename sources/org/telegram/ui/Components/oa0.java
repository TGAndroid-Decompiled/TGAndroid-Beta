package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class oa0 extends org.telegram.ui.Cells.l9 {
    public final ua0 f29082w0;

    public oa0(ua0 ua0Var) {
        this.f29082w0 = ua0Var;
        this.f23424g0 = ua0Var.f30915c0.F;
    }

    @Override
    public final void I(int i10, int i11, org.telegram.messenger.kj kjVar) {
        org.telegram.ui.kn knVar;
        org.telegram.messenger.kj kjVar2;
        ua0 ua0Var = this.f29082w0;
        oa0 oa0Var = ua0Var.e;
        int i12 = oa0Var.v - oa0Var.f23444u;
        ab0 ab0Var = ua0Var.f30915c0;
        if (i12 > org.telegram.messenger.wp.r1(ab0Var.f24344x).f19214p4) {
            ua0Var.g();
            return;
        }
        org.telegram.messenger.oj ojVar = ab0Var.d;
        ojVar.e = oa0Var.f23444u;
        ojVar.f17454f = oa0Var.v;
        org.telegram.messenger.kj c10 = ua0Var.c(kjVar);
        if (c10 != null && ((knVar = ab0Var.d.d) == null || knVar.f38940m || (kjVar2 = knVar.f38931a) == null || kjVar2.f1() != c10.f1())) {
            ab0Var.d.d = org.telegram.ui.kn.b(i10, i11, c10);
        }
        ab0Var.b();
        ab0Var.a(true);
    }

    @Override
    public final boolean b() {
        org.telegram.messenger.kj c10;
        TLRPC.Message message;
        ua0 ua0Var = this.f29082w0;
        if (ua0Var.f30910a == 0 && (c10 = ua0Var.c(null)) != null && (message = c10.f16690k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.oj ojVar = ua0Var.f30915c0.d;
        if (ojVar != null && ojVar.f17466s) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        org.telegram.messenger.kj c10;
        TLRPC.Message message;
        ua0 ua0Var = this.f29082w0;
        int i10 = ua0Var.f30910a;
        if (i10 == 0 && !ua0Var.f30915c0.d.f17456i) {
            if (i10 != 0 || (c10 = ua0Var.c(null)) == null || (message = c10.f16690k) == null || message.rich_message == null || org.telegram.messenger.aw.c(ua0Var.c(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 q() {
        return this.f23424g0;
    }

    @Override
    public final void w() {
        super.w();
        ag.b1 b1Var = this.f29082w0.f30916f;
        if (b1Var != null) {
            b1Var.invalidate();
        }
    }

    @Override
    public final boolean z(org.telegram.messenger.kj kjVar) {
        ua0 ua0Var = this.f29082w0;
        if (ua0Var.f30910a == 0 && !ua0Var.f30915c0.d.f17456i && x()) {
            return true;
        }
        return false;
    }
}
