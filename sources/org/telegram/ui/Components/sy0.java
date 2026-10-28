package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sy0 implements org.telegram.ui.ft {
    public final dz0 f32703a;

    public sy0(dz0 dz0Var) {
        this.f32703a = dz0Var;
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
        dz0 dz0Var = this.f32703a;
        dz0Var.S.documents.remove(document);
        boolean isEmpty = dz0Var.S.documents.isEmpty();
        if (isEmpty) {
            dz0Var.dismiss();
        }
        dz0Var.d.l();
        Context context = dz0Var.getContext();
        u6Var = ((org.telegram.ui.ActionBar.k3) dz0Var).resourcesProvider;
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(context, 3, u6Var);
        e2Var.r(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i10 = ((org.telegram.ui.ActionBar.k3) dz0Var).currentAccount;
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
        org.telegram.ui.ActionBar.r2 r2Var = this.f32703a.L;
        if (r2Var instanceof org.telegram.ui.wn) {
            return ((org.telegram.ui.wn) r2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        az0 az0Var = this.f32703a.f27580b0;
        if (az0Var != null && az0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        az0 az0Var = this.f32703a.f27580b0;
        if (az0Var != null && az0Var.c()) {
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
        if (this.f32703a.X != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f32703a.S;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final l80 i(bh.p pVar) {
        return null;
    }

    @Override
    public final void j(SendMessagesHelper.ImportingSticker importingSticker) {
        this.f32703a.w0(importingSticker);
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        if (this.f32703a.f27580b0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        dz0 dz0Var = this.f32703a;
        az0 az0Var = dz0Var.f27580b0;
        if (az0Var == null) {
            return;
        }
        az0Var.a(document, str, obj, null, dz0Var.f27589i0, z10, i10, 0);
        dz0Var.dismiss();
    }

    @Override
    public final void o(TLRPC.Document document) {
        dz0 dz0Var = this.f32703a;
        dz0.q0(dz0Var.L, dz0Var.S, document);
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
