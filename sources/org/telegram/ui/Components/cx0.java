package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cx0 implements org.telegram.ui.ft {
    public final nx0 f27583a;

    public cx0(nx0 nx0Var) {
        this.f27583a = nx0Var;
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
        org.telegram.ui.ActionBar.c6 c6Var;
        int i10;
        nx0 nx0Var = this.f27583a;
        nx0Var.O.documents.remove(document);
        boolean isEmpty = nx0Var.O.documents.isEmpty();
        if (isEmpty) {
            nx0Var.dismiss();
        }
        nx0Var.d.l();
        Context context = nx0Var.getContext();
        c6Var = ((org.telegram.ui.ActionBar.f3) nx0Var).resourcesProvider;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, c6Var);
        c2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.f3) nx0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new jh.j7(this, isEmpty, c2Var, 3));
    }

    @Override
    public final String E(boolean z10) {
        return null;
    }

    @Override
    public final j70 G(bg.d1 d1Var) {
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
        org.telegram.ui.ActionBar.o2 o2Var = this.f27583a.H;
        if (o2Var instanceof org.telegram.ui.tn) {
            return ((org.telegram.ui.tn) o2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        kx0 kx0Var = this.f27583a.X;
        if (kx0Var != null && kx0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        kx0 kx0Var = this.f27583a.X;
        if (kx0Var != null && kx0Var.c()) {
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
        if (this.f27583a.T != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f27583a.O;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
        this.f27583a.u0(importingSticker);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i10) {
        if (this.f27583a.X != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        nx0 nx0Var = this.f27583a;
        kx0 kx0Var = nx0Var.X;
        if (kx0Var == null) {
            return;
        }
        kx0Var.a(document, str, obj, null, nx0Var.f31175e0, z10, i10, 0);
        nx0Var.dismiss();
    }

    @Override
    public final void n(TLRPC.Document document) {
        nx0 nx0Var = this.f27583a;
        nx0.o0(nx0Var.H, nx0Var.O, document);
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
    public final void F(CharSequence charSequence, String str, org.telegram.ui.tm tmVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
