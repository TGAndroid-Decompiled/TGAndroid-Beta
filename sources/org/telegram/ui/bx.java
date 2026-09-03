package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class bx extends ChatActivityEnterView {
    public final qy f32954k5;

    public bx(qy qyVar, Activity activity, jy jyVar) {
        super(activity, jyVar, null, false, null);
        this.f32954k5 = qyVar;
    }

    @Override
    public final void A0(float f10) {
        qy qyVar = this.f32954k5;
        qyVar.f37629v1.setInputBubbleHeight(f10);
        qyVar.s3();
        qyVar.m3();
        qyVar.t3();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            qy qyVar = this.f32954k5;
            Activity parentActivity = qyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) qyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        qy qyVar = this.f32954k5;
        int i10 = qyVar.P0;
        bx bxVar = qyVar.f37644y1;
        if (bxVar == null) {
            fieldText = "";
        } else {
            fieldText = bxVar.getFieldText();
        }
        return Math.max(1, i10 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        qy qyVar = this.f32954k5;
        ArrayList arrayList = qyVar.F2;
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
            long sendPaidMessagesStars = qyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(qyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j10 += sendPaidMessagesStars;
        }
        return j10;
    }
}
