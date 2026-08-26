package org.telegram.ui;

import android.graphics.Bitmap;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Cells.ChatMessageCell;

public final class OAuthSheet$$ExternalSyntheticLambda19 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public OAuthSheet$$ExternalSyntheticLambda19(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                OAuthSheet.lambda$handle$7((boolean[]) this.f$0, (BottomSheet) this.f$1, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                break;
            case 1:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressAdmin$52((ChatMessageCell) this.f$1, (TLRPC.TL_channels_channelParticipant) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                ArticleViewer.lambda$setParentActivity$37((ArticleViewer$$ExternalSyntheticLambda27) this.f$0, (ArticleViewer$$ExternalSyntheticLambda26) this.f$1, (Boolean) obj, (Boolean) obj2);
                break;
            case 3:
                ((ChatActivity) this.f$0).lambda$processSelectedOption$324((MessageObject) this.f$1, (Long) obj, (Runnable) obj2);
                break;
            case 4:
                ((ChatActivity) this.f$0).lambda$requestLinkPreview$144((Utilities.Callback2) this.f$1, (TL_account.webPagePreview) obj, (TLRPC.TL_error) obj2);
                break;
            case 5:
                ((ChatEditActivity) this.f$0).lambda$createView$26((View) this.f$1, (Boolean) obj, (Boolean) obj2);
                break;
            case 6:
                ((GroupCallActivity) this.f$0).lambda$new$23((ChatObject.Call) this.f$1, (Boolean) obj, (HashSet) obj2);
                break;
            case 7:
                ((LinkManager) this.f$0).lambda$handleSettings$12((String) this.f$1, (TL_account.Passkeys) obj, (TLRPC.TL_error) obj2);
                break;
            case 8:
                ((LinkManager) this.f$0).lambda$handleOAuth$18((TLRPC.TL_messages_requestUrlAuth) this.f$1, (TLRPC.UrlAuthResult) obj, (TLRPC.TL_error) obj2);
                break;
            case 9:
                PeerColorActivity.lambda$buy$6((Browser.Progress) this.f$0, (Utilities.Callback) this.f$1, (Boolean) obj, (String) obj2);
                break;
            case 10:
                ((PollItemMenu) this.f$0).lambda$prepareBlur$14((View) this.f$1, (Bitmap) obj, (Bitmap) obj2);
                break;
            case 11:
                ((PremiumPreviewFragment) this.f$0).lambda$createView$4((PremiumFeatureCell) this.f$1, (Long) obj, (Integer) obj2);
                break;
            default:
                ((TodoItemMenu) this.f$0).lambda$prepareBlur$13((View) this.f$1, (Bitmap) obj, (Bitmap) obj2);
                break;
        }
    }
}
