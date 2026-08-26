package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.ui.ActionBar.AlertDialog;

public final class AIEditorAlert$$ExternalSyntheticLambda20 implements AlertsCreator.ScheduleDatePickerDelegate, ImageReceiver.ImageReceiverDelegate, AlertDialog.OnButtonClickListener, LanguageDetector.ExceptionCallback, NumberPicker.Formatter, NumberPicker.OnValueChangeListener {
    public final int $r8$classId;

    public AIEditorAlert$$ExternalSyntheticLambda20(int i) {
        this.$r8$classId = i;
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        switch (this.$r8$classId) {
            case 1:
                ChatActivityEnterView.AnonymousClass24.lambda$onTouchEvent$1(z, i, i2);
                break;
            default:
                ChatActivityEnterView.AnonymousClass24.lambda$onTouchEvent$7(z, i, i2);
                break;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ChatAttachAlert.AttachBotButton.lambda$new$0(imageReceiver, z, z2, z3);
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public String format(int i) {
        switch (this.$r8$classId) {
            case 6:
                return AlertsCreator.lambda$createBirthdayPickerDialog$144(i);
            case 7:
                return AlertsCreator.lambda$createBirthdayPickerDialog$146(i);
            case 8:
                return AlertsCreator.lambda$createDatePickerDialog$115(i);
            case 9:
                return AlertsCreator.lambda$createSuggestedMessageDatePickerDialog$253(i);
            case 10:
                return AlertsCreator.lambda$createSuggestedMessageDatePickerDialog$254(i);
            case 11:
                return AlertsCreator.lambda$createDatePickerDialog$137(i);
            case 12:
                return AlertsCreator.lambda$createDatePickerDialog$139(i);
            case 13:
                return AlertsCreator.lambda$createDatePickerDialog$140(i);
            case 14:
                return AlertsCreator.lambda$createScheduleDatePickerDialog$124(i);
            case 15:
                return AlertsCreator.lambda$createScheduleDatePickerDialog$126(i);
            case 16:
                return AlertsCreator.lambda$createScheduleDatePickerDialog$127(i);
            case 17:
            case 21:
            default:
                return AlertsCreator.lambda$createPollCloseDatePickerDialog$165(i);
            case 18:
                return AlertsCreator.lambda$createCalendarPickerDialog$192(i);
            case 19:
                return AlertsCreator.lambda$createCalendarPickerDialog$194(i);
            case 20:
                return AlertsCreator.lambda$createCalendarPickerDialog$195(i);
            case 22:
                return AlertsCreator.lambda$createFormattedDatePickerDialog$154(i);
            case 23:
                return AlertsCreator.lambda$createFormattedDatePickerDialog$157(i);
            case 24:
                return AlertsCreator.lambda$createFormattedDatePickerDialog$159(i);
            case 25:
                return AlertsCreator.lambda$createSoundFrequencyPickerDialog$181(i);
            case 26:
                return AlertsCreator.lambda$createSoundFrequencyPickerDialog$182(i);
            case 27:
                return AlertsCreator.lambda$createSoundFrequencyPickerDialog$183(i);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 4:
                alertDialog.dismiss();
                break;
            case 17:
                alertDialog.dismiss();
                break;
            default:
                alertDialog.dismiss();
                break;
        }
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i, int i2) {
        AlertsCreator.lambda$createSoundFrequencyPickerDialog$185(numberPicker, i, i2);
    }

    @Override
    public void run(Exception exc) {
        switch (this.$r8$classId) {
            case 0:
                FileLog.e(exc);
                break;
            default:
                FileLog.e(exc);
                break;
        }
    }
}
