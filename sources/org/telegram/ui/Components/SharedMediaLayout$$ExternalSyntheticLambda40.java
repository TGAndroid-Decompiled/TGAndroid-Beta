package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.Theme;

public final class SharedMediaLayout$$ExternalSyntheticLambda40 implements Runnable {
    public final int $r8$classId = 0;
    public final SharedMediaLayout f$0;
    public final Theme.ResourcesProvider f$1;
    public final int f$2;
    public final MessageObject f$3;

    public SharedMediaLayout$$ExternalSyntheticLambda40(SharedMediaLayout sharedMediaLayout, Theme.ResourcesProvider resourcesProvider, int i, MessageObject messageObject) {
        this.f$0 = sharedMediaLayout;
        this.f$1 = resourcesProvider;
        this.f$2 = i;
        this.f$3 = messageObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$20(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$new$27(this.f$1, this.f$3, this.f$2);
                break;
        }
    }

    public SharedMediaLayout$$ExternalSyntheticLambda40(SharedMediaLayout sharedMediaLayout, Theme.ResourcesProvider resourcesProvider, MessageObject messageObject, int i) {
        this.f$0 = sharedMediaLayout;
        this.f$1 = resourcesProvider;
        this.f$3 = messageObject;
        this.f$2 = i;
    }
}
