package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fk implements ht {
    public final un f37168a;

    public fk(un unVar) {
        this.f37168a = unVar;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        return false;
    }

    @Override
    public final org.telegram.ui.Components.z60 D(fg.i iVar) {
        return null;
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
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet != null) {
            un unVar = this.f37168a;
            if (unVar.getParentActivity() != null) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
                tL_inputStickerSetID.f19814id = inputStickerSet.f19814id;
                org.telegram.ui.Components.dx0 dx0Var = new org.telegram.ui.Components.dx0(unVar.getParentActivity(), unVar, tL_inputStickerSetID, null, unVar.Z, unVar.f42288xa);
                boolean O9 = unVar.O9();
                dx0Var.f21602h0 = O9;
                dx0Var.f21607n = O9;
                dx0Var.Z1 = z10;
                unVar.showDialog(dx0Var);
            }
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
        return this.f37168a.f42108j6;
    }

    @Override
    public final boolean b() {
        return this.f37168a.P6();
    }

    @Override
    public final boolean c() {
        if (this.f37168a.f42059f4 == 1) {
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
    public final boolean k(int i10) {
        return true;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f37168a.Z.a(document, str, obj, null, true, z10, i10, i11);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final org.telegram.messenger.kj y() {
        return null;
    }

    @Override
    public final boolean z() {
        return false;
    }

    @Override
    public final void A(TLRPC.Document document) {
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
    public final void i(org.telegram.messenger.kz kzVar) {
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
    public final void J() {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void q() {
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
    public final void N(CharSequence charSequence, String str, org.telegram.ui.Components.vg vgVar) {
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
    }
}
