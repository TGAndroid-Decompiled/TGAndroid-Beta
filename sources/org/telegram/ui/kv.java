package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class kv extends ChatActivityEnterView {
    public final yw O6;

    public kv(yw ywVar, Activity activity, rw rwVar) {
        super(activity, rwVar, null, false, null);
        this.O6 = ywVar;
    }

    @Override
    public final void P0(float f10) {
        yw ywVar = this.O6;
        ywVar.A1.setInputBubbleHeight(f10);
        ywVar.E3();
        ywVar.F3();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        if (motionEvent.getAction() == 0) {
            yw ywVar = this.O6;
            Activity parentActivity = ywVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.e2) ywVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity, i7);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        yw ywVar = this.O6;
        int i7 = ywVar.U0;
        kv kvVar = ywVar.D1;
        if (kvVar == null) {
            fieldText = "";
        } else {
            fieldText = kvVar.getFieldText();
        }
        return Math.max(1, i7 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        yw ywVar = this.O6;
        ArrayList arrayList = ywVar.K2;
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
            long N1 = ywVar.getMessagesController().N1(longValue);
            if (N1 <= 0 && longValue > 0) {
                N1 = org.telegram.messenger.m5.k(ywVar.getMessagesController().J2(longValue));
            }
            j3 += N1;
        }
        return j3;
    }
}
