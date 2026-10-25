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
public final class ub0 implements View.OnClickListener {
    public final int f33338a;
    public final boolean f33339b;
    public final FrameLayout f33340c;
    public final Object d;
    public final Object e;
    public final Object f33341f;

    public ub0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f33338a = i10;
        this.f33340c = frameLayout;
        this.f33339b = z10;
        this.d = obj;
        this.e = obj2;
        this.f33341f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f33338a;
        Object obj = this.f33341f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f33339b;
        FrameLayout frameLayout = this.f33340c;
        switch (i10) {
            case 0:
                hc0 hc0Var = (hc0) frameLayout;
                Context context = (Context) obj3;
                mc0 mc0Var = (mc0) obj2;
                mc0 mc0Var2 = (mc0) obj;
                nc0 nc0Var = hc0Var.f28917c0;
                MessagePreviewParams messagePreviewParams = nc0Var.d;
                if (!z10) {
                    new wc(nc0Var, nc0Var.F).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new sb0(hc0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                nc0Var.f30962x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (mc0Var != null) {
                        mc0Var.a(false, true);
                    }
                }
                mc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                hc0Var.i();
                hc0Var.l(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                k80 k80Var = (k80) obj;
                vs0 vs0Var = ((zh.m2) frameLayout).f53140a;
                if (!z10) {
                    bi.q9 q9Var = vs0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    q9Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    q9Var.a(i11, arrayList);
                    wc.b0(vs0Var.f53227a).S(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, bi.h7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    vs0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    wc.b0(vs0Var.f53227a).S(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, bi.h7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                k80Var.u();
                vs0Var.o();
                return;
        }
    }
}
