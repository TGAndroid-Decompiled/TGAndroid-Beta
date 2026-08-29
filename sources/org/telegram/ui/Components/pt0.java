package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pt0 implements org.telegram.ui.ft {
    public final TLRPC.TL_messageMediaPoll f31767a;
    public final TLRPC.PollAnswer f31768b;
    public final org.telegram.ui.Cells.s1 f31769c;
    public final ut0 d;

    public pt0(ut0 ut0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.s1 s1Var) {
        this.d = ut0Var;
        this.f31767a = tL_messageMediaPoll;
        this.f31768b = pollAnswer;
        this.f31769c = s1Var;
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
    public final String E(boolean z10) {
        return null;
    }

    @Override
    public final j70 G(bg.d1 d1Var) {
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
        arrayList.add(this.f31768b);
        SendMessagesHelper.getInstance(this.d.f33315a).sendVote(this.f31769c.getMessageObject(), arrayList, null);
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ut0 ut0Var = this.d;
        wt0 wt0Var = ut0Var.f33317c;
        if (inputStickerSet != null && wt0Var.f34493s.getContext() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.f22412id = inputStickerSet.f22412id;
            nx0 nx0Var = new nx0(wt0Var.f34493s.getContext(), wt0Var.f34493s.f32093r1, tL_inputStickerSetID, null, null, ut0Var.f33316b);
            nx0Var.setCalcMandatoryInsets(true);
            nx0Var.f31175e0 = z10;
            nx0Var.show();
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
        return this.d.f33317c.f34493s.f32069f1;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return this.f31767a;
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
        return this.f31768b;
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
        SendMessagesHelper.getInstance(this.d.f33315a).sendVote(this.f31769c.getMessageObject(), null, null);
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final MessageObject y() {
        return this.f31769c.getMessageObject();
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
    public final void H(TLRPC.Document document) {
    }

    @Override
    public final void L() {
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
    public final void F(CharSequence charSequence, String str, org.telegram.ui.tm tmVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
