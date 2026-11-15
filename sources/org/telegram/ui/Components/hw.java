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
public final class hw implements org.telegram.ui.ls {
    public final ly f35354a;

    public hw(ly lyVar) {
        this.f35354a = lyVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        org.telegram.ui.ActionBar.e2 e2Var = this.f35354a.Z1;
        if (e2Var instanceof org.telegram.ui.an) {
            ((org.telegram.ui.an) e2Var).Gb(document);
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
    public final m60 E(ai.k0 k0Var) {
        return null;
    }

    @Override
    public final void F(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.si.a0(document, "").document;
        ConnectionsManager.getInstance(this.f35354a.f36941d1).sendRequest(tL_stickers_removeStickerFromSet, new v1(this, 3));
    }

    @Override
    public final String G(boolean z10) {
        ly lyVar = this.f35354a;
        if (z10) {
            v4.h0 adapter = lyVar.f36956i0.getAdapter();
            qx qxVar = lyVar.f36962k0;
            if (adapter == qxVar) {
                return qxVar.f38787x;
            }
            return null;
        }
        v4.h0 adapter2 = lyVar.Q.getAdapter();
        lx lxVar = lyVar.T;
        if (adapter2 == lxVar) {
            return lxVar.f36924w;
        }
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        cc ccVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.gj.U(document));
        valueOf.setSpan(new p5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            ly lyVar = this.f35354a;
            org.telegram.ui.ActionBar.e2 e2Var = lyVar.Z1;
            if (e2Var != null) {
                ccVar = cc.a0(e2Var);
            } else {
                ccVar = new cc(lyVar.f36981r, lyVar.f36931a2);
            }
            org.telegram.messenger.i20.s(null, 2131751184, ccVar);
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
        this.f35354a.X();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f35354a.f36993u1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList arrayList = org.telegram.messenger.j6.f24531i;
            if (arrayList.contains("animated_" + document.f28057id)) {
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
        if (!org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).q() || (f10 = org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).f()) == null) {
            return null;
        }
        Long h = org.telegram.messenger.q10.h(f10);
        if (document != null && (h == null || h.longValue() != document.f28057id)) {
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
        return this.f35354a.f36993u1.a();
    }

    @Override
    public final boolean b() {
        return this.f35354a.f36993u1.b();
    }

    @Override
    public final boolean c() {
        return this.f35354a.f36993u1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f35354a.f36993u1.j();
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
        ly lyVar = this.f35354a;
        if (lyVar.Z1 == null && lyVar.f36995v0) {
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
        ly lyVar = this.f35354a;
        org.telegram.ui.ActionBar.e2 e2Var = lyVar.Z1;
        if ((e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).T6()) {
            if (org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).q() || (((org.telegram.ui.an) lyVar.Z1).j() != null && org.telegram.messenger.q10.B(((org.telegram.ui.an) lyVar.Z1).j()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
        this.f35354a.f36993u1.m(null, document, str, obj, null, z10, i7);
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
        ly lyVar = this.f35354a;
        bw0.M0(lyVar.Z1, org.telegram.messenger.si.b0(lyVar.f36941d1).m0(inputStickerSet, true), document);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p(TLRPC.Document document) {
        if (document != null) {
            String str = "animated_" + document.f28057id;
            HashMap hashMap = org.telegram.messenger.j6.h;
            hashMap.remove(str);
            ArrayList arrayList = org.telegram.messenger.j6.f24531i;
            arrayList.remove(str);
            if (hashMap.isEmpty() || arrayList.isEmpty()) {
                org.telegram.messenger.j6.a(org.telegram.messenger.j6.f24537o[0]);
            }
            vw vwVar = this.f35354a.S;
            if (vwVar != null) {
                vwVar.F(false);
            }
        }
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
        ly lyVar = this.f35354a;
        qv qvVar = lyVar.f36956i0;
        if (qvVar.getAdapter() == lyVar.f36972o0) {
            lyVar.f36993u1.v(null, tLObject, null, obj, z10, i7, i10);
        } else if (qvVar.getAdapter() == lyVar.f36962k0) {
            lyVar.f36993u1.v(null, tLObject, null, obj, z10, i7, i10);
        }
    }

    @Override
    public final void s() {
        yw ywVar = this.f35354a.Q;
        if (ywVar != null && ywVar.f42171m3 != null) {
            while (ywVar.f42171m3.size() > 0) {
                xw xwVar = (xw) ywVar.f42171m3.valueAt(0);
                ywVar.f42171m3.removeAt(0);
                if (xwVar != null) {
                    View view = xwVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        xwVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = xwVar.d;
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
        ly lyVar = this.f35354a;
        FrameLayout frameLayout = lyVar.f36981r;
        org.telegram.ui.ActionBar.e2 e2Var = lyVar.Z1;
        org.telegram.ui.ActionBar.e6 e6Var = lyVar.f36931a2;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f28057id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).f();
        if (f10 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f10.emoji_status;
        }
        org.telegram.messenger.np.s1(lyVar.f36941d1).i5(emojiStatus, null);
        vs vsVar = new vs(3, this, obj);
        if (document == null) {
            pb pbVar = new pb(lyVar.getContext(), e6Var);
            pbVar.f38262b.setText(org.telegram.messenger.hd.M0(2131746287, null));
            ImageView imageView = pbVar.f38261a;
            imageView.setImageResource(2131232363);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.f29263z9, e6Var, PorterDuff.Mode.MULTIPLY);
            vb vbVar = new vb(lyVar.getContext(), e6Var, true);
            vbVar.f40372b = vsVar;
            pbVar.setButton(vbVar);
            if (e2Var != null) {
                xb.g(e2Var, pbVar, 1500).j();
                return;
            } else {
                xb.f(frameLayout, pbVar, 1500).j();
                return;
            }
        }
        if (e2Var != null) {
            ccVar = cc.a0(e2Var);
        } else {
            ccVar = new cc(frameLayout, e6Var);
        }
        ccVar.r(document, org.telegram.messenger.hd.M0(2131745545, null), org.telegram.messenger.hd.M0(2131743885, null), vsVar).j();
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
        ly lyVar = this.f35354a;
        qv qvVar = lyVar.f36956i0;
        if (qvVar.getAdapter() != lyVar.f36972o0 && qvVar.getAdapter() != lyVar.f36962k0) {
            return;
        }
        lyVar.f36993u1.e(tLObject, obj);
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final org.telegram.messenger.gj z() {
        return null;
    }

    @Override
    public final void O(String str) {
    }

    @Override
    public final void i(org.telegram.messenger.xy xyVar) {
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
    public final void y(CharSequence charSequence, String str, gh ghVar) {
    }
}
