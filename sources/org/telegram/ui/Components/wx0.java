package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wx0 implements org.telegram.ui.rt {
    public final hy0 f28861a;

    public wx0(hy0 hy0Var) {
        this.f28861a = hy0Var;
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
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        hy0 hy0Var = this.f28861a;
        hy0Var.S.documents.remove(document);
        boolean isEmpty = hy0Var.S.documents.isEmpty();
        if (isEmpty) {
            hy0Var.dismiss();
        }
        hy0Var.d.l();
        Context context = hy0Var.getContext();
        f6Var = ((org.telegram.ui.ActionBar.h3) hy0Var).resourcesProvider;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, f6Var);
        d2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.h3) hy0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new bi.f2(this, isEmpty, d2Var, 3));
    }

    @Override
    public final String E(boolean z10) {
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
    public final w70 K(bi.n7 n7Var) {
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
        org.telegram.ui.ActionBar.p2 p2Var = this.f28861a.L;
        if (p2Var instanceof org.telegram.ui.eo) {
            return ((org.telegram.ui.eo) p2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        ey0 ey0Var = this.f28861a.f23805b0;
        if (ey0Var != null && ey0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        ey0 ey0Var = this.f28861a.f23805b0;
        if (ey0Var != null && ey0Var.c()) {
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
        if (this.f28861a.X != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f28861a.S;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
        this.f28861a.u0(importingSticker);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i10) {
        if (this.f28861a.f23805b0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        hy0 hy0Var = this.f28861a;
        ey0 ey0Var = hy0Var.f23805b0;
        if (ey0Var == null) {
            return;
        }
        ey0Var.d(document, str, obj, null, hy0Var.f23814i0, z10, i10, 0);
        hy0Var.dismiss();
    }

    @Override
    public final void n(TLRPC.Document document) {
        hy0 hy0Var = this.f28861a;
        hy0.o0(hy0Var.L, hy0Var.S, document);
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
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void F(CharSequence charSequence, String str, org.telegram.ui.pf pfVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
