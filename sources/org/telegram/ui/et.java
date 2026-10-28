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
public final class et extends org.telegram.ui.Components.mm0 {
    public final ArrayList f38935c;
    public final ht d;

    public et(ht htVar, ArrayList arrayList) {
        this.d = htVar;
        this.f38935c = arrayList;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f38935c.size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        gt gtVar = (gt) e1Var.f47773a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f38935c.get(i10);
        org.telegram.ui.ActionBar.b6 b6Var = gtVar.f39688b;
        org.telegram.ui.Components.y9 y9Var = gtVar.f39687a;
        gtVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            b6Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            y9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        b6Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.y6.f23300a7, 1.0f, 1.0f, gtVar.f39689c);
            if (svgThumb != null) {
                if (closestPhotoSizeWithSize != null) {
                    y9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                } else {
                    y9Var.i(ImageLocation.getForDocument(stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                }
            }
            y9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        y9Var.l(null, null, null, null, null, 0);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        gt gtVar = new gt(viewGroup.getContext(), this.d.f39966c0);
        gtVar.setLayoutParams(new s4.q0(-2, AndroidUtilities.dp(48.0f)));
        return new s4.e1(gtVar);
    }
}
