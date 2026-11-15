package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tm implements org.telegram.ui.ls {
    public int f39723a;
    public Object f39724b;

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean D(TLRPC.Document document) {
        return false;
    }

    @Override
    public m60 E(ai.j0 j0Var) {
        m60 F = m60.F(j0Var, null, new View(((jn) this.f39724b).getContext()));
        F.f37111s = 0;
        F.f37112t = false;
        String M0 = org.telegram.messenger.hd.M0(2131746271, null);
        final int i7 = this.f39723a;
        F.c(2131232332, M0, new Runnable(this) {
            public final tm f39338b;

            {
                this.f39338b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ((jn) this.f39338b.f39724b).g0(i7);
                        return;
                    default:
                        ((jn) this.f39338b.f39724b).j0(i7, null);
                        return;
                }
            }
        }, false);
        F.c(2131232109, org.telegram.messenger.hd.M0(2131751598, null), new Runnable(this) {
            public final tm f39338b;

            {
                this.f39338b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ((jn) this.f39338b.f39724b).g0(i7);
                        return;
                    default:
                        ((jn) this.f39338b.f39724b).j0(i7, null);
                        return;
                }
            }
        }, true);
        return F;
    }

    @Override
    public String G(boolean z10) {
        return null;
    }

    @Override
    public boolean I() {
        return false;
    }

    @Override
    public boolean J() {
        return false;
    }

    @Override
    public boolean N(TLRPC.Document document) {
        return false;
    }

    @Override
    public Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override
    public boolean Q() {
        return true;
    }

    public boolean R(int i7) {
        if (((bg.l) this.f39724b) != null && this.f39723a == i7) {
            return false;
        }
        this.f39723a = i7;
        this.f39724b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i7, i7}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }

    @Override
    public long a() {
        return 0L;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public boolean e(TLRPC.Document document) {
        return false;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public TLRPC.PollAnswer g() {
        return null;
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public boolean k(int i7) {
        return false;
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    public boolean w() {
        return true;
    }

    @Override
    public org.telegram.messenger.gj z() {
        return null;
    }

    @Override
    public void B(TLRPC.Document document) {
    }

    @Override
    public void F(TLRPC.Document document) {
    }

    @Override
    public void H(TLRPC.Document document) {
    }

    @Override
    public void O(String str) {
    }

    @Override
    public void i(org.telegram.messenger.xy xyVar) {
    }

    @Override
    public void m(String str) {
    }

    @Override
    public void n(TLRPC.Document document) {
    }

    @Override
    public void p(TLRPC.Document document) {
    }

    @Override
    public void t(TLRPC.Document document) {
    }

    @Override
    public void x(String str) {
    }

    @Override
    public void K() {
    }

    @Override
    public void L() {
    }

    @Override
    public void q() {
    }

    @Override
    public void s() {
    }

    @Override
    public void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public void v(TLObject tLObject, Object obj) {
    }

    @Override
    public void y(CharSequence charSequence, String str, gh ghVar) {
    }

    @Override
    public void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}
