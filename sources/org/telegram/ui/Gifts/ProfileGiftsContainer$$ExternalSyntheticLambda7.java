package org.telegram.ui.Gifts;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

public final class ProfileGiftsContainer$$ExternalSyntheticLambda7 implements Utilities.Callback {
    public final int $r8$classId;
    public final ProfileGiftsContainer f$0;

    public ProfileGiftsContainer$$ExternalSyntheticLambda7(ProfileGiftsContainer profileGiftsContainer, int i) {
        this.$r8$classId = i;
        this.f$0 = profileGiftsContainer;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createCollection$20((String) obj);
                break;
            default:
                this.f$0.lambda$createCollection$19((TL_stars.TL_starGiftCollection) obj);
                break;
        }
    }
}
