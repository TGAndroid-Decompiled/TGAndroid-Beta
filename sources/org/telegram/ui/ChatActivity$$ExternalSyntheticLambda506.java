package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;

public final class ChatActivity$$ExternalSyntheticLambda506 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public ChatActivity$$ExternalSyntheticLambda506(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$requestLinkPreviewCached$139((TL_account.getWebPagePreview) this.f$1, (Utilities.Callback2) this.f$2, (Boolean) obj, (TLRPC.WebPage) obj2);
                break;
            case 1:
                CacheControlActivity.ClearCacheButtonInternal.lambda$doClearCache$4((float[]) this.f$0, (boolean[]) this.f$1, (ChatActivity$$ExternalSyntheticLambda5) this.f$2, (Float) obj, (Boolean) obj2);
                break;
            case 2:
                ((DialogsActivity) this.f$0).lambda$createGroupForThis$75((ChannelCreateActivity) this.f$1, (AlertDialog) this.f$2, (BaseFragment) obj, (Long) obj2);
                break;
            default:
                TL_account.Passkey passkey = (TL_account.Passkey) this.f$1;
                String str = (String) this.f$2;
                PasskeysActivity.lambda$showLearnSheet$7((BottomSheet) this.f$0, passkey, str, (TL_account.Passkeys) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
