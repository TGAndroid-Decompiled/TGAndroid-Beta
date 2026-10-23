package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n3 implements org.telegram.ui.web.g0 {
    public final o3 f39405a;

    public n3(o3 o3Var) {
        this.f39405a = o3Var;
    }

    @Override
    public final void b() {
        x3 x3Var = this.f39405a.K.K;
        if (x3Var != null) {
            x3Var.dismiss(true);
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
        o3 o3Var = this.f39405a;
        l4 l4Var = o3Var.K;
        x3 x3Var = l4Var.K;
        if (x3Var != null) {
            if (!x3Var.h) {
                x3Var.h = true;
                x3Var.release();
                x3Var.K.s();
            }
        } else if (l4Var.f38783u0[0] == o3Var) {
            l4Var.G();
        }
    }

    @Override
    public final void o(int i10, boolean z10) {
        o3.a(this.f39405a, z10, i10);
    }

    @Override
    public final void y() {
        o3 o3Var = this.f39405a;
        l4 l4Var = o3Var.K;
        if (l4Var.f38783u0[0] == o3Var) {
            l4Var.G();
        }
    }

    @Override
    public final gi.y0 z() {
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
