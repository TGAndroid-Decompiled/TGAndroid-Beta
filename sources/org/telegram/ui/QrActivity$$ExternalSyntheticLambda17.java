package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.collection.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.video.VideoAds$$ExternalSyntheticLambda14;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.bots.BotLocation;

public final class QrActivity$$ExternalSyntheticLambda17 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public QrActivity$$ExternalSyntheticLambda17(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        ProfileActivity$$ExternalSyntheticLambda72 profileActivity$$ExternalSyntheticLambda72;
        ArrayList arrayList;
        int iIndexOf;
        String str;
        String[] strArr;
        SpannableStringBuilder spannableStringBuilder;
        int iIndexOf2;
        String str2;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((QrActivity) obj2).onPatternLoaded(34, (Bitmap) obj, true);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                profileActivity.getClass();
                TextCell textCell = (TextCell) ((View) obj);
                BotLocation botLocation = profileActivity.botLocation;
                textCell.setChecked(botLocation.appHasPermission() && botLocation.granted);
                break;
            case 2:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (profileActivity$$ExternalSyntheticLambda72 = profileActivity2.applyBulletin) != null) {
                    profileActivity$$ExternalSyntheticLambda72.run();
                }
                profileActivity2.applyBulletin = null;
                break;
            case 3:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                break;
            case 4:
                ProfileActivity.AnonymousClass15.AnonymousClass1 anonymousClass1 = (ProfileActivity.AnonymousClass15.AnonymousClass1) obj2;
                ProfileActivity.AnonymousClass15 anonymousClass15 = ProfileActivity.AnonymousClass15.this;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                BulletinFactory.createInviteSentBulletin(ProfileActivity.this.getParentActivity(), ProfileActivity.this.contentView, longSparseArray.size(), longSparseArray.size() == 1 ? ((TLRPC.Dialog) longSparseArray.valueAt(0)).id : 0L, anonymousClass1.getThemedColor(Theme.key_undo_background), anonymousClass1.getThemedColor(Theme.key_undo_infoColor)).show();
                break;
            case 5:
                ProfileActivity.AnonymousClass38 anonymousClass38 = (ProfileActivity.AnonymousClass38) obj2;
                ProfileActivity profileActivity3 = ProfileActivity.this;
                LongSparseArray longSparseArray2 = (LongSparseArray) obj;
                BulletinFactory.createInviteSentBulletin(profileActivity3.getParentActivity(), profileActivity3.contentView, longSparseArray2.size(), longSparseArray2.size() == 1 ? ((TLRPC.Dialog) longSparseArray2.valueAt(0)).id : 0L, anonymousClass38.getThemedColor(Theme.key_undo_background), anonymousClass38.getThemedColor(Theme.key_undo_infoColor)).show();
                break;
            case 6:
                ProfileActivity.ListAdapter listAdapter = (ProfileActivity.ListAdapter) obj2;
                listAdapter.getClass();
                ProfileActivity.this.presentFragment(ProfileActivity.of(((Long) obj).longValue()));
                break;
            case 7:
                ((BaseFragment) obj2).presentFragment(new ChangeNameActivity((Theme.ResourcesProvider) obj));
                break;
            case 8:
                ProfileActivity.SearchAdapter searchAdapter = (ProfileActivity.SearchAdapter) obj2;
                searchAdapter.getClass();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                String str3 = (String) obj;
                String str4 = " ";
                String[] strArrSplit = str3.split(" ");
                String[] strArr2 = new String[strArrSplit.length];
                for (int i = 0; i < strArrSplit.length; i++) {
                    String translitString = LocaleController.getInstance().getTranslitString(strArrSplit[i]);
                    strArr2[i] = translitString;
                    if (translitString.equals(strArrSplit[i])) {
                        strArr2[i] = null;
                    }
                }
                int i2 = 0;
                while (true) {
                    ProfileActivity.SearchAdapter.SearchResult[] searchResultArr = searchAdapter.searchArray;
                    int length = searchResultArr.length;
                    BaseFragment baseFragment = searchAdapter.fragment;
                    if (i2 >= length) {
                        String[] strArr3 = strArr2;
                        if (searchAdapter.faqWebPage != null) {
                            ArrayList arrayList5 = searchAdapter.faqSearchArray;
                            int size = arrayList5.size();
                            int i3 = 0;
                            while (i3 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList5.get(i3);
                                String str5 = str4 + faqSearchResult.title.toLowerCase();
                                int i4 = 0;
                                SpannableStringBuilder spannableStringBuilder2 = null;
                                while (true) {
                                    if (i4 < strArrSplit.length) {
                                        if (strArrSplit[i4].length() != 0) {
                                            String str6 = strArrSplit[i4];
                                            arrayList = arrayList5;
                                            int iIndexOf3 = str5.indexOf(str4 + str6);
                                            if (iIndexOf3 >= 0 || (str = strArr3[i4]) == null) {
                                                iIndexOf = iIndexOf3;
                                            } else {
                                                str6 = str;
                                                iIndexOf = str5.indexOf(str4.concat(str));
                                            }
                                            if (iIndexOf >= 0) {
                                                if (spannableStringBuilder2 == null) {
                                                    spannableStringBuilder2 = new SpannableStringBuilder(faqSearchResult.title);
                                                }
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(baseFragment.getThemedColor(Theme.key_windowBackgroundWhiteBlueText4)), iIndexOf, str6.length() + iIndexOf, 33);
                                            }
                                        } else {
                                            arrayList = arrayList5;
                                            str4 = str4;
                                        }
                                        if (spannableStringBuilder2 != null && i4 == strArrSplit.length - 1) {
                                            arrayList3.add(faqSearchResult);
                                            arrayList4.add(spannableStringBuilder2);
                                        }
                                        i4++;
                                        arrayList5 = arrayList;
                                        str4 = str4;
                                        size = size;
                                    } else {
                                        arrayList = arrayList5;
                                    }
                                }
                                i3++;
                                arrayList5 = arrayList;
                                str4 = str4;
                                size = size;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda20(searchAdapter, str3, arrayList2, arrayList3, arrayList4));
                    } else {
                        ProfileActivity.SearchAdapter.SearchResult searchResult = searchResultArr[i2];
                        if (searchResult == null) {
                            strArr = strArr2;
                        } else {
                            StringBuilder sb = new StringBuilder(" ");
                            String str7 = searchResult.searchTitle;
                            sb.append(str7.toLowerCase());
                            String string = sb.toString();
                            int i5 = 0;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            while (i5 < strArrSplit.length) {
                                if (strArrSplit[i5].length() != 0) {
                                    String str8 = strArrSplit[i5];
                                    int iIndexOf4 = string.indexOf(" " + str8);
                                    if (iIndexOf4 >= 0 || (str2 = strArr2[i5]) == null) {
                                        iIndexOf2 = iIndexOf4;
                                    } else {
                                        str8 = str2;
                                        iIndexOf2 = string.indexOf(" ".concat(str2));
                                    }
                                    if (iIndexOf2 >= 0) {
                                        String str9 = str8;
                                        spannableStringBuilder = spannableStringBuilder3 == null ? new SpannableStringBuilder(str7) : spannableStringBuilder3;
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(baseFragment.getThemedColor(Theme.key_windowBackgroundWhiteBlueText4)), iIndexOf2, str9.length() + iIndexOf2, 33);
                                    } else {
                                        strArr = strArr2;
                                    }
                                } else {
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                                if (spannableStringBuilder != null && i5 == strArrSplit.length - 1) {
                                    if (searchResult.guid == 502) {
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= 4) {
                                                i6 = -1;
                                            } else if (UserConfig.getInstance(i6).isClientActivated()) {
                                                i6++;
                                            }
                                        }
                                        if (i6 >= 0) {
                                            arrayList2.add(searchResult);
                                            arrayList4.add(spannableStringBuilder);
                                        }
                                    } else {
                                        arrayList2.add(searchResult);
                                        arrayList4.add(spannableStringBuilder);
                                    }
                                }
                                i5++;
                                spannableStringBuilder3 = spannableStringBuilder;
                                strArr2 = strArr2;
                                str7 = str7;
                                string = string;
                            }
                            strArr = strArr2;
                        }
                        i2++;
                        strArr2 = strArr;
                    }
                    break;
                }
                break;
            case 9:
                ProfileActivity.SearchAdapter searchAdapter2 = (ProfileActivity.SearchAdapter) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                searchAdapter2.faqSearchArray.addAll(arrayList6);
                int i7 = searchAdapter2.currentAccount;
                MessagesController.getInstance(i7).faqSearchArray = arrayList6;
                MessagesController.getInstance(i7).faqWebPage = searchAdapter2.faqWebPage;
                if (!searchAdapter2.searchWas) {
                    searchAdapter2.notifyDataSetChanged();
                }
                break;
            case 10:
                ProfileBirthdayEffect.BirthdayEffectFetcher birthdayEffectFetcher = (ProfileBirthdayEffect.BirthdayEffectFetcher) obj2;
                birthdayEffectFetcher.loadedAssets.add((ProfileBirthdayEffect.ImageReceiverAsset) obj);
                birthdayEffectFetcher.checkWhenLoaded();
                break;
            case 11:
                QrActivity.QrView qrView = (QrActivity.QrView) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    qrView.getClass();
                } else {
                    int i8 = qrView.linkExpires;
                    if (i8 != 0 && i8 < tL_exportedContactToken.expires) {
                        try {
                            Vibrator vibrator = (Vibrator) qrView.getContext().getSystemService("vibrator");
                            if (vibrator != null) {
                                vibrator.vibrate(100L);
                            }
                            break;
                        } catch (Exception unused) {
                            try {
                                qrView.performHapticFeedback(0, 2);
                                break;
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    qrView.linkExpires = tL_exportedContactToken.expires;
                    qrView.setData(tL_exportedContactToken.url, null, false, true);
                }
                break;
            case 12:
                ReportBottomSheet.Page page = (ReportBottomSheet.Page) ((View[]) obj2)[0];
                page.sponsoredOption = null;
                page.option = (TLRPC.TL_reportResultChooseOption) obj;
                page.commentOption = null;
                page.listView.adapter.update(false);
                break;
            case 13:
                ReportBottomSheet.Page page2 = (ReportBottomSheet.Page) ((View[]) obj2)[0];
                page2.sponsoredOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                page2.option = null;
                page2.commentOption = null;
                page2.listView.adapter.update(false);
                break;
            case 14:
                ((ReportBottomSheet.Page) ((View[]) obj2)[0]).setOption((TLRPC.TL_reportResultAddComment) obj);
                break;
            case 15:
                ((VideoAds$$ExternalSyntheticLambda14) obj2).run();
                ((BulletinFactory) obj).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
                break;
            case 16:
                BulletinFactory.of((BaseFragment) obj2).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
                AndroidUtilities.runOnUIThread((ShareAlert$$ExternalSyntheticLambda29) obj);
                break;
            case 17:
                ((SecretMediaViewer) obj2).disableShowCheck = false;
                ((PhotoViewer.PlaceProviderObject) obj).imageReceiver.setVisible(false, true);
                break;
            case 18:
                ((SecretMediaViewer) ((PhotoViewer.AnonymousClass14) obj2).this$0).preparePlayer((File) obj);
                break;
            case 19:
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) obj2;
                selectAnimatedEmojiDialog.search(null, false, false);
                ((BaseFragment) obj).presentFragment(new StickersActivity(5, selectAnimatedEmojiDialog.frozenEmojiPacks));
                SelectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1 selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1 = selectAnimatedEmojiDialog.dismiss;
                if (selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1 != null) {
                    selectAnimatedEmojiDialog$SelectAnimatedEmojiDialogWindow$$ExternalSyntheticLambda1.run();
                }
                break;
            case 20:
                SettingsActivity settingsActivity = (SettingsActivity) obj2;
                settingsActivity.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                BulletinFactory.of(settingsActivity).createCopyLinkBulletin(false).show();
                break;
            case 21:
                ((SettingsActivity) obj2).lambda$onClick$13((TLRPC.TL_attachMenuBot) obj);
                break;
            case 22:
                SettingsActivity.AnonymousClass8 anonymousClass8 = (SettingsActivity.AnonymousClass8) obj2;
                SettingsActivity settingsActivity2 = SettingsActivity.this;
                LongSparseArray longSparseArray3 = (LongSparseArray) obj;
                BulletinFactory.createInviteSentBulletin(settingsActivity2.getParentActivity(), settingsActivity2.contentView, longSparseArray3.size(), longSparseArray3.size() == 1 ? ((TLRPC.Dialog) longSparseArray3.valueAt(0)).id : 0L, anonymousClass8.getThemedColor(Theme.key_undo_background), anonymousClass8.getThemedColor(Theme.key_undo_infoColor)).show();
                break;
            case 23:
                BaseFragment baseFragment2 = (BaseFragment) obj2;
                new StakedDiceSheet(baseFragment2.getCurrentAccount(), baseFragment2.getContext(), (ArticleViewer$$ExternalSyntheticLambda21) obj, baseFragment2.getResourceProvider()).show();
                break;
            case 24:
                BotStarsController.ChannelConnectedBots channelConnectedBots = (BotStarsController.ChannelConnectedBots) obj2;
                channelConnectedBots.reqId = 0;
                TLObject tLObject = (TLObject) obj;
                boolean z = tLObject instanceof TL_payments.connectedStarRefBots;
                int i9 = channelConnectedBots.currentAccount;
                if (z) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i9).putUsers(connectedstarrefbots.users, false);
                    int i10 = channelConnectedBots.count;
                    ArrayList arrayList7 = channelConnectedBots.bots;
                    if (i10 <= 0) {
                        arrayList7.clear();
                    }
                    channelConnectedBots.count = connectedstarrefbots.count;
                    arrayList7.addAll(connectedstarrefbots.connected_bots);
                    channelConnectedBots.endReached = connectedstarrefbots.connected_bots.isEmpty() || arrayList7.size() >= channelConnectedBots.count;
                } else {
                    channelConnectedBots.error = true;
                    channelConnectedBots.endReached = true;
                }
                channelConnectedBots.loading = false;
                NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(channelConnectedBots.dialogId));
                break;
            case 25:
                BotStarsController.ChannelSuggestedBots channelSuggestedBots = (BotStarsController.ChannelSuggestedBots) obj2;
                channelSuggestedBots.getClass();
                TLObject tLObject2 = (TLObject) obj;
                boolean z2 = tLObject2 instanceof TL_payments.suggestedStarRefBots;
                int i11 = channelSuggestedBots.currentAccount;
                if (z2) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i11).putUsers(suggestedstarrefbots.users, false);
                    int i12 = channelSuggestedBots.count;
                    ArrayList arrayList8 = channelSuggestedBots.bots;
                    if (i12 <= 0) {
                        arrayList8.clear();
                    }
                    channelSuggestedBots.count = suggestedstarrefbots.count;
                    arrayList8.addAll(suggestedstarrefbots.suggested_bots);
                    channelSuggestedBots.lastOffset = suggestedstarrefbots.next_offset;
                    channelSuggestedBots.endReached = suggestedstarrefbots.suggested_bots.isEmpty() || arrayList8.size() >= channelSuggestedBots.count;
                } else {
                    channelSuggestedBots.error = true;
                    channelSuggestedBots.endReached = true;
                }
                channelSuggestedBots.loading = false;
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(channelSuggestedBots.dialogId));
                break;
            case 26:
                ((StarGiftSheet) obj2).lambda$repostStory$41((Long) obj);
                break;
            case 27:
                StarGiftSheet starGiftSheet = (StarGiftSheet) obj2;
                starGiftSheet.getClass();
                if (((StarsController) obj).balanceLoaded) {
                    starGiftSheet.button.setLoading(false);
                    starGiftSheet.doUpgrade();
                } else {
                    Bulletin bulletinCreateSimpleBulletinWithIconSize = starGiftSheet.getBulletinFactory().createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    bulletinCreateSimpleBulletinWithIconSize.ignoreDetach = true;
                    bulletinCreateSimpleBulletinWithIconSize.show();
                }
                break;
            case 28:
                ((StarGiftSheet) obj2).getClass();
                BaseFragment baseFragmentCreate = StatisticActivity.create((TLRPC.Chat) obj, true);
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    safeLastFragment.showAsSheet(baseFragmentCreate, bottomSheetParams);
                    break;
                }
                break;
            default:
                ((StarGiftSheet) obj2).getBulletinFactory().showForError(false, (TLRPC.TL_error) obj);
                break;
        }
    }

    public QrActivity$$ExternalSyntheticLambda17(ShareAlert shareAlert, LongSparseArray longSparseArray, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = shareAlert;
        this.f$1 = longSparseArray;
    }
}
