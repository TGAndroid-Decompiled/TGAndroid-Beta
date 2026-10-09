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
public final class cc0 implements View.OnClickListener {
    public final int f25322a;
    public final boolean f25323b;
    public final FrameLayout f25324c;
    public final Object d;
    public final Object f25325e;
    public final Object f25326f;

    public cc0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f25322a = i10;
        this.f25324c = frameLayout;
        this.f25323b = z10;
        this.d = obj;
        this.f25325e = obj2;
        this.f25326f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f25322a;
        Object obj = this.f25326f;
        Object obj2 = this.f25325e;
        Object obj3 = this.d;
        boolean z10 = this.f25323b;
        FrameLayout frameLayout = this.f25324c;
        switch (i10) {
            case 0:
                pc0 pc0Var = (pc0) frameLayout;
                Context context = (Context) obj3;
                uc0 uc0Var = (uc0) obj2;
                uc0 uc0Var2 = (uc0) obj;
                vc0 vc0Var = pc0Var.f29845c0;
                MessagePreviewParams messagePreviewParams = vc0Var.d;
                if (!z10) {
                    new ad(vc0Var, vc0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new ac0(pc0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                vc0Var.f31756x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (uc0Var != null) {
                        uc0Var.a(false, true);
                    }
                }
                uc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                pc0Var.h();
                pc0Var.k(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                p80 p80Var = (p80) obj;
                rs0 rs0Var = ((xh.o2) frameLayout).f51435a;
                if (!z10) {
                    yh.d5 d5Var = rs0Var.f51514e;
                    int i11 = tL_starGiftCollection.collection_id;
                    d5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    d5Var.a(i11, arrayList);
                    ad.a0(rs0Var.f51511a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.s3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    rs0Var.f51514e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    ad.a0(rs0Var.f51511a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.s3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                p80Var.u();
                rs0Var.n();
                return;
        }
    }
}
