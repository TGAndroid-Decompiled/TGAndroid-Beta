package org.telegram.ui.bots;

import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda45;

public final class SetupEmojiStatusSheet$$ExternalSyntheticLambda3 implements NumberPicker.OnValueChangeListener, AlertDialog.OnButtonClickListener {
    public final int f$0;
    public final Object f$1;
    public final Object f$2;
    public final int f$3;
    public final Object f$4;
    public final Object f$5;

    public SetupEmojiStatusSheet$$ExternalSyntheticLambda3(int i, boolean[] zArr, TLRPC.Document document, int i2, boolean[] zArr2, Utilities.Callback callback) {
        this.f$0 = i;
        this.f$1 = zArr;
        this.f$2 = document;
        this.f$3 = i2;
        this.f$4 = zArr2;
        this.f$5 = callback;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        int i2 = this.f$0;
        if (!UserConfig.getInstance(i2).isPremium()) {
            SetupEmojiStatusSheet.AnonymousClass1 anonymousClass1 = new SetupEmojiStatusSheet.AnonymousClass1(null);
            new PremiumFeatureBottomSheet(anonymousClass1, AndroidUtilities.findActivity(LaunchActivity.instance), anonymousClass1.getCurrentAccount(), false, 12, false, null).show();
            return;
        }
        ((boolean[]) this.f$1)[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = ((TLRPC.Document) this.f$2).id;
        int i3 = this.f$3;
        if (i3 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i2).getCurrentTime() + i3;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i2).sendRequest(updateemojistatus, new BotWebViewContainer$$ExternalSyntheticLambda45((boolean[]) this.f$4, (Utilities.Callback) this.f$5, i2, updateemojistatus, 2));
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i, int i2) {
        try {
            ((BoostDialogs.AnonymousClass3) this.f$1).performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        Object tag = numberPicker.getTag();
        BoostDialogs.AnonymousClass2 anonymousClass2 = (BoostDialogs.AnonymousClass2) this.f$2;
        if (tag != null && numberPicker.getTag().equals("DAY")) {
            int value = numberPicker.getValue();
            int minValue = numberPicker.getMinValue();
            BoostDialogs.AnonymousClass1 anonymousClass1 = (BoostDialogs.AnonymousClass1) this.f$4;
            if (value == minValue) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i3 = calendar.get(11);
                int i4 = (calendar.get(12) / 5) + 1;
                if (i4 > 11) {
                    if (i3 == 23) {
                        numberPicker.setMinValue(numberPicker.getMinValue() + 1);
                        anonymousClass1.setMinValue(0);
                    } else {
                        anonymousClass1.setMinValue(i3 + 1);
                    }
                    anonymousClass2.setMinValue(0);
                } else {
                    anonymousClass1.setMinValue(i3);
                    anonymousClass2.setMinValue(i4);
                }
            } else if (numberPicker.getValue() == numberPicker.getMaxValue()) {
                anonymousClass1.setMaxValue(this.f$0);
                anonymousClass2.setMaxValue(Math.min(this.f$3 / 5, 11));
            } else {
                anonymousClass1.setMinValue(0);
                anonymousClass2.setMinValue(0);
                anonymousClass1.setMaxValue(23);
                anonymousClass2.setMaxValue(11);
            }
        }
        if (numberPicker.getTag() == null || !numberPicker.getTag().equals("HOUR")) {
            return;
        }
        NumberPicker numberPicker2 = (NumberPicker) this.f$5;
        if (numberPicker2.getValue() == numberPicker2.getMinValue()) {
            if (numberPicker.getValue() != numberPicker.getMinValue()) {
                anonymousClass2.setMinValue(0);
                anonymousClass2.setMaxValue(11);
                return;
            }
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(System.currentTimeMillis());
            int i5 = (calendar2.get(12) / 5) + 1;
            if (i5 > 11) {
                anonymousClass2.setMinValue(0);
            } else {
                anonymousClass2.setMinValue(i5);
            }
        }
    }

    public SetupEmojiStatusSheet$$ExternalSyntheticLambda3(BoostDialogs.AnonymousClass3 anonymousClass3, BoostDialogs.AnonymousClass1 anonymousClass1, BoostDialogs.AnonymousClass2 anonymousClass2, int i, int i2, NumberPicker numberPicker) {
        this.f$1 = anonymousClass3;
        this.f$4 = anonymousClass1;
        this.f$2 = anonymousClass2;
        this.f$0 = i;
        this.f$3 = i2;
        this.f$5 = numberPicker;
    }
}
