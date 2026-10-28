package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class i20 {
    public h20[] f29184a;
    public h20 f29185b;
    public h20 f29186c;
    public h20 d;
    public float e;
    public float f29187f;
    public float f29188g;
    public float h;
    public float f29189i;
    public long f29190j;
    public float f29191k;
    public ArrayList f29192l;
    public Paint f29193m;
    public Path f29194n;

    public final void a(float f7) {
        this.f29188g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f29189i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        h20 h20Var;
        h20 h20Var2 = this.f29185b;
        if (h20Var2 != null && h20Var2.f28823i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f29185b == null) {
            this.f29185b = this.d;
            return;
        }
        if (z10) {
            h20Var = this.f29185b;
        } else {
            h20Var = null;
        }
        this.f29186c = h20Var;
        this.f29185b = this.f29184a[i10];
        if (h20Var != null) {
            this.f29191k = 0.0f;
        } else {
            this.f29191k = 1.0f;
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
