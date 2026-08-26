package org.telegram.ui;

import android.util.SparseIntArray;
import androidx.viewpager.widget.ViewPager;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.ReactedUsersListView;
import org.telegram.ui.bots.SetupEmojiStatusSheet;

public final class ChatActivity$106$$ExternalSyntheticLambda2 implements ReactedUsersListView.OnHeightChangedListener, NumberPicker.OnValueChangeListener, AlertDialog.OnButtonClickListener {
    public final Object f$0;
    public final int f$1;
    public final int f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;

    public ChatActivity$106$$ExternalSyntheticLambda2(int i, boolean[] zArr, TLRPC.Document document, int i2, boolean[] zArr2, Utilities.Callback callback) {
        this.f$1 = i;
        this.f$0 = zArr;
        this.f$3 = document;
        this.f$2 = i2;
        this.f$4 = zArr2;
        this.f$5 = callback;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        int i2 = this.f$1;
        if (!UserConfig.getInstance(i2).isPremium()) {
            SetupEmojiStatusSheet.AnonymousClass1 anonymousClass1 = new SetupEmojiStatusSheet.AnonymousClass1(null);
            new PremiumFeatureBottomSheet(anonymousClass1, AndroidUtilities.findActivity(LaunchActivity.instance), anonymousClass1.getCurrentAccount(), false, 12, false, null).show();
            return;
        }
        ((boolean[]) this.f$0)[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = ((TLRPC.Document) this.f$3).id;
        int i3 = this.f$2;
        if (i3 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i2).getCurrentTime() + i3;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i2).sendRequest(updateemojistatus, new ArticleViewer$$ExternalSyntheticLambda53((boolean[]) this.f$4, (Utilities.Callback) this.f$5, i2, updateemojistatus, 7));
    }

    @Override
    public void onHeightChanged(ReactedUsersListView reactedUsersListView, int i) {
        int i2 = this.f$2 + i;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f$0;
        int i3 = this.f$1;
        sparseIntArray.put(i3, i2);
        if (((ViewPager) this.f$3).getCurrentItem() == i3) {
            ((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$4).getSwipeBack().setNewForegroundHeight(((int[]) this.f$5)[0], i2, true);
        }
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i) {
        try {
            ((AlertsCreator.AnonymousClass35) this.f$0).performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        Object tag = numberPicker.getTag();
        BoostDialogs.AnonymousClass2 anonymousClass2 = (BoostDialogs.AnonymousClass2) this.f$4;
        if (tag != null && numberPicker.getTag().equals("DAY")) {
            int value = numberPicker.getValue();
            int minValue = numberPicker.getMinValue();
            BoostDialogs.AnonymousClass1 anonymousClass1 = (BoostDialogs.AnonymousClass1) this.f$3;
            if (value == minValue) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i2 = calendar.get(11);
                int i3 = (calendar.get(12) / 5) + 1;
                if (i3 > 11) {
                    if (i2 == 23) {
                        numberPicker.setMinValue(numberPicker.getMinValue() + 1);
                        anonymousClass1.setMinValue(0);
                    } else {
                        anonymousClass1.setMinValue(i2 + 1);
                    }
                    anonymousClass2.setMinValue(0);
                } else {
                    anonymousClass1.setMinValue(i2);
                    anonymousClass2.setMinValue(i3);
                }
            } else if (numberPicker.getValue() == numberPicker.getMaxValue()) {
                anonymousClass1.setMaxValue(this.f$1);
                anonymousClass2.setMaxValue(Math.min(this.f$2 / 5, 11));
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
            int i4 = (calendar2.get(12) / 5) + 1;
            if (i4 > 11) {
                anonymousClass2.setMinValue(0);
            } else {
                anonymousClass2.setMinValue(i4);
            }
        }
    }

    public ChatActivity$106$$ExternalSyntheticLambda2(SparseIntArray sparseIntArray, int i, int i2, ViewPager viewPager, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, int[] iArr) {
        this.f$0 = sparseIntArray;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = viewPager;
        this.f$4 = actionBarPopupWindowLayout;
        this.f$5 = iArr;
    }

    public ChatActivity$106$$ExternalSyntheticLambda2(AlertsCreator.AnonymousClass35 anonymousClass35, BoostDialogs.AnonymousClass1 anonymousClass1, BoostDialogs.AnonymousClass2 anonymousClass2, int i, int i2, NumberPicker numberPicker) {
        this.f$0 = anonymousClass35;
        this.f$3 = anonymousClass1;
        this.f$4 = anonymousClass2;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$5 = numberPicker;
    }
}
