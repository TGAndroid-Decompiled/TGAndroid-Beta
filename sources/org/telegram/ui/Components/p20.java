package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class p20 {
    public o20[] f29660a;
    public o20 f29661b;
    public o20 f29662c;
    public o20 d;
    public float f29663e;
    public float f29664f;
    public float f29665g;
    public float h;
    public float f29666i;
    public long f29667j;
    public float f29668k;
    public ArrayList f29669l;
    public Paint f29670m;
    public Path f29671n;

    public final void a(float f7) {
        this.f29665g = f7;
        float f10 = this.f29663e;
        this.h = (f7 - f10) / 250.0f;
        this.f29666i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        o20 o20Var;
        o20 o20Var2 = this.f29661b;
        if (o20Var2 != null && o20Var2.f29320i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f29661b == null) {
            this.f29661b = this.d;
            return;
        }
        if (z10) {
            o20Var = this.f29661b;
        } else {
            o20Var = null;
        }
        this.f29662c = o20Var;
        this.f29661b = this.f29660a[i10];
        if (o20Var != null) {
            this.f29668k = 0.0f;
        } else {
            this.f29668k = 1.0f;
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
