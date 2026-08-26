package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class SelectAnimatedEmojiDialog$$ExternalSyntheticLambda0 implements Utilities.Callback {
    public final int $r8$classId;
    public final LinkedHashSet f$0;
    public final Runnable f$1;

    public SelectAnimatedEmojiDialog$$ExternalSyntheticLambda0(LinkedHashSet linkedHashSet, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = linkedHashSet;
        this.f$1 = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                SelectAnimatedEmojiDialog.lambda$search$22(this.f$0, this.f$1, (ArrayList) obj);
                break;
            default:
                SelectAnimatedEmojiDialog.lambda$search$20(this.f$0, this.f$1, (TLRPC.TL_emojiList) obj);
                break;
        }
    }
}
