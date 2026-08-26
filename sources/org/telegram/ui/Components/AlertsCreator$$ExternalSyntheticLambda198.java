package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;

public final class AlertsCreator$$ExternalSyntheticLambda198 implements View.OnClickListener {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final KeyEvent.Callback f$2;
    public final ViewGroup f$3;
    public final int[] f$4;
    public final Object f$5;
    public final Object f$6;
    public final Object f$7;

    public AlertsCreator$$ExternalSyntheticLambda198(FrameLayout frameLayout, Theme.ResourcesProvider resourcesProvider, BottomSheet bottomSheet, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, ShareAlert$$ExternalSyntheticLambda1 shareAlert$$ExternalSyntheticLambda1) {
        this.f$0 = frameLayout;
        this.f$1 = resourcesProvider;
        this.f$2 = bottomSheet;
        this.f$3 = frameLayout2;
        this.f$4 = iArr;
        this.f$5 = strArr;
        this.f$6 = iArr2;
        this.f$7 = shareAlert$$ExternalSyntheticLambda1;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                int[] iArr = (int[]) this.f$6;
                AlertsCreator.lambda$createScheduleDatePickerDialog$133((FrameLayout) this.f$0, (Theme.ResourcesProvider) this.f$1, (BottomSheet) this.f$2, (FrameLayout) this.f$3, this.f$4, (String[]) this.f$5, iArr, (ShareAlert$$ExternalSyntheticLambda1) this.f$7, view);
                break;
            default:
                AlertsCreator.lambda$createFormattedDatePickerDialog$162((boolean[]) this.f$0, (NumberPicker) this.f$3, (NumberPicker) this.f$1, (NumberPicker) this.f$2, (NumberPicker) this.f$6, (AlertsCreator.FormattedDatePickerDelegate) this.f$5, this.f$4, (BottomSheet.Builder) this.f$7, view);
                break;
        }
    }

    public AlertsCreator$$ExternalSyntheticLambda198(boolean[] zArr, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, AlertsCreator.FormattedDatePickerDelegate formattedDatePickerDelegate, int[] iArr, BottomSheet.Builder builder) {
        this.f$0 = zArr;
        this.f$3 = numberPicker;
        this.f$1 = numberPicker2;
        this.f$2 = numberPicker3;
        this.f$6 = numberPicker4;
        this.f$5 = formattedDatePickerDelegate;
        this.f$4 = iArr;
        this.f$7 = builder;
    }
}
