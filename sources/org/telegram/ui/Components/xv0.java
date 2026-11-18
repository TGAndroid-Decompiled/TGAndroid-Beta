package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xv0 implements org.telegram.ui.ls {
    public final iw0 f42197a;

    public xv0(iw0 iw0Var) {
        this.f42197a = iw0Var;
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
    public final y60 E(ai.k0 k0Var) {
        return null;
    }

    @Override
    public final void F(TLRPC.Document document) {
        iw0 iw0Var = this.f42197a;
        iw0Var.N1.documents.remove(document);
        boolean isEmpty = iw0Var.N1.documents.isEmpty();
        if (isEmpty) {
            iw0Var.dismiss();
        }
        iw0Var.f36247o1.f();
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, iw0Var.getContext(), iw0Var.J0);
        u1Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.ri.c0(document, "").document;
        ConnectionsManager.getInstance(iw0Var.f30187a).sendRequest(tL_stickers_removeStickerFromSet, new di.n8(this, isEmpty, u1Var, 4));
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
        org.telegram.ui.ActionBar.h2 h2Var = this.f42197a.G1;
        if (h2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) h2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        fw0 fw0Var = this.f42197a.W1;
        if (fw0Var != null && fw0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        fw0 fw0Var = this.f42197a.W1;
        if (fw0Var != null && fw0Var.c()) {
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
        if (this.f42197a.S1 != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f42197a.N1;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(org.telegram.messenger.sy syVar) {
        this.f42197a.T0(syVar);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i7) {
        if (this.f42197a.W1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
        iw0 iw0Var = this.f42197a;
        fw0 fw0Var = iw0Var.W1;
        if (fw0Var == null) {
            return;
        }
        fw0Var.d(document, str, obj, null, iw0Var.d2, z10, i7, 0);
        iw0Var.dismiss();
    }

    @Override
    public final void n(TLRPC.Document document) {
        iw0 iw0Var = this.f42197a;
        iw0.N0(iw0Var.G1, iw0Var.N1, document);
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
    public final org.telegram.messenger.fj z() {
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
    public final void y(CharSequence charSequence, String str, ph phVar) {
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }
}
