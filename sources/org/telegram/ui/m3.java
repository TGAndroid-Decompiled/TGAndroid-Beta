package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m3 implements org.telegram.ui.web.h0 {
    public final n3 f34832a;

    public m3(n3 n3Var) {
        this.f34832a = n3Var;
    }

    @Override
    public final void b() {
        w3 w3Var = this.f34832a.K.K;
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
        n3 n3Var = this.f34832a;
        j4 j4Var = n3Var.K;
        w3 w3Var = j4Var.K;
        if (w3Var != null) {
            if (!w3Var.h) {
                w3Var.h = true;
                w3Var.release();
                w3Var.K.s();
            }
        } else if (j4Var.f33920u0[0] == n3Var) {
            j4Var.G();
        }
    }

    @Override
    public final void o(int i10, boolean z10) {
        n3.a(this.f34832a, z10, i10);
    }

    @Override
    public final void y() {
        n3 n3Var = this.f34832a;
        j4 j4Var = n3Var.K;
        if (j4Var.f33920u0[0] == n3Var) {
            j4Var.G();
        }
    }

    @Override
    public final di.d1 z() {
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
