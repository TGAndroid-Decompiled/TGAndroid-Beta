package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m3 implements org.telegram.ui.web.h0 {
    public final n3 f39365a;

    public m3(n3 n3Var) {
        this.f39365a = n3Var;
    }

    @Override
    public final gi.y0 A() {
        return null;
    }

    @Override
    public final void b() {
        w3 w3Var = this.f39365a.L.K;
        if (w3Var != null) {
            w3Var.dismiss(true);
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
        n3 n3Var = this.f39365a;
        k4 k4Var = n3Var.L;
        w3 w3Var = k4Var.K;
        if (w3Var != null) {
            if (!w3Var.h) {
                w3Var.h = true;
                w3Var.release();
                w3Var.K.s();
            }
        } else if (k4Var.f38805u0[0] == n3Var) {
            k4Var.G();
        }
    }

    @Override
    public final void o(int i10, boolean z10) {
        n3.a(this.f39365a, z10, i10);
    }

    @Override
    public final void z() {
        n3 n3Var = this.f39365a;
        k4 k4Var = n3Var.L;
        if (k4Var.f38805u0[0] == n3Var) {
            k4Var.G();
        }
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
    public final void x(int i10) {
    }

    @Override
    public final void y(boolean z10) {
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
