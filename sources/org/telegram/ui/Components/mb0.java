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
public final class mb0 implements View.OnClickListener {
    public final int f26417a;
    public final boolean f26418b;
    public final FrameLayout f26419c;
    public final Object d;
    public final Object e;
    public final Object f26420f;

    public mb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f26417a = i10;
        this.f26419c = frameLayout;
        this.f26418b = z10;
        this.d = obj;
        this.e = obj2;
        this.f26420f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f26417a;
        Object obj = this.f26420f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f26418b;
        FrameLayout frameLayout = this.f26419c;
        switch (i10) {
            case 0:
                ac0 ac0Var = (ac0) frameLayout;
                Context context = (Context) obj3;
                fc0 fc0Var = (fc0) obj2;
                fc0 fc0Var2 = (fc0) obj;
                gc0 gc0Var = ac0Var.f22625c0;
                MessagePreviewParams messagePreviewParams = gc0Var.d;
                if (!z10) {
                    new xc(gc0Var, gc0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new kb0(ac0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                gc0Var.f24502x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (fc0Var != null) {
                        fc0Var.a(false, true);
                    }
                }
                fc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                ac0Var.h();
                ac0Var.k(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                y70 y70Var = (y70) obj;
                bs0 bs0Var = ((xh.o2) frameLayout).f46368a;
                if (!z10) {
                    yh.k5 k5Var = bs0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    k5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    k5Var.a(i11, arrayList);
                    xc.a0(bs0Var.f46437a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.y3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    bs0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    xc.a0(bs0Var.f46437a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.y3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                y70Var.u();
                bs0Var.n();
                return;
        }
    }
}
