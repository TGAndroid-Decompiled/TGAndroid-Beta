package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ak implements dt {
    public final un f37815a;

    public ak(un unVar) {
        this.f37815a = unVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        return false;
    }

    @Override
    public final String F(boolean z10) {
        return null;
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet != null) {
            un unVar = this.f37815a;
            if (unVar.getParentActivity() != null) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
                tL_inputStickerSetID.f22047id = inputStickerSet.f22047id;
                org.telegram.ui.Components.cz0 cz0Var = new org.telegram.ui.Components.cz0(unVar.getParentActivity(), unVar, tL_inputStickerSetID, null, unVar.Y, unVar.f44385qa);
                cz0Var.setCalcMandatoryInsets(unVar.F9());
                cz0Var.f27297i0 = z10;
                unVar.showDialog(cz0Var);
            }
        }
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
        return true;
    }

    @Override
    public final long a() {
        return this.f37815a.f44249f6;
    }

    @Override
    public final boolean b() {
        return this.f37815a.I6();
    }

    @Override
    public final boolean c() {
        if (this.f37815a.f44221d4 == 1) {
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
        return false;
    }

    @Override
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final org.telegram.ui.Components.k80 i(bh.p pVar) {
        return null;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        return true;
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f37815a.Y.a(document, str, obj, null, true, z10, i10, i11);
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
    public final void E(TLRPC.Document document) {
    }

    @Override
    public final void G(TLRPC.Document document) {
    }

    @Override
    public final void N(String str) {
    }

    @Override
    public final void j(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void n(String str) {
    }

    @Override
    public final void o(TLRPC.Document document) {
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
    public final void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
    }

    @Override
    public final void O(CharSequence charSequence, String str, org.telegram.ui.Components.oy oyVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
