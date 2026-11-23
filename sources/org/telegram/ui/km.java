package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class km implements ls {
    public final TLRPC.TL_messageMediaPoll f49352a;
    public final TLRPC.PollAnswer f49353b;
    public final org.telegram.ui.Cells.r1 f49354c;
    public final mm d;

    public km(mm mmVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.r1 r1Var) {
        this.d = mmVar;
        this.f49352a = tL_messageMediaPoll;
        this.f49353b = pollAnswer;
        this.f49354c = r1Var;
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
    public final org.telegram.ui.Components.a70 E(ai.l0 l0Var) {
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
        arrayList.add(this.f49353b);
        org.telegram.messenger.az sendMessagesHelper = this.d.f49941a.getSendMessagesHelper();
        org.telegram.ui.Cells.r1 r1Var = this.f49354c;
        sendMessagesHelper.w0(r1Var.getMessageObject(), arrayList, null);
        r1Var.a0(true);
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        bn bnVar = this.d.f49941a;
        if (inputStickerSet != null && bnVar.getParentActivity() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.f28454id = inputStickerSet.f28454id;
            org.telegram.ui.Components.kw0 kw0Var = new org.telegram.ui.Components.kw0(bnVar.getParentActivity(), bnVar, tL_inputStickerSetID, null, bnVar.f45950a0, bnVar.Ba);
            boolean V9 = bnVar.V9();
            kw0Var.f30194i0 = V9;
            kw0Var.f30201n = V9;
            kw0Var.d2 = z10;
            bnVar.showDialog(kw0Var);
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
        return this.d.f49941a.f46103l6;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        if (this.d.f49941a.f46036g4 == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return this.f49352a;
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
        return this.f49353b;
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
        org.telegram.messenger.az sendMessagesHelper = this.d.f49941a.getSendMessagesHelper();
        org.telegram.ui.Cells.r1 r1Var = this.f49354c;
        sendMessagesHelper.w0(r1Var.getMessageObject(), null, null);
        r1Var.a0(true);
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final org.telegram.messenger.gj z() {
        return this.f49354c.getMessageObject();
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
    public final void i(org.telegram.messenger.ty tyVar) {
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
    public final void y(CharSequence charSequence, String str, org.telegram.ui.Components.rh rhVar) {
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}
