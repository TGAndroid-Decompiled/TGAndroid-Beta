package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class dx extends ChatActivityEnterView {
    public final ty f37104o5;

    public dx(ty tyVar, Activity activity, my myVar) {
        super(activity, myVar, null, false, null);
        this.f37104o5 = tyVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            ty tyVar = this.f37104o5;
            Activity parentActivity = tyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.n2) tyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        ty tyVar = this.f37104o5;
        int i10 = tyVar.S0;
        dx dxVar = tyVar.B1;
        if (dxVar == null) {
            fieldText = "";
        } else {
            fieldText = dxVar.getFieldText();
        }
        return Math.max(1, i10 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        ty tyVar = this.f37104o5;
        ArrayList arrayList = tyVar.I2;
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
            long sendPaidMessagesStars = tyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(tyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j3 += sendPaidMessagesStars;
        }
        return j3;
    }

    @Override
    public final void y0(float f7) {
        ty tyVar = this.f37104o5;
        tyVar.f42276y1.setInputBubbleHeight(f7);
        tyVar.p3();
        tyVar.j3();
        tyVar.q3();
    }
}
