package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class jf implements org.telegram.ui.ds0 {
    public boolean f27395a;
    public final Object f27396b;
    public final Object f27397c;
    public final org.telegram.messenger.ff d;
    public final lf e;

    public jf(lf lfVar, Object obj, Object obj2, org.telegram.messenger.ff ffVar) {
        this.e = lfVar;
        this.f27396b = obj;
        this.f27397c = obj2;
        this.d = ffVar;
    }

    @Override
    public final boolean A() {
        return this.f27395a;
    }

    @Override
    public final CharSequence C(int i10) {
        return null;
    }

    @Override
    public final org.telegram.ui.fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return null;
    }

    @Override
    public final void F(boolean z10) {
        this.f27395a = z10;
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
    public final int S(int i10) {
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
    public final org.telegram.messenger.kj V() {
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
    public final CharSequence c0(int i10) {
        return null;
    }

    @Override
    public final void d() {
        vh.f fVar;
        nc h12 = PhotoViewer.v1().h1();
        if (h12 != null && (fVar = h12.f51355f) != null) {
            rt rtVar = fVar.f32308a;
            rtVar.requestFocus();
            org.telegram.messenger.i0.J3(rtVar);
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
    public final org.telegram.messenger.lc j(int i10) {
        return null;
    }

    @Override
    public final int k(int i10, org.telegram.messenger.y20 y20Var) {
        return 0;
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        this.e.B(null, this.f27396b, null, this.f27397c, z10, i11, i12, this.d, this.f27395a);
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
    public final boolean x(int i10) {
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
    public final void B(int i10) {
    }

    @Override
    public final void M(org.telegram.messenger.y20 y20Var) {
    }

    @Override
    public final void X(int i10) {
    }

    @Override
    public final void Y(int i10) {
    }

    @Override
    public final void a0(int i10) {
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
