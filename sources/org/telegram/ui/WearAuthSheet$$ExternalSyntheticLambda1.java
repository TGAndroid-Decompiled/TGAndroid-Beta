package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.StickersAlert;

public final class WearAuthSheet$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final View f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;

    public WearAuthSheet$$ExternalSyntheticLambda1(Object obj, ViewGroup viewGroup, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = viewGroup;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$5 = obj5;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                BottomSheet bottomSheet = (BottomSheet) this.f$0;
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(bottomSheet.container, bottomSheet.getResourcesProvider(), (FrameLayout) this.f$1);
                ArrayList arrayList = (ArrayList) this.f$2;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        itemOptionsMakeOptions.drawScrim = false;
                        itemOptionsMakeOptions.onTopOfScrim = true;
                        itemOptionsMakeOptions.dimAlpha = 0;
                        itemOptionsMakeOptions.gravity = 3;
                        itemOptionsMakeOptions.translate(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                        itemOptionsMakeOptions.show();
                        break;
                    } else {
                        Object obj = arrayList.get(i);
                        i++;
                        int iIntValue = ((Integer) obj).intValue();
                        TLRPC.User currentUser = UserConfig.getInstance(iIntValue).getCurrentUser();
                        if (currentUser != null) {
                            int[] iArr = (int[]) this.f$3;
                            itemOptionsMakeOptions.addAccount(iIntValue, iArr[0] == iIntValue, new WearAuthSheet$$ExternalSyntheticLambda3(iArr, iIntValue, (AvatarDrawable) this.f$4, currentUser, (BackupImageView) this.f$5, 0));
                        }
                    }
                }
                break;
            case 1:
                NumberPicker numberPicker = (NumberPicker) this.f$0;
                AlertsCreator.AnonymousClass41 anonymousClass41 = (AlertsCreator.AnonymousClass41) this.f$1;
                AlertsCreator.AnonymousClass42 anonymousClass42 = (AlertsCreator.AnonymousClass42) this.f$2;
                boolean zCheckScheduleDate = AlertsCreator.checkScheduleDate(null, null, 0L, 0L, 0, numberPicker, anonymousClass41, anonymousClass42);
                long jCurrentTimeMillis = System.currentTimeMillis();
                Calendar calendar = (Calendar) this.f$3;
                calendar.setTimeInMillis(jCurrentTimeMillis);
                calendar.add(6, numberPicker.getValue());
                calendar.set(11, anonymousClass41.getValue());
                calendar.set(12, anonymousClass42.getValue());
                if (zCheckScheduleDate) {
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                }
                int timeInMillis = (int) (calendar.getTimeInMillis() / 1000);
                SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10 selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10 = (SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10) this.f$4;
                SelectAnimatedEmojiDialog.AnonymousClass17.AnonymousClass1 anonymousClass1 = (SelectAnimatedEmojiDialog.AnonymousClass17.AnonymousClass1) selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10.f$0;
                ((boolean[]) selectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10.f$1)[0] = true;
                anonymousClass1.done(Integer.valueOf(timeInMillis));
                ((BottomSheet.Builder) this.f$5).bottomSheet.dismissRunnable.run();
                break;
            case 2:
                NumberPicker numberPicker2 = (NumberPicker) this.f$0;
                AlertsCreator.AnonymousClass29 anonymousClass29 = (AlertsCreator.AnonymousClass29) this.f$1;
                AlertsCreator.AnonymousClass30 anonymousClass30 = (AlertsCreator.AnonymousClass30) this.f$2;
                boolean zCheckScheduleDate2 = AlertsCreator.checkScheduleDate(null, null, 0L, 0L, 0, numberPicker2, anonymousClass29, anonymousClass30);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                Calendar calendar2 = (Calendar) this.f$3;
                calendar2.setTimeInMillis(jCurrentTimeMillis2);
                calendar2.add(6, numberPicker2.getValue());
                calendar2.set(11, anonymousClass29.getValue());
                calendar2.set(12, anonymousClass30.getValue());
                if (zCheckScheduleDate2) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                ((AlertsCreator.ScheduleDatePickerDelegate) this.f$4).didSelectDate((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((BottomSheet.Builder) this.f$5).bottomSheet.dismissRunnable.run();
                break;
            case 3:
                NumberPicker numberPicker3 = (NumberPicker) this.f$0;
                NumberPicker numberPicker4 = (NumberPicker) this.f$1;
                NumberPicker numberPicker5 = (NumberPicker) this.f$2;
                AlertsCreator.checkCalendarDate(numberPicker3, numberPicker4, numberPicker5);
                int value = numberPicker5.getValue();
                Calendar calendar3 = (Calendar) this.f$3;
                calendar3.set(1, value);
                calendar3.set(2, numberPicker4.getValue());
                calendar3.set(5, numberPicker3.getValue());
                calendar3.set(12, 0);
                calendar3.set(11, 0);
                calendar3.set(13, 0);
                ((MessagesStorage.IntCallback) this.f$4).run((int) (calendar3.getTimeInMillis() / 1000));
                ((BottomSheet.Builder) this.f$5).bottomSheet.dismissRunnable.run();
                break;
            case 4:
                long value2 = (((long) ((NumberPicker) this.f$1).getValue()) * 86400000) + System.currentTimeMillis();
                Calendar calendar4 = (Calendar) this.f$0;
                calendar4.setTimeInMillis(value2);
                calendar4.set(11, ((BoostDialogs.AnonymousClass1) this.f$2).getValue());
                calendar4.set(12, ((BoostDialogs.AnonymousClass2) this.f$3).getValue() * 5);
                ((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2) this.f$4).didSelectDate((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                ((BottomSheet.Builder) this.f$5).bottomSheet.dismissRunnable.run();
                break;
            default:
                ((StickersAlert) this.f$0).lambda$showNameEnterAlert$44((int[]) this.f$3, (EditTextBoldCursor) this.f$1, (TextView) this.f$2, (TextView) this.f$4, (AlertDialog.Builder) this.f$5);
                break;
        }
    }

    public WearAuthSheet$$ExternalSyntheticLambda1(StickersAlert stickersAlert, int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog.Builder builder) {
        this.$r8$classId = 5;
        this.f$0 = stickersAlert;
        this.f$3 = iArr;
        this.f$1 = editTextBoldCursor;
        this.f$2 = textView;
        this.f$4 = textView2;
        this.f$5 = builder;
    }
}
