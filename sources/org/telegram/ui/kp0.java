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
    public long f35351a;
    public TL_stars.starGiftAttributeBackdrop f35352b;
    public TL_stars.starGiftAttributePattern f35353c;
    public final FrameLayout d;
    public final xh.e1 e;
    public final org.telegram.ui.Components.u9 f35354f;
    public final xh.j1 h;
    public TLRPC.Document f35355n;

    public kp0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        xh.e1 e1Var = new xh.e1(frameLayout, f6Var, false);
        this.e = e1Var;
        frameLayout.setBackground(e1Var);
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        w7.z5.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f35354f = u9Var;
        frameLayout.addView(u9Var, w7.x5.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z10) {
            xh.j1 j1Var = new xh.j1(context);
            this.h = j1Var;
            addView(j1Var, w7.x5.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            return;
        }
        this.h = null;
    }

    public final void a(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i11;
        int i12;
        this.f35351a = tL_starGiftUnique.f18346id;
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
        this.f35352b = (TL_stars.starGiftAttributeBackdrop) yh.v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f35353c = (TL_stars.starGiftAttributePattern) yh.v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f35352b;
        xh.e1 e1Var = this.e;
        e1Var.d(stargiftattributebackdrop);
        e1Var.e(this.f35353c);
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        this.e.f(z10, z11);
        if (z10) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.u9 u9Var = this.f35354f;
        if (z11) {
            u9Var.animate().scaleX(f7).scaleY(f7).start();
            return;
        }
        u9Var.animate().cancel();
        u9Var.setScaleX(f7);
        u9Var.setScaleY(f7);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.u9 u9Var = this.f35354f;
        if (document == null) {
            u9Var.b();
            this.f35355n = null;
        } else if (this.f35355n == document) {
        } else {
            this.f35355n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            u9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.f18807a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.f35351a;
    }
}
