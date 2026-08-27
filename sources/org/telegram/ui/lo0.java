package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class lo0 extends FrameLayout {

    public long f40165a;

    public TL_stars.starGiftAttributeBackdrop f40166b;

    public TL_stars.starGiftAttributePattern f40167c;
    public final FrameLayout d;

    public final gh.y1 f40168e;

    public final org.telegram.ui.Components.n9 f40169f;
    public final gh.c2 h;

    public TLRPC.Document f40170n;

    public lo0(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        gh.y1 y1Var = new gh.y1(frameLayout, c6Var, false);
        this.f40168e = y1Var;
        frameLayout.setBackground(y1Var);
        addView(frameLayout, h7.z5.e(-1, -1, 119));
        h7.b6.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f40169f = n9Var;
        frameLayout.addView(n9Var, h7.z5.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (!z10) {
            this.h = null;
            return;
        }
        gh.c2 c2Var = new gh.c2(context);
        this.h = c2Var;
        addView(c2Var, h7.z5.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
    }

    public final void a(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.f40165a = tL_starGiftUnique.f22607id;
        boolean z10 = i10 % 3 == 1;
        setPadding(z10 ? AndroidUtilities.dp(4.0f) : 0, 0, z10 ? AndroidUtilities.dp(4.0f) : 0, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.f40166b = (TL_stars.starGiftAttributeBackdrop) hh.u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f40167c = (TL_stars.starGiftAttributePattern) hh.u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f40166b;
        gh.y1 y1Var = this.f40168e;
        y1Var.d(stargiftattributebackdrop);
        y1Var.e(this.f40167c);
    }

    public final void b(boolean z10, boolean z11) {
        this.f40168e.f(z10, z11);
        float f10 = z10 ? 0.9f : 1.0f;
        org.telegram.ui.Components.n9 n9Var = this.f40169f;
        if (z11) {
            n9Var.animate().scaleX(f10).scaleY(f10).start();
            return;
        }
        n9Var.animate().cancel();
        n9Var.setScaleX(f10);
        n9Var.setScaleY(f10);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.n9 n9Var = this.f40169f;
        if (document == null) {
            n9Var.b();
            this.f40170n = null;
        } else {
            if (this.f40170n == document) {
                return;
            }
            this.f40170n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            n9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f22999a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.f40165a;
    }
}
