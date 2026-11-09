package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bs0 implements org.telegram.ui.ks {
    public final TLRPC.TL_messageMediaPoll f32403a;
    public final TLRPC.PollAnswer f32404b;
    public final org.telegram.ui.Cells.q1 f32405c;
    public final gs0 d;

    public bs0(gs0 gs0Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, org.telegram.ui.Cells.q1 q1Var) {
        this.d = gs0Var;
        this.f32403a = tL_messageMediaPoll;
        this.f32404b = pollAnswer;
        this.f32405c = q1Var;
    }

    @Override
    public final org.telegram.messenger.ij A() {
        return this.f32405c.getMessageObject();
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
        arrayList.add(this.f32404b);
        org.telegram.messenger.gz.C(this.d.f34047a).w0(this.f32405c.getMessageObject(), arrayList, null);
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
        gs0 gs0Var = this.d;
        is0 is0Var = gs0Var.f34049c;
        if (inputStickerSet != null && is0Var.f34858s.getContext() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.f26976id = inputStickerSet.f26976id;
            zv0 zv0Var = new zv0(is0Var.f34858s.getContext(), is0Var.f34858s.f41127x1, tL_inputStickerSetID, null, null, gs0Var.f34048b);
            zv0Var.f28640h0 = true;
            zv0Var.f28645n = true;
            zv0Var.Z1 = z9;
            zv0Var.show();
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
        return this.d.f34049c.f34858s.l1;
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
        return this.f32403a;
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
        return this.f32404b;
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
    public final l60 m(bi.x5 x5Var) {
        return null;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void r() {
        org.telegram.messenger.gz.C(this.d.f34047a).w0(this.f32405c.getMessageObject(), null, null);
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
    public final void u(CharSequence charSequence, String str, fx fxVar) {
    }

    @Override
    public final void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
    }
}
