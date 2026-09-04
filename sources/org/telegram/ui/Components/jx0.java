package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jx0 implements org.telegram.ui.qt {
    public final ux0 f27583a;

    public jx0(ux0 ux0Var) {
        this.f27583a = ux0Var;
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
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        ux0 ux0Var = this.f27583a;
        ux0Var.S.documents.remove(document);
        boolean isEmpty = ux0Var.S.documents.isEmpty();
        if (isEmpty) {
            ux0Var.dismiss();
        }
        ux0Var.d.l();
        Context context = ux0Var.getContext();
        f6Var = ((org.telegram.ui.ActionBar.f3) ux0Var).resourcesProvider;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, f6Var);
        b2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.f3) ux0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new di.v1(this, isEmpty, b2Var, 3));
    }

    @Override
    public final String F(boolean z10) {
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f27583a.L;
        if (n2Var instanceof org.telegram.ui.co) {
            return ((org.telegram.ui.co) n2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        rx0 rx0Var = this.f27583a.f30993b0;
        if (rx0Var != null && rx0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        rx0 rx0Var = this.f27583a.f30993b0;
        if (rx0Var != null && rx0Var.c()) {
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
        if (this.f27583a.X != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f27583a.S;
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
        if (this.f27583a.f30993b0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        ux0 ux0Var = this.f27583a;
        rx0 rx0Var = ux0Var.f30993b0;
        if (rx0Var == null) {
            return;
        }
        rx0Var.a(document, str, obj, null, ux0Var.f31003i0, z10, i10, 0);
        ux0Var.dismiss();
    }

    @Override
    public final void n(TLRPC.Document document) {
        ux0 ux0Var = this.f27583a;
        ux0.o0(ux0Var.L, ux0Var.S, document);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final n70 t(ah.w wVar) {
        return null;
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
    public final void B(TLRPC.Document document) {
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
    public final void u(TLRPC.Document document) {
    }

    @Override
    public final void y(String str) {
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
    public final void G(CharSequence charSequence, String str, org.telegram.ui.nf nfVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
