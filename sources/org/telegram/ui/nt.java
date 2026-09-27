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
public final class nt extends org.telegram.ui.Components.xl0 {
    public final ArrayList f36083c;
    public final qt d;

    public nt(qt qtVar, ArrayList arrayList) {
        this.d = qtVar;
        this.f36083c = arrayList;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f36083c.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        pt ptVar = (pt) c1Var.f43005a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f36083c.get(i10);
        org.telegram.ui.ActionBar.j5 j5Var = ptVar.f36542b;
        org.telegram.ui.Components.w9 w9Var = ptVar.f36541a;
        ptVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            j5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            w9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        j5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.i6.f19001a7, 1.0f, 1.0f, ptVar.f36543c);
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
        pt ptVar = new pt(viewGroup.getContext(), this.d.f36888c0);
        ptVar.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(48.0f)));
        return new s4.c1(ptVar);
    }
}
