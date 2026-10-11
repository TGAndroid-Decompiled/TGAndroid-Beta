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
public final class nt extends org.telegram.ui.Components.qm0 {
    public final ArrayList f40387c;
    public final qt d;

    public nt(qt qtVar, ArrayList arrayList) {
        this.d = qtVar;
        this.f40387c = arrayList;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f40387c.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        pt ptVar = (pt) d1Var.f47782a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f40387c.get(i10);
        org.telegram.ui.ActionBar.h5 h5Var = ptVar.f40989b;
        org.telegram.ui.Components.y9 y9Var = ptVar.f40988a;
        ptVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            h5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            y9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        h5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.h6.f20766a7, 1.0f, 1.0f, ptVar.f40990c);
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
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        pt ptVar = new pt(viewGroup.getContext(), this.d.f41269c0);
        ptVar.setLayoutParams(new s4.q0(-2, AndroidUtilities.dp(48.0f)));
        return new s4.d1(ptVar);
    }
}
