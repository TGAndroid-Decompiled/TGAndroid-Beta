package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o3 implements org.telegram.ui.web.e0 {
    public final p3 f40874a;

    public o3(p3 p3Var) {
        this.f40874a = p3Var;
    }

    @Override
    public final void b() {
        y3 y3Var = this.f40874a.G.G;
        if (y3Var != null) {
            y3Var.dismiss(true);
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
        p3 p3Var = this.f40874a;
        l4 l4Var = p3Var.G;
        y3 y3Var = l4Var.G;
        if (y3Var != null) {
            if (!y3Var.h) {
                y3Var.h = true;
                y3Var.release();
                y3Var.G.s();
            }
        } else if (l4Var.f40026q0[0] == p3Var) {
            l4Var.G();
        }
    }

    @Override
    public final void o(int i9, boolean z10) {
        p3.a(this.f40874a, z10, i9);
    }

    @Override
    public final void y() {
        p3 p3Var = this.f40874a;
        l4 l4Var = p3Var.G;
        if (l4Var.f40026q0[0] == p3Var) {
            l4Var.G();
        }
    }

    @Override
    public final mh.y0 z() {
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
    public final void m(int i9) {
    }

    @Override
    public final void p(boolean z10) {
    }

    @Override
    public final void r(int i9) {
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
    public final void u(int i9, int i10, boolean z10) {
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j10, int i9, int i10, boolean z12, boolean z13) {
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j10, int i9, int i10, boolean z12, boolean z13, String str2) {
    }
}
