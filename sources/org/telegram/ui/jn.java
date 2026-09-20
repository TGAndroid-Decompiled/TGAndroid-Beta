package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jn implements qt {
    public final TLRPC.TL_messageMediaPoll f34961a;
    public final TLRPC.PollAnswer f34962b;
    public final org.telegram.ui.Cells.u1 f34963c;
    public final ln d;

    public jn(ln lnVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.u1 u1Var) {
        this.d = lnVar;
        this.f34961a = tL_messageMediaPoll;
        this.f34962b = pollAnswer;
        this.f34963c = u1Var;
    }

    @Override
    public final MessageObject A() {
        return this.f34963c.getMessageObject();
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
        arrayList.add(this.f34962b);
        SendMessagesHelper sendMessagesHelper = this.d.f35482a.getSendMessagesHelper();
        org.telegram.ui.Cells.u1 u1Var = this.f34963c;
        sendMessagesHelper.sendVote(u1Var.getMessageObject(), arrayList, null);
        u1Var.S0(true);
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        zn znVar = this.d.f35482a;
        if (inputStickerSet != null && znVar.getParentActivity() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.f18348id = inputStickerSet.f18348id;
            org.telegram.ui.Components.gy0 gy0Var = new org.telegram.ui.Components.gy0(znVar.getParentActivity(), znVar, tL_inputStickerSetID, null, znVar.Y, znVar.f40303ea);
            gy0Var.setCalcMandatoryInsets(znVar.x9());
            gy0Var.f24487i0 = z10;
            znVar.showDialog(gy0Var);
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
        return this.d.f35482a.T5;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        if (this.d.f35482a.R3 == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return this.f34961a;
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
        return this.f34962b;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final org.telegram.ui.Components.v70 i(ci.n6 n6Var) {
        return null;
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
        SendMessagesHelper sendMessagesHelper = this.d.f35482a.getSendMessagesHelper();
        org.telegram.ui.Cells.u1 u1Var = this.f34963c;
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
    public final void u(CharSequence charSequence, String str, of ofVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
