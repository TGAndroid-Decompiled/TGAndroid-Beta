package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Components.PollVotesAlert;
import org.telegram.ui.Components.TranscribeButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.StoryContainsEmojiButton;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class GroupCallSheet$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final Object f$3;
    public final Object f$5;

    public GroupCallSheet$$ExternalSyntheticLambda0(int i, Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$2 = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$5 = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda70((AlertDialog) this.f$0, (Browser.Progress) this.f$1, tLObject, this.f$2, (Activity) this.f$3, (TLRPC.TL_inputGroupCallSlug) this.f$5, tL_error));
                break;
            case 1:
                ((ChatObject.Call) this.f$0).lambda$loadUnknownParticipants$6(this.f$2, (ChatObject.Call.OnParticipantsLoad) this.f$1, (ArrayList) this.f$3, (HashSet) this.f$5, tLObject, tL_error);
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda9(tLObject, this.f$2, (TLRPC.PhotoSize) this.f$0, (TLRPC.PhotoSize) this.f$1, (TranscribeButton$$ExternalSyntheticLambda0) this.f$3, (INavigationLayout) this.f$5, 4));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda70((MentionsAdapter.AnonymousClass7) this.f$0, this.f$2, (ArrayList) this.f$1, (LongSparseArray) this.f$3, tL_error, tLObject, (MessagesController) this.f$5));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda9(tLObject, this.f$2, (AlertDialog) this.f$0, (Context) this.f$1, (Theme.ResourcesProvider) this.f$3, (GroupCreateActivity$$ExternalSyntheticLambda7) this.f$5, 6));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda70(tL_error, tLObject, (ArrayList) this.f$0, this.f$2, (AtomicInteger) this.f$1, (ArrayList) this.f$3, (ChatActivity$$ExternalSyntheticLambda102) this.f$5));
                break;
            case 6:
                PollVotesAlert pollVotesAlert = (PollVotesAlert) this.f$0;
                pollVotesAlert.getClass();
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda9(pollVotesAlert, (Integer[]) this.f$1, this.f$2, tLObject, (ArrayList) this.f$3, (TLRPC.PollAnswerVoters) this.f$5));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda70((AlertDialog) this.f$0, tLObject, this.f$2, (TLRPC.Document) this.f$1, tL_error, this.f$3, (TLRPC.TL_stickers_addStickerToSet) this.f$5));
                break;
            case 8:
                ContactAddActivity contactAddActivity = (ContactAddActivity) this.f$0;
                contactAddActivity.getClass();
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda9(contactAddActivity, (TLRPC.FileLocation) this.f$1, (TLRPC.InputFile) this.f$3, tLObject, (TLRPC.FileLocation) this.f$5, this.f$2, 10));
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                launchActivity.getClass();
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda70(launchActivity, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) this.f$1, (LaunchActivity$$ExternalSyntheticLambda13) this.f$3, this.f$2, (String) this.f$5));
                break;
            case 10:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f$1;
                launchActivity2.getClass();
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda70(launchActivity2, tL_error, tLObject, this.f$2, (AlertDialog) this.f$0, (LaunchActivity$$ExternalSyntheticLambda13) this.f$3, (String) this.f$5));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new WearAuthSheet$$ExternalSyntheticLambda3((ButtonWithCounterView) this.f$0, (BottomSheet[]) this.f$1, this.f$2, (TLObject) this.f$3, (String) this.f$5, 26));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda9((ButtonWithCounterView) this.f$0, tLObject, (BottomSheet[]) this.f$1, (Theme.ResourcesProvider) this.f$3, this.f$2, (TLRPC.TL_messages_checkChatInvite) this.f$5, 12));
                break;
            default:
                StoryContainsEmojiButton storyContainsEmojiButton = (StoryContainsEmojiButton) this.f$0;
                storyContainsEmojiButton.getClass();
                AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda9(storyContainsEmojiButton, tLObject, this.f$1, (ArrayList) this.f$3, (boolean[]) this.f$5, this.f$2, 13));
                break;
        }
    }

    public GroupCallSheet$$ExternalSyntheticLambda0(KeyEvent.Callback callback, Object obj, int i, Object obj2, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = callback;
        this.f$1 = obj;
        this.f$2 = i;
        this.f$3 = obj2;
        this.f$5 = obj3;
    }

    public GroupCallSheet$$ExternalSyntheticLambda0(KeyEvent.Callback callback, Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = callback;
        this.f$1 = obj;
        this.f$3 = obj2;
        this.f$2 = i;
        this.f$5 = obj3;
    }

    public GroupCallSheet$$ExternalSyntheticLambda0(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$5 = obj4;
    }

    public GroupCallSheet$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$5 = obj4;
        this.f$2 = i;
    }

    public GroupCallSheet$$ExternalSyntheticLambda0(LaunchActivity launchActivity, int i, AlertDialog alertDialog, LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13, String str) {
        this.$r8$classId = 10;
        this.f$1 = launchActivity;
        this.f$2 = i;
        this.f$0 = alertDialog;
        this.f$3 = launchActivity$$ExternalSyntheticLambda13;
        this.f$5 = str;
    }
}
