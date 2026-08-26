package org.telegram.ui;

import android.content.SharedPreferences;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.DeleteMessagesBottomSheet;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda73;
import org.telegram.ui.web.BotWebViewContainer;

public final class ArticleViewer$$ExternalSyntheticLambda53 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final Object f$3;

    public ArticleViewer$$ExternalSyntheticLambda53(int i, MessageSendPreview$15$$ExternalSyntheticLambda0 messageSendPreview$15$$ExternalSyntheticLambda0, BaseFragment baseFragment, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.$r8$classId = 5;
        this.f$2 = i;
        this.f$0 = messageSendPreview$15$$ExternalSyntheticLambda0;
        this.f$1 = baseFragment;
        this.f$3 = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i = 1;
        Object obj = this.f$1;
        Object obj2 = this.f$3;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda9((IArticleViewer) obj3, (ArticleViewer.WebpageAdapter) obj, tL_error, tLObject, this.f$2, (ArticleViewer.BlockChannelCell) obj2, 5));
                break;
            case 1:
                AlertDialog alertDialog = (AlertDialog) obj;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda73(alertDialog, i));
                } else {
                    AndroidUtilities.runOnUIThread(new WearAuthSheet$$ExternalSyntheticLambda3((SharedPreferences) obj3, (TLRPC.TL_help_support) tLObject, alertDialog, this.f$2, (BaseFragment) obj2, 16));
                }
                break;
            case 2:
                DeleteMessagesBottomSheet deleteMessagesBottomSheet = (DeleteMessagesBottomSheet) obj3;
                deleteMessagesBottomSheet.getClass();
                AndroidUtilities.runOnUIThread(new WearAuthSheet$$ExternalSyntheticLambda3((Object) deleteMessagesBottomSheet, (Object) tLObject, obj, this.f$2, (int[]) obj2, 18));
                break;
            case 3:
                SharedMediaLayout sharedMediaLayout = (SharedMediaLayout) obj3;
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda337((AlertDialog[]) obj, 8));
                int i2 = this.f$2;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda71(sharedMediaLayout, i2, tL_error, (TLRPC.TL_messages_editMessage) obj2, 25));
                } else {
                    MessagesController.getInstance(i2).processUpdates((TLRPC.Updates) tLObject, false);
                }
                break;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                launchActivity.getClass();
                AndroidUtilities.runOnUIThread(new WearAuthSheet$$ExternalSyntheticLambda3(launchActivity, tLObject, (Uri) obj, this.f$2, (AlertDialog) obj2, 22), 2L);
                break;
            case 5:
                boolean z = tLObject instanceof TLRPC.Updates;
                int i3 = this.f$2;
                if (z) {
                    MessagesController.getInstance(i3).processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread((MessageSendPreview$15$$ExternalSyntheticLambda0) obj3);
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda2(i3, tL_error, (BaseFragment) obj, (TLRPC.TL_payments_assignPlayMarketTransaction) obj2, 10));
                }
                break;
            case 6:
                GroupCallSheet$$ExternalSyntheticLambda0 groupCallSheet$$ExternalSyntheticLambda0 = (GroupCallSheet$$ExternalSyntheticLambda0) obj2;
                if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || obj3 == null) {
                    groupCallSheet$$ExternalSyntheticLambda0.run(tLObject, tL_error);
                } else {
                    FileRefController.getInstance(this.f$2).requestReference(obj3, (TLRPC.TL_messages_getAttachedStickers) obj, groupCallSheet$$ExternalSyntheticLambda0);
                }
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new WearAuthSheet$$ExternalSyntheticLambda3(tLObject, (boolean[]) obj3, (Utilities.Callback) obj, this.f$2, (TL_account.updateEmojiStatus) obj2, 28));
                break;
            default:
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) obj3;
                botWebViewContainer.getClass();
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda9(botWebViewContainer, (String) obj, tLObject, tL_error, this.f$2, (BotWebViewContainer.MyWebView) obj2, 14));
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda53(Object obj, int i, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, GroupCallSheet$$ExternalSyntheticLambda0 groupCallSheet$$ExternalSyntheticLambda0) {
        this.$r8$classId = 6;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = tL_messages_getAttachedStickers;
        this.f$3 = groupCallSheet$$ExternalSyntheticLambda0;
    }

    public ArticleViewer$$ExternalSyntheticLambda53(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
        this.f$3 = obj3;
    }
}
