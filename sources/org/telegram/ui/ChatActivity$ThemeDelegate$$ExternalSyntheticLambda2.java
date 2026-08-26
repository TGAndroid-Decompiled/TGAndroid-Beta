package org.telegram.ui;

import android.util.SparseIntArray;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.MessageDrawable;

public final class ChatActivity$ThemeDelegate$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity.ThemeDelegate f$0;

    public ChatActivity$ThemeDelegate$$ExternalSyntheticLambda2(ChatActivity.ThemeDelegate themeDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = themeDelegate;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.ThemeDelegate themeDelegate = this.f$0;
                themeDelegate.getClass();
                themeDelegate.animatingColors = new SparseIntArray();
                ChatActivity chatActivity = ChatActivity.this;
                MessageDrawable messageDrawable = (MessageDrawable) chatActivity.getThemedDrawable("drawableMsgOut");
                themeDelegate.animatingMessageDrawable = messageDrawable;
                messageDrawable.crossfadeFromDrawable = ((ActionBarLayout) ((BaseFragment) chatActivity).parentLayout).getMessageDrawableOutStart();
                MessageDrawable messageDrawable2 = (MessageDrawable) chatActivity.getThemedDrawable("drawableMsgOutMedia");
                themeDelegate.animatingMessageMediaDrawable = messageDrawable2;
                messageDrawable2.crossfadeFromDrawable = ((ActionBarLayout) ((BaseFragment) chatActivity).parentLayout).getMessageDrawableOutMediaStart();
                themeDelegate.animatingMessageDrawable.crossfadeProgress = 0.0f;
                themeDelegate.animatingMessageMediaDrawable.crossfadeProgress = 0.0f;
                chatActivity.updateMessagesVisiblePart$1();
                themeDelegate.updateServiceMessageColor(0.0f);
                break;
            default:
                ChatActivity.ThemeDelegate themeDelegate2 = this.f$0;
                themeDelegate2.animatingMessageDrawable.crossfadeFromDrawable = null;
                themeDelegate2.animatingMessageMediaDrawable.crossfadeFromDrawable = null;
                themeDelegate2.animatingColors = null;
                themeDelegate2.updateServiceMessageColor(1.0f);
                break;
        }
    }
}
