package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class y10 {
    public x10[] f33279a;
    public x10 f33280b;
    public x10 f33281c;
    public x10 d;
    public float f33282e;
    public float f33283f;
    public float f33284g;
    public float h;
    public float f33285i;
    public long f33286j;
    public float f33287k;
    public ArrayList f33288l;
    public Paint f33289m;
    public Path f33290n;

    public final void a(float f10) {
        this.f33284g = f10;
        float f11 = this.f33282e;
        this.h = (f10 - f11) / 250.0f;
        this.f33285i = (f10 - f11) / 120.0f;
    }

    public final void b(int i10, boolean z4) {
        x10 x10Var;
        x10 x10Var2 = this.f33280b;
        if (x10Var2 != null && x10Var2.f32909i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f33280b == null) {
            this.f33280b = this.d;
            return;
        }
        if (z4) {
            x10Var = this.f33280b;
        } else {
            x10Var = null;
        }
        this.f33281c = x10Var;
        this.f33280b = this.f33279a[i10];
        if (x10Var != null) {
            this.f33287k = 0.0f;
        } else {
            this.f33287k = 1.0f;
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
