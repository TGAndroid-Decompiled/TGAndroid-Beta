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
public final class dt extends org.telegram.ui.Components.hm0 {
    public final ArrayList f36319c;
    public final gt d;

    public dt(gt gtVar, ArrayList arrayList) {
        this.d = gtVar;
        this.f36319c = arrayList;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f36319c.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        ft ftVar = (ft) b1Var.f45938a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f36319c.get(i10);
        org.telegram.ui.ActionBar.j5 j5Var = ftVar.f37038b;
        org.telegram.ui.Components.w9 w9Var = ftVar.f37037a;
        ftVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            j5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            w9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        j5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.h6.f20928a7, 1.0f, 1.0f, ftVar.f37039c);
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
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ft ftVar = new ft(viewGroup.getContext(), this.d.f37314c0);
        ftVar.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(48.0f)));
        return new s4.b1(ftVar);
    }
}
