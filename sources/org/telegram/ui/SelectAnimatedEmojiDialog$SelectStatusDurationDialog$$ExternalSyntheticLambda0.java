package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

public final class SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final SelectAnimatedEmojiDialog.SelectStatusDurationDialog f$0;
    public final Integer f$1;

    public SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda0(SelectAnimatedEmojiDialog.SelectStatusDurationDialog selectStatusDurationDialog, Integer num, int i) {
        this.$r8$classId = i;
        this.f$0 = selectStatusDurationDialog;
        this.f$1 = num;
    }

    @Override
    public final void run() {
        SelectAnimatedEmojiDialog.SelectStatusDurationDialog selectStatusDurationDialog = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                selectStatusDurationDialog.lambda$done$8(this.f$1);
                break;
            default:
                selectStatusDurationDialog.getClass();
                Integer num = this.f$1;
                if (num != null) {
                    try {
                        SelectAnimatedEmojiDialog.this.performHapticFeedback(0, 1);
                        break;
                    } catch (Exception unused) {
                    }
                    SelectAnimatedEmojiDialog.AnonymousClass17.AnonymousClass1 anonymousClass1 = (SelectAnimatedEmojiDialog.AnonymousClass17.AnonymousClass1) selectStatusDurationDialog;
                    SelectAnimatedEmojiDialog.AnonymousClass17 anonymousClass17 = SelectAnimatedEmojiDialog.AnonymousClass17.this;
                    SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = SelectAnimatedEmojiDialog.this;
                    List list = SelectAnimatedEmojiDialog.emptyViewEmojis;
                    selectAnimatedEmojiDialog.incrementHintUse();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = anonymousClass1.val$view;
                    long j = ((SelectAnimatedEmojiDialog.ImageViewEmoji) view).span.documentId;
                    tL_emojiStatus.document_id = j;
                    SelectAnimatedEmojiDialog.this.onEmojiSelected(view, Long.valueOf(j), ((SelectAnimatedEmojiDialog.ImageViewEmoji) anonymousClass1.val$view).span.document, anonymousClass1.val$gift, num);
                    if (anonymousClass1.val$gift == null) {
                        MediaDataController.getInstance(SelectAnimatedEmojiDialog.this.currentAccount).pushRecentEmojiStatus(tL_emojiStatus);
                    }
                }
                break;
        }
    }
}
