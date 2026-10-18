package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ow extends ChatActivityEnterView {
    public final ey f39874o5;

    public ow(ey eyVar, Activity activity, wx wxVar) {
        super(activity, wxVar, null, false, null);
        this.f39874o5 = eyVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            ey eyVar = this.f39874o5;
            Activity parentActivity = eyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) eyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        ey eyVar = this.f39874o5;
        int i10 = eyVar.S0;
        ow owVar = eyVar.B1;
        if (owVar == null) {
            fieldText = "";
        } else {
            fieldText = owVar.getFieldText();
        }
        return Math.max(1, i10 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        ey eyVar = this.f39874o5;
        ArrayList arrayList = eyVar.I2;
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
            long sendPaidMessagesStars = eyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(eyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j10 += sendPaidMessagesStars;
        }
        return j10;
    }

    @Override
    public final void y0(float f7) {
        ey eyVar = this.f39874o5;
        eyVar.f36741y1.setInputBubbleHeight(f7);
        eyVar.q3();
        eyVar.j3();
        eyVar.r3();
    }
}
