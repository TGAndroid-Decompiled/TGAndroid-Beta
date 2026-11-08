package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ql0 extends FrameLayout {
    public long f49259a;
    public TL_stars.starGiftAttributeBackdrop f49260b;
    public TL_stars.starGiftAttributePattern f49261c;
    public final FrameLayout d;
    public final zh.v0 f49262e;
    public final org.telegram.ui.Components.l9 f49263f;
    public final zh.z0 h;
    public TLRPC.Document f49264n;

    public ql0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        zh.v0 v0Var = new zh.v0(frameLayout, f6Var, false);
        this.f49262e = v0Var;
        frameLayout.setBackground(v0Var);
        addView(frameLayout, c8.ha.e(-1, -1, 119));
        c8.ka.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f49263f = l9Var;
        frameLayout.addView(l9Var, c8.ha.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z9) {
            zh.z0 z0Var = new zh.z0(context);
            this.h = z0Var;
            addView(z0Var, c8.ha.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            return;
        }
        this.h = null;
    }

    public final void a(int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        int i11;
        this.f49259a = tL_starGiftUnique.f27185id;
        boolean z9 = true;
        if (i7 % 3 != 1) {
            z9 = false;
        }
        if (z9) {
            i10 = org.telegram.messenger.g0.L(4.0f);
        } else {
            i10 = 0;
        }
        if (z9) {
            i11 = org.telegram.messenger.g0.L(4.0f);
        } else {
            i11 = 0;
        }
        setPadding(i10, 0, i11, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.f49260b = (TL_stars.starGiftAttributeBackdrop) bi.ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f49261c = (TL_stars.starGiftAttributePattern) bi.ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f49260b;
        zh.v0 v0Var = this.f49262e;
        v0Var.d(stargiftattributebackdrop);
        v0Var.e(this.f49261c);
    }

    public final void b(boolean z9, boolean z10) {
        float f10;
        this.f49262e.f(z9, z10);
        if (z9) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.l9 l9Var = this.f49263f;
        if (z10) {
            l9Var.animate().scaleX(f10).scaleY(f10).start();
            return;
        }
        l9Var.animate().cancel();
        l9Var.setScaleX(f10);
        l9Var.setScaleY(f10);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.l9 l9Var = this.f49263f;
        if (document == null) {
            l9Var.b();
            this.f49264n = null;
        } else if (this.f49264n == document) {
        } else {
            this.f49264n = document;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            l9Var.m(org.telegram.messenger.hc.b(document), "100_100", org.telegram.messenger.hc.c(w10, document), "100_100", org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.f27796a7, 0.3f, null), starGift);
        }
    }

    public long getGiftId() {
        return this.f49259a;
    }
}
