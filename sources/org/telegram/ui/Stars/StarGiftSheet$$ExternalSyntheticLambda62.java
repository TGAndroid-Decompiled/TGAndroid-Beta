package org.telegram.ui.Stars;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.tgnet.tl.TL_stars;

public final class StarGiftSheet$$ExternalSyntheticLambda62 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final StarGiftSheet f$0;
    public final TL_stars.TL_starGiftUnique f$1;

    public StarGiftSheet$$ExternalSyntheticLambda62(StarGiftSheet starGiftSheet, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i) {
        this.$r8$classId = i;
        this.f$0 = starGiftSheet;
        this.f$1 = tL_starGiftUnique;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f$1;
                this.f$0.lambda$onResellPressed$40(tL_starGiftUnique, (AmountUtils$Amount) obj, (Runnable) obj2);
                break;
            case 1:
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = this.f$1;
                this.f$0.lambda$openCrafting$7(tL_starGiftUnique2, (Utilities.Callback) obj, (Boolean) obj2);
                break;
            default:
                TL_stars.TL_starGiftUnique tL_starGiftUnique3 = this.f$1;
                this.f$0.lambda$onUpdatePriceClick$29(tL_starGiftUnique3, (AmountUtils$Amount) obj, (Runnable) obj2);
                break;
        }
    }
}
