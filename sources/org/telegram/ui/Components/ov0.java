package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ov0 implements org.telegram.ui.ks {
    public final zv0 f36809a;

    public ov0(zv0 zv0Var) {
        this.f36809a = zv0Var;
    }

    @Override
    public final org.telegram.messenger.ij A() {
        return null;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean D() {
        return true;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        return false;
    }

    @Override
    public final void F(TLRPC.Document document) {
        zv0 zv0Var = this.f36809a;
        zv0Var.J1.documents.remove(document);
        boolean isEmpty = zv0Var.J1.documents.isEmpty();
        if (isEmpty) {
            zv0Var.dismiss();
        }
        zv0Var.f41155k1.f();
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, zv0Var.getContext(), zv0Var.I0);
        u1Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.ui.a0(document, "").document;
        ConnectionsManager.getInstance(zv0Var.f28621a).sendRequest(tL_stickers_removeStickerFromSet, new bi.u9(this, isEmpty, u1Var, 4));
    }

    @Override
    public final String G(boolean z9) {
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
        org.telegram.ui.ActionBar.f2 f2Var = this.f36809a.C1;
        if (f2Var instanceof org.telegram.ui.cn) {
            return ((org.telegram.ui.cn) f2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        wv0 wv0Var = this.f36809a.S1;
        if (wv0Var != null && wv0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        wv0 wv0Var = this.f36809a.S1;
        if (wv0Var != null && wv0Var.c()) {
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
        if (this.f36809a.O1 != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f36809a.J1;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(org.telegram.messenger.zy zyVar) {
        this.f36809a.S0(zyVar);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i7) {
        if (this.f36809a.S1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
        zv0 zv0Var = this.f36809a;
        wv0 wv0Var = zv0Var.S1;
        if (wv0Var == null) {
            return;
        }
        wv0Var.a(document, str, obj, null, zv0Var.Z1, z9, i7, 0);
        zv0Var.dismiss();
    }

    @Override
    public final l60 m(bi.x5 x5Var) {
        return null;
    }

    @Override
    public final void o(TLRPC.Document document) {
        zv0 zv0Var = this.f36809a;
        zv0.M0(zv0Var.C1, zv0Var.J1, document);
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final boolean y() {
        return true;
    }

    @Override
    public final void C(TLRPC.Document document) {
    }

    @Override
    public final void H(TLRPC.Document document) {
    }

    @Override
    public final void O(String str) {
    }

    @Override
    public final void n(String str) {
    }

    @Override
    public final void q(TLRPC.Document document) {
    }

    @Override
    public final void v(TLRPC.Document document) {
    }

    @Override
    public final void z(String str) {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
    }

    @Override
    public final void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
    }

    @Override
    public final void u(CharSequence charSequence, String str, fx fxVar) {
    }

    @Override
    public final void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
    }
}
