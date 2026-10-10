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
public final class dc0 implements View.OnClickListener {
    public final int f25642a;
    public final boolean f25643b;
    public final FrameLayout f25644c;
    public final Object d;
    public final Object f25645e;
    public final Object f25646f;

    public dc0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f25642a = i10;
        this.f25644c = frameLayout;
        this.f25643b = z10;
        this.d = obj;
        this.f25645e = obj2;
        this.f25646f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f25642a;
        Object obj = this.f25646f;
        Object obj2 = this.f25645e;
        Object obj3 = this.d;
        boolean z10 = this.f25643b;
        FrameLayout frameLayout = this.f25644c;
        switch (i10) {
            case 0:
                qc0 qc0Var = (qc0) frameLayout;
                Context context = (Context) obj3;
                vc0 vc0Var = (vc0) obj2;
                vc0 vc0Var2 = (vc0) obj;
                wc0 wc0Var = qc0Var.f30183c0;
                MessagePreviewParams messagePreviewParams = wc0Var.d;
                if (!z10) {
                    new ad(wc0Var, wc0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new bc0(qc0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                wc0Var.f32652x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (vc0Var != null) {
                        vc0Var.a(false, true);
                    }
                }
                vc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                qc0Var.h();
                qc0Var.k(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                q80 q80Var = (q80) obj;
                ss0 ss0Var = ((xh.o2) frameLayout).f51479a;
                if (!z10) {
                    yh.d5 d5Var = ss0Var.f51558e;
                    int i11 = tL_starGiftCollection.collection_id;
                    d5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    d5Var.a(i11, arrayList);
                    ad.a0(ss0Var.f51555a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.s3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    ss0Var.f51558e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    ad.a0(ss0Var.f51555a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.s3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                q80Var.u();
                ss0Var.n();
                return;
        }
    }
}
