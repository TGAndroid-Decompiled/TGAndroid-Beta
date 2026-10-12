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
public final class bc0 implements View.OnClickListener {
    public final int f23737a;
    public final boolean f23738b;
    public final FrameLayout f23739c;
    public final Object d;
    public final Object e;
    public final Object f23740f;

    public bc0(FrameLayout frameLayout, boolean z10, Object obj, Object obj2, Object obj3, int i10) {
        this.f23737a = i10;
        this.f23739c = frameLayout;
        this.f23738b = z10;
        this.d = obj;
        this.e = obj2;
        this.f23740f = obj3;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f23737a;
        Object obj = this.f23740f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z10 = this.f23738b;
        FrameLayout frameLayout = this.f23739c;
        switch (i10) {
            case 0:
                pc0 pc0Var = (pc0) frameLayout;
                Context context = (Context) obj3;
                uc0 uc0Var = (uc0) obj2;
                uc0 uc0Var2 = (uc0) obj;
                vc0 vc0Var = pc0Var.f28286c0;
                MessagePreviewParams messagePreviewParams = vc0Var.d;
                if (!z10) {
                    new zc(vc0Var, vc0Var.F).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag("Subscribe to **Telegram Premium** to forward formatted messages without the sender’s name.", new zb0(pc0Var, context, 0))).j();
                    return;
                }
                boolean z11 = messagePreviewParams.hideForwardSendersName;
                messagePreviewParams.hideForwardSendersName = !z11;
                vc0Var.f29941x = false;
                if (z11) {
                    messagePreviewParams.hideCaption = false;
                    if (uc0Var != null) {
                        uc0Var.a(false, true);
                    }
                }
                uc0Var2.a(messagePreviewParams.hideForwardSendersName, true);
                pc0Var.h();
                pc0Var.k(true);
                return;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                m80 m80Var = (m80) obj;
                ns0 ns0Var = ((yh.m2) frameLayout).f48994a;
                if (!z10) {
                    zh.e5 e5Var = ns0Var.e;
                    int i11 = tL_starGiftCollection.collection_id;
                    e5Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(savedStarGift);
                    e5Var.a(i11, arrayList);
                    zc.a0(ns0Var.f49089a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, zh.r3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                } else {
                    ns0Var.e.k(tL_starGiftCollection.collection_id, savedStarGift);
                    zc.a0(ns0Var.f49089a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, zh.r3.E1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                }
                m80Var.u();
                ns0Var.n();
                return;
        }
    }
}
