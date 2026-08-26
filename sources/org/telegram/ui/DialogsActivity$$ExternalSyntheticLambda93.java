package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class DialogsActivity$$ExternalSyntheticLambda93 implements MessagesStorage.BooleanCallback, MessagesStorage.LongCallback {
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final int f$1;
    public final Object f$2;
    public final long f$3;
    public final boolean f$4;

    public DialogsActivity$$ExternalSyntheticLambda93(AlertDialog alertDialog, BaseFragment baseFragment, int i, long j, boolean z) {
        this.f$0 = alertDialog;
        this.f$2 = baseFragment;
        this.f$1 = i;
        this.f$3 = j;
        this.f$4 = z;
    }

    @Override
    public void run(boolean z) {
        ((DialogsActivity) this.f$0).lambda$performSelectedDialogsAction$112(this.f$1, this.f$3, (TLRPC.Chat) this.f$2, this.f$4, z);
    }

    public DialogsActivity$$ExternalSyntheticLambda93(DialogsActivity dialogsActivity, int i, TLRPC.Chat chat, long j, boolean z) {
        this.f$0 = dialogsActivity;
        this.f$1 = i;
        this.f$2 = chat;
        this.f$3 = j;
        this.f$4 = z;
    }

    @Override
    public void run(long j) {
        ((AlertDialog) this.f$0).dismiss();
        if (j == 0) {
            return;
        }
        MessagesController.getInstance(this.f$1).linkCommunity(-j, this.f$3, this.f$4, new LaunchActivity$$ExternalSyntheticLambda149((BaseFragment) this.f$2, j, 3));
    }
}
