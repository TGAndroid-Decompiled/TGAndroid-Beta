package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class x10 {
    public w10[] f30497a;
    public w10 f30498b;
    public w10 f30499c;
    public w10 d;
    public float e;
    public float f30500f;
    public float f30501g;
    public float h;
    public float f30502i;
    public long f30503j;
    public float f30504k;
    public ArrayList f30505l;
    public Paint f30506m;
    public Path f30507n;

    public final void a(float f10) {
        this.f30501g = f10;
        float f11 = this.e;
        this.h = (f10 - f11) / 250.0f;
        this.f30502i = (f10 - f11) / 120.0f;
    }

    public final void b(int i10, boolean z4) {
        w10 w10Var;
        w10 w10Var2 = this.f30498b;
        if (w10Var2 != null && w10Var2.f30145i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f30498b == null) {
            this.f30498b = this.d;
            return;
        }
        if (z4) {
            w10Var = this.f30498b;
        } else {
            w10Var = null;
        }
        this.f30499c = w10Var;
        this.f30498b = this.f30497a[i10];
        if (w10Var != null) {
            this.f30504k = 0.0f;
        } else {
            this.f30504k = 1.0f;
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
