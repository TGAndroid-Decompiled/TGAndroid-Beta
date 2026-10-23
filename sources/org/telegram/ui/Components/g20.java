package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class g20 {
    public f20[] f26483a;
    public f20 f26484b;
    public f20 f26485c;
    public f20 d;
    public float e;
    public float f26486f;
    public float f26487g;
    public float h;
    public float f26488i;
    public long f26489j;
    public float f26490k;
    public ArrayList f26491l;
    public Paint f26492m;
    public Path f26493n;

    public final void a(float f7) {
        this.f26487g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f26488i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        f20 f20Var;
        f20 f20Var2 = this.f26484b;
        if (f20Var2 != null && f20Var2.f26051i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f26484b == null) {
            this.f26484b = this.d;
            return;
        }
        if (z10) {
            f20Var = this.f26484b;
        } else {
            f20Var = null;
        }
        this.f26485c = f20Var;
        this.f26484b = this.f26483a[i10];
        if (f20Var != null) {
            this.f26490k = 0.0f;
        } else {
            this.f26490k = 1.0f;
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
