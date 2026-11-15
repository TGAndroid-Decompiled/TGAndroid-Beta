package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class uf implements org.telegram.ui.sq0 {
    public boolean f40013a;
    public final Object f40014b;
    public final Object f40015c;
    public final org.telegram.messenger.ff d;
    public final wf f40016e;

    public uf(wf wfVar, Object obj, Object obj2, org.telegram.messenger.ff ffVar) {
        this.f40016e = wfVar;
        this.f40014b = obj;
        this.f40015c = obj2;
        this.d = ffVar;
    }

    @Override
    public final boolean A() {
        return this.f40013a;
    }

    @Override
    public final CharSequence C(int i7) {
        return null;
    }

    @Override
    public final org.telegram.ui.uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return null;
    }

    @Override
    public final void F(boolean z10) {
        this.f40013a = z10;
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
    public final int S(int i7) {
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
    public final org.telegram.messenger.gj V() {
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
    public final CharSequence c0(int i7) {
        return null;
    }

    @Override
    public final void d() {
        hi.g gVar;
        pc b12 = PhotoViewer.p1().b1();
        if (b12 != null && (gVar = b12.f14623f) != null) {
            mt mtVar = gVar.f39053a;
            mtVar.requestFocus();
            org.telegram.messenger.g0.J3(mtVar);
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
    public final org.telegram.messenger.ic j(int i7) {
        return null;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.g20 g20Var) {
        return 0;
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        this.f40016e.B(null, this.f40014b, null, this.f40015c, z10, i10, i11, this.d, this.f40013a);
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
    public final boolean x(int i7) {
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
    public final void B(int i7) {
    }

    @Override
    public final void M(org.telegram.messenger.g20 g20Var) {
    }

    @Override
    public final void X(int i7) {
    }

    @Override
    public final void Y(int i7) {
    }

    @Override
    public final void a0(int i7) {
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
