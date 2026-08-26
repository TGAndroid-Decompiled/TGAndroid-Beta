package org.telegram.ui;

import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;

public final class SelectAnimatedEmojiDialog$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final float f$1;
    public final int f$2;

    public SelectAnimatedEmojiDialog$$ExternalSyntheticLambda10(Object obj, float f, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = f;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                float f = this.f$1;
                int i = this.f$2;
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) this.f$0;
                selectAnimatedEmojiDialog.getClass();
                try {
                    LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(selectAnimatedEmojiDialog.emojiGridView.getContext(), 0, f);
                    linearSmoothScrollerCustom.mTargetPosition = i;
                    selectAnimatedEmojiDialog.layoutManager.startSmoothScroll(linearSmoothScrollerCustom);
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            default:
                float f2 = this.f$1;
                int i2 = this.f$2;
                EmojiView emojiView = EmojiView.this;
                try {
                    LinearSmoothScrollerCustom linearSmoothScrollerCustom2 = new LinearSmoothScrollerCustom(emojiView.emojiGridView.getContext(), 0, f2);
                    linearSmoothScrollerCustom2.mTargetPosition = i2;
                    emojiView.emojiLayoutManager.startSmoothScroll(linearSmoothScrollerCustom2);
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                break;
        }
    }
}
