package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bv0 implements org.telegram.ui.dt {
    public final TLRPC.TL_messageMediaPoll f26969a;
    public final TLRPC.PollAnswer f26970b;
    public final org.telegram.ui.Cells.s1 f26971c;
    public final gv0 d;

    public bv0(gv0 gv0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.s1 s1Var) {
        this.d = gv0Var;
        this.f26969a = tL_messageMediaPoll;
        this.f26970b = pollAnswer;
        this.f26971c = s1Var;
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
        ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
        arrayList.add(this.f26970b);
        SendMessagesHelper.getInstance(this.d.f28720a).sendVote(this.f26971c.getMessageObject(), arrayList, null);
    }

    @Override
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        gv0 gv0Var = this.d;
        iv0 iv0Var = gv0Var.f28722c;
        if (inputStickerSet != null && iv0Var.f29387s.getContext() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.f22047id = inputStickerSet.f22047id;
            cz0 cz0Var = new cz0(iv0Var.f29387s.getContext(), iv0Var.f29387s.f26704x1, tL_inputStickerSetID, null, null, gv0Var.f28721b);
            cz0Var.setCalcMandatoryInsets(true);
            cz0Var.f27299i0 = z10;
            cz0Var.show();
        }
    }

    @Override
    public final boolean M(TLRPC.Document document) {
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
        return this.d.f28722c.f29387s.l1;
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
        return this.f26969a;
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
        return this.f26970b;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final k80 i(bh.p pVar) {
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
        SendMessagesHelper.getInstance(this.d.f28720a).sendVote(this.f26971c.getMessageObject(), null, null);
    }

    @Override
    public final boolean x() {
        return true;
    }

    @Override
    public final MessageObject z() {
        return this.f26971c.getMessageObject();
    }

    @Override
    public final void K() {
    }

    @Override
    public final void t() {
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
    public final void N(String str) {
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
    public final void O(CharSequence charSequence, String str, oy oyVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
