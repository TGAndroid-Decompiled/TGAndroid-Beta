package org.telegram.ui.Business;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.UItem;

public final class AwayMessagesActivity$$ExternalSyntheticLambda2 implements Utilities.Callback5, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final AwayMessagesActivity f$0;

    public AwayMessagesActivity$$ExternalSyntheticLambda2(AwayMessagesActivity awayMessagesActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = awayMessagesActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.processDone();
                break;
            default:
                this.f$0.finishFragment();
                break;
        }
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        UItem uItem = (UItem) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final AwayMessagesActivity awayMessagesActivity = this.f$0;
        if (awayMessagesActivity.recipientsHelper.onClick(uItem)) {
            return;
        }
        int i = uItem.id;
        if (i == 2 || uItem.viewType == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", awayMessagesActivity.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            awayMessagesActivity.presentFragment(new ChatActivity(bundle));
            return;
        }
        if (i == 1) {
            awayMessagesActivity.enabled = !awayMessagesActivity.enabled;
            awayMessagesActivity.listView.adapter.update(true);
            awayMessagesActivity.checkDone(true);
            return;
        }
        if (i == 6) {
            BusinessRecipientsHelper businessRecipientsHelper = awayMessagesActivity.recipientsHelper;
            awayMessagesActivity.exclude = true;
            businessRecipientsHelper.exclude = true;
            awayMessagesActivity.listView.adapter.update(true);
            awayMessagesActivity.checkDone(true);
            return;
        }
        if (i == 7) {
            BusinessRecipientsHelper businessRecipientsHelper2 = awayMessagesActivity.recipientsHelper;
            awayMessagesActivity.exclude = false;
            businessRecipientsHelper2.exclude = false;
            awayMessagesActivity.listView.adapter.update(true);
            awayMessagesActivity.checkDone(true);
            return;
        }
        if (i == 3) {
            awayMessagesActivity.schedule = 0;
            awayMessagesActivity.listView.adapter.update(true);
            awayMessagesActivity.checkDone(true);
            return;
        }
        if (i == 4) {
            awayMessagesActivity.schedule = 1;
            awayMessagesActivity.listView.adapter.update(true);
            awayMessagesActivity.checkDone(true);
            return;
        }
        if (i == 5) {
            awayMessagesActivity.schedule = 2;
            awayMessagesActivity.listView.adapter.update(true);
            awayMessagesActivity.checkDone(true);
            return;
        }
        if (i == 8) {
            final int i2 = 0;
            AlertsCreator.createDatePickerDialog(awayMessagesActivity.getContext(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), awayMessagesActivity.scheduleCustomStart, new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i3, int i4) {
                    switch (i2) {
                        case 0:
                            AwayMessagesActivity awayMessagesActivity2 = awayMessagesActivity;
                            awayMessagesActivity2.getClass();
                            TextCell textCell = (TextCell) view;
                            awayMessagesActivity2.scheduleCustomStart = i3;
                            textCell.setValue(LocaleController.formatShortDateTime(i3), true);
                            awayMessagesActivity2.checkDone(true);
                            break;
                        default:
                            AwayMessagesActivity awayMessagesActivity3 = awayMessagesActivity;
                            awayMessagesActivity3.getClass();
                            TextCell textCell2 = (TextCell) view;
                            awayMessagesActivity3.scheduleCustomEnd = i3;
                            textCell2.setValue(LocaleController.formatShortDateTime(i3), true);
                            awayMessagesActivity3.checkDone(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i == 9) {
            final int i3 = 1;
            AlertsCreator.createDatePickerDialog(awayMessagesActivity.getContext(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), awayMessagesActivity.scheduleCustomEnd, new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i4, int i5) {
                    switch (i3) {
                        case 0:
                            AwayMessagesActivity awayMessagesActivity2 = awayMessagesActivity;
                            awayMessagesActivity2.getClass();
                            TextCell textCell = (TextCell) view;
                            awayMessagesActivity2.scheduleCustomStart = i4;
                            textCell.setValue(LocaleController.formatShortDateTime(i4), true);
                            awayMessagesActivity2.checkDone(true);
                            break;
                        default:
                            AwayMessagesActivity awayMessagesActivity3 = awayMessagesActivity;
                            awayMessagesActivity3.getClass();
                            TextCell textCell2 = (TextCell) view;
                            awayMessagesActivity3.scheduleCustomEnd = i4;
                            textCell2.setValue(LocaleController.formatShortDateTime(i4), true);
                            awayMessagesActivity3.checkDone(true);
                            break;
                    }
                }
            });
            return;
        }
        if (i == 10) {
            boolean z = !awayMessagesActivity.offline_only;
            awayMessagesActivity.offline_only = z;
            ((TextCheckCell) view).setChecked(z);
            awayMessagesActivity.checkDone(true);
        }
    }
}
