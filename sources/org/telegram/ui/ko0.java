package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ko0 extends FrameLayout {
    public long f39879a;
    public TL_stars.starGiftAttributeBackdrop f39880b;
    public TL_stars.starGiftAttributePattern f39881c;
    public final FrameLayout d;
    public final fh.b2 f39882e;
    public final org.telegram.ui.Components.o9 f39883f;
    public final fh.g2 h;
    public TLRPC.Document f39884n;

    public ko0(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        fh.b2 b2Var = new fh.b2(frameLayout, b6Var, false);
        this.f39882e = b2Var;
        frameLayout.setBackground(b2Var);
        addView(frameLayout, g7.e6.e(-1, -1, 119));
        g7.g6.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f39883f = o9Var;
        frameLayout.addView(o9Var, g7.e6.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z10) {
            fh.g2 g2Var = new fh.g2(context);
            this.h = g2Var;
            addView(g2Var, g7.e6.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            return;
        }
        this.h = null;
    }

    public final void a(int i9, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        int i11;
        this.f39879a = tL_starGiftUnique.f22607id;
        boolean z10 = true;
        if (i9 % 3 != 1) {
            z10 = false;
        }
        if (z10) {
            i10 = AndroidUtilities.dp(4.0f);
        } else {
            i10 = 0;
        }
        if (z10) {
            i11 = AndroidUtilities.dp(4.0f);
        } else {
            i11 = 0;
        }
        setPadding(i10, 0, i11, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.f39880b = (TL_stars.starGiftAttributeBackdrop) gh.v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f39881c = (TL_stars.starGiftAttributePattern) gh.v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f39880b;
        fh.b2 b2Var = this.f39882e;
        b2Var.d(stargiftattributebackdrop);
        b2Var.e(this.f39881c);
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        this.f39882e.f(z10, z11);
        if (z10) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.o9 o9Var = this.f39883f;
        if (z11) {
            o9Var.animate().scaleX(f10).scaleY(f10).start();
            return;
        }
        o9Var.animate().cancel();
        o9Var.setScaleX(f10);
        o9Var.setScaleY(f10);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.o9 o9Var = this.f39883f;
        if (document == null) {
            o9Var.b();
            this.f39884n = null;
        } else if (this.f39884n == document) {
        } else {
            this.f39884n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            o9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.f6.f22947a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.f39879a;
    }
}
