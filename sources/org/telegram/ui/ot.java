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
public final class ot extends org.telegram.ui.Components.pm0 {
    public final ArrayList f40598c;
    public final rt d;

    public ot(rt rtVar, ArrayList arrayList) {
        this.d = rtVar;
        this.f40598c = arrayList;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f40598c.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        qt qtVar = (qt) d1Var.f47658a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f40598c.get(i10);
        org.telegram.ui.ActionBar.j5 j5Var = qtVar.f41184b;
        org.telegram.ui.Components.y9 y9Var = qtVar.f41183a;
        qtVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            j5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            y9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        j5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.i6.f20741a7, 1.0f, 1.0f, qtVar.f41185c);
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
        qt qtVar = new qt(viewGroup.getContext(), this.d.f41489c0);
        qtVar.setLayoutParams(new s4.q0(-2, AndroidUtilities.dp(48.0f)));
        return new s4.d1(qtVar);
    }
}
