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

public final class gt extends org.telegram.ui.Components.yk0 {

    public final ArrayList f38471c;
    public final kt d;

    public gt(kt ktVar, ArrayList arrayList) {
        this.d = ktVar;
        this.f38471c = arrayList;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f38471c.size();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        jt jtVar = (jt) o1Var.f5789a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f38471c.get(i10);
        org.telegram.ui.ActionBar.h5 h5Var = jtVar.f39497b;
        org.telegram.ui.Components.n9 n9Var = jtVar.f39496a;
        jtVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            h5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            n9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        h5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            n9Var.l(null, null, null, null, null, 0);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.g6.f22999a7, 1.0f, 1.0f, jtVar.f39498c);
        if (svgThumb == null) {
            n9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
        } else if (closestPhotoSizeWithSize != null) {
            n9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
        } else {
            n9Var.i(ImageLocation.getForDocument(stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        jt jtVar = new jt(viewGroup.getContext(), this.d.f39859c0);
        jtVar.setLayoutParams(new f2.y0(-2, AndroidUtilities.dp(48.0f)));
        return new org.telegram.ui.Components.lk0(jtVar);
    }
}
