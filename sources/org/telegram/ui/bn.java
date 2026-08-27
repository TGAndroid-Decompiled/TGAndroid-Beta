package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class bn implements ht {

    public final TLRPC.TL_messageMediaPoll f36855a;

    public final TLRPC.PollAnswer f36856b;

    public final org.telegram.ui.Cells.s1 f36857c;
    public final dn d;

    public bn(dn dnVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.s1 s1Var) {
        this.d = dnVar;
        this.f36855a = tL_messageMediaPoll;
        this.f36856b = pollAnswer;
        this.f36857c = s1Var;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
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
    public final void J() {
        ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
        arrayList.add(this.f36856b);
        SendMessagesHelper sendMessagesHelper = this.d.f37446a.getSendMessagesHelper();
        org.telegram.ui.Cells.s1 s1Var = this.f36857c;
        sendMessagesHelper.sendVote(s1Var.getMessageObject(), arrayList, null);
        s1Var.R0(true);
    }

    @Override
    public final org.telegram.ui.Components.b70 L(ag.y1 y1Var) {
        return null;
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        rn rnVar = this.d.f37446a;
        if (inputStickerSet == null || rnVar.getParentActivity() == null) {
            return;
        }
        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
        tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
        tL_inputStickerSetID.f22400id = inputStickerSet.f22400id;
        org.telegram.ui.Components.ex0 ex0Var = new org.telegram.ui.Components.ex0(rnVar.getParentActivity(), rnVar, tL_inputStickerSetID, null, rnVar.U, rnVar.f41983aa);
        ex0Var.setCalcMandatoryInsets(rnVar.x9());
        ex0Var.f28177e0 = z10;
        rnVar.showDialog(ex0Var);
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
        return this.d.f37446a.P5;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return this.d.f37446a.N3 == 1;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return this.f36855a;
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
        return this.f36856b;
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
    public final boolean k(int i10) {
        return false;
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void q() {
        SendMessagesHelper sendMessagesHelper = this.d.f37446a.getSendMessagesHelper();
        org.telegram.ui.Cells.s1 s1Var = this.f36857c;
        sendMessagesHelper.sendVote(s1Var.getMessageObject(), null, null);
        s1Var.R0(true);
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final MessageObject y() {
        return this.f36857c.getMessageObject();
    }

    @Override
    public final boolean z() {
        return false;
    }

    @Override
    public final void A(TLRPC.Document document) {
    }

    @Override
    public final void D(TLRPC.Document document) {
    }

    @Override
    public final void G(TLRPC.Document document) {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void O(String str) {
    }

    @Override
    public final void i(SendMessagesHelper.ImportingSticker importingSticker) {
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
    public final void s() {
    }

    @Override
    public final void t(TLRPC.Document document) {
    }

    @Override
    public final void x(String str) {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void E(CharSequence charSequence, String str, df dfVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
