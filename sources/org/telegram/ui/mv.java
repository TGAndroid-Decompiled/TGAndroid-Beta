package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class mv extends ChatActivityEnterView {
    public final bx f50117t7;

    public mv(bx bxVar, Activity activity, uw uwVar) {
        super(activity, uwVar, null, false, null);
        this.f50117t7 = bxVar;
    }

    @Override
    public final void c1(float f10) {
        bx bxVar = this.f50117t7;
        bxVar.A1.setInputBubbleHeight(f10);
        bxVar.E3();
        bxVar.F3();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        if (motionEvent.getAction() == 0) {
            bx bxVar = this.f50117t7;
            Activity parentActivity = bxVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.g2) bxVar).classGuid;
            org.telegram.messenger.g0.Z2(parentActivity, i7);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        bx bxVar = this.f50117t7;
        int i7 = bxVar.U0;
        mv mvVar = bxVar.D1;
        if (mvVar == null) {
            fieldText = "";
        } else {
            fieldText = mvVar.getFieldText();
        }
        return Math.max(1, i7 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        bx bxVar = this.f50117t7;
        ArrayList arrayList = bxVar.K2;
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
            long P1 = bxVar.getMessagesController().P1(longValue);
            if (P1 <= 0 && longValue > 0) {
                P1 = org.telegram.messenger.n5.k(bxVar.getMessagesController().P2(longValue));
            }
            j3 += P1;
        }
        return j3;
    }
}
