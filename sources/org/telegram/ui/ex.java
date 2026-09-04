package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ex extends ChatActivityEnterView {
    public final uy f36201n5;

    public ex(uy uyVar, Activity activity, ny nyVar) {
        super(activity, nyVar, null, false, null);
        this.f36201n5 = uyVar;
    }

    @Override
    public final void A0(float f7) {
        uy uyVar = this.f36201n5;
        uyVar.f41362y1.setInputBubbleHeight(f7);
        uyVar.s3();
        uyVar.m3();
        uyVar.t3();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            uy uyVar = this.f36201n5;
            Activity parentActivity = uyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) uyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        uy uyVar = this.f36201n5;
        int i10 = uyVar.S0;
        ex exVar = uyVar.B1;
        if (exVar == null) {
            fieldText = "";
        } else {
            fieldText = exVar.getFieldText();
        }
        return Math.max(1, i10 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        uy uyVar = this.f36201n5;
        ArrayList arrayList = uyVar.I2;
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
            long sendPaidMessagesStars = uyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(uyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j3 += sendPaidMessagesStars;
        }
        return j3;
    }
}
