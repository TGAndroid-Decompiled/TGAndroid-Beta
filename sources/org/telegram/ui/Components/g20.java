package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class g20 {
    public f20[] f23214a;
    public f20 f23215b;
    public f20 f23216c;
    public f20 d;
    public float e;
    public float f23217f;
    public float f23218g;
    public float h;
    public float f23219i;
    public long f23220j;
    public float f23221k;
    public ArrayList f23222l;
    public Paint f23223m;
    public Path f23224n;

    public final void a(float f7) {
        this.f23218g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f23219i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        f20 f20Var;
        f20 f20Var2 = this.f23215b;
        if (f20Var2 != null && f20Var2.f22814i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f23215b == null) {
            this.f23215b = this.d;
            return;
        }
        if (z10) {
            f20Var = this.f23215b;
        } else {
            f20Var = null;
        }
        this.f23216c = f20Var;
        this.f23215b = this.f23214a[i10];
        if (f20Var != null) {
            this.f23221k = 0.0f;
        } else {
            this.f23221k = 1.0f;
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
