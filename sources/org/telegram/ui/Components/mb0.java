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
public final class mb0 implements View.OnClickListener {
    public final int f26423a;
    public final boolean f26424b;
    public final FrameLayout f26425c;
    public final Object d;
    public final Object e;
    public final Object f26426f;

    public mb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f26423a = i10;
        this.f26425c = frameLayout;
        this.f26424b = z10;
        this.d = obj;
        this.e = obj2;
        this.f26426f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f26423a;
        Object obj = this.f26426f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f26424b;
        FrameLayout frameLayout = this.f26425c;
        switch (i10) {
            case 0:
                zb0 zb0Var = (zb0) frameLayout;
                Context context = (Context) obj3;
                ec0 ec0Var = (ec0) obj2;
                ec0 ec0Var2 = (ec0) obj;
                fc0 fc0Var = zb0Var.f30840c0;
                MessagePreviewParams messagePreviewParams = fc0Var.d;
                if (!z10) {
                    new xc(fc0Var, fc0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new kb0(zb0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                fc0Var.f24148x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (ec0Var != null) {
                        ec0Var.a(false, true);
                    }
                }
                ec0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                zb0Var.h();
                zb0Var.k(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                y70 y70Var = (y70) obj;
                zr0 zr0Var = ((xh.o2) frameLayout).f46328a;
                if (!z10) {
                    yh.j5 j5Var = zr0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    j5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    j5Var.a(i11, arrayList);
                    xc.a0(zr0Var.f46397a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    zr0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    xc.a0(zr0Var.f46397a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                y70Var.u();
                zr0Var.n();
                return;
        }
    }
}
