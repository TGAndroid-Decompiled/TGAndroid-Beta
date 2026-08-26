package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Components.DeleteMessagesBottomSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.InviteMembersBottomSheet;
import org.telegram.ui.Stars.StarGiftSheet;

public final class ChatEditActivity$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;

    public ChatEditActivity$$ExternalSyntheticLambda1(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                final ChatEditActivity chatEditActivity = (ChatEditActivity) this.f$0;
                final boolean[] zArr = (boolean[]) this.f$1;
                if (!zArr[0]) {
                    final AlertDialog alertDialog = new AlertDialog(chatEditActivity.getParentActivity(), 3, null);
                    AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                    AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                    AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 400L);
                    zArr[0] = true;
                    final boolean z = !chatEditActivity.autoTranslationCell.isChecked();
                    if (chatEditActivity.autoTranslationCell.getCheckBox().iconDrawable == null) {
                        chatEditActivity.autoTranslationCell.setChecked(z);
                    }
                    ChannelBoostsController boostsController = chatEditActivity.getMessagesController().getBoostsController();
                    final long j = this.f$2;
                    boostsController.getBoostsStats(j, new Consumer() {
                        @Override
                        public final void accept(Object obj) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                            ChatEditActivity chatEditActivity2 = chatEditActivity;
                            TLRPC.Chat chat = chatEditActivity2.currentChat;
                            int i = chat.level;
                            int i2 = tL_premium_boostsStatus.level;
                            if (i != i2) {
                                chat.level = i2;
                                chatEditActivity2.getMessagesController().putChat(chatEditActivity2.currentChat, false);
                            }
                            chatEditActivity2.autoTranslationCell.getCheckBox().setIcon(tL_premium_boostsStatus.level < chatEditActivity2.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                            boolean[] zArr2 = zArr;
                            AlertDialog alertDialog2 = alertDialog;
                            boolean z2 = z;
                            if (z2 && tL_premium_boostsStatus.level < chatEditActivity2.getMessagesController().channelAutotranslationLevelMin) {
                                chatEditActivity2.autoTranslationCell.setChecked(false);
                                zArr2[0] = false;
                                ChannelBoostsController boostsController2 = chatEditActivity2.getMessagesController().getBoostsController();
                                long j2 = j;
                                boostsController2.userCanBoostChannel(j2, tL_premium_boostsStatus, new ChatEditActivity$$ExternalSyntheticLambda65(chatEditActivity2, alertDialog2, tL_premium_boostsStatus, j2, 0));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            chatEditActivity2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = MessagesController.getInputChannel(chatEditActivity2.currentChat);
                            tL_channels_toggleAutotranslation.enabled = z2;
                            chatEditActivity2.autoTranslationCell.setChecked(z2);
                            zArr2[0] = false;
                            alertDialog2.dismiss();
                            chatEditActivity2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new CallLogActivity$$ExternalSyntheticLambda31(4, chatEditActivity2, z2), 64);
                        }
                    });
                    break;
                }
                break;
            case 1:
                ((AlertDialog[]) this.f$0)[0].dismiss();
                ((DeleteMessagesBottomSheet$$ExternalSyntheticLambda1) this.f$1).run(-this.f$2);
                break;
            case 2:
                ((AlertDialog[]) this.f$0)[0].dismiss();
                ((DeleteMessagesBottomSheet$$ExternalSyntheticLambda1) this.f$1).run(-this.f$2);
                break;
            case 3:
                ((InviteMembersBottomSheet) this.f$0).lambda$new$2((Context) this.f$1, this.f$2);
                break;
            case 4:
                DialogsActivity dialogsActivity = (DialogsActivity) this.f$0;
                dialogsActivity.getClass();
                boolean hasUnread = ((DialogCell) this.f$1).getHasUnread();
                long j2 = this.f$2;
                if (hasUnread) {
                    dialogsActivity.markAsRead(j2);
                } else {
                    dialogsActivity.getMessagesController().markDialogAsUnread(j2, null, 0L);
                }
                dialogsActivity.finishPreviewFragment();
                break;
            case 5:
                PaymentFormActivity paymentFormActivity = (PaymentFormActivity) this.f$0;
                paymentFormActivity.getClass();
                long jLongValue = ((Long) ((TextView) this.f$1).getTag()).longValue();
                Long l = paymentFormActivity.tipAmount;
                if (l == null || jLongValue != l.longValue()) {
                    paymentFormActivity.inputFields[0].setText(LocaleController.getInstance().formatCurrencyString(this.f$2, false, true, true, paymentFormActivity.paymentForm.invoice.currency));
                } else {
                    paymentFormActivity.ignoreOnTextChange = true;
                    paymentFormActivity.inputFields[0].setText("");
                    paymentFormActivity.ignoreOnTextChange = false;
                    paymentFormActivity.tipAmount = 0L;
                    paymentFormActivity.updateTotalPrice();
                }
                EditTextBoldCursor editTextBoldCursor = paymentFormActivity.inputFields[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
            default:
                ((StarGiftSheet) this.f$0).lambda$openValueStats$181(this.f$2, (String) this.f$1);
                break;
        }
    }
}
