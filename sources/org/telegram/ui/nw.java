package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class nw extends ChatActivityEnterView {
    public final zx f39979t5;

    public nw(zx zxVar, Activity activity, sx sxVar) {
        super(activity, sxVar, null, false, null);
        this.f39979t5 = zxVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        if (motionEvent.getAction() == 0) {
            zx zxVar = this.f39979t5;
            Activity parentActivity = zxVar.getParentActivity();
            i10 = ((org.telegram.ui.ActionBar.k2) zxVar).classGuid;
            org.telegram.messenger.i0.Z2(parentActivity, i10);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        zx zxVar = this.f39979t5;
        int i10 = zxVar.S0;
        nw nwVar = zxVar.B1;
        if (nwVar == null) {
            fieldText = "";
        } else {
            fieldText = nwVar.getFieldText();
        }
        return Math.max(1, i10 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        zx zxVar = this.f39979t5;
        ArrayList arrayList = zxVar.I2;
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
            long M1 = zxVar.getMessagesController().M1(longValue);
            if (M1 <= 0 && longValue > 0) {
                M1 = org.telegram.messenger.o5.k(zxVar.getMessagesController().H2(longValue));
            }
            j10 += M1;
        }
        return j10;
    }

    @Override
    public final void y0(float f7) {
        zx zxVar = this.f39979t5;
        zxVar.f44241y1.setInputBubbleHeight(f7);
        zxVar.E3();
        zxVar.F3();
    }
}
