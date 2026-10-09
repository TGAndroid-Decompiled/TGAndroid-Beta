package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class o20 {
    public n20[] f29349a;
    public n20 f29350b;
    public n20 f29351c;
    public n20 d;
    public float f29352e;
    public float f29353f;
    public float f29354g;
    public float h;
    public float f29355i;
    public long f29356j;
    public float f29357k;
    public ArrayList f29358l;
    public Paint f29359m;
    public Path f29360n;

    public final void a(float f7) {
        this.f29354g = f7;
        float f10 = this.f29352e;
        this.h = (f7 - f10) / 250.0f;
        this.f29355i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        n20 n20Var;
        n20 n20Var2 = this.f29350b;
        if (n20Var2 != null && n20Var2.f29015i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f29350b == null) {
            this.f29350b = this.d;
            return;
        }
        if (z10) {
            n20Var = this.f29350b;
        } else {
            n20Var = null;
        }
        this.f29351c = n20Var;
        this.f29350b = this.f29349a[i10];
        if (n20Var != null) {
            this.f29357k = 0.0f;
        } else {
            this.f29357k = 1.0f;
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
