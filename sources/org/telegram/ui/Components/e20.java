package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class e20 {
    public d20[] f25929a;
    public d20 f25930b;
    public d20 f25931c;
    public d20 d;
    public float e;
    public float f25932f;
    public float f25933g;
    public float h;
    public float f25934i;
    public long f25935j;
    public float f25936k;
    public ArrayList f25937l;
    public Paint f25938m;
    public Path f25939n;

    public final void a(float f7) {
        this.f25933g = f7;
        float f10 = this.e;
        this.h = (f7 - f10) / 250.0f;
        this.f25934i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        d20 d20Var;
        d20 d20Var2 = this.f25930b;
        if (d20Var2 != null && d20Var2.f25520i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f25930b == null) {
            this.f25930b = this.d;
            return;
        }
        if (z10) {
            d20Var = this.f25930b;
        } else {
            d20Var = null;
        }
        this.f25931c = d20Var;
        this.f25930b = this.f25929a[i10];
        if (d20Var != null) {
            this.f25936k = 0.0f;
        } else {
            this.f25936k = 1.0f;
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
