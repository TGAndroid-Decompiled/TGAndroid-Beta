package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class gc0 implements View.OnClickListener {
    public final int f26385a;
    public final boolean f26386b;
    public final FrameLayout f26387c;
    public final Object d;
    public final Object f26388e;
    public final Object f26389f;

    public gc0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f26385a = i10;
        this.f26387c = frameLayout;
        this.f26386b = z10;
        this.d = obj;
        this.f26388e = obj2;
        this.f26389f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f26385a;
        Object obj = this.f26389f;
        Object obj2 = this.f26388e;
        Object obj3 = this.d;
        boolean z10 = this.f26386b;
        FrameLayout frameLayout = this.f26387c;
        switch (i10) {
            case 0:
                tc0 tc0Var = (tc0) frameLayout;
                Context context = (Context) obj3;
                yc0 yc0Var = (yc0) obj2;
                yc0 yc0Var2 = (yc0) obj;
                zc0 zc0Var = tc0Var.f30856c0;
                MessagePreviewParams messagePreviewParams = zc0Var.d;
                if (!z10) {
                    new zc(zc0Var, zc0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new ec0(tc0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                zc0Var.f33333x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (yc0Var != null) {
                        yc0Var.a(false, true);
                    }
                }
                yc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                tc0Var.h();
                tc0Var.k(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                s80 s80Var = (s80) obj;
                xs0 xs0Var = ((xh.n2) frameLayout).f51622a;
                if (!z10) {
                    yh.d5 d5Var = xs0Var.f51724e;
                    int i11 = tL_starGiftCollection.collection_id;
                    d5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    d5Var.a(i11, arrayList);
                    zc.a0(xs0Var.f51721a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.s3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    xs0Var.f51724e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    zc.a0(xs0Var.f51721a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.s3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                s80Var.u();
                xs0Var.n();
                return;
        }
    }
}
