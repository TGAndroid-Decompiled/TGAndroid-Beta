package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lm implements ls {
    public final TLRPC.TL_messageMediaPoll f47633a;
    public final TLRPC.PollAnswer f47634b;
    public final org.telegram.ui.Cells.q1 f47635c;
    public final nm d;

    public lm(nm nmVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.q1 q1Var) {
        this.d = nmVar;
        this.f47633a = tL_messageMediaPoll;
        this.f47634b = pollAnswer;
        this.f47635c = q1Var;
    }

    @Override
    public final org.telegram.messenger.ij A() {
        return this.f47635c.getMessageObject();
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
    public final String G(boolean z9) {
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
        arrayList.add(this.f47634b);
        org.telegram.messenger.gz sendMessagesHelper = this.d.f48227a.getSendMessagesHelper();
        org.telegram.ui.Cells.q1 q1Var = this.f47635c;
        sendMessagesHelper.w0(q1Var.getMessageObject(), arrayList, null);
        q1Var.a0(true);
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
        cn cnVar = this.d.f48227a;
        if (inputStickerSet != null && cnVar.getParentActivity() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.f26980id = inputStickerSet.f26980id;
            org.telegram.ui.Components.yv0 yv0Var = new org.telegram.ui.Components.yv0(cnVar.getParentActivity(), cnVar, tL_inputStickerSetID, null, cnVar.Z, cnVar.f44750za);
            boolean U9 = cnVar.U9();
            yv0Var.f28688h0 = U9;
            yv0Var.f28696n = U9;
            yv0Var.f40738c2 = z9;
            cnVar.showDialog(yv0Var);
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
        return this.d.f48227a.f44545j6;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        if (this.d.f48227a.f44492f4 == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return this.f47633a;
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
        return this.f47634b;
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
    public final org.telegram.ui.Components.k60 m(bi.x5 x5Var) {
        return null;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void r() {
        org.telegram.messenger.gz sendMessagesHelper = this.d.f48227a.getSendMessagesHelper();
        org.telegram.ui.Cells.q1 q1Var = this.f47635c;
        sendMessagesHelper.w0(q1Var.getMessageObject(), null, null);
        q1Var.a0(true);
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
    public final void O(String str) {
    }

    @Override
    public final void i(org.telegram.messenger.zy zyVar) {
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
    public final void v(TLRPC.Document document) {
    }

    @Override
    public final void z(String str) {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
    }

    @Override
    public final void u(CharSequence charSequence, String str, org.telegram.ui.Components.ex exVar) {
    }

    @Override
    public final void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
    }
}
