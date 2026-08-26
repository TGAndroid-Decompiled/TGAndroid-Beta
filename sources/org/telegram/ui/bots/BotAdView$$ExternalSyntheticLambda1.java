package org.telegram.ui.bots;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda22;
import org.telegram.ui.Components.ChatActivityEnterView$$ExternalSyntheticLambda30;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda149;
import org.telegram.ui.TooManyCommunitiesActivity;
import org.telegram.ui.WebAppDisclaimerAlert;
import org.telegram.ui.community.CommunityEditActivity;
import org.telegram.ui.community.CommunityEditActivity$$ExternalSyntheticLambda6;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.community.sheet.CommunityInviteOnlySheet;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.ChatAttachAlertRichLayout;
import org.telegram.ui.iv.RichDetailsCell;
import org.telegram.ui.iv.RichEditorHistory;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichMapCell;
import org.telegram.ui.web.AddressBarList;
import org.telegram.ui.web.AddressBarList$$ExternalSyntheticLambda2;
import org.telegram.ui.web.WebActionBar;

public final class BotAdView$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public BotAdView$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onClick(View view) {
        BlockRow blockRow;
        RichMapCell.Delegate delegate;
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity$$ExternalSyntheticLambda22) this.f$0).run();
                break;
            case 1:
                TooManyCommunitiesActivity tooManyCommunitiesActivity = (TooManyCommunitiesActivity) this.f$0;
                HashSet hashSet = tooManyCommunitiesActivity.selectedIds;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = tooManyCommunitiesActivity.getMessagesController().getUser(Long.valueOf(tooManyCommunitiesActivity.getUserConfig().getClientUserId()));
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList2 = tooManyCommunitiesActivity.inactiveChats;
                        if (i >= arrayList2.size()) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i2);
                                tooManyCommunitiesActivity.getMessagesController().putChat(chat, false);
                                tooManyCommunitiesActivity.getMessagesController().deleteParticipantFromChat(chat.id, user);
                            }
                            tooManyCommunitiesActivity.finishFragment();
                        } else {
                            if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList2.get(i)).id))) {
                                arrayList.add((TLRPC.Chat) arrayList2.get(i));
                            }
                            i++;
                        }
                        break;
                    }
                }
                break;
            case 2:
                WebAppDisclaimerAlert webAppDisclaimerAlert = (WebAppDisclaimerAlert) this.f$0;
                CheckBoxCell checkBoxCell = webAppDisclaimerAlert.cell;
                checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
                webAppDisclaimerAlert.positiveButton.setEnabled(webAppDisclaimerAlert.cell.isChecked());
                webAppDisclaimerAlert.positiveButton.animate().alpha(webAppDisclaimerAlert.cell.isChecked() ? 1.0f : 0.5f).start();
                break;
            case 3:
                ((ChatActivity$$ExternalSyntheticLambda22) this.f$0).run();
                break;
            case 4:
                ((ChatActivityEnterView$$ExternalSyntheticLambda30) ((BotKeyboardView) this.f$0).delegate).f$0.lambda$setButtons$90((TL_keyboard.KeyboardButton) view.getTag());
                break;
            case 5:
                ((ProfileActivity$$ExternalSyntheticLambda149) this.f$0).run();
                break;
            case 6:
                CommunityEditActivity communityEditActivity = (CommunityEditActivity) this.f$0;
                TLRPC.Chat chat2 = communityEditActivity.currentChat;
                if (chat2 != null && !chat2.title.equals(((WebActionBar.AnonymousClass4) communityEditActivity.editTextCell.this$0).getText().toString())) {
                    communityEditActivity.getMessagesController().changeChatTitle(communityEditActivity.currentChat.id, ((WebActionBar.AnonymousClass4) communityEditActivity.editTextCell.this$0).getText().toString(), new CommunityEditActivity$$ExternalSyntheticLambda6(communityEditActivity, 0));
                }
                TLRPC.Chat chat3 = communityEditActivity.currentChat;
                if (chat3 != null && communityEditActivity.canAllManageLinkedPeers != communityEditActivity.canAllManageLinkedPeersOriginal) {
                    if (chat3.default_banned_rights == null) {
                        chat3.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    communityEditActivity.currentChat.default_banned_rights.manage_linked_peers = !communityEditActivity.canAllManageLinkedPeers;
                    communityEditActivity.getMessagesController().setDefaultBannedRole(communityEditActivity.communityId, communityEditActivity.currentChat.default_banned_rights, false, communityEditActivity);
                }
                communityEditActivity.finishFragment();
                break;
            case 7:
                CommunitySheet.this.viewPager.scrollToPosition$1(0);
                break;
            case 8:
                CommunitySheet communitySheet = CommunitySheet.this;
                if (ChatObject.canAddChatToCommunity(communitySheet.currentCommunity)) {
                    communitySheet.loadChatsToAddToCommunity();
                } else {
                    communitySheet.lambda$showGiftOfferSheet$15();
                }
                break;
            case 9:
                ((CommunityInviteOnlySheet) this.f$0).lambda$showGiftOfferSheet$15();
                break;
            case 10:
                ChatAttachAlertRichLayout chatAttachAlertRichLayout = (ChatAttachAlertRichLayout) this.f$0;
                chatAttachAlertRichLayout.sendSelectedItems(0, true, 0, false, 0L);
                MessageSendPreview messageSendPreview = chatAttachAlertRichLayout.messageSendPreview;
                if (messageSendPreview != null) {
                    messageSendPreview.sent = true;
                    messageSendPreview.dismiss();
                    chatAttachAlertRichLayout.messageSendPreview = null;
                }
                break;
            case 11:
                RichDetailsCell richDetailsCell = (RichDetailsCell) this.f$0;
                RichEditorListView.AnonymousClass13 anonymousClass13 = richDetailsCell.delegate;
                if (anonymousClass13 != null && (blockRow = richDetailsCell.currentRow) != null) {
                    RichEditorListView richEditorListView = RichEditorListView.this;
                    richEditorListView.getClass();
                    if (RichEditorListView.isDetailsHeader(blockRow)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) blockRow.block;
                        RichEditorHistory richEditorHistory = richEditorListView.history;
                        if (richEditorHistory != null) {
                            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                            richEditorHistory.commit();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        richEditorListView.adapter.update(true);
                        RichEditorHistory richEditorHistory2 = richEditorListView.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.record();
                        }
                        break;
                    }
                }
                break;
            case 12:
                RichMapCell richMapCell = (RichMapCell) this.f$0;
                BlockRow blockRow2 = richMapCell.currentRow;
                if (blockRow2 != null && (delegate = richMapCell.delegate) != null) {
                    RichEditorListView.this.delegate.onOpenLocationRequest(blockRow2);
                    break;
                }
                break;
            default:
                AddressBarList addressBarList = (AddressBarList) this.f$0;
                AlertDialog.Builder builder = new AlertDialog.Builder(addressBarList.getContext(), 0, null);
                String string = LocaleController.getString(R.string.WebRecentClearTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.getString(R.string.WebRecentClearText);
                builder.setPositiveButton(LocaleController.getString(R.string.OK), new AddressBarList$$ExternalSyntheticLambda2(addressBarList));
                ArticleViewer.IBlock.CC.m(R.string.Cancel, builder, (AlertDialog.OnButtonClickListener) null);
                break;
        }
    }
}
