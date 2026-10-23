package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uu0 implements org.telegram.ui.ct {
    public final TLRPC.TL_messageMediaPoll f31020a;
    public final TLRPC.PollAnswer f31021b;
    public final org.telegram.ui.Cells.u1 f31022c;
    public final zu0 d;

    public uu0(zu0 zu0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.u1 u1Var) {
        this.d = zu0Var;
        this.f31020a = tL_messageMediaPoll;
        this.f31021b = pollAnswer;
        this.f31022c = u1Var;
    }

    @Override
    public final MessageObject A() {
        return this.f31022c.getMessageObject();
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
        arrayList.add(this.f31021b);
        SendMessagesHelper.getInstance(this.d.f33048a).sendVote(this.f31022c.getMessageObject(), arrayList, null);
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        zu0 zu0Var = this.d;
        bv0 bv0Var = zu0Var.f33050c;
        if (inputStickerSet != null && bv0Var.f25049s.getContext() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.f20300id = inputStickerSet.f20300id;
            qy0 qy0Var = new qy0(bv0Var.f25049s.getContext(), bv0Var.f25049s.f31075v1, tL_inputStickerSetID, null, null, zu0Var.f33049b);
            qy0Var.setCalcMandatoryInsets(true);
            qy0Var.f29759i0 = z10;
            qy0Var.show();
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
        return this.d.f33050c.f25049s.f31050j1;
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
        return this.f31020a;
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
        return this.f31021b;
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
        SendMessagesHelper.getInstance(this.d.f33048a).sendVote(this.f31022c.getMessageObject(), null, null);
    }

    @Override
    public final i80 u(ah.v vVar) {
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
    public final void t(CharSequence charSequence, String str, qy qyVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
