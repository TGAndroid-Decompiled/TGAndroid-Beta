package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ux0 implements org.telegram.ui.lt {
    public final fy0 f28945a;

    public ux0(fy0 fy0Var) {
        this.f28945a = fy0Var;
    }

    @Override
    public final MessageObject A() {
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
        org.telegram.ui.ActionBar.d6 d6Var;
        int i10;
        fy0 fy0Var = this.f28945a;
        fy0Var.S.documents.remove(document);
        boolean isEmpty = fy0Var.S.documents.isEmpty();
        if (isEmpty) {
            fy0Var.dismiss();
        }
        fy0Var.d.l();
        Context context = fy0Var.getContext();
        d6Var = ((org.telegram.ui.ActionBar.e3) fy0Var).resourcesProvider;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, d6Var);
        a2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.e3) fy0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new ci.v1(this, isEmpty, a2Var, 3));
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f28945a.L;
        if (m2Var instanceof org.telegram.ui.wn) {
            return ((org.telegram.ui.wn) m2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        cy0 cy0Var = this.f28945a.f24288b0;
        if (cy0Var != null && cy0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        cy0 cy0Var = this.f28945a.f24288b0;
        if (cy0Var != null && cy0Var.c()) {
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
    public final boolean g() {
        if (this.f28945a.X != null) {
            return true;
        }
        return false;
    }

    @Override
    public final TLRPC.PollAnswer h() {
        return null;
    }

    @Override
    public final boolean i() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f28945a.S;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final y70 j(ci.m6 m6Var) {
        return null;
    }

    @Override
    public final void k(SendMessagesHelper.ImportingSticker importingSticker) {
        this.f28945a.u0(importingSticker);
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean m(int i10) {
        if (this.f28945a.f24288b0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        fy0 fy0Var = this.f28945a;
        cy0 cy0Var = fy0Var.f24288b0;
        if (cy0Var == null) {
            return;
        }
        cy0Var.d(document, str, obj, null, fy0Var.f24297i0, z10, i10, 0);
        fy0Var.dismiss();
    }

    @Override
    public final void p(TLRPC.Document document) {
        fy0 fy0Var = this.f28945a;
        fy0.o0(fy0Var.L, fy0Var.S, document);
    }

    @Override
    public final boolean q() {
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
    public final void K() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void O(String str) {
    }

    @Override
    public final void o(String str) {
    }

    @Override
    public final void r(TLRPC.Document document) {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void v(TLRPC.Document document) {
    }

    @Override
    public final void z(String str) {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
    }

    @Override
    public final void f(CharSequence charSequence, String str, org.telegram.ui.bt btVar) {
    }

    @Override
    public final void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
