package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ow extends ChatActivityEnterView {
    public final ay f40387t5;

    public ow(ay ayVar, Activity activity, tx txVar) {
        super(activity, txVar, null, false, null);
        this.f40387t5 = ayVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            ay ayVar = this.f40387t5;
            Activity parentActivity = ayVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.k2) ayVar).classGuid;
            org.telegram.messenger.i0.Z2(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        ay ayVar = this.f40387t5;
        int i10 = ayVar.S0;
        ow owVar = ayVar.B1;
        if (owVar == null) {
            fieldText = "";
        } else {
            fieldText = owVar.getFieldText();
        }
        return Math.max(1, i10 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        ay ayVar = this.f40387t5;
        ArrayList arrayList = ayVar.I2;
        if (arrayList == null) {
            return 0L;
        }
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            long M1 = ayVar.getMessagesController().M1(longValue);
            if (M1 <= 0 && longValue > 0) {
                M1 = org.telegram.messenger.o5.k(ayVar.getMessagesController().H2(longValue));
            }
            j10 += M1;
        }
        return j10;
    }

    @Override
    public final void y0(float f7) {
        ay ayVar = this.f40387t5;
        ayVar.f35898y1.setInputBubbleHeight(f7);
        ayVar.D3();
        ayVar.E3();
    }
}
