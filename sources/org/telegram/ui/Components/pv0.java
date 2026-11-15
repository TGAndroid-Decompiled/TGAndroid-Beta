package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pv0 implements org.telegram.ui.ls {
    public final bw0 f38416a;

    public pv0(bw0 bw0Var) {
        this.f38416a = bw0Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        return false;
    }

    @Override
    public final m60 E(ai.k0 k0Var) {
        return null;
    }

    @Override
    public final void F(TLRPC.Document document) {
        bw0 bw0Var = this.f38416a;
        bw0Var.N1.documents.remove(document);
        boolean isEmpty = bw0Var.N1.documents.isEmpty();
        if (isEmpty) {
            bw0Var.dismiss();
        }
        bw0Var.f33413o1.f();
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, bw0Var.getContext(), bw0Var.J0);
        t1Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.si.a0(document, "").document;
        ConnectionsManager.getInstance(bw0Var.f29679a).sendRequest(tL_stickers_removeStickerFromSet, new di.k8(this, isEmpty, t1Var, 4));
    }

    @Override
    public final String G(boolean z10) {
        return null;
    }

    @Override
    public final boolean I() {
        return true;
    }

    @Override
    public final boolean J() {
        return false;
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        return false;
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        return null;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final long a() {
        org.telegram.ui.ActionBar.e2 e2Var = this.f38416a.G1;
        if (e2Var instanceof org.telegram.ui.an) {
            return ((org.telegram.ui.an) e2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        yv0 yv0Var = this.f38416a.W1;
        if (yv0Var != null && yv0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        yv0 yv0Var = this.f38416a.W1;
        if (yv0Var != null && yv0Var.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override
    public final boolean f() {
        if (this.f38416a.S1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f38416a.N1;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(org.telegram.messenger.xy xyVar) {
        this.f38416a.S0(xyVar);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i7) {
        if (this.f38416a.W1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
        bw0 bw0Var = this.f38416a;
        yv0 yv0Var = bw0Var.W1;
        if (yv0Var == null) {
            return;
        }
        yv0Var.d(document, str, obj, null, bw0Var.d2, z10, i7, 0);
        bw0Var.dismiss();
    }

    @Override
    public final void n(TLRPC.Document document) {
        bw0 bw0Var = this.f38416a;
        bw0.M0(bw0Var.G1, bw0Var.N1, document);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final org.telegram.messenger.gj z() {
        return null;
    }

    @Override
    public final void B(TLRPC.Document document) {
    }

    @Override
    public final void H(TLRPC.Document document) {
    }

    @Override
    public final void O(String str) {
    }

    @Override
    public final void m(String str) {
    }

    @Override
    public final void p(TLRPC.Document document) {
    }

    @Override
    public final void t(TLRPC.Document document) {
    }

    @Override
    public final void x(String str) {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void y(CharSequence charSequence, String str, gh ghVar) {
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }
}
