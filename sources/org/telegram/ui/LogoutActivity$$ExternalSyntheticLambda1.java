package org.telegram.ui;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.RecyclerListView;

public final class LogoutActivity$$ExternalSyntheticLambda1 implements ListenerSet.Event, RecyclerListView.IntReturnCallback, NumberPicker.Formatter, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final int f$0;

    public LogoutActivity$$ExternalSyntheticLambda1(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override
    public String format(int i) {
        int i2 = this.f$0;
        switch (this.$r8$classId) {
            case 4:
                if (i == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                LocalDate localDatePlusDays = LocalDate.now().plusDays(i);
                int year = localDatePlusDays.getYear();
                long epochMilli = localDatePlusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year != i2) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(epochMilli);
                }
                return LocaleController.getInstance().getFormatterWeek().format(epochMilli) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(epochMilli);
            default:
                return i == i2 ? "—" : String.format("%02d", Integer.valueOf(i));
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.$r8$classId) {
            case 1:
                ((Player.Listener) obj).onRepeatModeChanged(this.f$0);
                break;
            default:
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                analyticsListener.getClass();
                analyticsListener.onPositionDiscontinuity$1(this.f$0);
                break;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        MessagesController.getInstance(this.f$0).performLogout(1);
    }

    @Override
    public int run() {
        return this.f$0;
    }

    public LogoutActivity$$ExternalSyntheticLambda1(AnalyticsListener.EventTime eventTime, int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2) {
        this.$r8$classId = 2;
        this.f$0 = i;
    }
}
