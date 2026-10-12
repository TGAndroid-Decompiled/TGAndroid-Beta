package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class r20 {
    public q20[] f30009a;
    public q20 f30010b;
    public q20 f30011c;
    public q20 d;
    public float f30012e;
    public float f30013f;
    public float f30014g;
    public float h;
    public float f30015i;
    public long f30016j;
    public float f30017k;
    public ArrayList f30018l;
    public Paint f30019m;
    public Path f30020n;

    public final void a(float f7) {
        this.f30014g = f7;
        float f10 = this.f30012e;
        this.h = (f7 - f10) / 250.0f;
        this.f30015i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        q20 q20Var;
        q20 q20Var2 = this.f30010b;
        if (q20Var2 != null && q20Var2.f29662i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f30010b == null) {
            this.f30010b = this.d;
            return;
        }
        if (z10) {
            q20Var = this.f30010b;
        } else {
            q20Var = null;
        }
        this.f30011c = q20Var;
        this.f30010b = this.f30009a[i10];
        if (q20Var != null) {
            this.f30017k = 0.0f;
        } else {
            this.f30017k = 1.0f;
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
