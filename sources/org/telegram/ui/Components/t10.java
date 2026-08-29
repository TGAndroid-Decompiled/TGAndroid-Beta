package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class t10 {
    public s10[] f32791a;
    public s10 f32792b;
    public s10 f32793c;
    public s10 d;
    public float f32794e;
    public float f32795f;
    public float f32796g;
    public float h;
    public float f32797i;
    public long f32798j;
    public float f32799k;
    public ArrayList f32800l;
    public Paint f32801m;
    public Path f32802n;

    public final void a(float f9) {
        this.f32796g = f9;
        float f10 = this.f32794e;
        this.h = (f9 - f10) / 250.0f;
        this.f32797i = (f9 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        s10 s10Var;
        s10 s10Var2 = this.f32792b;
        if (s10Var2 != null && s10Var2.f32443i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f32792b == null) {
            this.f32792b = this.d;
            return;
        }
        if (z10) {
            s10Var = this.f32792b;
        } else {
            s10Var = null;
        }
        this.f32793c = s10Var;
        this.f32792b = this.f32791a[i10];
        if (s10Var != null) {
            this.f32799k = 0.0f;
        } else {
            this.f32799k = 1.0f;
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
