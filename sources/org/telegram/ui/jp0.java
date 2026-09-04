package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class jp0 extends FrameLayout {
    public long f37826a;
    public TL_stars.starGiftAttributeBackdrop f37827b;
    public TL_stars.starGiftAttributePattern f37828c;
    public final FrameLayout d;
    public final yh.e1 f37829e;
    public final org.telegram.ui.Components.x9 f37830f;
    public final yh.i1 h;
    public TLRPC.Document f37831n;

    public jp0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        yh.e1 e1Var = new yh.e1(frameLayout, f6Var, false);
        this.f37829e = e1Var;
        frameLayout.setBackground(e1Var);
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        w7.z5.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.f37830f = x9Var;
        frameLayout.addView(x9Var, w7.x5.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z10) {
            yh.i1 i1Var = new yh.i1(context);
            this.h = i1Var;
            addView(i1Var, w7.x5.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            return;
        }
        this.h = null;
    }

    public final void a(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i11;
        int i12;
        this.f37826a = tL_starGiftUnique.f20097id;
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
        this.f37827b = (TL_stars.starGiftAttributeBackdrop) zh.s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f37828c = (TL_stars.starGiftAttributePattern) zh.s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f37827b;
        yh.e1 e1Var = this.f37829e;
        e1Var.d(stargiftattributebackdrop);
        e1Var.e(this.f37828c);
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        this.f37829e.f(z10, z11);
        if (z10) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.x9 x9Var = this.f37830f;
        if (z11) {
            x9Var.animate().scaleX(f7).scaleY(f7).start();
            return;
        }
        x9Var.animate().cancel();
        x9Var.setScaleX(f7);
        x9Var.setScaleY(f7);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.x9 x9Var = this.f37830f;
        if (document == null) {
            x9Var.b();
            this.f37831n = null;
        } else if (this.f37831n == document) {
        } else {
            this.f37831n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            x9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.f20607a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.f37826a;
    }
}
