package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class LaunchActivity$$ExternalSyntheticLambda55 implements DialogsActivity.DialogsActivityDelegate {
    public final int $r8$classId = 0;
    public final LaunchActivity f$0;
    public final String f$1;
    public final int f$2;
    public final TLRPC.User f$3;

    public LaunchActivity$$ExternalSyntheticLambda55(LaunchActivity launchActivity, String str, int i, TLRPC.User user) {
        this.f$0 = launchActivity;
        this.f$1 = str;
        this.f$2 = i;
        this.f$3 = user;
    }

    @Override
    public final boolean canSelectStories() {
        switch (this.$r8$classId) {
            case 0:
                break;
        }
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public final boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.lambda$runLinkRequest$72(this.f$1, this.f$2, this.f$3, dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
            default:
                return this.f$0.lambda$processAttachMenuBot$126(this.f$3, this.f$1, this.f$2, dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
        }
    }

    @Override
    public final boolean didSelectStories(DialogsActivity dialogsActivity) {
        int i = this.$r8$classId;
        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity);
    }

    public LaunchActivity$$ExternalSyntheticLambda55(LaunchActivity launchActivity, TLRPC.User user, String str, int i) {
        this.f$0 = launchActivity;
        this.f$3 = user;
        this.f$1 = str;
        this.f$2 = i;
    }
}
