package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fm implements gs {
    public final TLRPC.TL_messageMediaPoll f45304a;
    public final TLRPC.PollAnswer f45305b;
    public final org.telegram.ui.Cells.q1 f45306c;
    public final hm d;

    public fm(hm hmVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.q1 q1Var) {
        this.d = hmVar;
        this.f45304a = tL_messageMediaPoll;
        this.f45305b = pollAnswer;
        this.f45306c = q1Var;
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
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f45305b);
        org.telegram.messenger.yy sendMessagesHelper = this.d.f45934a.getSendMessagesHelper();
        org.telegram.ui.Cells.q1 q1Var = this.f45306c;
        sendMessagesHelper.w0(q1Var.getMessageObject(), arrayList, null);
        q1Var.a0(true);
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        wm wmVar = this.d.f45934a;
        if (inputStickerSet != null && wmVar.getParentActivity() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.f27021id = inputStickerSet.f27021id;
            org.telegram.ui.Components.xv0 xv0Var = new org.telegram.ui.Components.xv0(wmVar.getParentActivity(), wmVar, tL_inputStickerSetID, null, wmVar.f51237a0, wmVar.f51557ya);
            boolean T9 = wmVar.T9();
            xv0Var.f28604i0 = T9;
            xv0Var.f28608n = T9;
            xv0Var.f40506a2 = z10;
            wmVar.showDialog(xv0Var);
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
        return this.d.f45934a.f51376k6;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        if (this.d.f45934a.f51325g4 == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return this.f45304a;
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
        return this.f45305b;
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
    public final boolean k(int i3) {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.f60 n(ai.c0 c0Var) {
        return null;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void r() {
        org.telegram.messenger.yy sendMessagesHelper = this.d.f45934a.getSendMessagesHelper();
        org.telegram.ui.Cells.q1 q1Var = this.f45306c;
        sendMessagesHelper.w0(q1Var.getMessageObject(), null, null);
        q1Var.a0(true);
    }

    @Override
    public final boolean x() {
        return true;
    }

    @Override
    public final org.telegram.messenger.zi z() {
        return this.f45306c.getMessageObject();
    }

    @Override
    public final void B(TLRPC.Document document) {
    }

    @Override
    public final void E(TLRPC.Document document) {
    }

    @Override
    public final void G(TLRPC.Document document) {
    }

    @Override
    public final void O(String str) {
    }

    @Override
    public final void i(org.telegram.messenger.ry ryVar) {
    }

    @Override
    public final void m(String str) {
    }

    @Override
    public final void o(TLRPC.Document document) {
    }

    @Override
    public final void q(TLRPC.Document document) {
    }

    @Override
    public final void u(TLRPC.Document document) {
    }

    @Override
    public final void y(String str) {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
    }

    @Override
    public final void K(CharSequence charSequence, String str, org.telegram.ui.Components.ei eiVar) {
    }

    @Override
    public final void s(int i3, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i3, int i10) {
    }
}
