package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yv0 implements org.telegram.ui.ls {
    public final jw0 f42567a;

    public yv0(jw0 jw0Var) {
        this.f42567a = jw0Var;
    }

    @Override
    public final boolean B() {
        return true;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        return false;
    }

    @Override
    public final x60 D(ai.h0 h0Var) {
        return null;
    }

    @Override
    public final void E(TLRPC.Document document) {
        jw0 jw0Var = this.f42567a;
        jw0Var.N1.documents.remove(document);
        boolean isEmpty = jw0Var.N1.documents.isEmpty();
        if (isEmpty) {
            jw0Var.dismiss();
        }
        jw0Var.f36541o1.f();
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, jw0Var.getContext(), jw0Var.J0);
        t1Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.ri.c0(document, "").document;
        ConnectionsManager.getInstance(jw0Var.f30223a).sendRequest(tL_stickers_removeStickerFromSet, new di.o8(this, isEmpty, t1Var, 4));
    }

    @Override
    public final String F(boolean z10) {
        return null;
    }

    @Override
    public final boolean H() {
        return true;
    }

    @Override
    public final boolean I() {
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
        org.telegram.ui.ActionBar.g2 g2Var = this.f42567a.G1;
        if (g2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) g2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        gw0 gw0Var = this.f42567a.W1;
        if (gw0Var != null && gw0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        gw0 gw0Var = this.f42567a.W1;
        if (gw0Var != null && gw0Var.c()) {
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
        if (this.f42567a.S1 != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f42567a.N1;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(org.telegram.messenger.sy syVar) {
        this.f42567a.T0(syVar);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i7) {
        if (this.f42567a.W1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
        jw0 jw0Var = this.f42567a;
        gw0 gw0Var = jw0Var.W1;
        if (gw0Var == null) {
            return;
        }
        gw0Var.d(document, str, obj, null, jw0Var.d2, z10, i7, 0);
        jw0Var.dismiss();
    }

    @Override
    public final void n(TLRPC.Document document) {
        jw0 jw0Var = this.f42567a;
        jw0.N0(jw0Var.G1, jw0Var.N1, document);
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
    public final org.telegram.messenger.fj y() {
        return null;
    }

    @Override
    public final boolean z() {
        return false;
    }

    @Override
    public final void A(TLRPC.Document document) {
    }

    @Override
    public final void G(TLRPC.Document document) {
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
    public final void J() {
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
    public final void K(CharSequence charSequence, String str, ph phVar) {
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }
}
