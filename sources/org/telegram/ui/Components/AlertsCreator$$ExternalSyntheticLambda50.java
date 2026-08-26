package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.Calendar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2;

public final class AlertsCreator$$ExternalSyntheticLambda50 implements View.OnClickListener {
    public final int $r8$classId;
    public final KeyEvent.Callback f$0;
    public final Object f$1;
    public final View f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;

    public AlertsCreator$$ExternalSyntheticLambda50(KeyEvent.Callback callback, Object obj, View view, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$1 = obj;
        this.f$2 = view;
        this.f$3 = obj2;
        this.f$4 = obj3;
        this.f$5 = obj4;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createStatusUntilDatePickerDialog$176((NumberPicker) this.f$0, (NumberPicker) this.f$1, (NumberPicker) this.f$2, (Calendar) this.f$3, (AlertsCreator.StatusUntilDatePickerDelegate) this.f$4, (BottomSheet.Builder) this.f$5, view);
                break;
            case 1:
                AlertsCreator.lambda$createDatePickerDialog$141((NumberPicker) this.f$0, (NumberPicker) this.f$1, (NumberPicker) this.f$2, (Calendar) this.f$3, (AlertsCreator.ScheduleDatePickerDelegate) this.f$4, (BottomSheet.Builder) this.f$5, view);
                break;
            case 2:
                long value = (((long) ((NumberPicker) this.f$0).getValue()) * 86400000) + System.currentTimeMillis();
                Calendar calendar = (Calendar) this.f$3;
                calendar.setTimeInMillis(value);
                calendar.set(11, ((BoostDialogs.AnonymousClass1) this.f$1).getValue());
                calendar.set(12, ((BoostDialogs.AnonymousClass2) this.f$2).getValue() * 5);
                ((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2) this.f$4).didSelectDate(true, (int) (calendar.getTimeInMillis() / 1000), 0);
                ((BottomSheet.Builder) this.f$5).bottomSheet.dismissRunnable.run();
                break;
            default:
                ((StickersAlert) this.f$0).lambda$showNameEnterAlert$44((int[]) this.f$1, (EditTextBoldCursor) this.f$2, (TextView) this.f$3, (TextView) this.f$4, (AlertDialog.Builder) this.f$5, view);
                break;
        }
    }

    public AlertsCreator$$ExternalSyntheticLambda50(Calendar calendar, NumberPicker numberPicker, BoostDialogs.AnonymousClass1 anonymousClass1, BoostDialogs.AnonymousClass2 anonymousClass2, BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2 boostViaGiftsBottomSheet$$ExternalSyntheticLambda2, BottomSheet.Builder builder) {
        this.$r8$classId = 2;
        this.f$3 = calendar;
        this.f$0 = numberPicker;
        this.f$1 = anonymousClass1;
        this.f$2 = anonymousClass2;
        this.f$4 = boostViaGiftsBottomSheet$$ExternalSyntheticLambda2;
        this.f$5 = builder;
    }
}
