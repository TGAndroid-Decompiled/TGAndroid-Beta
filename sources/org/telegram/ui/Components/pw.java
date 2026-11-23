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
public final class pw implements org.telegram.ui.ls {
    public final ty f38623a;

    public pw(ty tyVar) {
        this.f38623a = tyVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f38623a.Z1;
        if (g2Var instanceof org.telegram.ui.bn) {
            ((org.telegram.ui.bn) g2Var).Gb(document);
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
    public final a70 E(ai.g0 g0Var) {
        return null;
    }

    @Override
    public final void F(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = org.telegram.messenger.si.c0(document, "").document;
        ConnectionsManager.getInstance(this.f38623a.f40074d1).sendRequest(tL_stickers_removeStickerFromSet, new f2(this, 3));
    }

    @Override
    public final String G(boolean z10) {
        ty tyVar = this.f38623a;
        if (z10) {
            v4.h0 adapter = tyVar.f40089i0.getAdapter();
            xx xxVar = tyVar.f40095k0;
            if (adapter == xxVar) {
                return xxVar.f42220x;
            }
            return null;
        }
        v4.h0 adapter2 = tyVar.Q.getAdapter();
        sx sxVar = tyVar.T;
        if (adapter2 == sxVar) {
            return sxVar.f39670w;
        }
        return null;
    }

    @Override
    public final void H(TLRPC.Document document) {
        lc lcVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.gj.U(document));
        valueOf.setSpan(new y5(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (org.telegram.messenger.g0.g(valueOf)) {
            ty tyVar = this.f38623a;
            org.telegram.ui.ActionBar.g2 g2Var = tyVar.Z1;
            if (g2Var != null) {
                lcVar = lc.b0(g2Var);
            } else {
                lcVar = new lc(tyVar.f40114r, tyVar.f40064a2);
            }
            org.telegram.messenger.o10.t(null, 2131751172, lcVar);
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
        this.f38623a.X();
    }

    @Override
    public final void M(TLRPC.InputStickerSet inputStickerSet, boolean z10) {
        if (inputStickerSet == null) {
            return;
        }
        this.f38623a.f40126u1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean N(TLRPC.Document document) {
        if (document != null) {
            ArrayList arrayList = org.telegram.messenger.j6.f24800i;
            if (arrayList.contains("animated_" + document.f28404id)) {
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
        if (!org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24932t0).q() || (f10 = org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24932t0).f()) == null) {
            return null;
        }
        Long i7 = org.telegram.messenger.p10.i(f10);
        if (document != null && (i7 == null || i7.longValue() != document.f28404id)) {
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
        return this.f38623a.f40126u1.a();
    }

    @Override
    public final boolean b() {
        return this.f38623a.f40126u1.b();
    }

    @Override
    public final boolean c() {
        return this.f38623a.f40126u1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.f38623a.f40126u1.j();
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
        ty tyVar = this.f38623a;
        if (tyVar.Z1 == null && tyVar.f40128v0) {
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
        ty tyVar = this.f38623a;
        org.telegram.ui.ActionBar.g2 g2Var = tyVar.Z1;
        if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).T6()) {
            if (org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24932t0).q() || (((org.telegram.ui.bn) tyVar.Z1).j() != null && org.telegram.messenger.p10.C(((org.telegram.ui.bn) tyVar.Z1).j()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l(TLRPC.Document document, String str, Object obj, boolean z10, int i7, int i10) {
        this.f38623a.f40126u1.m(null, document, str, obj, null, z10, i7);
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
        ty tyVar = this.f38623a;
        kw0.N0(tyVar.Z1, org.telegram.messenger.si.d0(tyVar.f40074d1).o0(inputStickerSet, true), document);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p(TLRPC.Document document) {
        if (document != null) {
            String str = "animated_" + document.f28404id;
            HashMap hashMap = org.telegram.messenger.j6.h;
            hashMap.remove(str);
            ArrayList arrayList = org.telegram.messenger.j6.f24800i;
            arrayList.remove(str);
            if (hashMap.isEmpty() || arrayList.isEmpty()) {
                org.telegram.messenger.j6.a(org.telegram.messenger.j6.f24806o[0]);
            }
            dx dxVar = this.f38623a.S;
            if (dxVar != null) {
                dxVar.F(false);
            }
        }
    }

    @Override
    public final void r(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
        ty tyVar = this.f38623a;
        xv xvVar = tyVar.f40089i0;
        if (xvVar.getAdapter() == tyVar.f40105o0) {
            tyVar.f40126u1.v(null, tLObject, null, obj, z10, i7, i10);
        } else if (xvVar.getAdapter() == tyVar.f40095k0) {
            tyVar.f40126u1.v(null, tLObject, null, obj, z10, i7, i10);
        }
    }

    @Override
    public final void s() {
        gx gxVar = this.f38623a.Q;
        if (gxVar != null && gxVar.f35652m3 != null) {
            while (gxVar.f35652m3.size() > 0) {
                fx fxVar = (fx) gxVar.f35652m3.valueAt(0);
                gxVar.f35652m3.removeAt(0);
                if (fxVar != null) {
                    View view = fxVar.d;
                    if (view != null && (view.getBackground() instanceof RippleDrawable)) {
                        fxVar.d.getBackground().setState(new int[0]);
                    }
                    View view2 = fxVar.d;
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
        ty tyVar = this.f38623a;
        FrameLayout frameLayout = tyVar.f40114r;
        org.telegram.ui.ActionBar.g2 g2Var = tyVar.Z1;
        org.telegram.ui.ActionBar.h6 h6Var = tyVar.f40064a2;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.f28404id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f10 = org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24932t0).f();
        if (f10 == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f10.emoji_status;
        }
        org.telegram.messenger.np.u1(tyVar.f40074d1).t5(emojiStatus, null);
        og ogVar = new og(29, this, obj);
        if (document == null) {
            yb ybVar = new yb(tyVar.getContext(), h6Var);
            ybVar.f42352b.setText(org.telegram.messenger.hd.N0(2131746091, null));
            ImageView imageView = ybVar.f42351a;
            imageView.setImageResource(2131232364);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.f29761z9, h6Var, PorterDuff.Mode.MULTIPLY);
            ec ecVar = new ec(tyVar.getContext(), h6Var, true);
            ecVar.f34715b = ogVar;
            ybVar.setButton(ecVar);
            if (g2Var != null) {
                gc.g(g2Var, ybVar, 1500).j();
                return;
            } else {
                gc.f(frameLayout, ybVar, 1500).j();
                return;
            }
        }
        if (g2Var != null) {
            lcVar = lc.b0(g2Var);
        } else {
            lcVar = new lc(frameLayout, h6Var);
        }
        lcVar.r(document, org.telegram.messenger.hd.N0(2131745349, null), org.telegram.messenger.hd.N0(2131743642, null), ogVar).j();
    }

    @Override
    public final void v(TLObject tLObject, Object obj) {
        ty tyVar = this.f38623a;
        xv xvVar = tyVar.f40089i0;
        if (xvVar.getAdapter() != tyVar.f40105o0 && xvVar.getAdapter() != tyVar.f40095k0) {
            return;
        }
        tyVar.f40126u1.e(tLObject, obj);
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
    public final void i(org.telegram.messenger.ty tyVar) {
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
    public final void y(CharSequence charSequence, String str, rh rhVar) {
    }
}
