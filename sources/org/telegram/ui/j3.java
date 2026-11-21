package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j3 implements org.telegram.ui.web.c0 {
    public final k3 f48871a;

    public j3(k3 k3Var) {
        this.f48871a = k3Var;
    }

    @Override
    public final ki.v0 A() {
        return null;
    }

    @Override
    public final void b() {
        t3 t3Var = this.f48871a.M.L;
        if (t3Var != null) {
            t3Var.a(true);
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
        k3 k3Var = this.f48871a;
        g4 g4Var = k3Var.M;
        t3 t3Var = g4Var.L;
        if (t3Var != null) {
            if (!t3Var.h) {
                t3Var.h = true;
                t3Var.release();
                t3Var.L.q();
            }
        } else if (g4Var.f47969v0[0] == k3Var) {
            g4Var.E();
        }
    }

    @Override
    public final void o(int i7, boolean z10) {
        k3.a(this.f48871a, z10, i7);
    }

    @Override
    public final void z() {
        k3 k3Var = this.f48871a;
        g4 g4Var = k3Var.M;
        if (g4Var.f47969v0[0] == k3Var) {
            g4Var.E();
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
    public final void m(int i7) {
    }

    @Override
    public final void p(boolean z10) {
    }

    @Override
    public final void r(int i7) {
    }

    @Override
    public final void t(boolean z10) {
    }

    @Override
    public final void w(boolean z10) {
    }

    @Override
    public final void x(int i7) {
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
    public final void u(int i7, int i10, boolean z10) {
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13, String str2) {
    }

    @Override
    public final void q(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13) {
    }
}
