package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class oa0 extends org.telegram.ui.Cells.l9 {
    public final ua0 f29021w0;

    public oa0(ua0 ua0Var) {
        this.f29021w0 = ua0Var;
        this.f23423g0 = ua0Var.f30881c0.F;
    }

    @Override
    public final void I(int i10, int i11, org.telegram.messenger.jj jjVar) {
        org.telegram.ui.kn knVar;
        org.telegram.messenger.jj jjVar2;
        ua0 ua0Var = this.f29021w0;
        oa0 oa0Var = ua0Var.e;
        int i12 = oa0Var.v - oa0Var.f23443u;
        ab0 ab0Var = ua0Var.f30881c0;
        if (i12 > org.telegram.messenger.vp.r1(ab0Var.f24360x).f18871p4) {
            ua0Var.g();
            return;
        }
        org.telegram.messenger.nj njVar = ab0Var.d;
        njVar.e = oa0Var.f23443u;
        njVar.f17117f = oa0Var.v;
        org.telegram.messenger.jj c10 = ua0Var.c(jjVar);
        if (c10 != null && ((knVar = ab0Var.d.d) == null || knVar.f38914m || (jjVar2 = knVar.f38905a) == null || jjVar2.f1() != c10.f1())) {
            ab0Var.d.d = org.telegram.ui.kn.b(i10, i11, c10);
        }
        ab0Var.b();
        ab0Var.a(true);
    }

    @Override
    public final boolean b() {
        org.telegram.messenger.jj c10;
        TLRPC.Message message;
        ua0 ua0Var = this.f29021w0;
        if (ua0Var.f30876a == 0 && (c10 = ua0Var.c(null)) != null && (message = c10.f16337k) != null && message.rich_message != null) {
            return false;
        }
        org.telegram.messenger.nj njVar = ua0Var.f30881c0.d;
        if (njVar != null && njVar.f17129s) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean e() {
        org.telegram.messenger.jj c10;
        TLRPC.Message message;
        ua0 ua0Var = this.f29021w0;
        int i10 = ua0Var.f30876a;
        if (i10 == 0 && !ua0Var.f30881c0.d.f17119i) {
            if (i10 != 0 || (c10 = ua0Var.c(null)) == null || (message = c10.f16337k) == null || message.rich_message == null || org.telegram.messenger.zv.c(ua0Var.c(null))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 q() {
        return this.f23423g0;
    }

    @Override
    public final void w() {
        super.w();
        ag.b1 b1Var = this.f29021w0.f30882f;
        if (b1Var != null) {
            b1Var.invalidate();
        }
    }

    @Override
    public final boolean z(org.telegram.messenger.jj jjVar) {
        ua0 ua0Var = this.f29021w0;
        if (ua0Var.f30876a == 0 && !ua0Var.f30881c0.d.f17119i && x()) {
            return true;
        }
        return false;
    }
}
