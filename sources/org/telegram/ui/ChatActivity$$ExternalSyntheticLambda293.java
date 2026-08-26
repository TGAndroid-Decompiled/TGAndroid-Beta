package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;

public final class ChatActivity$$ExternalSyntheticLambda293 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;

    public ChatActivity$$ExternalSyntheticLambda293(BaseFragment baseFragment, int i, TLObject tLObject, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseFragment;
        this.f$1 = i;
        this.f$2 = tLObject;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.getClass();
                AndroidUtilities.runOnUIThread(new WearAuthSheet$$ExternalSyntheticLambda3(chatActivity, this.f$1, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) this.f$2, 12));
                break;
            case 1:
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                launchActivity.getClass();
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    MessagesController.getInstance(launchActivity.currentAccount).processUpdates(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda13(23, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                AndroidUtilities.runOnUIThread(new WearAuthSheet$$ExternalSyntheticLambda3(launchActivity, (LaunchActivity$$ExternalSyntheticLambda13) this.f$2, tL_error, updates, this.f$1, 24));
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                PasskeysActivity passkeysActivity = (PasskeysActivity) this.f$0;
                passkeysActivity.getClass();
                boolean z = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse;
                int i = this.f$1;
                TL_account.Passkey passkey = (TL_account.Passkey) this.f$2;
                ArrayList arrayList = passkeysActivity.passkeys;
                if (z) {
                    BulletinFactory.of(passkeysActivity).showForError("FALSE", false);
                    arrayList.add(Utilities.clamp(i, arrayList.size(), 0), passkey);
                    passkeysActivity.listView.adapter.update(true);
                } else if (tL_error2 != null) {
                    BulletinFactory.of(passkeysActivity).showForError(false, tL_error2);
                    arrayList.add(Utilities.clamp(i, arrayList.size(), 0), passkey);
                    passkeysActivity.listView.adapter.update(true);
                }
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda293(LaunchActivity launchActivity, LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13, int i) {
        this.$r8$classId = 1;
        this.f$0 = launchActivity;
        this.f$2 = launchActivity$$ExternalSyntheticLambda13;
        this.f$1 = i;
    }
}
