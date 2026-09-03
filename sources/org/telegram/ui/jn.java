package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jn implements pt {
    public final TLRPC.TL_messageMediaPoll f35325a;
    public final TLRPC.PollAnswer f35326b;
    public final org.telegram.ui.Cells.s1 f35327c;
    public final ln d;

    public jn(ln lnVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.s1 s1Var) {
        this.d = lnVar;
        this.f35325a = tL_messageMediaPoll;
        this.f35326b = pollAnswer;
        this.f35327c = s1Var;
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
    public final String G(boolean z4) {
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
        arrayList.add(this.f35326b);
        SendMessagesHelper sendMessagesHelper = this.d.f35808a.getSendMessagesHelper();
        org.telegram.ui.Cells.s1 s1Var = this.f35327c;
        sendMessagesHelper.sendVote(s1Var.getMessageObject(), arrayList, null);
        s1Var.S0(true);
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
        zn znVar = this.d.f35808a;
        if (inputStickerSet != null && znVar.getParentActivity() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.f19179id = inputStickerSet.f19179id;
            org.telegram.ui.Components.xx0 xx0Var = new org.telegram.ui.Components.xx0(znVar.getParentActivity(), znVar, tL_inputStickerSetID, null, znVar.V, znVar.f40534ba);
            xx0Var.setCalcMandatoryInsets(znVar.x9());
            xx0Var.f30757f0 = z4;
            znVar.showDialog(xx0Var);
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
        return this.d.f35808a.Q5;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        if (this.d.f35808a.O3 == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Components.p70 d(ah.e eVar) {
        return null;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll e() {
        return this.f35325a;
    }

    @Override
    public final boolean f(TLRPC.Document document) {
        return false;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final TLRPC.PollAnswer h() {
        return this.f35326b;
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
        SendMessagesHelper sendMessagesHelper = this.d.f35808a.getSendMessagesHelper();
        org.telegram.ui.Cells.s1 s1Var = this.f35327c;
        sendMessagesHelper.sendVote(s1Var.getMessageObject(), null, null);
        s1Var.S0(true);
    }

    @Override
    public final boolean x() {
        return true;
    }

    @Override
    public final MessageObject z() {
        return this.f35327c.getMessageObject();
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
    public final void A(CharSequence charSequence, String str, org.telegram.ui.Components.vk vkVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
    }
}
