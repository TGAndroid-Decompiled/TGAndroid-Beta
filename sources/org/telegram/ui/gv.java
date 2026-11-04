package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class gv extends ChatActivityEnterView {
    public final uw f45720u5;

    public gv(uw uwVar, Activity activity, mw mwVar) {
        super(activity, mwVar, null, false, null);
        this.f45720u5 = uwVar;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i3;
        if (motionEvent.getAction() == 0) {
            uw uwVar = this.f45720u5;
            Activity parentActivity = uwVar.getParentActivity();
            i3 = ((org.telegram.ui.ActionBar.d2) uwVar).classGuid;
            org.telegram.messenger.g0.a3(parentActivity, i3);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        CharSequence fieldText;
        uw uwVar = this.f45720u5;
        int i3 = uwVar.T0;
        gv gvVar = uwVar.C1;
        if (gvVar == null) {
            fieldText = "";
        } else {
            fieldText = gvVar.getFieldText();
        }
        return Math.max(1, i3 + (!TextUtils.isEmpty(fieldText) ? 1 : 0));
    }

    @Override
    public final long getStarsPrice() {
        uw uwVar = this.f45720u5;
        ArrayList arrayList = uwVar.J2;
        if (arrayList == null) {
            return 0L;
        }
        int size = arrayList.size();
        int i3 = 0;
        long j10 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            long longValue = ((Long) obj).longValue();
            long N1 = uwVar.getMessagesController().N1(longValue);
            if (N1 <= 0 && longValue > 0) {
                N1 = org.telegram.messenger.m5.k(uwVar.getMessagesController().J2(longValue));
            }
            j10 += N1;
        }
        return j10;
    }

    @Override
    public final void z0(float f10) {
        uw uwVar = this.f45720u5;
        uwVar.f50331z1.setInputBubbleHeight(f10);
        uwVar.E3();
        uwVar.F3();
    }
}
