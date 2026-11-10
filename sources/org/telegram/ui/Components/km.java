package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class km implements org.telegram.ui.ls {
    public int f35367a;
    public Object f35368b;

    @Override
    public org.telegram.messenger.ij A() {
        return null;
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean E(TLRPC.Document document) {
        return false;
    }

    @Override
    public String G(boolean z9) {
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
        if (((bg.l) this.f35368b) != null && this.f35367a == i7) {
            return false;
        }
        this.f35367a = i7;
        this.f35368b = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i7, i7}, (float[]) null, Shader.TileMode.CLAMP);
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
    public k60 m(bi.x5 x5Var) {
        k60 F = k60.F(x5Var, null, new View(((an) this.f35368b).getContext()));
        F.f35219s = 0;
        F.f35220t = false;
        String M0 = org.telegram.messenger.id.M0(2131746271, null);
        final int i7 = this.f35367a;
        F.c(2131232331, M0, new Runnable(this) {
            public final km f34965b;

            {
                this.f34965b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ((an) this.f34965b.f35368b).g0(i7);
                        return;
                    default:
                        ((an) this.f34965b.f35368b).j0(i7, null);
                        return;
                }
            }
        }, false);
        F.c(2131232108, org.telegram.messenger.id.M0(2131751598, null), new Runnable(this) {
            public final km f34965b;

            {
                this.f34965b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        ((an) this.f34965b.f35368b).g0(i7);
                        return;
                    default:
                        ((an) this.f34965b.f35368b).j0(i7, null);
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
    public boolean y() {
        return true;
    }

    @Override
    public void C(TLRPC.Document document) {
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
    public void i(org.telegram.messenger.zy zyVar) {
    }

    @Override
    public void n(String str) {
    }

    @Override
    public void o(TLRPC.Document document) {
    }

    @Override
    public void q(TLRPC.Document document) {
    }

    @Override
    public void v(TLRPC.Document document) {
    }

    @Override
    public void z(String str) {
    }

    @Override
    public void K() {
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
    public void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override
    public void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public void x(TLObject tLObject, Object obj) {
    }

    @Override
    public void u(CharSequence charSequence, String str, ex exVar) {
    }

    @Override
    public void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
    }

    @Override
    public void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
    }
}
