package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.webkit.WebResourceRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.DialogsActivity;

public final class ImageUpdater$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public ImageUpdater$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((ImageUpdater) this.f$0).lambda$startCrop$1((String) this.f$1, (Uri) this.f$2);
                break;
            case 1:
                ((ChatActivityEnterView.AnonymousClass38) this.f$0).lambda$onDraw$0((SimpleAvatarView) this.f$1, (SenderSelectPopup.SenderView) this.f$2);
                break;
            case 2:
                ((ChatActivityEnterView.ChatActivityEditTextCaption) this.f$0).lambda$editPhoto$5((Uri) this.f$2, (File) this.f$1);
                break;
            case 3:
                ((ChatActivityEnterView.ChatActivityEditTextCaption) this.f$0).lambda$editPhoto$4((ArrayList) this.f$1, (File) this.f$2);
                break;
            case 4:
                ((EmojiPacksAlert.EmojiPacksLoader) this.f$0).lambda$init$0((TLRPC.TL_error) this.f$1, (TLObject) this.f$2);
                break;
            case 5:
                ((InviteLinkBottomSheet.Adapter.AnonymousClass2) this.f$0).lambda$revokeLink$0((TLRPC.TL_error) this.f$1, (TLObject) this.f$2);
                break;
            case 6:
                ((InviteMembersBottomSheet.SearchAdapter) this.f$0).lambda$updateSearchResults$1((ArrayList) this.f$1, (ArrayList) this.f$2);
                break;
            case 7:
                ((PhotoViewerWebView.AnonymousClass2) this.f$0).lambda$shouldInterceptRequest$0((String) this.f$1, (WebResourceRequest) this.f$2);
                break;
            case 8:
                ((PollVotesAlert) this.f$0).lambda$new$2((PollVotesAlert.VotesList) this.f$1, (TLObject) this.f$2);
                break;
            case 9:
                ((SearchViewPager.AnonymousClass1) this.f$0).lambda$openSponsoredOptions$6((DialogsActivity) this.f$1, (ItemOptions) this.f$2);
                break;
            case 10:
                ((SharedMediaLayout.AnonymousClass5) this.f$0).lambda$onClick$14((Theme.ResourcesProvider) this.f$1, (ItemOptions) this.f$2);
                break;
            case 11:
                ((SharedMediaLayout.GroupUsersSearchAdapter) this.f$0).lambda$updateSearchResults$4((ArrayList) this.f$1, (ArrayList) this.f$2);
                break;
            case 12:
                ((SharedMediaLayout.GroupUsersSearchAdapter) this.f$0).lambda$processSearch$2((String) this.f$1, (ArrayList) this.f$2);
                break;
            case 13:
                ((TrendingStickersLayout.TrendingStickersAdapter) this.f$0).lambda$loadMoreStickerSets$2((TLRPC.TL_error) this.f$1, (TLObject) this.f$2);
                break;
            case 14:
                ((AIEditorAlert) this.f$0).lambda$new$11((Context) this.f$1, (Theme.ResourcesProvider) this.f$2);
                break;
            case 15:
                ((AudioPlayerAlert) this.f$0).lambda$onSubItemClick$16((AlertDialog) this.f$1, (TLObject) this.f$2);
                break;
            case 16:
                ((ChatAttachAlert) this.f$0).lambda$showLayout$53((ChatAttachAlert.AttachAlertLayout) this.f$1, (ChatAttachAlert$$ExternalSyntheticLambda12) this.f$2);
                break;
            case 17:
                ((ChatAttachAlert) this.f$0).lambda$onCustomOpenAnimation$58((AnimationNotificationsLocker) this.f$1, (BottomSheet.BottomSheetDelegateInterface) this.f$2);
                break;
            case 18:
                ((ChatThemeBottomSheet.Adapter) this.f$0).lambda$parseTheme$0((TLObject) this.f$1, (Theme.ThemeInfo) this.f$2);
                break;
            case 19:
                ((DialogsBotsAdapter) this.f$0).lambda$new$2((Theme.ResourcesProvider) this.f$1, (Context) this.f$2);
                break;
            case 20:
                ((DialogsBotsAdapter.PopularBots) this.f$0).lambda$loadCache$1((MessagesStorage) this.f$1, (Runnable) this.f$2);
                break;
            case 21:
                ((EffectsTextView) this.f$0).lambda$onTouchEvent$0((LinkSpanDrawable) this.f$1, (ClickableSpan) this.f$2);
                break;
            case 22:
                ((FilterGLThread) this.f$0).lambda$getTexture$7((Bitmap[]) this.f$1, (CountDownLatch) this.f$2);
                break;
            case 23:
                ((FolderBottomSheet) this.f$0).lambda$onJoinButtonClicked$10((TLObject) this.f$1, (Pair) this.f$2);
                break;
            case 24:
                ((FolderBottomSheet) this.f$0).lambda$onJoinButtonClicked$6((BaseFragment) this.f$1, (ArrayList) this.f$2);
                break;
            case 25:
                ((InviteLinkBottomSheet) this.f$0).lambda$new$2((TLRPC.User) this.f$1, (BaseFragment) this.f$2);
                break;
            case 26:
                ((InviteMembersBottomSheet) this.f$0).lambda$generateLink$7((TLRPC.TL_error) this.f$1, (TLObject) this.f$2);
                break;
            case 27:
                ((LinkSpanDrawable.LinksTextView) this.f$0).lambda$onTouchEvent$0((LinkSpanDrawable) this.f$1, (ClickableSpan) this.f$2);
                break;
            case 28:
                ((MessagePrivateSeenView) this.f$0).lambda$request$1((TLRPC.TL_error) this.f$1, (TLObject) this.f$2);
                break;
            default:
                ((SearchDownloadsContainer) this.f$0).lambda$checkFilesExist$2((ArrayList) this.f$1, (ArrayList) this.f$2);
                break;
        }
    }

    public ImageUpdater$$ExternalSyntheticLambda1(ChatActivityEnterView.ChatActivityEditTextCaption chatActivityEditTextCaption, Uri uri, File file) {
        this.$r8$classId = 2;
        this.f$0 = chatActivityEditTextCaption;
        this.f$2 = uri;
        this.f$1 = file;
    }
}
