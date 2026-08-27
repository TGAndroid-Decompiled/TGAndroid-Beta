package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class p3 implements org.telegram.ui.web.f0 {

    public final q3 f41255a;

    public p3(q3 q3Var) {
        this.f41255a = q3Var;
    }

    @Override
    public final void b() {
        z3 z3Var = this.f41255a.G.G;
        if (z3Var != null) {
            z3Var.dismiss(true);
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
        q3 q3Var = this.f41255a;
        m4 m4Var = q3Var.G;
        z3 z3Var = m4Var.G;
        if (z3Var == null) {
            if (m4Var.f40347q0[0] == q3Var) {
                m4Var.G();
            }
        } else {
            if (z3Var.h) {
                return;
            }
            z3Var.h = true;
            z3Var.release();
            z3Var.G.s();
        }
    }

    @Override
    public final void o(int i10, boolean z10) {
        q3.a(this.f41255a, z10, i10);
    }

    @Override
    public final void y() {
        q3 q3Var = this.f41255a;
        m4 m4Var = q3Var.G;
        if (m4Var.f40347q0[0] == q3Var) {
            m4Var.G();
        }
    }

    @Override
    public final nh.x0 z() {
        return null;
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
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
    public final void s() {
    }

    @Override
    public final void t(boolean z10) {
    }

    @Override
    public final void w(boolean z10) {
    }

    @Override
    public final void x(boolean z10) {
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
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
