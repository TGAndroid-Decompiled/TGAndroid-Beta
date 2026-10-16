package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class k20 {
    public j20[] f26181a;
    public j20 f26182b;
    public j20 f26183c;
    public j20 d;
    public float e;
    public float f26184f;
    public float f26185g;
    public float h;
    public float f26186i;
    public long f26187j;
    public float f26188k;
    public ArrayList f26189l;
    public Paint f26190m;
    public Path f26191n;

    public final void a(float f7) {
        this.f26185g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f26186i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        j20 j20Var;
        j20 j20Var2 = this.f26182b;
        if (j20Var2 != null && j20Var2.f25861i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f26182b == null) {
            this.f26182b = this.d;
            return;
        }
        if (z10) {
            j20Var = this.f26182b;
        } else {
            j20Var = null;
        }
        this.f26183c = j20Var;
        this.f26182b = this.f26181a[i10];
        if (j20Var != null) {
            this.f26188k = 0.0f;
        } else {
            this.f26188k = 1.0f;
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
