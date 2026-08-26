package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

public final class ChatActivity$16$$ExternalSyntheticLambda8 implements MessagesStorage.BooleanCallback, GroupCreateActivity.GroupCreateActivityDelegate {
    public final Object f$0;
    public final int f$1;
    public final boolean f$2;

    public ChatActivity$16$$ExternalSyntheticLambda8(Object obj, boolean z, int i) {
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = z;
    }

    @Override
    public void didSelectUsers(boolean z, boolean z2, ArrayList arrayList) {
        ((PrivacyControlActivity) this.f$0).lambda$createView$8(this.f$1, this.f$2, z, z2, arrayList);
    }

    @Override
    public void run(boolean z) {
        ((ChatActivity.AnonymousClass16) this.f$0).lambda$onItemClick$5(this.f$1, this.f$2, z);
    }
}
