package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fk implements ot {
    public final xn f33582a;

    public fk(xn xnVar) {
        this.f33582a = xnVar;
    }

    @Override
    public final MessageObject A() {
        return null;
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
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet != null) {
            xn xnVar = this.f33582a;
            if (xnVar.getParentActivity() != null) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
                tL_inputStickerSetID.f18349id = inputStickerSet.f18349id;
                org.telegram.ui.Components.hy0 hy0Var = new org.telegram.ui.Components.hy0(xnVar.getParentActivity(), xnVar, tL_inputStickerSetID, null, xnVar.Y, xnVar.f39750ea);
                hy0Var.setCalcMandatoryInsets(xnVar.x9());
                hy0Var.f24942i0 = z10;
                xnVar.showDialog(hy0Var);
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
        return this.f33582a.T5;
    }

    @Override
    public final boolean b() {
        return this.f33582a.D6();
    }

    @Override
    public final boolean c() {
        if (this.f33582a.R3 == 1) {
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
    public final boolean g() {
        return false;
    }

    @Override
    public final TLRPC.PollAnswer h() {
        return null;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final org.telegram.ui.Components.a80 j(ci.m6 m6Var) {
        return null;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean m(int i10) {
        return true;
    }

    @Override
    public final void n(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f33582a.Y.d(document, str, obj, null, true, z10, i10, i11);
    }

    @Override
    public final boolean q() {
        return false;
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
    public final void K() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void O(String str) {
    }

    @Override
    public final void k(SendMessagesHelper.ImportingSticker importingSticker) {
    }

    @Override
    public final void o(String str) {
    }

    @Override
    public final void p(TLRPC.Document document) {
    }

    @Override
    public final void r(TLRPC.Document document) {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void u() {
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
    public final void f(CharSequence charSequence, String str, et etVar) {
    }

    @Override
    public final void t(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
