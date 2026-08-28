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
public final class et extends org.telegram.ui.Components.vk0 {
    public final ArrayList f38023c;
    public final ht d;

    public et(ht htVar, ArrayList arrayList) {
        this.d = htVar;
        this.f38023c = arrayList;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f38023c.size();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        gt gtVar = (gt) q1Var.f5501a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f38023c.get(i9);
        org.telegram.ui.ActionBar.h5 h5Var = gtVar.f38602b;
        org.telegram.ui.Components.o9 o9Var = gtVar.f38601a;
        gtVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            h5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            o9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        h5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.f6.f22947a7, 1.0f, 1.0f, gtVar.f38603c);
            if (svgThumb != null) {
                if (closestPhotoSizeWithSize != null) {
                    o9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                } else {
                    o9Var.i(ImageLocation.getForDocument(stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                }
            }
            o9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        o9Var.l(null, null, null, null, null, 0);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        gt gtVar = new gt(viewGroup.getContext(), this.d.f38914c0);
        gtVar.setLayoutParams(new f2.a1(-2, AndroidUtilities.dp(48.0f)));
        return new f2.q1(gtVar);
    }
}
