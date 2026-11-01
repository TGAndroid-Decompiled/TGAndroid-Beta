package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sw0 implements org.telegram.ui.ht {
    public final dx0 f30458a;

    public sw0(dx0 dx0Var) {
        this.f30458a = dx0Var;
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
    public final z60 D(fg.i iVar) {
        return null;
    }

    @Override
    public final void E(TLRPC.Document document) {
        dx0 dx0Var = this.f30458a;
        dx0Var.J1.documents.remove(document);
        boolean isEmpty = dx0Var.J1.documents.isEmpty();
        if (isEmpty) {
            dx0Var.dismiss();
        }
        dx0Var.f25621k1.f();
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, dx0Var.getContext(), dx0Var.I0);
        x1Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.vi.a0(document, "").document;
        ConnectionsManager.getInstance(dx0Var.f21584a).sendRequest(tL_stickers_removeStickerFromSet, new org.telegram.ui.wd(this, isEmpty, x1Var, 1));
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
    public final boolean M(TLRPC.Document document) {
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
        org.telegram.ui.ActionBar.k2 k2Var = this.f30458a.C1;
        if (k2Var instanceof org.telegram.ui.un) {
            return ((org.telegram.ui.un) k2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        ax0 ax0Var = this.f30458a.S1;
        if (ax0Var != null && ax0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        ax0 ax0Var = this.f30458a.S1;
        if (ax0Var != null && ax0Var.c()) {
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
        if (this.f30458a.O1 != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f30458a.J1;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(org.telegram.messenger.kz kzVar) {
        this.f30458a.S0(kzVar);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i10) {
        if (this.f30458a.S1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        dx0 dx0Var = this.f30458a;
        ax0 ax0Var = dx0Var.S1;
        if (ax0Var == null) {
            return;
        }
        ax0Var.a(document, str, obj, null, dx0Var.Z1, z10, i10, 0);
        dx0Var.dismiss();
    }

    @Override
    public final void n(TLRPC.Document document) {
        dx0 dx0Var = this.f30458a;
        dx0.M0(dx0Var.C1, dx0Var.J1, document);
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
    public final org.telegram.messenger.kj y() {
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
    public final void K() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void N(CharSequence charSequence, String str, vg vgVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
