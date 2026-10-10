package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ip0 extends FrameLayout {
    public long f38782a;
    public TL_stars.starGiftAttributeBackdrop f38783b;
    public TL_stars.starGiftAttributePattern f38784c;
    public final FrameLayout d;
    public final xh.g1 f38785e;
    public final org.telegram.ui.Components.y9 f38786f;
    public final xh.k1 h;
    public TLRPC.Document f38787n;

    public ip0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        xh.g1 g1Var = new xh.g1(frameLayout, e6Var, false);
        this.f38785e = g1Var;
        frameLayout.setBackground(g1Var);
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        w7.z5.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f38786f = y9Var;
        frameLayout.addView(y9Var, w7.x5.a(80.0f, 0.0f, 12.0f, 0.0f, 12.0f, 80, 17));
        if (z10) {
            xh.k1 k1Var = new xh.k1(context);
            this.h = k1Var;
            addView(k1Var, w7.x5.a(-2.0f, 0.0f, 2.0f, 1.0f, 0.0f, -2, 53));
            return;
        }
        this.h = null;
    }

    public final void a(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i11;
        int i12;
        this.f38782a = tL_starGiftUnique.f20269id;
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
        this.f38783b = (TL_stars.starGiftAttributeBackdrop) yh.m5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f38784c = (TL_stars.starGiftAttributePattern) yh.m5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f38783b;
        xh.g1 g1Var = this.f38785e;
        g1Var.d(stargiftattributebackdrop);
        g1Var.e(this.f38784c);
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        this.f38785e.f(z10, z11);
        if (z10) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.y9 y9Var = this.f38786f;
        if (z11) {
            y9Var.animate().scaleX(f7).scaleY(f7).start();
            return;
        }
        y9Var.animate().cancel();
        y9Var.setScaleX(f7);
        y9Var.setScaleY(f7);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.y9 y9Var = this.f38786f;
        if (document == null) {
            y9Var.b();
            this.f38787n = null;
        } else if (this.f38787n == document) {
        } else {
            this.f38787n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            y9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.i6.f20745a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.f38782a;
    }
}
