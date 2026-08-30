package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ck implements nt {
    public final xn f33387a;

    public ck(xn xnVar) {
        this.f33387a = xnVar;
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
    public final String G(boolean z4) {
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
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z4) {
        if (inputStickerSet != null) {
            xn xnVar = this.f33387a;
            if (xnVar.getParentActivity() != null) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
                tL_inputStickerSetID.f19204id = inputStickerSet.f19204id;
                org.telegram.ui.Components.xx0 xx0Var = new org.telegram.ui.Components.xx0(xnVar.getParentActivity(), xnVar, tL_inputStickerSetID, null, xnVar.V, xnVar.f39968ba);
                xx0Var.setCalcMandatoryInsets(xnVar.x9());
                xx0Var.f30775f0 = z4;
                xnVar.showDialog(xx0Var);
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
        return this.f33387a.Q5;
    }

    @Override
    public final boolean b() {
        return this.f33387a.D6();
    }

    @Override
    public final boolean c() {
        if (this.f33387a.O3 == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Components.o70 d(ah.d dVar) {
        return null;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll e() {
        return null;
    }

    @Override
    public final boolean f(TLRPC.Document document) {
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
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l(int i10) {
        return true;
    }

    @Override
    public final void m(TLRPC.Document document, String str, Object obj, boolean z4, int i10, int i11) {
        this.f33387a.V.d(document, str, obj, null, true, z4, i10, i11);
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
    public final MessageObject z() {
        return null;
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
    public final void r() {
    }

    @Override
    public final void t() {
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
    public final void A(CharSequence charSequence, String str, org.telegram.ui.Components.vk vkVar) {
    }

    @Override
    public final void s(int i10, int i11, Object obj, TLObject tLObject, boolean z4) {
    }
}
