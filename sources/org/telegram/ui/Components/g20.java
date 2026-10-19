package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class g20 {
    public f20[] f26437a;
    public f20 f26438b;
    public f20 f26439c;
    public f20 d;
    public float e;
    public float f26440f;
    public float f26441g;
    public float h;
    public float f26442i;
    public long f26443j;
    public float f26444k;
    public ArrayList f26445l;
    public Paint f26446m;
    public Path f26447n;

    public final void a(float f7) {
        this.f26441g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f26442i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        f20 f20Var;
        f20 f20Var2 = this.f26438b;
        if (f20Var2 != null && f20Var2.f26079i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f26438b == null) {
            this.f26438b = this.d;
            return;
        }
        if (z10) {
            f20Var = this.f26438b;
        } else {
            f20Var = null;
        }
        this.f26439c = f20Var;
        this.f26438b = this.f26437a[i10];
        if (f20Var != null) {
            this.f26444k = 0.0f;
        } else {
            this.f26444k = 1.0f;
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
