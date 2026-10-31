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
public final class pw implements org.telegram.ui.jt {
    public final vy f29443a;

    public pw(vy vyVar) {
        this.f29443a = vyVar;
    }

    @Override
    public final void A(TLRPC.Document document) {
        org.telegram.ui.ActionBar.k2 k2Var = this.f29443a.Y1;
        if (k2Var instanceof org.telegram.ui.un) {
            ((org.telegram.ui.un) k2Var).sb(document);
        }
    }

    @Override
    public final boolean B() {
        return true;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        return true;
    }

    @Override
    public final z60 D(fg.i iVar) {
        return null;
    }

    @Override
    public final void E(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.ui.a0(document, "").document;
        ConnectionsManager.getInstance(this.f29443a.f31865c1).sendRequest(tL_stickers_removeStickerFromSet, new x1(this, 3));
    }

    @Override
    public final String F(boolean z10) {
        vy vyVar = this.f29443a;
        if (z10) {
            s4.g0 adapter = vyVar.f31880h0.getAdapter();
            zx zxVar = vyVar.f31886j0;
            if (adapter == zxVar) {
                return zxVar.f33257x;
            }
            return null;
        }
        s4.g0 adapter2 = vyVar.P.getAdapter();
        ux uxVar = vyVar.S;
        if (adapter2 == uxVar) {
            return uxVar.f31075w;
        }
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        cc ccVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.jj.U(document));
        valueOf.setSpan(new o5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.i0.g(valueOf)) {
            vy vyVar = this.f29443a;
            org.telegram.ui.ActionBar.k2 k2Var = vyVar.Y1;
            if (k2Var != null) {
                ccVar = cc.a0(k2Var);
            } else {
                ccVar = new cc(vyVar.f31909r, vyVar.Z1);
            }
            org.telegram.messenger.z20.r(null, 2131751185, ccVar);
        }
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
    public final void K() {
        this.f29443a.X();
    }

    @Override
    public final void L(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f29443a.f31918t1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean M(TLRPC.Document document) {
        if (document != null) {
            ArrayList arrayList = org.telegram.messenger.k6.f16535i;
            if (arrayList.contains("animated_" + document.f19799id)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final Boolean P(TLRPC.Document document) {
        TLRPC.User f7;
        boolean z10;
        if (!org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).q() || (f7 = org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.h20.h(f7);
        if (document != null && (h == null || h.longValue() != document.f19799id)) {
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
        return this.f29443a.f31918t1.a();
    }

    @Override
    public final boolean b() {
        return this.f29443a.f31918t1.b();
    }

    @Override
    public final boolean c() {
        return this.f29443a.f31918t1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f29443a.f31918t1.j();
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
        vy vyVar = this.f29443a;
        if (vyVar.Y1 == null && vyVar.f31920u0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i10) {
        if (i10 != 2) {
            return true;
        }
        vy vyVar = this.f29443a;
        org.telegram.ui.ActionBar.k2 k2Var = vyVar.Y1;
        if ((k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).M6()) {
            if (org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).q() || (((org.telegram.ui.un) vyVar.Y1).j() != null && org.telegram.messenger.h20.B(((org.telegram.ui.un) vyVar.Y1).j()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i10, int i11) {
        this.f29443a.f31918t1.m(null, document, str, obj, null, z10, i10);
    }

    @Override
    public final void n(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        int i10 = 0;
        while (true) {
            if (i10 < document.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                    break;
                }
                i10++;
            } else {
                inputStickerSet = null;
                break;
            }
        }
        vy vyVar = this.f29443a;
        cx0.M0(vyVar.Y1, org.telegram.messenger.ui.b0(vyVar.f31865c1).m0(inputStickerSet, true), document);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p(TLRPC.Document document) {
        if (document != null) {
            String str = "animated_" + document.f19799id;
            HashMap hashMap = org.telegram.messenger.k6.h;
            hashMap.remove(str);
            ArrayList arrayList = org.telegram.messenger.k6.f16535i;
            arrayList.remove(str);
            if (hashMap.isEmpty() || arrayList.isEmpty()) {
                org.telegram.messenger.k6.a(org.telegram.messenger.k6.f16541o[0]);
            }
            ex exVar = this.f29443a.R;
            if (exVar != null) {
                exVar.F(false);
            }
        }
    }

    @Override
    public final void r(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        vy vyVar = this.f29443a;
        wv wvVar = vyVar.f31880h0;
        if (wvVar.getAdapter() == vyVar.f31897n0) {
            vyVar.f31918t1.v(null, tLObject, null, obj, z10, i10, i11);
        } else if (wvVar.getAdapter() == vyVar.f31886j0) {
            vyVar.f31918t1.v(null, tLObject, null, obj, z10, i10, i11);
        }
    }

    @Override
    public final void s() {
        hx hxVar = this.f29443a.P;
        if (hxVar != null && hxVar.f26841l3 != null) {
            while (hxVar.f26841l3.size() > 0) {
                gx gxVar = (gx) hxVar.f26841l3.valueAt(0);
                hxVar.f26841l3.removeAt(0);
                if (gxVar != null) {
                    View view = gxVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        gxVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = gxVar.d;
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
        cc ccVar;
        vy vyVar = this.f29443a;
        FrameLayout frameLayout = vyVar.f31909r;
        org.telegram.ui.ActionBar.k2 k2Var = vyVar.Y1;
        org.telegram.ui.ActionBar.p6 p6Var = vyVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f19799id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f7 = org.telegram.messenger.d20.i(org.telegram.messenger.d20.f15147s0).f();
        if (f7 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f7.emoji_status;
        }
        org.telegram.messenger.vp.r1(vyVar.f31865c1).e5(emojiStatus, null);
        at atVar = new at(3, this, obj);
        if (document == null) {
            ob obVar = new ob(vyVar.getContext(), p6Var);
            obVar.f29023b.setText(org.telegram.messenger.cd.L0(2131746302, null));
            ImageView imageView = obVar.f29022a;
            imageView.setImageResource(2131232361);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.f21333z9, p6Var, PorterDuff.Mode.MULTIPLY);
            ub ubVar = new ub(vyVar.getContext(), p6Var, true);
            ubVar.f30890b = atVar;
            obVar.setButton(ubVar);
            if (k2Var != null) {
                wb.g(k2Var, obVar, 1500).j();
                return;
            } else {
                wb.f(frameLayout, obVar, 1500).j();
                return;
            }
        }
        if (k2Var != null) {
            ccVar = cc.a0(k2Var);
        } else {
            ccVar = new cc(frameLayout, p6Var);
        }
        ccVar.r(document, org.telegram.messenger.cd.L0(2131745562, null), org.telegram.messenger.cd.L0(2131743910, null), atVar).j();
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
        vy vyVar = this.f29443a;
        wv wvVar = vyVar.f31880h0;
        if (wvVar.getAdapter() != vyVar.f31897n0 && wvVar.getAdapter() != vyVar.f31886j0) {
            return;
        }
        vyVar.f31918t1.e(tLObject, obj);
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final org.telegram.messenger.jj y() {
        return null;
    }

    @Override
    public final boolean z() {
        return false;
    }

    @Override
    public final void O(String str) {
    }

    @Override
    public final void i(org.telegram.messenger.jz jzVar) {
    }

    @Override
    public final void m(String str) {
    }

    @Override
    public final void x(String str) {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void u(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void N(CharSequence charSequence, String str, vg vgVar) {
    }
}
