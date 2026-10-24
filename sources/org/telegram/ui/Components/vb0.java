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
    public final int f31410a;
    public final boolean f31411b;
    public final FrameLayout f31412c;
    public final Object d;
    public final Object e;
    public final Object f31413f;

    public vb0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f31410a = i10;
        this.f31412c = frameLayout;
        this.f31411b = z10;
        this.d = obj;
        this.e = obj2;
        this.f31413f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f31410a;
        Object obj = this.f31413f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f31411b;
        FrameLayout frameLayout = this.f31412c;
        switch (i10) {
            case 0:
                jc0 jc0Var = (jc0) frameLayout;
                Context context = (Context) obj3;
                oc0 oc0Var = (oc0) obj2;
                oc0 oc0Var2 = (oc0) obj;
                pc0 pc0Var = jc0Var.f27674c0;
                MessagePreviewParams messagePreviewParams = pc0Var.d;
                if (!z10) {
                    new vc(pc0Var, pc0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new tb0(jc0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                pc0Var.f29545x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (oc0Var != null) {
                        oc0Var.a(false, true);
                    }
                }
                oc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                jc0Var.i();
                jc0Var.l(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                h80 h80Var = (h80) obj;
                ms0 ms0Var = ((yh.l2) frameLayout).f50824a;
                if (!z10) {
                    ai.v9 v9Var = ms0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    v9Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    v9Var.a(i11, arrayList);
                    vc.a0(ms0Var.f50923a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, ai.l7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    ms0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    vc.a0(ms0Var.f50923a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, ai.l7.X1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                h80Var.u();
                ms0Var.n();
                return;
        }
    }
}
