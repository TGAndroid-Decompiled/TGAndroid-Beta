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
public final class mt extends org.telegram.ui.Components.ll0 {
    public final ArrayList f35385c;
    public final pt d;

    public mt(pt ptVar, ArrayList arrayList) {
        this.d = ptVar;
        this.f35385c = arrayList;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f35385c.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        ot otVar = (ot) c1Var.f42627a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f35385c.get(i10);
        org.telegram.ui.ActionBar.i5 i5Var = otVar.f35954b;
        org.telegram.ui.Components.w9 w9Var = otVar.f35953a;
        otVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            i5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            w9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        i5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.h6.f18733a7, 1.0f, 1.0f, otVar.f35955c);
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
        ot otVar = new ot(viewGroup.getContext(), this.d.f36185c0);
        otVar.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(48.0f)));
        return new s4.c1(otVar);
    }
}
