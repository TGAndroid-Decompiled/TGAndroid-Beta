package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jo0 extends FrameLayout {
    public long f39601a;
    public TL_stars.starGiftAttributeBackdrop f39602b;
    public TL_stars.starGiftAttributePattern f39603c;
    public final FrameLayout d;
    public final ih.v1 f39604e;
    public final org.telegram.ui.Components.t9 f39605f;
    public final ih.z1 h;
    public TLRPC.Document f39606n;

    public jo0(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ih.v1 v1Var = new ih.v1(frameLayout, c6Var, false);
        this.f39604e = v1Var;
        frameLayout.setBackground(v1Var);
        addView(frameLayout, i7.f6.e(-1, -1, 119));
        i7.h6.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f39605f = t9Var;
        frameLayout.addView(t9Var, i7.f6.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z10) {
            ih.z1 z1Var = new ih.z1(context);
            this.h = z1Var;
            addView(z1Var, i7.f6.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            return;
        }
        this.h = null;
    }

    public final void a(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i11;
        int i12;
        this.f39601a = tL_starGiftUnique.f22619id;
        boolean z10 = true;
        if (i10 % 3 != 1) {
            z10 = false;
        }
        if (z10) {
            i11 = AndroidUtilities.dp(4.0f);
        } else {
            i11 = 0;
        }
        if (z10) {
            i12 = AndroidUtilities.dp(4.0f);
        } else {
            i12 = 0;
        }
        setPadding(i11, 0, i12, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.f39602b = (TL_stars.starGiftAttributeBackdrop) jh.s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f39603c = (TL_stars.starGiftAttributePattern) jh.s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f39602b;
        ih.v1 v1Var = this.f39604e;
        v1Var.d(stargiftattributebackdrop);
        v1Var.e(this.f39603c);
    }

    public final void b(boolean z10, boolean z11) {
        float f9;
        this.f39604e.f(z10, z11);
        if (z10) {
            f9 = 0.9f;
        } else {
            f9 = 1.0f;
        }
        org.telegram.ui.Components.t9 t9Var = this.f39605f;
        if (z11) {
            t9Var.animate().scaleX(f9).scaleY(f9).start();
            return;
        }
        t9Var.animate().cancel();
        t9Var.setScaleX(f9);
        t9Var.setScaleY(f9);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.t9 t9Var = this.f39605f;
        if (document == null) {
            t9Var.b();
            this.f39606n = null;
        } else if (this.f39606n == document) {
        } else {
            this.f39606n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            t9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f23009a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.f39601a;
    }
}
