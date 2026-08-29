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
public final class et extends org.telegram.ui.Components.il0 {
    public final ArrayList f37900c;
    public final ht d;

    public et(ht htVar, ArrayList arrayList) {
        this.d = htVar;
        this.f37900c = arrayList;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f37900c.size();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        gt gtVar = (gt) n1Var.f6432a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f37900c.get(i10);
        org.telegram.ui.ActionBar.h5 h5Var = gtVar.f38658b;
        org.telegram.ui.Components.t9 t9Var = gtVar.f38657a;
        gtVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            h5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            t9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        h5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.g6.f23009a7, 1.0f, 1.0f, gtVar.f38659c);
            if (svgThumb != null) {
                if (closestPhotoSizeWithSize != null) {
                    t9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                } else {
                    t9Var.i(ImageLocation.getForDocument(stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                }
            }
            t9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        t9Var.l(null, null, null, null, null, 0);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        gt gtVar = new gt(viewGroup.getContext(), this.d.f39023c0);
        gtVar.setLayoutParams(new f2.x0(-2, AndroidUtilities.dp(48.0f)));
        return new f2.n1(gtVar);
    }
}
