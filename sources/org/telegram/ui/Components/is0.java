package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class is0 implements org.telegram.ui.ls {
    public final TLRPC.TL_messageMediaPoll f36192a;
    public final TLRPC.PollAnswer f36193b;
    public final org.telegram.ui.Cells.r1 f36194c;
    public final ns0 d;

    public is0(ns0 ns0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.r1 r1Var) {
        this.d = ns0Var;
        this.f36192a = tL_messageMediaPoll;
        this.f36193b = pollAnswer;
        this.f36194c = r1Var;
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
    public final y60 E(ai.k0 k0Var) {
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
        arrayList.add(this.f36193b);
        org.telegram.messenger.zy.C(this.d.f37851a).w0(this.f36194c.getMessageObject(), arrayList, null);
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        ns0 ns0Var = this.d;
        ps0 ps0Var = ns0Var.f37853c;
        if (inputStickerSet != null && ps0Var.f38548s.getContext() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.f28423id = inputStickerSet.f28423id;
            iw0 iw0Var = new iw0(ps0Var.f38548s.getContext(), ps0Var.f38548s.f35642y1, tL_inputStickerSetID, null, null, ns0Var.f37852b);
            iw0Var.f30208i0 = true;
            iw0Var.f30215n = true;
            iw0Var.d2 = z10;
            iw0Var.show();
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
        return this.d.f37853c.f38548s.f35606m1;
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
        return this.f36192a;
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
        return this.f36193b;
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
        org.telegram.messenger.zy.C(this.d.f37851a).w0(this.f36194c.getMessageObject(), null, null);
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final org.telegram.messenger.fj z() {
        return this.f36194c.getMessageObject();
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
    public final void i(org.telegram.messenger.sy syVar) {
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
    public final void y(CharSequence charSequence, String str, ph phVar) {
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
    }
}
