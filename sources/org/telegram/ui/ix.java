package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ix extends ChatActivityEnterView {
    public final yy f36885o5;

    public ix(yy yyVar, Activity activity, ry ryVar) {
        super(activity, ryVar, null, false, null);
        this.f36885o5 = yyVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            yy yyVar = this.f36885o5;
            Activity parentActivity = yyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.m2) yyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        yy yyVar = this.f36885o5;
        int i10 = yyVar.S0;
        ix ixVar = yyVar.B1;
        if (ixVar == null) {
            fieldText = "";
        } else {
            fieldText = ixVar.getFieldText();
        }
        return Math.max(1, i10 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        yy yyVar = this.f36885o5;
        ArrayList arrayList = yyVar.I2;
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
            long sendPaidMessagesStars = yyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(yyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j10 += sendPaidMessagesStars;
        }
        return j10;
    }

    @Override
    public final void y0(float f7) {
        yy yyVar = this.f36885o5;
        yyVar.f42108y1.setInputBubbleHeight(f7);
        yyVar.q3();
        yyVar.j3();
        yyVar.r3();
    }
}
