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
public final class lb0 implements View.OnClickListener {
    public final int f24929a;
    public final boolean f24930b;
    public final FrameLayout f24931c;
    public final Object d;
    public final Object e;
    public final Object f24932f;

    public lb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f24929a = i10;
        this.f24931c = frameLayout;
        this.f24930b = z10;
        this.d = obj;
        this.e = obj2;
        this.f24932f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f24929a;
        Object obj = this.f24932f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f24930b;
        FrameLayout frameLayout = this.f24931c;
        switch (i10) {
            case 0:
                yb0 yb0Var = (yb0) frameLayout;
                Context context = (Context) obj3;
                dc0 dc0Var = (dc0) obj2;
                dc0 dc0Var2 = (dc0) obj;
                ec0 ec0Var = yb0Var.f29295c0;
                MessagePreviewParams messagePreviewParams = ec0Var.d;
                if (!z10) {
                    new wc(ec0Var, ec0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new jb0(yb0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                ec0Var.f22669x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (dc0Var != null) {
                        dc0Var.a(false, true);
                    }
                }
                dc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                yb0Var.h();
                yb0Var.k(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                w70 w70Var = (w70) obj;
                wr0 wr0Var = ((wh.m2) frameLayout).f44246a;
                if (!z10) {
                    xh.l5 l5Var = wr0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    l5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    l5Var.a(i11, arrayList);
                    wc.a0(wr0Var.f44317a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, xh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    wr0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    wc.a0(wr0Var.f44317a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, xh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                w70Var.u();
                wr0Var.n();
                return;
        }
    }
}
