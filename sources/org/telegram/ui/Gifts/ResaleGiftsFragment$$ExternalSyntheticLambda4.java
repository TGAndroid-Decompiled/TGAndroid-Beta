package org.telegram.ui.Gifts;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Stars.StarGiftSheet;

public final class ResaleGiftsFragment$$ExternalSyntheticLambda4 implements StarGiftSheet.BoughtGiftCallback, Utilities.Callback5, Utilities.Callback5Return {
    public final ResaleGiftsFragment f$0;

    public ResaleGiftsFragment$$ExternalSyntheticLambda4(ResaleGiftsFragment resaleGiftsFragment) {
        this.f$0 = resaleGiftsFragment;
    }

    @Override
    public void onBoughtGift(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, boolean z) {
        this.f$0.lambda$onItemClick$28(tL_starGiftUnique, j, z);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f$0.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f$0.onItemClick$5((UItem) obj);
    }
}
