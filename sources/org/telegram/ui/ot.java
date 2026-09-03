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
public final class ot extends org.telegram.ui.Components.ql0 {
    public final ArrayList f36879c;
    public final rt d;

    public ot(rt rtVar, ArrayList arrayList) {
        this.d = rtVar;
        this.f36879c = arrayList;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f36879c.size();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        qt qtVar = (qt) l1Var.f5774a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f36879c.get(i10);
        org.telegram.ui.ActionBar.k5 k5Var = qtVar.f37477b;
        org.telegram.ui.Components.p9 p9Var = qtVar.f37476a;
        qtVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            k5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            p9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        k5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.j6.f19827a7, 1.0f, 1.0f, qtVar.f37478c);
            if (svgThumb != null) {
                if (closestPhotoSizeWithSize != null) {
                    p9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                } else {
                    p9Var.i(ImageLocation.getForDocument(stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                }
            }
            p9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        p9Var.l(null, null, null, null, null, 0);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        qt qtVar = new qt(viewGroup.getContext(), this.d.f38032c0);
        qtVar.setLayoutParams(new f2.w0(-2, AndroidUtilities.dp(48.0f)));
        return new f2.l1(qtVar);
    }
}
