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
public final class xb0 implements View.OnClickListener {
    public final int f32511a;
    public final boolean f32512b;
    public final FrameLayout f32513c;
    public final Object d;
    public final Object e;
    public final Object f32514f;

    public xb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f32511a = i10;
        this.f32513c = frameLayout;
        this.f32512b = z10;
        this.d = obj;
        this.e = obj2;
        this.f32514f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f32511a;
        Object obj = this.f32514f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f32512b;
        FrameLayout frameLayout = this.f32513c;
        switch (i10) {
            case 0:
                lc0 lc0Var = (lc0) frameLayout;
                Context context = (Context) obj3;
                qc0 qc0Var = (qc0) obj2;
                qc0 qc0Var2 = (qc0) obj;
                rc0 rc0Var = lc0Var.f28340c0;
                MessagePreviewParams messagePreviewParams = rc0Var.d;
                if (!z10) {
                    new xc(rc0Var, rc0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new vb0(lc0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                rc0Var.f30151x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (qc0Var != null) {
                        qc0Var.a(false, true);
                    }
                }
                qc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                lc0Var.i();
                lc0Var.l(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                j80 j80Var = (j80) obj;
                ns0 ns0Var = ((yh.l2) frameLayout).f50825a;
                if (!z10) {
                    ai.v9 v9Var = ns0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    v9Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    v9Var.a(i11, arrayList);
                    xc.a0(ns0Var.f50924a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, ai.l7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    ns0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    xc.a0(ns0Var.f50924a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, ai.l7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                j80Var.u();
                ns0Var.n();
                return;
        }
    }
}
