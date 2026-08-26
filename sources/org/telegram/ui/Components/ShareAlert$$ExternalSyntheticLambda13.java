package org.telegram.ui.Components;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;

public final class ShareAlert$$ExternalSyntheticLambda13 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ShareAlert$$ExternalSyntheticLambda13(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((ShareAlert) this.f$0).lambda$new$1((Context) this.f$1, tLObject, tL_error);
                break;
            case 1:
                ((ChatAttachAlert) this.f$0).lambda$new$12((ChatAttachAlert.AttachBotButton) this.f$1, tLObject, tL_error);
                break;
            case 2:
                ((PollVotesAlert) this.f$0).lambda$new$3((PollVotesAlert.VotesList) this.f$1, tLObject, tL_error);
                break;
            case 3:
                ((AnimatedEmojiDrawable.EmojiDocumentFetcher) this.f$0).lambda$loadFromServer$6((ArrayList) this.f$1, tLObject, tL_error);
                break;
            case 4:
                ((AudioPlayerAlert) this.f$0).lambda$onSubItemClick$17((AlertDialog) this.f$1, tLObject, tL_error);
                break;
            case 5:
                ((ChatAttachAlert) this.f$0).lambda$onLongClickBotButton$45((TLRPC.TL_attachMenuBot) this.f$1, tLObject, tL_error);
                break;
            case 6:
                ((ChatThemeBottomSheet.Adapter) this.f$0).lambda$parseTheme$1((Theme.ThemeInfo) this.f$1, tLObject, tL_error);
                break;
            case 7:
                ((FolderBottomSheet) this.f$0).lambda$onJoinButtonClicked$18((Utilities.Callback) this.f$1, tLObject, tL_error);
                break;
            case 8:
                ((FolderBottomSheet) this.f$0).lambda$onJoinButtonClicked$9((Pair) this.f$1, tLObject, tL_error);
                break;
            case 9:
                ((GroupVoipInviteAlert) this.f$0).lambda$loadChatParticipants$4((TLRPC.TL_channels_getParticipants) this.f$1, tLObject, tL_error);
                break;
            case 10:
                ((LinkActionView) this.f$0).lambda$loadUsers$12((TLRPC.TL_chatInviteExported) this.f$1, tLObject, tL_error);
                break;
            case 11:
                ((StickersAlert) this.f$0).lambda$loadStickerSet$8((MediaDataController) this.f$1, tLObject, tL_error);
                break;
            case 12:
                ((StickersAlert) this.f$0).lambda$new$3((TLRPC.TL_messages_getAttachedStickers) this.f$1, tLObject, tL_error);
                break;
            case 13:
                ((TermsOfServiceView) this.f$0).lambda$new$1((AlertDialog) this.f$1, tLObject, tL_error);
                break;
            default:
                ((TranslateAlert2) this.f$0).lambda$translate$5((TLRPC.TL_textWithEntities) this.f$1, tLObject, tL_error);
                break;
        }
    }
}
