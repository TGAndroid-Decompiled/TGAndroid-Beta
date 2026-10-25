package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class i20 {
    public h20[] f29156a;
    public h20 f29157b;
    public h20 f29158c;
    public h20 d;
    public float e;
    public float f29159f;
    public float f29160g;
    public float h;
    public float f29161i;
    public long f29162j;
    public float f29163k;
    public ArrayList f29164l;
    public Paint f29165m;
    public Path f29166n;

    public final void a(float f7) {
        this.f29160g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f29161i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        h20 h20Var;
        h20 h20Var2 = this.f29157b;
        if (h20Var2 != null && h20Var2.f28773i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f29157b == null) {
            this.f29157b = this.d;
            return;
        }
        if (z10) {
            h20Var = this.f29157b;
        } else {
            h20Var = null;
        }
        this.f29158c = h20Var;
        this.f29157b = this.f29156a[i10];
        if (h20Var != null) {
            this.f29163k = 0.0f;
        } else {
            this.f29163k = 1.0f;
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
