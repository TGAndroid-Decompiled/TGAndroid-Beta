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
public final class et extends org.telegram.ui.Components.km0 {
    public final ArrayList f36996c;
    public final ht d;

    public et(ht htVar, ArrayList arrayList) {
        this.d = htVar;
        this.f36996c = arrayList;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f36996c.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        gt gtVar = (gt) b1Var.f46342a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f36996c.get(i10);
        org.telegram.ui.ActionBar.n5 n5Var = gtVar.f37653b;
        org.telegram.ui.Components.u9 u9Var = gtVar.f37652a;
        gtVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            n5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            u9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        n5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.k6.f21126a7, 1.0f, 1.0f, gtVar.f37654c);
            if (svgThumb != null) {
                if (closestPhotoSizeWithSize != null) {
                    u9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                } else {
                    u9Var.i(ImageLocation.getForDocument(stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                }
            }
            u9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        u9Var.l(null, null, null, null, null, 0);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        gt gtVar = new gt(viewGroup.getContext(), this.d.f37988c0);
        gtVar.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(48.0f)));
        return new s4.b1(gtVar);
    }
}
