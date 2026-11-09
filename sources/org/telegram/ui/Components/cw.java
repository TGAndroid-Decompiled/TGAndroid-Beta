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
public final class cw implements org.telegram.ui.ks {
    public final hy f32776a;

    public cw(hy hyVar) {
        this.f32776a = hyVar;
    }

    @Override
    public final org.telegram.messenger.ij A() {
        return null;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final void C(TLRPC.Document document) {
        org.telegram.ui.ActionBar.f2 f2Var = this.f32776a.Y1;
        if (f2Var instanceof org.telegram.ui.cn) {
            ((org.telegram.ui.cn) f2Var).Fb(document);
        }
    }

    @Override
    public final boolean D() {
        return true;
    }

    @Override
    public final boolean E(TLRPC.Document document) {
        return true;
    }

    @Override
    public final void F(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.ui.a0(document, "").document;
        ConnectionsManager.getInstance(this.f32776a.f34415c1).sendRequest(tL_stickers_removeStickerFromSet, new x1(this, 3));
    }

    @Override
    public final String G(boolean z9) {
        hy hyVar = this.f32776a;
        if (z9) {
            v4.g0 adapter = hyVar.f34430h0.getAdapter();
            mx mxVar = hyVar.f34436j0;
            if (adapter == mxVar) {
                return mxVar.f36166x;
            }
            return null;
        }
        v4.g0 adapter2 = hyVar.P.getAdapter();
        hx hxVar = hyVar.S;
        if (adapter2 == hxVar) {
            return hxVar.f34400w;
        }
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        hc hcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.ij.U(document));
        valueOf.setSpan(new r5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            hy hyVar = this.f32776a;
            org.telegram.ui.ActionBar.f2 f2Var = hyVar.Y1;
            if (f2Var != null) {
                hcVar = hc.a0(f2Var);
            } else {
                hcVar = new hc(hyVar.f34458r, hyVar.Z1);
            }
            org.telegram.messenger.camera.q.r(null, 2131751184, hcVar);
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
        this.f32776a.W();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
        if (inputStickerSet == null) {
            return;
        }
        this.f32776a.f34467t1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList arrayList = org.telegram.messenger.i6.f23058i;
            if (arrayList.contains("animated_" + document.f26962id)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User f10;
        boolean z9;
        if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).q() || (f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.t10.h(f10);
        if (document != null && (h == null || h.longValue() != document.f26962id)) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    @Override
    public final boolean Q() {
        return true;
    }

    @Override
    public final long a() {
        return this.f32776a.f34467t1.a();
    }

    @Override
    public final boolean b() {
        return this.f32776a.f34467t1.b();
    }

    @Override
    public final boolean c() {
        return this.f32776a.f34467t1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f32776a.f34467t1.j();
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
        hy hyVar = this.f32776a;
        if (hyVar.Y1 == null && hyVar.f34469u0) {
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
        hy hyVar = this.f32776a;
        org.telegram.ui.ActionBar.f2 f2Var = hyVar.Y1;
        if ((f2Var instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var).T6()) {
            if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).q() || (((org.telegram.ui.cn) hyVar.Y1).j() != null && org.telegram.messenger.t10.B(((org.telegram.ui.cn) hyVar.Y1).j()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
        this.f32776a.f34467t1.m(null, document, str, obj, null, z9, i7);
    }

    @Override
    public final l60 m(bi.x5 x5Var) {
        return null;
    }

    @Override
    public final void o(TLRPC.Document document) {
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
        hy hyVar = this.f32776a;
        zv0.M0(hyVar.Y1, org.telegram.messenger.ui.b0(hyVar.f34415c1).m0(inputStickerSet, true), document);
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void q(TLRPC.Document document) {
        if (document != null) {
            String str = "animated_" + document.f26962id;
            HashMap hashMap = org.telegram.messenger.i6.h;
            hashMap.remove(str);
            ArrayList arrayList = org.telegram.messenger.i6.f23058i;
            arrayList.remove(str);
            if (hashMap.isEmpty() || arrayList.isEmpty()) {
                org.telegram.messenger.i6.a(org.telegram.messenger.i6.f23064o[0]);
            }
            qw qwVar = this.f32776a.R;
            if (qwVar != null) {
                qwVar.F(false);
            }
        }
    }

    @Override
    public final void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
        hy hyVar = this.f32776a;
        lv lvVar = hyVar.f34430h0;
        if (lvVar.getAdapter() == hyVar.f34447n0) {
            hyVar.f34467t1.v(null, tLObject, null, obj, z9, i7, i10);
        } else if (lvVar.getAdapter() == hyVar.f34436j0) {
            hyVar.f34467t1.v(null, tLObject, null, obj, z9, i7, i10);
        }
    }

    @Override
    public final void t() {
        tw twVar = this.f32776a.P;
        if (twVar != null && twVar.f38522l3 != null) {
            while (twVar.f38522l3.size() > 0) {
                sw swVar = (sw) twVar.f38522l3.valueAt(0);
                twVar.f38522l3.removeAt(0);
                if (swVar != null) {
                    View view = swVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        swVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = swVar.d;
                    if (view2 != null) {
                        view2.setPressed(false);
                    }
                }
            }
        }
    }

    @Override
    public final void v(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        hc hcVar;
        hy hyVar = this.f32776a;
        FrameLayout frameLayout = hyVar.f34458r;
        org.telegram.ui.ActionBar.f2 f2Var = hyVar.Y1;
        org.telegram.ui.ActionBar.g6 g6Var = hyVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f26962id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).f();
        if (f10 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f10.emoji_status;
        }
        org.telegram.messenger.qp.s1(hyVar.f34415c1).h5(emojiStatus, null);
        fq fqVar = new fq(9, this, obj);
        if (document == null) {
            ub ubVar = new ub(hyVar.getContext(), g6Var);
            ubVar.f38681b.setText(org.telegram.messenger.id.M0(2131746287, null));
            ImageView imageView = ubVar.f38680a;
            imageView.setImageResource(2131232362);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.z9, g6Var, PorterDuff.Mode.MULTIPLY);
            ac acVar = new ac(hyVar.getContext(), g6Var, true);
            acVar.f31766b = fqVar;
            ubVar.setButton(acVar);
            if (f2Var != null) {
                cc.g(f2Var, ubVar, 1500).j();
                return;
            } else {
                cc.f(frameLayout, ubVar, 1500).j();
                return;
            }
        }
        if (f2Var != null) {
            hcVar = hc.a0(f2Var);
        } else {
            hcVar = new hc(frameLayout, g6Var);
        }
        hcVar.r(document, org.telegram.messenger.id.M0(2131745545, null), org.telegram.messenger.id.M0(2131743885, null), fqVar).j();
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
        hy hyVar = this.f32776a;
        lv lvVar = hyVar.f34430h0;
        if (lvVar.getAdapter() != hyVar.f34447n0 && lvVar.getAdapter() != hyVar.f34436j0) {
            return;
        }
        hyVar.f34467t1.e(tLObject, obj);
    }

    @Override
    public final boolean y() {
        return true;
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
    public final void z(String str) {
    }

    @Override
    public final void K() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void w(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void u(CharSequence charSequence, String str, fx fxVar) {
    }
}
