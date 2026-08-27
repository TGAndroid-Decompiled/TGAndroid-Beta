package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

public final class l10 {

    public k10[] f30245a;

    public k10 f30246b;

    public k10 f30247c;
    public k10 d;

    public float f30248e;

    public float f30249f;

    public float f30250g;
    public float h;

    public float f30251i;

    public long f30252j;

    public float f30253k;

    public ArrayList f30254l;

    public Paint f30255m;

    public Path f30256n;

    public final void a(float f10) {
        this.f30250g = f10;
        float f11 = this.f30248e;
        this.h = (f10 - f11) / 250.0f;
        this.f30251i = (f10 - f11) / 120.0f;
    }

    public final void b(int i10, boolean z10) {
        k10 k10Var = this.f30246b;
        if (k10Var == null || k10Var.f29885i != i10) {
            if (VoIPService.getSharedInstance() == null && this.f30246b == null) {
                this.f30246b = this.d;
                return;
            }
            k10 k10Var2 = z10 ? this.f30246b : null;
            this.f30247c = k10Var2;
            this.f30246b = this.f30245a[i10];
            if (k10Var2 != null) {
                this.f30253k = 0.0f;
            } else {
                this.f30253k = 1.0f;
            }
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
            if (call == null) {
                b(sharedInstance.isMicMute() ? 1 : 0, z10);
                return;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
            if ((groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) && !sharedInstance.groupCall.call.rtmp_stream) {
                b(sharedInstance.isMicMute() ? 1 : 0, z10);
            } else {
                sharedInstance.setMicMute(true, false, false);
                b(3, z10);
            }
        }
    }
}
