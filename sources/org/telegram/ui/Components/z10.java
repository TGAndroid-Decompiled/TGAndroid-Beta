package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class z10 {
    public y10[] f30752a;
    public y10 f30753b;
    public y10 f30754c;
    public y10 d;
    public float e;
    public float f30755f;
    public float f30756g;
    public float h;
    public float f30757i;
    public long f30758j;
    public float f30759k;
    public ArrayList f30760l;
    public Paint f30761m;
    public Path f30762n;

    public final void a(float f7) {
        this.f30756g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f30757i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        y10 y10Var;
        y10 y10Var2 = this.f30753b;
        if (y10Var2 != null && y10Var2.f30532i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f30753b == null) {
            this.f30753b = this.d;
            return;
        }
        if (z10) {
            y10Var = this.f30753b;
        } else {
            y10Var = null;
        }
        this.f30754c = y10Var;
        this.f30753b = this.f30752a[i10];
        if (y10Var != null) {
            this.f30759k = 0.0f;
        } else {
            this.f30759k = 1.0f;
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
