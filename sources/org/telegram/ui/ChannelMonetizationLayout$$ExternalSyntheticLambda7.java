package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.UItem;

public final class ChannelMonetizationLayout$$ExternalSyntheticLambda7 implements Utilities.Callback5, Utilities.Callback5Return, AlertDialog.OnButtonClickListener {
    public final ChannelMonetizationLayout f$0;

    public ChannelMonetizationLayout$$ExternalSyntheticLambda7(ChannelMonetizationLayout channelMonetizationLayout) {
        this.f$0 = channelMonetizationLayout;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$initWithdraw$20(alertDialog, i);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Integer) obj3).intValue();
        float fFloatValue = ((Float) obj4).floatValue();
        float fFloatValue2 = ((Float) obj5).floatValue();
        return Boolean.valueOf(this.f$0.onLongClick((UItem) obj, (View) obj2, iIntValue, fFloatValue, fFloatValue2));
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Integer) obj3).intValue();
        float fFloatValue = ((Float) obj4).floatValue();
        float fFloatValue2 = ((Float) obj5).floatValue();
        this.f$0.onClick((UItem) obj, (View) obj2, iIntValue, fFloatValue, fFloatValue2);
    }
}
