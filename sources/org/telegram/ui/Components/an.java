package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class an implements org.telegram.ui.ls {
    public int f33497a;
    public Object f33498b;

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public boolean C(TLRPC.Document document) {
        return false;
    }

    @Override
    public x60 D(ai.h0 h0Var) {
        x60 G = x60.G(h0Var, null, new View(((qn) this.f33498b).getContext()));
        G.f41892s = 0;
        G.f41894t = false;
        String N0 = org.telegram.messenger.gd.N0(2131746075, null);
        final int i7 = this.f33497a;
        G.c(2131232336, N0, new Runnable(this) {
            public final an f42925b;

            {
                this.f42925b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ((qn) this.f42925b.f33498b).g0(i7);
                        return;
                    default:
                        ((qn) this.f42925b.f33498b).j0(i7, null);
                        return;
                }
            }
        }, false);
        G.c(2131232113, org.telegram.messenger.gd.N0(2131751586, null), new Runnable(this) {
            public final an f42925b;

            {
                this.f42925b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ((qn) this.f42925b.f33498b).g0(i7);
                        return;
                    default:
                        ((qn) this.f42925b.f33498b).j0(i7, null);
                        return;
                }
            }
        }, true);
        return G;
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

    public boolean R(int i7) {
        if (((bg.l) this.f33498b) != null && this.f33497a == i7) {
            return false;
        }
        this.f33497a = i7;
        this.f33498b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i7, i7}, (float[]) null, Shader.TileMode.CLAMP);
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
    public org.telegram.messenger.fj y() {
        return null;
    }

    @Override
    public boolean z() {
        return false;
    }

    @Override
    public void A(TLRPC.Document document) {
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
    public void i(org.telegram.messenger.sy syVar) {
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
    public void J() {
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
    public void K(CharSequence charSequence, String str, ph phVar) {
    }

    @Override
    public void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}
