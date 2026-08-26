package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;

public final class ShareAlert$$ExternalSyntheticLambda19 implements View.OnTouchListener {
    public final int $r8$classId;

    public ShareAlert$$ExternalSyntheticLambda19(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$r8$classId) {
            case 0:
                return ShareAlert.lambda$new$15(view, motionEvent);
            case 1:
                return AlertsCreator.lambda$createBirthdayPickerDialog$142(view, motionEvent);
            case 2:
                return AlertsCreator.lambda$createTimezonePickerDialog$103(view, motionEvent);
            case 3:
                return AlertsCreator.lambda$createAutoDeleteDatePickerDialog$178(view, motionEvent);
            case 4:
                return AlertsCreator.lambda$createSuggestedMessageDatePickerDialog$249(view, motionEvent);
            case 5:
                return AlertsCreator.lambda$createSuggestedMessageDatePickerDialog$250(view, motionEvent);
            case 6:
                return AlertsCreator.lambda$createDatePickerDialog$136(view, motionEvent);
            case 7:
                return AlertsCreator.lambda$createScheduleDatePickerDialog$121(view, motionEvent);
            case 8:
                return AlertsCreator.lambda$createCalendarPickerDialog$191(view, motionEvent);
            case 9:
                return AlertsCreator.lambda$createCustomPicker$264(view, motionEvent);
            case 10:
                return AlertsCreator.lambda$createFormattedDatePickerDialog$160(view, motionEvent);
            case 11:
                return AlertsCreator.lambda$createSoundFrequencyPickerDialog$184(view, motionEvent);
            case 12:
                return AlertsCreator.lambda$createPollCloseDatePickerDialog$164(view, motionEvent);
            case 13:
                return AlertsCreator.lambda$createStatusUntilDatePickerDialog$171(view, motionEvent);
            case 14:
                return AlertsCreator.lambda$createMuteForPickerDialog$188(view, motionEvent);
            case 15:
                return AlertsCreator.lambda$createTimePickerDialog$111(view, motionEvent);
            case 16:
                return AudioPlayerAlert.lambda$new$8(view, motionEvent);
            case 17:
                return ChatActivityEnterView.lambda$createRecordPanel$70(view, motionEvent);
            case 18:
                return ChatAttachAlert.lambda$new$18(view, motionEvent);
            case 19:
                return ChatAttachAlertDocumentLayout.lambda$new$0(view, motionEvent);
            case 20:
                return ChatAttachAlertLocationLayout.lambda$new$4(view, motionEvent);
            case 21:
                return ChatThemeBottomSheet.lambda$setupLightDarkTheme$11(view, motionEvent);
            case 22:
                return EmbedBottomSheet.lambda$new$0(view, motionEvent);
            case 23:
                return EmbedBottomSheet.lambda$new$1(view, motionEvent);
            case 24:
                return EmptyTextProgressView.lambda$new$0(view, motionEvent);
            case 25:
                return PasscodeView.lambda$onShow$15(view, motionEvent);
            case 26:
                return ProximitySheet.lambda$new$0(view, motionEvent);
            case 27:
                return SearchViewPager.lambda$showActionMode$1(view, motionEvent);
            case 28:
                return SharedMediaLayout.lambda$new$29(view, motionEvent);
            default:
                return StickersAlert.lambda$init$12(view, motionEvent);
        }
    }
}
