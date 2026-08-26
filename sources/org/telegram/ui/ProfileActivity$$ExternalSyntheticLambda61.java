package org.telegram.ui;

import android.view.View;
import com.google.android.exoplayer2.util.Consumer;

public final class ProfileActivity$$ExternalSyntheticLambda61 implements Consumer {
    public final int $r8$classId;
    public final ProfileActivity f$0;

    public ProfileActivity$$ExternalSyntheticLambda61(ProfileActivity profileActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updatedPeerColor$109((View) obj);
                break;
            default:
                this.f$0.lambda$setLoadingSpan$120((View) obj);
                break;
        }
    }
}
