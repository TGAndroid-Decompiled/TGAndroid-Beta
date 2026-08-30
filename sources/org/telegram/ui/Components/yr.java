package org.telegram.ui.Components;

import android.graphics.RectF;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class yr implements Utilities.Callback2 {
    public final int f31084a;

    public yr(int i10) {
        this.f31084a = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f31084a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i10 = es.D0;
                return;
            case 1:
                Boolean bool2 = (Boolean) obj;
                HashSet<Long> hashSet = (HashSet) obj2;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.convertToConferenceCall(bool2.booleanValue(), hashSet);
                    return;
                }
                return;
            default:
                TLRPC.Bool bool3 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                RectF rectF = ug.d.E;
                return;
        }
    }
}
