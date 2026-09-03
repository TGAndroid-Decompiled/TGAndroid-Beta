package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lx0 implements org.telegram.ui.ot {
    public final xx0 f28893a;

    public lx0(xx0 xx0Var) {
        this.f28893a = xx0Var;
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
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        xx0 xx0Var = this.f28893a;
        xx0Var.P.documents.remove(document);
        boolean isEmpty = xx0Var.P.documents.isEmpty();
        if (isEmpty) {
            xx0Var.dismiss();
        }
        xx0Var.d.l();
        Context context = xx0Var.getContext();
        g6Var = ((org.telegram.ui.ActionBar.h3) xx0Var).resourcesProvider;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, g6Var);
        d2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.h3) xx0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new mh.k7(this, isEmpty, d2Var, 2));
    }

    @Override
    public final String F(boolean z4) {
        return null;
    }

    @Override
    public final boolean H() {
        return true;
    }

    @Override
    public final q70 I(ag.l lVar) {
        return null;
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f28893a.I;
        if (p2Var instanceof org.telegram.ui.xn) {
            return ((org.telegram.ui.xn) p2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        ux0 ux0Var = this.f28893a.Y;
        if (ux0Var != null && ux0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        ux0 ux0Var = this.f28893a.Y;
        if (ux0Var != null && ux0Var.c()) {
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
        if (this.f28893a.U != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f28893a.P;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
        this.f28893a.u0(importingSticker);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i10) {
        if (this.f28893a.Y != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
        xx0 xx0Var = this.f28893a;
        ux0 ux0Var = xx0Var.Y;
        if (ux0Var == null) {
            return;
        }
        ux0Var.d(document, str, obj, null, xx0Var.f33229f0, z4, i10, 0);
        xx0Var.dismiss();
    }

    @Override
    public final void n(TLRPC.Document document) {
        xx0 xx0Var = this.f28893a;
        xx0.o0(xx0Var.I, xx0Var.P, document);
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
    public final void B(TLRPC.Document document) {
    }

    @Override
    public final void G(TLRPC.Document document) {
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
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void z(CharSequence charSequence, String str, xk xkVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }
}
