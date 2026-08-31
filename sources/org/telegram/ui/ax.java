package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ax extends ChatActivityEnterView {
    public final py f35258k5;

    public ax(py pyVar, Activity activity, iy iyVar) {
        super(activity, iyVar, null, false, null);
        this.f35258k5 = pyVar;
    }

    @Override
    public final void A0(float f10) {
        py pyVar = this.f35258k5;
        pyVar.f40288v1.setInputBubbleHeight(f10);
        pyVar.s3();
        pyVar.m3();
        pyVar.t3();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            py pyVar = this.f35258k5;
            Activity parentActivity = pyVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.p2) pyVar).classGuid;
            AndroidUtilities.requestAdjustResize(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        py pyVar = this.f35258k5;
        int i10 = pyVar.P0;
        ax axVar = pyVar.f40303y1;
        if (axVar == null) {
            fieldText = "";
        } else {
            fieldText = axVar.getFieldText();
        }
        return Math.max(1, i10 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        py pyVar = this.f35258k5;
        ArrayList arrayList = pyVar.F2;
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
            long sendPaidMessagesStars = pyVar.getMessagesController().getSendPaidMessagesStars(longValue);
            if (sendPaidMessagesStars <= 0 && longValue > 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(pyVar.getMessagesController().isUserContactBlocked(longValue));
            }
            j10 += sendPaidMessagesStars;
        }
        return j10;
    }
}
