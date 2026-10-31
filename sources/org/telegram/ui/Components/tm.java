package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tm implements org.telegram.ui.jt {
    public int f30654a;
    public Object f30655b;

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public boolean C(TLRPC.Document document) {
        return false;
    }

    @Override
    public z60 D(fg.i iVar) {
        z60 F = z60.F(iVar, null, new View(((jn) this.f30655b).getContext()));
        F.f32941s = 0;
        F.f32942t = false;
        String L0 = org.telegram.messenger.cd.L0(2131746286, null);
        final int i10 = this.f30654a;
        F.c(2131232330, L0, new Runnable(this) {
            public final tm f30264b;

            {
                this.f30264b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ((jn) this.f30264b.f30655b).e0(i10);
                        return;
                    default:
                        ((jn) this.f30264b.f30655b).h0(i10, null);
                        return;
                }
            }
        }, false);
        F.c(2131232107, org.telegram.messenger.cd.L0(2131751599, null), new Runnable(this) {
            public final tm f30264b;

            {
                this.f30264b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ((jn) this.f30264b.f30655b).e0(i10);
                        return;
                    default:
                        ((jn) this.f30264b.f30655b).h0(i10, null);
                        return;
                }
            }
        }, true);
        return F;
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
    public boolean M(TLRPC.Document document) {
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

    public boolean R(int i10) {
        if (((rf.h) this.f30655b) != null && this.f30654a == i10) {
            return false;
        }
        this.f30654a = i10;
        this.f30655b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i10, i10}, (float[]) null, Shader.TileMode.CLAMP);
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
    public boolean k(int i10) {
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
    public org.telegram.messenger.jj y() {
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
    public void i(org.telegram.messenger.jz jzVar) {
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
    public void K() {
    }

    @Override
    public void q() {
    }

    @Override
    public void s() {
    }

    @Override
    public void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public void v(TLObject tLObject, Object obj) {
    }

    @Override
    public void N(CharSequence charSequence, String str, vg vgVar) {
    }

    @Override
    public void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
