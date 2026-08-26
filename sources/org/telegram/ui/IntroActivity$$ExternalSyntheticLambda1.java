package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda7;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.LanguageCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.StorageDiagramView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Gifts.AcquiredGiftsSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Storage.CacheModel;
import org.telegram.ui.Stories.StoriesListPlaceProvider;

public final class IntroActivity$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public IntroActivity$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        int i;
        HashSet hashSet;
        TL_stars.SavedStarGift savedStarGift;
        String string;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        long j = 0;
        int i2 = 4;
        int i3 = 5;
        int i4 = 2;
        int i5 = 0;
        int i6 = 1;
        switch (this.$r8$classId) {
            case 0:
                IntroActivity introActivity = (IntroActivity) this.f$0;
                introActivity.getClass();
                if (!DialogsActivity.switchingTheme) {
                    DialogsActivity.switchingTheme = true;
                    boolean zIsDark = Theme.currentTheme.isDark();
                    boolean z = !zIsDark;
                    Theme.ThemeInfo themeInfo = !zIsDark ? (Theme.ThemeInfo) Theme.themesDict.get("Night") : (Theme.ThemeInfo) Theme.themesDict.get("Blue");
                    Theme.selectedAutoNightType = 0;
                    Theme.saveAutoNightThemeConfig();
                    Theme.cancelAutoNightThemeCallbacks();
                    RLottieDrawable rLottieDrawable = introActivity.darkThemeDrawable;
                    rLottieDrawable.setCustomEndFrame(!zIsDark ? rLottieDrawable.metaData[0] - 1 : 0);
                    RLottieImageView rLottieImageView = (RLottieImageView) this.f$1;
                    rLottieImageView.playAnimation();
                    int[] iArr = {(rLottieImageView.getMeasuredWidth() / 2) + i, (rLottieImageView.getMeasuredHeight() / 2) + i};
                    rLottieImageView.getLocationInWindow(iArr);
                    int i7 = iArr[0];
                    int i8 = iArr[1];
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, iArr, -1, Boolean.valueOf(z), rLottieImageView);
                    rLottieImageView.setContentDescription(LocaleController.getString(!zIsDark ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
                    break;
                }
                break;
            case 1:
                int i9 = 0;
                while (true) {
                    DialogCacheBottomSheet dialogCacheBottomSheet = (DialogCacheBottomSheet) this.f$0;
                    StorageDiagramView.ClearViewData[] clearViewDataArr = dialogCacheBottomSheet.clearViewData;
                    if (i9 >= clearViewDataArr.length) {
                        CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                        int iIntValue = ((Integer) checkBoxCell.getTag()).intValue();
                        StorageDiagramView.ClearViewData clearViewData = clearViewDataArr[iIntValue];
                        boolean z2 = clearViewData.clear;
                        boolean z3 = !z2;
                        if (z2 != z3) {
                            clearViewData.clear = z3;
                            clearViewData.firstDraw = true;
                        }
                        checkBoxCell.setChecked(clearViewData.clear, true);
                        boolean z4 = clearViewDataArr[iIntValue].clear;
                        CacheModel cacheModel = (CacheModel) this.f$1;
                        ArrayList arrayList2 = cacheModel.media;
                        if (iIntValue != 0) {
                            if (iIntValue == 1) {
                                cacheModel.allVideosSelected = z4;
                            } else if (iIntValue == 2) {
                                arrayList = cacheModel.documents;
                                cacheModel.allDocumentsSelected = z4;
                            } else if (iIntValue == 3) {
                                arrayList = cacheModel.music;
                                cacheModel.allMusicSelected = z4;
                            } else if (iIntValue == 4) {
                                arrayList = cacheModel.voice;
                                cacheModel.allVoiceSelected = z4;
                            } else {
                                arrayList = iIntValue == 7 ? cacheModel.stories : null;
                            }
                            if (arrayList != null) {
                                for (i = 0; i < arrayList.size(); i++) {
                                    if (((CacheModel.FileInfo) arrayList.get(i)).type == iIntValue) {
                                        hashSet = cacheModel.selectedFiles;
                                        if (z4) {
                                            if (!hashSet.contains(arrayList.get(i))) {
                                                hashSet.add((CacheModel.FileInfo) arrayList.get(i));
                                                cacheModel.incSize((CacheModel.FileInfo) arrayList.get(i), true);
                                            }
                                        } else if (hashSet.contains(arrayList.get(i))) {
                                            hashSet.remove(arrayList.get(i));
                                            cacheModel.incSize((CacheModel.FileInfo) arrayList.get(i), false);
                                        }
                                    }
                                }
                            }
                            dialogCacheBottomSheet.cachedMediaLayout.update();
                            DialogCacheBottomSheet.AnonymousClass2 anonymousClass2 = dialogCacheBottomSheet.circleDiagramView;
                            dialogCacheBottomSheet.button.setSize(anonymousClass2.updateDescription(), true);
                            anonymousClass2.update(true);
                        } else {
                            cacheModel.allPhotosSelected = z4;
                        }
                        arrayList = arrayList2;
                        if (arrayList != null) {
                            while (i < arrayList.size()) {
                                if (((CacheModel.FileInfo) arrayList.get(i)).type == iIntValue) {
                                    hashSet = cacheModel.selectedFiles;
                                    if (z4) {
                                        if (!hashSet.contains(arrayList.get(i))) {
                                            hashSet.add((CacheModel.FileInfo) arrayList.get(i));
                                            cacheModel.incSize((CacheModel.FileInfo) arrayList.get(i), true);
                                        }
                                    } else if (hashSet.contains(arrayList.get(i))) {
                                        hashSet.remove(arrayList.get(i));
                                        cacheModel.incSize((CacheModel.FileInfo) arrayList.get(i), false);
                                    }
                                }
                            }
                        }
                        dialogCacheBottomSheet.cachedMediaLayout.update();
                        DialogCacheBottomSheet.AnonymousClass2 anonymousClass3 = dialogCacheBottomSheet.circleDiagramView;
                        dialogCacheBottomSheet.button.setSize(anonymousClass3.updateDescription(), true);
                        anonymousClass3.update(true);
                    } else {
                        StorageDiagramView.ClearViewData clearViewData2 = clearViewDataArr[i9];
                        i9++;
                    }
                    break;
                }
                break;
            case 2:
                DialogsActivity dialogsActivity = (DialogsActivity) this.f$0;
                dialogsActivity.getClass();
                ((ItemOptions) this.f$1).dismiss();
                dialogsActivity.presentFragment(new ProxyListActivity());
                break;
            case 3:
                ((DialogsActivity) this.f$0).lambda$createView$28((AlertDialog[]) this.f$1);
                break;
            case 4:
                ((ActionBarPopupWindow.ActionBarPopupWindowLayout[]) this.f$0)[0].getSwipeBack().openForeground(((int[]) this.f$1)[0]);
                break;
            case 5:
                DialogsActivity dialogsActivity2 = (DialogsActivity) this.f$0;
                dialogsActivity2.performSelectedDialogsAction((ArrayList) this.f$1, 102, false, false, null);
                dialogsActivity2.finishPreviewFragment();
                break;
            case 6:
                ((DialogsActivity) this.f$0).lambda$updateDialogsHint$44((BirthdayController.BirthdayState) this.f$1);
                break;
            case 7:
                DialogsActivity dialogsActivity3 = (DialogsActivity) this.f$0;
                dialogsActivity3.getClass();
                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda8(19, dialogsActivity3, (String) this.f$1), 250L);
                break;
            case 8:
                FiltersSetupActivity.ListAdapter listAdapter = (FiltersSetupActivity.ListAdapter) this.f$0;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((FiltersSetupActivity.SuggestedFilterCell) this.f$1).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.id = 2;
                while (FiltersSetupActivity.this.getMessagesController().dialogFiltersById.get(dialogFilter.id) != null) {
                    dialogFilter.id++;
                }
                dialogFilter.order = FiltersSetupActivity.this.getMessagesController().getDialogFilters().size();
                dialogFilter.unreadCount = -1;
                dialogFilter.pendingUnreadCount = -1;
                int i10 = 0;
                while (i10 < 2) {
                    ArrayList<TLRPC.InputPeer> arrayList3 = i10 == 0 ? suggestedFilter.filter.include_peers : suggestedFilter.filter.exclude_peers;
                    ArrayList<Long> arrayList4 = i10 == 0 ? dialogFilter.alwaysShow : dialogFilter.neverShow;
                    int size = arrayList3.size();
                    int iM = 0;
                    while (iM < size) {
                        TLRPC.InputPeer inputPeer = arrayList3.get(iM);
                        long j2 = j;
                        long j3 = inputPeer.user_id;
                        if (j3 == j2) {
                            long j4 = inputPeer.chat_id;
                            if (j4 == j2) {
                                j4 = inputPeer.channel_id;
                            }
                            j3 = -j4;
                        }
                        iM = MessagesController$$ExternalSyntheticOutline2.m(j3, arrayList4, iM, 1);
                        j = j2;
                    }
                    i10++;
                }
                TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                if (dialogFilter2.groups) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                }
                if (dialogFilter2.bots) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_BOTS;
                }
                if (dialogFilter2.contacts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                }
                if (dialogFilter2.non_contacts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                }
                if (dialogFilter2.broadcasts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                }
                if (dialogFilter2.exclude_archived) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                }
                if (dialogFilter2.exclude_read) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                }
                if (dialogFilter2.exclude_muted) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                }
                FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, FiltersSetupActivity.this, new LaunchActivity$$ExternalSyntheticLambda13(5, listAdapter, suggestedFilter));
                break;
            case 9:
                Browser.openUrl((Activity) this.f$0, ((TL_fragment.TL_collectibleInfo) this.f$1).url);
                break;
            case 10:
                ((OAuthSheet$$ExternalSyntheticLambda2) this.f$0).run();
                ((BottomSheet) this.f$1).lambda$showGiftOfferSheet$15();
                break;
            case 11:
                ((AcquiredGiftsSheet) this.f$0).lambda$fillItems$2((TL_stars.TL_StarGiftAuctionAcquiredGift) this.f$1);
                break;
            case 12:
                ProfileGiftsContainer.SelectGiftsBottomSheet selectGiftsBottomSheet = (ProfileGiftsContainer.SelectGiftsBottomSheet) this.f$0;
                HashSet hashSet2 = selectGiftsBottomSheet.selectedGiftIds;
                if (!hashSet2.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        long jLongValue = ((Long) it.next()).longValue();
                        ArrayList arrayList6 = selectGiftsBottomSheet.list.gifts;
                        int size2 = arrayList6.size();
                        int i11 = 0;
                        do {
                            if (i11 < size2) {
                                Object obj = arrayList6.get(i11);
                                i11++;
                                savedStarGift = (TL_stars.SavedStarGift) obj;
                                int i12 = savedStarGift.msg_id;
                                if (i12 == 0 || i12 != jLongValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                            if (savedStarGift != null) {
                                arrayList5.add(savedStarGift);
                            }
                        } while (savedStarGift.saved_id != jLongValue);
                        if (savedStarGift != null) {
                            arrayList5.add(savedStarGift);
                        }
                    }
                    ((CacheControlActivity$$ExternalSyntheticLambda23) this.f$1).run(arrayList5);
                    selectGiftsBottomSheet.lambda$showGiftOfferSheet$15();
                    break;
                }
                break;
            case 13:
                ProfileGiftsContainer.SelectGiftsBottomSheet selectGiftsBottomSheet2 = ProfileGiftsContainer.SelectGiftsBottomSheet.this;
                StarsController.GiftsList giftsList = selectGiftsBottomSheet2.list;
                giftsList.sort_by_date = !giftsList.sort_by_date;
                ((SendMessagesHelper$$ExternalSyntheticLambda7) this.f$1).run();
                selectGiftsBottomSheet2.list.invalidate(true);
                break;
            case 14:
                ResaleGiftsFragment resaleGiftsFragment = (ResaleGiftsFragment) this.f$0;
                resaleGiftsFragment.getClass();
                if (((StarsIntroActivity.StarsBalanceView) this.f$1).lastBalance > 0) {
                    resaleGiftsFragment.presentFragment(new StarsIntroActivity());
                    break;
                }
                break;
            case 15:
                ((ResaleGiftsFragment.SelectGiftSheet) this.f$0).lambda$new$3((ResaleGiftsFragment.SelectGiftSheet.State) this.f$1);
                break;
            case 16:
                GroupCallActivity groupCallActivity = GroupCallActivity.this;
                ChatObject.Call call = groupCallActivity.call;
                if (call != null && call.recording) {
                    groupCallActivity.showRecordHint((TextView) this.f$1);
                    break;
                }
                break;
            case 17:
                QrActivity.AnonymousClass2 anonymousClass4 = (QrActivity.AnonymousClass2) this.f$0;
                anonymousClass4.getClass();
                new GroupCallActivity$CallEncryptionCell$EncryptionCallDialog((Activity) this.f$1, anonymousClass4).show();
                break;
            case 18:
                KeepMediaPopupView keepMediaPopupView = (KeepMediaPopupView) this.f$0;
                keepMediaPopupView.window.dismiss();
                boolean zIsEmpty = keepMediaPopupView.exceptions.isEmpty();
                BaseFragment baseFragment = (BaseFragment) this.f$1;
                if (zIsEmpty) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i13 = keepMediaPopupView.currentType;
                    if (i13 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i13 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    DialogsActivity dialogsActivity4 = new DialogsActivity(bundle);
                    dialogsActivity4.delegate = new DialogsActivity$$ExternalSyntheticLambda89(keepMediaPopupView, dialogsActivity4);
                    baseFragment.presentFragment(dialogsActivity4);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("type", keepMediaPopupView.currentType);
                    CacheChatsExceptionsFragment cacheChatsExceptionsFragment = new CacheChatsExceptionsFragment(bundle2);
                    cacheChatsExceptionsFragment.exceptionsDialogs = keepMediaPopupView.exceptions;
                    cacheChatsExceptionsFragment.updateRows$24();
                    baseFragment.presentFragment(cacheChatsExceptionsFragment);
                }
                break;
            case 19:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                Integer num = (Integer) view.getTag();
                ((LocaleController.LocaleInfo[]) this.f$0)[0] = ((LanguageCell) view).getCurrentLocale();
                int i14 = 0;
                while (true) {
                    LanguageCell[] languageCellArr = (LanguageCell[]) this.f$1;
                    if (i14 < languageCellArr.length) {
                        languageCellArr[i14].radioButton.setChecked(i14 == num.intValue(), true);
                        i14++;
                    }
                    break;
                }
                break;
            case 20:
                AlertsCreator.createDatePickerDialog((Context) this.f$1, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new LinkEditActivity$$ExternalSyntheticLambda3((LinkEditActivity) this.f$0, i4));
                break;
            case 21:
                LinkEditActivity linkEditActivity = (LinkEditActivity) this.f$0;
                if (linkEditActivity.inviteToEdit == null) {
                    LinkEditActivity.AnonymousClass7 anonymousClass7 = linkEditActivity.approveCell;
                    if (anonymousClass7.checkBox.isChecked) {
                        int i15 = -linkEditActivity.shakeDp;
                        linkEditActivity.shakeDp = i15;
                        AndroidUtilities.shakeViewSpring(anonymousClass7, i15);
                    } else {
                        TextCheckCell textCheckCell = (TextCheckCell) view;
                        textCheckCell.setChecked(!textCheckCell.checkBox.isChecked);
                        LinkEditActivity.AnonymousClass8 anonymousClass8 = linkEditActivity.subEditPriceCell;
                        Switch r3 = textCheckCell.checkBox;
                        anonymousClass8.setVisibility(r3.isChecked ? 0 : 8);
                        Runnable[] runnableArr = (Runnable[]) this.f$1;
                        AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                        if (r3.isChecked) {
                            linkEditActivity.approveCell.setChecked(false);
                            linkEditActivity.approveCell.setCheckBoxIcon(R.drawable.permission_locked);
                            linkEditActivity.approveHintCell.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                            LinkEditActivity$$ExternalSyntheticLambda7 linkEditActivity$$ExternalSyntheticLambda7 = new LinkEditActivity$$ExternalSyntheticLambda7(linkEditActivity, i6);
                            runnableArr[0] = linkEditActivity$$ExternalSyntheticLambda7;
                            AndroidUtilities.runOnUIThread(linkEditActivity$$ExternalSyntheticLambda7, 60L);
                        } else {
                            linkEditActivity.approveCell.setCheckBoxIcon(0);
                            linkEditActivity.approveHintCell.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                            LinkEditActivity$$ExternalSyntheticLambda7 linkEditActivity$$ExternalSyntheticLambda8 = new LinkEditActivity$$ExternalSyntheticLambda7(linkEditActivity, i4);
                            runnableArr[0] = linkEditActivity$$ExternalSyntheticLambda8;
                            AndroidUtilities.runOnUIThread(linkEditActivity$$ExternalSyntheticLambda8);
                        }
                    }
                    break;
                }
                break;
            case 22:
                LocationActivity locationActivity = (LocationActivity) this.f$0;
                locationActivity.openDirections((LocationActivity.LiveLocation) this.f$1);
                LocationActivity.AnonymousClass8 anonymousClass9 = locationActivity.popupWindow;
                if (anonymousClass9 != null) {
                    anonymousClass9.dismiss();
                }
                break;
            case 23:
                LocationActivity locationActivity2 = LocationActivity.this;
                locationActivity2.getClass();
                locationActivity2.delegate.didSelectLocation(((LocationActivity.VenueLocation) this.f$1).venue, locationActivity2.locationType, true, 0, 0L);
                locationActivity2.finishFragment();
                break;
            case 24:
                LoginActivity.LoginActivityEmailCodeView loginActivityEmailCodeView = (LoginActivity.LoginActivityEmailCodeView) this.f$0;
                String string2 = loginActivityEmailCodeView.currentParams.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
                int iIndexOf = string2.indexOf(42);
                int iLastIndexOf = string2.lastIndexOf(42);
                if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                    textStyleRun.flags |= 256;
                    textStyleRun.start = iIndexOf;
                    int i16 = iLastIndexOf + 1;
                    textStyleRun.end = i16;
                    spannableStringBuilder.setSpan(new TextStyleSpan(textStyleRun, 0), iIndexOf, i16, 0);
                }
                AlertDialog.Builder builder = new AlertDialog.Builder((Context) this.f$1, 0, null);
                String string3 = LocaleController.getString(R.string.LoginEmailResetTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string3;
                SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i17 = loginActivityEmailCodeView.resetAvailablePeriod;
                int i18 = i17 / 86400;
                int i19 = i17 % 86400;
                int i20 = i19 / 3600;
                int iMax = (i19 % 3600) / 60;
                if (i18 == 0 && i20 == 0) {
                    iMax = Math.max(1, iMax);
                }
                if (i18 != 0 && i20 != 0) {
                    string = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i18, new Object[0]), LocaleController.formatPluralString("Hours", i20, new Object[0]));
                } else if (i20 != 0 && iMax != 0) {
                    string = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i20, new Object[0]), LocaleController.formatPluralString("Minutes", iMax, new Object[0]));
                } else if (i18 != 0) {
                    string = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i18, new Object[0]));
                } else {
                    string = i20 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i18, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", iMax, new Object[0]));
                }
                alertDialog.message = AndroidUtilities.formatSpannable(spannableStringBuilderReplaceTags, spannableStringBuilder, string);
                builder.setPositiveButton(LocaleController.getString(R.string.LoginEmailResetButton), new PhotoViewer$$ExternalSyntheticLambda115(loginActivityEmailCodeView, i2));
                ArticleViewer.IBlock.CC.m(R.string.Cancel, builder, (AlertDialog.OnButtonClickListener) null);
                break;
            case 25:
                LoginActivity.LoginActivityPasswordView loginActivityPasswordView = (LoginActivity.LoginActivityPasswordView) this.f$0;
                LoginActivity loginActivity = LoginActivity.this;
                if (loginActivity.radialProgressView.getTag() == null) {
                    if (loginActivityPasswordView.currentPassword.has_recovery) {
                        loginActivity.needShowProgress(0, true);
                        ConnectionsManager.getInstance(((BaseFragment) loginActivity).currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda5(loginActivityPasswordView, i5), 10);
                    } else {
                        AndroidUtilities.hideKeyboard(loginActivityPasswordView.codeField);
                        AlertDialog.Builder builder2 = new AlertDialog.Builder((Context) this.f$1, 0, null);
                        String string4 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        AlertDialog alertDialog2 = builder2.alertDialog;
                        alertDialog2.title = string4;
                        alertDialog2.message = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                        builder2.setPositiveButton(LocaleController.getString(R.string.Close), null);
                        builder2.setNegativeButton(LocaleController.getString(R.string.ResetAccount), new PhotoViewer$$ExternalSyntheticLambda115(loginActivityPasswordView, i3));
                        builder2.show();
                    }
                    break;
                }
                break;
            case 26:
                LoginActivity.LoginActivitySmsView loginActivitySmsView = (LoginActivity.LoginActivitySmsView) this.f$0;
                Context context = (Context) this.f$1;
                Bundle bundle3 = loginActivitySmsView.nextCodeParams;
                if (bundle3 != null && (tL_auth_sentCode = loginActivitySmsView.nextCodeAuth) != null) {
                    LoginActivity.this.fillNextCodeParams(bundle3, tL_auth_sentCode, true);
                    break;
                } else if (!loginActivitySmsView.nextPressed) {
                    LoginActivity.LoginActivitySmsView.AnonymousClass3 anonymousClass5 = loginActivitySmsView.timeText;
                    if ((anonymousClass5 == null || anonymousClass5.getVisibility() == 8) && !loginActivitySmsView.isResendingCode) {
                        if (loginActivitySmsView.nextType == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = loginActivitySmsView.requestPhone;
                            tL_auth_reportMissingCode.phone_code_hash = loginActivitySmsView.phoneHash;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            LoginActivity.this.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog.Builder builder3 = new AlertDialog.Builder(context, 0, null);
                            builder3.alertDialog.title = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            builder3.alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, loginActivitySmsView.phone));
                            builder3.setNeutralButton(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new DialogsActivity$$ExternalSyntheticLambda89(27, loginActivitySmsView, context));
                            builder3.setPositiveButton(LocaleController.getString(R.string.Close), null);
                            builder3.setNegativeButton(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda19(loginActivitySmsView, 1));
                            builder3.show();
                            break;
                        } else if (LoginActivity.this.radialProgressView.getTag() == null) {
                            loginActivitySmsView.resendCode();
                            break;
                        }
                    }
                }
                break;
            case 27:
                LoginActivity.PhoneView phoneView = (LoginActivity.PhoneView) this.f$0;
                Toast toast = phoneView.lastTitleToast;
                if (toast != null) {
                    toast.cancel();
                    phoneView.lastTitleToast = null;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (phoneView.titleClickCount > 0 && jCurrentTimeMillis - phoneView.lastTitleClick > 1500) {
                    phoneView.titleClickCount = 0;
                }
                int i21 = phoneView.titleClickCount + 1;
                phoneView.titleClickCount = i21;
                phoneView.lastTitleClick = jCurrentTimeMillis;
                if (i21 >= 5) {
                    phoneView.titleClickCount = 0;
                    phoneView.lastTitleClick = 0L;
                    AlertDialog.Builder builder4 = new AlertDialog.Builder(phoneView.getContext(), 0, null);
                    builder4.alertDialog.title = LocaleController.getString(R.string.SettingsDebug);
                    builder4.setItems(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new DialogsActivity$$ExternalSyntheticLambda124(phoneView, i4));
                    builder4.show();
                } else if (i21 > 1) {
                    Toast toastMakeText = Toast.makeText((Context) this.f$1, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i21, new Object[0]), 0);
                    phoneView.lastTitleToast = toastMakeText;
                    toastMakeText.show();
                }
                break;
            case 28:
                MessageStatisticActivity messageStatisticActivity = MessageStatisticActivity.this;
                MessageObject messageObject = (MessageObject) this.f$1;
                if (messageObject != null && messageObject.isStory() && (messageObject.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.StoryNotFound, BulletinFactory.of(messageStatisticActivity), R.raw.story_bomb1, 36);
                } else {
                    messageStatisticActivity.getOrCreateStoryViewer().open(UserConfig.selectedAccount, messageStatisticActivity.getParentActivity(), messageObject.storyItem, new StoriesListPlaceProvider(messageStatisticActivity.listView, false));
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f$0;
                passcodeActivity.getClass();
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f$1;
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.passwordEditText.getSelectionStart();
                int selectionEnd = passcodeActivity.passwordEditText.getSelectionEnd();
                passcodeActivity.passwordEditText.setInputType((atomicBoolean.get() ? 144 : 128) | 1);
                passcodeActivity.passwordEditText.setSelection(selectionStart, selectionEnd);
                passcodeActivity.passwordButton.setColorFilter(Theme.getColor(null, atomicBoolean.get() ? Theme.key_windowBackgroundWhiteInputFieldActivated : Theme.key_windowBackgroundWhiteHintText, false));
                break;
        }
    }
}
