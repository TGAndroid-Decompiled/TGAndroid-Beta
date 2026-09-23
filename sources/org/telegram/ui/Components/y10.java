package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class y10 {
    public x10[] f30120a;
    public x10 f30121b;
    public x10 f30122c;
    public x10 d;
    public float e;
    public float f30123f;
    public float f30124g;
    public float h;
    public float f30125i;
    public long f30126j;
    public float f30127k;
    public ArrayList f30128l;
    public Paint f30129m;
    public Path f30130n;

    public final void a(float f7) {
        this.f30124g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f30125i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        x10 x10Var;
        x10 x10Var2 = this.f30121b;
        if (x10Var2 != null && x10Var2.f29859i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f30121b == null) {
            this.f30121b = this.d;
            return;
        }
        if (z10) {
            x10Var = this.f30121b;
        } else {
            x10Var = null;
        }
        this.f30122c = x10Var;
        this.f30121b = this.f30120a[i10];
        if (x10Var != null) {
            this.f30127k = 0.0f;
        } else {
            this.f30127k = 1.0f;
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
