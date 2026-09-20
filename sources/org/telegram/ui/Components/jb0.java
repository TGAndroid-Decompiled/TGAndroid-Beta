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
public final class jb0 implements View.OnClickListener {
    public final int f25331a;
    public final boolean f25332b;
    public final FrameLayout f25333c;
    public final Object d;
    public final Object e;
    public final Object f25334f;

    public jb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f25331a = i10;
        this.f25333c = frameLayout;
        this.f25332b = z10;
        this.d = obj;
        this.e = obj2;
        this.f25334f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f25331a;
        Object obj = this.f25334f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f25332b;
        FrameLayout frameLayout = this.f25333c;
        switch (i10) {
            case 0:
                xb0 xb0Var = (xb0) frameLayout;
                Context context = (Context) obj3;
                cc0 cc0Var = (cc0) obj2;
                cc0 cc0Var2 = (cc0) obj;
                dc0 dc0Var = xb0Var.f30229c0;
                MessagePreviewParams messagePreviewParams = dc0Var.d;
                if (!z10) {
                    new xc(dc0Var, dc0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new hb0(xb0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                dc0Var.f23558x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (cc0Var != null) {
                        cc0Var.a(false, true);
                    }
                }
                cc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                xb0Var.h();
                xb0Var.k(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                v70 v70Var = (v70) obj;
                yr0 yr0Var = ((xh.o2) frameLayout).f46347a;
                if (!z10) {
                    yh.k5 k5Var = yr0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    k5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    k5Var.a(i11, arrayList);
                    xc.a0(yr0Var.f46416a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.y3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    yr0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    xc.a0(yr0Var.f46416a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.y3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                v70Var.u();
                yr0Var.n();
                return;
        }
    }
}
