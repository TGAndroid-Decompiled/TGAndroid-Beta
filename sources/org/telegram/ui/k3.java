package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k3 implements org.telegram.ui.web.d0 {
    public final l3 f38642a;

    public k3(l3 l3Var) {
        this.f38642a = l3Var;
    }

    @Override
    public final xh.s0 A() {
        return null;
    }

    @Override
    public final void b() {
        u3 u3Var = this.f38642a.L.K;
        if (u3Var != null) {
            u3Var.a(true);
        }
    }

    @Override
    public final String g(boolean z10, boolean z11) {
        return "UNSUPPORTED";
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final void j() {
        l3 l3Var = this.f38642a;
        h4 h4Var = l3Var.L;
        u3 u3Var = h4Var.K;
        if (u3Var != null) {
            if (!u3Var.h) {
                u3Var.h = true;
                u3Var.release();
                u3Var.K.q();
            }
        } else if (h4Var.f37691u0[0] == l3Var) {
            h4Var.E();
        }
    }

    @Override
    public final void o(int i10, boolean z10) {
        l3.a(this.f38642a, z10, i10);
    }

    @Override
    public final void z() {
        l3 l3Var = this.f38642a;
        h4 h4Var = l3Var.L;
        if (h4Var.f37691u0[0] == l3Var) {
            h4Var.E();
        }
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(String str) {
    }

    @Override
    public final void f(ArrayList arrayList) {
    }

    @Override
    public final void i(boolean z10) {
    }

    @Override
    public final void k(boolean z10) {
    }

    @Override
    public final void m(int i10) {
    }

    @Override
    public final void p(boolean z10) {
    }

    @Override
    public final void r(int i10) {
    }

    @Override
    public final void t(boolean z10) {
    }

    @Override
    public final void w(boolean z10) {
    }

    @Override
    public final void x(int i10) {
    }

    @Override
    public final void y(boolean z10) {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
    }

    @Override
    public final void u(int i10, int i11, boolean z10) {
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
    }
}
