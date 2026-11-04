package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ll0 extends FrameLayout {
    public long f47353a;
    public TL_stars.starGiftAttributeBackdrop f47354b;
    public TL_stars.starGiftAttributePattern f47355c;
    public final FrameLayout d;
    public final ai.m2 f47356e;
    public final org.telegram.ui.Components.k9 f47357f;
    public final ai.r2 h;
    public TLRPC.Document f47358n;

    public ll0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ai.m2 m2Var = new ai.m2(frameLayout, e6Var, false);
        this.f47356e = m2Var;
        frameLayout.setBackground(m2Var);
        addView(frameLayout, b8.mf.e(-1, -1, 119));
        b8.pf.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f47357f = k9Var;
        frameLayout.addView(k9Var, b8.mf.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z10) {
            ai.r2 r2Var = new ai.r2(context);
            this.h = r2Var;
            addView(r2Var, b8.mf.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            return;
        }
        this.h = null;
    }

    public final void a(int i3, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        int i11;
        this.f47353a = tL_starGiftUnique.f27230id;
        boolean z10 = true;
        if (i3 % 3 != 1) {
            z10 = false;
        }
        if (z10) {
            i10 = org.telegram.messenger.g0.L(4.0f);
        } else {
            i10 = 0;
        }
        if (z10) {
            i11 = org.telegram.messenger.g0.L(4.0f);
        } else {
            i11 = 0;
        }
        setPadding(i10, 0, i11, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.f47354b = (TL_stars.starGiftAttributeBackdrop) ci.e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f47355c = (TL_stars.starGiftAttributePattern) ci.e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f47354b;
        ai.m2 m2Var = this.f47356e;
        m2Var.d(stargiftattributebackdrop);
        m2Var.e(this.f47355c);
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        this.f47356e.f(z10, z11);
        if (z10) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.k9 k9Var = this.f47357f;
        if (z11) {
            k9Var.animate().scaleX(f10).scaleY(f10).start();
            return;
        }
        k9Var.animate().cancel();
        k9Var.setScaleX(f10);
        k9Var.setScaleY(f10);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.k9 k9Var = this.f47357f;
        if (document == null) {
            k9Var.b();
            this.f47358n = null;
        } else if (this.f47358n == document) {
        } else {
            this.f47358n = document;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            k9Var.m(org.telegram.messenger.ac.b(document), "100_100", org.telegram.messenger.ac.c(w10, document), "100_100", org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.f27824a7, 0.3f, null), starGift);
        }
    }

    public long getGiftId() {
        return this.f47353a;
    }
}
