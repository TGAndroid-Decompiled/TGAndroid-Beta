package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class lf implements org.telegram.ui.kq0 {
    public boolean f35713a;
    public final Object f35714b;
    public final Object f35715c;
    public final org.telegram.messenger.ye d;
    public final nf f35716e;

    public lf(nf nfVar, Object obj, Object obj2, org.telegram.messenger.ye yeVar) {
        this.f35716e = nfVar;
        this.f35714b = obj;
        this.f35715c = obj2;
        this.d = yeVar;
    }

    @Override
    public final boolean A() {
        return this.f35713a;
    }

    @Override
    public final CharSequence C(int i3) {
        return null;
    }

    @Override
    public final org.telegram.ui.mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        return null;
    }

    @Override
    public final void F(boolean z10) {
        this.f35713a = z10;
    }

    @Override
    public final int H() {
        return 0;
    }

    @Override
    public final boolean I() {
        return true;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final boolean L() {
        return false;
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final int R(Object obj) {
        return 0;
    }

    @Override
    public final int S(int i3) {
        return 0;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final boolean U() {
        return true;
    }

    @Override
    public final org.telegram.messenger.zi V() {
        return null;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final String b0() {
        return "";
    }

    @Override
    public final ArrayList c() {
        return null;
    }

    @Override
    public final CharSequence c0(int i3) {
        return null;
    }

    @Override
    public final void d() {
        gi.g gVar;
        sc h12 = PhotoViewer.v1().h1();
        if (h12 != null && (gVar = h12.f13144f) != null) {
            dt dtVar = gVar.f35188a;
            dtVar.requestFocus();
            org.telegram.messenger.g0.K3(dtVar);
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final org.telegram.messenger.cc j(int i3) {
        return null;
    }

    @Override
    public final int k(int i3, org.telegram.messenger.b20 b20Var) {
        return 0;
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        this.f35716e.B(null, this.f35714b, null, this.f35715c, z10, i10, i11, this.d, this.f35713a);
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final boolean r() {
        return false;
    }

    @Override
    public final boolean t() {
        return true;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return null;
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final boolean x(int i3) {
        return false;
    }

    @Override
    public final int y() {
        return 0;
    }

    @Override
    public final boolean z() {
        return true;
    }

    @Override
    public final void B(int i3) {
    }

    @Override
    public final void M(org.telegram.messenger.b20 b20Var) {
    }

    @Override
    public final void X(int i3) {
    }

    @Override
    public final void Y(int i3) {
    }

    @Override
    public final void a0(int i3) {
    }

    @Override
    public final void e(CharSequence charSequence) {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void W() {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void m() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
    }
}
