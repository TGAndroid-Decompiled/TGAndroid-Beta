package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jv extends ChatActivityEnterView {
    public final ww f47043t5;

    public jv(ww wwVar, Activity activity, pw pwVar) {
        super(activity, pwVar, null, false, null);
        this.f47043t5 = wwVar;
    }

    @Override
    public final void A0(float f10) {
        ww wwVar = this.f47043t5;
        wwVar.f51653y1.setInputBubbleHeight(f10);
        wwVar.E3();
        wwVar.F3();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        if (motionEvent.getAction() == 0) {
            ww wwVar = this.f47043t5;
            Activity parentActivity = wwVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.f2) wwVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity, i7);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        ww wwVar = this.f47043t5;
        int i7 = wwVar.S0;
        jv jvVar = wwVar.B1;
        if (jvVar == null) {
            fieldText = "";
        } else {
            fieldText = jvVar.getFieldText();
        }
        return Math.max(1, i7 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        ww wwVar = this.f47043t5;
        ArrayList arrayList = wwVar.I2;
        if (arrayList == null) {
            return 0L;
        }
        int size = arrayList.size();
        int i7 = 0;
        long j3 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            long longValue = ((Long) obj).longValue();
            long N1 = wwVar.getMessagesController().N1(longValue);
            if (N1 <= 0 && longValue > 0) {
                N1 = org.telegram.messenger.m5.k(wwVar.getMessagesController().J2(longValue));
            }
            j3 += N1;
        }
        return j3;
    }
}
