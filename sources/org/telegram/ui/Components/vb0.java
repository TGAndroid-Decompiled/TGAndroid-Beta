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
    public final int f31238a;
    public final boolean f31239b;
    public final FrameLayout f31240c;
    public final Object d;
    public final Object e;
    public final Object f31241f;

    public vb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f31238a = i10;
        this.f31240c = frameLayout;
        this.f31239b = z10;
        this.d = obj;
        this.e = obj2;
        this.f31241f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f31238a;
        Object obj = this.f31241f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f31239b;
        FrameLayout frameLayout = this.f31240c;
        switch (i10) {
            case 0:
                ic0 ic0Var = (ic0) frameLayout;
                Context context = (Context) obj3;
                nc0 nc0Var = (nc0) obj2;
                nc0 nc0Var2 = (nc0) obj;
                oc0 oc0Var = ic0Var.f27192c0;
                MessagePreviewParams messagePreviewParams = oc0Var.d;
                if (!z10) {
                    new xc(oc0Var, oc0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new tb0(ic0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                oc0Var.f28936x = false;
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
                i80 i80Var = (i80) obj;
                is0 is0Var = ((yh.m2) frameLayout).f50419a;
                if (!z10) {
                    ai.v9 v9Var = is0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    v9Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    v9Var.a(i11, arrayList);
                    xc.a0(is0Var.f50517a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, ai.k7.R1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    is0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    xc.a0(is0Var.f50517a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, ai.k7.R1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                i80Var.u();
                is0Var.n();
                return;
        }
    }
}
