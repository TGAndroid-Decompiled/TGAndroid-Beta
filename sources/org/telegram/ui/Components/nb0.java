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
public final class nb0 implements View.OnClickListener {
    public final int f26743a;
    public final boolean f26744b;
    public final FrameLayout f26745c;
    public final Object d;
    public final Object e;
    public final Object f26746f;

    public nb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f26743a = i10;
        this.f26745c = frameLayout;
        this.f26744b = z10;
        this.d = obj;
        this.e = obj2;
        this.f26746f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f26743a;
        Object obj = this.f26746f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f26744b;
        FrameLayout frameLayout = this.f26745c;
        switch (i10) {
            case 0:
                ac0 ac0Var = (ac0) frameLayout;
                Context context = (Context) obj3;
                fc0 fc0Var = (fc0) obj2;
                fc0 fc0Var2 = (fc0) obj;
                gc0 gc0Var = ac0Var.f22606c0;
                MessagePreviewParams messagePreviewParams = gc0Var.d;
                if (!z10) {
                    new xc(gc0Var, gc0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new lb0(ac0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                gc0Var.f24470x = false;
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
                z70 z70Var = (z70) obj;
                as0 as0Var = ((xh.o2) frameLayout).f46326a;
                if (!z10) {
                    yh.j5 j5Var = as0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    j5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    j5Var.a(i11, arrayList);
                    xc.a0(as0Var.f46395a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    as0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    xc.a0(as0Var.f46395a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                z70Var.u();
                as0Var.n();
                return;
        }
    }
}
