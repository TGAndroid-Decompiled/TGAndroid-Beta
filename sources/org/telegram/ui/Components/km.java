package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class km implements org.telegram.ui.gs {
    public int f35436a;
    public Object f35437b;

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
    public String F(boolean z10) {
        return null;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean I() {
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

    public boolean R(int i3) {
        if (((cg.k) this.f35437b) != null && this.f35436a == i3) {
            return false;
        }
        this.f35436a = i3;
        this.f35437b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i3, i3}, (float[]) null, Shader.TileMode.CLAMP);
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
    public boolean k(int i3) {
        return false;
    }

    @Override
    public f60 n(ai.c0 c0Var) {
        f60 F = f60.F(c0Var, null, new View(((an) this.f35437b).getContext()));
        F.f33747s = 0;
        F.f33748t = false;
        String M0 = org.telegram.messenger.bd.M0(2131746279, null);
        final int i3 = this.f35436a;
        F.c(2131232331, M0, new Runnable(this) {
            public final km f35118b;

            {
                this.f35118b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ((an) this.f35118b.f35437b).g0(i3);
                        return;
                    default:
                        ((an) this.f35118b.f35437b).j0(i3, null);
                        return;
                }
            }
        }, false);
        F.c(2131232108, org.telegram.messenger.bd.M0(2131751599, null), new Runnable(this) {
            public final km f35118b;

            {
                this.f35118b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ((an) this.f35118b.f35437b).g0(i3);
                        return;
                    default:
                        ((an) this.f35118b.f35437b).j0(i3, null);
                        return;
                }
            }
        }, true);
        return F;
    }

    @Override
    public boolean p() {
        return false;
    }

    @Override
    public boolean x() {
        return true;
    }

    @Override
    public org.telegram.messenger.zi z() {
        return null;
    }

    @Override
    public void B(TLRPC.Document document) {
    }

    @Override
    public void E(TLRPC.Document document) {
    }

    @Override
    public void G(TLRPC.Document document) {
    }

    @Override
    public void O(String str) {
    }

    @Override
    public void i(org.telegram.messenger.ry ryVar) {
    }

    @Override
    public void m(String str) {
    }

    @Override
    public void o(TLRPC.Document document) {
    }

    @Override
    public void q(TLRPC.Document document) {
    }

    @Override
    public void u(TLRPC.Document document) {
    }

    @Override
    public void y(String str) {
    }

    @Override
    public void J() {
    }

    @Override
    public void L() {
    }

    @Override
    public void r() {
    }

    @Override
    public void t() {
    }

    @Override
    public void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public void w(TLObject tLObject, Object obj) {
    }

    @Override
    public void K(CharSequence charSequence, String str, ei eiVar) {
    }

    @Override
    public void s(int i3, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public void l(TLRPC.Document document, String str, Object obj, boolean z10, int i3, int i10) {
    }
}
