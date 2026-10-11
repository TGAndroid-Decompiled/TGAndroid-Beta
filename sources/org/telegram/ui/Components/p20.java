package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class p20 {
    public o20[] f29692a;
    public o20 f29693b;
    public o20 f29694c;
    public o20 d;
    public float f29695e;
    public float f29696f;
    public float f29697g;
    public float h;
    public float f29698i;
    public long f29699j;
    public float f29700k;
    public ArrayList f29701l;
    public Paint f29702m;
    public Path f29703n;

    public final void a(float f7) {
        this.f29697g = f7;
        float f10 = this.f29695e;
        this.h = (f7 - f10) / 250.0f;
        this.f29698i = (f7 - f10) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        o20 o20Var;
        o20 o20Var2 = this.f29693b;
        if (o20Var2 != null && o20Var2.f29362i == i10) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f29693b == null) {
            this.f29693b = this.d;
            return;
        }
        if (z10) {
            o20Var = this.f29693b;
        } else {
            o20Var = null;
        }
        this.f29694c = o20Var;
        this.f29693b = this.f29692a[i10];
        if (o20Var != null) {
            this.f29700k = 0.0f;
        } else {
            this.f29700k = 1.0f;
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
