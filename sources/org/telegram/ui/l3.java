package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l3 implements org.telegram.ui.web.i0 {
    public final m3 f38179a;

    public l3(m3 m3Var) {
        this.f38179a = m3Var;
    }

    @Override
    public final void b() {
        v3 v3Var = this.f38179a.K.K;
        if (v3Var != null) {
            v3Var.dismiss(true);
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
        m3 m3Var = this.f38179a;
        i4 i4Var = m3Var.K;
        v3 v3Var = i4Var.K;
        if (v3Var != null) {
            if (!v3Var.h) {
                v3Var.h = true;
                v3Var.release();
                v3Var.K.s();
            }
        } else if (i4Var.f37232u0[0] == m3Var) {
            i4Var.G();
        }
    }

    @Override
    public final void o(int i10, boolean z10) {
        m3.a(this.f38179a, z10, i10);
    }

    @Override
    public final void y() {
        m3 m3Var = this.f38179a;
        i4 i4Var = m3Var.K;
        if (i4Var.f37232u0[0] == m3Var) {
            i4Var.G();
        }
    }

    @Override
    public final fi.a1 z() {
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
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
    }

    @Override
    public final void l(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13, String str2) {
    }
}
