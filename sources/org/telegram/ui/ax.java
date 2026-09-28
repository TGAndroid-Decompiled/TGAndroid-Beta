package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ax extends ChatActivityEnterView {
    public final qy f32249o5;

    public ax(qy qyVar, Activity activity, jy jyVar) {
        super(activity, jyVar, null, false, null);
        this.f32249o5 = qyVar;
    }

    @Override
    public final void A0(float f7) {
        qy qyVar = this.f32249o5;
        qyVar.f37136y1.setInputBubbleHeight(f7);
        qyVar.s3();
        qyVar.m3();
        qyVar.t3();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            qy qyVar = this.f32249o5;
            Activity parentActivity = qyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) qyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        qy qyVar = this.f32249o5;
        int i10 = qyVar.S0;
        ax axVar = qyVar.B1;
        if (axVar == null) {
            fieldText = "";
        } else {
            fieldText = axVar.getFieldText();
        }
        return Math.max(1, i10 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        qy qyVar = this.f32249o5;
        ArrayList arrayList = qyVar.I2;
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
            long sendPaidMessagesStars = qyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(qyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j3 += sendPaidMessagesStars;
        }
        return j3;
    }
}
