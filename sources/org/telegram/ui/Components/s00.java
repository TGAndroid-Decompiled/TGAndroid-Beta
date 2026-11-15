package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class s00 {
    public r00[] f39119a;
    public r00 f39120b;
    public r00 f39121c;
    public r00 d;
    public float f39122e;
    public float f39123f;
    public float f39124g;
    public float h;
    public float f39125i;
    public long f39126j;
    public float f39127k;
    public ArrayList f39128l;
    public Paint f39129m;
    public Path f39130n;

    public final void a(float f10) {
        this.f39124g = f10;
        float f11 = this.f39122e;
        this.h = (f10 - f11) / 250.0f;
        this.f39125i = (f10 - f11) / 120.0f;
    }

    public final void b(int i7, boolean z10) {
        r00 r00Var;
        r00 r00Var2 = this.f39120b;
        if (r00Var2 != null && r00Var2.f38804i == i7) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.f39120b == null) {
            this.f39120b = this.d;
            return;
        }
        if (z10) {
            r00Var = this.f39120b;
        } else {
            r00Var = null;
        }
        this.f39121c = r00Var;
        this.f39120b = this.f39119a[i7];
        if (r00Var != null) {
            this.f39127k = 0.0f;
        } else {
            this.f39127k = 1.0f;
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
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.f26216b.rtmp_stream) {
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
