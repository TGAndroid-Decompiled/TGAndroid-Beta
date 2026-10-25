package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dn implements dt {
    public final TLRPC.TL_messageMediaPoll f38908a;
    public final TLRPC.PollAnswer f38909b;
    public final org.telegram.ui.Cells.s1 f38910c;
    public final fn d;

    public dn(fn fnVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.s1 s1Var) {
        this.d = fnVar;
        this.f38908a = tL_messageMediaPoll;
        this.f38909b = pollAnswer;
        this.f38910c = s1Var;
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
        arrayList.add(this.f38909b);
        SendMessagesHelper sendMessagesHelper = this.d.f39420a.getSendMessagesHelper();
        org.telegram.ui.Cells.s1 s1Var = this.f38910c;
        sendMessagesHelper.sendVote(s1Var.getMessageObject(), arrayList, null);
        s1Var.R0(true);
    }

    @Override
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        un unVar = this.d.f39420a;
        if (inputStickerSet != null && unVar.getParentActivity() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.f22047id = inputStickerSet.f22047id;
            org.telegram.ui.Components.cz0 cz0Var = new org.telegram.ui.Components.cz0(unVar.getParentActivity(), unVar, tL_inputStickerSetID, null, unVar.Y, unVar.f44385qa);
            cz0Var.setCalcMandatoryInsets(unVar.F9());
            cz0Var.f27297i0 = z10;
            unVar.showDialog(cz0Var);
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
        return this.d.f39420a.f44249f6;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        if (this.d.f39420a.f44221d4 == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return this.f38908a;
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
        return this.f38909b;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final org.telegram.ui.Components.k80 i(bh.p pVar) {
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
        SendMessagesHelper sendMessagesHelper = this.d.f39420a.getSendMessagesHelper();
        org.telegram.ui.Cells.s1 s1Var = this.f38910c;
        sendMessagesHelper.sendVote(s1Var.getMessageObject(), null, null);
        s1Var.R0(true);
    }

    @Override
    public final boolean x() {
        return true;
    }

    @Override
    public final MessageObject z() {
        return this.f38910c.getMessageObject();
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
    public final void O(CharSequence charSequence, String str, org.telegram.ui.Components.oy oyVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
    }
}
