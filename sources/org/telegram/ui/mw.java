package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class mw extends ChatActivityEnterView {
    public final cy f39362o5;

    public mw(cy cyVar, Activity activity, ux uxVar) {
        super(activity, uxVar, null, false, null);
        this.f39362o5 = cyVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            cy cyVar = this.f39362o5;
            Activity parentActivity = cyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) cyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        cy cyVar = this.f39362o5;
        int i10 = cyVar.S0;
        mw mwVar = cyVar.B1;
        if (mwVar == null) {
            fieldText = "";
        } else {
            fieldText = mwVar.getFieldText();
        }
        return Math.max(1, i10 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        cy cyVar = this.f39362o5;
        ArrayList arrayList = cyVar.I2;
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
            long sendPaidMessagesStars = cyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(cyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j10 += sendPaidMessagesStars;
        }
        return j10;
    }

    @Override
    public final void y0(float f7) {
        cy cyVar = this.f39362o5;
        cyVar.f36199y1.setInputBubbleHeight(f7);
        cyVar.q3();
        cyVar.j3();
        cyVar.r3();
    }
}
