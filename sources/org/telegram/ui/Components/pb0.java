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
public final class pb0 implements View.OnClickListener {
    public final int f27302a;
    public final boolean f27303b;
    public final FrameLayout f27304c;
    public final Object d;
    public final Object e;
    public final Object f27305f;

    public pb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f27302a = i10;
        this.f27304c = frameLayout;
        this.f27303b = z10;
        this.d = obj;
        this.e = obj2;
        this.f27305f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f27302a;
        Object obj = this.f27305f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f27303b;
        FrameLayout frameLayout = this.f27304c;
        switch (i10) {
            case 0:
                cc0 cc0Var = (cc0) frameLayout;
                Context context = (Context) obj3;
                hc0 hc0Var = (hc0) obj2;
                hc0 hc0Var2 = (hc0) obj;
                ic0 ic0Var = cc0Var.f23264c0;
                MessagePreviewParams messagePreviewParams = ic0Var.d;
                if (!z10) {
                    new yc(ic0Var, ic0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new nb0(cc0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                ic0Var.f25079x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (hc0Var != null) {
                        hc0Var.a(false, true);
                    }
                }
                hc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                cc0Var.h();
                cc0Var.k(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                b80 b80Var = (b80) obj;
                cs0 cs0Var = ((xh.o2) frameLayout).f46435a;
                if (!z10) {
                    yh.j5 j5Var = cs0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    j5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    j5Var.a(i11, arrayList);
                    yc.a0(cs0Var.f46504a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    cs0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    yc.a0(cs0Var.f46504a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                b80Var.u();
                cs0Var.n();
                return;
        }
    }
}
