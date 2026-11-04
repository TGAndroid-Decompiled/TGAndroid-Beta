package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gj implements gs {
    public final wm f45671a;

    public gj(wm wmVar) {
        this.f45671a = wmVar;
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
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet != null) {
            wm wmVar = this.f45671a;
            if (wmVar.getParentActivity() != null) {
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
        return this.f45671a.f51376k6;
    }

    @Override
    public final boolean b() {
        return this.f45671a.R6();
    }

    @Override
    public final boolean c() {
        if (this.f45671a.f51325g4 == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
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
        return null;
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
        return true;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i3, int i10) {
        this.f45671a.f51237a0.a(document, str, obj, null, true, z10, i3, i10);
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
    public final boolean x() {
        return true;
    }

    @Override
    public final org.telegram.messenger.zi z() {
        return null;
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
    public final void J() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void r() {
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
}
