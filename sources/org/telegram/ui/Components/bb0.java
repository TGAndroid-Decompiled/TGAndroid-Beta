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
public final class bb0 implements View.OnClickListener {
    public final int f22696a;
    public final boolean f22697b;
    public final FrameLayout f22698c;
    public final Object d;
    public final Object e;
    public final Object f22699f;

    public bb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f22696a = i10;
        this.f22698c = frameLayout;
        this.f22697b = z10;
        this.d = obj;
        this.e = obj2;
        this.f22699f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f22696a;
        Object obj = this.f22699f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f22697b;
        FrameLayout frameLayout = this.f22698c;
        switch (i10) {
            case 0:
                pb0 pb0Var = (pb0) frameLayout;
                Context context = (Context) obj3;
                ub0 ub0Var = (ub0) obj2;
                ub0 ub0Var2 = (ub0) obj;
                vb0 vb0Var = pb0Var.f26991c0;
                MessagePreviewParams messagePreviewParams = vb0Var.d;
                if (!z10) {
                    new vc(vb0Var, vb0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new za0(pb0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                vb0Var.f28682x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (ub0Var != null) {
                        ub0Var.a(false, true);
                    }
                }
                ub0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                pb0Var.h();
                pb0Var.k(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                n70 n70Var = (n70) obj;
                or0 or0Var = ((xh.n2) frameLayout).f46062a;
                if (!z10) {
                    yh.m5 m5Var = or0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    m5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    m5Var.a(i11, arrayList);
                    vc.a0(or0Var.f46133a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.a4.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    or0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    vc.a0(or0Var.f46133a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.a4.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                n70Var.u();
                or0Var.n();
                return;
        }
    }
}
