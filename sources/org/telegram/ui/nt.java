package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
public final class nt extends org.telegram.ui.Components.rl0 {
    public final ArrayList f39449c;
    public final qt d;

    public nt(qt qtVar, ArrayList arrayList) {
        this.d = qtVar;
        this.f39449c = arrayList;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f39449c.size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        pt ptVar = (pt) m1Var.f5875a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f39449c.get(i10);
        org.telegram.ui.ActionBar.l5 l5Var = ptVar.f40124b;
        org.telegram.ui.Components.p9 p9Var = ptVar.f40123a;
        ptVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            l5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            p9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        l5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.k6.f21607a7, 1.0f, 1.0f, ptVar.f40125c);
            if (svgThumb != null) {
                if (closestPhotoSizeWithSize != null) {
                    p9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                } else {
                    p9Var.i(ImageLocation.getForDocument(stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                }
            }
            p9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        p9Var.l(null, null, null, null, null, 0);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        pt ptVar = new pt(viewGroup.getContext(), this.d.f40648c0);
        ptVar.setLayoutParams(new f2.x0(-2, AndroidUtilities.dp(48.0f)));
        return new f2.m1(ptVar);
    }
}
