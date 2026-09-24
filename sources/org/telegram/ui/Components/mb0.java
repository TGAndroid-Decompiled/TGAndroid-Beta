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
    public final int f26415a;
    public final boolean f26416b;
    public final FrameLayout f26417c;
    public final Object d;
    public final Object e;
    public final Object f26418f;

    public mb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f26415a = i10;
        this.f26417c = frameLayout;
        this.f26416b = z10;
        this.d = obj;
        this.e = obj2;
        this.f26418f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f26415a;
        Object obj = this.f26418f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f26416b;
        FrameLayout frameLayout = this.f26417c;
        switch (i10) {
            case 0:
                zb0 zb0Var = (zb0) frameLayout;
                Context context = (Context) obj3;
                ec0 ec0Var = (ec0) obj2;
                ec0 ec0Var2 = (ec0) obj;
                fc0 fc0Var = zb0Var.f30829c0;
                MessagePreviewParams messagePreviewParams = fc0Var.d;
                if (!z10) {
                    new yc(fc0Var, fc0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new kb0(zb0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                fc0Var.f24141x = false;
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
                zr0 zr0Var = ((xh.o2) frameLayout).f46313a;
                if (!z10) {
                    yh.j5 j5Var = zr0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    j5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    j5Var.a(i11, arrayList);
                    yc.a0(zr0Var.f46382a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    zr0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    yc.a0(zr0Var.f46382a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, yh.x3.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                y70Var.u();
                zr0Var.n();
                return;
        }
    }
}
