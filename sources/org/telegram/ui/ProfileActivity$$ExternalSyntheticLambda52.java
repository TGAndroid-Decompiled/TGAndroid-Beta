package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EmojiPacksAlert;

public final class ProfileActivity$$ExternalSyntheticLambda52 implements Utilities.Callback {
    public final int $r8$classId;
    public final ProfileActivity f$0;

    public ProfileActivity$$ExternalSyntheticLambda52(ProfileActivity profileActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity profileActivity = this.f$0;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new EmojiPacksAlert(profileActivity, profileActivity.getParentActivity(), profileActivity.resourcesProvider, arrayList));
                break;
            default:
                this.f$0.lambda$createView$20((Boolean) obj);
                break;
        }
    }
}
