package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lx0 implements org.telegram.ui.nt {
    public final xx0 f26894a;

    public lx0(xx0 xx0Var) {
        this.f26894a = xx0Var;
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
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        xx0 xx0Var = this.f26894a;
        xx0Var.P.documents.remove(document);
        boolean isEmpty = xx0Var.P.documents.isEmpty();
        if (isEmpty) {
            xx0Var.dismiss();
        }
        xx0Var.d.l();
        Context context = xx0Var.getContext();
        f6Var = ((org.telegram.ui.ActionBar.g3) xx0Var).resourcesProvider;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, f6Var);
        d2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.g3) xx0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new lh.k7(this, isEmpty, d2Var, 2));
    }

    @Override
    public final String G(boolean z4) {
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f26894a.I;
        if (p2Var instanceof org.telegram.ui.xn) {
            return ((org.telegram.ui.xn) p2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        ux0 ux0Var = this.f26894a.Y;
        if (ux0Var != null && ux0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        ux0 ux0Var = this.f26894a.Y;
        if (ux0Var != null && ux0Var.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final o70 d(ah.d dVar) {
        return null;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll e() {
        return null;
    }

    @Override
    public final boolean f(TLRPC.Document document) {
        return false;
    }

    @Override
    public final boolean g() {
        if (this.f26894a.U != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f26894a.P;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final void j(SendMessagesHelper.ImportingSticker importingSticker) {
        this.f26894a.u0(importingSticker);
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        if (this.f26894a.Y != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
        xx0 xx0Var = this.f26894a;
        ux0 ux0Var = xx0Var.Y;
        if (ux0Var == null) {
            return;
        }
        ux0Var.d(document, str, obj, null, xx0Var.f30775f0, z4, i10, 0);
        xx0Var.dismiss();
    }

    @Override
    public final void o(TLRPC.Document document) {
        xx0 xx0Var = this.f26894a;
        xx0.o0(xx0Var.I, xx0Var.P, document);
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
    public final MessageObject z() {
        return null;
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
    public final void n(String str) {
    }

    @Override
    public final void q(TLRPC.Document document) {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void u(TLRPC.Document document) {
    }

    @Override
    public final void y(String str) {
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
    }

    @Override
    public final void A(CharSequence charSequence, String str, vk vkVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }
}
