package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import java.io.File;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;

public final class PhotoViewer$7$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public PhotoViewer$7$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer.AnonymousClass7) this.f$0).lambda$run$0((TextureViewContainer) this.f$1);
                break;
            case 1:
                ((PhotoViewer.AnonymousClass77) this.f$0).lambda$onPreDraw$2((AnimatorSet) this.f$1);
                break;
            case 2:
                ((PhotoViewer.AnonymousClass77) this.f$0).lambda$onPreDraw$3((PhotoViewer.PlaceProviderObject) this.f$1);
                break;
            case 3:
                ((ProfileActivity.ListAdapter) this.f$0).lambda$onBindViewHolder$5((Long) this.f$1);
                break;
            case 4:
                ((ProfileBirthdayEffect.BirthdayEffectFetcher) this.f$0).lambda$new$0((ProfileBirthdayEffect.ImageReceiverAsset) this.f$1);
                break;
            case 5:
                ((QrActivity.QrView) this.f$0).lambda$new$3((TLRPC.TL_exportedContactToken) this.f$1);
                break;
            case 6:
                ReportBottomSheet.AnonymousClass5.lambda$onHidden$2((Runnable) this.f$0, (BulletinFactory) this.f$1);
                break;
            case 7:
                ReportBottomSheet.AnonymousClass6.lambda$onHidden$2((BaseFragment) this.f$0, (Runnable) this.f$1);
                break;
            case 8:
                ((SecretMediaViewer.AnonymousClass2) this.f$0).lambda$onError$0((File) this.f$1);
                break;
            case 9:
                ((TopicsFragment.AnonymousClass19) this.f$0).lambda$showCustomize$0((TLRPC.TL_forumTopic) this.f$1);
                break;
            case 10:
                ((TopicsFragment.MessagesSearchContainer) this.f$0).lambda$searchMessages$1((String) this.f$1);
                break;
            case 11:
                ((TopicsNotifySettingsFragments.AnonymousClass2.AnonymousClass1) this.f$0).lambda$didRemoveException$0((TLRPC.TL_forumTopic) this.f$1);
                break;
            case 12:
                ((WallpapersListActivity.AnonymousClass2) this.f$0).lambda$onItemClick$0((int[]) this.f$1);
                break;
            case 13:
                ((WallpapersListActivity.SearchAdapter) this.f$0).lambda$processSearch$0((String) this.f$1);
                break;
            case 14:
                ((WallpapersListActivity.SearchAdapter) this.f$0).lambda$searchBotUser$1((TLObject) this.f$1);
                break;
            case 15:
                ((WebviewActivity.TelegramWebviewProxy) this.f$0).lambda$postEvent$0((String) this.f$1);
                break;
            case 16:
                ((ArchivedStickersActivity) this.f$0).lambda$processResponse$3((TLRPC.TL_messages_archivedStickers) this.f$1);
                break;
            case 17:
                ((ArticleViewer) this.f$0).lambda$open$56((AnimatorSet) this.f$1);
                break;
            case 18:
                ((ArticleViewer) this.f$0).lambda$openWebpageUrlInternal$9((Browser.Progress) this.f$1);
                break;
            case 19:
                ((BoostsActivity) this.f$0).lambda$loadStatistic$0((TL_stories.TL_premium_boostsStatus) this.f$1);
                break;
            case 20:
                ((CacheControlActivity) this.f$0).lambda$cleanupDialogFiles$22((AlertDialog) this.f$1);
                break;
            case 21:
                CallLogActivity.lambda$showCallLinkSheet$33((Context) this.f$0, (String[]) this.f$1);
                break;
            case 22:
                ((CameraScanActivity) this.f$0).lambda$processShot$11((MrzRecognizer.Result) this.f$1);
                break;
            case 23:
                ((CameraScanActivity) this.f$0).lambda$processShot$15((String) this.f$1);
                break;
            case 24:
                ((ChangeUsernameActivity) this.f$0).lambda$checkUserName$5((String) this.f$1);
                break;
            case 25:
                ((ChannelAdminLogActivity) this.f$0).lambda$processSelectedOption$17((TLObject) this.f$1);
                break;
            case 26:
                ((ChannelAdminLogActivity) this.f$0).lambda$processSelectedOption$19((TLRPC.User) this.f$1);
                break;
            case 27:
                ((ChannelBoostLayout) this.f$0).lambda$loadStatistic$1((TL_stories.TL_premium_boostsStatus) this.f$1);
                break;
            case 28:
                ((ChannelColorActivity) this.f$0).lambda$showLimit$12((TLRPC.Chat) this.f$1);
                break;
            default:
                ((ChannelCreateActivity) this.f$0).lambda$checkUserName$24((String) this.f$1);
                break;
        }
    }
}
