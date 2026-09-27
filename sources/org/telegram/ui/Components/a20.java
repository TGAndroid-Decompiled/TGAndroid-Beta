package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class a20 {
    public z10[] f22510a;
    public z10 f22511b;
    public z10 f22512c;
    public z10 d;
    public float e;
    public float f22513f;
    public float f22514g;
    public float h;
    public float f22515i;
    public long f22516j;
    public float f22517k;
    public ArrayList f22518l;
    public Paint f22519m;
    public Path f22520n;

    public final void a(float f7) {
        this.f22514g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f22515i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        z10 z10Var;
        z10 z10Var2 = this.f22511b;
        if (z10Var2 != null && z10Var2.f30824i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f22511b == null) {
            this.f22511b = this.d;
            return;
        }
        if (z10) {
            z10Var = this.f22511b;
        } else {
            z10Var = null;
        }
        this.f22512c = z10Var;
        this.f22511b = this.f22510a[i10];
        if (z10Var != null) {
            this.f22517k = 0.0f;
        } else {
            this.f22517k = 1.0f;
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
