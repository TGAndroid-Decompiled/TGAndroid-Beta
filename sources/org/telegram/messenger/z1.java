package org.telegram.messenger;

import android.graphics.RectF;
import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class z1 implements k20 {
    public final int f19654a;

    public z1(int i10) {
        this.f19654a = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f19654a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                return;
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i10 = wp.D8;
                return;
            case 2:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i11 = wp.D8;
                return;
            case 3:
                TLRPC.Bool bool3 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                int i12 = org.telegram.ui.Components.vr.f31870z2;
                return;
            case 4:
                Boolean bool4 = (Boolean) obj;
                HashSet<Long> hashSet = (HashSet) obj2;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.convertToConferenceCall(bool4.booleanValue(), hashSet);
                    return;
                }
                return;
            default:
                TLRPC.Bool bool5 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                RectF rectF = zg.d.H;
                return;
        }
    }
}
