package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.web.BotWebViewContainer;

public final class OAuthSheet$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final int f$3;

    public OAuthSheet$$ExternalSyntheticLambda9(int i, TLRPC.TL_error tL_error, BaseFragment baseFragment, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.$r8$classId = 17;
        this.f$3 = i;
        this.f$0 = tL_error;
        this.f$1 = baseFragment;
        this.f$2 = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                OAuthSheet.lambda$handle$20((boolean[]) this.f$0, (BotWebViewContainer) this.f$1, (TLRPC.TL_messages_requestUrlAuth) this.f$2, this.f$3);
                break;
            case 1:
                ((PhotoViewer.AnonymousClass40) this.f$0).lambda$onSend$0((FrameLayout) this.f$1, (LongSparseArray) this.f$2, this.f$3);
                break;
            case 2:
                ((TooManyCommunitiesActivity.SearchAdapter) this.f$0).lambda$updateSearchResults$2(this.f$3, (ArrayList) this.f$1, (ArrayList) this.f$2);
                break;
            case 3:
                ArticleViewer.lambda$joinChannel$61((ArticleViewer.BlockChannelCell) this.f$0, this.f$3, (TLRPC.TL_error) this.f$1, (TLRPC.TL_channels_joinChannel) this.f$2);
                break;
            case 4:
                ((ArticleViewer) this.f$0).lambda$processSearch$48(this.f$3, (ArrayList) this.f$1, (String) this.f$2);
                break;
            case 5:
                ((ArticleViewer.WebpageAdapter) this.f$0).lambda$new$0(this.f$3, (int[]) this.f$1, (int[]) this.f$2);
                break;
            case 6:
                ((ChatActivity) this.f$1).lambda$processLoadedDiscussionMessage$375((boolean[]) this.f$0, this.f$3, (ChatActivity) this.f$2);
                break;
            case 7:
                ((ChatActivity) this.f$0).lambda$onFragmentCreate$12((MessagesStorage) this.f$1, this.f$3, (CountDownLatch) this.f$2);
                break;
            case 8:
                ((ChatActivity) this.f$0).lambda$unpinMessage$314((ArrayList) this.f$1, (ArrayList) this.f$2, this.f$3);
                break;
            case 9:
                ((ContentPreviewViewer) this.f$0).lambda$onInterceptTouchEvent$10((RecyclerListView) this.f$1, this.f$3, (Theme.ResourcesProvider) this.f$2);
                break;
            case 10:
                FragmentUsernameBottomSheet.lambda$open$0((String) this.f$0, this.f$3, (BottomSheet) this.f$1, (Theme.ResourcesProvider) this.f$2);
                break;
            case 11:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$73(this.f$3, (TLRPC.Chat) this.f$1, (DialogsActivity) this.f$2);
                break;
            case 12:
                ((LaunchActivity) this.f$0).lambda$checkAppUpdate$136((TLRPC.TL_help_appUpdate) this.f$1, this.f$3, (Browser.Progress) this.f$2);
                break;
            case 13:
                ((LinkManager) this.f$0).lambda$handleSettings$7((NotificationsSettingsActivity) this.f$1, this.f$3, (String) this.f$2);
                break;
            case 14:
                ((NotificationsCustomSettingsActivity) this.f$0).lambda$createView$13((View) this.f$1, (String) this.f$2, this.f$3);
                break;
            case 15:
                ((PasskeysActivity) this.f$0).lambda$openMenu$3((TL_account.Passkey) this.f$1, (String) this.f$2, this.f$3);
                break;
            case 16:
                ((PhotoViewer) this.f$0).lambda$detectFaces$109((ImageReceiver.BitmapHolder) this.f$1, this.f$3, (String) this.f$2);
                break;
            case 17:
                PremiumPreviewFragment.lambda$buyPremium$10(this.f$3, (TLRPC.TL_error) this.f$0, (BaseFragment) this.f$1, (TLRPC.TL_payments_assignPlayMarketTransaction) this.f$2);
                break;
            default:
                ((TodoItemMenu) this.f$0).lambda$setCell$8((TLRPC.TL_messageMediaToDo) this.f$1, this.f$3, (ChatActivity) this.f$2);
                break;
        }
    }

    public OAuthSheet$$ExternalSyntheticLambda9(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$3 = i;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public OAuthSheet$$ExternalSyntheticLambda9(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = i;
        this.f$2 = obj3;
    }

    public OAuthSheet$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = i;
    }

    public OAuthSheet$$ExternalSyntheticLambda9(ChatActivity chatActivity, boolean[] zArr, int i, ChatActivity chatActivity2) {
        this.$r8$classId = 6;
        this.f$1 = chatActivity;
        this.f$0 = zArr;
        this.f$3 = i;
        this.f$2 = chatActivity2;
    }
}
