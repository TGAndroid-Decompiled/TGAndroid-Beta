package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wallpaper.WallpaperBitmapHolder;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ItemOptions;

public final class OAuthSheet$$ExternalSyntheticLambda1 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public OAuthSheet$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                OAuthSheet.lambda$showMatchCodeSheet$22((ArrayList) this.f$0, (BackupImageView[]) this.f$1, (TLRPC.TL_messages_stickerSet) obj);
                break;
            case 1:
                ((ChatActivity.AnonymousClass16) this.f$0).lambda$onItemClick$6((QuickRepliesController.QuickReply) this.f$1, (String) obj);
                break;
            case 2:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressRevealSensitiveContent$54((ChatMessageCell) this.f$1, (Boolean) obj);
                break;
            case 3:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressRevealSensitiveContent$56((OAuthSheet$$ExternalSyntheticLambda1) this.f$1, (Boolean) obj);
                break;
            case 4:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressImage$47((MessageObject) this.f$1, (Long) obj);
                break;
            case 5:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressCustomBotButton$21((TLRPC.Message) this.f$1, (String) obj);
                break;
            case 6:
                ((ContentPreviewViewer.AnonymousClass1) this.f$0).lambda$run$2((Utilities.Callback) this.f$1, (Boolean) obj);
                break;
            case 7:
                ((FilterCreateActivity.ListAdapter) this.f$0).lambda$onBindViewHolder$0((PeerColorActivity.PeerColorGrid) this.f$1, (Integer) obj);
                break;
            case 8:
                ((GroupCallActivity.CallEncryptionCell.EncryptionCallDialog) this.f$0).lambda$new$0((GroupCallActivity.CallEncryptionCell) this.f$1, (Bitmap) obj);
                break;
            case 9:
                ((PeerColorActivity) this.f$0).lambda$buttonClick$5((PeerColorActivity.Page) this.f$1, (Boolean) obj);
                break;
            case 10:
                ArticleViewer.lambda$setParentActivity$23((ArticleViewer.PageLayout) this.f$0, (Activity) this.f$1, (String) obj);
                break;
            case 11:
                ((ArticleViewer) this.f$0).lambda$setParentActivity$39((Activity) this.f$1, (Integer) obj);
                break;
            case 12:
                ((ChannelWallpaperActivity.Adapter) this.f$0).lambda$onCreateViewHolder$1((ChannelColorActivity.ThemeChooser) this.f$1, (String) obj);
                break;
            case 13:
                ((ChatActivity) this.f$0).lambda$createView$35((QuickRepliesController.QuickReply) this.f$1, (Long) obj);
                break;
            case 14:
                ((ChatActivity) this.f$0).lambda$createView$39((String) this.f$1, (Long) obj);
                break;
            case 15:
                ((ChatActivity) this.f$0).lambda$createView$41((TLRPC.BotInlineResult) this.f$1, (Long) obj);
                break;
            case 16:
                ((ChatActivity) this.f$0).lambda$processSelectedOption$333((AlertDialog[]) this.f$1, (TL_stats.TL_statsPollStats) obj);
                break;
            case 17:
                ((ChatActivity) this.f$0).lambda$processSelectedOption$354((MessageObject) this.f$1, (MessageSuggestionParams) obj);
                break;
            case 18:
                ((ChatActivity) this.f$0).lambda$updateTopPanel$235((RevenueSharingAdsInfoBottomSheet[]) this.f$1, (ItemOptions) obj);
                break;
            case 19:
                ((ChatBackgroundDrawable) this.f$0).lambda$new$0((TLRPC.WallPaper) this.f$1, (WallpaperBitmapHolder) obj);
                break;
            case 20:
                ((ContentPreviewViewer) this.f$0).lambda$addVoteOptions$1((BaseFragment) this.f$1, (Long) obj);
                break;
            case 21:
                ((DialogsActivity) this.f$0).lambda$onResume$80((Activity) this.f$1, (Boolean) obj);
                break;
            case 22:
                ((LinkManager) this.f$0).lambda$handleNewBot$19((TLRPC.User[]) this.f$1, (TLRPC.User) obj);
                break;
            case 23:
                ((MultiContactsSelectorBottomSheet) this.f$0).lambda$loadData$0((HashSet) this.f$1, (List) obj);
                break;
            case 24:
                ((NewContactBottomSheet) this.f$0).lambda$updatedPhone$16((String) this.f$1, (TLRPC.User) obj);
                break;
            case 25:
                OAuthSheet.lambda$handle$11((String[]) this.f$0, (Runnable) this.f$1, (String) obj);
                break;
            case 26:
                ((PollItemMenu) this.f$0).lambda$setCell$1((BaseFragment) this.f$1, (Long) obj);
                break;
            case 27:
                ((ProfileActivity) this.f$0).lambda$editRow$143((TLRPC.UserFull) this.f$1, (TL_account.TL_birthday) obj);
                break;
            case 28:
                ((ProfileBirthdayEffect.BirthdayEffectFetcher) this.f$0).lambda$new$3((String) this.f$1, (TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                ((Utilities.Callback) this.f$0).run((HashSet) this.f$1);
                break;
        }
    }
}
