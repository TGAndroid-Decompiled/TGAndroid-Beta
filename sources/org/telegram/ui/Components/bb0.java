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
    public final int f22667a;
    public final boolean f22668b;
    public final FrameLayout f22669c;
    public final Object d;
    public final Object e;
    public final Object f22670f;

    public bb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f22667a = i10;
        this.f22669c = frameLayout;
        this.f22668b = z10;
        this.d = obj;
        this.e = obj2;
        this.f22670f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f22667a;
        Object obj = this.f22670f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f22668b;
        FrameLayout frameLayout = this.f22669c;
        switch (i10) {
            case 0:
                ob0 ob0Var = (ob0) frameLayout;
                Context context = (Context) obj3;
                tb0 tb0Var = (tb0) obj2;
                tb0 tb0Var2 = (tb0) obj;
                ub0 ub0Var = ob0Var.f26708c0;
                MessagePreviewParams messagePreviewParams = ub0Var.d;
                if (!z10) {
                    new xc(ub0Var, ub0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new za0(ob0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                ub0Var.f28456x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (tb0Var != null) {
                        tb0Var.a(false, true);
                    }
                }
                tb0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                ob0Var.h();
                ob0Var.k(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                o70 o70Var = (o70) obj;
                nr0 nr0Var = ((xh.o2) frameLayout).f45999a;
                if (!z10) {
                    yh.k5 k5Var = nr0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    k5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    k5Var.a(i11, arrayList);
                    xc.a0(nr0Var.f46068a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.y3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    nr0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    xc.a0(nr0Var.f46068a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.y3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                o70Var.u();
                nr0Var.n();
                return;
        }
    }
}
