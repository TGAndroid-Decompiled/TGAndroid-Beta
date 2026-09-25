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
public final class kt extends org.telegram.ui.Components.vl0 {
    public final ArrayList f35169c;
    public final nt d;

    public kt(nt ntVar, ArrayList arrayList) {
        this.d = ntVar;
        this.f35169c = arrayList;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f35169c.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        mt mtVar = (mt) c1Var.f42961a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f35169c.get(i10);
        org.telegram.ui.ActionBar.h5 h5Var = mtVar.f35665b;
        org.telegram.ui.Components.w9 w9Var = mtVar.f35664a;
        mtVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            h5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            w9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        h5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.h6.f19004a7, 1.0f, 1.0f, mtVar.f35666c);
            if (svgThumb != null) {
                if (closestPhotoSizeWithSize != null) {
                    w9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                } else {
                    w9Var.i(ImageLocation.getForDocument(stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                }
            }
            w9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        w9Var.l(null, null, null, null, null, 0);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        mt mtVar = new mt(viewGroup.getContext(), this.d.f35978c0);
        mtVar.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(48.0f)));
        return new s4.c1(mtVar);
    }
}
