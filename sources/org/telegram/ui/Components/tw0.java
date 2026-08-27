package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class tw0 implements org.telegram.ui.ht {

    public final ex0 f32903a;

    public tw0(ex0 ex0Var) {
        this.f32903a = ex0Var;
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
    public final void D(TLRPC.Document document) {
        ex0 ex0Var = this.f32903a;
        ex0Var.O.documents.remove(document);
        boolean zIsEmpty = ex0Var.O.documents.isEmpty();
        if (zIsEmpty) {
            ex0Var.dismiss();
        }
        ex0Var.d.l();
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ex0Var.getContext(), 3, ((org.telegram.ui.ActionBar.e3) ex0Var).resourcesProvider);
        b2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.e3) ex0Var).currentAccount).sendRequest(tL_stickers_removeStickerFromSet, new hh.l7(this, zIsEmpty, b2Var, 3));
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
    public final b70 L(ag.y1 y1Var) {
        return null;
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f32903a.H;
        if (n2Var instanceof org.telegram.ui.rn) {
            return ((org.telegram.ui.rn) n2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        bx0 bx0Var = this.f32903a.X;
        return bx0Var != null && bx0Var.b();
    }

    @Override
    public final boolean c() {
        bx0 bx0Var = this.f32903a.X;
        return bx0Var != null && bx0Var.c();
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
        return this.f32903a.T != null;
    }

    @Override
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f32903a.O;
        return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
    }

    @Override
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
        this.f32903a.u0(importingSticker);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i10) {
        return this.f32903a.X != null;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        ex0 ex0Var = this.f32903a;
        bx0 bx0Var = ex0Var.X;
        if (bx0Var == null) {
            return;
        }
        bx0Var.e(document, str, obj, null, ex0Var.f28177e0, z10, i10, 0);
        ex0Var.dismiss();
    }

    @Override
    public final void n(TLRPC.Document document) {
        ex0 ex0Var = this.f32903a;
        ex0.o0(ex0Var.H, ex0Var.O, document);
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
    public final MessageObject y() {
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
    public final void J() {
    }

    @Override
    public final void K() {
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
    public final void q() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void t(TLRPC.Document document) {
    }

    @Override
    public final void x(String str) {
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
    public final void E(CharSequence charSequence, String str, org.telegram.ui.df dfVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
