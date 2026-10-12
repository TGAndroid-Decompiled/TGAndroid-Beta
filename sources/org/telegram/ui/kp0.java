package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class kp0 extends FrameLayout {
    public long f39566a;
    public TL_stars.starGiftAttributeBackdrop f39567b;
    public TL_stars.starGiftAttributePattern f39568c;
    public final FrameLayout d;
    public final xh.f1 f39569e;
    public final org.telegram.ui.Components.y9 f39570f;
    public final xh.j1 h;
    public TLRPC.Document f39571n;

    public kp0(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        xh.f1 f1Var = new xh.f1(frameLayout, c6Var, false);
        this.f39569e = f1Var;
        frameLayout.setBackground(f1Var);
        addView(frameLayout, w7.w5.e(-1, -1, 119));
        w7.y5.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f39570f = y9Var;
        frameLayout.addView(y9Var, w7.w5.a(80.0f, 0.0f, 12.0f, 0.0f, 12.0f, 80, 17));
        if (z10) {
            xh.j1 j1Var = new xh.j1(context);
            this.h = j1Var;
            addView(j1Var, w7.w5.a(-2.0f, 0.0f, 2.0f, 1.0f, 0.0f, -2, 53));
            return;
        }
        this.h = null;
    }

    public final void a(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i11;
        int i12;
        this.f39566a = tL_starGiftUnique.f20031id;
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
        this.f39567b = (TL_stars.starGiftAttributeBackdrop) yh.n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f39568c = (TL_stars.starGiftAttributePattern) yh.n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f39567b;
        xh.f1 f1Var = this.f39569e;
        f1Var.d(stargiftattributebackdrop);
        f1Var.e(this.f39568c);
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        this.f39569e.f(z10, z11);
        if (z10) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.y9 y9Var = this.f39570f;
        if (z11) {
            y9Var.animate().scaleX(f7).scaleY(f7).start();
            return;
        }
        y9Var.animate().cancel();
        y9Var.setScaleX(f7);
        y9Var.setScaleY(f7);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.y9 y9Var = this.f39570f;
        if (document == null) {
            y9Var.b();
            this.f39571n = null;
        } else if (this.f39571n == document) {
        } else {
            this.f39571n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            y9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.h6.f20503a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.f39566a;
    }
}
