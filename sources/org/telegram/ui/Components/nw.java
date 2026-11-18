package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nw implements org.telegram.ui.ls {
    public final ry f37866a;

    public nw(ry ryVar) {
        this.f37866a = ryVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        org.telegram.ui.ActionBar.h2 h2Var = this.f37866a.Z1;
        if (h2Var instanceof org.telegram.ui.bn) {
            ((org.telegram.ui.bn) h2Var).Gb(document);
        }
    }

    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final boolean D(TLRPC.Document document) {
        return true;
    }

    @Override
    public final y60 E(ai.k0 k0Var) {
        return null;
    }

    @Override
    public final void F(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.ri.c0(document, "").document;
        ConnectionsManager.getInstance(this.f37866a.f39345d1).sendRequest(tL_stickers_removeStickerFromSet, new e2(this, 3));
    }

    @Override
    public final String G(boolean z10) {
        ry ryVar = this.f37866a;
        if (z10) {
            v4.i0 adapter = ryVar.f39360i0.getAdapter();
            vx vxVar = ryVar.f39366k0;
            if (adapter == vxVar) {
                return vxVar.f41478x;
            }
            return null;
        }
        v4.i0 adapter2 = ryVar.Q.getAdapter();
        qx qxVar = ryVar.T;
        if (adapter2 == qxVar) {
            return qxVar.f38931w;
        }
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        lc lcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.fj.U(document));
        valueOf.setSpan(new x5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            ry ryVar = this.f37866a;
            org.telegram.ui.ActionBar.h2 h2Var = ryVar.Z1;
            if (h2Var != null) {
                lcVar = lc.b0(h2Var);
            } else {
                lcVar = new lc(ryVar.f39385r, ryVar.f39335a2);
            }
            org.telegram.messenger.n10.t(null, 2131751173, lcVar);
        }
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
    public final void L() {
        this.f37866a.X();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f37866a.f39397u1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList arrayList = org.telegram.messenger.j6.f24819i;
            if (arrayList.contains("animated_" + document.f28411id)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User f10;
        boolean z10;
        if (!org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).q() || (f10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).f()) == null) {
            return null;
        }
        Long i7 = org.telegram.messenger.o10.i(f10);
        if (document != null && (i7 == null || i7.longValue() != document.f28411id)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public final boolean Q() {
        return true;
    }

    @Override
    public final long a() {
        return this.f37866a.f39397u1.a();
    }

    @Override
    public final boolean b() {
        return this.f37866a.f39397u1.b();
    }

    @Override
    public final boolean c() {
        return this.f37866a.f39397u1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f37866a.f39397u1.j();
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
        ry ryVar = this.f37866a;
        if (ryVar.Z1 == null && ryVar.f39399v0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i7) {
        if (i7 != 2) {
            return true;
        }
        ry ryVar = this.f37866a;
        org.telegram.ui.ActionBar.h2 h2Var = ryVar.Z1;
        if ((h2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) h2Var).T6()) {
            if (org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).q() || (((org.telegram.ui.bn) ryVar.Z1).j() != null && org.telegram.messenger.o10.C(((org.telegram.ui.bn) ryVar.Z1).j()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
        this.f37866a.f39397u1.m(null, document, str, obj, null, z10, i7);
    }

    @Override
    public final void n(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        int i7 = 0;
        while (true) {
            if (i7 < document.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                    break;
                }
                i7++;
            } else {
                inputStickerSet = null;
                break;
            }
        }
        ry ryVar = this.f37866a;
        iw0.N0(ryVar.Z1, org.telegram.messenger.ri.d0(ryVar.f39345d1).o0(inputStickerSet, true), document);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p(TLRPC.Document document) {
        if (document != null) {
            String str = "animated_" + document.f28411id;
            HashMap hashMap = org.telegram.messenger.j6.h;
            hashMap.remove(str);
            ArrayList arrayList = org.telegram.messenger.j6.f24819i;
            arrayList.remove(str);
            if (hashMap.isEmpty() || arrayList.isEmpty()) {
                org.telegram.messenger.j6.a(org.telegram.messenger.j6.f24825o[0]);
            }
            bx bxVar = this.f37866a.S;
            if (bxVar != null) {
                bxVar.F(false);
            }
        }
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
        ry ryVar = this.f37866a;
        vv vvVar = ryVar.f39360i0;
        if (vvVar.getAdapter() == ryVar.f39376o0) {
            ryVar.f39397u1.v(null, tLObject, null, obj, z10, i7, i10);
        } else if (vvVar.getAdapter() == ryVar.f39366k0) {
            ryVar.f39397u1.v(null, tLObject, null, obj, z10, i7, i10);
        }
    }

    @Override
    public final void s() {
        ex exVar = this.f37866a.Q;
        if (exVar != null && exVar.f34822m3 != null) {
            while (exVar.f34822m3.size() > 0) {
                dx dxVar = (dx) exVar.f34822m3.valueAt(0);
                exVar.f34822m3.removeAt(0);
                if (dxVar != null) {
                    View view = dxVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        dxVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = dxVar.d;
                    if (view2 != null) {
                        view2.setPressed(false);
                    }
                }
            }
        }
    }

    @Override
    public final void t(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        lc lcVar;
        ry ryVar = this.f37866a;
        FrameLayout frameLayout = ryVar.f39385r;
        org.telegram.ui.ActionBar.h2 h2Var = ryVar.Z1;
        org.telegram.ui.ActionBar.i6 i6Var = ryVar.f39335a2;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f28411id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).f();
        if (f10 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f10.emoji_status;
        }
        org.telegram.messenger.mp.u1(ryVar.f39345d1).t5(emojiStatus, null);
        mg mgVar = new mg(29, this, obj);
        if (document == null) {
            yb ybVar = new yb(ryVar.getContext(), i6Var);
            ybVar.f42447b.setText(org.telegram.messenger.gd.M0(2131746092, null));
            ImageView imageView = ybVar.f42446a;
            imageView.setImageResource(2131232364);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.f29810z9, i6Var, PorterDuff.Mode.MULTIPLY);
            ec ecVar = new ec(ryVar.getContext(), i6Var, true);
            ecVar.f34666b = mgVar;
            ybVar.setButton(ecVar);
            if (h2Var != null) {
                gc.g(h2Var, ybVar, 1500).j();
                return;
            } else {
                gc.f(frameLayout, ybVar, 1500).j();
                return;
            }
        }
        if (h2Var != null) {
            lcVar = lc.b0(h2Var);
        } else {
            lcVar = new lc(frameLayout, i6Var);
        }
        lcVar.r(document, org.telegram.messenger.gd.M0(2131745350, null), org.telegram.messenger.gd.M0(2131743648, null), mgVar).j();
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
        ry ryVar = this.f37866a;
        vv vvVar = ryVar.f39360i0;
        if (vvVar.getAdapter() != ryVar.f39376o0 && vvVar.getAdapter() != ryVar.f39366k0) {
            return;
        }
        ryVar.f39397u1.e(tLObject, obj);
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final org.telegram.messenger.fj z() {
        return null;
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
    public final void x(String str) {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void y(CharSequence charSequence, String str, ph phVar) {
    }
}
