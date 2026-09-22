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
    public long f34704a;
    public TL_stars.starGiftAttributeBackdrop f34705b;
    public TL_stars.starGiftAttributePattern f34706c;
    public final FrameLayout d;
    public final xh.e1 e;
    public final org.telegram.ui.Components.u9 f34707f;
    public final xh.j1 h;
    public TLRPC.Document f34708n;

    public ip0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        xh.e1 e1Var = new xh.e1(frameLayout, e6Var, false);
        this.e = e1Var;
        frameLayout.setBackground(e1Var);
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        w7.z5.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f34707f = u9Var;
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
        this.f34704a = tL_starGiftUnique.f18334id;
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
        this.f34705b = (TL_stars.starGiftAttributeBackdrop) yh.u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f34706c = (TL_stars.starGiftAttributePattern) yh.u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f34705b;
        xh.e1 e1Var = this.e;
        e1Var.d(stargiftattributebackdrop);
        e1Var.e(this.f34706c);
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        this.e.f(z10, z11);
        if (z10) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.u9 u9Var = this.f34707f;
        if (z11) {
            u9Var.animate().scaleX(f7).scaleY(f7).start();
            return;
        }
        u9Var.animate().cancel();
        u9Var.setScaleX(f7);
        u9Var.setScaleY(f7);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.u9 u9Var = this.f34707f;
        if (document == null) {
            u9Var.b();
            this.f34708n = null;
        } else if (this.f34708n == document) {
        } else {
            this.f34708n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            u9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.i6.f18778a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.f34704a;
    }
}
