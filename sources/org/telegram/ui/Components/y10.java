package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class y10 {
    public x10[] f33261a;
    public x10 f33262b;
    public x10 f33263c;
    public x10 d;
    public float f33264e;
    public float f33265f;
    public float f33266g;
    public float h;
    public float f33267i;
    public long f33268j;
    public float f33269k;
    public ArrayList f33270l;
    public Paint f33271m;
    public Path f33272n;

    public final void a(float f10) {
        this.f33266g = f10;
        float f11 = this.f33264e;
        this.h = (f10 - f11) / 250.0f;
        this.f33267i = (f10 - f11) / 120.0f;
    }

    public final void b(int i10, boolean z4) {
        x10 x10Var;
        x10 x10Var2 = this.f33262b;
        if (x10Var2 != null && x10Var2.f32896i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f33262b == null) {
            this.f33262b = this.d;
            return;
        }
        if (z4) {
            x10Var = this.f33262b;
        } else {
            x10Var = null;
        }
        this.f33263c = x10Var;
        this.f33262b = this.f33261a[i10];
        if (x10Var != null) {
            this.f33269k = 0.0f;
        } else {
            this.f33269k = 1.0f;
        }
    }

    public final void c(boolean z4) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                b(2, z4);
                return;
            }
            ChatObject.Call call = sharedInstance.groupCall;
            if (call != null) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) || sharedInstance.groupCall.call.rtmp_stream) {
                    sharedInstance.setMicMute(true, false, false);
                    b(3, z4);
                    return;
                }
                b(sharedInstance.isMicMute() ? 1 : 0, z4);
                return;
            }
            b(sharedInstance.isMicMute() ? 1 : 0, z4);
        }
    }
}
