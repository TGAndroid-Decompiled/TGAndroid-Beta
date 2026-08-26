package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class SelectAnimatedEmojiDialog$$ExternalSyntheticLambda33 implements Utilities.Callback {
    public final int $r8$classId;
    public final LinkedHashSet f$0;
    public final Runnable f$1;

    public SelectAnimatedEmojiDialog$$ExternalSyntheticLambda33(LinkedHashSet linkedHashSet, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = linkedHashSet;
        this.f$1 = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f$0.addAll(arrayList);
                }
                this.f$1.run();
                break;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f$0.addAll(tL_emojiList.document_id);
                }
                this.f$1.run();
                break;
        }
    }
}
