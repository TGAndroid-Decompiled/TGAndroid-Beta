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
public final class ob0 implements View.OnClickListener {
    public final int f29328a;
    public final boolean f29329b;
    public final FrameLayout f29330c;
    public final Object d;
    public final Object f29331e;
    public final Object f29332f;

    public ob0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f29328a = i10;
        this.f29330c = frameLayout;
        this.f29329b = z10;
        this.d = obj;
        this.f29331e = obj2;
        this.f29332f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f29328a;
        Object obj = this.f29332f;
        Object obj2 = this.f29331e;
        Object obj3 = this.d;
        boolean z10 = this.f29329b;
        FrameLayout frameLayout = this.f29330c;
        switch (i10) {
            case 0:
                cc0 cc0Var = (cc0) frameLayout;
                Context context = (Context) obj3;
                hc0 hc0Var = (hc0) obj2;
                hc0 hc0Var2 = (hc0) obj;
                ic0 ic0Var = cc0Var.f25326c0;
                MessagePreviewParams messagePreviewParams = ic0Var.d;
                if (!z10) {
                    new yc(ic0Var, ic0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new mb0(cc0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                ic0Var.f27370x = false;
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
                fs0 fs0Var = ((xh.o2) frameLayout).f50152a;
                if (!z10) {
                    yh.j5 j5Var = fs0Var.f50228e;
                    int i11 = tL_starGiftCollection.collection_id;
                    j5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    j5Var.a(i11, arrayList);
                    yc.a0(fs0Var.f50225a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    fs0Var.f50228e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    yc.a0(fs0Var.f50225a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                b80Var.u();
                fs0Var.n();
                return;
        }
    }
}
