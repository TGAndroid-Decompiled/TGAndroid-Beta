package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.bots.BotVerifySheet$$ExternalSyntheticLambda0;

public final class ChannelMonetizationLayout$$ExternalSyntheticLambda7 implements TextView.OnEditorActionListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ChannelMonetizationLayout$$ExternalSyntheticLambda7(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int adapterPosition;
        int adapterPosition2;
        switch (this.$r8$classId) {
            case 0:
                ChannelMonetizationLayout channelMonetizationLayout = (ChannelMonetizationLayout) this.f$0;
                channelMonetizationLayout.getClass();
                if (i != 5) {
                    return false;
                }
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                ChannelMonetizationLayout$$ExternalSyntheticLambda21 channelMonetizationLayout$$ExternalSyntheticLambda21 = new ChannelMonetizationLayout$$ExternalSyntheticLambda21(channelMonetizationLayout, twoStepVerificationActivity, 1);
                twoStepVerificationActivity.delegateType = 1;
                twoStepVerificationActivity.delegate = channelMonetizationLayout$$ExternalSyntheticLambda21;
                channelMonetizationLayout.starsBalanceButton.setLoading(true);
                twoStepVerificationActivity.preload(new ChannelMonetizationLayout$$ExternalSyntheticLambda22(channelMonetizationLayout, (StatisticActivity) this.f$1, twoStepVerificationActivity, 1));
                return true;
            case 1:
                if (i != 6 && keyEvent.getKeyCode() != 66) {
                    return false;
                }
                AlertDialog alertDialog = (AlertDialog) this.f$0;
                if (!alertDialog.isShowing()) {
                    return false;
                }
                ((BotVerifySheet$$ExternalSyntheticLambda0) this.f$1).onClick(alertDialog, 0);
                return true;
            case 2:
                ChatAttachAlertPollLayout.ListAdapter listAdapter = (ChatAttachAlertPollLayout.ListAdapter) this.f$0;
                if (i != 5) {
                    return false;
                }
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = ChatAttachAlertPollLayout.this;
                MessageSeenView.AnonymousClass1 anonymousClass1 = chatAttachAlertPollLayout.listView;
                ChatAttachAlertPollLayout.ListAdapter.AnonymousClass6 anonymousClass6 = (ChatAttachAlertPollLayout.ListAdapter.AnonymousClass6) this.f$1;
                View viewFindContainingItemView = anonymousClass1.findContainingItemView(anonymousClass6);
                RecyclerView.ViewHolder childViewHolder = viewFindContainingItemView == null ? null : anonymousClass1.getChildViewHolder(viewFindContainingItemView);
                if (childViewHolder == null || (adapterPosition = childViewHolder.getAdapterPosition()) == -1) {
                    return true;
                }
                int i2 = adapterPosition - chatAttachAlertPollLayout.answerStartRow;
                int i3 = chatAttachAlertPollLayout.answersCount;
                int i4 = i3 - 1;
                if (i2 == i4 && i3 < chatAttachAlertPollLayout.maxAnswersCount) {
                    chatAttachAlertPollLayout.addNewField();
                    return true;
                }
                if (i2 == i4) {
                    AndroidUtilities.hideKeyboard(anonymousClass6.getTextView());
                    return true;
                }
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = chatAttachAlertPollLayout.listView.findViewHolderForAdapterPosition(adapterPosition + 1);
                if (viewHolderFindViewHolderForAdapterPosition == null) {
                    return true;
                }
                View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                if (!(view instanceof PollEditTextCell)) {
                    return true;
                }
                ((PollEditTextCell) view).getTextView().requestFocus();
                return true;
            default:
                PollCreateActivity.ListAdapter listAdapter2 = (PollCreateActivity.ListAdapter) this.f$0;
                if (i != 5) {
                    return false;
                }
                PollCreateActivity pollCreateActivity = PollCreateActivity.this;
                MessageSeenView.AnonymousClass1 anonymousClass2 = pollCreateActivity.listView;
                PollCreateActivity.ListAdapter.AnonymousClass5 anonymousClass5 = (PollCreateActivity.ListAdapter.AnonymousClass5) this.f$1;
                View viewFindContainingItemView2 = anonymousClass2.findContainingItemView(anonymousClass5);
                RecyclerView.ViewHolder childViewHolder2 = viewFindContainingItemView2 == null ? null : anonymousClass2.getChildViewHolder(viewFindContainingItemView2);
                if (childViewHolder2 == null || (adapterPosition2 = childViewHolder2.getAdapterPosition()) == -1) {
                    return true;
                }
                int i5 = adapterPosition2 - pollCreateActivity.answerStartRow;
                int i6 = pollCreateActivity.answersCount;
                int i7 = i6 - 1;
                if (i5 == i7 && i6 < pollCreateActivity.maxAnswersCount) {
                    pollCreateActivity.addNewField$1();
                    return true;
                }
                if (i5 == i7) {
                    AndroidUtilities.hideKeyboard(anonymousClass5.getTextView());
                    return true;
                }
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = pollCreateActivity.listView.findViewHolderForAdapterPosition(adapterPosition2 + 1);
                if (viewHolderFindViewHolderForAdapterPosition2 == null) {
                    return true;
                }
                View view2 = viewHolderFindViewHolderForAdapterPosition2.itemView;
                if (!(view2 instanceof PollEditTextCell)) {
                    return true;
                }
                ((PollEditTextCell) view2).getTextView().requestFocus();
                return true;
        }
    }
}
