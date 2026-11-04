package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yr0 implements org.telegram.ui.gs {
    public final TLRPC.TL_messageMediaPoll f40812a;
    public final TLRPC.PollAnswer f40813b;
    public final org.telegram.ui.Cells.q1 f40814c;
    public final ds0 d;

    public yr0(ds0 ds0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.q1 q1Var) {
        this.d = ds0Var;
        this.f40812a = tL_messageMediaPoll;
        this.f40813b = pollAnswer;
        this.f40814c = q1Var;
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
        arrayList.add(this.f40813b);
        org.telegram.messenger.yy.C(this.d.f33187a).w0(this.f40814c.getMessageObject(), arrayList, null);
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ds0 ds0Var = this.d;
        fs0 fs0Var = ds0Var.f33189c;
        if (inputStickerSet != null && fs0Var.f33864s.getContext() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.f27021id = inputStickerSet.f27021id;
            xv0 xv0Var = new xv0(fs0Var.f33864s.getContext(), fs0Var.f33864s.f40142y1, tL_inputStickerSetID, null, null, ds0Var.f33188b);
            xv0Var.f28604i0 = true;
            xv0Var.f28608n = true;
            xv0Var.f40506a2 = z10;
            xv0Var.show();
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
        return this.d.f33189c.f33864s.m1;
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
        return this.f40812a;
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
        return this.f40813b;
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
    public final f60 n(ai.c0 c0Var) {
        return null;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void r() {
        org.telegram.messenger.yy.C(this.d.f33187a).w0(this.f40814c.getMessageObject(), null, null);
    }

    @Override
    public final boolean x() {
        return true;
    }

    @Override
    public final org.telegram.messenger.zi z() {
        return this.f40814c.getMessageObject();
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
    public final void K(CharSequence charSequence, String str, ei eiVar) {
    }

    @Override
    public final void s(int i3, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i3, int i10) {
    }
}
