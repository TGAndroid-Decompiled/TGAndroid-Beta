package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class fx extends ChatActivityEnterView {
    public final vy T5;

    public fx(vy vyVar, Activity activity, oy oyVar) {
        super(activity, oyVar, null, false, null);
        this.T5 = vyVar;
    }

    @Override
    public final void C0(float f7) {
        vy vyVar = this.T5;
        vyVar.f43007y1.setInputBubbleHeight(f7);
        vyVar.p3();
        vyVar.j3();
        vyVar.q3();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            vy vyVar = this.T5;
            Activity parentActivity = vyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) vyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        vy vyVar = this.T5;
        int i10 = vyVar.S0;
        fx fxVar = vyVar.B1;
        if (fxVar == null) {
            fieldText = "";
        } else {
            fieldText = fxVar.getFieldText();
        }
        return Math.max(1, i10 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        vy vyVar = this.T5;
        ArrayList arrayList = vyVar.I2;
        if (arrayList == null) {
            return 0L;
        }
        int size = arrayList.size();
        int i10 = 0;
        long j3 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            long sendPaidMessagesStars = vyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(vyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j3 += sendPaidMessagesStars;
        }
        return j3;
    }
}
