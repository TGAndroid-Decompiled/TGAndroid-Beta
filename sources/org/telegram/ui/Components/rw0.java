package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rw0 implements org.telegram.ui.ft {
    public final cx0 f32296a;

    public rw0(cx0 cx0Var) {
        this.f32296a = cx0Var;
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
        org.telegram.ui.ActionBar.b6 b6Var;
        int i9;
        cx0 cx0Var = this.f32296a;
        cx0Var.O.documents.remove(document);
        boolean isEmpty = cx0Var.O.documents.isEmpty();
        if (isEmpty) {
            cx0Var.dismiss();
        }
        cx0Var.d.l();
        Context context = cx0Var.getContext();
        b6Var = ((org.telegram.ui.ActionBar.f3) cx0Var).resourcesProvider;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, b6Var);
        c2Var.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
        i9 = ((org.telegram.ui.ActionBar.f3) cx0Var).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(tL_stickers_removeStickerFromSet, new gh.m7(this, isEmpty, c2Var, 4));
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
        org.telegram.ui.ActionBar.o2 o2Var = this.f32296a.H;
        if (o2Var instanceof org.telegram.ui.qn) {
            return ((org.telegram.ui.qn) o2Var).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        zw0 zw0Var = this.f32296a.X;
        if (zw0Var != null && zw0Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        zw0 zw0Var = this.f32296a.X;
        if (zw0Var != null && zw0Var.c()) {
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
        if (this.f32296a.T != null) {
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f32296a.O;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
        this.f32296a.t0(importingSticker);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i9) {
        if (this.f32296a.X != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i9, int i10) {
        cx0 cx0Var = this.f32296a;
        zw0 zw0Var = cx0Var.X;
        if (zw0Var == null) {
            return;
        }
        zw0Var.a(document, str, obj, null, cx0Var.f27577e0, z10, i9, 0);
        cx0Var.dismiss();
    }

    @Override
    public final void n(TLRPC.Document document) {
        cx0 cx0Var = this.f32296a;
        cx0.n0(cx0Var.H, cx0Var.O, document);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final x60 r(fh.v vVar) {
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
    public final void t() {
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
    public final void F(CharSequence charSequence, String str, org.telegram.ui.df dfVar) {
    }

    @Override
    public final void s(int i9, int i10, Object obj, TLObject tLObject, boolean z10) {
    }
}
