package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class ChatActivity$$ExternalSyntheticLambda392 implements AlertDialog.OnButtonClickListener, MessagesController.ErrorDelegate {
    public final BaseFragment f$0;
    public final Object f$1;
    public final Object f$2;
    public final boolean f$3;

    public ChatActivity$$ExternalSyntheticLambda392(ChatActivity chatActivity, MessagesController messagesController, CharSequence charSequence, boolean z) {
        this.f$0 = chatActivity;
        this.f$1 = messagesController;
        this.f$2 = charSequence;
        this.f$3 = z;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ((ChatActivity) this.f$0).lambda$searchLinks$134((MessagesController) this.f$1, (CharSequence) this.f$2, this.f$3, alertDialog, i);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ((ProfileActivity) this.f$0).lambda$onJoinClicked$55((boolean[]) this.f$1, this.f$3, (BaseFragment) this.f$2, tL_error);
    }

    public ChatActivity$$ExternalSyntheticLambda392(ProfileActivity profileActivity, boolean[] zArr, boolean z, BaseFragment baseFragment) {
        this.f$0 = profileActivity;
        this.f$1 = zArr;
        this.f$3 = z;
        this.f$2 = baseFragment;
    }
}
