package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ArchivedStickerSetCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Premium.PremiumTierCell;
import org.telegram.ui.Components.ReactedUsersListView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class WearAuthSheet$$ExternalSyntheticLambda3 implements ArchivedStickerSetCell.OnCheckedChangeListener, ReactedUsersListView.OnProfileSelectedListener, MessagesStorage.BooleanCallback, AlertsCreator.ScheduleDatePickerDelegate, MessagesStorage.LongCallback, AlertDialog.OnButtonClickListener, GenericProvider, AlertsCreator.StatusUntilDatePickerDelegate, RecyclerListView.OnItemLongClickListener, ProfileNotificationsActivity.ProfileNotificationsActivityDelegate, OnSuccessListener, RecyclerListView.OnItemClickListenerExtended, DialogsActivity.DialogsActivityDelegate, MessagesController.ErrorDelegate, LanguageDetector.ExceptionCallback, ResultCallback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public WearAuthSheet$$ExternalSyntheticLambda3(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public boolean canSelectStories() {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public void didCreateNewException(NotificationsSettingsActivity.NotificationException notificationException) {
        ((TopicsNotifySettingsFragments.AnonymousClass2) this.f$0).lambda$onItemClick$0((TLRPC.TL_forumTopic) this.f$1, notificationException);
    }

    @Override
    public void didRemoveException(long j) {
        ProfileNotificationsActivity.ProfileNotificationsActivityDelegate.CC.$default$didRemoveException(this, j);
    }

    @Override
    public void didSelectDate(int i) {
        ((SelectAnimatedEmojiDialog.SelectStatusDurationDialog) this.f$0).lambda$new$4((boolean[]) this.f$1, i);
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        return ((CacheChatsExceptionsFragment) this.f$0).lambda$createView$0((DialogsActivity) this.f$1, dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity);
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    public void onCheckedChanged(ArchivedStickerSetCell archivedStickerSetCell, boolean z) {
        ((ArchivedStickersActivity.ListAdapter) this.f$0).lambda$onBindViewHolder$0((TLRPC.StickerSetCovered) this.f$1, archivedStickerSetCell, z);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) throws Throwable {
        switch (this.$r8$classId) {
            case 6:
                ((DataUsageActivity) this.f$0).lambda$createView$1((DataUsageActivity.ListAdapter) this.f$1, alertDialog, i);
                break;
            case 7:
                ((DialogsActivity.AnonymousClass11) this.f$0).lambda$showDeleteAlert$0((MessagesController.DialogFilter) this.f$1, alertDialog, i);
                break;
            case 8:
                ((FiltersSetupActivity.ListAdapter) this.f$0).lambda$onCreateViewHolder$5((MessagesController.DialogFilter) this.f$1, alertDialog, i);
                break;
            case 9:
                ((PhotoViewer.AnonymousClass16) this.f$0).lambda$onItemClick$12((ArrayList) this.f$1, alertDialog, i);
                break;
            case 10:
                ((PhotoViewer.AnonymousClass16) this.f$0).lambda$onItemClick$16((boolean[]) this.f$1, alertDialog, i);
                break;
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
            case 18:
            case 19:
            case 21:
            default:
                ((ChannelCreateActivity) this.f$0).lambda$loadAdminedChannels$18((TLRPC.Chat) this.f$1, alertDialog, i);
                break;
            case 13:
                ((ProfileActivity.AnonymousClass6) this.f$0).lambda$onItemClick$0((TLRPC.User) this.f$1, alertDialog, i);
                break;
            case 16:
                ((ThemeActivity.ListAdapter) this.f$0).lambda$showOptionsForTheme$0((Theme.ThemeInfo) this.f$1, alertDialog, i);
                break;
            case 20:
                ((AutoDeleteMessagesActivity) this.f$0).lambda$updateItems$1((View) this.f$1, alertDialog, i);
                break;
            case 22:
                ((ChannelAdminLogActivity) this.f$0).lambda$showOpenUrlAlert$24((String) this.f$1, alertDialog, i);
                break;
        }
    }

    @Override
    public void onComplete(Object obj) {
        ((ChatActivity.ThemeDelegate) this.f$0).lambda$getBackgroundDrawableFromTheme$6((MotionBackgroundDrawable) this.f$1, (Pair) obj);
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onError(Throwable th) {
        ResultCallback.CC.$default$onError(this, th);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ((ArticleViewer) this.f$0).lambda$setParentActivity$18((ArticleViewer.PageLayout) this.f$1, view, i, f, f2);
    }

    @Override
    public void onProfileSelected(ReactedUsersListView reactedUsersListView, long j, TLRPC.MessagePeerReaction messagePeerReaction) {
        ((ChatActivity.AnonymousClass106) this.f$0).lambda$instantiateItem$1((MessageObject) this.f$1, reactedUsersListView, j, messagePeerReaction);
    }

    @Override
    public void onSuccess(Object obj) {
        WearAuthSheet.lambda$showEmojis$6((WearAuthSheet.AuthSession) this.f$0, (ButtonWithCounterView) this.f$1, (Integer) obj);
    }

    @Override
    public Object provide(Object obj) {
        return ((PremiumPreviewFragment.BackgroundView.AnonymousClass3) this.f$0).lambda$onCreateViewHolder$0((PremiumTierCell) this.f$1, (Void) obj);
    }

    @Override
    public void run(long j) {
        switch (this.$r8$classId) {
            case 5:
                ((ChatLinkActivity.ListAdapter.AnonymousClass1) this.f$0).lambda$migrateIfNeeded$0((Runnable) this.f$1, j);
                break;
            default:
                ((ChatEditActivity) this.f$0).lambda$createView$25((AlertDialog) this.f$1, j);
                break;
        }
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        switch (this.$r8$classId) {
            case 4:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressCustomBotButton$23((MessageObject) this.f$1, z, i, i2);
                break;
            case 11:
                ((PollCreateActivity.AnonymousClass2) this.f$0).lambda$onItemClick$0((TLRPC.TL_messageMediaToDo) this.f$1, z, i, i2);
                break;
            case 25:
                ((ChatActivity) this.f$0).lambda$createView$38((String) this.f$1, z, i, i2);
                break;
            default:
                ((ChatActivity) this.f$0).lambda$onActivityResultFragment$166((Uri) this.f$1, z, i, i2);
                break;
        }
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        ResultCallback.CC.$default$onError(this, tL_error);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return ((ThemeActivity.ListAdapter) this.f$0).lambda$onCreateViewHolder$5((ThemeActivity.ThemeAccentsListAdapter) this.f$1, view, i);
    }

    @Override
    public void run(Exception exc) {
        ChatActivity.lambda$createMenu$292((AtomicBoolean) this.f$0, (AtomicReference) this.f$1, exc);
    }

    @Override
    public void run(boolean z) {
        switch (this.$r8$classId) {
            case 3:
                ((ChatActivity.AnonymousClass16) this.f$0).lambda$onItemClick$4((TLRPC.User) this.f$1, z);
                break;
            default:
                ((TopicsFragment.AnonymousClass2) this.f$0).lambda$onItemClick$4((TLRPC.Chat) this.f$1, z);
                break;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ((ChatActivity) this.f$0).lambda$createView$76((Context) this.f$1, tL_error);
    }
}
