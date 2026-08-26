package org.telegram.ui;

import android.app.Activity;
import android.media.projection.MediaProjectionManager;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.SeekBarView$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.TopViewCell;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.voip.GroupCallMiniTextureView;
import org.telegram.ui.Gifts.AcquiredGiftsSheet;
import org.telegram.ui.Gifts.AuctionWearingSheet;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.SelfStoryViewsPage$ListAdapter$$ExternalSyntheticLambda1;

public final class GroupCallSheet$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public GroupCallSheet$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onClick(View view) throws Throwable {
        TLRPC.Chat chat;
        BaseFragment lastFragment;
        switch (this.$r8$classId) {
            case 0:
                CheckBox2 checkBox2 = (CheckBox2) this.f$0;
                CheckBoxBase checkBoxBase = checkBox2.checkBoxBase;
                checkBoxBase.setChecked(-1, !checkBoxBase.isChecked, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", checkBox2.checkBoxBase.isChecked).apply();
                break;
            case 1:
                ((SeekBarView$$ExternalSyntheticLambda1) this.f$0).run();
                break;
            case 2:
                ((StickerEmptyView) this.f$0).stickerView.getImageReceiver().startAnimation();
                break;
            case 3:
                AndroidUtilities.runOnUIThread((SelfStoryViewsPage$ListAdapter$$ExternalSyntheticLambda1) this.f$0, 100L);
                break;
            case 4:
                ((EditTextBoldCursor) this.f$0).setText("");
                break;
            case 5:
                UsersSelectActivity.AnonymousClass4 anonymousClass4 = ((ThemeEditorView.EditorAlert.SearchField) this.f$0).searchEditText;
                anonymousClass4.setText("");
                AndroidUtilities.showKeyboard(anonymousClass4);
                break;
            case 6:
                ((TopViewCell) this.f$0).imageView.getImageReceiver().startAnimation();
                break;
            case 7:
                ((TranslateAlert2) this.f$0).lambda$new$0$16(view);
                break;
            case 8:
                ChatActivity chatActivity = ChatActivity.this;
                if (chatActivity.getUserConfig().isPremium() || ((chat = chatActivity.currentChat) != null && chat.autotranslation)) {
                    chatActivity.getMessagesController().getTranslateController().toggleTranslatingDialog(chatActivity.getDialogId());
                } else {
                    MessagesController.getNotificationsSettings(((BaseFragment) chatActivity).currentAccount).edit().putInt("dialog_show_translate_count" + chatActivity.getDialogId(), 14).commit();
                    chatActivity.showDialog(new PremiumFeatureBottomSheet((BaseFragment) chatActivity, 13, false));
                }
                chatActivity.updateTopPanel(true);
                break;
            case 9:
                ((ChatActivity$$ExternalSyntheticLambda5) this.f$0).run();
                break;
            case 10:
                GroupCallMiniTextureView groupCallMiniTextureView = (GroupCallMiniTextureView) this.f$0;
                groupCallMiniTextureView.getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                groupCallMiniTextureView.stopSharingTextView.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 11:
                GroupCallActivity.AnonymousClass47 anonymousClass47 = (GroupCallActivity.AnonymousClass47) this.f$0;
                if (!anonymousClass47.isDismissed) {
                    if (anonymousClass47.currentPage == 0 && anonymousClass47.needScreencast) {
                        ((Activity) anonymousClass47.getContext()).startActivityForResult(((MediaProjectionManager) anonymousClass47.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                    } else {
                        anonymousClass47.dismiss(false, true);
                    }
                    break;
                }
                break;
            case 12:
                VoIPFragment.AnonymousClass24 anonymousClass24 = (VoIPFragment.AnonymousClass24) this.f$0;
                if (!anonymousClass24.isDismissed) {
                    if (anonymousClass24.realCurrentPage != 0) {
                        anonymousClass24.dismiss(false, true);
                    } else {
                        ((Activity) anonymousClass24.getContext()).startActivityForResult(((MediaProjectionManager) anonymousClass24.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                    }
                    break;
                }
                break;
            case 13:
                TextCheckCell textCheckCell = ((TextCheckCell[]) this.f$0)[0];
                textCheckCell.setChecked(!textCheckCell.checkBox.isChecked);
                break;
            case 14:
                ((BottomSheet.Builder) this.f$0).bottomSheet.dismissRunnable.run();
                break;
            case 15:
                OKLCH.m(3, (BaseFragment) this.f$0);
                break;
            case 16:
                final DialogCacheBottomSheet dialogCacheBottomSheet = (DialogCacheBottomSheet) this.f$0;
                AlertDialog.Builder builder = new AlertDialog.Builder(dialogCacheBottomSheet.getContext(), 0, null);
                String string = LocaleController.getString(R.string.ClearCache);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.getString(R.string.ClearCacheForChat);
                final int i = 0;
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog2, int i2) {
                        switch (i) {
                            case 0:
                                dialogCacheBottomSheet.lambda$createButton$1(alertDialog2, i2);
                                break;
                            default:
                                DialogCacheBottomSheet dialogCacheBottomSheet2 = dialogCacheBottomSheet;
                                dialogCacheBottomSheet2.lambda$showGiftOfferSheet$15();
                                ((CacheControlActivity) dialogCacheBottomSheet2.cacheDelegate.matrix).cleanupDialogFiles(dialogCacheBottomSheet2.entities, dialogCacheBottomSheet2.clearViewData, dialogCacheBottomSheet2.cacheModel);
                                break;
                        }
                    }
                });
                final int i2 = 1;
                builder.setPositiveButton(LocaleController.getString(R.string.Clear), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog2, int i3) {
                        switch (i2) {
                            case 0:
                                dialogCacheBottomSheet.lambda$createButton$1(alertDialog2, i3);
                                break;
                            default:
                                DialogCacheBottomSheet dialogCacheBottomSheet2 = dialogCacheBottomSheet;
                                dialogCacheBottomSheet2.lambda$showGiftOfferSheet$15();
                                ((CacheControlActivity) dialogCacheBottomSheet2.cacheDelegate.matrix).cleanupDialogFiles(dialogCacheBottomSheet2.entities, dialogCacheBottomSheet2.clearViewData, dialogCacheBottomSheet2.cacheModel);
                                break;
                        }
                    }
                });
                alertDialog.show();
                alertDialog.redPositive();
                break;
            case 17:
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = ((ActionBarPopupWindow.ActionBarPopupWindowLayout[]) this.f$0)[0];
                if (actionBarPopupWindowLayout != null) {
                    actionBarPopupWindowLayout.getSwipeBack().closeForeground(true);
                }
                break;
            case 18:
                ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
                if (applicationLoader != null) {
                    applicationLoader.onSuggestionClick((String) this.f$0);
                }
                break;
            case 19:
                ((FilterCreateActivity.FilterInvitesBottomSheet) this.f$0).createLink();
                break;
            case 20:
                FilterCreateActivity.FilterInvitesBottomSheet.this.lambda$showGiftOfferSheet$15();
                break;
            case 21:
                RLottieImageView rLottieImageView = ((FilterCreateActivity.HintInnerCell) this.f$0).imageView;
                if (!rLottieImageView.isPlaying()) {
                    rLottieImageView.setProgress(0.0f);
                    rLottieImageView.playAnimation();
                }
                break;
            case 22:
                ((FilterCreateActivity.LinkCell) this.f$0).options();
                break;
            case 23:
                FiltersSetupActivity.FilterCell filterCell = (FiltersSetupActivity.FilterCell) this.f$0;
                boolean z = filterCell.shareLoading;
                LoadingDrawable loadingDrawable = filterCell.shareLoadingDrawable;
                if ((!z || loadingDrawable.isDisappeared()) && filterCell.currentFilter != null) {
                    filterCell.shareLoading = true;
                    loadingDrawable.start = -1L;
                    loadingDrawable.disappearStart = -1L;
                    filterCell.shareImageView.invalidate();
                    FilterCreateActivity.FilterInvitesBottomSheet.show(FiltersSetupActivity.this, filterCell.currentFilter, new ComposeDrawable$$ExternalSyntheticLambda0(filterCell, 24));
                }
                break;
            case 24:
                RLottieImageView rLottieImageView2 = ((FiltersSetupActivity.HintInnerCell) this.f$0).imageView;
                if (!rLottieImageView2.isPlaying()) {
                    rLottieImageView2.setProgress(0.0f);
                    rLottieImageView2.playAnimation();
                }
                break;
            case 25:
                final FiltersSetupActivity.ListAdapter listAdapter = (FiltersSetupActivity.ListAdapter) this.f$0;
                FiltersSetupActivity.FilterCell filterCell2 = (FiltersSetupActivity.FilterCell) view.getParent();
                final MessagesController.DialogFilter currentFilter = filterCell2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = FiltersSetupActivity.this;
                ItemOptions itemOptions = new ItemOptions(filtersSetupActivity, filterCell2, false, true);
                final int i3 = 0;
                itemOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                FiltersSetupActivity.ListAdapter listAdapter2 = listAdapter;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                boolean z2 = dialogFilter.locked;
                                FiltersSetupActivity filtersSetupActivity2 = FiltersSetupActivity.this;
                                if (!z2) {
                                    filtersSetupActivity2.presentFragment(new FilterCreateActivity(dialogFilter, null));
                                } else {
                                    filtersSetupActivity2.showDialog(new LimitReachedBottomSheet(3, ((BaseFragment) filtersSetupActivity2).currentAccount, listAdapter2.mContext, filtersSetupActivity2, null));
                                }
                                break;
                            default:
                                FiltersSetupActivity.ListAdapter listAdapter3 = listAdapter;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                boolean zIsChatlist = dialogFilter2.isChatlist();
                                FiltersSetupActivity filtersSetupActivity3 = FiltersSetupActivity.this;
                                if (!zIsChatlist) {
                                    AlertDialog.Builder builder2 = new AlertDialog.Builder(filtersSetupActivity3.getParentActivity(), 0, null);
                                    String string2 = LocaleController.getString(R.string.FilterDelete);
                                    AlertDialog alertDialog2 = builder2.alertDialog;
                                    alertDialog2.title = string2;
                                    alertDialog2.message = LocaleController.getString(R.string.FilterDeleteAlert);
                                    builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                    builder2.setPositiveButton(LocaleController.getString(R.string.Delete), new DialogsActivity$$ExternalSyntheticLambda89(4, listAdapter3, dialogFilter2));
                                    filtersSetupActivity3.showDialog(alertDialog2);
                                    TextView textView = (TextView) alertDialog2.getButton(-1);
                                    if (textView != null) {
                                        textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                    }
                                } else {
                                    FolderBottomSheet.showForDeletion(dialogFilter2.id, filtersSetupActivity3, new PollItemMenu$$ExternalSyntheticLambda14(listAdapter3, 11));
                                }
                                break;
                        }
                    }
                }, false);
                final int i4 = 1;
                itemOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() {
                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                FiltersSetupActivity.ListAdapter listAdapter2 = listAdapter;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                boolean z2 = dialogFilter.locked;
                                FiltersSetupActivity filtersSetupActivity2 = FiltersSetupActivity.this;
                                if (!z2) {
                                    filtersSetupActivity2.presentFragment(new FilterCreateActivity(dialogFilter, null));
                                } else {
                                    filtersSetupActivity2.showDialog(new LimitReachedBottomSheet(3, ((BaseFragment) filtersSetupActivity2).currentAccount, listAdapter2.mContext, filtersSetupActivity2, null));
                                }
                                break;
                            default:
                                FiltersSetupActivity.ListAdapter listAdapter3 = listAdapter;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                boolean zIsChatlist = dialogFilter2.isChatlist();
                                FiltersSetupActivity filtersSetupActivity3 = FiltersSetupActivity.this;
                                if (!zIsChatlist) {
                                    AlertDialog.Builder builder2 = new AlertDialog.Builder(filtersSetupActivity3.getParentActivity(), 0, null);
                                    String string2 = LocaleController.getString(R.string.FilterDelete);
                                    AlertDialog alertDialog2 = builder2.alertDialog;
                                    alertDialog2.title = string2;
                                    alertDialog2.message = LocaleController.getString(R.string.FilterDeleteAlert);
                                    builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                    builder2.setPositiveButton(LocaleController.getString(R.string.Delete), new DialogsActivity$$ExternalSyntheticLambda89(4, listAdapter3, dialogFilter2));
                                    filtersSetupActivity3.showDialog(alertDialog2);
                                    TextView textView = (TextView) alertDialog2.getButton(-1);
                                    if (textView != null) {
                                        textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                    }
                                } else {
                                    FolderBottomSheet.showForDeletion(dialogFilter2.id, filtersSetupActivity3, new PollItemMenu$$ExternalSyntheticLambda14(listAdapter3, 11));
                                }
                                break;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    itemOptions.gravity = 3;
                }
                itemOptions.setScrimViewBackground(filtersSetupActivity.listView.getClipBackground(filterCell2, false));
                itemOptions.show();
                break;
            case 26:
                ((AcquiredGiftsSheet) this.f$0).lambda$new$1$32(view);
                break;
            case 27:
                ((AuctionWearingSheet) this.f$0).lambda$showGiftOfferSheet$15();
                break;
            case 28:
                if (((GiftSheet) this.f$0).balanceView.lastBalance > 0 && (lastFragment = LaunchActivity.getLastFragment()) != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    lastFragment.showAsSheet(new StarsIntroActivity(), bottomSheetParams);
                }
                break;
            default:
                ((GroupCallActivity$CallEncryptionCell$EncryptionCallDialog) this.f$0).dismiss();
                break;
        }
    }
}
