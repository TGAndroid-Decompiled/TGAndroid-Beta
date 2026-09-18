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
public final class kb0 implements View.OnClickListener {
    public final int f25674a;
    public final boolean f25675b;
    public final FrameLayout f25676c;
    public final Object d;
    public final Object e;
    public final Object f25677f;

    public kb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f25674a = i10;
        this.f25676c = frameLayout;
        this.f25675b = z10;
        this.d = obj;
        this.e = obj2;
        this.f25677f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f25674a;
        Object obj = this.f25677f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f25675b;
        FrameLayout frameLayout = this.f25676c;
        switch (i10) {
            case 0:
                yb0 yb0Var = (yb0) frameLayout;
                Context context = (Context) obj3;
                dc0 dc0Var = (dc0) obj2;
                dc0 dc0Var2 = (dc0) obj;
                ec0 ec0Var = yb0Var.f30537c0;
                MessagePreviewParams messagePreviewParams = ec0Var.d;
                if (!z10) {
                    new xc(ec0Var, ec0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new ib0(yb0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                ec0Var.f23852x = false;
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
                zr0 zr0Var = ((xh.o2) frameLayout).f46300a;
                if (!z10) {
                    yh.k5 k5Var = zr0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    k5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    k5Var.a(i11, arrayList);
                    xc.a0(zr0Var.f46369a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.y3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    zr0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    xc.a0(zr0Var.f46369a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.y3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                w70Var.u();
                zr0Var.n();
                return;
        }
    }
}
