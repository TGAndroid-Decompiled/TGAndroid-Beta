package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class nf implements org.telegram.ui.wq0 {
    public boolean f36352a;
    public final Object f36353b;
    public final Object f36354c;
    public final org.telegram.messenger.gf d;
    public final pf f36355e;

    public nf(pf pfVar, Object obj, Object obj2, org.telegram.messenger.gf gfVar) {
        this.f36355e = pfVar;
        this.f36353b = obj;
        this.f36354c = obj2;
        this.d = gfVar;
    }

    @Override
    public final boolean A() {
        return this.f36352a;
    }

    @Override
    public final CharSequence C(int i7) {
        return null;
    }

    @Override
    public final org.telegram.ui.yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        return null;
    }

    @Override
    public final void F(boolean z9) {
        this.f36352a = z9;
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
    public final org.telegram.messenger.ij V() {
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
        fi.g gVar;
        uc a12 = PhotoViewer.p1().a1();
        if (a12 != null && (gVar = a12.f12366f) != null) {
            ft ftVar = gVar.f35841a;
            ftVar.requestFocus();
            org.telegram.messenger.g0.K3(ftVar);
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
    public final org.telegram.messenger.jc j(int i7) {
        return null;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        return 0;
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        this.f36355e.B(null, this.f36353b, null, this.f36354c, z9, i10, i11, this.d, this.f36352a);
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
    public final void M(org.telegram.messenger.j20 j20Var) {
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
    public final void f(String str, String str2, boolean z9) {
    }
}
