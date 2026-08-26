package org.telegram.ui;

import android.animation.AnimatorSet;
import android.os.StatFs;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.Stripe;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper$$ExternalSyntheticLambda0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.MessagesSearchAdapter;
import org.telegram.ui.Business.AwayMessagesActivity;
import org.telegram.ui.Business.ChatbotSheet;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Business.GreetMessagesActivity;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.AboutLinkCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ChatMessageUnsupportedCell;
import org.telegram.ui.Cells.CollapseTextCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EmbedBottomSheet;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.Stories.StoriesController;

public final class ArticleViewer$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public ArticleViewer$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        ArticleViewer.PageLayout.AnonymousClass1 anonymousClass1;
        int i;
        int i2;
        int i3;
        switch (this.$r8$classId) {
            case 0:
                ((AnimatorSet) this.f$0).start();
                break;
            case 1:
                DialogsSearchAdapter dialogsSearchAdapter = (DialogsSearchAdapter) this.f$0;
                dialogsSearchAdapter.getClass();
                dialogsSearchAdapter.currentMessagesFilter = DialogsSearchAdapter.Filter.All;
                dialogsSearchAdapter.searchResultMessages.clear();
                int i4 = dialogsSearchAdapter.messagesSectionPosition;
                if (i4 >= 0 && i4 < dialogsSearchAdapter.getItemCount()) {
                    dialogsSearchAdapter.notifyItemChanged(dialogsSearchAdapter.messagesSectionPosition);
                }
                dialogsSearchAdapter.loadMoreSearchMessages();
                break;
            case 2:
                StoriesController.SearchStoriesList searchStoriesList = ((MessagesSearchAdapter) this.f$0).storiesList;
                if (searchStoriesList != null) {
                    searchStoriesList.load(3, Collections.EMPTY_LIST, true);
                }
                break;
            case 3:
                ArchiveSettingsActivity archiveSettingsActivity = (ArchiveSettingsActivity) this.f$0;
                archiveSettingsActivity.getClass();
                archiveSettingsActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 4:
                ((ArticleViewer.BlockChannelCell) this.f$0).setState(2, false);
                break;
            case 5:
                ArticleViewer articleViewer = ArticleViewer.this;
                articleViewer.notificationsLocker.unlock();
                Runnable runnable = articleViewer.animationEndRunnable;
                if (runnable != null) {
                    runnable.run();
                    articleViewer.animationEndRunnable = null;
                }
                break;
            case 6:
                ArticleViewer.BlockEmbedCell blockEmbedCell = (ArticleViewer.BlockEmbedCell) ((EmbedBottomSheet.AnonymousClass4) this.f$0).this$0;
                ArticleViewer articleViewer2 = ArticleViewer.this;
                View view = articleViewer2.customView;
                if (view != null) {
                    articleViewer2.fullscreenVideoContainer.addView(view, LayoutHelper.createFrame(-1.0f, -1));
                    ArticleViewer.this.fullscreenVideoContainer.setVisibility(0);
                }
                break;
            case 7:
                Browser.openUrl(ArticleViewer.BlockEmbedCell.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 8:
                ((ArticleViewer.BlockPhotoCell) this.f$0).requestLayout();
                break;
            case 9:
                ArticleViewer.Sheet sheet = (ArticleViewer.Sheet) this.f$0;
                sheet.release();
                ArticleViewer.this.destroy();
                break;
            case 10:
                ArticleViewer.WebpageAdapter webpageAdapter = (ArticleViewer.WebpageAdapter) this.f$0;
                webpageAdapter.getClass();
                ArrayList arrayList = new ArrayList(webpageAdapter.localBlocks);
                int size = arrayList.size();
                ArticleViewer articleViewer3 = ArticleViewer.this;
                int i5 = 0;
                int i6 = size + (articleViewer3.sheet != null ? 1 : 0);
                int[] iArr = new int[i6];
                int[] iArr2 = new int[i6];
                ArticleViewer.PageLayout pageLayout = articleViewer3.pages[0];
                if (pageLayout != null && (anonymousClass1 = pageLayout.listView) != null) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, Integer.MIN_VALUE);
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE);
                    int i7 = 0;
                    int i8 = 0;
                    while (i8 < i6) {
                        boolean z = webpageAdapter.padding;
                        if (z && i8 == 0) {
                            iArr[i5] = i5;
                        } else {
                            int i9 = z ? i8 - 1 : i8;
                            TL_iv.PageBlock pageBlock = (i9 < 0 || i9 >= arrayList.size()) ? null : (TL_iv.PageBlock) arrayList.get(i9);
                            if (pageBlock == null || pageBlock.cachedHeight == 0 || pageBlock.cachedWidth != View.MeasureSpec.getSize(iMakeMeasureSpec)) {
                                RecyclerView.ViewHolder viewHolderCreateViewHolder = webpageAdapter.createViewHolder(anonymousClass1, ArticleViewer.WebpageAdapter.getTypeForBlock(pageBlock));
                                int i10 = i7;
                                int i11 = viewHolderCreateViewHolder.mItemViewType;
                                arrayList.size();
                                i = i10;
                                webpageAdapter.bindBlockToHolder(i11, viewHolderCreateViewHolder, pageBlock, i9, true);
                                View view2 = viewHolderCreateViewHolder.itemView;
                                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                int measuredHeight = view2.getMeasuredHeight();
                                iArr[i8] = measuredHeight;
                                if (pageBlock != null) {
                                    pageBlock.cachedHeight = measuredHeight;
                                    pageBlock.cachedWidth = View.MeasureSpec.getSize(iMakeMeasureSpec);
                                }
                            } else {
                                iArr[i8] = pageBlock.cachedHeight;
                            }
                            i2 = i8 - 1;
                            if (i2 < 0) {
                                i3 = 0;
                            } else {
                                i3 = iArr2[i2];
                            }
                            iArr2[i8] = i3 + iArr[i8];
                            i7 = iArr[i8] + i;
                            i8++;
                            i5 = 0;
                        }
                        i = i7;
                        i2 = i8 - 1;
                        if (i2 < 0) {
                            i3 = 0;
                        } else {
                            i3 = iArr2[i2];
                        }
                        iArr2[i8] = i3 + iArr[i8];
                        i7 = iArr[i8] + i;
                        i8++;
                        i5 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda17(webpageAdapter, i7, iArr, iArr2));
                }
                break;
            case 11:
                AvatarPreviewer.Layout layout = (AvatarPreviewer.Layout) this.f$0;
                if (!layout.preparingBlur) {
                    layout.preparingBlur = true;
                    ScrimOptions.makeGlobalBlurBitmaps(new CallLogActivity$$ExternalSyntheticLambda3(layout, 2));
                    break;
                }
                break;
            case 12:
                AwayMessagesActivity awayMessagesActivity = (AwayMessagesActivity) this.f$0;
                awayMessagesActivity.listView.adapter.update(true);
                awayMessagesActivity.checkDone(true);
                break;
            case 13:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.f$0).link);
                BulletinFactory.of(LaunchActivity.getLastFragment()).createCopyLinkBulletin(false).show();
                break;
            case 14:
                ChatbotSheet chatbotSheet = (ChatbotSheet) this.f$0;
                UniversalAdapter universalAdapter = chatbotSheet.adapter;
                if (universalAdapter != null) {
                    universalAdapter.update(true);
                }
                chatbotSheet.checkDone$5(true);
                break;
            case 15:
                ChatbotsActivity chatbotsActivity = (ChatbotsActivity) ((Stripe.AnonymousClass1) this.f$0).this$0;
                chatbotsActivity.listView.adapter.update(true);
                chatbotsActivity.updateSearchLoading();
                break;
            case 16:
                GreetMessagesActivity greetMessagesActivity = (GreetMessagesActivity) this.f$0;
                greetMessagesActivity.listView.adapter.update(true);
                greetMessagesActivity.checkDone$1$1(true);
                break;
            case 17:
                OpeningHoursActivity openingHoursActivity = (OpeningHoursActivity) this.f$0;
                openingHoursActivity.listView.adapter.update(true);
                openingHoursActivity.checkDone$3(true);
                break;
            case 18:
                ((GiftSheet$$ExternalSyntheticLambda23) this.f$0).run(Boolean.FALSE);
                break;
            case 19:
                NotificationCenter.getInstance(((QuickRepliesController) this.f$0).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            case 20:
                CacheChatsExceptionsFragment cacheChatsExceptionsFragment = (CacheChatsExceptionsFragment) this.f$0;
                cacheChatsExceptionsFragment.exceptionsDialogs.clear();
                cacheChatsExceptionsFragment.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(cacheChatsExceptionsFragment.currentType, cacheChatsExceptionsFragment.exceptionsDialogs);
                cacheChatsExceptionsFragment.updateRows$24();
                cacheChatsExceptionsFragment.finishFragment();
                break;
            case 21:
                GiftSheet$$ExternalSyntheticLambda8 giftSheet$$ExternalSyntheticLambda8 = (GiftSheet$$ExternalSyntheticLambda8) this.f$0;
                ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
                File file = rootDirs.get(0);
                file.getAbsolutePath();
                if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                    int size2 = rootDirs.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        File file2 = rootDirs.get(i12);
                        if (file2.getAbsolutePath().startsWith(SharedConfig.storageCacheDir) && file2.canWrite()) {
                            file = file2;
                        }
                    }
                }
                try {
                    StatFs statFs = new StatFs(file.getPath());
                    AndroidUtilities.runOnUIThread(new BotGuardHelper$$ExternalSyntheticLambda0(statFs.getBlockCountLong(), statFs.getBlockSizeLong(), statFs.getAvailableBlocksLong(), giftSheet$$ExternalSyntheticLambda8));
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 22:
                ((CacheControlActivity.ClearCacheButtonInternal.AnonymousClass1) this.f$0).lambda$showGiftOfferSheet$15();
                break;
            case 23:
                CameraScanActivity cameraScanActivity = (CameraScanActivity) ((BubbleActivity.AnonymousClass1) this.f$0).this$0;
                try {
                    CameraView cameraView = cameraScanActivity.cameraView;
                    cameraView.focusToPoint(cameraView.getWidth() / 2, cameraScanActivity.cameraView.getHeight() / 2, false);
                    break;
                } catch (Exception unused) {
                }
                CameraView cameraView2 = cameraScanActivity.cameraView;
                if (cameraView2 != null) {
                    cameraScanActivity.processShot(cameraView2.getTextureView().getBitmap());
                }
                break;
            case 24:
                AboutLinkCell.AnonymousClass3 anonymousClass3 = (AboutLinkCell.AnonymousClass3) this.f$0;
                LoadingDrawable loadingDrawable = anonymousClass3.thisLoading;
                if (loadingDrawable != null) {
                    AboutLinkCell.this.links.removeLoading(loadingDrawable, true);
                }
                break;
            case 25:
                ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate = ((ChatMessageUnsupportedCell) this.f$0).delegate;
                if (chatMessageCellDelegate != null) {
                    chatMessageCellDelegate.didPressAppUpdateButton();
                }
                break;
            case 26:
                ((CollapseTextCell) this.f$0).updateCollapseArrowTranslation();
                break;
            case 27:
                AndroidUtilities.hideKeyboard(((SendGiftSheet.AnonymousClass3) this.f$0).editTextEmoji.getEditText());
                break;
            case 28:
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) this.f$0;
                if (profileSearchCell.getParent() instanceof RecyclerListView) {
                    ((RecyclerListView) profileSearchCell.getParent()).getOnItemClickListener().onItemClick(RecyclerView.getChildAdapterPosition(profileSearchCell), profileSearchCell);
                } else {
                    profileSearchCell.callOnClick();
                }
                break;
            default:
                ((SharedPhotoVideoCell2) this.f$0).onCheckBoxPressed();
                break;
        }
    }
}
