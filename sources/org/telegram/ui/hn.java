package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hn implements nt {
    public final TLRPC.TL_messageMediaPoll f34918a;
    public final TLRPC.PollAnswer f34919b;
    public final org.telegram.ui.Cells.t1 f34920c;
    public final jn d;

    public hn(jn jnVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.t1 t1Var) {
        this.d = jnVar;
        this.f34918a = tL_messageMediaPoll;
        this.f34919b = pollAnswer;
        this.f34920c = t1Var;
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
        arrayList.add(this.f34919b);
        SendMessagesHelper sendMessagesHelper = this.d.f35381a.getSendMessagesHelper();
        org.telegram.ui.Cells.t1 t1Var = this.f34920c;
        sendMessagesHelper.sendVote(t1Var.getMessageObject(), arrayList, null);
        t1Var.S0(true);
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
        xn xnVar = this.d.f35381a;
        if (inputStickerSet != null && xnVar.getParentActivity() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.f19204id = inputStickerSet.f19204id;
            org.telegram.ui.Components.xx0 xx0Var = new org.telegram.ui.Components.xx0(xnVar.getParentActivity(), xnVar, tL_inputStickerSetID, null, xnVar.V, xnVar.f39968ba);
            xx0Var.setCalcMandatoryInsets(xnVar.x9());
            xx0Var.f30775f0 = z4;
            xnVar.showDialog(xx0Var);
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
        return this.d.f35381a.Q5;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        if (this.d.f35381a.O3 == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Components.o70 d(ah.d dVar) {
        return null;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll e() {
        return this.f34918a;
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
        return this.f34919b;
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
        SendMessagesHelper sendMessagesHelper = this.d.f35381a.getSendMessagesHelper();
        org.telegram.ui.Cells.t1 t1Var = this.f34920c;
        sendMessagesHelper.sendVote(t1Var.getMessageObject(), null, null);
        t1Var.S0(true);
    }

    @Override
    public final boolean x() {
        return true;
    }

    @Override
    public final MessageObject z() {
        return this.f34920c.getMessageObject();
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
