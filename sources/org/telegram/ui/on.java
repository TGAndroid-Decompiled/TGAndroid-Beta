package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class on implements vt {
    public final TLRPC.TL_messageMediaPoll f39010a;
    public final TLRPC.PollAnswer f39011b;
    public final org.telegram.ui.Cells.u1 f39012c;
    public final qn d;

    public on(qn qnVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.u1 u1Var) {
        this.d = qnVar;
        this.f39010a = tL_messageMediaPoll;
        this.f39011b = pollAnswer;
        this.f39012c = u1Var;
    }

    @Override
    public final MessageObject A() {
        return this.f39012c.getMessageObject();
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        return false;
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
        ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
        arrayList.add(this.f39011b);
        SendMessagesHelper sendMessagesHelper = this.d.f39497a.getSendMessagesHelper();
        org.telegram.ui.Cells.u1 u1Var = this.f39012c;
        sendMessagesHelper.sendVote(u1Var.getMessageObject(), arrayList, null);
        u1Var.S0(true);
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        fo foVar = this.d.f39497a;
        if (inputStickerSet != null && foVar.getParentActivity() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.f19236id = inputStickerSet.f19236id;
            org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0(foVar.getParentActivity(), foVar, tL_inputStickerSetID, null, foVar.Y, foVar.f35932ea);
            ty0Var.setCalcMandatoryInsets(foVar.C9());
            ty0Var.f29512i0 = z10;
            foVar.showDialog(ty0Var);
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
        return this.d.f39497a.T5;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        if (this.d.f39497a.R3 == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return this.f39010a;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final TLRPC.PollAnswer h() {
        return this.f39011b;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        return false;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void r() {
        SendMessagesHelper sendMessagesHelper = this.d.f39497a.getSendMessagesHelper();
        org.telegram.ui.Cells.u1 u1Var = this.f39012c;
        sendMessagesHelper.sendVote(u1Var.getMessageObject(), null, null);
        u1Var.S0(true);
    }

    @Override
    public final org.telegram.ui.Components.m80 u(ah.v vVar) {
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
    public final void F(TLRPC.Document document) {
    }

    @Override
    public final void H(TLRPC.Document document) {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void O(String str) {
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
    public final void t() {
    }

    @Override
    public final void v(TLRPC.Document document) {
    }

    @Override
    public final void z(String str) {
    }

    @Override
    public final void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
    }

    @Override
    public final void f(CharSequence charSequence, String str, mt mtVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
