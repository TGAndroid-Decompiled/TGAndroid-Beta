package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ow extends ChatActivityEnterView {
    public final dy f41253j5;

    public ow(dy dyVar, Activity activity, vx vxVar) {
        super(activity, vxVar, null, false, null);
        this.f41253j5 = dyVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i9;
        if (motionEvent.getAction() == 0) {
            dy dyVar = this.f41253j5;
            Activity parentActivity = dyVar.getParentActivity();
            i9 = ((org.telegram.ui.ActionBar.o2) dyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i9);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        dy dyVar = this.f41253j5;
        int i9 = dyVar.O0;
        ow owVar = dyVar.f37746x1;
        if (owVar == null) {
            fieldText = "";
        } else {
            fieldText = owVar.getFieldText();
        }
        return Math.max(1, i9 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        dy dyVar = this.f41253j5;
        ArrayList arrayList = dyVar.E2;
        if (arrayList == null) {
            return 0L;
        }
        int size = arrayList.size();
        int i9 = 0;
        long j10 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            long longValue = ((Long) obj).longValue();
            long sendPaidMessagesStars = dyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(dyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j10 += sendPaidMessagesStars;
        }
        return j10;
    }

    @Override
    public final void z0(float f10) {
        dy dyVar = this.f41253j5;
        dyVar.f37732u1.setInputBubbleHeight(f10);
        dyVar.s3();
        dyVar.m3();
        dyVar.t3();
    }
}
