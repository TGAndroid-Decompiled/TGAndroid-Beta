package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class cx extends ChatActivityEnterView {
    public final sy f36847o5;

    public cx(sy syVar, Activity activity, ly lyVar) {
        super(activity, lyVar, null, false, null);
        this.f36847o5 = syVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            sy syVar = this.f36847o5;
            Activity parentActivity = syVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) syVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        sy syVar = this.f36847o5;
        int i10 = syVar.S0;
        cx cxVar = syVar.B1;
        if (cxVar == null) {
            fieldText = "";
        } else {
            fieldText = cxVar.getFieldText();
        }
        return Math.max(1, i10 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        sy syVar = this.f36847o5;
        ArrayList arrayList = syVar.I2;
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
            long sendPaidMessagesStars = syVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(syVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j3 += sendPaidMessagesStars;
        }
        return j3;
    }

    @Override
    public final void y0(float f7) {
        sy syVar = this.f36847o5;
        syVar.f42009y1.setInputBubbleHeight(f7);
        syVar.p3();
        syVar.j3();
        syVar.q3();
    }
}
