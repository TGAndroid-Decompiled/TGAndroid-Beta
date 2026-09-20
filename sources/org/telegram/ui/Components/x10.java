package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class x10 {
    public w10[] f30124a;
    public w10 f30125b;
    public w10 f30126c;
    public w10 d;
    public float e;
    public float f30127f;
    public float f30128g;
    public float h;
    public float f30129i;
    public long f30130j;
    public float f30131k;
    public ArrayList f30132l;
    public Paint f30133m;
    public Path f30134n;

    public final void a(float f7) {
        this.f30128g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f30129i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        w10 w10Var;
        w10 w10Var2 = this.f30125b;
        if (w10Var2 != null && w10Var2.f29907i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f30125b == null) {
            this.f30125b = this.d;
            return;
        }
        if (z10) {
            w10Var = this.f30125b;
        } else {
            w10Var = null;
        }
        this.f30126c = w10Var;
        this.f30125b = this.f30124a[i10];
        if (w10Var != null) {
            this.f30131k = 0.0f;
        } else {
            this.f30131k = 1.0f;
        }
    }

    public final void c(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                b(2, z10);
                return;
            }
            ChatObject.Call call = sharedInstance.groupCall;
            if (call != null) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) || sharedInstance.groupCall.call.rtmp_stream) {
                    sharedInstance.setMicMute(true, false, false);
                    b(3, z10);
                    return;
                }
                b(sharedInstance.isMicMute() ? 1 : 0, z10);
                return;
            }
            b(sharedInstance.isMicMute() ? 1 : 0, z10);
        }
    }
}
