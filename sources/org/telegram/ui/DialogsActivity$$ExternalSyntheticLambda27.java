package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.chat.ChatInputViewsContainer;
import org.telegram.ui.Components.inset.WindowInsetsStateHolder;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.iv.RichEditor;

public final class DialogsActivity$$ExternalSyntheticLambda27 implements Runnable {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda27(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity dialogsActivity = this.f$0;
                DialogsActivity.AnonymousClass47 anonymousClass47 = dialogsActivity.searchViewPager;
                if (anonymousClass47 == null || !anonymousClass47.isActionModeShowed) {
                    dialogsActivity.fragmentSearchField.editText.getText().clear();
                    AndroidUtilities.hideKeyboard(dialogsActivity.fragmentSearchField.editText);
                    dialogsActivity.fragmentSearchField.editText.clearFocus();
                    dialogsActivity.fragmentSearchFieldWatcher.toggleSearch(false);
                } else {
                    anonymousClass47.showActionMode(false);
                }
                break;
            case 1:
                this.f$0.getMessagesController().clearSendAsPeers();
                break;
            case 2:
                DialogsActivity dialogsActivity2 = this.f$0;
                if (dialogsActivity2.initialDialogsType != 10) {
                    dialogsActivity2.hideFloatingButton(false);
                }
                if (dialogsActivity2.hasOnlySlefStories && dialogsActivity2.getMessagesController().getStoriesController().hasOnlySelfStories()) {
                    dialogsActivity2.dialogStoriesCell.openSelfStories();
                } else {
                    dialogsActivity2.scrollToTop(true, true);
                }
                break;
            case 3:
                DialogsActivity dialogsActivity3 = this.f$0;
                ChatInputViewsContainer chatInputViewsContainer = dialogsActivity3.chatInputViewsContainer;
                if (chatInputViewsContainer != null) {
                    chatInputViewsContainer.checkInsets();
                }
                if (dialogsActivity3.viewPages != null) {
                    int iCalculateListViewPaddingBottom = dialogsActivity3.calculateListViewPaddingBottom();
                    int i = 0;
                    while (true) {
                        DialogsActivity.ViewPage[] viewPageArr = dialogsActivity3.viewPages;
                        if (i < viewPageArr.length) {
                            DialogsActivity.ViewPage viewPage = viewPageArr[i];
                            if (viewPage != null) {
                                DialogsActivity.DialogsRecyclerView dialogsRecyclerView = viewPage.listView;
                                dialogsRecyclerView.setPadding(0, dialogsRecyclerView.topPadding, 0, iCalculateListViewPaddingBottom);
                            }
                            i++;
                        }
                    }
                }
                dialogsActivity3.blur3_InvalidateBlur$4();
                ChatInputViewsContainer chatInputViewsContainer2 = dialogsActivity3.chatInputViewsContainer;
                WindowInsetsStateHolder windowInsetsStateHolder = dialogsActivity3.windowInsetsStateHolder;
                if (chatInputViewsContainer2 != null) {
                    chatInputViewsContainer2.setBlurredBottomHeight(dialogsActivity3.chatInputViewsContainer.getInputBubbleHeight() + windowInsetsStateHolder.getAnimatedMaxBottomInset() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
                }
                RichEditor.AnonymousClass9 anonymousClass9 = dialogsActivity3.writeButton;
                if (anonymousClass9 != null) {
                    anonymousClass9.setTranslationY(-windowInsetsStateHolder.getAnimatedMaxBottomInset());
                }
                break;
            case 4:
                this.f$0.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                break;
            case 5:
                this.f$0.createSearchViewPager();
                break;
            case 6:
                this.f$0.updateDialogsHint();
                break;
            case 7:
                DialogsActivity dialogsActivity4 = this.f$0;
                dialogsActivity4.notify = false;
                if (dialogsActivity4.delegate != null) {
                    ArrayList arrayList = dialogsActivity4.selectedDialogs;
                    if (!arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i2)).longValue(), 0L));
                        }
                        dialogsActivity4.delegate.didSelectDialogs(dialogsActivity4, arrayList2, dialogsActivity4.commentView.getFieldText(), false, dialogsActivity4.notify, dialogsActivity4.scheduleDate, dialogsActivity4.scheduleRepeatPeriod, null);
                        break;
                    }
                }
                break;
            case 8:
                final DialogsActivity dialogsActivity5 = this.f$0;
                AlertsCreator.createScheduleDatePickerDialog(dialogsActivity5.getParentActivity(), -1L, -1L, 0, new AlertsCreator.ScheduleDatePickerDelegate() {
                    public AnonymousClass41() {
                    }

                    @Override
                    public final void didSelectDate(int i3, int i4, boolean z) {
                        DialogsActivity dialogsActivity6 = DialogsActivity.this;
                        dialogsActivity6.scheduleDate = i3;
                        dialogsActivity6.scheduleRepeatPeriod = i4;
                        if (dialogsActivity6.delegate == null || dialogsActivity6.selectedDialogs.isEmpty()) {
                            return;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (int i5 = 0; i5 < dialogsActivity6.selectedDialogs.size(); i5++) {
                            arrayList3.add(MessagesStorage.TopicKey.of(((Long) dialogsActivity6.selectedDialogs.get(i5)).longValue(), 0L));
                        }
                        dialogsActivity6.delegate.didSelectDialogs(dialogsActivity6, arrayList3, dialogsActivity6.commentView.getFieldText(), false, z, i3, i4, null);
                    }
                }, null, dialogsActivity5.getResourceProvider());
                break;
            case 9:
                this.f$0.lambda$checkEmailConfig$158();
                break;
            case 10:
                this.f$0.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 11:
                DialogsActivity dialogsActivity6 = this.f$0;
                HintView2 hintView2 = dialogsActivity6.storyPremiumHint;
                if (hintView2 != null) {
                    hintView2.hide(true);
                }
                dialogsActivity6.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 12:
                DialogsActivity dialogsActivity7 = this.f$0;
                dialogsActivity7.fragmentSearchField.editText.requestFocus();
                AndroidUtilities.showKeyboard(dialogsActivity7.fragmentSearchField.editText);
                break;
            default:
                this.f$0.updateSelectedCount();
                break;
        }
    }
}
