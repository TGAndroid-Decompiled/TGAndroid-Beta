package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class x10 {
    public w10[] f32393a;
    public w10 f32394b;
    public w10 f32395c;
    public w10 d;
    public float f32396e;
    public float f32397f;
    public float f32398g;
    public float h;
    public float f32399i;
    public long f32400j;
    public float f32401k;
    public ArrayList f32402l;
    public Paint f32403m;
    public Path f32404n;

    public final void a(float f7) {
        this.f32398g = f7;
        float f10 = this.f32396e;
        this.h = (f7 - f10) / 250.0f;
        this.f32399i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        w10 w10Var;
        w10 w10Var2 = this.f32394b;
        if (w10Var2 != null && w10Var2.f32068i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f32394b == null) {
            this.f32394b = this.d;
            return;
        }
        if (z10) {
            w10Var = this.f32394b;
        } else {
            w10Var = null;
        }
        this.f32395c = w10Var;
        this.f32394b = this.f32393a[i10];
        if (w10Var != null) {
            this.f32401k = 0.0f;
        } else {
            this.f32401k = 1.0f;
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
