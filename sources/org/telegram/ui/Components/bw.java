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
public final class bw implements org.telegram.ui.is {
    public final gy f32302a;

    public bw(gy gyVar) {
        this.f32302a = gyVar;
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
        org.telegram.ui.ActionBar.f2 f2Var = this.f32302a.Y1;
        if (f2Var instanceof org.telegram.ui.an) {
            ((org.telegram.ui.an) f2Var).Cb(document);
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
        ConnectionsManager.getInstance(this.f32302a.f34024c1).sendRequest(tL_stickers_removeStickerFromSet, new x1(this, 3));
    }

    @Override
    public final String G(boolean z9) {
        gy gyVar = this.f32302a;
        if (z9) {
            v4.g0 adapter = gyVar.f34039h0.getAdapter();
            lx lxVar = gyVar.f34045j0;
            if (adapter == lxVar) {
                return lxVar.f35767x;
            }
            return null;
        }
        v4.g0 adapter2 = gyVar.P.getAdapter();
        gx gxVar = gyVar.S;
        if (adapter2 == gxVar) {
            return gxVar.f34009w;
        }
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        hc hcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.ij.U(document));
        valueOf.setSpan(new r5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            gy gyVar = this.f32302a;
            org.telegram.ui.ActionBar.f2 f2Var = gyVar.Y1;
            if (f2Var != null) {
                hcVar = hc.a0(f2Var);
            } else {
                hcVar = new hc(gyVar.f34067r, gyVar.Z1);
            }
            org.telegram.messenger.camera.q.r(null, 2131751185, hcVar);
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
        this.f32302a.W();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z9) {
        if (inputStickerSet == null) {
            return;
        }
        this.f32302a.f34076t1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList arrayList = org.telegram.messenger.i6.f23061i;
            if (arrayList.contains("animated_" + document.f26958id)) {
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
        if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).q() || (f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.t10.h(f10);
        if (document != null && (h == null || h.longValue() != document.f26958id)) {
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
        return this.f32302a.f34076t1.a();
    }

    @Override
    public final boolean b() {
        return this.f32302a.f34076t1.b();
    }

    @Override
    public final boolean c() {
        return this.f32302a.f34076t1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f32302a.f34076t1.j();
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
        gy gyVar = this.f32302a;
        if (gyVar.Y1 == null && gyVar.f34078u0) {
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
        gy gyVar = this.f32302a;
        org.telegram.ui.ActionBar.f2 f2Var = gyVar.Y1;
        if ((f2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var).S6()) {
            if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).q() || (((org.telegram.ui.an) gyVar.Y1).j() != null && org.telegram.messenger.t10.B(((org.telegram.ui.an) gyVar.Y1).j()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z9, int i7, int i10) {
        this.f32302a.f34076t1.m(null, document, str, obj, null, z9, i7);
    }

    @Override
    public final k60 m(bi.x5 x5Var) {
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
        gy gyVar = this.f32302a;
        yv0.M0(gyVar.Y1, org.telegram.messenger.ui.b0(gyVar.f34024c1).m0(inputStickerSet, true), document);
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void q(TLRPC.Document document) {
        if (document != null) {
            String str = "animated_" + document.f26958id;
            HashMap hashMap = org.telegram.messenger.i6.h;
            hashMap.remove(str);
            ArrayList arrayList = org.telegram.messenger.i6.f23061i;
            arrayList.remove(str);
            if (hashMap.isEmpty() || arrayList.isEmpty()) {
                org.telegram.messenger.i6.a(org.telegram.messenger.i6.f23067o[0]);
            }
            pw pwVar = this.f32302a.R;
            if (pwVar != null) {
                pwVar.F(false);
            }
        }
    }

    @Override
    public final void s(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
        gy gyVar = this.f32302a;
        kv kvVar = gyVar.f34039h0;
        if (kvVar.getAdapter() == gyVar.f34056n0) {
            gyVar.f34076t1.v(null, tLObject, null, obj, z9, i7, i10);
        } else if (kvVar.getAdapter() == gyVar.f34045j0) {
            gyVar.f34076t1.v(null, tLObject, null, obj, z9, i7, i10);
        }
    }

    @Override
    public final void t() {
        sw swVar = this.f32302a.P;
        if (swVar != null && swVar.f38137l3 != null) {
            while (swVar.f38137l3.size() > 0) {
                rw rwVar = (rw) swVar.f38137l3.valueAt(0);
                swVar.f38137l3.removeAt(0);
                if (rwVar != null) {
                    View view = rwVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        rwVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = rwVar.d;
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
        gy gyVar = this.f32302a;
        FrameLayout frameLayout = gyVar.f34067r;
        org.telegram.ui.ActionBar.f2 f2Var = gyVar.Y1;
        org.telegram.ui.ActionBar.f6 f6Var = gyVar.Z1;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f26958id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).f();
        if (f10 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f10.emoji_status;
        }
        org.telegram.messenger.qp.s1(gyVar.f34024c1).h5(emojiStatus, null);
        fq fqVar = new fq(9, this, obj);
        if (document == null) {
            ub ubVar = new ub(gyVar.getContext(), f6Var);
            ubVar.f38581b.setText(org.telegram.messenger.hd.M0(2131746286, null));
            ImageView imageView = ubVar.f38580a;
            imageView.setImageResource(2131232362);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.z9, f6Var, PorterDuff.Mode.MULTIPLY);
            ac acVar = new ac(gyVar.getContext(), f6Var, true);
            acVar.f31760b = fqVar;
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
            hcVar = new hc(frameLayout, f6Var);
        }
        hcVar.r(document, org.telegram.messenger.hd.M0(2131745546, null), org.telegram.messenger.hd.M0(2131743886, null), fqVar).j();
    }

    @Override
    public final void x(TLObject tLObject, Object obj) {
        gy gyVar = this.f32302a;
        kv kvVar = gyVar.f34039h0;
        if (kvVar.getAdapter() != gyVar.f34056n0 && kvVar.getAdapter() != gyVar.f34045j0) {
            return;
        }
        gyVar.f34076t1.e(tLObject, obj);
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
    public final void u(CharSequence charSequence, String str, ex exVar) {
    }
}
