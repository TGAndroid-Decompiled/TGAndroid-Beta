package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vx0 implements org.telegram.ui.qt {
    public final gy0 f29856a;

    public vx0(gy0 gy0Var) {
        this.f29856a = gy0Var;
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
        org.telegram.ui.ActionBar.f6 f6Var;
        int i10;
        gy0 gy0Var = this.f29856a;
        gy0Var.S.documents.remove(document);
        boolean isEmpty = gy0Var.S.documents.isEmpty();
        if (isEmpty) {
            gy0Var.dismiss();
        }
        gy0Var.d.l();
        Context context = gy0Var.getContext();
        f6Var = ((org.telegram.ui.ActionBar.f3) gy0Var).resourcesProvider;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, f6Var);
        b2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.f3) gy0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new ci.v1(this, isEmpty, b2Var, 3));
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
        org.telegram.ui.ActionBar.n2 n2Var = this.f29856a.L;
        if (n2Var instanceof org.telegram.ui.zn) {
            return ((org.telegram.ui.zn) n2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        dy0 dy0Var = this.f29856a.f24478b0;
        if (dy0Var != null && dy0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        dy0 dy0Var = this.f29856a.f24478b0;
        if (dy0Var != null && dy0Var.c()) {
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
        if (this.f29856a.X != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f29856a.S;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final v70 i(ci.n6 n6Var) {
        return null;
    }

    @Override
    public final void j(SendMessagesHelper.ImportingSticker importingSticker) {
        this.f29856a.u0(importingSticker);
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        if (this.f29856a.f24478b0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        gy0 gy0Var = this.f29856a;
        dy0 dy0Var = gy0Var.f24478b0;
        if (dy0Var == null) {
            return;
        }
        dy0Var.d(document, str, obj, null, gy0Var.f24487i0, z10, i10, 0);
        gy0Var.dismiss();
    }

    @Override
    public final void o(TLRPC.Document document) {
        gy0 gy0Var = this.f29856a;
        gy0.o0(gy0Var.L, gy0Var.S, document);
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
    public final void u(CharSequence charSequence, String str, org.telegram.ui.of ofVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
