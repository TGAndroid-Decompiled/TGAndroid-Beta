package org.telegram.ui.Components;

import android.graphics.RectF;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;

public final class or implements Utilities.Callback2 {

    public final int f31395a;

    public or(int i10) {
        this.f31395a = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f31395a) {
            case 0:
                int i10 = ur.C0;
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                HashSet<Long> hashSet = (HashSet) obj2;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.convertToConferenceCall(bool.booleanValue(), hashSet);
                }
                break;
            default:
                RectF rectF = qg.d.D;
                break;
        }
    }
}
