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
    public final int f27016a;
    public final boolean f27017b;
    public final FrameLayout f27018c;
    public final Object d;
    public final Object e;
    public final Object f27019f;

    public ob0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f27016a = i10;
        this.f27018c = frameLayout;
        this.f27017b = z10;
        this.d = obj;
        this.e = obj2;
        this.f27019f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f27016a;
        Object obj = this.f27019f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f27017b;
        FrameLayout frameLayout = this.f27018c;
        switch (i10) {
            case 0:
                bc0 bc0Var = (bc0) frameLayout;
                Context context = (Context) obj3;
                gc0 gc0Var = (gc0) obj2;
                gc0 gc0Var2 = (gc0) obj;
                hc0 hc0Var = bc0Var.f22950c0;
                MessagePreviewParams messagePreviewParams = hc0Var.d;
                if (!z10) {
                    new xc(hc0Var, hc0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new mb0(bc0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                hc0Var.f24779x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (gc0Var != null) {
                        gc0Var.a(false, true);
                    }
                }
                gc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                bc0Var.h();
                bc0Var.k(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                a80 a80Var = (a80) obj;
                bs0 bs0Var = ((xh.o2) frameLayout).f46327a;
                if (!z10) {
                    yh.j5 j5Var = bs0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    j5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    j5Var.a(i11, arrayList);
                    xc.a0(bs0Var.f46396a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    bs0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    xc.a0(bs0Var.f46396a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                a80Var.u();
                bs0Var.n();
                return;
        }
    }
}
