package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class bp0 extends FrameLayout {
    public long f32459a;
    public TL_stars.starGiftAttributeBackdrop f32460b;
    public TL_stars.starGiftAttributePattern f32461c;
    public final FrameLayout d;
    public final xh.f1 e;
    public final org.telegram.ui.Components.w9 f32462f;
    public final xh.k1 h;
    public TLRPC.Document f32463n;

    public bp0(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        xh.f1 f1Var = new xh.f1(frameLayout, d6Var, false);
        this.e = f1Var;
        frameLayout.setBackground(f1Var);
        addView(frameLayout, w7.y5.e(-1, -1, 119));
        w7.a6.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f32462f = w9Var;
        frameLayout.addView(w9Var, w7.y5.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z10) {
            xh.k1 k1Var = new xh.k1(context);
            this.h = k1Var;
            addView(k1Var, w7.y5.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            return;
        }
        this.h = null;
    }

    public final void a(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i11;
        int i12;
        this.f32459a = tL_starGiftUnique.f18560id;
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
        this.f32460b = (TL_stars.starGiftAttributeBackdrop) yh.s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f32461c = (TL_stars.starGiftAttributePattern) yh.s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f32460b;
        xh.f1 f1Var = this.e;
        f1Var.d(stargiftattributebackdrop);
        f1Var.e(this.f32461c);
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        this.e.f(z10, z11);
        if (z10) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.w9 w9Var = this.f32462f;
        if (z11) {
            w9Var.animate().scaleX(f7).scaleY(f7).start();
            return;
        }
        w9Var.animate().cancel();
        w9Var.setScaleX(f7);
        w9Var.setScaleY(f7);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.w9 w9Var = this.f32462f;
        if (document == null) {
            w9Var.b();
            this.f32463n = null;
        } else if (this.f32463n == document) {
        } else {
            this.f32463n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            w9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.h6.f19003a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.f32459a;
    }
}
