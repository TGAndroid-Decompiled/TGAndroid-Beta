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
public final class aw implements org.telegram.ui.gs {
    public final ey f32000a;

    public aw(ey eyVar) {
        this.f32000a = eyVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        org.telegram.ui.ActionBar.d2 d2Var = this.f32000a.Z1;
        if (d2Var instanceof org.telegram.ui.wm) {
            ((org.telegram.ui.wm) d2Var).Cb(document);
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
    public final void E(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.li.a0(document, "").document;
        ConnectionsManager.getInstance(this.f32000a.f33529d1).sendRequest(tL_stickers_removeStickerFromSet, new w1(this, 3));
    }

    @Override
    public final String F(boolean z10) {
        ey eyVar = this.f32000a;
        if (z10) {
            u4.h0 adapter = eyVar.f33545i0.getAdapter();
            jx jxVar = eyVar.f33551k0;
            if (adapter == jxVar) {
                return jxVar.f35213x;
            }
            return null;
        }
        u4.h0 adapter2 = eyVar.Q.getAdapter();
        ex exVar = eyVar.T;
        if (adapter2 == exVar) {
            return exVar.f33497w;
        }
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        fc fcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.zi.U(document));
        valueOf.setSpan(new p5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            ey eyVar = this.f32000a;
            org.telegram.ui.ActionBar.d2 d2Var = eyVar.Z1;
            if (d2Var != null) {
                fcVar = fc.a0(d2Var);
            } else {
                fcVar = new fc(eyVar.f33570r, eyVar.f33520a2);
            }
            org.telegram.messenger.camera.q.r(null, 2131751185, fcVar);
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
    public final void L() {
        this.f32000a.W();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f32000a.f33582u1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList arrayList = org.telegram.messenger.i6.f23452i;
            if (arrayList.contains("animated_" + document.f27007id)) {
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
        if (!org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q() || (f10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.l10.h(f10);
        if (document != null && (h == null || h.longValue() != document.f27007id)) {
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
        return this.f32000a.f33582u1.a();
    }

    @Override
    public final boolean b() {
        return this.f32000a.f33582u1.b();
    }

    @Override
    public final boolean c() {
        return this.f32000a.f33582u1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f32000a.f33582u1.j();
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
        ey eyVar = this.f32000a;
        if (eyVar.Z1 == null && eyVar.f33584v0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(int i3) {
        if (i3 != 2) {
            return true;
        }
        ey eyVar = this.f32000a;
        org.telegram.ui.ActionBar.d2 d2Var = eyVar.Z1;
        if ((d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).S6()) {
            if (org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q() || (((org.telegram.ui.wm) eyVar.Z1).j() != null && org.telegram.messenger.l10.B(((org.telegram.ui.wm) eyVar.Z1).j()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i3, int i10) {
        this.f32000a.f33582u1.m(null, document, str, obj, null, z10, i3);
    }

    @Override
    public final f60 n(ai.c0 c0Var) {
        return null;
    }

    @Override
    public final void o(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        int i3 = 0;
        while (true) {
            if (i3 < document.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                    break;
                }
                i3++;
            } else {
                inputStickerSet = null;
                break;
            }
        }
        ey eyVar = this.f32000a;
        xv0.M0(eyVar.Z1, org.telegram.messenger.li.b0(eyVar.f33529d1).m0(inputStickerSet, true), document);
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void q(TLRPC.Document document) {
        if (document != null) {
            String str = "animated_" + document.f27007id;
            HashMap hashMap = org.telegram.messenger.i6.h;
            hashMap.remove(str);
            ArrayList arrayList = org.telegram.messenger.i6.f23452i;
            arrayList.remove(str);
            if (hashMap.isEmpty() || arrayList.isEmpty()) {
                org.telegram.messenger.i6.a(org.telegram.messenger.i6.f23458o[0]);
            }
            ow owVar = this.f32000a.S;
            if (owVar != null) {
                owVar.F(false);
            }
        }
    }

    @Override
    public final void s(int i3, int i10, Object obj, TLObject tLObject, boolean z10) {
        ey eyVar = this.f32000a;
        jv jvVar = eyVar.f33545i0;
        if (jvVar.getAdapter() == eyVar.f33561o0) {
            eyVar.f33582u1.v(null, tLObject, null, obj, z10, i3, i10);
        } else if (jvVar.getAdapter() == eyVar.f33551k0) {
            eyVar.f33582u1.v(null, tLObject, null, obj, z10, i3, i10);
        }
    }

    @Override
    public final void t() {
        rw rwVar = this.f32000a.Q;
        if (rwVar != null && rwVar.f37819m3 != null) {
            while (rwVar.f37819m3.size() > 0) {
                qw qwVar = (qw) rwVar.f37819m3.valueAt(0);
                rwVar.f37819m3.removeAt(0);
                if (qwVar != null) {
                    View view = qwVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        qwVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = qwVar.d;
                    if (view2 != null) {
                        view2.setPressed(false);
                    }
                }
            }
        }
    }

    @Override
    public final void u(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        fc fcVar;
        ey eyVar = this.f32000a;
        FrameLayout frameLayout = eyVar.f33570r;
        org.telegram.ui.ActionBar.d2 d2Var = eyVar.Z1;
        org.telegram.ui.ActionBar.e6 e6Var = eyVar.f33520a2;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f27007id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f();
        if (f10 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f10.emoji_status;
        }
        org.telegram.messenger.hp.s1(eyVar.f33529d1).h5(emojiStatus, null);
        cl clVar = new cl(14, this, obj);
        if (document == null) {
            sb sbVar = new sb(eyVar.getContext(), e6Var);
            sbVar.f37963b.setText(org.telegram.messenger.bd.M0(2131746295, null));
            ImageView imageView = sbVar.f37962a;
            imageView.setImageResource(2131232362);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28293z9, e6Var, PorterDuff.Mode.MULTIPLY);
            yb ybVar = new yb(eyVar.getContext(), e6Var, true);
            ybVar.f40672b = clVar;
            sbVar.setButton(ybVar);
            if (d2Var != null) {
                ac.g(d2Var, sbVar, 1500).j();
                return;
            } else {
                ac.f(frameLayout, sbVar, 1500).j();
                return;
            }
        }
        if (d2Var != null) {
            fcVar = fc.a0(d2Var);
        } else {
            fcVar = new fc(frameLayout, e6Var);
        }
        fcVar.r(document, org.telegram.messenger.bd.M0(2131745555, null), org.telegram.messenger.bd.M0(2131743895, null), clVar).j();
    }

    @Override
    public final void w(TLObject tLObject, Object obj) {
        ey eyVar = this.f32000a;
        jv jvVar = eyVar.f33545i0;
        if (jvVar.getAdapter() != eyVar.f33561o0 && jvVar.getAdapter() != eyVar.f33551k0) {
            return;
        }
        eyVar.f33582u1.e(tLObject, obj);
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
    public final void O(String str) {
    }

    @Override
    public final void i(org.telegram.messenger.ry ryVar) {
    }

    @Override
    public final void m(String str) {
    }

    @Override
    public final void y(String str) {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void v(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void K(CharSequence charSequence, String str, ei eiVar) {
    }
}
