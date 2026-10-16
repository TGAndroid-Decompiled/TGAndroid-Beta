package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class mp0 extends FrameLayout {
    public long f38047a;
    public TL_stars.starGiftAttributeBackdrop f38048b;
    public TL_stars.starGiftAttributePattern f38049c;
    public final FrameLayout d;
    public final yh.e1 e;
    public final org.telegram.ui.Components.z9 f38050f;
    public final yh.i1 h;
    public TLRPC.Document f38051n;

    public mp0(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        yh.e1 e1Var = new yh.e1(frameLayout, c6Var, false);
        this.e = e1Var;
        frameLayout.setBackground(e1Var);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        w7.b6.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.f38050f = z9Var;
        frameLayout.addView(z9Var, w7.z5.a(80.0f, 0.0f, 12.0f, 0.0f, 12.0f, 80, 17));
        if (z10) {
            yh.i1 i1Var = new yh.i1(context);
            this.h = i1Var;
            addView(i1Var, w7.z5.a(-2.0f, 0.0f, 2.0f, 1.0f, 0.0f, -2, 53));
            return;
        }
        this.h = null;
    }

    public final void a(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i11;
        int i12;
        this.f38047a = tL_starGiftUnique.f19141id;
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
        this.f38048b = (TL_stars.starGiftAttributeBackdrop) zh.n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f38049c = (TL_stars.starGiftAttributePattern) zh.n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f38048b;
        yh.e1 e1Var = this.e;
        e1Var.d(stargiftattributebackdrop);
        e1Var.e(this.f38049c);
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        this.e.f(z10, z11);
        if (z10) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.z9 z9Var = this.f38050f;
        if (z11) {
            z9Var.animate().scaleX(f7).scaleY(f7).start();
            return;
        }
        z9Var.animate().cancel();
        z9Var.setScaleX(f7);
        z9Var.setScaleY(f7);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.z9 z9Var = this.f38050f;
        if (document == null) {
            z9Var.b();
            this.f38051n = null;
        } else if (this.f38051n == document) {
        } else {
            this.f38051n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            z9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f19543a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.f38047a;
    }
}
