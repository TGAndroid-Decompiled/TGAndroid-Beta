package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class iy0 implements org.telegram.ui.vt {
    public final ty0 f26124a;

    public iy0(ty0 ty0Var) {
        this.f26124a = ty0Var;
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
        org.telegram.ui.ActionBar.c6 c6Var;
        int i10;
        ty0 ty0Var = this.f26124a;
        ty0Var.S.documents.remove(document);
        boolean isEmpty = ty0Var.S.documents.isEmpty();
        if (isEmpty) {
            ty0Var.dismiss();
        }
        ty0Var.d.l();
        Context context = ty0Var.getContext();
        c6Var = ((org.telegram.ui.ActionBar.e3) ty0Var).resourcesProvider;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, c6Var);
        a2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.e3) ty0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new di.u1(this, isEmpty, a2Var, 3));
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f26124a.L;
        if (m2Var instanceof org.telegram.ui.fo) {
            return ((org.telegram.ui.fo) m2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        qy0 qy0Var = this.f26124a.f29503b0;
        if (qy0Var != null && qy0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        qy0 qy0Var = this.f26124a.f29503b0;
        if (qy0Var != null && qy0Var.c()) {
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
        if (this.f26124a.X != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f26124a.S;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final void j(SendMessagesHelper.ImportingSticker importingSticker) {
        this.f26124a.v0(importingSticker);
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        if (this.f26124a.f29503b0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        ty0 ty0Var = this.f26124a;
        qy0 qy0Var = ty0Var.f29503b0;
        if (qy0Var == null) {
            return;
        }
        qy0Var.a(document, str, obj, null, ty0Var.f29512i0, z10, i10, 0);
        ty0Var.dismiss();
    }

    @Override
    public final void o(TLRPC.Document document) {
        ty0 ty0Var = this.f26124a;
        ty0.p0(ty0Var.L, ty0Var.S, document);
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final m80 u(ah.v vVar) {
        return null;
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
    public final void f(CharSequence charSequence, String str, org.telegram.ui.mt mtVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
