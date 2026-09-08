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
public final class cb0 implements View.OnClickListener {
    public final int f24987a;
    public final boolean f24988b;
    public final FrameLayout f24989c;
    public final Object d;
    public final Object f24990e;
    public final Object f24991f;

    public cb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f24987a = i10;
        this.f24989c = frameLayout;
        this.f24988b = z10;
        this.d = obj;
        this.f24990e = obj2;
        this.f24991f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f24987a;
        Object obj = this.f24991f;
        Object obj2 = this.f24990e;
        Object obj3 = this.d;
        boolean z10 = this.f24988b;
        FrameLayout frameLayout = this.f24989c;
        switch (i10) {
            case 0:
                qb0 qb0Var = (qb0) frameLayout;
                Context context = (Context) obj3;
                vb0 vb0Var = (vb0) obj2;
                vb0 vb0Var2 = (vb0) obj;
                wb0 wb0Var = qb0Var.f29689c0;
                MessagePreviewParams messagePreviewParams = wb0Var.d;
                if (!z10) {
                    new yc(wb0Var, wb0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new ab0(qb0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                wb0Var.f32260x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (vb0Var != null) {
                        vb0Var.a(false, true);
                    }
                }
                vb0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                qb0Var.h();
                qb0Var.k(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                n70 n70Var = (n70) obj;
                nr0 nr0Var = ((yh.m2) frameLayout).f50468a;
                if (!z10) {
                    zh.i5 i5Var = nr0Var.f50547e;
                    int i11 = tL_starGiftCollection.collection_id;
                    i5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    i5Var.a(i11, arrayList);
                    yc.a0(nr0Var.f50544a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, zh.w3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    nr0Var.f50547e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    yc.a0(nr0Var.f50544a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, zh.w3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                n70Var.u();
                nr0Var.n();
                return;
        }
    }
}
