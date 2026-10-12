package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class r20 {
    public q20[] f30010a;
    public q20 f30011b;
    public q20 f30012c;
    public q20 d;
    public float f30013e;
    public float f30014f;
    public float f30015g;
    public float h;
    public float f30016i;
    public long f30017j;
    public float f30018k;
    public ArrayList f30019l;
    public Paint f30020m;
    public Path f30021n;

    public final void a(float f7) {
        this.f30015g = f7;
        float f10 = this.f30013e;
        this.h = (f7 - f10) / 250.0f;
        this.f30016i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        q20 q20Var;
        q20 q20Var2 = this.f30011b;
        if (q20Var2 != null && q20Var2.f29640i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f30011b == null) {
            this.f30011b = this.d;
            return;
        }
        if (z10) {
            q20Var = this.f30011b;
        } else {
            q20Var = null;
        }
        this.f30012c = q20Var;
        this.f30011b = this.f30010a[i10];
        if (q20Var != null) {
            this.f30018k = 0.0f;
        } else {
            this.f30018k = 1.0f;
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
