package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class g20 {
    public f20[] f26513a;
    public f20 f26514b;
    public f20 f26515c;
    public f20 d;
    public float e;
    public float f26516f;
    public float f26517g;
    public float h;
    public float f26518i;
    public long f26519j;
    public float f26520k;
    public ArrayList f26521l;
    public Paint f26522m;
    public Path f26523n;

    public final void a(float f7) {
        this.f26517g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f26518i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        f20 f20Var;
        f20 f20Var2 = this.f26514b;
        if (f20Var2 != null && f20Var2.f26138i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f26514b == null) {
            this.f26514b = this.d;
            return;
        }
        if (z10) {
            f20Var = this.f26514b;
        } else {
            f20Var = null;
        }
        this.f26515c = f20Var;
        this.f26514b = this.f26513a[i10];
        if (f20Var != null) {
            this.f26520k = 0.0f;
        } else {
            this.f26520k = 1.0f;
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
