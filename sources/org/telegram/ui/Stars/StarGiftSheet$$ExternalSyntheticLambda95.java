package org.telegram.ui.Stars;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

public final class StarGiftSheet$$ExternalSyntheticLambda95 implements Utilities.Callback {
    public final int $r8$classId;
    public final Utilities.Callback f$0;

    public StarGiftSheet$$ExternalSyntheticLambda95(int i, Utilities.Callback callback) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run((TL_stars.StarGift) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.f$0;
                if (callback != null) {
                    callback.run(bool);
                }
                break;
        }
    }
}
