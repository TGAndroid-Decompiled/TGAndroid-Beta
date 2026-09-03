package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q3 implements org.telegram.ui.web.g0 {
    public final r3 f37287a;

    public q3(r3 r3Var) {
        this.f37287a = r3Var;
    }

    @Override
    public final void b() {
        a4 a4Var = this.f37287a.H.H;
        if (a4Var != null) {
            a4Var.dismiss(true);
        }
    }

    @Override
    public final String g(boolean z4, boolean z10) {
        return "UNSUPPORTED";
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final void j() {
        r3 r3Var = this.f37287a;
        n4 n4Var = r3Var.H;
        a4 a4Var = n4Var.H;
        if (a4Var != null) {
            if (!a4Var.h) {
                a4Var.h = true;
                a4Var.release();
                a4Var.H.s();
            }
        } else if (n4Var.f36375r0[0] == r3Var) {
            n4Var.G();
        }
    }

    @Override
    public final void o(int i10, boolean z4) {
        r3.a(this.f37287a, z4, i10);
    }

    @Override
    public final void y() {
        r3 r3Var = this.f37287a;
        n4 n4Var = r3Var.H;
        if (n4Var.f36375r0[0] == r3Var) {
            n4Var.G();
        }
    }

    @Override
    public final rh.u0 z() {
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
    public final void i(boolean z4) {
    }

    @Override
    public final void k(boolean z4) {
    }

    @Override
    public final void m(int i10) {
    }

    @Override
    public final void p(boolean z4) {
    }

    @Override
    public final void r(int i10) {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t(boolean z4) {
    }

    @Override
    public final void w(boolean z4) {
    }

    @Override
    public final void x(boolean z4) {
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
    }

    @Override
    public final void u(int i10, int i11, boolean z4) {
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override
    public final void q(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12) {
    }

    @Override
    public final void l(boolean z4, boolean z10, String str, long j10, int i10, int i11, boolean z11, boolean z12, String str2) {
    }
}
