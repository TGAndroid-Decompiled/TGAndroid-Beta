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
public final class vb0 implements View.OnClickListener {
    public final int f33659a;
    public final boolean f33660b;
    public final FrameLayout f33661c;
    public final Object d;
    public final Object e;
    public final Object f33662f;

    public vb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f33659a = i10;
        this.f33661c = frameLayout;
        this.f33660b = z10;
        this.d = obj;
        this.e = obj2;
        this.f33662f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f33659a;
        Object obj = this.f33662f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f33660b;
        FrameLayout frameLayout = this.f33661c;
        switch (i10) {
            case 0:
                ic0 ic0Var = (ic0) frameLayout;
                Context context = (Context) obj3;
                nc0 nc0Var = (nc0) obj2;
                nc0 nc0Var2 = (nc0) obj;
                oc0 oc0Var = ic0Var.f29306c0;
                MessagePreviewParams messagePreviewParams = oc0Var.d;
                if (!z10) {
                    new wc(oc0Var, oc0Var.F).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new tb0(ic0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                oc0Var.f31271x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (nc0Var != null) {
                        nc0Var.a(false, true);
                    }
                }
                nc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                ic0Var.i();
                ic0Var.l(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                l80 l80Var = (l80) obj;
                ws0 ws0Var = ((zh.m2) frameLayout).f53201a;
                if (!z10) {
                    bi.q9 q9Var = ws0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    q9Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    q9Var.a(i11, arrayList);
                    wc.b0(ws0Var.f53288a).S(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, bi.h7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    ws0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    wc.b0(ws0Var.f53288a).S(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, bi.h7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                l80Var.u();
                ws0Var.o();
                return;
        }
    }
}
