package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

public final class ProfileActivity$$ExternalSyntheticLambda50 implements Runnable {
    public final int $r8$classId = 0;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final Object f$1;
    public final String f$2;
    public final boolean f$3;
    public final boolean f$4;

    public ProfileActivity$$ExternalSyntheticLambda50(ProfileActivity profileActivity, TLRPC.User user, String str, boolean z, boolean z2) {
        this.f$0 = profileActivity;
        this.f$1 = user;
        this.f$2 = str;
        this.f$3 = z;
        this.f$4 = z2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ProfileActivity) this.f$0).lambda$onMemberClick$60((TLRPC.User) this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            default:
                ((SelectAnimatedEmojiDialog) this.f$0).lambda$search$31(this.f$2, this.f$3, this.f$4, (String[]) this.f$1);
                break;
        }
    }

    public ProfileActivity$$ExternalSyntheticLambda50(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, String str, boolean z, boolean z2, String[] strArr) {
        this.f$0 = selectAnimatedEmojiDialog;
        this.f$2 = str;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$1 = strArr;
    }
}
