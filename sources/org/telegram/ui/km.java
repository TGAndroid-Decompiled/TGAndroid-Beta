package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class km implements ls {
    public final TLRPC.TL_messageMediaPoll f49307a;
    public final TLRPC.PollAnswer f49308b;
    public final org.telegram.ui.Cells.r1 f49309c;
    public final mm d;

    public km(mm mmVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.r1 r1Var) {
        this.d = mmVar;
        this.f49307a = tL_messageMediaPoll;
        this.f49308b = pollAnswer;
        this.f49309c = r1Var;
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
    public final org.telegram.ui.Components.y60 E(ai.k0 k0Var) {
        return null;
    }

    @Override
    public final String G(boolean z10) {
        return null;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final boolean J() {
        return false;
    }

    @Override
    public final void K() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f49308b);
        org.telegram.messenger.zy sendMessagesHelper = this.d.f49896a.getSendMessagesHelper();
        org.telegram.ui.Cells.r1 r1Var = this.f49309c;
        sendMessagesHelper.w0(r1Var.getMessageObject(), arrayList, null);
        r1Var.a0(true);
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        bn bnVar = this.d.f49896a;
        if (inputStickerSet != null && bnVar.getParentActivity() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.f28423id = inputStickerSet.f28423id;
            org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(bnVar.getParentActivity(), bnVar, tL_inputStickerSetID, null, bnVar.f45923a0, bnVar.Ba);
            boolean V9 = bnVar.V9();
            iw0Var.f30208i0 = V9;
            iw0Var.f30215n = V9;
            iw0Var.d2 = z10;
            bnVar.showDialog(iw0Var);
        }
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
        return true;
    }

    @Override
    public final long a() {
        return this.d.f49896a.f46076l6;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        if (this.d.f49896a.f46009g4 == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return this.f49307a;
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
        return this.f49308b;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i7) {
        return false;
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void q() {
        org.telegram.messenger.zy sendMessagesHelper = this.d.f49896a.getSendMessagesHelper();
        org.telegram.ui.Cells.r1 r1Var = this.f49309c;
        sendMessagesHelper.w0(r1Var.getMessageObject(), null, null);
        r1Var.a0(true);
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final org.telegram.messenger.fj z() {
        return this.f49309c.getMessageObject();
    }

    @Override
    public final void B(TLRPC.Document document) {
    }

    @Override
    public final void F(TLRPC.Document document) {
    }

    @Override
    public final void H(TLRPC.Document document) {
    }

    @Override
    public final void O(String str) {
    }

    @Override
    public final void i(org.telegram.messenger.sy syVar) {
    }

    @Override
    public final void m(String str) {
    }

    @Override
    public final void n(TLRPC.Document document) {
    }

    @Override
    public final void p(TLRPC.Document document) {
    }

    @Override
    public final void t(TLRPC.Document document) {
    }

    @Override
    public final void x(String str) {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void y(CharSequence charSequence, String str, org.telegram.ui.Components.ph phVar) {
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}
