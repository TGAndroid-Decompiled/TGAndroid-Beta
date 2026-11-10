package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class mv extends ChatActivityEnterView {
    public final zw f48058t5;

    public mv(zw zwVar, Activity activity, sw swVar) {
        super(activity, swVar, null, false, null);
        this.f48058t5 = zwVar;
    }

    @Override
    public final void A0(float f10) {
        zw zwVar = this.f48058t5;
        zwVar.f52684z1.setInputBubbleHeight(f10);
        zwVar.E3();
        zwVar.F3();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        if (motionEvent.getAction() == 0) {
            zw zwVar = this.f48058t5;
            Activity parentActivity = zwVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.f2) zwVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity, i7);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        zw zwVar = this.f48058t5;
        int i7 = zwVar.T0;
        mv mvVar = zwVar.C1;
        if (mvVar == null) {
            fieldText = "";
        } else {
            fieldText = mvVar.getFieldText();
        }
        return Math.max(1, i7 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        zw zwVar = this.f48058t5;
        ArrayList arrayList = zwVar.J2;
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
            long N1 = zwVar.getMessagesController().N1(longValue);
            if (N1 <= 0 && longValue > 0) {
                N1 = org.telegram.messenger.m5.k(zwVar.getMessagesController().J2(longValue));
            }
            j3 += N1;
        }
        return j3;
    }
}
