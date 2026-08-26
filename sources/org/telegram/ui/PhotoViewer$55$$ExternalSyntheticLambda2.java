package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import androidx.collection.LongSparseArray;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.PhotoPickerAlbumsCell;
import org.telegram.ui.Components.FiltersListBottomSheet;
import org.telegram.ui.Components.ReactedUsersListView;
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;

public final class PhotoViewer$55$$ExternalSyntheticLambda2 implements UsersSelectActivity.FilterUsersActivityDelegate, AlertDialog.OnButtonClickListener, SlideChooseView.Callback, StoryViewer.HolderDrawAbove, ReactedUsersListView.OnCustomEmojiSelectedListener, MessagesStorage.BooleanCallback, FiltersListBottomSheet.FiltersListBottomSheetDelegate, OnApplyWindowInsetsListener, SearchAdapterHelper.SearchAdapterHelperDelegate, PhotoPickerAlbumsCell.PhotoPickerAlbumsCellDelegate, Utilities.Callback2Return, ManageChatUserCell.ManageChatUserCellDelegate, Utilities.Callback5, ViewGroupPartRenderer.DrawChildMethod, ThemePreviewActivity.WallpaperActivityDelegate, ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.Delegate {
    public final int $r8$classId;
    public final Object f$0;

    public PhotoViewer$55$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public boolean canApplySearchResults(int i) {
        return true;
    }

    public void didSelectAlbum(MediaController.AlbumEntry albumEntry) {
        ((PhotoAlbumPickerActivity.ListAdapter) this.f$0).lambda$onCreateViewHolder$0(albumEntry);
    }

    @Override
    public void didSelectChats(ArrayList arrayList, int i) {
        ((AutoDeleteMessagesActivity.AnonymousClass2) this.f$0).lambda$run$1(arrayList, i);
    }

    @Override
    public void didSelectFilter(MessagesController.DialogFilter dialogFilter, boolean z) {
        ((DialogsActivity.AnonymousClass12) this.f$0).lambda$onItemClick$2(dialogFilter, z);
    }

    @Override
    public void didSetNewBackground(TLRPC.WallPaper wallPaper) {
        ((WallpapersListActivity.AnonymousClass1) this.f$0).lambda$didSelectWallpaper$0(wallPaper);
    }

    @Override
    public void draw(Canvas canvas, RectF rectF, float f, boolean z) {
        ((CalendarActivity.AnonymousClass1) this.f$0).lambda$findView$0(canvas, rectF, f, z);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        return ((TopicsFragment.TopicsRecyclerView) this.f$0).drawChild(canvas, view, j);
    }

    @Override
    public LongSparseArray getExcludeCallParticipants() {
        return null;
    }

    @Override
    public LongSparseArray getExcludeUsers() {
        return null;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        switch (this.$r8$classId) {
            case 13:
                return ((LaunchActivity.AnonymousClass10) this.f$0).lambda$new$0(view, windowInsetsCompat);
            default:
                return ((AvatarPreviewer) this.f$0).lambda$show$0(view, windowInsetsCompat);
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer.AnonymousClass55) this.f$0).lambda$onError$0(alertDialog, i);
                break;
            case 2:
                ((CacheControlActivity.ClearCacheButtonInternal) this.f$0).lambda$new$0(alertDialog, i);
                break;
            case 6:
                ((ChatActivity.AnonymousClass16) this.f$0).lambda$onItemClick$9(alertDialog, i);
                break;
            case 8:
                ((ChatActivity.ChatActivityAdapter.AnonymousClass2) this.f$0).lambda$didClickButton$0(alertDialog, i);
                break;
            case 11:
                ((DataUsage2Activity.ListView) this.f$0).lambda$new$0(alertDialog, i);
                break;
            case 15:
                ((NotificationsSoundActivity.AnonymousClass1) this.f$0).lambda$onItemClick$1(alertDialog, i);
                break;
            case 17:
                ((PollCreateActivity.AnonymousClass9) this.f$0).lambda$onClearEmojiRecent$0(alertDialog, i);
                break;
            case 20:
                ((ProxyListActivity.AnonymousClass2) this.f$0).lambda$onItemClick$0(alertDialog, i);
                break;
            case 22:
                ((ThemeActivity.AnonymousClass1) this.f$0).lambda$onItemClick$0(alertDialog, i);
                break;
            case 23:
                ((ThemePreviewActivity.AnonymousClass26) this.f$0).lambda$deleteTheme$0(alertDialog, i);
                break;
            case 25:
                ((TwoStepVerificationSetupActivity.AnonymousClass1) this.f$0).lambda$onItemClick$0(alertDialog, i);
                break;
            default:
                ((WallpapersListActivity.AnonymousClass2) this.f$0).lambda$onItemClick$2(alertDialog, i);
                break;
        }
    }

    @Override
    public void onDataSetChanged(int i) {
        ((NotificationsCustomSettingsActivity.SearchAdapter) this.f$0).lambda$new$0(i);
    }

    @Override
    public void onDismiss(boolean z) {
        ((ArticleViewer.PageLayout) this.f$0).lambda$new$3(z);
    }

    @Override
    public void onOptionSelected(int i) {
        switch (this.$r8$classId) {
            case 3:
                CacheControlActivity.ListAdapter.lambda$onCreateViewHolder$1((ArrayList) this.f$0, i);
                break;
            default:
                ((DataAutoDownloadActivity.ListAdapter) this.f$0).lambda$onCreateViewHolder$0(i);
                break;
        }
    }

    @Override
    public boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell, boolean z) {
        return ((PrivacyUsersActivity.ListAdapter) this.f$0).lambda$onCreateViewHolder$0(manageChatUserCell, z);
    }

    @Override
    public void onSetHashtags(ArrayList arrayList, HashMap map) {
    }

    @Override
    public void onTouchEnd() {
        int i = this.$r8$classId;
        SlideChooseView.Callback.CC.$default$onTouchEnd(this);
    }

    @Override
    public Object run(Object obj, Object obj2) {
        return ((PrivacyControlActivity.ListAdapter) this.f$0).lambda$onBindViewHolder$6((Integer) obj, (Integer) obj2);
    }

    @Override
    public void showCustomEmojiAlert(ReactedUsersListView reactedUsersListView, ArrayList arrayList) {
        ((ChatActivity.AnonymousClass106) this.f$0).lambda$instantiateItem$0(reactedUsersListView, arrayList);
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Integer) obj3).intValue();
        float fFloatValue = ((Float) obj4).floatValue();
        float fFloatValue2 = ((Float) obj5).floatValue();
        ((ReportBottomSheet.Page) this.f$0).onClick((UItem) obj, (View) obj2, iIntValue, fFloatValue, fFloatValue2);
    }

    @Override
    public void run(boolean z) {
        switch (this.$r8$classId) {
            case 7:
                ((ChatActivity.AnonymousClass93) this.f$0).lambda$onCovert$0(z);
                break;
            default:
                ((ChatUsersActivity.AnonymousClass9) this.f$0).lambda$onCovert$0(z);
                break;
        }
    }
}
