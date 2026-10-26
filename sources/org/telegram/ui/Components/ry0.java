package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ry0 implements org.telegram.ui.dt {
    public final cz0 f32347a;

    public ry0(cz0 cz0Var) {
        this.f32347a = cz0Var;
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
        org.telegram.ui.ActionBar.u6 u6Var;
        int i10;
        cz0 cz0Var = this.f32347a;
        cz0Var.S.documents.remove(document);
        boolean isEmpty = cz0Var.S.documents.isEmpty();
        if (isEmpty) {
            cz0Var.dismiss();
        }
        cz0Var.d.l();
        Context context = cz0Var.getContext();
        u6Var = ((org.telegram.ui.ActionBar.k3) cz0Var).resourcesProvider;
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(context, 3, u6Var);
        e2Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.k3) cz0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new bi.r9(this, isEmpty, e2Var, 4));
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
    public final boolean M(TLRPC.Document document) {
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
        org.telegram.ui.ActionBar.r2 r2Var = this.f32347a.L;
        if (r2Var instanceof org.telegram.ui.un) {
            return ((org.telegram.ui.un) r2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        zy0 zy0Var = this.f32347a.f27290b0;
        if (zy0Var != null && zy0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        zy0 zy0Var = this.f32347a.f27290b0;
        if (zy0Var != null && zy0Var.c()) {
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
        if (this.f32347a.X != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f32347a.S;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final k80 i(bh.p pVar) {
        return null;
    }

    @Override
    public final void j(SendMessagesHelper.ImportingSticker importingSticker) {
        this.f32347a.w0(importingSticker);
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        if (this.f32347a.f27290b0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        cz0 cz0Var = this.f32347a;
        zy0 zy0Var = cz0Var.f27290b0;
        if (zy0Var == null) {
            return;
        }
        zy0Var.a(document, str, obj, null, cz0Var.f27299i0, z10, i10, 0);
        cz0Var.dismiss();
    }

    @Override
    public final void o(TLRPC.Document document) {
        cz0 cz0Var = this.f32347a;
        cz0.q0(cz0Var.L, cz0Var.S, document);
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
    public final void J() {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void B(TLRPC.Document document) {
    }

    @Override
    public final void G(TLRPC.Document document) {
    }

    @Override
    public final void N(String str) {
    }

    @Override
    public final void n(String str) {
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
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
    }

    @Override
    public final void O(CharSequence charSequence, String str, oy oyVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
