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
public final class pt extends org.telegram.ui.Components.kl0 {
    public final ArrayList f39631c;
    public final st d;

    public pt(st stVar, ArrayList arrayList) {
        this.d = stVar;
        this.f39631c = arrayList;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f39631c.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        rt rtVar = (rt) c1Var.f45738a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f39631c.get(i10);
        org.telegram.ui.ActionBar.j5 j5Var = rtVar.f40232b;
        org.telegram.ui.Components.x9 x9Var = rtVar.f40231a;
        rtVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            j5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            x9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        j5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.j6.f20607a7, 1.0f, 1.0f, rtVar.f40233c);
            if (svgThumb != null) {
                if (closestPhotoSizeWithSize != null) {
                    x9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                } else {
                    x9Var.i(ImageLocation.getForDocument(stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                }
            }
            x9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        x9Var.l(null, null, null, null, null, 0);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        rt rtVar = new rt(viewGroup.getContext(), this.d.f40529c0);
        rtVar.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(48.0f)));
        return new s4.c1(rtVar);
    }
}
