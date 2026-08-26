package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;

public final class ChatActivity$$ExternalSyntheticLambda90 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;

    public ChatActivity$$ExternalSyntheticLambda90(BaseFragment baseFragment, int i, TLObject tLObject, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseFragment;
        this.f$1 = i;
        this.f$2 = tLObject;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                TL_account.getWebPagePreview getwebpagepreview = (TL_account.getWebPagePreview) this.f$2;
                chatActivity.lambda$searchLinks$137(this.f$1, getwebpagepreview, (Boolean) obj, (TLRPC.WebPage) obj2);
                break;
            case 1:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$90((LinkManager$$ExternalSyntheticLambda2) this.f$2, this.f$1, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ((PasskeysActivity) this.f$0).lambda$openMenu$1(this.f$1, (TL_account.Passkey) this.f$2, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda90(LaunchActivity launchActivity, LinkManager$$ExternalSyntheticLambda2 linkManager$$ExternalSyntheticLambda2, int i) {
        this.$r8$classId = 1;
        this.f$0 = launchActivity;
        this.f$2 = linkManager$$ExternalSyntheticLambda2;
        this.f$1 = i;
    }
}
