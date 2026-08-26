package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.voip.VoIPPiPView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView$$ExternalSyntheticLambda3;
import org.telegram.ui.Stories.recorder.StoryLinkSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.TimelineView;
import org.telegram.ui.bots.AffiliateProgramFragment;

public final class TodoItemMenu$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public TodoItemMenu$$ExternalSyntheticLambda9(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        RecyclerListView.Holder holder;
        int i = 3;
        int i2 = 2;
        int i3 = 0;
        int i4 = 1;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                TodoItemMenu todoItemMenu = (TodoItemMenu) obj2;
                todoItemMenu.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                todoItemMenu.dismiss(true);
                break;
            case 1:
                StoryLinkSheet storyLinkSheet = (StoryLinkSheet) obj2;
                ClipboardManager clipboardManager = (ClipboardManager) storyLinkSheet.getContext().getSystemService("clipboard");
                EditTextCell editTextCell = storyLinkSheet.urlEditText;
                if (!TextUtils.isEmpty(editTextCell.editText.getText())) {
                    EditTextCell.AnonymousClass2 anonymousClass2 = editTextCell.editText;
                    if (TextUtils.equals(anonymousClass2.getText(), "https://") || TextUtils.isEmpty(anonymousClass2.getText().toString())) {
                        if (clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                            i3 = 1;
                        }
                    }
                } else if (clipboardManager != null) {
                    i3 = 1;
                }
                OKLCH.m(((TextView) obj).animate().alpha(i3 != 0 ? 1.0f : 0.0f).scaleX(i3 != 0 ? 1.0f : 0.7f).scaleY(i3 == 0 ? 0.7f : 1.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 300L);
                break;
            case 2:
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = (StoryPrivacyBottomSheet) obj2;
                storyPrivacyBottomSheet.getClass();
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) obj).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda9(i, storyPrivacyBottomSheet, smallGroupsParticipantsCount));
                    break;
                }
                break;
            case 3:
                StoryPrivacyBottomSheet storyPrivacyBottomSheet2 = (StoryPrivacyBottomSheet) obj2;
                if (storyPrivacyBottomSheet2.smallChatsParticipantsCount == null) {
                    storyPrivacyBottomSheet2.smallChatsParticipantsCount = new HashMap();
                }
                storyPrivacyBottomSheet2.smallChatsParticipantsCount.putAll((HashMap) obj);
                break;
            case 4:
                StoryRecorder storyRecorder = (StoryRecorder) obj2;
                storyRecorder.getClass();
                ((ButtonWithCounterView$$ExternalSyntheticLambda3) obj).run();
                storyRecorder.upload$1();
                break;
            case 5:
                StoryRecorder storyRecorder2 = (StoryRecorder) obj2;
                storyRecorder2.animateGalleryListView(false);
                AndroidUtilities.cancelRunOnUIThread(storyRecorder2.afterPlayerAwait);
                storyRecorder2.afterPlayerAwait = null;
                storyRecorder2.awaitingPlayer = false;
                ((Runnable) obj).run();
                break;
            case 6:
                TimelineView.VideoThumbsLoader videoThumbsLoader = (TimelineView.VideoThumbsLoader) obj2;
                if (videoThumbsLoader.loading && !videoThumbsLoader.destroyed) {
                    videoThumbsLoader.frames.add(new TimelineView.VideoThumbsLoader.BitmapFrame(videoThumbsLoader, (Bitmap) obj));
                    videoThumbsLoader.loading = false;
                    TimelineView.this.invalidate();
                    break;
                }
                break;
            case 7:
                int[] iArr = (int[]) obj2;
                int i5 = iArr[0];
                if (i5 != 0) {
                    ((ConnectionsManager) obj).cancelRequest(i5, true);
                    iArr[0] = 0;
                }
                break;
            case 8:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                themeActivity.getMessagesController().setContentSettings(true);
                View view = (View) obj;
                if (view instanceof TextCheckCell) {
                    ((TextCheckCell) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                }
                break;
            case 9:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                themeActivity2.getClass();
                String str = (String) obj;
                Theme.autoNightCityName = str;
                if (str == null) {
                    Theme.autoNightCityName = String.format("(%.06f, %.06f)", Double.valueOf(Theme.autoNightLocationLatitude), Double.valueOf(Theme.autoNightLocationLongitude));
                }
                Theme.saveAutoNightThemeConfig();
                RecyclerListView recyclerListView = themeActivity2.listView;
                if (recyclerListView != null && (holder = (RecyclerListView.Holder) recyclerListView.findViewHolderForAdapterPosition(themeActivity2.scheduleUpdateLocationRow)) != null) {
                    View view2 = holder.itemView;
                    if (view2 instanceof TextSettingsCell) {
                        ((TextSettingsCell) view2).setTextAndValue(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), Theme.autoNightCityName, false, false);
                    }
                    break;
                }
                break;
            case 10:
                ThemePreviewActivity themePreviewActivity = (ThemePreviewActivity) obj2;
                if (themePreviewActivity.colorType == 3) {
                    ((SharedPreferences) obj).edit().putBoolean("bganimationhint", true).commit();
                    themePreviewActivity.animationHint.showForView(themePreviewActivity.messagesCheckBoxView[0], true);
                    break;
                }
                break;
            case 11:
                ((ThemeSetUrlActivity) obj2).lambda$checkUrl$8((String) obj);
                break;
            case 12:
                ((ThemeSetUrlActivity) obj2).lambda$saveTheme$10((TLRPC.TL_theme) obj);
                break;
            case 13:
                TodoItemMenu todoItemMenu2 = (TodoItemMenu) obj2;
                todoItemMenu2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                todoItemMenu2.dismiss(true);
                break;
            case 14:
                TopicsFragment.AnonymousClass19 anonymousClass19 = (TopicsFragment.AnonymousClass19) obj2;
                anonymousClass19.getClass();
                Bundle bundle = new Bundle();
                TopicsFragment topicsFragment = TopicsFragment.this;
                bundle.putLong("dialog_id", -topicsFragment.chatId);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                topicsFragment.presentFragment(new ProfileNotificationsActivity(bundle, null));
                break;
            case 15:
                TopicsFragment.MessagesSearchContainer messagesSearchContainer = (TopicsFragment.MessagesSearchContainer) obj2;
                messagesSearchContainer.getClass();
                String str2 = (String) obj;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList = new ArrayList();
                int i6 = 0;
                while (true) {
                    TopicsFragment topicsFragment2 = TopicsFragment.this;
                    if (i6 >= topicsFragment2.forumTopics.size()) {
                        ArrayList arrayList2 = messagesSearchContainer.searchResultTopics;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        messagesSearchContainer.updateRows$20();
                        if (!arrayList2.isEmpty()) {
                            messagesSearchContainer.isLoading = false;
                            messagesSearchContainer.itemsEnterAnimator.showItemsAnimated(0);
                        }
                        messagesSearchContainer.loadMessages(str2);
                    } else {
                        ArrayList arrayList3 = topicsFragment2.forumTopics;
                        if (((TopicsFragment.Item) arrayList3.get(i6)).topic != null && ((TopicsFragment.Item) arrayList3.get(i6)).topic.title.toLowerCase().contains(lowerCase)) {
                            arrayList.add(((TopicsFragment.Item) arrayList3.get(i6)).topic);
                            ((TopicsFragment.Item) arrayList3.get(i6)).topic.searchQuery = lowerCase;
                        }
                        i6++;
                    }
                    break;
                }
                break;
            case 16:
                TopicsNotifySettingsFragments.AnonymousClass2 anonymousClass3 = ((TopicsNotifySettingsFragments.AnonymousClass2.AnonymousClass1) obj2).this$1;
                anonymousClass3.this$0.exceptionsTopics.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                anonymousClass3.this$0.updateRows$29();
                break;
            case 17:
                ((TwoStepVerificationActivity) obj2).lambda$processDone$35((byte[]) obj);
                break;
            case 18:
                ((TwoStepVerificationActivity) obj2).lambda$clearPassword$27((TL_account.updatePasswordSettings) obj);
                break;
            case 19:
                ((TwoStepVerificationActivity) obj2).lambda$processDone$33((TLRPC.TL_error) obj);
                break;
            case 20:
                ((TwoStepVerificationSetupActivity) obj2).lambda$processNext$29((String) obj);
                break;
            case 21:
                CodeNumberField[] codeNumberFieldArr = ((TwoStepVerificationSetupActivity) obj2).codeFieldContainer.codeField;
                int length = codeNumberFieldArr.length;
                while (i3 < length) {
                    codeNumberFieldArr[i3].animateSuccessProgress(0.0f);
                    i3++;
                }
                ((Runnable) obj).run();
                break;
            case 22:
                UserInfoActivity.AdminedChannelsFetcher adminedChannelsFetcher = (UserInfoActivity.AdminedChannelsFetcher) obj2;
                adminedChannelsFetcher.getClass();
                TLObject tLObject = (TLObject) obj;
                boolean z = tLObject instanceof TLRPC.messages_Chats;
                ArrayList<TLRPC.Chat> arrayList4 = adminedChannelsFetcher.chats;
                if (z) {
                    arrayList4.clear();
                    arrayList4.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(adminedChannelsFetcher.currentAccount).putChats(arrayList4, false);
                adminedChannelsFetcher.loading = false;
                adminedChannelsFetcher.loaded = true;
                ArrayList arrayList5 = adminedChannelsFetcher.callbacks;
                int size = arrayList5.size();
                while (i3 < size) {
                    Object obj3 = arrayList5.get(i3);
                    i3++;
                    ((Runnable) obj3).run();
                }
                arrayList5.clear();
                break;
            case 23:
                VoIPFragment voIPFragment = (VoIPFragment) obj2;
                voIPFragment.endCloseLayout.switchToClose(new VoIPFragment$$ExternalSyntheticLambda11(voIPFragment, (VoIPService) obj, i4), true);
                break;
            case 24:
                VoIPFragment voIPFragment2 = (VoIPFragment) obj2;
                VoIPPiPView.switchingToPip = false;
                VoIPPiPView.finish();
                ViewPropertyAnimator duration = voIPFragment2.speakerPhoneIcon.animate().setDuration(150L);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                duration.setInterpolator(cubicBezierInterpolator).start();
                voIPFragment2.backIcon.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                voIPFragment2.addIcon.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                voIPFragment2.emojiLayout.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                voIPFragment2.statusLayout.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                voIPFragment2.buttonsLayout.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                voIPFragment2.bottomShadow.animate().alpha(1.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
                voIPFragment2.topShadow.animate().alpha(1.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
                voIPFragment2.notificationsLayout.animate().alpha(1.0f).setDuration(350L).setInterpolator(cubicBezierInterpolator).start();
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                valueAnimator.addListener(new VoIPFragment.AnonymousClass11(voIPFragment2, i2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(cubicBezierInterpolator);
                valueAnimator.start();
                break;
            case 25:
                WallpapersListActivity.AnonymousClass2 anonymousClass4 = (WallpapersListActivity.AnonymousClass2) obj2;
                anonymousClass4.getClass();
                int[] iArr2 = (int[]) obj;
                int i7 = iArr2[0] - 1;
                iArr2[0] = i7;
                if (i7 == 0) {
                    int[][] iArr3 = WallpapersListActivity.defaultColorsLight;
                    WallpapersListActivity.this.loadWallpapers(true);
                }
                break;
            case 26:
                WallpapersListActivity.SearchAdapter searchAdapter = (WallpapersListActivity.SearchAdapter) obj2;
                searchAdapter.searchResult.clear();
                searchAdapter.searchResultKeys.clear();
                searchAdapter.bingSearchEndReached = true;
                String str3 = (String) obj;
                searchAdapter.searchImages(str3, "", true);
                searchAdapter.lastSearchString = str3;
                searchAdapter.notifyDataSetChanged();
                searchAdapter.searchRunnable = null;
                break;
            case 27:
                WallpapersListActivity.SearchAdapter searchAdapter2 = (WallpapersListActivity.SearchAdapter) obj2;
                searchAdapter2.getClass();
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity = WallpapersListActivity.this;
                MessagesController.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(((BaseFragment) wallpapersListActivity).currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = searchAdapter2.lastSearchImageString;
                searchAdapter2.lastSearchImageString = null;
                searchAdapter2.searchImages(str4, "", false);
                break;
            case 28:
                WebviewActivity webviewActivity = WebviewActivity.this;
                if (webviewActivity.getParentActivity() != null) {
                    String str5 = (String) obj;
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d(str5);
                    }
                    str5.getClass();
                    boolean zEquals = str5.equals("share_game");
                    MessageObject messageObject = webviewActivity.currentMessageObject;
                    if (zEquals) {
                        messageObject.messageOwner.with_my_score = false;
                    } else if (str5.equals("share_score")) {
                        messageObject.messageOwner.with_my_score = true;
                    }
                    webviewActivity.showDialog(ShareAlert.createShareAlert(webviewActivity.getParentActivity(), messageObject, null, false, webviewActivity.linkToCopy));
                    break;
                }
                break;
            default:
                AffiliateProgramFragment affiliateProgramFragment = (AffiliateProgramFragment) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (userFull != null) {
                    affiliateProgramFragment.new_program = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    affiliateProgramFragment.program = starrefprogram;
                    if (starrefprogram == null) {
                        affiliateProgramFragment.new_program = true;
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        starrefprogram2.commission_permille = Utilities.clamp(50, affiliateProgramFragment.getMessagesController().starrefMaxCommissionPermille, affiliateProgramFragment.getMessagesController().starrefMinCommissionPermille);
                        starrefprogram2.duration_months = 1;
                        affiliateProgramFragment.program = starrefprogram2;
                        affiliateProgramFragment.initialProgram = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram3 = new TL_payments.starRefProgram();
                        affiliateProgramFragment.initialProgram = starrefprogram3;
                        TL_payments.starRefProgram starrefprogram4 = affiliateProgramFragment.program;
                        starrefprogram3.commission_permille = starrefprogram4.commission_permille;
                        starrefprogram3.duration_months = starrefprogram4.duration_months;
                    }
                }
                affiliateProgramFragment.update$2(true);
                break;
        }
    }
}
