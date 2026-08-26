package org.telegram.ui.Components.Premium.boosts;

import android.view.View;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Premium.boosts.adapters.BoostAdapter;
import org.telegram.ui.Components.Premium.boosts.cells.BoostTypeCell;
import org.telegram.ui.Components.Premium.boosts.cells.ChatCell;
import org.telegram.ui.Components.Premium.boosts.cells.EnterPrizeCell;
import org.telegram.ui.Components.Premium.boosts.cells.SubtitleWithCounterCell;
import org.telegram.ui.Components.SlideChooseView;

public final class BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2 implements AlertsCreator.ScheduleDatePickerDelegate, SlideChooseView.Callback, ChatCell.ChatDeleteListener, EnterPrizeCell.AfterTextChangedListener {
    public final BoostViaGiftsBottomSheet f$0;

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        BoostViaGiftsBottomSheet boostViaGiftsBottomSheet = this.f$0;
        boostViaGiftsBottomSheet.selectedEndDate = ((long) i) * 1000;
        boostViaGiftsBottomSheet.updateRows(false, true);
    }

    @Override
    public void onOptionSelected(int i) {
        String pluralString;
        BoostViaGiftsBottomSheet boostViaGiftsBottomSheet = this.f$0;
        int i2 = boostViaGiftsBottomSheet.selectedBoostType;
        int i3 = BoostTypeCell.$r8$clinit;
        if (i2 == 2) {
            boostViaGiftsBottomSheet.selectedSliderIndex = i;
        } else {
            boostViaGiftsBottomSheet.selectedStarsSliderIndex = i;
        }
        boostViaGiftsBottomSheet.actionBtn.button.setCount(boostViaGiftsBottomSheet.getSelectedSliderValueWithBoosts(), true);
        if (boostViaGiftsBottomSheet.selectedBoostType == 3) {
            boostViaGiftsBottomSheet.updateRows(true, true);
        } else {
            boostViaGiftsBottomSheet.updateRows(false, false);
        }
        BoostAdapter boostAdapter = boostViaGiftsBottomSheet.adapter;
        int selectedSliderValueWithBoosts = boostViaGiftsBottomSheet.getSelectedSliderValueWithBoosts();
        for (int i4 = 0; i4 < boostAdapter.recyclerListView.getChildCount(); i4++) {
            View childAt = boostAdapter.recyclerListView.getChildAt(i4);
            if (childAt instanceof SubtitleWithCounterCell) {
                SubtitleWithCounterCell subtitleWithCounterCell = (SubtitleWithCounterCell) childAt;
                if (selectedSliderValueWithBoosts <= 0) {
                    pluralString = "";
                } else {
                    subtitleWithCounterCell.getClass();
                    pluralString = LocaleController.formatPluralString("BoostingBoostsCountTitle", selectedSliderValueWithBoosts, Integer.valueOf(selectedSliderValueWithBoosts));
                }
                subtitleWithCounterCell.counterTextView.cancelAnimation();
                subtitleWithCounterCell.counterTextView.setText(pluralString, true);
            }
            if (childAt instanceof ChatCell) {
                ChatCell chatCell = (ChatCell) childAt;
                int participantsCount$1 = boostAdapter.getParticipantsCount$1(chatCell.getChat());
                boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chatCell.chat);
                if (chatCell.removable) {
                    chatCell.setSubtitle(participantsCount$1 >= 1 ? LocaleController.formatPluralString(zIsChannelAndNotMegaGroup ? "Subscribers" : "Members", participantsCount$1, new Object[0]) : LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup));
                } else {
                    chatCell.setSubtitle(LocaleController.formatPluralString(zIsChannelAndNotMegaGroup ? "BoostingChannelWillReceiveBoost" : "BoostingGroupWillReceiveBoost", selectedSliderValueWithBoosts, new Object[0]));
                }
            }
        }
        boostAdapter.lambda$onBindViewHolder$31(8);
        boostAdapter.notifyItemRangeChanged(boostAdapter.items.size() - 12, 12);
    }

    @Override
    public void onTouchEnd() {
        SlideChooseView.Callback.CC.$default$onTouchEnd(this);
    }
}
