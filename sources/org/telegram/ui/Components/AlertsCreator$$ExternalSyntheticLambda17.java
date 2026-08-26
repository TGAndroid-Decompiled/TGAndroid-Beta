package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda470;
import org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda13;

public final class AlertsCreator$$ExternalSyntheticLambda17 implements View.OnClickListener {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final KeyEvent.Callback f$2;
    public final ViewGroup f$3;
    public final Object f$4;
    public final Object f$5;
    public final int[] f$6;
    public final Object f$7;

    public AlertsCreator$$ExternalSyntheticLambda17(FrameLayout frameLayout, Theme.ResourcesProvider resourcesProvider, BottomSheet bottomSheet, FrameLayout frameLayout2, int[] iArr, String[] strArr, int[] iArr2, ChatUsersActivity$$ExternalSyntheticLambda13 chatUsersActivity$$ExternalSyntheticLambda13) {
        this.f$0 = frameLayout;
        this.f$1 = resourcesProvider;
        this.f$2 = bottomSheet;
        this.f$3 = frameLayout2;
        this.f$6 = iArr;
        this.f$4 = strArr;
        this.f$5 = iArr2;
        this.f$7 = chatUsersActivity$$ExternalSyntheticLambda13;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((boolean[]) this.f$0)[0] = false;
                int iCheckFormattedDateInput = (int) (AlertsCreator.checkFormattedDateInput(null, (NumberPicker) this.f$1, (NumberPicker) this.f$2, (NumberPicker) this.f$3, (NumberPicker) this.f$4) / 1000);
                int i = this.f$6[0];
                EditTextCaption$$ExternalSyntheticLambda2 editTextCaption$$ExternalSyntheticLambda2 = (EditTextCaption$$ExternalSyntheticLambda2) this.f$5;
                ((EditTextCaption) editTextCaption$$ExternalSyntheticLambda2.f$0).lambda$makeSelectedDate$0(editTextCaption$$ExternalSyntheticLambda2.f$1, editTextCaption$$ExternalSyntheticLambda2.f$2, iCheckFormattedDateInput, i);
                ((BottomSheet.Builder) this.f$7).bottomSheet.dismissRunnable.run();
                break;
            default:
                boolean zIsPremium = UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
                Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$1;
                if (!zIsPremium) {
                    new BulletinFactory((FrameLayout) this.f$0, resourcesProvider).createSimpleBulletinWithIconSize(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.MessageScheduledRepeatPremium), new ChatActivity$$ExternalSyntheticLambda470(9))).show();
                } else {
                    ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(((BottomSheet) this.f$2).container, resourcesProvider, (FrameLayout) this.f$3);
                    int i2 = 0;
                    while (true) {
                        int[] iArr = this.f$6;
                        if (i2 >= iArr.length) {
                            itemOptionsMakeOptions.gravity = 1;
                            itemOptionsMakeOptions.show();
                        } else {
                            itemOptionsMakeOptions.add(0, ((String[]) this.f$4)[i2], new ChatActivity$$ExternalSyntheticLambda17((int[]) this.f$5, iArr[i2], (ChatUsersActivity$$ExternalSyntheticLambda13) this.f$7, 16), false);
                            i2++;
                        }
                    }
                }
                break;
        }
    }

    public AlertsCreator$$ExternalSyntheticLambda17(boolean[] zArr, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3, NumberPicker numberPicker4, EditTextCaption$$ExternalSyntheticLambda2 editTextCaption$$ExternalSyntheticLambda2, int[] iArr, BottomSheet.Builder builder) {
        this.f$0 = zArr;
        this.f$1 = numberPicker;
        this.f$2 = numberPicker2;
        this.f$3 = numberPicker3;
        this.f$4 = numberPicker4;
        this.f$5 = editTextCaption$$ExternalSyntheticLambda2;
        this.f$6 = iArr;
        this.f$7 = builder;
    }
}
