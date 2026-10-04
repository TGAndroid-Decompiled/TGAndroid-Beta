package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class b20 {
    public a20[] f24760a;
    public a20 f24761b;
    public a20 f24762c;
    public a20 d;
    public float f24763e;
    public float f24764f;
    public float f24765g;
    public float h;
    public float f24766i;
    public long f24767j;
    public float f24768k;
    public ArrayList f24769l;
    public Paint f24770m;
    public Path f24771n;

    public final void a(float f7) {
        this.f24765g = f7;
        float f10 = this.f24763e;
        this.h = (f7 - f10) / 250.0f;
        this.f24766i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        a20 a20Var;
        a20 a20Var2 = this.f24761b;
        if (a20Var2 != null && a20Var2.f24433i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f24761b == null) {
            this.f24761b = this.d;
            return;
        }
        if (z10) {
            a20Var = this.f24761b;
        } else {
            a20Var = null;
        }
        this.f24762c = a20Var;
        this.f24761b = this.f24760a[i10];
        if (a20Var != null) {
            this.f24768k = 0.0f;
        } else {
            this.f24768k = 1.0f;
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
