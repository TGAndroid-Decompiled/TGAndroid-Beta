package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hy0 implements org.telegram.ui.ft {
    public final sy0 f27204a;

    public hy0(sy0 sy0Var) {
        this.f27204a = sy0Var;
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
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        sy0 sy0Var = this.f27204a;
        sy0Var.S.documents.remove(document);
        boolean isEmpty = sy0Var.S.documents.isEmpty();
        if (isEmpty) {
            sy0Var.dismiss();
        }
        sy0Var.d.l();
        Context context = sy0Var.getContext();
        g6Var = ((org.telegram.ui.ActionBar.h3) sy0Var).resourcesProvider;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, g6Var);
        c2Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.h3) sy0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_removeStickerFromSet, new ai.w9(this, isEmpty, c2Var, 4));
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
        org.telegram.ui.ActionBar.o2 o2Var = this.f27204a.L;
        if (o2Var instanceof org.telegram.ui.sn) {
            return ((org.telegram.ui.sn) o2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        py0 py0Var = this.f27204a.f30636b0;
        if (py0Var != null && py0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        py0 py0Var = this.f27204a.f30636b0;
        if (py0Var != null && py0Var.c()) {
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
        if (this.f27204a.X != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f27204a.S;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
        this.f27204a.w0(importingSticker);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i10) {
        if (this.f27204a.f30636b0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        sy0 sy0Var = this.f27204a;
        py0 py0Var = sy0Var.f30636b0;
        if (py0Var == null) {
            return;
        }
        py0Var.a(document, str, obj, null, sy0Var.f30645i0, z10, i10, 0);
        sy0Var.dismiss();
    }

    @Override
    public final void n(TLRPC.Document document) {
        sy0 sy0Var = this.f27204a;
        sy0.q0(sy0Var.L, sy0Var.S, document);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final h80 u(ah.v vVar) {
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
    public final void t(CharSequence charSequence, String str, oy oyVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
