package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ls0 implements org.telegram.ui.ls {
    public final TLRPC.TL_messageMediaPoll f37274a;
    public final TLRPC.PollAnswer f37275b;
    public final org.telegram.ui.Cells.r1 f37276c;
    public final qs0 d;

    public ls0(qs0 qs0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.r1 r1Var) {
        this.d = qs0Var;
        this.f37274a = tL_messageMediaPoll;
        this.f37275b = pollAnswer;
        this.f37276c = r1Var;
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
    public final a70 E(ai.l0 l0Var) {
        return null;
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
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f37275b);
        org.telegram.messenger.az.C(this.d.f38989a).w0(this.f37276c.getMessageObject(), arrayList, null);
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        qs0 qs0Var = this.d;
        ss0 ss0Var = qs0Var.f38991c;
        if (inputStickerSet != null && ss0Var.f39686s.getContext() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.f28454id = inputStickerSet.f28454id;
            kw0 kw0Var = new kw0(ss0Var.f39686s.getContext(), ss0Var.f39686s.f36684y1, tL_inputStickerSetID, null, null, qs0Var.f38990b);
            kw0Var.f30194i0 = true;
            kw0Var.f30201n = true;
            kw0Var.d2 = z10;
            kw0Var.show();
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
        return this.d.f38991c.f39686s.f36648m1;
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
        return this.f37274a;
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
        return this.f37275b;
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
    public final boolean o() {
        return false;
    }

    @Override
    public final void q() {
        org.telegram.messenger.az.C(this.d.f38989a).w0(this.f37276c.getMessageObject(), null, null);
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final org.telegram.messenger.gj z() {
        return this.f37276c.getMessageObject();
    }

    @Override
    public final void B(TLRPC.Document document) {
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
    public final void i(org.telegram.messenger.ty tyVar) {
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
    public final void t(TLRPC.Document document) {
    }

    @Override
    public final void x(String str) {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
    }

    @Override
    public final void y(CharSequence charSequence, String str, rh rhVar) {
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}
