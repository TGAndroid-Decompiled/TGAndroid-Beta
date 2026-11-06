package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class o00 {
    public n00[] f36478a;
    public n00 f36479b;
    public n00 f36480c;
    public n00 d;
    public float f36481e;
    public float f36482f;
    public float f36483g;
    public float h;
    public float f36484i;
    public long f36485j;
    public float f36486k;
    public ArrayList f36487l;
    public Paint f36488m;
    public Path f36489n;

    public final void a(float f10) {
        this.f36483g = f10;
        float f11 = this.f36481e;
        this.h = (f10 - f11) / 250.0f;
        this.f36484i = (f10 - f11) / 120.0f;
    }

    public final void b(int i7, boolean z9) {
        n00 n00Var;
        n00 n00Var2 = this.f36479b;
        if (n00Var2 != null && n00Var2.f36150i == i7) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f36479b == null) {
            this.f36479b = this.d;
            return;
        }
        if (z9) {
            n00Var = this.f36479b;
        } else {
            n00Var = null;
        }
        this.f36480c = n00Var;
        this.f36479b = this.f36478a[i7];
        if (n00Var != null) {
            this.f36486k = 0.0f;
        } else {
            this.f36486k = 1.0f;
        }
    }

    public final void c(boolean z9) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                b(2, z9);
                return;
            }
            org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
            if (r3Var != null) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.f25209b.rtmp_stream) {
                    sharedInstance.setMicMute(true, false, false);
                    b(3, z9);
                    return;
                }
                b(sharedInstance.isMicMute() ? 1 : 0, z9);
                return;
            }
            b(sharedInstance.isMicMute() ? 1 : 0, z9);
        }
    }
}
