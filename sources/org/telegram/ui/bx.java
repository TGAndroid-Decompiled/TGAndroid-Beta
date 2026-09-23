package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class bx extends ChatActivityEnterView {
    public final ry f32193o5;

    public bx(ry ryVar, Activity activity, ky kyVar) {
        super(activity, kyVar, null, false, null);
        this.f32193o5 = ryVar;
    }

    @Override
    public final void B0(float f7) {
        ry ryVar = this.f32193o5;
        ryVar.f37080y1.setInputBubbleHeight(f7);
        ryVar.s3();
        ryVar.m3();
        ryVar.t3();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            ry ryVar = this.f32193o5;
            Activity parentActivity = ryVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) ryVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        ry ryVar = this.f32193o5;
        int i10 = ryVar.S0;
        bx bxVar = ryVar.B1;
        if (bxVar == null) {
            fieldText = "";
        } else {
            fieldText = bxVar.getFieldText();
        }
        return Math.max(1, i10 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        ry ryVar = this.f32193o5;
        ArrayList arrayList = ryVar.I2;
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
            long sendPaidMessagesStars = ryVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(ryVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j3 += sendPaidMessagesStars;
        }
        return j3;
    }
}
