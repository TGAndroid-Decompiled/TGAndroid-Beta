package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class an0 extends FrameLayout {
    public long f35810a;
    public TL_stars.starGiftAttributeBackdrop f35811b;
    public TL_stars.starGiftAttributePattern f35812c;
    public final FrameLayout d;
    public final ph.z0 e;
    public final org.telegram.ui.Components.g9 f35813f;
    public final ph.d1 h;
    public TLRPC.Document f35814n;

    public an0(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ph.z0 z0Var = new ph.z0(frameLayout, p6Var, false);
        this.e = z0Var;
        frameLayout.setBackground(z0Var);
        addView(frameLayout, w7.b6.e(-1, -1, 119));
        w7.e6.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f35813f = g9Var;
        frameLayout.addView(g9Var, w7.b6.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z10) {
            ph.d1 d1Var = new ph.d1(context);
            this.h = d1Var;
            addView(d1Var, w7.b6.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            return;
        }
        this.h = null;
    }

    public final void a(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i11;
        int i12;
        this.f35810a = tL_starGiftUnique.f20022id;
        boolean z10 = true;
        if (i10 % 3 != 1) {
            z10 = false;
        }
        if (z10) {
            i11 = org.telegram.messenger.i0.L(4.0f);
        } else {
            i11 = 0;
        }
        if (z10) {
            i12 = org.telegram.messenger.i0.L(4.0f);
        } else {
            i12 = 0;
        }
        setPadding(i11, 0, i12, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.f35811b = (TL_stars.starGiftAttributeBackdrop) rh.e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f35812c = (TL_stars.starGiftAttributePattern) rh.e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f35811b;
        ph.z0 z0Var = this.e;
        z0Var.d(stargiftattributebackdrop);
        z0Var.e(this.f35812c);
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        this.e.f(z10, z11);
        if (z10) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.g9 g9Var = this.f35813f;
        if (z11) {
            g9Var.animate().scaleX(f7).scaleY(f7).start();
            return;
        }
        g9Var.animate().cancel();
        g9Var.setScaleX(f7);
        g9Var.setScaleY(f7);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.g9 g9Var = this.f35813f;
        if (document == null) {
            g9Var.b();
            this.f35814n = null;
        } else if (this.f35814n == document) {
        } else {
            this.f35814n = document;
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, org.telegram.messenger.i0.L(100.0f), false, null, false);
            g9Var.m(org.telegram.messenger.jc.b(document), "100_100", org.telegram.messenger.jc.c(w9, document), "100_100", org.telegram.messenger.v5.f(document, org.telegram.ui.ActionBar.t6.f20873a7, 0.3f, null), starGift);
        }
    }

    public long getGiftId() {
        return this.f35810a;
    }
}
