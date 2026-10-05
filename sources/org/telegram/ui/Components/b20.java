package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class b20 {
    public a20[] f24809a;
    public a20 f24810b;
    public a20 f24811c;
    public a20 d;
    public float f24812e;
    public float f24813f;
    public float f24814g;
    public float h;
    public float f24815i;
    public long f24816j;
    public float f24817k;
    public ArrayList f24818l;
    public Paint f24819m;
    public Path f24820n;

    public final void a(float f7) {
        this.f24814g = f7;
        float f10 = this.f24812e;
        this.h = (f7 - f10) / 250.0f;
        this.f24815i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        a20 a20Var;
        a20 a20Var2 = this.f24810b;
        if (a20Var2 != null && a20Var2.f24441i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f24810b == null) {
            this.f24810b = this.d;
            return;
        }
        if (z10) {
            a20Var = this.f24810b;
        } else {
            a20Var = null;
        }
        this.f24811c = a20Var;
        this.f24810b = this.f24809a[i10];
        if (a20Var != null) {
            this.f24817k = 0.0f;
        } else {
            this.f24817k = 1.0f;
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
