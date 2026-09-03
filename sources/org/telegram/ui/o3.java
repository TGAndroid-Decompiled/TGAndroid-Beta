package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o3 implements org.telegram.ui.web.f0 {
    public final p3 f39520a;

    public o3(p3 p3Var) {
        this.f39520a = p3Var;
    }

    @Override
    public final void b() {
        y3 y3Var = this.f39520a.H.H;
        if (y3Var != null) {
            y3Var.dismiss(true);
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
        p3 p3Var = this.f39520a;
        l4 l4Var = p3Var.H;
        y3 y3Var = l4Var.H;
        if (y3Var != null) {
            if (!y3Var.h) {
                y3Var.h = true;
                y3Var.release();
                y3Var.H.s();
            }
        } else if (l4Var.f38524r0[0] == p3Var) {
            l4Var.G();
        }
    }

    @Override
    public final void o(int i10, boolean z4) {
        p3.a(this.f39520a, z4, i10);
    }

    @Override
    public final void y() {
        p3 p3Var = this.f39520a;
        l4 l4Var = p3Var.H;
        if (l4Var.f38524r0[0] == p3Var) {
            l4Var.G();
        }
    }

    @Override
    public final sh.u0 z() {
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
