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
public final class mw implements org.telegram.ui.ls {
    public final qy f37561a;

    public mw(qy qyVar) {
        this.f37561a = qyVar;
    }

    @Override
    public final void A(TLRPC.Document document) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f37561a.Z1;
        if (g2Var instanceof org.telegram.ui.bn) {
            ((org.telegram.ui.bn) g2Var).Gb(document);
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
    public final x60 D(ai.h0 h0Var) {
        return null;
    }

    @Override
    public final void E(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.ri.c0(document, "").document;
        ConnectionsManager.getInstance(this.f37561a.f39047d1).sendRequest(tL_stickers_removeStickerFromSet, new e2(this, 3));
    }

    @Override
    public final String F(boolean z10) {
        qy qyVar = this.f37561a;
        if (z10) {
            v4.i0 adapter = qyVar.f39062i0.getAdapter();
            ux uxVar = qyVar.f39068k0;
            if (adapter == uxVar) {
                return uxVar.f40498x;
            }
            return null;
        }
        v4.i0 adapter2 = qyVar.Q.getAdapter();
        px pxVar = qyVar.T;
        if (adapter2 == pxVar) {
            return pxVar.f38607w;
        }
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        kc kcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.fj.U(document));
        valueOf.setSpan(new x5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            qy qyVar = this.f37561a;
            org.telegram.ui.ActionBar.g2 g2Var = qyVar.Z1;
            if (g2Var != null) {
                kcVar = kc.b0(g2Var);
            } else {
                kcVar = new kc(qyVar.f39087r, qyVar.f39037a2);
            }
            org.telegram.messenger.m10.t(null, 2131751172, kcVar);
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
        this.f37561a.X();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f37561a.f39099u1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList arrayList = org.telegram.messenger.j6.f24926i;
            if (arrayList.contains("animated_" + document.f28498id)) {
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
        if (!org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).q() || (f10 = org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).f()) == null) {
            return null;
        }
        Long i7 = org.telegram.messenger.n10.i(f10);
        if (document != null && (i7 == null || i7.longValue() != document.f28498id)) {
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
        return this.f37561a.f39099u1.a();
    }

    @Override
    public final boolean b() {
        return this.f37561a.f39099u1.b();
    }

    @Override
    public final boolean c() {
        return this.f37561a.f39099u1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f37561a.f39099u1.j();
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
        qy qyVar = this.f37561a;
        if (qyVar.Z1 == null && qyVar.f39101v0) {
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
        qy qyVar = this.f37561a;
        org.telegram.ui.ActionBar.g2 g2Var = qyVar.Z1;
        if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).T6()) {
            if (org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).q() || (((org.telegram.ui.bn) qyVar.Z1).j() != null && org.telegram.messenger.n10.C(((org.telegram.ui.bn) qyVar.Z1).j()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
        this.f37561a.f39099u1.m(null, document, str, obj, null, z10, i7);
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
        qy qyVar = this.f37561a;
        jw0.N0(qyVar.Z1, org.telegram.messenger.ri.d0(qyVar.f39047d1).o0(inputStickerSet, true), document);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p(TLRPC.Document document) {
        if (document != null) {
            String str = "animated_" + document.f28498id;
            HashMap hashMap = org.telegram.messenger.j6.h;
            hashMap.remove(str);
            ArrayList arrayList = org.telegram.messenger.j6.f24926i;
            arrayList.remove(str);
            if (hashMap.isEmpty() || arrayList.isEmpty()) {
                org.telegram.messenger.j6.a(org.telegram.messenger.j6.f24932o[0]);
            }
            ax axVar = this.f37561a.S;
            if (axVar != null) {
                axVar.F(false);
            }
        }
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
        qy qyVar = this.f37561a;
        vv vvVar = qyVar.f39062i0;
        if (vvVar.getAdapter() == qyVar.f39078o0) {
            qyVar.f39099u1.v(null, tLObject, null, obj, z10, i7, i10);
        } else if (vvVar.getAdapter() == qyVar.f39068k0) {
            qyVar.f39099u1.v(null, tLObject, null, obj, z10, i7, i10);
        }
    }

    @Override
    public final void s() {
        dx dxVar = this.f37561a.Q;
        if (dxVar != null && dxVar.f34477m3 != null) {
            while (dxVar.f34477m3.size() > 0) {
                cx cxVar = (cx) dxVar.f34477m3.valueAt(0);
                dxVar.f34477m3.removeAt(0);
                if (cxVar != null) {
                    View view = cxVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        cxVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = cxVar.d;
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
        kc kcVar;
        qy qyVar = this.f37561a;
        FrameLayout frameLayout = qyVar.f39087r;
        org.telegram.ui.ActionBar.g2 g2Var = qyVar.Z1;
        org.telegram.ui.ActionBar.i6 i6Var = qyVar.f39037a2;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f28498id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).f();
        if (f10 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f10.emoji_status;
        }
        org.telegram.messenger.mp.u1(qyVar.f39047d1).t5(emojiStatus, null);
        bt btVar = new bt(3, this, obj);
        if (document == null) {
            xb xbVar = new xb(qyVar.getContext(), i6Var);
            xbVar.f41967b.setText(org.telegram.messenger.gd.N0(2131746091, null));
            ImageView imageView = xbVar.f41966a;
            imageView.setImageResource(2131232367);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.f29865z9, i6Var, PorterDuff.Mode.MULTIPLY);
            dc dcVar = new dc(qyVar.getContext(), i6Var, true);
            dcVar.f34267b = btVar;
            xbVar.setButton(dcVar);
            if (g2Var != null) {
                fc.g(g2Var, xbVar, 1500).j();
                return;
            } else {
                fc.f(frameLayout, xbVar, 1500).j();
                return;
            }
        }
        if (g2Var != null) {
            kcVar = kc.b0(g2Var);
        } else {
            kcVar = new kc(frameLayout, i6Var);
        }
        kcVar.r(document, org.telegram.messenger.gd.N0(2131745349, null), org.telegram.messenger.gd.N0(2131743638, null), btVar).j();
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
        qy qyVar = this.f37561a;
        vv vvVar = qyVar.f39062i0;
        if (vvVar.getAdapter() != qyVar.f39078o0 && vvVar.getAdapter() != qyVar.f39068k0) {
            return;
        }
        qyVar.f39099u1.e(tLObject, obj);
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final org.telegram.messenger.fj y() {
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
    public final void i(org.telegram.messenger.sy syVar) {
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
    public final void K(CharSequence charSequence, String str, ph phVar) {
    }
}
