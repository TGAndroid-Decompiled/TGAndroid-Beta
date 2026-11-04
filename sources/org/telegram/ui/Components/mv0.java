package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mv0 implements org.telegram.ui.gs {
    public final xv0 f36258a;

    public mv0(xv0 xv0Var) {
        this.f36258a = xv0Var;
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
    public final void E(TLRPC.Document document) {
        xv0 xv0Var = this.f36258a;
        xv0Var.K1.documents.remove(document);
        boolean isEmpty = xv0Var.K1.documents.isEmpty();
        if (isEmpty) {
            xv0Var.dismiss();
        }
        xv0Var.f40517l1.f();
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, xv0Var.getContext(), xv0Var.J0);
        s1Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.li.a0(document, "").document;
        ConnectionsManager.getInstance(xv0Var.f28583a).sendRequest(tL_stickers_removeStickerFromSet, new ci.t8(this, isEmpty, s1Var, 4));
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
        org.telegram.ui.ActionBar.d2 d2Var = this.f36258a.D1;
        if (d2Var instanceof org.telegram.ui.wm) {
            return ((org.telegram.ui.wm) d2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        uv0 uv0Var = this.f36258a.T1;
        if (uv0Var != null && uv0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        uv0 uv0Var = this.f36258a.T1;
        if (uv0Var != null && uv0Var.c()) {
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
        if (this.f36258a.P1 != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f36258a.K1;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(org.telegram.messenger.ry ryVar) {
        this.f36258a.S0(ryVar);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i3) {
        if (this.f36258a.T1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i3, int i10) {
        xv0 xv0Var = this.f36258a;
        uv0 uv0Var = xv0Var.T1;
        if (uv0Var == null) {
            return;
        }
        uv0Var.a(document, str, obj, null, xv0Var.f40506a2, z10, i3, 0);
        xv0Var.dismiss();
    }

    @Override
    public final f60 n(ai.c0 c0Var) {
        return null;
    }

    @Override
    public final void o(TLRPC.Document document) {
        xv0 xv0Var = this.f36258a;
        xv0.M0(xv0Var.D1, xv0Var.K1, document);
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final boolean x() {
        return true;
    }

    @Override
    public final org.telegram.messenger.zi z() {
        return null;
    }

    @Override
    public final void B(TLRPC.Document document) {
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
    public final void q(TLRPC.Document document) {
    }

    @Override
    public final void u(TLRPC.Document document) {
    }

    @Override
    public final void y(String str) {
    }

    @Override
    public final void J() {
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
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
    }

    @Override
    public final void K(CharSequence charSequence, String str, ei eiVar) {
    }

    @Override
    public final void s(int i3, int i10, Object obj, TLObject tLObject, boolean z10) {
    }
}
