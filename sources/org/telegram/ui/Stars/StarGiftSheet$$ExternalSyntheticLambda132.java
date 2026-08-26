package org.telegram.ui.Stars;

import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Gifts.ProfileGiftsContainer$Page$$ExternalSyntheticLambda4;

public final class StarGiftSheet$$ExternalSyntheticLambda132 implements Runnable {
    public final int $r8$classId;
    public final StarGiftSheet f$0;
    public final TL_stars.TL_starGiftUnique f$1;
    public final AmountUtils$Amount f$2;
    public final Runnable f$3;

    public StarGiftSheet$$ExternalSyntheticLambda132(StarGiftSheet starGiftSheet, TL_stars.TL_starGiftUnique tL_starGiftUnique, AmountUtils$Amount amountUtils$Amount, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = starGiftSheet;
        this.f$1 = tL_starGiftUnique;
        this.f$2 = amountUtils$Amount;
        this.f$3 = runnable;
    }

    @Override
    public final void run() {
        Runnable runnable = this.f$3;
        AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.STARS;
        AmountUtils$Currency amountUtils$Currency2 = AmountUtils$Currency.TON;
        AmountUtils$Amount amountUtils$Amount = this.f$2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f$1;
        StarGiftSheet starGiftSheet = this.f$0;
        int i = this.$r8$classId;
        starGiftSheet.getClass();
        switch (i) {
            case 0:
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = amountUtils$Amount.currency == amountUtils$Currency2;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(amountUtils$Amount.convertTo(amountUtils$Currency).toTl());
                tL_starGiftUnique.resell_amount.add(amountUtils$Amount.convertTo(amountUtils$Currency2).toTl());
                starGiftSheet.topView.setResellPrice(amountUtils$Amount);
                ProfileGiftsContainer$Page$$ExternalSyntheticLambda4 profileGiftsContainer$Page$$ExternalSyntheticLambda4 = starGiftSheet.onGiftUpdatedListener;
                if (profileGiftsContainer$Page$$ExternalSyntheticLambda4 != null) {
                    profileGiftsContainer$Page$$ExternalSyntheticLambda4.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                zzkh.m(R.string.Gift2ResaleEnable, new Object[]{starGiftSheet.getGiftName()}, starGiftSheet.getBulletinFactory(), R.raw.contact_check);
                break;
            default:
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = amountUtils$Amount.currency == amountUtils$Currency2;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(amountUtils$Amount.convertTo(amountUtils$Currency).toTl());
                tL_starGiftUnique.resell_amount.add(amountUtils$Amount.convertTo(amountUtils$Currency2).toTl());
                starGiftSheet.topView.setResellPrice(amountUtils$Amount);
                ProfileGiftsContainer$Page$$ExternalSyntheticLambda4 profileGiftsContainer$Page$$ExternalSyntheticLambda5 = starGiftSheet.onGiftUpdatedListener;
                if (profileGiftsContainer$Page$$ExternalSyntheticLambda5 != null) {
                    profileGiftsContainer$Page$$ExternalSyntheticLambda5.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }
}
