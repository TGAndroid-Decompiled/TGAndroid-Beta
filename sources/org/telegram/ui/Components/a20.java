package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class a20 {
    public z10[] f22508a;
    public z10 f22509b;
    public z10 f22510c;
    public z10 d;
    public float e;
    public float f22511f;
    public float f22512g;
    public float h;
    public float f22513i;
    public long f22514j;
    public float f22515k;
    public ArrayList f22516l;
    public Paint f22517m;
    public Path f22518n;

    public final void a(float f7) {
        this.f22512g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f22513i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        z10 z10Var;
        z10 z10Var2 = this.f22509b;
        if (z10Var2 != null && z10Var2.f30795i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f22509b == null) {
            this.f22509b = this.d;
            return;
        }
        if (z10) {
            z10Var = this.f22509b;
        } else {
            z10Var = null;
        }
        this.f22510c = z10Var;
        this.f22509b = this.f22508a[i10];
        if (z10Var != null) {
            this.f22515k = 0.0f;
        } else {
            this.f22515k = 1.0f;
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
