package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class in implements pt {
    public final TLRPC.TL_messageMediaPoll f37456a;
    public final TLRPC.PollAnswer f37457b;
    public final org.telegram.ui.Cells.u1 f37458c;
    public final kn d;

    public in(kn knVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.u1 u1Var) {
        this.d = knVar;
        this.f37456a = tL_messageMediaPoll;
        this.f37457b = pollAnswer;
        this.f37458c = u1Var;
    }

    @Override
    public final MessageObject A() {
        return this.f37458c.getMessageObject();
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
        arrayList.add(this.f37457b);
        SendMessagesHelper sendMessagesHelper = this.d.f38076a.getSendMessagesHelper();
        org.telegram.ui.Cells.u1 u1Var = this.f37458c;
        sendMessagesHelper.sendVote(u1Var.getMessageObject(), arrayList, null);
        u1Var.S0(true);
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        yn ynVar = this.d.f38076a;
        if (inputStickerSet != null && ynVar.getParentActivity() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.f20067id = inputStickerSet.f20067id;
            org.telegram.ui.Components.ry0 ry0Var = new org.telegram.ui.Components.ry0(ynVar.getParentActivity(), ynVar, tL_inputStickerSetID, null, ynVar.W, ynVar.f43300ca);
            ry0Var.setCalcMandatoryInsets(ynVar.w9());
            ry0Var.f30619i0 = z10;
            ynVar.showDialog(ry0Var);
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
        return this.d.f38076a.R5;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        if (this.d.f38076a.P3 == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return this.f37456a;
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
        return this.f37457b;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final org.telegram.ui.Components.b80 j(ci.m6 m6Var) {
        return null;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean m(int i10) {
        return false;
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void s() {
        SendMessagesHelper sendMessagesHelper = this.d.f38076a.getSendMessagesHelper();
        org.telegram.ui.Cells.u1 u1Var = this.f37458c;
        sendMessagesHelper.sendVote(u1Var.getMessageObject(), null, null);
        u1Var.S0(true);
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
    public final void k(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void o(String str) {
    }

    @Override
    public final void p(TLRPC.Document document) {
    }

    @Override
    public final void r(TLRPC.Document document) {
    }

    @Override
    public final void u() {
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
    public final void f(CharSequence charSequence, String str, ft ftVar) {
    }

    @Override
    public final void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
