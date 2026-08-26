package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.UItem;

public final class StickersActivity$$ExternalSyntheticLambda4 implements Utilities.Callback5, Utilities.Callback5Return {
    public final StickersActivity f$0;

    public StickersActivity$$ExternalSyntheticLambda4(StickersActivity stickersActivity) {
        this.f$0 = stickersActivity;
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
