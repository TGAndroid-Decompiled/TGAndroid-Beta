package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class b20 {
    public a20[] f22782a;
    public a20 f22783b;
    public a20 f22784c;
    public a20 d;
    public float e;
    public float f22785f;
    public float f22786g;
    public float h;
    public float f22787i;
    public long f22788j;
    public float f22789k;
    public ArrayList f22790l;
    public Paint f22791m;
    public Path f22792n;

    public final void a(float f7) {
        this.f22786g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f22787i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        a20 a20Var;
        a20 a20Var2 = this.f22783b;
        if (a20Var2 != null && a20Var2.f22533i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f22783b == null) {
            this.f22783b = this.d;
            return;
        }
        if (z10) {
            a20Var = this.f22783b;
        } else {
            a20Var = null;
        }
        this.f22784c = a20Var;
        this.f22783b = this.f22782a[i10];
        if (a20Var != null) {
            this.f22789k = 0.0f;
        } else {
            this.f22789k = 1.0f;
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
