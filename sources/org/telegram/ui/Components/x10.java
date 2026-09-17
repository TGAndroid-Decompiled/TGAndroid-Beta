package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class x10 {
    public w10[] f32420a;
    public w10 f32421b;
    public w10 f32422c;
    public w10 d;
    public float f32423e;
    public float f32424f;
    public float f32425g;
    public float h;
    public float f32426i;
    public long f32427j;
    public float f32428k;
    public ArrayList f32429l;
    public Paint f32430m;
    public Path f32431n;

    public final void a(float f7) {
        this.f32425g = f7;
        float f10 = this.f32423e;
        this.h = (f7 - f10) / 250.0f;
        this.f32426i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        w10 w10Var;
        w10 w10Var2 = this.f32421b;
        if (w10Var2 != null && w10Var2.f32095i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f32421b == null) {
            this.f32421b = this.d;
            return;
        }
        if (z10) {
            w10Var = this.f32421b;
        } else {
            w10Var = null;
        }
        this.f32422c = w10Var;
        this.f32421b = this.f32420a[i10];
        if (w10Var != null) {
            this.f32428k = 0.0f;
        } else {
            this.f32428k = 1.0f;
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
