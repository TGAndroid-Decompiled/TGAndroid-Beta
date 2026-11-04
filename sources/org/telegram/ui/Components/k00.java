package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class k00 {
    public j00[] f35222a;
    public j00 f35223b;
    public j00 f35224c;
    public j00 d;
    public float f35225e;
    public float f35226f;
    public float f35227g;
    public float h;
    public float f35228i;
    public long f35229j;
    public float f35230k;
    public ArrayList f35231l;
    public Paint f35232m;
    public Path f35233n;

    public final void a(float f10) {
        this.f35227g = f10;
        float f11 = this.f35225e;
        this.h = (f10 - f11) / 250.0f;
        this.f35228i = (f10 - f11) / 120.0f;
    }

    public final void b(int i3, boolean z10) {
        j00 j00Var;
        j00 j00Var2 = this.f35223b;
        if (j00Var2 != null && j00Var2.f34891i == i3) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f35223b == null) {
            this.f35223b = this.d;
            return;
        }
        if (z10) {
            j00Var = this.f35223b;
        } else {
            j00Var = null;
        }
        this.f35224c = j00Var;
        this.f35223b = this.f35222a[i3];
        if (j00Var != null) {
            this.f35230k = 0.0f;
        } else {
            this.f35230k = 1.0f;
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
            org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
            if (r3Var != null) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.f25049b.rtmp_stream) {
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
