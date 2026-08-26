package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.ChatMessageCell;

public final class ArticleViewer$$ExternalSyntheticLambda27 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public ArticleViewer$$ExternalSyntheticLambda27(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((ArticleViewer) this.f$0).lambda$setParentActivity$20((ArticleViewer.PageLayout) this.f$1, (Activity) this.f$2, (String) obj);
                break;
            case 1:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressImage$48((MessageObject) this.f$1, (ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda1) this.f$2, (Boolean) obj);
                break;
            case 2:
                AlertDialog alertDialog = (AlertDialog) this.f$1;
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressRevealSensitiveContent$58(alertDialog, (ChatMessageCell) this.f$2, (TL_account.contentSettings) obj);
                break;
            case 3:
                ((ArticleViewer) this.f$0).lambda$setParentActivity$36((String) this.f$1, (String) this.f$2, (Boolean) obj);
                break;
            case 4:
                ((ChatActivity) this.f$0).lambda$didPressPhoneNumber$442((TLRPC.User) this.f$1, (String) this.f$2, (Boolean) obj);
                break;
            case 5:
                ((ChatActivity) this.f$0).lambda$processSelectedOption$316((MessageObject.GroupedMessages) this.f$1, (MessageObject) this.f$2, (Long) obj);
                break;
            case 6:
                ((DialogsActivity) this.f$0).lambda$createGroupForThis$69((AlertDialog) this.f$1, (Long) this.f$2, (Runnable) obj);
                break;
            case 7:
                ((ProfileBirthdayEffect.BirthdayEffectFetcher) this.f$0).lambda$new$1((HashSet) this.f$1, (ArrayList) this.f$2, (TLRPC.TL_messages_stickerSet) obj);
                break;
            case 8:
                ((SelectAnimatedEmojiDialog) this.f$0).lambda$search$24((LinkedHashSet) this.f$1, (Runnable) this.f$2, (ArrayList) obj);
                break;
            default:
                ((SelectAnimatedEmojiDialog) this.f$0).lambda$search$30((String) this.f$1, (ArrayList) this.f$2, (Runnable) obj);
                break;
        }
    }
}
