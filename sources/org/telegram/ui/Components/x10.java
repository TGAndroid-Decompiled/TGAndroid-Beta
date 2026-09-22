package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class x10 {
    public w10[] f30185a;
    public w10 f30186b;
    public w10 f30187c;
    public w10 d;
    public float e;
    public float f30188f;
    public float f30189g;
    public float h;
    public float f30190i;
    public long f30191j;
    public float f30192k;
    public ArrayList f30193l;
    public Paint f30194m;
    public Path f30195n;

    public final void a(float f7) {
        this.f30189g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f30190i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        w10 w10Var;
        w10 w10Var2 = this.f30186b;
        if (w10Var2 != null && w10Var2.f29889i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f30186b == null) {
            this.f30186b = this.d;
            return;
        }
        if (z10) {
            w10Var = this.f30186b;
        } else {
            w10Var = null;
        }
        this.f30187c = w10Var;
        this.f30186b = this.f30185a[i10];
        if (w10Var != null) {
            this.f30192k = 0.0f;
        } else {
            this.f30192k = 1.0f;
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
