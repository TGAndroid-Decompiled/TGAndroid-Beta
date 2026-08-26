package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

public final class AlertsCreator$$ExternalSyntheticLambda139 implements ImageReceiver.ImageReceiverDelegate, NumberPicker.Formatter, AlertsCreator.ScheduleDatePickerDelegate, RecyclerListView.OnItemLongClickListener {
    public final int $r8$classId;
    public final int f$0;
    public final Object f$1;

    public AlertsCreator$$ExternalSyntheticLambda139(int i, Object obj, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = obj;
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        switch (this.$r8$classId) {
            case 3:
                ChatNotificationsPopupWrapper.lambda$new$5(this.f$0, (ChatNotificationsPopupWrapper.Callback) this.f$1, z, i, i2);
                break;
            default:
                ChatNotificationsPopupWrapper.lambda$addAsItemOptions$15(this.f$0, (Utilities.Callback) this.f$1, z, i, i2);
                break;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ((AudioPlayerAlert.CoverContainer) this.f$1).lambda$new$0(this.f$0, imageReceiver, z, z2, z3);
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public String format(int i) {
        switch (this.$r8$classId) {
            case 0:
                return AlertsCreator.lambda$createTimezonePickerDialog$102(this.f$0, (ArrayList) this.f$1, i);
            default:
                return AlertsCreator.lambda$createFormattedDatePickerDialog$155((Calendar) this.f$1, this.f$0, i);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return ((ReactionsContainerLayout) this.f$1).lambda$new$1(this.f$0, view, i);
    }

    public AlertsCreator$$ExternalSyntheticLambda139(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$0 = i;
    }
}
