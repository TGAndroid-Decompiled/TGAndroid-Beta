package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;

public final class DialogsActivity$ContentView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final DialogsActivity.ContentView f$0;

    public DialogsActivity$ContentView$$ExternalSyntheticLambda0(DialogsActivity.ContentView contentView, int i) {
        this.$r8$classId = i;
        this.f$0 = contentView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity.ContentView contentView = this.f$0;
                Context context = contentView.getContext();
                DialogsActivity dialogsActivity = DialogsActivity.this;
                dialogsActivity.showDialog(new LimitReachedBottomSheet(3, ((BaseFragment) dialogsActivity).currentAccount, context, dialogsActivity, null));
                break;
            default:
                DialogsActivity dialogsActivity2 = DialogsActivity.this;
                DialogsActivity.AnonymousClass29 anonymousClass29 = dialogsActivity2.selectAnimatedEmojiDialog;
                if (anonymousClass29 != null) {
                    anonymousClass29.dismiss();
                    dialogsActivity2.selectAnimatedEmojiDialog = null;
                }
                break;
        }
    }
}
