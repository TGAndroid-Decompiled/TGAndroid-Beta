package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class i10 {
    public h10[] f29261a;
    public h10 f29262b;
    public h10 f29263c;
    public h10 d;
    public float f29264e;
    public float f29265f;
    public float f29266g;
    public float h;
    public float f29267i;
    public long f29268j;
    public float f29269k;
    public ArrayList f29270l;
    public Paint f29271m;
    public Path f29272n;

    public final void a(float f10) {
        this.f29266g = f10;
        float f11 = this.f29264e;
        this.h = (f10 - f11) / 250.0f;
        this.f29267i = (f10 - f11) / 120.0f;
    }

    public final void b(int i9, boolean z10) {
        h10 h10Var;
        h10 h10Var2 = this.f29262b;
        if (h10Var2 != null && h10Var2.f28919i == i9) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f29262b == null) {
            this.f29262b = this.d;
            return;
        }
        if (z10) {
            h10Var = this.f29262b;
        } else {
            h10Var = null;
        }
        this.f29263c = h10Var;
        this.f29262b = this.f29261a[i9];
        if (h10Var != null) {
            this.f29269k = 0.0f;
        } else {
            this.f29269k = 1.0f;
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
